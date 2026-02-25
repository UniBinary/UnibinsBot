# 命令/tellraw

*页面ID: 39824* | *来源: Minecraft Wiki*

向一个或多个玩家发送一条以[文本组件](文本组件.md)表示的消息。

# 语法
* **Java版**
   <code>tellraw <targets> <message></code>
* **基岩版**
   <code>tellraw <target: target> <raw json message: json></code>

# 参数

   指定该消息的接收玩家。


   指定要发送的[文本组件](文本组件.md)消息。（例：<code>{"text":"Hi there!","bold":"true"}</code>；<code>{"rawtext":[{"text":"Hello world"}]}</code>）


# 结果

# 输出

# 示例
* 向所有玩家发送蓝色消息“Hello everyone!”：
* * ：<code>tellraw @a {"text":"Hello everyone!", "color":"blue"}</code>
* * ：<code>tellraw @a {"rawtext":[{"text":"§9Hello everyone!"}]}</code>

# 历史

|。}}
|
|。}}
}}

# 参见
    — 向所有玩家发送一条简单的消息
    — 向指定玩家发送一条简单的消息
    — 向玩家显示一条标题

# 导航

[de:Befehl/tellraw](de:Befehl/tellraw.md)
[en:Commands/tellraw](en:Commands/tellraw.md)
[es:Comandos/tellraw](es:Comandos/tellraw.md)
[ja:コマンド/tellraw](ja:コマンド/tellraw.md)
[pt:Comandos/tellraw](pt:Comandos/tellraw.md)
[ru:Команды консоли/tellraw](ru:Команды консоли/tellraw.md)