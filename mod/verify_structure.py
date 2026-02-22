#!/usr/bin/env python3
"""
验证UnibinsBot模组文件结构
"""

import os
import sys

def check_file_exists(path, description):
    """检查文件是否存在"""
    if os.path.exists(path):
        print(f"✅ {description}: {os.path.basename(path)}")
        return True
    else:
        print(f"❌ {description}: 文件不存在")
        return False

def check_java_file(path, required_imports=None):
    """检查Java文件"""
    if not os.path.exists(path):
        print(f"❌ Java文件不存在: {os.path.basename(path)}")
        return False
    
    try:
        with open(path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        print(f"✅ Java文件: {os.path.basename(path)} ({len(content)} 字符)")
        
        # 检查关键内容
        checks = [
            ("package声明", "package com.unibinary.bot;" in content),
            ("类定义", "class " in content),
            ("命令注册", "CommandRegistrationCallback" in content or "botchat" in content),
        ]
        
        for check_name, check_result in checks:
            status = "✅" if check_result else "⚠️ "
            print(f"  {status} {check_name}")
        
        # 检查导入
        if required_imports:
            for imp in required_imports:
                if imp in content:
                    print(f"  ✅ 导入: {imp.split('.')[-1]}")
                else:
                    print(f"  ⚠️  缺少导入: {imp.split('.')[-1]}")
        
        return True
        
    except Exception as e:
        print(f"❌ 读取Java文件失败: {e}")
        return False

def main():
    print("=" * 60)
    print("UnibinsBot 模组结构验证")
    print("=" * 60)
    
    base_dir = os.path.dirname(os.path.abspath(__file__))
    
    # 检查关键文件
    essential_files = [
        ("build.gradle", "构建配置文件"),
        ("gradlew.bat", "Gradle包装器"),
        ("gradle.properties", "Gradle属性文件"),
        ("src/main/resources/fabric.mod.json", "模组配置文件"),
    ]
    
    all_good = True
    
    for filename, description in essential_files:
        path = os.path.join(base_dir, filename)
        if not check_file_exists(path, description):
            all_good = False
    
    print("\n" + "=" * 60)
    print("Java源代码检查")
    print("=" * 60)
    
    # 检查Java文件
    java_files = [
        ("src/main/java/com/unibinary/bot/UnibinsBot.java", 
         "主模组类",
         ["net.fabricmc.api.ModInitializer", 
          "net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback",
          "com.mojang.brigadier.arguments.StringArgumentType"]),
        
        ("src/main/java/com/unibinary/bot/BotChatCommand.java",
         "命令处理器",
         ["com.mojang.brigadier.Command",
          "com.mojang.brigadier.arguments.StringArgumentType",
          "net.minecraft.server.command.ServerCommandSource",
          "net.minecraft.text.Text"]),
    ]
    
    for filepath, description, required_imports in java_files:
        full_path = os.path.join(base_dir, filepath)
        print(f"\n📁 {description}:")
        if not check_java_file(full_path, required_imports):
            all_good = False
    
    print("\n" + "=" * 60)
    print("验证总结")
    print("=" * 60)
    
    if all_good:
        print("✅ 所有基本文件检查通过！")
        print("\n下一步:")
        print("1. 运行构建: gradlew.bat build")
        print("2. 检查构建输出: build/libs/ 目录")
        print("3. 将生成的 .jar 文件放入 Minecraft mods 文件夹")
    else:
        print("⚠️  发现一些问题，请检查上述警告")
        print("\n建议:")
        print("1. 确保所有必需文件都存在")
        print("2. 检查Java导入语句")
        print("3. 验证文件路径")
    
    print("\n命令注册详情:")
    print("- 命令: /botchat <message>")
    print("- 当前输出: 'Openclaw chat'")
    print("- 权限: 所有玩家可用")
    
    print("\n📋 文件清单:")
    for root, dirs, files in os.walk(base_dir):
        level = root.replace(base_dir, '').count(os.sep)
        indent = ' ' * 2 * level
        print(f'{indent}{os.path.basename(root)}/')
        subindent = ' ' * 2 * (level + 1)
        for file in files:
            if file.endswith(('.java', '.json', '.gradle', '.properties', '.bat')):
                print(f'{subindent}{file}')

if __name__ == "__main__":
    main()