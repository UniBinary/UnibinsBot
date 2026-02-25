# Java版23w44a

*页面ID: 106783* | *来源: Minecraft Wiki*

<onlyinclude>

* *23w44a**是[Java版1.20.3](Java版1.20.3.md)的第6个快照，发布于2023年11月1日<ref></ref>，调整了一些命令，并修复了一些漏洞。

# 更改
# = 方块 =
* *[饰纹陶罐](饰纹陶罐.md)**
* 现在其可使用[战利品表](战利品表.md)，并且会从其<code>LootTable</code>NBT标签中读取。

# = 生物 =
* *[蝙蝠](蝙蝠.md)**
* 再次更改了模型。

# = 命令格式 =
* ***
* unless) function}}不再总因所有函数都没有返回值而失败。
* * 如果被调用的函数中没有命令，<code>if</code>会失败而<code>unless</code>会成功。
* * 任何函数中的首个命令会被返回（适用于单一上下文）。

* ***
* 如果命令与一起结合执行多个函数，命令会在其中任何一个函数的首个命令后停止执行。
* 使用执行时，单次命令调用总会有返回值。
* * 例如：会总在处理首个上下文之后返回。

* ***
* 命令现在总是会返回。
* * 如果被返回的命令没有有效的<code>result</code>值，包含命令的函数会失败（即<code>success=0</code>和<code>result=0</code>）。
* 命令现在会将<code>success</code>值与<code>result</code>值一起传送（之前<code>success</code>值总为<code>1</code>）。
* 命令现在允许存储返回值，像这样的命令现在可以存储返回值，并将其返回到函数外部。
* 加入了新的子命令，用于使整个函数执行失败（即返回<code>success=0</code>和<code>result=0</code>）。

* ***
* 命令中的<code><nowiki><time></nowiki></code>现在为可选参数，默认值为<code>1</code>。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>23</code>。

# 更改（实验性）
# = 方块 =
* *[雕纹铜块](雕纹铜块.md)**
* 现在可由对应的切制铜块在[切石机](切石机.md)中切成。

* *[铜门](铜门.md)和[铜活板门](铜活板门.md)**
* 更改了所有变种的方块和物品纹理。

* *[凝灰岩砖](凝灰岩砖.md)、[凝灰岩砖台阶](凝灰岩砖台阶.md)、[凝灰岩砖楼梯](凝灰岩砖楼梯.md)、[凝灰岩砖墙](凝灰岩砖墙.md)**
* 更改了方块和物品纹理。

# 修复
</onlyinclude>

# 参考

# 导航

[de:23w44a](de:23w44a.md)
[en:Java Edition 23w44a](en:Java Edition 23w44a.md)
[es:Java Edition 23w44a](es:Java Edition 23w44a.md)
[fr:Édition Java 23w44a](fr:Édition Java 23w44a.md)
[ja:Java Edition 23w44a](ja:Java Edition 23w44a.md)
[lzh:二三週四四甲](lzh:二三週四四甲.md)
[pt:Edição Java 23w44a](pt:Edição Java 23w44a.md)
[ru:23w44a (Java Edition)](ru:23w44a (Java Edition).md)
[uk:23w44a (Java Edition)](uk:23w44a (Java Edition).md)