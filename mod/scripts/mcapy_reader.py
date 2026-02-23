#!/usr/bin/env python3
"""
Minecraft世界区块读取工具
使用mcapy库读取指定存档的区块信息
"""

import argparse
import os
import sys
from pathlib import Path

def setup_mcapy():
    """设置mcapy库路径"""
    try:
        # 尝试导入已安装的mcapy
        from mca import Region
        return Region
    except ImportError:
        # 尝试从桌面目录导入
        desktop_path = Path.home() / "Desktop" / "mcapy"
        if desktop_path.exists():
            sys.path.insert(0, str(desktop_path))
            try:
                from mca import Region
                print(f"✓ 从桌面目录加载mcapy: {desktop_path}")
                return Region
            except ImportError:
                pass
        
        print("❌ 未找到mcapy库")
        print("请确保:")
        print("1. mcapy已安装: pip install mcapy")
        print("2. 或者桌面有mcapy文件夹: C:\\Users\\GQX\\Desktop\\mcapy")
        sys.exit(1)

def get_region_file(save_path, chunk_x, chunk_z):
    """获取区域文件路径"""
    # 计算区域坐标
    region_x = chunk_x // 32
    region_z = chunk_z // 32
    
    # 区域文件路径
    region_dir = Path(save_path) / "region"
    region_file = region_dir / f"r.{region_x}.{region_z}.mca"
    
    return region_file, region_x, region_z

def read_chunk_info(Region, save_path, chunk_x, chunk_z, verbose=False):
    """读取指定区块的信息"""
    region_file, region_x, region_z = get_region_file(save_path, chunk_x, chunk_z)
    
    print(f"📁 存档路径: {save_path}")
    print(f"🗺️  目标区块: ({chunk_x}, {chunk_z})")
    print(f"📍 区域坐标: ({region_x}, {region_z})")
    print(f"📄 区域文件: {region_file}")
    
    if not region_file.exists():
        print("❌ 区域文件不存在，区块可能未生成")
        return None
    
    try:
        # 读取区域文件
        region = Region.from_file(str(region_file))
        
        # 获取区块在区域内的坐标
        local_x = chunk_x % 32
        local_z = chunk_z % 32
        
        print(f"🔍 区域内的区块位置: ({local_x}, {local_z})")
        
        # 获取区块数据
        chunk = region.get_chunk(local_x, local_z)
        if chunk is None:
            print("❌ 区块数据为空（未生成）")
            return None
        
        print("✅ 成功读取区块数据")
        
        # 获取区块基本信息
        data_version = chunk.data.get('DataVersion', '未知')
        last_update = chunk.data.get('LastUpdate', '未知')
        inhabited_time = chunk.data.get('InhabitedTime', 0)
        
        print(f"\n📊 区块基本信息:")
        print(f"  • 数据版本: {data_version}")
        print(f"  • 最后更新: {last_update}")
        print(f"  • 居住时间: {inhabited_time} ticks")
        
        # 获取高度图（如果存在）
        if 'Heightmaps' in chunk.data:
            print(f"  • 有高度图数据")
        
        # 获取区块内的生物群系（采样几个点）
        print(f"\n🌿 生物群系采样:")
        sample_points = [
            (0, 64, 0),   # 区块西北角
            (8, 64, 8),   # 区块中心
            (15, 64, 15)  # 区块东南角
        ]
        
        for bx, by, bz in sample_points:
            try:
                biome = chunk.get_biome(bx, by, bz)
                if hasattr(biome, 'id'):
                    biome_str = str(biome)
                    if 'minecraft:' in biome_str:
                        biome_name = biome_str.split('minecraft:')[1].replace(')', '').replace("'", "")
                        print(f"  • ({bx}, {by}, {bz}): {biome_name}")
                    else:
                        print(f"  • ({bx}, {by}, {bz}): {biome_str}")
                else:
                    print(f"  • ({bx}, {by}, {bz}): {biome}")
            except Exception as e:
                if verbose:
                    print(f"  • ({bx}, {by}, {bz}): 读取失败 - {e}")
        
        # 获取区块内的实体数量（如果存在）
        if 'Entities' in chunk.data:
            entities = chunk.data['Entities']
            if isinstance(entities, list):
                print(f"\n👥 实体数量: {len(entities)}")
                if verbose and entities:
                    print("  实体类型:")
                    entity_types = {}
                    for entity in entities[:5]:  # 只显示前5个
                        etype = entity.get('id', '未知')
                        entity_types[etype] = entity_types.get(etype, 0) + 1
                    for etype, count in entity_types.items():
                        print(f"    • {etype}: {count}")
        
        # 获取区块内的方块实体（如箱子、熔炉等）
        if 'BlockEntities' in chunk.data:
            block_entities = chunk.data['BlockEntities']
            if isinstance(block_entities, list):
                print(f"\n📦 方块实体数量: {len(block_entities)}")
                if verbose and block_entities:
                    print("  方块实体类型:")
                    be_types = {}
                    for be in block_entities[:5]:
                        betype = be.get('id', '未知')
                        be_types[betype] = be_types.get(betype, 0) + 1
                    for betype, count in be_types.items():
                        print(f"    • {betype}: {count}")
        
        # 详细模式：显示更多信息
        if verbose:
            print(f"\n🔧 详细数据:")
            print(f"  • 区块数据键: {list(chunk.data.keys())}")
            
            # 显示区块章节
            if 'sections' in chunk.data:
                sections = chunk.data['sections']
                print(f"  • 区块章节数: {len(sections)}")
                for i, section in enumerate(sections):
                    y_level = section.get('Y', '未知')
                    print(f"    - 章节[{i}]: Y={y_level}")
        
        return chunk
        
    except Exception as e:
        print(f"❌ 读取区块时出错: {e}")
        if verbose:
            import traceback
            traceback.print_exc()
        return None

