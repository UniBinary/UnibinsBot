# 命令/fetchprofile

*页面ID: 163710* | *来源: Minecraft Wiki*

获取玩家[档案](档案.md)内容。

# 用法
对于和子命令，游戏会从Mojang服务器获取档案，命令会异步执行，期间游戏不会暂停。获取到的档案会解析为命令执行时的档案快照，也即不会随着Mojang服务器档案信息的变更而动态更改。

对于子命令，游戏将获取实体的档案：
* 如果选中的实体为[玩家](玩家.md)，则使用玩家登录游戏时的档案数据，其不会随后续玩家更改档案信息而动态更改。
* 如果选中的实体为[玩家模型](玩家模型.md)，则直接获取实体数据<code>profile</code>的值。

获取成功后，会输出一条包含结果的消息，通过这条消息：
* 可以复制对应玩家已解析的<code>profile</code>[组件](组件.md)的内容。
* 可以执行命令获取含上述组件的[玩家的头](玩家的头.md)。
* 可以执行命令召唤含上述组件的[玩家模型](玩家模型.md)。
* 可以复制渲染出对应玩家头像的[文本组件](文本组件.md)的内容。

# 语法
   <code>fetchprofile id <id></code>
  : 根据玩家的UUID获取档案。
   <code>fetchprofile name <name></code>
  : 根据玩家名称获取档案。
   <code>fetchprofile entity <entity></code>
  : 获取某个实体的档案数据。

# 参数

   指定玩家的[UUID](UUID.md)。


   指定玩家名，不区分大小写。


   指定要获取档案的实体。目前只有玩家和玩家模型有档案数据。


# 结果

# 输出

# 历史

|命令。}}
|
|
|子命令，用于输出世界中实体的档案信息。}}
}}

# 导航

[de:Befehl/fetchprofile](de:Befehl/fetchprofile.md)
[en:Commands/fetchprofile](en:Commands/fetchprofile.md)
[ja:コマンド/fetchprofile](ja:コマンド/fetchprofile.md)
[pt:Comandos/fetchprofile](pt:Comandos/fetchprofile.md)
[ru:Команды консоли/fetchprofile](ru:Команды консоли/fetchprofile.md)