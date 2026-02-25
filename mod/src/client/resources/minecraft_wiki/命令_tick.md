# 命令/tick

*页面ID: 106517* | *来源: Minecraft Wiki*

停止或开始[游戏刻](游戏刻.md)的流逝，或更改游戏刻速率。

# 语法
   <code>tick query</code>
  : 查询当前的游戏刻流逝状态及目标游戏刻速率，以及有关游戏刻的性能数据，包括每游戏刻的平均用时和用时的[百分位数](wzh:百分位数.md)。
   <code>tick rate <rate></code>
  : 设置目标游戏刻速率。
   <code>tick freeze</code>
  : 冻结游戏刻的流逝和所有游戏元素，玩家及玩家骑乘的实体除外。
   <code>tick unfreeze</code>
  : 取消冻结游戏刻。
   <code>tick step [<nowiki><time></nowiki>]</code>
  : 取消冻结后，进行步进特定数量的游戏刻，然后恢复冻结。仅能在已冻结的情况下使用。
   <code>tick step stop</code>
  : 停止正在进行的游戏刻步进，并重新冻结游戏。
   <code>tick sprint <nowiki>[<time>]</nowiki></code>
  : 快进。忽略目标游戏刻速率，使游戏刻的流逝尽可能快，并在指定时间后恢复至此命令执行之前的游戏刻流逝状态。恢复后游戏会显示此过程中的游戏刻性能信息。
   <code>tick sprint stop</code>
  : 停止正在进行的快进。

# 参数

   指定要设置的目标游戏刻频率，单位为游戏刻每秒（TPS）。


   指定要步进或快进的时长。若未指定，默认为1游戏刻。


# 结果

# 输出

# 示例
* 将目标游戏刻速率设置为30 TPS：<code>/tick rate 30</code>
* 快进1游戏日：<code>/tick sprint 1d</code>
* 快进5秒：<code>/tick sprint 5s</code>
* 在冻结时前进1630游戏刻：<code>/tick step 1630</code>

# 历史

|命令。}}
|
|命令现在会显示“”。}}
}}

# 你知道吗
* 该指令最早源自开发者[Gnembon](Gnembon.md)所制作的[Carpet Mod](https://github.com/gnembon/fabric-carpet)。

# 导航

[de:Befehl/tick](de:Befehl/tick.md)
[en:Commands/tick](en:Commands/tick.md)
[ja:コマンド/tick](ja:コマンド/tick.md)
[lzh:令/tick](lzh:令/tick.md)
[pt:Comandos/tick](pt:Comandos/tick.md)
[ru:Команды консоли/tick](ru:Команды консоли/tick.md)