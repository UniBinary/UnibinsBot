# 命令/stats

*页面ID: 39924* | *来源: Minecraft Wiki*

管理通过其他命令的结果来更新的[记分板](记分板.md)记分项。

# 用法

一些命令可被方块（[命令方块](命令方块.md)和[告示牌](告示牌.md)）或实体（玩家或指定的任意实体）执行。当一个命令被执行后，会返回一个或多个“命令统计”：成功计数、影响的方块数、影响的实体数、影响的物品数和查询结果。

命令可以在指定方块或实体所的命令统计处设置“选择器”和“记分项”。选择器（比如<code>@e</code>）在设置后会先被原样保存，不会被立即解析；当该方块或实体随后执行命令时，预先保存的选择器就会被解析并选取出分数持有者，然后使用这个命令所产生的命令统计来更新被选中的分数持有者的记分项。这些记分板数据与其他记分板数据一样，可以被正常显示或处理。

命令方块的命令成功计数也可以使用[红石比较器](红石比较器.md)获取，但其上限为15；而记分项可以保存从-2,147,483,648到2,147,483,647的任意值。命令成功计数和查询结果通常也在聊天框中显示。

# 语法
   <code>-{}-stats block <*x*> <*y*> <*z*> clear <*统计*></code>
   <code>-{}-stats block <*x*> <*y*> <*z*> set <*统计*> <*选择器*> <*记分项*></code>
   <code>-{}-stats entity <*选择器2*> clear <*统计*></code>
   <code>-{}-stats entity <*选择器2*> set <*统计*> <*选择器*> <*记分项*></code>

# 参数
<code>*x y z*</code>（仅<code>block</code>模式）
   指定命令统计数据的来源方块所处位置。*x* 和 *z*必须是在[-30,000,000和30,000,000](世界边界.md)之间（含，不输入逗号）的整数。可以使用[波浪号](坐标#相对坐标.md)来指定基于命令执行位置的相对坐标。
<code>-{}-*选择器2*</code>（仅<code>entity</code>模式）
   指定发送命令统计的实体。必须为一个玩家名称或[目标选择器](目标选择器.md)。
<!-- the in-game usage help currently names this argument "selector" which is identical to another argument in the same command. This argument name has been altered here for discussion clarity because the other argument is common to both stats block and stats entity. -->

<code>-{}-*统计*</code>
   指定将要被设置或清除选择器和记分项的命令统计。必须为以下之一：
  * <code>AffectedBlocks</code> — 返回受命令影响的方块的数量。
  * <code>AffectedEntities</code> — 返回受命令影响的实体的数量。
  * <code>AffectedItems</code> —返回受命令影响的物品的数量。
  * <code>QueryResult</code> — 返回命令的查询结果。
  * <code>SuccessCount</code> — 返回一个命令成功执行的次数。

<code>-{}-*选择器*</code>（仅<code>set</code>模式）
   指定一个目标选择器，会在方块或实体执行一个命令后得到解析，此时被指定的实体的记分项会根据*统计*得到更新。由于前述的非即时解析的特性，此处可以输入任何内容，但只有玩家名字或[目标选择器](目标选择器.md)能够产生有意义的结果（不过，玩家名可以是虚假的，即使是该玩家真实存在，也不需要在线）。

<code>-{}-*记分项*</code>（仅<code>set</code>模式）
   指定要被<code>-{}-*统计*</code>数据更新的记分项名称。由于前述的非即时解析的特性，此处可以输入任何内容，但只有已定义的记分项名称能够产生有意义的结果。

# 结果

{{Result table|<code>-{}-*选择器2*</code>未能选中一个或多个有效实体}}

# 输出
命令执行失败时：
* 影响的实体数为1。
* 成功计数为1。
* 不影响影响的方块数、影响的物品数、查询结果的值。

命令执行成功时：
* 影响的实体数为1。
* 成功计数为0。
* 不影响影响的方块数、影响的物品数、查询结果的值。

# 示例
* 将（0，64，0）处方块执行的命令的查询结果统计更新至最近玩家的记分项MyObj上：
  : <code>stats block 0 64 0 set QueryResult @p MyObj</code>

* 阻止（0，64，0）处方块执行的命令的成功计数统计被更新到任何一个记分项上：
  : <code>stats block 0 64 0 clear SuccessCount</code>

* 将距离最近的[凋灵骷髅头颅](凋灵骷髅头颅.md)的执行的命令的影响方块数量统计更新到虚拟玩家#FakePlayer的记分项NumBlocks处：
  : <code>stats entity @e[type=wither_skull,c=1] set AffectedBlocks #FakePlayer NumBlocks</code>

# 历史

|
|
|
}}

# 参见
*  — 可通过直接修改方块的NBT标签来变更选择器和记分项
*  — 可通过直接修改实体的NBT标签来变更选择器和记分项

# 导航

[de:Befehl/stats](de:Befehl/stats.md)
[en:Commands/stats](en:Commands/stats.md)
[es:Comandos/stats](es:Comandos/stats.md)
[ja:コマンド/stats](ja:コマンド/stats.md)
[pt:Comandos/stats](pt:Comandos/stats.md)
[ru:Команды консоли/stats](ru:Команды консоли/stats.md)