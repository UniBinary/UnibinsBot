# Java版20w14∞

*页面ID: 57257* | *来源: Minecraft Wiki*

</ref>||Mojavatar-Per-Landin.png}}

* *20w14∞**（启动器内称**20w14infinite**，游戏内称**20w14~**），亦称“**无限快照（Infinity Snapshot）**”，<ref></ref>是一个[愚人节玩笑](愚人节玩笑.md)快照，也是所谓“**终极内容更新（Ultimate Content Update）**”的唯一一个快照，发布于2020年4月1日，加入了由程序生成的大量新维度，其将各种已有的游戏元素随机杂糅在一起，并且有特殊的进入方式。20w14∞是[20w13b](20w13b.md)的分支。

尽管是个愚人节玩笑，但[自定义维度](自定义维度.md)和[自定义世界生成](自定义世界生成.md)已在[20w21a](20w21a.md)和[20w28a](20w28a.md)分别实现。

# 新内容
# = 方块 =
* *[32px](File:Box of Infinite Books Yellow.png.md)[32px](File:Box of Infinite Books Blue.png.md)[32px](File:Box of Infinite Books Red.png.md)[32px](File:Box of Infinite Books Green.png.md) [无限书盒](无限书盒.md)（Box of Infinite Books）**
* 其[命名空间ID](命名空间ID.md)为<code>minecraft:book_box</code>。
* * 它在5个面上都使用[橡木木板](橡木木板.md)的纹理，而在另外一面它拥有根据坐标随机分配的、类似书架的纹理。
* [斧](斧.md)会加速挖掘速度，被破坏后会掉落自身。
* 当时，如果该方块不在其所在区块的某一边缘并且朝向该边缘，就会生成一本随机的[成书](成书.md)。这本书能够被扔进[下界传送门](下界传送门.md)。
* * 这本随机的书与该方块是完全绑定在一起的，因此使用同一个无限书盒多次始终会获得同一本成书。
* ** 标题采用<code>-{}-<*区块X*>/<*区块Z*>/<*方块方向*>/<*本区块边缘至该方块右侧的距离*>/<*方块Y*></code>的格式，因此来自同一方块的书总是会拥有相同的标题和内容。
* * 每本书的作者都是“Universe itself”（宇宙本身），并且每本书都有16页，上面写满了随机的文本。
* 方块在“library”和“isolation”维度是自然生成的。
* 该方块纹理上的书本颜色是随机的。
* 若[游戏规则](游戏规则.md)<code>doTileDrops</code>设为<code>false</code>，则不会生成成书。
* 蓝色变种用于物品栏图标。

* *[时髦的传送门](时髦的传送门（方块）.md)（Funky Portal）**
* 其方块ID为<code>minecraft:neither_portal</code>。
* 如果任何成书——无论是由无限书盒生成的还是由[玩家](玩家.md)写成的，被扔进一个下界传送门后，这些传送门方块就会变为时髦的传送门方块。进入这个新的传送门会将玩家传送到一个随机的新[维度](维度.md)。
* * 将书扔进传送门后，这本书会被摧毁，不能穿过自己所转变的传送门。
* * 每本书都会生成其自己的维度，并且有着相同页面内容的书也会生成相同的维度。
* ** 如果将一本新的成书扔进时髦的传送门，会改变时髦的传送门传送的目标维度，以最后扔进去的为准。
* * 罕见情况下，将成书扔进下界传送门会导致其变成多种时髦的传送门方块组成的传送门。
* 时髦的传送门是方块实体。
* 在时髦的传送门上运行会返回包括维度名称的数据。
* 通往同一维度的传送门有着相同的颜色。
* 使用将会放置该方块并给予其随机的方块数据来确定通往的维度。
* 其也被称为传送门。

* *[32px](File:Cursor.gif.md) [光标](光标.md)（Cursor）**
* 光标方块有着每秒钟更换一次的动态纹理，会在绿色和黑色之间不断转换。
* 其[命名空间ID](命名空间ID.md)为<code>minecraft:cursor</code>。
* 放置或破坏光标方块时会发出石头的声音。
* 该方块会于“terminal”维度中，在黄绿色[混凝土](混凝土.md)构成的“C:\”旁作为闪烁的“_”自然生成。
* 其纹理像是在黑色和黄绿色混凝土之间循环，而“terminal”维度的其余部分也是由这两种混凝土构成的。

* *[32px](File:An Ant.png.md) [一只蚂蚁](一只蚂蚁.md)（An Ant）**
* 一只蚂蚁只能通过使用或类似的命令才能出现，没有物品形式。
* 其[命名空间ID](命名空间ID.md)为<code>minecraft:ant</code>。
* 模拟。
* * 如果放置在黑色[混凝土](混凝土.md)上，右转90度，将该方块改为白色混凝土，向前移一步；如果放置在白色混凝土上，左转90度，将该方块改为黑色混凝土，向前移一步。
* 一只蚂蚁即为Mojang网站上所提到的图灵机。
* 多个一只蚂蚁相撞会合并成一个。
* 自然生成在“ant”维度中，之后立即开始移动。
* 移动时无视途中的任何方块而直接将其替换。

* *[32px](File:Swaggiest stairs ever.png.md) [史上最炫楼梯](史上最炫楼梯.md)（Swaggiest stairs ever）**
* [下界合金块](下界合金块.md)的楼梯变种。
* 其命名空间ID为<code>minecraft:netherite_stairs</code>。
* 无法合成。
* 可以用[镐](镐.md)采集。
* 在“missing”维度中自然生成，作为通向[箱子](箱子.md)的楼梯。

