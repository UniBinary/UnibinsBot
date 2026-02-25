# 命令/achievement

*页面ID: 39860* | *来源: Minecraft Wiki*

添加或移除玩家的[成就](成就/Java版.md)。

# 语法
   <code>-{}-achievement (give|take) (<*名称*>|*) [*玩家*]</code>

# 参数
take)}}
   定义修改方式。必须为下列之一：
  * ：给予成就。会一并给予前置成就。
  * ：删除成就。会一并移除下游成就。

<code><-{}-*名称*></code>
   定义要修改的成就名。必须为下列之一：
  * <code>-{}-achievement.*成就名*</code>，成就名须为有效的[成就](成就/Java版.md)标识符；
  * <code>*</code>，表示**所有**成就。

<code>[-{}-*玩家*]</code>
   必须是玩家名称或目标选择器。若未定义，默认为命令执行者。**在命令方块上是必需参数**。

# 结果

{{Result table|<code>-{}-[*玩家*]</code>未能选中至少一个在线玩家}}

# 输出
命令执行失败时：
* 影响的实体数为1。
* 成功计数为0。
* 不影响影响的方块数、影响的物品数、查询结果的值。

命令执行成功时：
* 影响的实体数为命令选中的玩家数。
* 成功计数为命令执行成功影响的玩家数。
* 不影响影响的方块数、影响的物品数、查询结果的值。

# 示例
为自己添加成就“”（Overkill）：<code>/achievement give achievement.overkill</code>

为Alice添加成就“”（Taking Inventory）：<code>/achievement give achievement.openInventory Alice</code>

移除全部玩家的所有成就：<code>/achievement take * @a</code>

# 历史

|命令。}}
|命令不再影响统计数据。}}
|命令。}}
}}

# 导航

[de:Befehl/achievement](de:Befehl/achievement.md)
[en:Commands/achievement](en:Commands/achievement.md)
[es:Comandos/achievement](es:Comandos/achievement.md)
[ja:コマンド/achievement](ja:コマンド/achievement.md)
[pt:Comandos/achievement](pt:Comandos/achievement.md)
[ru:Команды консоли/achievement](ru:Команды консоли/achievement.md)