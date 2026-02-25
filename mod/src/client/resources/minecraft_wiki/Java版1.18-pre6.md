# Java版1.18-pre6

*页面ID: 90912* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.18-pre6**是[Java版1.18](Java版1.18.md)的第6个预发布版，发布于2021年11月22日<ref></ref>，做了一些调整，并修复了一些漏洞。

# 更改
# = 世界生成 =
* *[溶洞](溶洞.md)和[繁茂洞穴](繁茂洞穴.md)**
* 地物会生成得略微稀疏。

* *[稀疏丛林](稀疏丛林.md)**
* 减少了其中[西瓜](西瓜.md)的生成量。

* *旧世界升级**
* 现在在被空置或部分空置的旧区块下方生成的新地形会更好的与已有部分相贴合。

# = 常规 =
* *常规**
* 现在只要有任何空闲时间都会保存区块，以避免自动保存导致的突然卡顿。

# 修复
1处的下落的方块会在落到Y0处时变为掉落物。
|239880|一些区块低于0的位置会完全不生成新地形。
|239900|把自定义世界升级到21w43a时，会忽略世界生成设置中的<code>min_y</code>和<code>height</code>参数。
|240513|默认世界中，熊猫不会在竹林中生成。
|241263|堆外内存泄漏问题。
|241409|地形塑造器数据缺失时游戏崩溃。
|241630|温度没有被正确转换。
|241636|炎热生物群系的下方有洞穴生物群系时，雪傀儡不会受到伤害。
|241767|当玩家正在潜行攀爬藤蔓或梯子时，破坏这些方块可以使玩家一直悬停在半空中。
|241820|升级后的海底神殿的边界范围会偏移到原位置北和西方向的区块边界上。
|241830|放大化世界中的风袭热带草原的表面方块不正确。
|241941|下界顶部基岩会被暴露出来。
|;previous
|242016|滴水石不生成在Y轴较高的地方。
|242022|加载新区块时，生成新区块过程由于数组索引越界异常（索引268435455超出32位长度范围）导致游戏崩溃。
|242479|滴水石锥会在熔岩湖中以替换熔岩方块的方式生成。
|242520|玩家在水下离开马、驴和猪背时，它们会浮在水面上方。
}}</onlyinclude>

# 参考

# 导航

[de:1.18-pre6](de:1.18-pre6.md)
[en:Java Edition 1.18 Pre-release 6](en:Java Edition 1.18 Pre-release 6.md)
[es:Java Edition 1.18 Pre-release 6](es:Java Edition 1.18 Pre-release 6.md)
[fr:Édition Java 1.18 Pre-release 6](fr:Édition Java 1.18 Pre-release 6.md)
[ja:Java Edition 1.18 Pre-release 6](ja:Java Edition 1.18 Pre-release 6.md)
[pt:Edição Java 1.18 Pre-release 6](pt:Edição Java 1.18 Pre-release 6.md)
[ru:1.18 Pre-release 6 (Java Edition)](ru:1.18 Pre-release 6 (Java Edition).md)
[th:รุ่น Java 1.18 Pre-release 6](th:รุ่น Java 1.18 Pre-release 6.md)