# Java版17w13a

*页面ID: 28772* | *来源: Minecraft Wiki*

（）

|parent=1.12
|prevparent=1.11.2
|prev=17w06a
|next=17w13b
|nextparent=1.12.1
}}<onlyinclude>

* *17w13a**是[Java版1.12](Java版1.12.md)的第2个快照，发布于2017年3月30日<ref></ref>，添加了鹦鹉、知识之书和配方书等内容，移除[旧版成就](成就/Java版.md)并以[进度](进度.md)替代，把玩家启动游戏所需的最低Java版本提升到[Java 8](https://www.oracle.com/java/technologies/downloads/#java8)，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 加入了[鹦鹉](鹦鹉.md)刷怪蛋。

* *[知识之书](知识之书.md)**
* 目前只能通过使用命令获得。
* 一本带着<code>Recipes</code> NBT标签的知识之书，包含着物品ID列表，当玩家它时就会被消耗并解锁指定物品的配方。
* * 当的值设为true时会很有用。

# = 生物 =
* *[鹦鹉](鹦鹉.md)**
* 可用[曲奇](曲奇.md)驯服。
* 会四处飞，“累”的时候会坐下。
* 会跟随并聚集在其他生物周围。
* 能模仿其他生物发出的声音。
* 鼠标右键点击已驯服的鹦鹉可使它停靠在驯服者的肩膀上。
* * 若驯服者跳跃可使鹦鹉离开肩膀。
* * 会跟随正在使用[鞘翅](鞘翅.md)飞行的玩家。
* 拥有的生命值。
* 拥有红色、蓝色、绿色和青色的变种。

# = 常规 =
* *[进度](进度.md)**
* 取代[成就](成就/Java版.md)。
* 可通过JSON文件自定义。
* 多标签界面。
* * 支持大量标签但是原版只使用4-5个：“挖掘&制作”、“下界”、“末地”、“战斗”与“工程”。
* * 不同标签有不同背景图案，现在暂时是由小图案平铺形成。
* * 基于数据的界面，包括位置与布局。

* *[配方书](配方书.md)**
* 达到条件时解锁的合成配方目录
* 当点击一个已解锁的配方，配方将在合成方格中出现；如果材料足够则可以制作。

* *[复述功能](复述功能.md)**
* 按下激活，可以自动阅读玩家的聊天文字，包括发出信息的玩家的名称。
* 复述功能不会阅读命令或命令的输出，也不会阅读使用了的消息。

* *NBT标签**
* <code>ShoulderEntityLeft</code> / <code>ShoulderEntityRight</code>：包含了在玩家左右肩膀上的实体的实体数据。
* <code>seenCredits</code>：如果玩家从传送门离开末地时变为1。
* <code>recipeBook</code>：包含配方列表的字符串，玩家已经看到像JSON文件那样格式化。
* <code>Recipes</code>：玩家带着知识之书时，点击右键来解锁的合成配方列表。
* * 如果未指定NBT标签，知识之书不会被消耗。

# = 命令 =
* *[命令](命令.md)**
* 加入take> [玩家] <名称*>}}。
* * 可为指定的玩家解锁或上锁指定的合成配方。
* * 当指定为<code>*</code>时，会为玩家解锁或上锁所有合成配方。
* 加入了revoketest> <*玩家*> <*进度*> [*规则*]}}。
* * 可以授予、测试或剥夺进度，或者给指定的玩家修改某个进度的规则。

# = 游戏内容 =
* 加入游戏规则<code>doLimitedCrafting</code>。
* * 默认关闭。
* * 开启后只允许玩家合成用已解锁的配方合成。

# 更改
# = 方块 =
[缩略图|右|250px|带釉陶瓦纹理改变的对比图](File:TerracottaSnapshotComparison.png.md)

* *[带釉陶瓦](带釉陶瓦.md)**
* 更改了青色、品红色、橙色和白色带釉陶瓦的纹理。<ref>https://www.reddit.com/r/Minecraft/comments/5sspmk/minecraft_snapshot_17w06a/ddhjm42/?context=1</ref>

* *[信标](信标.md)**
* 当鼠标指针正对它时会显示其名称。

* *[附魔台](附魔台.md)**
* 当鼠标指针正对它时会显示其名称。

# = 物品 =
* *[钓鱼竿](钓鱼竿.md)**
* 更改了钓鱼竿拋出浮漂的音效。

# = 常规 =
* *[成就](成就/Java版.md)**
* 被移除，并被[进度](进度.md)取代。

* *[合成](合成.md)**
* 当关闭合成界面时，其上的物品将不再掉落，取而代之的是物品被自动放入到物品栏。

* *Java版本**
* 升级至Java 8。<ref name="java 8"></ref>

* *后退动作**
* 玩家后退时身体面向正前方。<ref>看起来很奇怪（还有披风）|WAI}}</ref><ref></ref>
* * 这个快照之前，玩家后退时身体会转向一侧，看起来好像在用交叉步行走。

# 修复
</onlyinclude>

# 重新上传
该版本于09:32（UTC）被重新上传，以修复macOS平台上的崩溃漏洞。<ref></ref></onlyinclude>

# 参考

# 导航

[Category:重新上传过的版本](Category:重新上传过的版本.md)

[de:17w13a](de:17w13a.md)
[en:Java Edition 17w13a](en:Java Edition 17w13a.md)
[es:Java Edition 17w13a](es:Java Edition 17w13a.md)
[fr:Édition Java 17w13a](fr:Édition Java 17w13a.md)
[it:Java Edition 17w13a](it:Java Edition 17w13a.md)
[ja:Java Edition 17w13a](ja:Java Edition 17w13a.md)
[nl:17w13a](nl:17w13a.md)
[pt:Edição Java 17w13a](pt:Edição Java 17w13a.md)
[ru:17w13a (Java Edition)](ru:17w13a (Java Edition).md)