# Java版Beta 1.2 02 (20110517)

*页面ID: 124581* | *来源: Minecraft Wiki*

[Java版Beta 1.2_02](Java版Beta 1.2_02.md)的一个特殊的开发版本分支编译于2011年5月17日，即原版本发布大概4个月后。它与原版本共用一个版本号，在游戏内显示为**Beta 1.2_02**。该版本当时并未发布或公布，然而它的JAR文件在之后以其他方式公开。

该版本是用于制作在Xperia Play上发布[携带版](携带版.md)时使用的[宣传视频](https://www.youtube.com/watch?v=sW6GM6g3un0)中的延时摄影-{}-片段的一个早期版本。

这个版本的独特之处在于，它加入了一个“秘密”的游戏模式，在这个模式中，存在一种特殊的NPC——建造者，它可以建造建筑。

# 新内容
* *[游戏模式](游戏模式.md)**
* 秘密模式<ref>net/minecraft/client/gamemode/secret/SecretMode.class</ref>
* * 该版本中默认启用。
* * 在游戏启动时跳过标题屏幕的加载。
* * 会出现建造者。

* *[建造者](建造者.md)**
* 带有[Steve](Steve.md)的皮肤，持有[铁镐](铁镐.md)，并且可以瞬间破坏和放置方块，破坏方块会产生掉落物。<ref>net/minecraft/client/gamemode/secret/Builder.class</ref>
* 会在几分钟后自爆并重生。

# 更改
* *[物品栏](物品栏.md)**
* 除快捷栏以外的空间将无法正常访问。
* 在控制菜单，移除了打开物品栏对应的键位。

* *[玩家](玩家.md)**
* 不再可以攻击其他生物。

# 未使用特性
下列内容在游戏中不可用，但存在于源代码中。
* 存在两类未使用的与上述建造者不同的“秘密建造者”实体。若不修改源代码修复错误，这两种建造者都会导致游戏崩溃。
* * 第一类建造者持有在游戏中不渲染的[金镐](金镐.md)。它与[敌对生物](敌对生物.md)具有相似行为，它会四处走动并尝试攻击玩家。<ref><code>net/minecraft/client/gamemode/SecretBuilder.class</code></ref>
* * 第二类建造者持有[铁镐](铁镐.md)并四处游走，但并不像普通的建造者那样可以搭建建筑或遵循固定路线。<ref><code>net/minecraft/client/gamemode/secret/SecretBuilder.class</code></ref>
* 存在第二个未使用的秘密模式，将会生成其中一个建造者，但似乎无法正常工作。<ref><code>net/minecraft/client/gamemode/SecretMode.class</code></ref>
* Xperia模式<ref><code>net/minecraft/client/gamemode/XperiaMode.class</code></ref>
* * 进入世界时将玩家的坐标设为(-30.75, 75.69, 0.9)，其余与常规的[生存模式](生存模式.md)相同。
* 存在[珊瑚块](珊瑚块.md)的未使用代码<ref><code>net/minecraft/world/level/tile/CoralTile.class</code></ref>
* * 根据方块坐标而着色。<ref></ref>
* * 方块的每个面都放大大约1.6%，因为每个面的高度和长度都变长12.5%。
* ** 由于碰撞箱向外扩展，导致两个方块有部分重叠，产生了奇怪的碰撞效果。
* 砖块房
* * 是一个中空的用[红砖](红砖.md)制成的盒子，且长和宽在5至8个方块之间，高在3至5个方块之间。<ref><code>net/minecraft/world/level/levelgen/feature/HouseFeature.class</code></ref>
* [峡谷](峡谷.md)
* * 既可以在地面上生成，也可以在地下生成。
* 在中可以找到关于[Indev](Java版Indev.md)中[无限水源](无限水源.md)和[无限熔岩源](无限熔岩源.md)的未使用代码<ref><code>net/minecraft/world/level/tile/SpringTile.class</code></ref>
* 一段空的"TownFeature"代码，与其他所有结构和地物生成器共用同一代码。
* 存在生成一系列图片以制作“飞行”视频的代码，Notch曾在他的Youtube频道中发布该视频。
* * 游戏将会生成一个名为<code>flyby</code>的新世界。
* * 游戏将会在路径下生成TGA图片文件，分辨率取决于游戏窗口大小。
* * 游戏会生成大约21120帧的图片，在60FPS下，视频总长度为5分52秒。这是歌曲Biome Fest的一个早期版本的长度。
* * 该段代码有些许损坏。
* ** 由于从GPU获取像素的方式会产生错误的颜色通道信息，因此生成的屏幕截图会被破坏。
* ** 当生成图片时，[昼夜更替](昼夜更替.md)将不会工作。
* ** [区块](区块.md)仍然会被逐个更新，因为它是由一个在编译过程中被折叠的变量控制的。
* [x40px](File:Minfcraft logo.png.md) 游戏[徽标](徽标.md)被改为“Minfcraft”（只有修改游戏使其加载标题界面时才可见）。
* 绘制生物群系地图的代码与[万圣节更新](万圣节更新.md)的[PC Gamer预览版](Java版Alpha v1.2.0-preview.md)相似。<ref><code>net/minecraft/client/map/Map.class</code></ref><ref></ref>
* 存在[inf-20100624](Java版Infdev 20100624.md)存档格式的未使用代码。<ref><code>net/minecraft/world/level/chunk/storage/ZonedChunkStorage.class</code></ref>

# 你知道吗
* 与其他版本不同，该版本具有完整的未混淆代码。
* * 因此，原本应该在混淆过程中移除的未使用代码被保留下来，在代码中可以发现一些在已发布版本中无法使用的功能，具体见[上文](Java版Beta 1.2_02 (20110517)#未使用特性.md)。
* * 因为游戏使用内置的Java序列化系统，内联类创建的生物AI必须在编译时手动指定类路径才能正确保存和加载，所以[Indev](Java版Indev.md)之前的版本未对某些class文件进行混淆处理。
* Notch 于2010年6月28日在一篇博客中就提及了加入珊瑚的想法。<ref></ref>在[Infdev 20100629](Java版Infdev 20100629.md)中，一张[未使用的珊瑚纹理](Media:Unknown 2 (texture) JE1.png.md)包含在该版本的[terrain.png](terrain.png.md)中。该开发版本中的代码很可能与 Notch 最初在Infdev期间为废弃的珊瑚块编写的代码相同。
* 该版本的[协议版本](协议版本.md)为8，在Beta 1.2_02的基础上未做改动，且与[Beta 1.1_01](Java版Beta 1.1_01.md)、[Beta 1.1](Java版Beta 1.1.md)、[Beta 1.0.2](Java版Beta 1.0.2.md)、[Beta 1.0_01](Java版Beta 1.0_01.md)和[Beta 1.0](Java版Beta 1.0.md)共用同一协议版本。
* 该版本的客户端代码是以Java 6编写的，而世界代码则是以Java 5编写的。<ref>https://gist.github.com/PhoenixVX/78e363177329db1773351657ee472e9c#class-file-version-discrepancy</ref>
* * 这意味着该版本需要Java 6才能正常游玩。
* 在该版本中生成的世界名为<code>secretLevel</code>。

# 画廊
<gallery>
XperiaSchematicBeta.png|建造者尝试建造的建筑<ref>net/minecraft/client/gamemode/secret/Schematic.class</ref>
1.2 02 secret coral.png|不同颜色的[珊瑚块](珊瑚块.md)（游戏内未使用）
1.2 02 secret canyon.png|峡谷（游戏内未使用）
1.2 02 secret brick house.png|砖块房（游戏内未使用）
Minfcraft.png|若修改版本JAR文件调出该版本的标题画面，标题画面的显示。注意Minecraft徽标显示为“MINFCRAFT”
Builder JE1.png|建造者
</gallery>

# 参考

# 外部链接
*
*

# 导航

[en:Java Edition Beta 1.2 02 (20110517)](en:Java Edition Beta 1.2 02 (20110517).md)
[es:Java Edition Beta 1.2 02 (20110517)](es:Java Edition Beta 1.2 02 (20110517).md)
[ja:Java Edition Beta 1.2 02 (20110517)](ja:Java Edition Beta 1.2 02 (20110517).md)
[lzh:爪哇版復測版一點二之二（二〇一一〇五一七）](lzh:爪哇版復測版一點二之二（二〇一一〇五一七）.md)
[pt:Edição Java Beta 1.2 02 (20110517)](pt:Edição Java Beta 1.2 02 (20110517).md)
[ru:Beta 1.2 02 (20110517) (Java Edition)](ru:Beta 1.2 02 (20110517) (Java Edition).md)