# Java版15w33a

*页面ID: 17329* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w33a**是[Java版1.9](Java版1.9.md)的第7个快照，发布于2015年8月12日<ref></ref>，加入了[龙息](龙息.md)、[滞留药水](滞留药水.md)、新的[NBT标签](NBT标签.md)、新的[统计信息](统计信息.md)以及新的[闪烁标语](闪烁标语.md)，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[龙息](龙息.md)**
* 可以在[创造模式物品栏](创造模式物品栏.md)的酿造分类里找到。
* 可以和[喷溅药水](喷溅药水.md)酿造成[滞留药水](滞留药水.md)。
* 当[末影龙](末影龙.md)喷出龙息时可以使用[玻璃瓶](玻璃瓶.md)收集。
* 可以在[物品栏](物品栏.md)中堆叠。

* *[滞留药水](滞留药水.md)**
* 使用方式与喷溅药水相同。
* * 产生对应粒子效果的气泡，当实体走进去就会产生对应效果。
* 拥有所有的药水类型，并且也适用于效果是瞬间性的药水，比如说瞬间伤害。
* 可以使用龙息和喷溅药水来酿造。
* 云持续时间不能通过NBT标签控制。
* 不可堆叠。

# = 命令格式 =
* *[NBT标签](NBT标签.md)**
* 加入了实体<code>AreaEffectCloud</code>（ID为3），为<code>Entity</code>子项目。
* 加入了标签<code>Age</code>, <code>Duration</code>, <code>WaitTime</code>, <code>ReapplicationDelay</code>, <code>DurationOnUse</code>, <code>RadiusOnUse</code>, <code>RadiusPerTick</code>, <code>Radius</code>, <code>OwnerUUIDLeast</code>, <code>OwnerUUIDMost</code>, <code>Particle</code>, <code>Color</code>和<code>Effects</code>到<code>AreaEffectCloud</code>。
* 加入了<code>ExactTeleport</code>到<code>EndGateway</code>。
* 加入了<code>Linger</code>到<code>ThrownPotion</code>。

* *[记分板](记分板.md)**
* 新对象类型：armor和level。

# = 常规 =
* *[统计](统计.md)**
* 每个物品被丢弃和捡起的次数统计。
* * <code>stat.pickup</code>和<code>stat.drop</code>

* *[闪烁标语](闪烁标语.md)**
* “More Digital!”

# 更改
# = 方块 =
* *[末地折跃门方块](末地折跃门方块.md)**
* 更改了纹理。
* * 替换了原来会产生诡-{}-异效果的每面一个纹理，现在它整个使用一个纹理而不是每一个单独的面。

# = 物品 =
* *[药水](药水.md)**
* 剧毒药水的持续时间、剧毒II药水的持续时间以及再生药水的持续时间减少了。
* 力量药水对伤害的变化由增加130%变成了增加的额外伤害。
* 虚弱药水降低的伤害由 增加到。
* 喷溅型药水现在被用在[发射器](发射器.md)时表现得和其他[弹射物](弹射物.md)一样。

# = 生物 =
* *常规**
* NBT标签被重命名为，替换了很早就废弃了的整数值标签。

* *[末影龙](末影龙.md)**
* 现在在[终末之池](终末之池.md)附近徘徊时产生龙息。
* 现在会发射[末影龙火球](末影龙火球.md)。
* * 这会产生龙息。
* ** 龙息表现得像滞留药水，并产生效果云。
* ** 玩家不能使用物品形式的龙息产生效果云形式的龙息。
* 当它停在传送门上时是无敌的。
* * 弓箭将会反弹并[着火](着火.md)就像它们从一个拥有[火矢](火矢.md)的[弓](弓.md)射出一样。

# 修复
命令击杀末影龙后其生命条仍然保持显示。
|84509|末地折跃门方块在第三人称视角下渲染异常。
|85288|“保存世界”和“取消”按钮的功能被互换。
|85382|在较远的位置使用刷怪蛋会空指针异常。
|85542|末影龙能够破坏末地传送门和末地折跃门方块。

|;previous
|85397|使用刷怪蛋生成的生物无法被目标选择器<code>@e</code>选中。
}}</onlyinclude>

# 参考

# 导航

[de:15w33a](de:15w33a.md)
[en:Java Edition 15w33a](en:Java Edition 15w33a.md)
[es:Java Edition 15w33a](es:Java Edition 15w33a.md)
[fr:Édition Java 15w33a](fr:Édition Java 15w33a.md)
[ja:Java Edition 15w33a](ja:Java Edition 15w33a.md)
[pt:Edição Java 15w33a](pt:Edição Java 15w33a.md)
[ru:15w33a (Java Edition)](ru:15w33a (Java Edition).md)