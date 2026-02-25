# Java版17w45b

*页面ID: 33173* | *来源: Minecraft Wiki*

<onlyinclude>

* *17w45b**是[Java版1.13](Java版1.13.md)的第4个快照，发布于2017年11月10日<ref></ref>，加入了新的命令，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 一条允许玩家获取、合并和移除实体和方块的NBT数据命令。
* 。
* * 将会返回<code>-{}-<目标位置></code>方块的NBT数据。<code>-{}-标签路径</code> 能用于输出某个特定的NBT数据，但此功能仍然被限定于数字形式的数据。可选的<code>增幅倍率</code> 可以用于增幅输出值。
* 。
* * 将会从<code>-{}-目标实体</code>返回NBT数据。<code>-{}-标签路径</code> 能用于输出某个特定的NBT数据，但此功能仍然被限定于数字形式的数据。可选的<code>增幅倍率</code> 可以用于增幅输出值。
*
* * 将会合并<code>-{}-目标位置</code> 与玩家所设定的<code>nbt</code>数据。
*
* * 将会合并<code>-{}-目标位置</code> 与玩家所设定的<code>nbt</code>数据。合并玩家的NBT数据是不允许的。
* 。
* * 将会移除<code>-{}-目标位置</code>在<code>-{}-标签路径</code> 的NBT数据。
*
* * 将会移除<code>-{}-目标实体</code>在<code>-{}-标签路径</code> 的NBT数据。 删除玩家NBT数据是不允许的。
* 标签路径看起来像这样: <code>foo.bar[0]."A [crazy name]".baz</code>
* * <code>foo.bar</code>是指定foo的子标签bar。
* * <code>bar[0]</code>表示指定bar列表的第0号元素。
* * "引入字串" 当字串需要被返回时可能可以使用。
* 旧命令转换示例：
* * {{cmd|entitydata <目标实体> {nbt} }}，现在是。
* * ，现在是。
* 新功能使用示例：
* *
* *

# 更改
# = 命令格式 =
* ***
* 被移除以应对新加入的。

* ***
* success) score <目标选择器> <记分项名称> run <命令>}}
* * 返回值会被存储在<code>-{}-<目标名称></code> 的 <code>-{}-<目标判据></code>里。
* * <code>-{}-目标判据</code>必须存在，但相对于不需要为<code>-{}-<目标名称></code>设定起始值。
* success) block <目标位置> <标签路径> (bytedoublefloatintlongshort)}}
* * 将返回值存储在<code>-{}-目标位置</code>方块<code>-{}-标签路径</code>的NBT标签上，并存储为byte、double、float、int、long、或short类型。
* success) entity <目标实体> <标签路径> (bytedoublefloatintlongshort)}}
* * 将返回值存储在<code>-{}-目标实体</code> <code>-{}-标签路径</code>的NBT标签上，并存储为byte、double、float、int、long、或short类型。
* 标签路径看起来像这样：<code>foo.bar[0]."A [crazy name]".baz</code>
* * <code>foo.bar</code>是指定foo的子标签bar。
* * <code>bar[0]</code>表示指定bar列表的第0号元素。
* * "引入字串" 当字串需要被返回时可能可以使用。
* 例子：
* *
* *

* ***
* 现在可以用于返回自己的结果，不再要求串联命令连锁。

# 修复
1</code>的<code>@e</code>或带<code>type!entity</code>的<code>@r</code>）会优先选择到玩家。
|87799|命令检测功能在非全高方块（如雪层、草径、灵魂沙或耕地）间表现不一致。
|98244|可以通过<code>entitydata</code>无限次使用或更改相同的UUID。
|106681|第一个玩家失败时，命令不能工作。
|111704|和命令中的“旧方块处理方式”可以输入任意值。
|114721|命令会把无效的第二个参数视作“标题”。
|117933|命令会把无效的可选参数视为默认参数。
|122085|生成服务器图标会泄露已编码的数据缓冲区。
|;previous
|121623|不能在选择器中的<code>type</code>内使用命名空间。
|121627|<code>@s</code>无法构造有效的命令。
|121635|命令失败的错误消息有误。
|121637|传送单一实体时返回的消息有误。
|121642|有条件的命令链后执行的可选命令会奇怪地成功或失败。
|121647|加入多人游戏服务器时，出现JRE严重错误。
|121655|传送单一实体时返回的消息有误。<!--与121637原文不一致-->
|121656|禁用作弊时，一些仅创造模式可用的命令对生存模式下的玩家也有效。
|121660|无法在<code>@a</code>、<code>@p</code>或<code>@e[typeplayer]</code>选择器中用距离参数选定玩家。
|121663|新世界会从其他世界中复制游戏规则。
|121674|命令在函数中不起作用。
|121683|命令中，<code>-</code>不是一个有效的操作符。
|121686|总是对实体执行失败。
|121695|命令只支持1个目标。
|121711|<code>@a</code>或<code>@s</code>选择器不包含死亡的玩家。
|121726|只有玩家才能被传送到相对坐标上。
|121727|当一条命令失败时，对多实体有效的命令的执行会被取消。
|121728|命令对所有实体倒序执行命令。
|121749|命令对修改过的NBT数据不起作用。
|121765|移除n点记分板点数时，实际上是增加相应点数。
}}</onlyinclude>

# 参考

# 导航

[de:17w45b](de:17w45b.md)
[en:Java Edition 17w45b](en:Java Edition 17w45b.md)
[es:Java Edition 17w45b](es:Java Edition 17w45b.md)
[fr:Édition Java 17w45b](fr:Édition Java 17w45b.md)
[ja:Java Edition 17w45b](ja:Java Edition 17w45b.md)
[nl:17w45b](nl:17w45b.md)
[pt:Edição Java 17w45b](pt:Edição Java 17w45b.md)
[ru:17w45b (Java Edition)](ru:17w45b (Java Edition).md)