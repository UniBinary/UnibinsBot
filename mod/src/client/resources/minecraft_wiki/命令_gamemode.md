# 命令/gamemode

*页面ID: 39784* | *来源: Minecraft Wiki*

}}

设置玩家的[游戏模式](游戏模式.md)。

# 语法
* **Java版**
   <code>gamemode <gamemode> [<target>]</code>

* **基岩版**
   <code>gamemode <gameMode: GameMode> [player: target]</code>
   <code>gamemode <gameMode: int> [player: target]</code>

# 参数
：<br>
：和
   指定玩家的新游戏模式，必须为以下其中之一：
  * <code>survival</code>（可简写为或）代表[生存模式](生存模式.md)
  * <code>creative</code>（可简写为或）代表[创造模式](创造模式.md)
  * <code>adventure</code>（可简写为或）代表[冒险模式](冒险模式.md)
  * <code>default</code>（可简写为或）代表世界默认模式
  * <code>spectator</code>代表[旁观模式](旁观模式.md)
   [极限模式](极限模式.md)不是一个有效选项，因为它作用于世界，而不是玩家。

   指定要被修改游戏模式的玩家。如果未指定，默认为命令执行者。


# 结果

# 输出

# 示例
* 使执行者进入创造模式：
* : <code>gamemode creative</code>
* : <code>gamemode c</code>
* : <code>gamemode 1</code>

* 使所有玩家进入生存模式：
* : <code>gamemode survival @a</code>
* : <code>gamemode s @a</code>
* : <code>gamemode 0 @a</code>

# 历史

|{{HistoryLine||1.8|dev=pre1|加入了{{cd|-{}-gamemode <*玩家*> <*游戏模式*>}}。}}
|
|现在能在单人游戏中使用。
|语法更改为{{cd|-{}-gamemode <*游戏模式*> [*玩家*]}}，玩家参数是可选（默认是自身）的，模式参数可以是数字和<code>survival</code>/<code>creative</code>/<code>s</code>/<code>c</code>。}}
|更改为（生存模式）}}
|（旁观模式）。}}
|会在聊天栏中显示玩家更改为的游戏模式。}}
|不再支持简写。}}
|
|命令。
|只能使用创造和生存模式。}}
|
|参数。}}
|
|参数。}}
|参数，用于[旁观模式](旁观模式.md)。}}
|参数，用于旁观模式。}}
|参数。}}
}}

# 参见
*  – 设置加入世界玩家的初始游戏模式

# 导航

[de:Befehl/gamemode](de:Befehl/gamemode.md)
[en:Commands/gamemode](en:Commands/gamemode.md)
[es:Comandos/gamemode](es:Comandos/gamemode.md)
[ja:コマンド/gamemode](ja:コマンド/gamemode.md)
[ko:명령어/gamemode](ko:명령어/gamemode.md)
[pt:Comandos/gamemode](pt:Comandos/gamemode.md)
[ru:Команды консоли/gamemode](ru:Команды консоли/gamemode.md)
[uk:Команди консолі/gamemode](uk:Команди консолі/gamemode.md)