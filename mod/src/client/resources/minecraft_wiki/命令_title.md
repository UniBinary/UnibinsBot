# 命令/title

*页面ID: 39830* | *来源: Minecraft Wiki*

標題畫面}}

|oplevel=1
|cheat=1
}}

控制屏幕标题。

# 用法
屏幕标题会以一行粗体大号文字的形式出现在玩家屏幕的中央，并且可以附加第二行作为副标题。此命令还可以玩家的[动作栏](动作栏.md)显示指定文本。标题、副标题和动作栏文本既可以使用纯文本，也可以使用[文本组件](文本组件.md)。

屏幕标题可以设置为淡入淡出过渡时间，以及显示持续时间。屏幕标题的大小取决于[](视频设置.md)设置，而过长的标题不会自动换行（只会溢出屏幕之外）。

每个玩家的淡入、持续、淡出时间在使用此命令修改后，只发送到它们自己的客户端而不存储在服务端，并且这些值对于客户端来说是跨存档、跨服务器的。只有客户端重启后会重置这些值，默认为10游戏刻（0.5秒）、70游戏刻（3.5秒）和 20游戏刻（1秒）。

# 语法
* **Java版**
   <code>title <targets> (clear|reset)</code>
   <code>title <targets> (title|subtitle|actionbar) <title></code>
   <code>title <targets> times <fadeIn> <stay> <fadeOut></code>

* **基岩版（纯文本）**
   <code>title <player: target> <clear|reset></code>
   <code>title <player: target> <title|subtitle|actionbar> <titleText: message></code>
   <code>title <player: target> times <fadeIn: int> <stay: int> <fadeOut: int></code>

* **基岩版（JSON文本）**
   <code>titleraw <player: target> <clear|reset></code>
   <code>titleraw <player: target> <titleLocation: TileRawSet> <raw json titleText: json></code>
   <code>titleraw <player: target> times <fadeIn: int> <stay: int> <fadeOut: int></code>

# = 详细信息 =
   <code>... clear</code>
  : 清除指定玩家屏幕标题。
   <code>... reset</code>
  : 将指定玩家的淡入、持续、淡出时间设为默认值（10[游戏刻](游戏刻.md)、70游戏刻、20游戏刻）。还会清空其标题和副标题。
   <code>... subtitle ...</code>
  : 若指定玩家的屏幕上有标题显示，则将其副标题改为指定文本；否则，将指定文本作为指定玩家下一屏幕标题的副标题。
   <code>... title ...</code>
  : 向指定玩家显示屏幕标题，或将当前屏幕标题改变为指定文本。标题淡出后，清空副标题，但不重置淡入、持续、淡出时间。
   <code>... actionbar ...</code>
  : 在指定玩家的[动作栏](动作栏.md)显示指定文本。
   <code>... times ...</code>
  : 更改指定玩家屏幕标题的淡入、持续、淡出时间。

# 参数

   指定要显示屏幕标题的玩家。


：<br>
：或
   指定标题、副标题、动作栏上方要显示的文本。

   ：
  * 对于<code>titleText: message</code>，
  * 对于<code>raw json titleText: json</code>，

：、、<br>
：、、
   指定屏幕标题的淡入、持续、淡出时间的时长。默认为10（0.5秒）、70（3.5秒）、20（1秒），单位[游戏刻](游戏刻.md)。
   单位为[游戏刻](游戏刻.md)，且小于0的值将被视为0。


：
   指定屏幕标题的类型，必须为、或，描述见。

# 结果

# 输出

# 示例
[缩略图|命令的执行示例](File:Title_command.png.md)

给所有玩家显示主标题为粗体的“第一章”，副标题为灰色斜体“故事的开始…”的标题：

; Java版（纯文本）
* <code>title @a title "\u00a7l第一章"</code>
* <code>-{}-title @a subtitle "\u00a77\u00a7o故事的开始…"</code>

; Java版（JSON文本）
* <code>title @a title {"text":"第一章","bold":true}</code>
* <code>-{}-title @a subtitle {"text":"故事的开始…","color":"gray","italic":true}</code>

; 基岩版（纯文本）
* <code>/title @a title §l第一章</code>
* <code>-{}-/title @a subtitle §7§o故事的开始…</code>

; 基岩版（JSON文本）
* <code>/titleraw @a title {"rawtext": [{"translate":"§l第%%s章","with":["一"]}]}</code>
* <code>-{}-/titleraw @a subtitle {"rawtext": [{"text":"§7§o故事的开始…"}]}</code>

# 历史

|。}}
|加入了在[动作栏](动作栏.md)上显示文本的能力。}}
|

|
|。}}

|
|。}}
|会在未指定时报错。<ref></ref>}}
}}

# 参考

# 导航

[de:Befehl/title](de:Befehl/title.md)
[en:Commands/title](en:Commands/title.md)
[ja:コマンド/title](ja:コマンド/title.md)
[pt:Comandos/title](pt:Comandos/title.md)
[ru:Команды консоли/title](ru:Команды консоли/title.md)