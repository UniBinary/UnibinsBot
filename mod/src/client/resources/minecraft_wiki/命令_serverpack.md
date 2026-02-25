# 命令/serverpack

*页面ID: 167279* | *来源: Minecraft Wiki*

管理服务端指定资源包。

此命令只会发出资源包加载或卸载，资源包能否加载或卸载成功取决于是否有效和游戏是否可下载文件等多种因素。

# 用法

<code>/serverpack push</code>子命令将要求客户端是否要使用指定的资源包。各参数的意义如下：

* <code><url></code>：资源包URL。
* <code><uuid></code>：资源包UUID。如果不存在，则使用UUIDv4算法使用资源包URL作为输入生成UUID。
* <code><hash></code>：资源包的SHA-1散列值。如果不存在，则为空。

资源包选择提示默认为空，是否必选默认为<code>false</code>，不受此命令的控制。

# 语法
   <code>serverpack pop <uuid></code>
  : 卸载服务端指定资源包。
   <code>serverpack push <url> [<uuid>] [<hash>]</code>
  : 加载服务端指定资源包。

# 参数







# 结果

# 输出

|0|0}}

# 历史

|，仅在IDE中可用。}}
|命令在启用[调试工具<code>MC_DEBUG_DEV_COMMANDS</code>](调试工具#DEV_COMMANDS.md)时可用。}}
}}

# 导航

[de:Befehl/serverpack](de:Befehl/serverpack.md)
[en:Commands/serverpack](en:Commands/serverpack.md)