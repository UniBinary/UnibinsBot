# Java版1.21.2-pre1

*页面ID: 127097* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.21.2-pre1**是[Java版1.21.2](Java版1.21.2.md)的首个预发布版，发布于2024年10月8日<ref></ref>，修复了一些漏洞。

# 新内容
# = 游戏内容 =
* *[游戏规则](游戏规则.md)**
* 加入了<!---->游戏规则“[](游戏规则/disablePlayerMovementCheck.md)”<code>disablePlayerMovementCheck</code>，默认为<code>false</code>，启用时将禁用玩家的速度限制。

# = 常规 =
* *[物品堆叠组件](物品堆叠组件.md)**
* 在<code>equippable</code>组件中加入了可选字段：物品被装备后使用的覆盖层纹理的命名空间ID，未指定时不使用覆盖层。
* * ID会被处理为目录下的文件，如<code>misc/pumpkinblur</code>将使用。

# 更改
# = 物品 =
* *[马铠](马铠.md)**
* 24w36a中的盔甲材料变动导致马铠曾拥有耐久度，现在回退了这一更改。
* 不再默认具有<code>repairable</code>物品堆叠组件。
* *[狼铠](狼铠.md)**
* [狼](狼.md)身上的狼铠现在会渲染魔咒[光效](光效.md)。
* *[地毯](地毯.md)**
* [羊驼](羊驼.md)身上的地毯现在会渲染魔咒光效。

# = 游戏内容 =
* *[粒子](粒子.md)**
* 粒子选项中的颜色字段现在更加标准：
* * RGB字段现在总能编码为一个浮点向量（<code>[R,G,B]</code>）或是一个整数（<code>RGB</code>）。
* * ARGB字段现在总能编码为一个浮点向量（<code>[R,G,B,A]</code>）或是一个整数（<code>ARGB</code>）。
* * 更改涉及以下字段：
* ** <code>minecraft:trail.color</code>（之前只支持整数）
* ** <code>minecraft:dust.color</code>（之前只支持浮点向量）
* ** <code>minecraft:dust_color_transition.from_color</code>（之前只支持浮点向量）
* ** <code>minecraft:dust_color_transition.to_color</code>（之前只支持浮点向量）

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 更改了氧气条UI。
* * 玩家溺水时，现在振动的气泡具有空状态。
* * 加入了UI中气泡破裂的音效。

# 更改（实验性）
# = 方块 =
* *[嘎枝之心](嘎枝之心.md)**
* 与之相连的[红石比较器](红石比较器.md)现在会按其与绑定嘎枝的距离输出[红石信号](红石信号.md)。

* *[苍白橡树树苗](苍白橡树树苗.md)**
* [地图基色](地图基色.md)由<code>PLANT</code>更改为<code>QUARTZ</code>。
* 其方块物品不再能被[流浪商人](流浪商人.md)出售。

* *[苍白垂须](苍白垂须.md)和[苍白苔藓块](苍白苔藓块.md)**
* 地图基色由<code>COLOR_GRAY</code>更改为<code>COLOR_LIGHT_GRAY</code>。

* *[苍白覆地苔藓](苍白覆地苔藓.md)**
* 地图基色由<code>COLOR_GRAY</code>更改为<code>COLOR_LIGHT_GRAY</code>。
* 方块状态<code>bottom</code>的默认值现在为<code>true</code>而非<code>false</code>。

# = 生物 =
* *[嘎枝](嘎枝.md)**
* 不再会因周围的[创造模式](创造模式.md)玩家激活和停止。
* 临时嘎枝不再能被[命名牌](命名牌.md)命名。

# = 世界生成 =
* *[要塞](要塞.md)**
* 现在能在[苍白之园](苍白之园.md)生物群系生成。

# = 常规 =
* *[标签](Java版标签.md)**
* 将<code>pale_garden</code>加入到<code>#is_overworld</code>生物群系标签中。

# 修复
命令跨越维度的传送不使用正确的相对坐标。
|277027|如果无序合成配方的其中一个原料为空标签，则其接受任意物品。
|277028|不能平滑清空收纳袋。
|;prev
|277067|高对比度和Programmer Art资源包显示不兼容。
|277078|纹饰进度使用配方注册键。
|277108|记分板“<code>below_name</code>”显示模式在设置自定义颜色时将部分渲染得较深。
|277111|即使苍白橡树树苗被禁用，流浪商人也能出售它们。
|277118|嘎枝能在<code>doMobSpawning</code>被设为<code>false</code>时生成。
|277131|苍白之园不在<code>#minecraft:is_overworld</code>生物群系标签中。
|277141|命令不被权限等级2限制。
|277143|马铠拥有耐久相关组件。
|277144|燃烧的熔炉、高炉和烟熏炉在重新加载后会删除其中的内容物。
|277148|包过滤器会移除玩家未解锁的配方，导致数据包加载失败。
|277160|苍白垂须常在用命令放置时被立刻破坏。
|277163|苍白橡树树苗的地图基色不正确。
|277176|队伍词缀和玩家名称标签中的用户名之间存在深色界线。
|277215|尝试接受或拒绝已接受或拒绝的Realm邀请时，游戏崩溃。
|277301|使用极佳画质时，附魔三叉戟的光效不在第三人称下或抛出时显示。
|277302|使用极佳画质时，附魔盾牌的光效不在第三人称下显示。
}}</onlyinclude>

# 参考

# 导航

[de:1.21.2-pre1](de:1.21.2-pre1.md)
[en:Java Edition 1.21.2 Pre-Release 1](en:Java Edition 1.21.2 Pre-Release 1.md)
[es:Java Edition 1.21.2 Pre-Release 1](es:Java Edition 1.21.2 Pre-Release 1.md)
[fr:Édition Java 1.21.2 Pre-Release 1](fr:Édition Java 1.21.2 Pre-Release 1.md)
[ja:Java Edition 1.21.2 Pre-Release 1](ja:Java Edition 1.21.2 Pre-Release 1.md)
[pt:Edição Java 1.21.2 Pre-Release 1](pt:Edição Java 1.21.2 Pre-Release 1.md)
[ru:1.21.2 Pre-Release 1 (Java Edition)](ru:1.21.2 Pre-Release 1 (Java Edition).md)
[uk:1.21.2 Pre-Release 1 (Java Edition)](uk:1.21.2 Pre-Release 1 (Java Edition).md)