* *[剩余物](剩余物.md)（Leftover）**
* 剩余物只能通过使用或类似的命令才能出现，没有物品形式。
* 在游戏中称为“Zone”（结界），其[命名空间ID](命名空间ID.md)为。
* 该方块是隐形的 ，只会散发出“Happy Villager”[粒子](粒子.md)效果。
* 一个实体进入该方块中会获得II和IV的效果各3秒。
* 尽管剩余物是隐形的，但无法将其他方块放置在它所在的位置，[活塞](活塞.md)也不能将其移动或破坏。
* 将物品扔入其中后，该物品的重力会发生改变。
* 在“zones”维度中自然生成。
* 其也被称为结界方块。

# = 物品 =
* *[32px](File:Footprint.png.md) [脚印](脚印.md)（Footprint）**
* [命名空间ID](命名空间ID.md)为<code>minecraft:footprint</code>。
* 纹理类似于footprint粒子，但有着16×16而非8×8的分辨率，并且还有透明度。
* 不存在于[创造模式物品栏](创造模式物品栏.md)中，必须通过命令或类似的方法来获得。
* 没有合成配方。
* 生成在“missing”维度的箱子中。
* 最有可能是在致敬已移除的“Footprint”粒子，故其存在于“missing”维度中。
* 这个物品是基于“脚印”粒子被经常要求加入的命令社区的玩笑。<ref>https://gist.github.com/boq/8e65cb85badc75765eeb8956af78aaa5</ref>

* *[32px](File:Fine item.png.md) [一个极妙之物](一个极妙之物.md)（A Very Fine Item）**
* 其[命名空间ID](命名空间ID.md)为<code>minecraft:fine_item</code>。
* 该物品的纹理为写有“Home Sweet Home”（家，甜蜜的家）的[草方块](草方块.md)的侧面。
* 其不存在于[创造模式物品栏](创造模式物品栏.md)中，必须通过命令或类似的方法来获得。
* 可以在“isolation”维度中床旁边的物品展示框内找到。

# = 世界生成 =
* *[生物群系](生物群系.md)**
[thumb|“supercalifragilisticexpialidocious”维度里随机生成的生物群系](File:Supercalifragilisticexpialidocious biome.png.md)
* 新维度里能找到随机生成的生物群系。
* * [玩家](玩家.md)可以在不同维度中发现新生物群系，发现的群系会加入到[自选世界类型](自选世界类型.md)的生物群系列表中，包括生物群系。
* * 一些特定的音效（如方块不同状态的以及生物的音效）会周期性地播放，尽管整个生物群系中都没有其正常来源。
* * 一些生物群系会禁用[天气](天气.md)。
* * 这些生物群系的生物生成机制是随机的。
* ** 原本不会自然生成的生物（例如[巨人](巨人.md)、[杀手兔](杀手兔.md)和[幻术师](幻术师.md)）会自然生成在随机维度里。
* ** 许多生物群系不会生成生物。[thumb|大量的潜影贝和末地城生成于“fry”维度里](File:Shulker Generation in Dimension Fry.png.md)
* * 生成的生物群系可能包含了随机结构或者其他维度会生成的结构。
* ** 会大量生成随着结构而生成的生物，因此[海底神殿](海底神殿.md)会生成大量[远古守卫者](远古守卫者.md)或[末地城](末地城.md)会生成大量的[潜影贝](潜影贝.md)。
* ** 通常情况下生物群系会包含大量的一个特定的结构。
* ** 有时，维度会生成重复的字符（例如通过<code>/warp 52</code>访问的维度会大量生成由[带釉陶瓦](带釉陶瓦.md)组成的字母“J”，<code>/warp norway</code>包含由棕色陶瓦组成的“ſt”，<code>/warp blessing</code>包含组成U形以及仅一个额外的像素的白色染色[玻璃](玻璃.md)）。这些字符的形状很可能来自Minecraft的字体纹理。
* * 一些随机生物群系可能与非随机的生物群系比较相似。
* * 大量的随机生物群系具有大量造成延迟的方块，例如藤蔓、腐烂的树叶或营火，这些生物群系有可能使游戏崩溃。
* 加入了三种预设的生物群系。
* * **[船间](船间.md)（Between）**
* ** 最适合在自选世界类型中与*浮岛*一起使用。
* ** 会生成一连串的[末地船](末地船.md)。
* ** 命名空间ID为<code>minecraft:between</code>。
* * **[为无暇应对无谓事物的玩家所准备的生物群系](为无暇应对无谓事物的玩家所准备的生物群系.md)（Biome For Player With No Time For Nonsense）**
* ** 最适合在自选世界类型中与*主世界*一起使用。
* ** 类似于[积雪针叶林](积雪针叶林.md)，不过生成的矿石变成了矿物块和[红石元件](红石元件.md)。
* ** 命名空间ID为<code>minecraft:busy</code>。
* * **[形状](形状.md)（Shapes）**
* **[缩略图|形状生物群系生成的示例](File:ShapesBuffet.png.md)最适合在自选世界类型中与*主世界*一起使用。
* ** 生成的世界含有由一种或多种方块组成的不同形状。
* ** 命名空间ID为<code>minecraft:shapes</code>。

