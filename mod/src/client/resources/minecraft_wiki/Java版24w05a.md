# Java版24w05a

*页面ID: 112535* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w05a**是[Java版1.20.5](Java版1.20.5.md)的第6个快照，发布于2024年1月31日<ref></ref>，在内置实验性数据包中加入了[宝库](宝库.md)，并修复了一些漏洞。

# 新内容
# = 游戏内容 =
* *[盔甲材料](盔甲材料.md)**
* 加入了犰狳鳞甲质（<code>Armadillo</code>）材料以用于狼铠。

# = 常规 =
* *[粒子](粒子.md)**
* 加入了粒子。

* *[区域文件](区域文件.md)**
* 为第三方服务器添加了保留压缩ID，用于自定义压缩实现方式。
* * 压缩ID<code>127</code>现在可以用于自定义区域文件压缩实现。
* * 使用版本ID时，必须后接带有命名空间的字符串，表示所使用的自定义算法。

* *<samp>[server.properties](server.properties.md)</samp>**
* 在专用服务器配置属性<code>region-file-compression</code>中加入第三个枚举值：
* * <code>none</code>，不压缩数据。尽管CPU占用量较少，这会消耗更多的空间，并且需要大量的时间进行读写。与文件系统配合压缩存档文件更有意义。

* *[标签](Java版标签.md)**
* 加入了下列物品标签：
* * ：。

# 更改
# = 物品 =
* *[马铠](马铠.md)**
* 现在使用盔甲材料，因此物品[提示框](提示框.md)中包含[护甲值](属性/护甲值.md)及[盔甲韧性](属性/盔甲韧性.md)信息。

* *[狼铠](狼铠.md)**
* 现在使用盔甲材料，因此物品提示框中包含护甲值信息。

# = 实体 =
* *常规**
* 对已有<code>HandItems</code>和<code>ArmorItems</code>NBT标签的所有实体新增了<code>body_armor_item</code>和<code>body_armor_drop_chance</code>参数，处理效果与<code>HandItems</code>和<code>ArmorItems</code>相同。
* 马的<code>ArmorItem</code>、羊驼的<code>DecorItem</code>和狼的<code>armor</code>现改为使用<code>body_armor_item</code>和<code>body_armor_drop_chance</code>参数。
* 在命令中移除了<code>horse.armor</code>槽位参数，以适用于所有生物的<code>armor.body</code>槽位参数替代。

# = 常规 =
* *[调试屏幕](调试屏幕.md)**
* 现在允许服务器管理员查看专用服务器的TPS调试图表。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>30</code>。
* 物品或实体中存储的[药水效果](药水效果.md)不再编码默认值。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>25</code>。

* *[着色器](着色器.md)**
* 移除了核心着色器定义中未使用的属性数组。
* 移除了未使用的着色器。
* 将仅用于云的着色器替换为。
* 移除了<code>IViewRotMat</code>uniform，实体的<code>Position</code>属性现在位于（相对于摄影机的）世界空间中。
* 灯光方向uniforms不再与视图矩阵预先相乘。

# 新内容（实验性）
# = 方块 =
* *[宝库](宝库.md)**
* 生成在[试炼密室](试炼密室.md)的入口和决斗室结构中。
* 一种锁着战利品的方块，需要[试炼钥匙](试炼钥匙.md)解锁才会喷出奖励。
* * 方块内部有循环展示其战利品表的[物品实体](物品实体.md)，但喷出的物品随机。
* * 当前暂时使用试炼密室内奖励箱的战利品表，这将随开发被完全修改。
* 世界中的每名玩家都有一次解锁某一个宝库的机会。
* * 附近4格内有任一玩家未解锁过该宝库时，其锁孔打开，并产生橙色粒子。
* * 若附近4.5格内的玩家都解锁过该宝库，其锁孔闭合，无法试炼钥匙。
* [硬度](硬度.md)为50，没有合适挖掘工具，无法被常规的爆炸破坏，被破坏后不会掉落。

# 更改（实验性）
# = 物品 =
* *[试炼钥匙](试炼钥匙.md)**
* 更改了纹理。
* 现在可用于解锁宝库。

# = 世界生成 =
* *[试炼密室](试炼密室.md)**
* 将结构中的[箱子](箱子.md)替换为宝库。

# = 常规 =
* *[标签](Java版标签.md)**
* 向方块标签加入了。

# 修复
</onlyinclude>

# 参考

# 导航

[de:24w05a](de:24w05a.md)
[en:Java Edition 24w05a](en:Java Edition 24w05a.md)
[es:Java Edition 24w05a](es:Java Edition 24w05a.md)
[fr:Édition Java 24w05a](fr:Édition Java 24w05a.md)
[ja:Java Edition 24w05a](ja:Java Edition 24w05a.md)
[pt:Edição Java 24w05a](pt:Edição Java 24w05a.md)
[ru:24w05a (Java Edition)](ru:24w05a (Java Edition).md)
[uk:24w05a (Java Edition)](uk:24w05a (Java Edition).md)