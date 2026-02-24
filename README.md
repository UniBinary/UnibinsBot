# UnibinsBot - Minecraft与OpenClaw集成模组

一个Fabric模组，将Minecraft与OpenClaw AI助手连接，支持通过自然语言查询世界数据、执行Python脚本分析。

## 功能特性

### 🗣️ 聊天集成
- **`/botchat <消息>`** - 将消息发送到OpenClaw AI助手
- 自动包含玩家上下文：坐标、维度、存档信息
- 智能识别查询意图，自动附加Python工具信息

### 🔧 Python工具集成
- **内置Python脚本**：`mcapy_reader.py` 用于读取Minecraft世界数据
- **自动提取**：模组启动时自动从jar包提取Python脚本到游戏目录
- **智能提示**：当查询涉及区块、生物群系时，自动提供Python脚本位置

### 📊 世界数据查询
通过Python脚本支持：
- 生物群系查询
- 区块信息读取
- 区域文件列表
- 方块数据查询
- 实体统计

## 系统架构

### 代码结构
```
mod/
├── src/main/java/com/unibinary/bot/
│   └── UnibinsBot.java              # 主模组初始化（服务端）
├── src/client/java/com/unibinary/bot/
│   ├── UnibinsBotClient.java        # 客户端初始化
│   ├── OpenClawBridge.java          # OpenClaw聊天桥接
│   └── ChunkReader.java             # 区块读取命令（可选）
├── src/main/resources/
│   └── assets/unibinsbot/scripts/
│       └── mcapy_reader.py          # Python脚本（打包进jar）
└── run/
    └── mcapy_reader.py              # 运行时提取的Python脚本
```

### 工作流程
1. **模组启动** → 提取Python脚本到游戏目录
2. **玩家输入** `/botchat 查询生物群系` → 发送到OpenClaw
3. **OpenClaw接收** → 包含Python脚本路径和存档信息
4. **AI分析执行** → 运行Python脚本查询数据
5. **结果返回** → 通过OpenClaw发送给玩家

## 安装要求

### 必需组件
1. **Minecraft Fabric** 1.20.4+
2. **OpenClaw** 已安装并配置
3. **Python 3.8+** 和 **mcapy库**

### Python依赖
```bash
# 安装mcapy库
pip install mcapy

# 或者从桌面目录使用（如果已下载）
# 确保 C:\Users\GQX\Desktop\mcapy 存在
```

## 使用方法

### 基础聊天
```minecraft
/botchat 你好！
/botchat 现在几点了？
/botchat 我在哪里？
```

### 世界数据查询
```minecraft
/botchat 我在哪个生物群系？
/botchat 查询区块信息
/botchat 我脚下是什么方块？
```

### Python工具直接使用
模组会自动提供Python脚本位置，OpenClaw AI可以执行：
```bash
# 查询玩家位置的生物群系
python "C:\Users\GQX\Desktop\UnibinsBot\mod\run\mcapy_reader.py" ^
  --save "存档路径" ^
  --player-coords X Y Z

# 列出区域文件
python "C:\Users\GQX\Desktop\UnibinsBot\mod\run\mcapy_reader.py" ^
  --save "存档路径" ^
  --list-regions

# 详细模式查询
python "C:\Users\GQX\Desktop\UnibinsBot\mod\run\mcapy_reader.py" ^
  --save "存档路径" ^
  --chunk X Z ^
  --verbose
```

## Python脚本参数

### 核心参数
- `--save, -s <路径>` - Minecraft存档文件夹路径（必需）
- `--chunk, -c X Z` - 直接指定区块坐标
- `--player-coords, -p X Y Z` - 玩家坐标，自动计算对应区块
- `--list-regions, -l` - 列出存档中的所有区域文件
- `--verbose, -v` - 显示详细信息

### 坐标计算
```
玩家坐标 (263, 71, 62) → 区块坐标 (16, 3)
区块X = floor(263 / 16) = 16
区块Z = floor(62 / 16) = 3
```

## 开发说明

### 构建模组
```bash
cd C:\Users\GQX\Desktop\UnibinsBot\mod
./gradlew build
```

生成的jar文件在：`build/libs/unibinsbot-*.jar`

### 代码要点

#### OpenClawBridge.java
- 处理 `/botchat` 命令
- 自动收集玩家上下文信息
- 智能识别查询类型，附加Python工具信息
- 转义处理支持Windows和Unix系统

#### Python脚本集成
- 脚本打包在jar的 `/assets/unibinsbot/scripts/mcapy_reader.py`
- 客户端启动时自动提取到游戏目录
- 路径自动包含在发送给OpenClaw的消息中

#### 错误处理
- 格式化错误已修复（坐标整数显示）
- 路径处理（移除末尾的`\.`）
- 超时和进程管理

## 配置

### OpenClaw配置
确保OpenClaw已安装并可在命令行访问：
```bash
openclaw --version
```

### 游戏内测试
```minecraft
/openclaw-test  # 检查OpenClaw连接状态
```

## 故障排除

### 常见问题

1. **OpenClaw命令找不到**
   - 检查OpenClaw是否已安装并添加到PATH
   - 运行 `openclaw --version` 测试

2. **Python脚本执行失败**
   - 检查mcapy库是否安装：`pip install mcapy`
   - 或确保桌面有mcapy文件夹

3. **坐标显示错误**
   - 已修复整数格式化问题
   - 坐标现在显示为整数：`263 71 62`

4. **路径格式问题**
   - 已处理Windows路径末尾的`\.`
   - 转义处理支持双引号包裹

### 日志查看
模组日志在Minecraft日志中，搜索 `UnibinsBot/` 前缀。

## 更新日志

### 当前版本
- ✅ 修复坐标格式化错误（`%d` vs `%.1f`）
- ✅ 智能Python脚本路径提示
- ✅ 自动脚本提取和更新
- ✅ 支持方块查询功能
- ✅ 改进错误处理和转义

### 待实现功能
- [ ] 更多Python查询功能
- [ ] 图形化结果显示
- [ ] 批量查询支持
- [ ] 缓存机制优化

## 许可证

本项目基于MIT许可证开源。

## 贡献

欢迎提交Issue和Pull Request！

## 联系方式

- GitHub: [项目地址]
- OpenClaw社区: https://discord.com/invite/clawd

---

**提示**：使用 `/botchat` 命令时，尽量描述清楚你的需求，AI会自动识别并提供相应的工具信息。