* *[维度](维度.md)**
* 有**2,147,483,645**个新维度，这意味每个世界种子有2,147,483,648（2<sup>31</sup>）个维度，共有39,614,081,257,132,168,796,771,975,168 （2<sup>95</sup>）种维度组合。<ref></ref>
* * 某些维度包含彩蛋（见下文）。
* * 某些维度（包括彩蛋维度）在同一个世界种子中有与主世界一致的世界生成。
* 各个维度中会出现各种预设且随机生成的[生物群系](生物群系.md)。[[File:-NX- snowy tundra.png|thumb|维度“[NX]”里的[雪原](雪原.md)生物群系]]
* * 一些维度可能仅有1个生物群系，一些则可能有多个。
* ** 即使维度里有多个生物群系，特定的生物群系可能会占据维度里大部分地方，其他生物群系可能会非常稀有。
* * 在[主世界](主世界.md)或[下界](下界.md)里的稀有的生物群系可能会变得常见。
* 构成各种地物（例如[矿团](矿团.md)、[冰刺](冰刺.md)、[湖泊](湖泊.md)）的方块将被随机交换。
* 如果非随机的生物群系出现在随机的维度中，生物通常按照预期生成。
* * 通常，除了[蝙蝠](蝙蝠.md)之外，需要特定[光照等级](光照等级.md)才能生成的生物不会忽略光照水平就生成。例如，在维度“jeb__”中，被动型生物和[史莱姆](史莱姆.md)会在[稀树草原](稀树草原.md)生物群系中生成，但不会在其他生物群系中生成。
* ** 这有一些例外，在“interesting”维度以及少量其他维度，敌对生物在低光照等级的地方生成。
* * [史莱姆区块](史莱姆区块.md)仍然存在，一些特定的生物群系仍会正常生成史莱姆。
* 天空、方块、菜单、[玩家](玩家.md)等都会被随机着色。
* 天空可以是主世界、下界和[末地](末地.md)里随机选择的一个。
* * 对于主世界的天空，[太阳](太阳.md)和[月亮](月亮.md)可能会选择随机尺寸，昼夜更替会加速、减速，或者停滞不动。
* ** 在大多数维度中，昼夜更替要么快速循环，在五秒钟内完成一整圈，要么完全不循环。天空很少以其他速度移动，但若以其他速度移动，周期持续时间是随机的。
* *** 在“Just a normal day”维度，昼夜更替的循环速度比主世界快两倍，而在“Toast”维度，移动时间迟缓两倍。
[thumb|随机维度里的异常光照现象。这是“name”维度放置在虚空里的[[白色混凝土](File:Dimension -name- lighting screenshot.png.md)]]
* 一些维度里可能会有日光，而其他维度即使有太阳和月亮也不会有任何亮度。
* * 在没有昼夜更替的维度里，日光仍会正常运作以控制生物生成，但在其他维度中也可以代替月光控制而在地表生成敌对生物。
* 生成的维度可能具有异常的光照。
* * 有时，维度中每个方块的同一面都是纯黑的。
* * 在一些维度里，光照会和主世界类似（例如维度“gallery”的彩蛋）。
* 一些维度遍布随机[粒子](粒子.md)效果。
* * 每个生物群系出现的粒子效果取决于维度，有些时候主世界生物群系也会有粒子效果。
* ** 例如，维度“owo”里的[针叶林](针叶林.md)生物群系会出现<code>elder_guardian</code>粒子。
* * 在一些生成的维度中，随机生成的粒子可能会导致系统卡顿，取决于操作系统。
* 生成的维度可能采用的生成风格有：[thumb|“interesting”维度中生成的末地型地形](File:Interesting sky generation.png.md)
* * 主世界风格，包含大量的山峰和峡谷。
* ** 不会生成[洞穴](洞穴.md)，但[熔岩](熔岩.md)和[水](水.md)仍会生成在地下。
* ** 山峰和峡谷的生成取决于生物群系，大部分与[自选](自选.md)世界类型相同。
* ** 底部有[基岩](基岩.md)，其生成与主世界相同。
* *** 在一些维度，基岩可能存在洞。
* ** 一种主世界生成的子类别是生成[超平坦](超平坦.md)，但是有一些区别：[thumb|“fry”维度里的超平坦风格](File:Fry flat type generation.png.md)
* *** 仍然会生成洞穴。
* *** 有时候会生成一层由单个方块组成的方块层，厚度多变。
* **** 在一些特定的维度，这些层并不平坦，可能出现小山丘和峡谷。
* *** Y=0附近的基岩层不是平坦的，而是以主世界的形式生成。
* *** 这类生成非常罕见。
* *** 超平坦生成似乎是以水为基础的生物群系交换了方块的结果，超平坦生物群系的表层高度与海洋表面的相同（均为Y=63）。
* * 下界风格，在Y=128处有基岩层，并生成下界样式的洞穴。
* ** 顶部基岩层上面可能还是会生成一些地形和结构。
* * 末地风格，没有基岩层，具有大量浮岛。
* [床](床.md)和充能的[重生锚](重生锚.md)会爆炸。
* * 然而，在一些维度里床不会爆炸，而且随时可以[睡觉](睡觉.md)，也可以正常设置玩家[重生点](重生点.md)，但睡完觉后不会变成白天。
* ** 下列维度可以安全使用床（都是彩蛋维度，共15个）：
* *** “blacklight”
* *** “busy”
* *** “chess”
* *** “colors”
* *** “darkness”
* *** “decay”
* *** “holes”
* *** “pillars”
* *** “rooms”
* *** “slime”
* *** “wall”
* *** “zones”
* *** 颜色维度（“red”（“radmanovic”），“green”和“blue”）
* 每个维度的ID都是由该维度名称的SHA256散列确定的，该散列的字符串后面加上<code>:why_so_salty#LazyCrypto</code>。
* 在新维度中[末地船](末地船.md)里的箱子带有[fleer_orders](#常规.md)战利品表。
* 在一些维度里，[指南针](指南针.md)会指向世界中心，其他维度会和下界和末地那样随机旋转。
* [流体](流体.md)会以不同的方式运作。在一些维度水像主世界那样正常使用，而在一些维度里水会像在下界那样蒸发。
* 即使是在白天，[亡灵生物](亡灵生物.md)不会燃烧，[猪灵](猪灵.md)也不会僵尸化。
* [末地传送门](末地传送门.md)会激活，进入后[玩家](玩家.md)会正常传送到末地里，但会以他们进入传送门的坐标传送在新生成的[黑曜石平台](黑曜石平台.md)上。
* [地图](地图.md)会正常运作，就像在白天那样，但在大部分维度里地图只会像在下界那样失效。
* * 和下界不同的是，玩家的点会准确显示朝向。
* [云](云.md)会在一些维度里出现，但会出现在随机高度。
* 部分维度存在不同数量的[末地折跃门](末地折跃门.md)，当玩家进入后会传送至此世界的另外一个折跃门。
* 有[天气](天气.md)。
* * 当前天气在所有维度上都是相同的，如果在一个随机维度[下雨](下雨.md)，则在所有随机维度和主世界都在下雨，尽管如上所述在某些生物群系中不会下雨。
* 维度里世界中心出现携带[黑曜石柱](黑曜石柱.md)的<code>the_end</code>生物群系比较常见。
* 背景音乐和主世界的相同。
* 一些维度可能有雾，导致无法看清。
* 自选世界和独有维度里的光照系统是不同的。主世界可以非常暗，彩蛋维度可以不是。（例如“fleet”和“shapes”。）

* *彩蛋维度**

* 总共有43个硬编码的彩蛋维度<ref></ref>，可以通过{{cd|-{}-/warp <*名称*>}}进入，也可以通过在书中写上维度的名称，并把书丢入下界传送门来进入。
* * 刻意设计的彩蛋维度可以在代码中找到，但其中记录的是其维度ID而非其名称。对于硬编码的维度，也提供了维度ID（可以通过{{cmd|setblock ~ ~ ~ neither_portal{Dimension:<*ID*>} }}使用）。
* * 许多特殊维度使用与主世界相同的生成方式，包括“red”“green”“blue”“wall”“chess”“colors”和“slime”，但向其中加入了独有特性。

[缩略图|“ant”维度中创建的图案。大约10,000步后，右侧的“高速公路”会开始无限延伸](File:Ant2.png.md)
* “**ant**”（741472677） - 最初是平坦[白色混凝土](白色混凝土.md)世界，以及一个立即开始移动的一只蚂蚁和写有“PATIENCE”（耐心）的[金合欢木告示牌](金合欢木告示牌.md)。告示牌上的内容可能是指玩家必须耐心等待蚂蚁运动，其在行进超过10,000步后即会开始重复制作“高速公路”形状。
* * 告示牌是浮空的墙上的告示牌，无方块支撑。
* “**basic**”（236157810） – 对角迷宫图案。看起来类似于用BASIC编程语言生成的简单迷宫，蓝色混凝土地板生成于Y=16以及更低的海拔，淡蓝色混凝土迷宫墙壁延伸至Y=32处。
* * 迷宫似乎由一个没有分支或死角的主要通道以及一个只能从顶部进入的随机正方形组成。
* “**blacklight**”（1896587401） – 反转亮度的维度。实体和方块在白天呈黑色，在洞穴或晚上则是明亮的，[火把](火把.md)会使周围的区域变暗，等等。
* * 也会使文本和物品纹理变暗。
* * 天空的亮度正常，和主世界一样。
* * 世界生成和玩家生成的世界是一样的。
* “**brand**”（726931095） – 有着由随机方块组成的8x8[苦力怕](苦力怕.md)脸的维度，由随机颜色的[陶瓦](陶瓦.md)、[带釉陶瓦](带釉陶瓦.md)、[玻璃](玻璃.md)、[玻璃板](玻璃板.md)、[羊毛](羊毛.md)、[地毯](地毯.md)、[混凝土](混凝土.md)和[混凝土粉末](混凝土粉末.md)组成（Y=0-31）。
* “**bridges**”（233542201） – 有着在Y=130的地方随机生成的[末地石](末地石.md)桥的维度。
* “**busy**”（669175628） – 完全由[为无暇应对无谓事物的玩家所准备的生物群系](为无暇应对无谓事物的玩家所准备的生物群系.md)生成的维度，该维度会生成[红石元件](红石元件.md)（主要是[漏斗](漏斗.md)）和矿物方块来代替矿石。因此，这个维度在生成时非常缓慢。
* “**checkerboard**”（1929426645） – 包含了所有可染色方块的世界——混凝土、混凝土粉末、羊毛、地毯、染色玻璃、染色玻璃板、陶瓦和带釉陶瓦，以16×16×16的尺寸堆叠生成，从Y=0到Y=127。
* * 有两种图案——每种染色方块的图案和包含每种染色方块的同样但更小的图案的64×16×64区域。[缩略图|“checkerboard”维度里的混凝土粉末图案，以及旁边的羊毛“区块图案”](File:Warp checkerboard pattern.png.md)
* ** 后者或较大的图案是不一致的。[缩略图|更大的64×16×64图案](File:Large warp checkerboard pattern.png.md)
* “**chess**”（378547252） – 和主世界基本相同的维度，但如果XYZ坐标是奇数时，方块是完全黑暗的。这会出现国际象棋的图案，虽然只是在视觉上。基于位置，生物和大多数实体都会受此影响。
* * 这个维度的世界生成和主世界也是一样的。
* * 黑白图案是三维的。
* “**colors**”（94341406） – 分成4个象限，每个象限显示为黄、绿、蓝、红四种颜色，类似于微软的徽标。
* * 这个维度的世界生成也是和主世界一样的。
* “**content**”（1174283440） – 只有在出生点附近一个[空岛](空岛.md)的维度，空岛上有一棵[树](树.md)和[箱子](箱子.md)。
* * 玩家生成于（9, 75, 11）位于树上，结构大小是来自的6×12×7。
* * 空岛类似于YouTube Gaming图标，因为维度的名称是“content”。
* * 空岛上面的箱子里有以下物品：
[缩略图|“content”维度里的空岛和YouTube Gaming图标的对比](File:Warp content comparison.png.md)

* “**credits**”（1210674279） – 由下界合金块构成的完整Minecraft制作人员名单文本，位于Y=20处。
* “**custom**”（344885676） – 地面上为黄黑条纹的警示标记，从Y=16一直延伸到Y=0处，并且每两个方块层条纹前移一次。有两个告示牌，上面的位于（0,19,0）写有“UNDER CONSTRUCTION”（正在施工）和下面的位于（0,18,0）“IOU 1x Custom Worlds”（IOU 1x自定义世界；其中“IOU 1x”为“I owe you one”的缩写，意为“我欠你一个”），这和未来发布的[20w21a](20w21a.md)重新加入[自定义](自定义.md)世界有关。
* “**darkness**”（31674686） – 除了玩家[出生点](出生点.md)的约半径一百格以外没有任何光照的世界。
* “**decay**”（2114493792） – 几乎与主世界相同的维度，但离出生点越远就越显得破碎且崩坏。
* * 当尝试加载X或Z坐标绝对值超过32768的区块时（对应世界坐标±524,288），过高的坐标值会将一个非正数作为随机数参数传入<code>Random.nextInt()</code>，导致生成新区块时抛出<code>IllegalArgumentException: bound must be positive</code>异常并崩溃。
* * 破碎崩坏效果会应用于流体和固体。
* “**fleet**”（1143264807） – 由[船间](船间.md)生物群系生成的网格排列的大型末地船舰队。
* * 正常末地船中的所有非箱子战利品都会生成，但不包括[鞘翅](鞘翅.md)。
* “**gallery**”（1049823113） – 有[石英](石英.md)路径的博物馆，陈列着使用随机方块的螺旋形的雕塑，其中一些具有随机[数据值](Java版数据值.md)（例如，[台阶](台阶.md)含水，或出现在[花盆](花盆.md)内的[植物](植物.md)）。
* * “方块DNA”雕塑似乎有着随机的最大和最小高度，但它们确实在中间连起来了，并具有镜像翻转的顶部和底部（方块呈轴对称分布，Y=128处的石英层为对称轴）。
* * 任何音符盒在激活时都会播放随机乐器的声音，尽管其下方没有任何方块。
* “**holes**”（1011847535） – 常规的世界，但充满了[形状](形状.md)生物群系那样各种形状的洞。
* * 洞可以在水中形成。
* “**isolation**”（1902968744） – 在[泥土](泥土.md)超平坦上有一个房屋，内有名为bob的[村民](村民.md)、三条[狗](狗.md)、一个隐藏在地下的[箱子](箱子.md)以及周围的其他装饰品。在文件中该房屋名为<code>house_of_bob</code>。
* * [告示牌](告示牌.md)上写着“INGEN REKLAM TACK!”（在瑞典语中表示“谢绝广告宣传！”）和“GO AWAY!”（走开！）
* * 隐藏的箱子包含[腐肉](腐肉.md)、[骨头](骨头.md)和一把名为“Stabby McStabface”的[铁剑](铁剑.md)（模仿[Boaty McBoatface](wikipedia:Boaty McBoatface.md)）。
* * 三条狗的项圈颜色与“red”“green”和“blue”维度的颜色相同。
* * 狗命名为“Bob's dog”（鲍勃的狗）“Bob's Other Dog”（鲍勃的另一条狗）和“... their cousin Jim”（它们的表兄弟吉姆）。
* * Bob是丛林村民。
* * 不生成[生物](生物.md)。
* * 基地里面，有10个无限书盒和没有接线的[陷阱箱](陷阱箱.md)。
* * 楼上有个空的[唱片机](唱片机.md)。
* “**library**”（264458659） - 一个无限生成连续结构的维度，这些结构由无限书盒组成。这一设计参考了豪尔赫·路易斯·（Jorge Luis Borges）所著的《[巴别图书馆](wikipedia:The Library of Babel.md)》（*The Library of Babel*）。<ref></ref>
* * 图书馆的图案延伸到高度和深度极限的位置。
* “**llama**”（1113696725） - 地表为超平坦基岩，而在Y=65处有着数个安宁房间的维度，每个房间中有一头装备了黄绿色地毯的[羊驼](羊驼.md)，以及用有色字体写着“RELAX!”（放轻松！）和“ENJOY!”（享受吧！）的告示牌。除此之外还有一幅[画](画.md)（画面为日落）和开启的[下界传送门](下界传送门.md)。
* * 传送门旁的墙后隐藏着一个秘密箱子，箱子中有一本署名为“The Developer”（开发者）、名为“A Book”（一本书）的书，内容为“Nothing to solve”（没有东西可供解决）。将这本书扔进传送门会将玩家带往第709,735,702号维度，但这个维度完全是随机生成的。
* * 许多房间都会生成，都完全相同，但这些房间被几层基岩隔开。
* * 下界传送门使用黑曜石的最低要求大小。
* “**message**”（1113696725） - 空维度，有一条用[火](火.md)方块书写的信息：“We apologise for the inconvenience.”（我们为带来的不便表示抱歉），这是道格拉斯·亚当斯（Douglas Adams）的《[](wzh:银河系漫游指南_(小说).md)》（*The Hitchhiker's Guide to the Galaxy*）中的类似消息。
* “**missing**”（1384344230） - 空维度，在（0,65,0）处有一个由[石英块](石英块.md)、[信标](信标.md)和[箱子](箱子.md)组成的神龛，箱子中有两个脚印物品。
* * 该维度中生成的[铁傀儡](铁傀儡.md)无生物AI。
* * 下界合金楼梯下方有一个告示牌，上面写着“this is not a sign”（这不是一个告示牌）。这是在致敬超现实主义画家雷内·马格利特（René Magritte）的作品《》（*La Trahison des images*）。
<gallery>
24w14infinte-missing-front.png|“missing”维度中的神龛
24w14infinte-missing-back.png|前图的后侧
24w14infinte-missing-sign.png|楼梯下的告示牌
</gallery>
* “**notes**”（214387762） – 由[音符盒](音符盒.md)组成的超平坦维度，尽管没有接收到[红石信号](红石信号.md)或玩家输入，并且下面没有任何方块，但它们仍会演奏随机的音符和乐器和音高。玩家进入[旁观模式](旁观模式.md)时停止播放。
* “**nothing**”（1098962767） – 空维度，在（502640,99,1482448）有一个草方块和一个标有“Ha! I lied!”（哈！我撒谎了！）和“This isn't nothing!”（不是什么也没有！）的告示牌，其区块坐标（31415,92653）来自。
* “**origin**”（927632079） – 具有X,Y,Z指示器的维度（到4个方块远，原点有个[钻石块](钻石块.md)），与打开[调试屏幕](调试屏幕.md)时的类似。
* “**patterns**”（307219718） – 内有一个网格，在每个单元格中具有随机的黑白图案。除了沿X轴上进行拆分外，每个网格正方形与其相邻的正方形相差一个方块。
* “**perfection**”（545072168） – 具有无限重复的[圆石](圆石.md)房间的维度（地板为Y=63，天花板为Y=68）。
* * 可能是在引用YouTube用户Direwolf20，他上传Minecraft模组相关的内容，并经常建造与其所在维度发现的设计风格相同的房屋。<ref>https://www.youtube.com/watch?v=sD1ySvIBrTM - 4/1/2017, a house build by direwolf20 of the same design, also on April 1st.</ref>
* “**pillars**”（1834117187） - 充满高大黑曜石柱的维度。
* “**retro**”（661885389） - 区块带有黄绿色边框的黑色世界，类似于风格。
* “**rooms**”（1036032341） - 以主世界为基础并有大型砖墙和天花板的世界。
[缩略图|形状生物群系](File:ShapesBuffet.png.md)
* “**shapes**”（484336196） - 由[形状](形状.md)生物群系组成的维度。
* “**skygrid**”（1059552697） - 和由Sethbling设计的广受欢迎的生存挑战同名，其中含有所有方块，包括只能通过[创造模式物品栏](创造模式物品栏.md)或[命令](命令.md)获得的方块。
* * 许多方块以通常不可能单独存在的方式生成，如浮空的植物和受重力方块。
* ** 方块以随机的方块状态生成，这导致产生许多[含水](含水.md)方块、激活的红石元件、斜坡[铁轨](铁轨.md)、半扇[门](门.md)，诸如此类。
* ** 单个传送门方块可能在世界中生成，进入会前往另一随机维度。
* ** [末地折跃门](末地折跃门.md)不会传送玩家。
* “**slime**”（907661935） – 几乎与主世界相同，但地面上的所有东西都埋在10块厚的[黏液块](黏液块.md)中。
* “**spiral**”（1141490659） – 由[苔石](苔石.md)组成的大螺旋形，[草方块](草方块.md)层在Y=50处。
* “**sponge**”（1028465021） – 由[海绵](海绵.md)方块组成的类似于的结构。
* “**terminal**”（2003598857） – 超平坦维度（地表为Y=15），类似于DOS终端界面。使用了“光标”方块。
* “**this_is_a_very_long_phrase_that_hopefully_is_not_in_any_dictionary**”（985130845） – 在代码中被称为“last page”（最后一页），这是在引用[last page of the internet](http://hmpg.net/)<ref>https://imgur.com/a/WeA3Ip6</ref>。
* * 在命令或书中使用正确的名称进入此维度时，会包含一条秘密消息。
* * 当使用错误的名称（如<code>abglaiap</code>或<code>myrobod</code>）进入此维度时，将会包含用草方块写成的“Uh uh uh! You didn't say the magic word!”（啊啊啊！你没念咒语！），这句话引用了《》。
* ** 有时候有多个可以散列到同一字符串的值多个值（或者）会传送到同一个维度里。
* * 如果正确进入，世界中就会包含下列文字，这是在引用《》中一条外星人用石板所警告人类的消息：

  * 通过一个由[boq](boq.md)创建的[流媒体服务器](https://radio.xn--jxe.net/air.ogg)解密了这条秘密消息，该服务器会在随机间隔内发出可被解码为SSTV图像的蜂鸣声，从而生成笔记本上写有正确维度名称的照片。
  * 该维度名称可以使用由[boq](boq.md)提供的一个[代码片段](https://gist.github.com/boq/15aa9b6feeb5aa0776393f3a8ea9f712)来核实。
  * “Time of plague”（瘟疫的时间）是在影射。
  * 通过书中包含的“Europa”一词进入的维度似乎是一个满是云杉[森林](森林.md)的随机生成的世界，其中[屏障](屏障.md)方块构成了固体区域的绝大部分。该世界不是一个彩蛋维度，因此对不同的世界[种子](种子（世界生成）.md)有不同的生成。
* “**tunnels**”（107712651） - 随机生成的、由[海晶灯](海晶灯.md)组成的隧道。
* “**wall**”（251137100） - 巨大的基岩墙沿X=0延伸，（0,0）处有一扇[铁门](铁门.md)。隔离墙的两面都类似主世界，但主色调分别为红色和蓝色，对比强烈。
* * 可能是引用了[](wzh:麦克斯韦妖.md)。
* “**zones**”（1537997313） - 充满剩余物的常规世界。
* 色彩维度
* * “**red**”（1791460938） - 一切皆为红色的维度。
* ** 维度别称为“radmanovic”。
* * “**blue**”（1916276638） - 一切皆为蓝色的维度。
* * “**green**”（894945615） - 一切皆为绿色的维度。
* * 在任何色彩维度中退出至主屏幕会在各种菜单元素中保留一些效果。

* *[结构](结构.md)**

以下新的结构文件存储在<code>data/minecraft/structures</code>目录中：
* <samp>9x9.nbt</samp>
* *“perfection”维度中的[圆石](圆石.md)房间。
* <samp>b_center.nbt</samp>
* *“bridges”维度中桥梁的一部分。
* <samp>b_legs.nbt</samp>
* *“bridges”维度中桥梁的一部分。
* <samp>b_side.nbt</samp>
* *“bridges”维度中桥梁的一部分。
* <samp>command.com.nbt</samp>
* *“terminal”维度中的“C: \ _”文本。
* <samp>content.nbt</samp>
* *“content”维度中的空岛。
* <samp>desire.nbt</samp>
* *“missing”维度中的神龛。
* <samp>house_of_bob.nbt</samp>
* *“isolation”维度中bob的房子。
* <samp>library.nbt</samp>
* *“library”维度中的一个单元。
* <samp>llama.nbt</samp>
* *“llama”维度中的单个房间。

# = 命令格式 =
* ***
* 在世界存档的“debug”文件夹中生成多个JSON文件，其中包括：
* * 一个“dim-#”文件，内含维度编号、使用的生成类型、默认方块、默认流体以及维度内的生物群系。
* * 一个或多个“biome-#”文件，存储用于生成该维度中的生物群系的数据。

* ***
* 在其后加上字符串或数字，即可到达一个相应的随机维度。
* * 玩家会被传送到一个与向传送门扔出具有相同文字的书的相同维度。
* * 始终将玩家传送到每个维度上的相同坐标:在0,0附近的最高方块之一，如果在0,0附近没有任何方块，则在0,257,0处。
* * 如果玩家就在此维度中，再次向同一维度传送将会被传送到0,0。

# = 游戏内容 =
* *[进度](进度.md)**

|name-small=Almost there
|describe-custom=十亿个维度<br><small>（Visited over billion dimensions）</small>
|upstream=adventure.root
|require=玩家穿过传送门后统计信息“Dimensions changes”达到1,000,000,000。
|nsid=adventure/almost_there
|foot=1
}}

* *[统计](统计.md)**
* 增加了统计项目“Dimensions changes”，记录玩家穿过传送门的次数。
* * 当该统计数据达到1,000,000,000，玩家就会获得“”进度。
* * 该统计的ID是<code>minecraft.custom:minecraft.change_dimension</code>。

# = 常规 =
* *[战利品表](战利品表.md)**
* 加入了<code>fleet_order</code>战利品表。
* * 被用在新维度中的[末地船](末地船.md)的箱子里。
* * 内有一本名为“Orders”、作者是“§kDeep Lore”的书。
* ** <code>§k</code>是一个[格式化代码](格式化代码.md)，可以使后面的字符变为乱码。可以通过编辑世界存档中玩家或箱子的数据来查看乱码文本，或者通过使用命令获取数据来查看。不过，<code>§k</code>的效果只能到这一行结束，一旦换行后不再有效。
* ** 书的内容遵循<*动词*> §k<*宾语*>的格式。
* *** <*动词*>为以下文本之一：
* **** capture
* **** destroy
* **** cut
* **** find
* **** obliterate
* **** discover
* **** observe
* **** reinforce
* **** build
* **** deploy
* **** restore
* **** deliver
* *** <*宾语*>为以下文本之一：
* **** cheese
* **** footprints
* **** bananas
* **** toeshoes
* **** mah brewskis
* **** bicycle build for two
* **** my canoe
* **** Minecraft 3D: Lost Floppies
* **** content
* **** those pesky modders
* **** license-free mappings
* **** those VHS
* **** pre-mixed coctails
* **** quasi-connectivity
* * 包含了新的战利品表功能：
<div class="treeview">
* **add_book_contents** - 给成书或书与笔生成文字内容。
* * : **"orders"**：必须设置为“orders”才能生成上面详述的内容。
</div>

# 更改
# = 游戏内容 =
* *[物品栏](物品栏.md)**
* 现在[创造模式物品栏](创造模式物品栏.md)里的[方块](方块.md)和[物品](物品.md)是被打乱的。

* *[调试模式](调试模式.md)**
* 像创造模式物品栏一样，[调试模式](调试模式.md)的方块顺序也是被打乱的。

* *[钓鱼](钓鱼.md)**
* 玩家在钓鱼时可以钓到[生物鱼](生物鱼.md)、[守卫者](守卫者.md)、[远古守卫者](远古守卫者.md)、[鱿鱼](鱿鱼.md)或[船](船.md)了。

* *[进度](进度.md)**
* 加入了<code>player</code>来检测<code>changed_dimension</code>触发器。

# = 常规 =
* *启动界面**
* 更改了[Mojang](Mojang.md)启动界面。
* * 游戏正在启动时，会在下方显示公司名称MOJANG，同时会有一位Minecraft开发人员说“Mojang！”，类似于在世嘉的启动界面中说的“Sega！”。在[3D Shareware v1.34](Java版3D Shareware v1.34.md)中也用了同样的声音。

* *[选择世界菜单](选择世界菜单.md)**
* 其他版本的存档在本快照中均不可见。
* * 这是因为本快照读写世界的是<code>level_special.dat</code>而非<code>level.dat</code>。

# 视频

# 你知道吗
* 此快照与[20w13b](20w13b.md)有相同的[协议版本](协议版本.md)，因此可以在两个版本间跨版本游戏，但这可能会导致意外问题。
* 本快照中加入的新维度的ID从3开始分配，因为0是[下界](下界.md)，1是[主世界](主世界.md)，2是[末地](末地.md)。例子：使用会将玩家传送到ID为3的维度，则为ID2147483647。
* 在游戏JAR的<code>assets</code>文件夹中，有一个叫做<code>nothingtoseeheremovealong</code>的新文件夹，其中包含在[Mojang](Mojang.md)启动画面上播放的音效（标题为<code>bananana.ogg</code>）以及其高音调版本（标题为<code>banananana.ogg</code>）。
* * 使用播放<code>awesome_intro</code>音效时，命名空间也是<code>nothingtoseeheremovealong</code>。
* * 这些音效被视为游戏内的音效（<code>nothingtoseeheremovealong:awesome_intro</code>），并且能够在生成的维度（例如“<code>code</code>”）中播放。
* 有多个生物群系和维度可能导致游戏卡顿，甚至是崩溃或假死。
* * 有些在特定的维度生成的生物群系可能导致因为Java的异常导致错误和崩溃，例如“bound must be positive”（<code>java.lang.IllegalArgumentException</code>）和“Exception generating new chunk”（在服务器刻循环<code>java.util.concurrent.CompletionException</code>中）。这在大多数彩蛋生物群系中都不会发生。

# 画廊

<gallery>
File:Ant biome.png|“ant”彩蛋维度
File:Basic biome.png|“basic”彩蛋维度
File:Blacklight biome.png|“blacklight”彩蛋维度
File:Brand biome.png|“brand”彩蛋维度
File:Bridges biome.png|“bridges”彩蛋维度
File:Busy 20w14.png|“busy”彩蛋维度中由活塞和铁块组成的矿团
File:Checkerboard biome.png|“checkerboard”彩蛋维度
File:Chess biome.png|“chess”彩蛋维度
File:Colors biome.png|“colors”彩蛋维度
File:Content biome.png|“content”彩蛋维度
File:Credits biome.png|“credits”彩蛋维度
File:Custom biome.png|“custom”彩蛋维度
File:Darkness biome.png|“darkness”彩蛋维度
File:Decay biome.png|“decay”彩蛋维度
File:Fleet biome.png|“fleet”彩蛋维度
File:Gallery biome.png|“gallery”彩蛋维度
File:Holes biome.png|“holes”彩蛋维度
File:Isolation biome.png|“isolation”彩蛋维度
File:Library biome.png|“library”彩蛋维度
File:Llama biome.png|“llama”彩蛋维度
File:Message biome.png|“message”彩蛋维度
File:Missing biome.png|“missing”彩蛋维度
File:Notes biome.png|“notes”彩蛋维度
File:Nothing biome.png|“nothing”彩蛋维度
File:Origin biome.png|“origin”彩蛋维度
File:Patterns biome.png|“patterns”彩蛋维度
File:Perfection biome.png|“perfection”彩蛋维度
File:Pillars biome.png|“pillars”彩蛋维度
File:Retro biome.png|“retro”彩蛋维度
File:Rooms biome.png|“rooms”彩蛋维度
File:Shapes biome.png|“shapes”彩蛋维度
File:Skygrid biome.png|“skygrid”彩蛋维度
File:Slime biome.png|“slime”彩蛋维度
File:Spiral biome.png|“spiral”彩蛋维度
File:Sponge biome.png|“sponge”彩蛋维度
File:Terminal.gif|“terminal”彩蛋维度
File:Tunnels biome.png|“tunnels”彩蛋维度
File:Red biome.png|“wall”彩蛋维度的红色一侧
File:Blue wall biome.png|“wall”彩蛋维度的蓝色一侧
File:Zones biome.png|“zones”彩蛋维度
File:Red color biome.png|“red”彩蛋维度
File:Green color biome.png|“green”彩蛋维度
File:Blue color biome.png|“blue”彩蛋维度
File:Secret message.png|秘密消息维度，使用正确的维度名称进入
</gallery>

# 参考

# 导航

[de:20w14∞](de:20w14∞.md)
[en:Java Edition 20w14∞](en:Java Edition 20w14∞.md)
[es:Java Edition 20w14∞](es:Java Edition 20w14∞.md)
[fr:Édition Java 20w14∞](fr:Édition Java 20w14∞.md)
[it:Java Edition 20w14∞](it:Java Edition 20w14∞.md)
[ja:Java Edition 20w14∞](ja:Java Edition 20w14∞.md)
[pl:Java Edition 20w14∞](pl:Java Edition 20w14∞.md)
[pt:Edição Java 20w14∞](pt:Edição Java 20w14∞.md)
[ru:20w14∞ (Java Edition)](ru:20w14∞ (Java Edition).md)