def main():
    parser = argparse.ArgumentParser(
        description='Minecraft世界区块读取工具',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
示例:
  # 读取指定存档的区块
  python mcapy_reader.py --save "C:\\Users\\GQX\\Desktop\\UnibinsBot\\mod\\run\\saves\\NewYork" --chunk 12 8
  
  # 读取玩家坐标对应的区块
  python mcapy_reader.py --save "C:\\path\\to\\save" --player-coords 317 79 24
  
  # 详细模式
  python mcapy_reader.py --save "C:\\path\\to\\save" --chunk 12 8 --verbose
  
  # 批量读取多个区块
  python mcapy_reader.py --save "C:\\path\\to\\save" --chunks 12 8 13 8 12 9
        """
    )
    
    parser.add_argument('--save', '-s', required=True,
                       help='Minecraft存档文件夹路径')
    parser.add_argument('--chunk', '-c', type=int, nargs=2, metavar=('X', 'Z'),
                       help='区块坐标 (X Z)')
    parser.add_argument('--player-coords', '-p', type=float, nargs=3, metavar=('X', 'Y', 'Z'),
                       help='玩家坐标，自动计算对应区块')
    parser.add_argument('--chunks', type=int, nargs='+', metavar=('X', 'Z'),
                       help='批量读取多个区块，每两个数字为一组: X1 Z1 X2 Z2 ...')
    parser.add_argument('--verbose', '-v', action='store_true',
                       help='显示详细信息')
    parser.add_argument('--list-regions', '-l', action='store_true',
                       help='列出存档中的所有区域文件')
    
    args = parser.parse_args()
    
    # 检查存档路径
    save_path = Path(args.save)
    if not save_path.exists():
        print(f"❌ 存档路径不存在: {save_path}")
        sys.exit(1)
    
    # 设置mcapy
    Region = setup_mcapy()
    
    # 列出区域文件
    if args.list_regions:
        region_dir = save_path / "region"
        if not region_dir.exists():
            print(f"❌ 区域文件夹不存在: {region_dir}")
            sys.exit(1)
        
        region_files = list(region_dir.glob("r.*.*.mca"))
        print(f"📁 找到 {len(region_files)} 个区域文件:")
        for rf in sorted(region_files):
            name = rf.name
            # 提取坐标
            try:
                parts = name.split('.')
                if len(parts) == 4 and parts[0] == 'r':
                    x, z = int(parts[1]), int(parts[2])
                    size_mb = rf.stat().st_size / (1024 * 1024)
                    print(f"  • {name}: 坐标({x}, {z}), 大小: {size_mb:.2f} MB")
            except:
                print(f"  • {name}")
        return
    
    # 处理玩家坐标
    if args.player_coords:
        x, y, z = args.player_coords
        chunk_x = int(x // 16)
        chunk_z = int(z // 16)
        print(f"🎮 玩家坐标: ({x:.1f}, {y:.1f}, {z:.1f})")
        print(f"🗺️  对应区块: ({chunk_x}, {chunk_z})")
        args.chunk = [chunk_x, chunk_z]
    
    # 批量读取区块
    if args.chunks:
        if len(args.chunks) % 2 != 0:
            print("❌ --chunks 参数需要偶数个数字 (X Z 对)")
            sys.exit(1)
        
        chunks = [(args.chunks[i], args.chunks[i+1]) for i in range(0, len(args.chunks), 2)]
        print(f"📋 批量读取 {len(chunks)} 个区块:")
        
        for i, (chunk_x, chunk_z) in enumerate(chunks):
            print(f"\n{'='*50}")
            print(f"区块 {i+1}/{len(chunks)}: ({chunk_x}, {chunk_z})")
            print(f"{'='*50}")
            read_chunk_info(Region, save_path, chunk_x, chunk_z, args.verbose)
        
        print(f"\n✅ 完成批量读取 {len(chunks)} 个区块")
        return
    
    # 单个区块读取
    if args.chunk:
        chunk_x, chunk_z = args.chunk
        read_chunk_info(Region, save_path, chunk_x, chunk_z, args.verbose)
    else:
        print("❌ 请指定要读取的区块坐标")
        parser.print_help()

if __name__ == "__main__":
    main()