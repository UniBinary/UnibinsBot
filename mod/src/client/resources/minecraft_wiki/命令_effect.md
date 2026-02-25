# 命令/effect

*页面ID: 39723* | *来源: Minecraft Wiki*

管理玩家及其他实体上的[状态效果](状态效果.md)。

# 语法
* **Java版**
   <code>effect clear [<targets>]</code>
   <code>effect clear <targets> [<effect>]</code>
  : 移除一种或所有效果。
   <code>effect give <targets> <effect> [<seconds>]</code>
   <code>effect give <targets> <effect> <seconds> [<amplifier>]</code>
   <code>effect give <targets> <effect> <seconds> <amplifier> [<hideParticles>]</code>
  : 给予一种效果。

* **基岩版**
   <code>effect <player: target> <effect: Effect> [seconds: int]</code>
   <code>effect <player: target> <effect: Effect> <seconds: int> [amplifier: int]</code>
   <code>effect <player: target> <effect: Effect> <seconds: int> <amplifier: int> [hideParticles: Boolean]</code>
   <code>effect <player: target> <effect: Effect> infinite [amplifier: int] [hideParticles: Boolean]</code>
  : 给予一种效果。
   <code>effect <player: target> clear [effect: Effect]</code>
  : 移除一种或所有效果。

# 参数

   指定目标。


   指定给予或者需要移除的效果。

   必须是一个[状态效果ID](状态效果#状态效果列表.md)，且必须是字母ID。

   以秒为单位指定效果时长（可指定表示无限时长）。[瞬间伤害](瞬间伤害.md)（）、[瞬间治疗](瞬间治疗.md)（）和[饱和](饱和.md)（）是仅有的三个例外，其单位是游戏刻。必须在或之间。若未指定，默认为30秒（对上述三个例外为1游戏刻）。若指定为0秒，且目标已拥有指定效果，则会将原有的效果变更为0秒，即移除指定效果。

   指定效果的放大倍率。若未指定，默认为0。注意，状态效果的第1级（如[生命恢复](生命恢复.md)I）对应为0倍率，因此第2级状态效果（如生命恢复II）应指定倍率为1。部分效果没有强弱之分，如夜视。

   指定是否隐藏状态效果的[粒子](粒子.md)，以及。必须为<code>true</code>或<code>false</code>。若未指定，默认为<code>false</code>。

# 结果

# 输出

# 示例
* 给予自己60秒的[迅捷](迅捷.md)II效果：<code>/effect give @s speed 60 1</code>或<code>/effect @s speed 60 1</code>
* 给予自己60秒的迅捷III效果：<code>/effect give @s speed 60 2</code>或<code>/effect @s speed 60 2</code>
* 给予所有玩家无限时长的[夜视](夜视.md)I效果并隐藏粒子效果：<code>/effect give @a night_vision infinite 0 true</code>或<code>/effect @a night_vision infinite 0 true</code>
* 从所有玩家身上清除任何效果：<code>/effect clear @a</code>或<code>/effect @a clear</code>
* 从所有玩家身上清除任何[急迫](急迫.md)效果：<code>/effect clear @a haste</code>或<code>/effect @a clear haste</code>
* 清除所有僵尸身上的所有效果：<code>/effect clear @e[type=zombie]</code>或<code>/effect @e[type=zombie] clear</code>

# 历史

|命令。}}
|参数。}}
|参数。}}
|
|参数可以被指定为，给予无限时长的效果。}}
|的上限由255改为127。}}
|
|
|命令。}}
|命令中的<code>amplifier</code>不再接受负数值。}}
|
|、
。
|加入了移除特定状态效果的语法：。}}
}}

# 导航

[de:Befehl/effect](de:Befehl/effect.md)
[en:Commands/effect](en:Commands/effect.md)
[es:Comandos/effect](es:Comandos/effect.md)
[ja:コマンド/effect](ja:コマンド/effect.md)
[ko:명령어/effect](ko:명령어/effect.md)
[pt:Comandos/effect](pt:Comandos/effect.md)
[ru:Команды консоли/effect](ru:Команды консоли/effect.md)
[uk:Команди консолі/effect](uk:Команди консолі/effect.md)