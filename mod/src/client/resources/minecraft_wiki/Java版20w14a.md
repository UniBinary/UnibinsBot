# Java版20w14a

*页面ID: 57436* | *来源: Minecraft Wiki*

<onlyinclude>

* *20w14a**是[Java版1.16](Java版1.16.md)的第10个快照，发布于2020年4月2日<ref name="20w14a"></ref>，加入了[僵尸疣猪兽](僵尸疣猪兽.md)及其刷怪蛋，略微修改了[炽足兽](炽足兽.md)的AI，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 加入了[僵尸疣猪兽](僵尸疣猪兽.md)刷怪蛋。

# = 生物 =
* *[僵尸疣猪兽](僵尸疣猪兽.md)**
* [疣猪兽](疣猪兽.md)被带入主世界时生成。
* 有着和[僵尸猪灵](僵尸猪灵.md)相似风格的腐烂皮肤。
* 与疣猪兽不同，它们不能被喂食，也不会远离诡异菌。
* 攻击视野中的大多数生物，[苦力怕](苦力怕.md)和其他僵尸疣猪兽除外。

# 更改
# = 物品 =
* *[指南针](指南针.md)**
* 指南针现在拥有<code>LodestonePos</code>、<code>LodestoneDimension</code>和<code>LodestoneTracked</code>数据字段。如果<code>LodestoneTracked</code>为0，游戏将不会检查指定位置的磁石。
* 指南针现在可以附上[消失诅咒](消失诅咒.md)魔咒。

* *[诡异菌钓竿](诡异菌钓竿.md)**
* 现在的耐久度是100而不是25。
* 每对炽足兽使用一次只减少1点耐久度。

# = 生物 =
* *[疣猪兽](疣猪兽.md)**
* 现在会在主世界中变成[僵尸疣猪兽](僵尸疣猪兽.md)。
* 现在会远离[下界传送门](下界传送门.md)和[重生锚](重生锚.md)。

* *[猪灵](猪灵.md)**
* 现在像远离僵尸猪灵一样远离僵尸疣猪兽。

* *[炽足兽](炽足兽.md)**
* 炽足兽的骑行速度现在显著提高，与乘船的速度更为相似。

# = 常规 =
* *[进度](进度.md)**
* 现在达成“”和“”进度需要击杀[远古守卫者](远古守卫者.md)、[末影龙](末影龙.md)、[末影螨](末影螨.md)、[恼鬼](恼鬼.md)、[凋灵](凋灵.md)和[僵尸疣猪兽](僵尸疣猪兽.md)。

* *[属性](属性.md)**
* 物品和实体将不再保留未知属性。
* 重命名某些属性的名称以满足[命名空间ID](命名空间ID.md)的要求。
* * 把{{cd|-{}-generic.maxHealth|delimiter=改为|generic.max_health}}。
* * 把{{cd|-{}-zombie.spawnReinforcements|delimiter=改为|zombie.spawn_reinforcements}}。
* * 把{{cd|-{}-horse.jumpStrength|delimiter=改为|horse.jump_strength}}。
* * 把{{cd|-{}-generic.followRange|delimiter=改为|generic.follow_range}}。
* * 把{{cd|-{}-generic.knockbackResistance|delimiter=改为|generic.knockback_resistance}}。
* * 把{{cd|-{}-generic.movementSpeed|delimiter=改为|generic.movement_speed}}。
* * 把{{cd|-{}-generic.flyingSpeed|delimiter=改为|generic.flying_speed}}。
* * 把{{cd|-{}-generic.attackDamage|delimiter=改为|generic.attack_damage}}。
* * 把{{cd|-{}-generic.attackKnockback|delimiter=改为|generic.attack_knockback}}。
* * 把{{cd|-{}-generic.attackSpeed|delimiter=改为|generic.attack_speed}}。
* * 把{{cd|-{}-generic.armorToughness|delimiter=改为|generic.armor_toughness}}。

* *[菜单屏幕](菜单屏幕.md)**
* 菜单屏幕的背景更改为下界。

* *世界存档文件**
* 区域文件现在以同步模式打开以避免崩溃后的数据丢失和损坏。
* * 服务器可以通过更改<samp>[server.properties](server.properties.md)</samp>内的<samp>sync-chunk-writes</samp>来禁用它。

* *[统计](统计.md)**
* 通用统计信息在统计信息菜单中现在会按字母顺序排序。

* *[标签](Java版标签.md)**
* 在方块标签中加入了下界传送门和重生锚。

# 修复
放置一个不同的活塞基部时，伸出的活塞头无法移除。
|115750|杀死特定敌对生物时无法达成进度“怪物猎人”（<code>kill_a_mob</code>）。
|116756|铁活板门字幕相互颠倒且不一致。
|124428|如果颜色值被替换为整型数组，烟火之星会导致游戏崩溃。
|125055|雪屋的酿造台和花盆内容物掉落（并放置）。
|127316|通用统计信息混乱。
|133049|方块底部或顶部的物品展示框中，指南针没有指向正确的位置。
|135501|另一个标签内的无效标签无提示地无法重新加载数据包。
|150405|客户端处理未知实体属性时存在漏洞。
|150455|在碰撞箱高度不足的熔岩旁行走（如在灵魂沙上），仍可能会导致实体燃烧。
|154427|村民最多只能捡起4组物品。
|161128|活塞基部被快速破坏并替换后，活塞头不会消失。
|164129|末影龙内部碰撞箱渲染偏移约200个方块。
|164446|如果标签值有一个无效，则不会加载标签，从而导致卸载所有数据包。
|167608|在重生后破坏物品展示框时出现异常。
|169975|突出显示玩家（旁观者）键不影响除自身以外的任何玩家。
|175201|的地板旋转错误。
|176644|当栅栏连接到新长的树上时，侦测器不会被触发。
|;dev
|172069|当用另一个活塞替换来回伸缩的活塞基部时，不会删除活塞臂。
|173158|僵尸猪灵的外层纹理未渲染。
|173192|流体碰撞箱过高。
|173684|穿过下界传送门时出现在传送门下方。
|173774|潜影弹表现的不像弹射物。
|173875|卸载和重载区块后无法与物品展示框互动。
|174231|豹猫不再生成。
|174838|标靶无法可靠地检测烟花。
|175434|向上发射的烟花在发射器内部爆炸。
|175985|磁石指针没有动画。
|175990|当磁石被破坏或不在同一维度时，磁石指针会高速旋转。
|176052|对磁石使用指南针时没有手部动画。
|176059|对磁石使用指南针后，记分板不给“指南针使用”这一项增加分数。
|176195|许多可骑乘的生物和载具仍然会被骑乘者的箭射中。
|176231|带有自定义附魔的指南针不会显示附魔闪烁。
|176269|对磁石使用指南针也会同时使用副手物品。
|;previous
|176387|钓鱼竿可以拽动有玩家骑乘的船。
|176391|玄武岩可以在下界的巨型菌上生成。
|176420|磁石指针的声音出现在友好生物选项中。
}}</onlyinclude>

# 参考

# 导航

[de:20w14a](de:20w14a.md)
[en:Java Edition 20w14a](en:Java Edition 20w14a.md)
[es:Java Edition 20w14a](es:Java Edition 20w14a.md)
[fr:Édition Java 20w14a](fr:Édition Java 20w14a.md)
[ja:Java Edition 20w14a](ja:Java Edition 20w14a.md)
[lzh:二〇週一四甲](lzh:二〇週一四甲.md)
[pt:Edição Java 20w14a](pt:Edição Java 20w14a.md)
[ru:20w14a (Java Edition)](ru:20w14a (Java Edition).md)