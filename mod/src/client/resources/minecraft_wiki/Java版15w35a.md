# Java版15w35a

*页面ID: 17877* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w35a**是[Java版1.9](Java版1.9.md)的第14个快照，发布于2015年8月24日<ref></ref>。

# 更改
# = 方块 =
* *[命令方块](命令方块.md)**
* 加入了选项“需要红石信号”或“保持激活”
* * 前者为之前版本的特性。
* * 后者将会使[命令方块](命令方块.md)无需红石信号而永远保持激活状态。
* * 此性质可通过NBT标签<code>auto</code>修改，适用全部命令方块。
* [命令方块](命令方块.md)新的纹理。
* * 中间的图形有了暗色的边框线。
* * 当命令方块设置为限制后箭头尾部的纹理会弯曲。

# = 生物 =
* *[僵尸](僵尸.md)**
* [僵尸村民](僵尸村民.md)现在有了对应其职业的不同纹理。
* * 还加入了新的NBT标签<code>VillagerProfession</code>来储存僵尸村民的职业，在被治愈时会生效。

# = 游戏内容 =
* *战斗**
* [锹](锹.md)初始伤害从4.5调整到2.5。
* [镐](镐.md)攻击速度从1.5调整到1.2。
* [斧](斧.md)初始伤害从8调整到7 。
* [斧](斧.md)攻击速度从0.85调整到0.9。
* * 这会使其每秒伤害输出（DPS）轻微降低。
* [锄](锄.md)初始伤害现在总为1。
* [锄](锄.md)攻击速度取决于其材料，从1开始，每一层级提升1。

# = 常规 =
* *优化**
* 实验性的性能提升。
* 优化客户端内存溢出。
* *[属性](属性.md)**
* 字符串标签<code>Slot</code>中的<code>AttributeModifiers</code>决定了更改应用到哪个槽位。
* 可用的槽位有：（主手、副手、足部、腿部、躯干、头部）
* 示例：<code>/give @p minecraft:stone 1 0 {AttributeModifiers:[{AttributeName:"generic.maxHealth",Name:"Test",Amount:10.0,Operation:0,UUIDLeast:1l,UUIDMost:1l,Slot:"torso"}]}</code>

# 修复
</onlyinclude>

# 参考

# 导航

[de:15w35a](de:15w35a.md)
[en:Java Edition 15w35a](en:Java Edition 15w35a.md)
[es:Java Edition 15w35a](es:Java Edition 15w35a.md)
[fr:Édition Java 15w35a](fr:Édition Java 15w35a.md)
[ja:Java Edition 15w35a](ja:Java Edition 15w35a.md)
[pt:Edição Java 15w35a](pt:Edição Java 15w35a.md)
[ru:15w35a (Java Edition)](ru:15w35a (Java Edition).md)