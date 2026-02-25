# Java版已移除方块

*页面ID: 98492* | *来源: Minecraft Wiki*

从[Java版](Java版.md)开始开发至今，有一些方块已经从游戏中移除。这些方块可能已经被取代，或者开发人员已决定其今后不会加入游戏。

# 布料

[32px](File:White Cloth.png.md) [32px](File:Light Gray Cloth.png.md) [32px](File:Dark Gray Cloth.png.md) [32px](File:Red Cloth.png.md) [32px](File:Orange Cloth.png.md) [32px](File:Yellow Cloth.png.md) [32px](File:Chartreuse Cloth.png.md) [32px](File:Green Cloth.png.md) [32px](File:Spring Green Cloth.png.md) [32px](File:Cyan Cloth.png.md) [32px](File:Capri Cloth.png.md) [32px](File:Ultramarine Cloth.png.md) [32px](File:Violet Cloth.png.md) [32px](File:Purple Cloth.png.md) [32px](File:Magenta Cloth.png.md) [32px](File:Rose Cloth.png.md)

* *布料（Cloth）**是于Classic版本加入的方块，有16种颜色的纹理。布料是羊毛的前身。除了白色布料以外的布料在Indev中移除。[Beta 1.2](Java版Beta 1.2.md)中重新加入了其他颜色的羊毛，但颜色有所不同。

# 无限水源

* *无限水源（Water Spawner）**是一个可以自行生成[水](水.md)的方块，其于[Indev 0.31 20100114](Java版Indev 0.31 20100114.md)加入游戏，用于在世界中创建湖泊<ref></ref>。它在[20100625-1917](Java版Infdev 20100625-1917.md)之前可以通过ID 52来获得。此版本后该ID所引用的物品替换为[刷怪笼](刷怪笼.md)。

<gallery>
File:Edge water.png|无限水源方块
</gallery>

# 无限熔岩源

* *无限熔岩源（Lava Spawner）**是一个可以自行生成[熔岩](熔岩.md)的方块，其于[Indev 0.31 20100122-2251](Java版Indev 0.31 20100122-2251.md)加入游戏，用于无限生成熔岩以填满一定的空间。其方块ID是53，此数据值在[Infdev 20100629](Java版Infdev 20100629.md)中被[橡木楼梯](橡木楼梯.md)使用。

<gallery>
File:Gears on 52 53.png|无限水源和无限熔岩源之间的[齿轮](齿轮.md)
File:Infinite_Lava_Source_in_a_small_lake.png|将无限熔岩源放置在一片湖泊中的效果
</gallery>
<!--
# 零刻催熟作物

由于漏洞，作物的生长与破坏共用一个判定，那么当作物发现其依靠的方块（仙人掌周围所需的空气方块在这里也被认为是“依靠的方块”）更新时，它会建立一个计划刻事件：在下一个游戏刻中，它会检测它依靠的方块是否仍旧存在，如果存在，那么作物将会认为这个方块是由随机刻更新的，那么它将会生长。否则，作物将会被破坏。借此可以制作出非常高效的农场。

此漏洞曾于[13w09c](13w09c.md)中修复，目前此漏洞仍能被复现。
-->

# 上锁的箱子

[100px|右](File:Locked Chest Revision 1.png.md)

上锁的箱子是一个愚人节玩笑方块，它于[Java版Beta 1.4](Java版Beta 1.4.md)加入。它们会较少地生成，并且会发出亮度为15的光。对箱子按下将会弹出一个界面，点击界面上的“去商店（Go to Store）”按钮就会转到“Minecraft商店（Minecraft Store，网址为<nowiki/>https://minecraft.net/store/loot.jsp<nowiki/>，不过现在此网站的内容已被更改，访问时不是原页面）”。它于[Java版Beta 1.4_01](Java版Beta 1.4_01.md)被从游戏中移除，但游戏源码仍保留着它们的信息，直到它们在[Java版1.7.2](Java版1.7.2.md)被彻底移除。

其方块ID为95，此数据值在[13w41a](13w41a.md)被[染色玻璃](染色玻璃.md)使用。

部分上锁的箱子会显示需要史蒂夫公司提供钥匙，不过仍会跳转至Minecraft商店。

# 激活的红石比较器

在[1.5](Java版1.5.md)中，游戏使用两个ID来表示比较器有信号和无信号输出的状态，分别用的是<code>unpowered_comparator</code>和<code>powered_comparator</code>，数字ID分别为149和150。在[13w05a](13w05a.md)中，官方将<code>powered_comparator</code>方块从游戏中移除，取而代之的是信号已输入状态的<code>unpowered_comparator</code>方块。虽然仍能通过命令放置它，但不会起任何作用，并且会重新变成<code>unpowered_comparator</code>方块，但如果它面对的是有信号的方块，它将失去信号。在[Java版1.13](Java版1.13.md)的快照[17w47a](17w47a.md)中，由于[扁平化](扁平化.md)，它被彻底移除。

# 特殊值为3、7、11、15的树叶

<div style="float:right;">

</div>
在[Beta 1.2](Java版Beta 1.2.md)中加入了橡树树叶以外的几种树叶，使用数字特殊值来决定其类型，其数据值与特殊值一直到[1.13](Java版1.13.md)的扁平化才被更改。由于从[Beta 1.2](Java版Beta 1.2.md)到[正式版1.1](Java版1.1.md)只存在三个树叶变种，其特殊值为0/1/2（延伸为4/5/6、8/9/10和12/13/14），特殊值为3/7/11/15时，将产生一个未定义的叶子类型，这些方块看起来与一般的橡树树叶相同，但似乎使用了云杉树叶的色调。（）

# 平滑石头台阶

<div style="float:right;">
[150px](File:Seamless Stone Slab JE2 BE1.png.md)
[150px](File:Seamless Stone Slab Top JE1 BE1.png.md)
[150px](File:Smooth Stone JE1 BE1.png.md)
</div>
在[Beta 1.3](Java版Beta 1.3.md)被引入新的[台阶](台阶.md)类型时，特殊值大于7的台阶如果超过了可合法获得的台阶的最高特殊值，就会在所有面上使用顶面纹理。

其中两个特殊值的台阶在[Beta 1.8](Java版Beta 1.8.md)预发布版中被[砖台阶](砖台阶.md)和[石砖台阶](石砖台阶.md)占用，另一个特殊值在[Java版1.4.6](Java版1.4.6.md)的快照[12w49a](12w49a.md)中被[下界砖台阶](下界砖台阶.md)占用，最后剩下的一个特殊值在[Java版1.5](Java版1.5.md)快照[13w02a](13w02a.md)中被[石英台阶](石英台阶.md)占用。之后在[13w04a](13w04a.md)中重新有效地实现了平滑台阶，使以上的八种台阶四面都使用了顶部纹理（也因此引入了[平滑砂岩](平滑砂岩.md)和[平滑石英块](平滑石英块.md)），但平滑石头台阶已经不存在于游戏中。

<gallery>
File:Slab ids beta 1.6.png
File:Slab ids beta 1.8.png
File:Slab ids 1.4.6.png
File:Slab ids 1.5.png
</gallery>

# 冗余的无缝双台阶
[250px|右](File:Seamless cobblestone.png.md)
在[13w04a](13w04a.md)中，双台阶被改变了，所以那些特殊值为8到15的台阶会在所有六个面上使用顶部纹理。这使得几年后平滑双台阶被重新加入游戏，同时也引入了平滑砂岩和平滑石英块。然而，由于[平滑的双石台阶](平滑石头.md)也容纳了圆石、旧橡木（后来的石化橡木）、砖、石砖和下界砖等台阶变种，这些台阶最终也会出现“无缝”的双台阶变体，在视觉上与正常的双台阶或正常的台阶没有区别。这些方块一直留存到[17w47a](17w47a.md)，在此之后它们因扁平化移除。

# 覆雪泥土和覆雪砂土
由于灰化土在[1.13](Java版1.13.md)之前是[泥土](泥土.md)的一个特殊值变体，它使用的覆雪状态最后也适用于[泥土](泥土.md)和[砂土](砂土.md)，但没有任何效果。这些方块在扁平化中被移除了。

# 齿轮

2010年1月25日，Notch发布了一个视频，展示了悬崖壁上的一些齿轮。<ref>https://www.youtube.com/watch?v=V9H_ymjT-4E&t=2m12s</ref>

[右|100px](File:Gear.gif.md)

2010年1月26日的Indev版本中加入了齿轮的代码。其只能通过修改物品栏获得，且在物品栏中不会显示。齿轮由中间的杆和会动的轮齿组成。齿轮只能被放在方块侧面，将其放置于方块的毗邻两侧时，两个齿轮会互相靠近。齿轮无法被直接破坏，破坏齿轮依附的方块也不会将其移除，而仅仅是将其隐藏了，重新放置齿轮依附的方块会再次显示齿轮。用地图编辑器将齿轮放置于空气中，其亦不可见，只有其存在毗邻的方块时，才会显示纹理。齿轮只能被水流破坏。

2010年2月27日的Infdev中，齿轮被重命名为钝齿，在之后的2010年6月27日被移除。

齿轮的数据值为55，随后该数据值被[红石粉](红石粉.md)使用，直至[扁平化](扁平化.md)。

# 常规失活的珊瑚块
[100px|右](File:Dead Coral Block JE1.png.md)
在快照[18w09a](18w09a.md)中，所有的[珊瑚块](珊瑚块.md)都有相同的纹理，只是颜色不同，因此只存在1种失活的珊瑚块。但在快照[18w10a](18w10a.md)中，每种颜色都有了自己的纹理，但失活后仍都只变成之前的失活的珊瑚块。常规失活的珊瑚块在快照[18w10b](18w10b.md)中被各种珊瑚块的失活变种所取代。

# 玫瑰
花}}
[缩略图|60px|玫瑰](File:Rose.png.md)
[缩略图|60px|玫瑰盆栽](File:Potted Rose.png.md)

玫瑰在[Java版1.7.2](Java版1.7.2.md)（快照 13w36a）和原主机版中被移除，取而代之的是[虞美人](虞美人.md)（那时虞美人在原主机版仍称为“玫瑰” ）。

# 极端特殊值的方块
由于以前游戏会通过特殊值而不是将某个特殊值作为单独的ID或通过方块的状态来处理方块的变化，可能会产生一些具有极端特殊值的方块，它们可能会产生意外的特性。这些方块都在[14w26a](14w26a.md)中被彻底移除。

# = 无面南瓜和南瓜灯 =

使用特殊值5或以上，可以放置无面南瓜和南瓜灯。这些方块的模型在[14w10a](14w10a.md)中丢失。

在[17w47a](17w47a.md)中，无面南瓜作为适当的且默认的南瓜方块并重新回归，当时的有面南瓜被转移成了[雕刻南瓜](雕刻南瓜.md)，但无面南瓜灯可能不会被重新加入游戏。

# = 无面熔炉 =
特殊值为0、1、6、7、12和13的[熔炉](熔炉.md)（以及[燃烧的熔炉](燃烧的熔炉.md)）不使用炉口纹理，对所有正交面使用侧面纹理，顶面和底面使用通常的顶部和底部纹理。特殊值为8、9、10、11、14和15的熔炉则无异常。

与许多方块不同，这些方块需要使用外部编辑器来放置，因为总会放置一个在正常范围内的熔炉。

所有这些无效的熔炉和[燃烧的熔炉](燃烧的熔炉.md)都在[14w10a](14w10a.md)中丢失了模型，只有特殊值为0的未燃烧的熔炉除外，它保持了无面的外观。没有朝向的燃烧的熔炉在[14w17a](14w17a.md)和[14w21b](14w21b.md)之间的某个时间段重新拥有了模型。

# = 六面共用纹理的方块 =

<div style="float:right;">
[150px](File:Hay Bale (no direction) JE1 BE1.png.md)
[150px](File:Piston (no direction) JE1.png.md)
[150px](File:Sticky Piston (no direction) JE1.png.md)
</div>
在被拆分成方块状态之前，下列方块伴随着正确状态的方块加入进了游戏中。这些方块在被移除之前可以通过放置。

干草捆在[14w10a](14w10a.md)像许多其他方块一样丢失了纹理，六面活塞方块直到[14w17a](14w17a.md)纹理才改为无效纹理的方块。六面活塞块可以通过使用非命令的特殊的装置，使得六面活塞以特殊的方式更新其他活塞。

有趣的是，一些六个面都使用同种纹理的方块并没有被移除，例如[木头](木头.md)和[平滑石头](平滑石头.md)，在后来的更新中被赋予了独特的方块ID，和相应的[合成配方](合成配方.md)。

# = 隐形楼梯 =
起初，特殊值为4到15的楼梯方块是完全不可见的，也没有碰撞箱；它们存在的唯一现象是在被准星瞄准时有完整的方块状框选箱。

在[12w08a](12w08a.md)中，这些特殊值将被用于新加入的倒立楼梯，特殊值8到15似乎只是0到7的重复，在它们被删除之前，它们本身可能没有被使用。最后这8个特殊值在[14w26a](14w26a.md)中被删除了，就像其他无效的方块一样。它们也从未使用过无效纹理。
<gallery>
File:Invisible stair block.png|12w08a前
File:Visible stair block.png|12w08a后
</gallery>

# = 完整框选箱的墙上的告示牌 =
[160px|右](File:Full hitbox wall sign.png.md)
告示牌使用特殊值2、3、4、5来确定其朝向，因此数据值为0、1或任何6以上的告示牌总是朝南，且具有完整方块的框选箱。

这种告示牌现在可以在基岩版使用放置。

# = 隐形的梯子 =

[150px|右](File:Small Missing Texture Cube.png.md)
[150px|右](File:Small_Missing_Texture_Cube_Screenshots.png.md)

梯子使用特殊值2、3、4、5来确定其朝向。因此数据值为0、1或任何6及以上的梯子表现出与正常梯子不一样的行为。值得注意的是，它们似乎很容易切换到它们所连接的方块表面（有时似乎是随机的，但可以通过查看一个有效的梯子来控制，在这种情况下，这种梯子最终会切换到它的判定箱），这可以通过它们的判定箱和碰撞箱看到。最初，它们的判定箱是完整的立方体。

在它们存在的大部分时间里，它们是完全不可见的，尽管在[14w07a](14w07a.md)中它们变成了以方块为中心的小型无效纹理的方块的立方体。在[14w10a](14w10a.md)，它们变成了完整的无效纹理的方块。

特殊值为0的[藤蔓](藤蔓.md)也以小型无效纹理的方块出现，然而它们在[1.16.3](Java版1.16.3.md)中仍然存在（作为所有状态都设置为false的藤蔓）。

# = 错误的火把模型 =
当方块特殊值还在使用时，特殊值为5的[火把](火把.md)为正常被放置在地上的火把，1、2、3、4作为被放置在墙上的火把。0、6、7似乎未被使用，在视觉上与普通火把相同，特殊值为0的火把只能通过外部编辑器放置，不能通过放置。

特殊值为8或8以上的火把表现出了有趣的形态：8、13、14、15出现的形态与正常被放置在地上的火把一样。而9、10、11、12虽仍是地上的火把，但会有墙上的火把判定箱，故其与火把本身-{}-分离。

红石火把也具有相同的特性。

在[14w06a](14w06a.md)中加载带有这些方块的区块会导致游戏崩溃。在[14w06b](14w06b.md)中，这些方块变成了小型无效纹理的方块，然后在[14w10a](14w10a.md)中变为完整的无效纹理的方块，直到在[14w26a](14w26a.md)中被移除。
<gallery>
File:Funny torch.png
File:Funny redstone torch.png
</gallery>

# = 不正确的按钮 =

在[1.7.10](Java版1.7.10.md)中，使用命令放置一个特殊值为0、13、14、15的[按钮](按钮.md)会出现奇怪的形态。该按钮将以一个完整的[橡木木板](橡木木板.md)或[石头方块](石头.md)的形式呈现，直到（可能）观察到另一个按钮或获得所述按钮的物品，这时它将使用按钮的模型。在这两种情况下，它们在被按下时似乎不会改变形状。

这些按钮的形态非常不一致，而且也有些不稳定，经常容易被破坏，它们的形态也可能在每个版本中发生巨大的变化。尽管实际上从未改变过特殊值，但它们似乎每次都会以不同的方式记录它们所连接的方块表面。

<gallery>
File:Stone JE3 BE2.png
File:Stone Button (item) JE1.png
File:Oak Planks JE4 BE2.png
File:Oak Button (item) JE1.png
</gallery>

# = 无底漏斗 =
[right|96px](File:Hopper (U) JE1.png.md)
特殊值为1或9的[漏斗](漏斗.md)，其输出管不会指向任何方向。像许多这些被移除的方块一样，它们自[14w10a](14w10a.md)时改为无效纹理的方块后的不久就被移除了。

往特殊值为6、7、14或15的漏斗放东西会使游戏立刻崩溃，该世界将无法正常进入。

# = 柱状下界传送门 =

[96px|右](File:Nether Portal (unconnected) JE3.png.md)
在[Java版1.7.10](Java版1.7.10.md)之前，使用特殊值3、7、11、15放置的下界传送门为一个柱状下界传送门方块。

# = 其他极端特殊值的方块 =

# 奇怪的拉杆
这些拉杆有着扭曲的模型，可以通过加载1.3或更高版本的世界来获得，其中包含1.2.5中特殊值为0、7、8、15的天花板拉杆。

# 曾经能以物品形式获得的方块

在正式版1.7.2和1.8之前，有许多种方块可以被修改进物品栏；然而在这些版本之后，随着游戏更加成熟，因此这些方块就完全不能获得了，即使是通过修改的方法也不行。

现在，游戏在多数命令里仅接受ID名称（如<code>minecraft:dirt</code>），也只在把方块加进物品栏以及保存文件时才使用ID名称。通过旧数字ID的方法获取方块不再是一个可行方法。此外，游戏还会自动移除物品栏里拥有不合法ID名称的方块，因此使用物品栏编辑器也不再是一个可行方法。而且，一些诸如<code>minecraft:cake</code>的方块不再能获得它们的方块形式；然而，自从游戏给予其相应的物品形式的名字为<code>minecraft:cake</code>时，就取而代之的给予其物品形式。

# = [Java版1.7.2](Java版1.7.2.md)之前可获得的方块 =
在快照13w37a，命令被修改了，它仅接收在聊天窗口里输入的物品名称。由于此次更改，共有26个方块不能获得。

# = 空气方块 =
在[Grum](Grum.md)重新定义空气的游戏内代码后，空气在[Java版1.7.2](Java版1.7.2.md)快照[13w38b](13w38b.md)可以短暂地获得其物品形式。因为获取空气方块的能力产生了大量漏洞，其仅存在于1个快照就被移除了。

# = [Java版1.8](Java版1.8.md)之前可获得的方块 =
在快照14w25a中，物品渲染的方式和方块数据值的内部表示法都被修改了。因此，有12个方块不能再获得：

# = [Java版1.9](Java版1.9.md)之前可获得的方块 =
在快照[15w49a](15w49a.md)中，一个方块不能再获得：

# 方块盆栽
从[Java版1.7](Java版1.7.md)开始，可以放置在盆栽内的方块数量超过了15，因此无法使用传统的4位元数据值来存储花盆的内容，也就需要使用[方块实体](方块实体.md)代替。这允许任何方块的物品形式被放置在花盆内，但实际上只会呈现部分里面的方块。

在[14w17a](14w17a.md)中，由于方块的渲染方式发生变化，它们被更改为使用[方块模型](方块模型.md)而不是硬编码模型，这些奇怪的盆栽变种只是呈现为空盆栽，但这些盆栽内的“无效”植株可以通过打破盆栽或右键单击从盆栽中取回。在[17w47a](17w47a.md)中，每种盆栽变种被分到了单个方块ID，并移除了花盆的[方块实体](方块实体.md)，因此它们在17w47a中被完全移除。

# = 13w36a =
这是花盆使用方块实体的第一个版本，花盆可以容纳一些其他[蕨类](蕨类.md)的<code>destroy</code>值，导致允许草灌木和草存在于盆栽中。此外，蜘蛛网也可以被放置于盆栽中。
<gallery>
File:Potted Cobweb.png|{{code|/setblock ~ ~ ~ minecraft:flower_pot 0 destroy {Item:30,Data:0}<nowiki/>}}
File:Potted Green Shrub.png|{{code|/setblock ~ ~ ~ minecraft:flower_pot 11 destroy {Item:31,Data:0}<nowiki/>}}
File:Potted Grass.png|{{code|/setblock ~ ~ ~ minecraft:flower_pot 11 destroy {Item:31,Data:1}<nowiki/>}}
</gallery>
受生物群系着色的影响，盆栽植物——[草](草.md)、[蕨](蕨.md)需要具有11（以前属于盆栽植物的数据值）的特殊值，否则将显示为它们的原始纹理。
<gallery>
File:Potted Gray Grass.png|{{code|/setblock ~ ~ ~ minecraft:flower_pot 0 destroy {Item:31,Data:1}<nowiki/>}}
File:Potted Gray Fern.png|{{code|/setblock ~ ~ ~ minecraft:flower_pot 0 destroy {Item:31,Data:2}<nowiki/>}}
</gallery>

# = 14w06a =

在此版本中，如果通过以下命令放置花盆，则可以放置大量方块盆栽的形式。可根据需要将ITEM和DATA替换成相应方块ID（数据值）和特殊值：

{{cmd|setblock ~ ~ ~ minecraft:flower_pot 0 destroy <nowiki>{</nowiki>Item:ITEM,Data:DATA<nowiki>}</nowiki>}}

此处仅列出具有独特的渲染的方块，一些在放入花盆前后渲染无差异的方块没有单独在这里列出。

在花盆中，方块始终显示底部纹理并渲染为跟[植物](植物.md)一样的十字[模型](模型.md)。具有半透明性的方块的盆栽要么看起来完全不透明，要么就像彩色玻璃盆栽，半透明像素是看不见的。

如果一些方块拥有正常变种，则将它们放入花盆中时，会出现类似[生物群系](生物群系.md)着色的色彩。例如，[树叶](树叶.md)按照其<code>destroy</code>值着色，将其数字设置为1会导致其使用[云杉](云杉.md)叶的着色，将其设置为2会使用[白桦](白桦.md)叶的着色，为0或3会使树叶按花盆所在的生物群系着色。
<gallery>
File:Potted_Block_in14w06a.png|[14w06a](14w06a.md)中使用命令放置的一部分盆栽方块的图像
</gallery>

# = 14w07a =
[14w07a](14w07a.md)中加入了[铁活板门](铁活板门.md)，导致可以放置[铁活板门](铁活板门.md)盆栽。
<gallery>
File:Potted Iron Trapdoor.png
</gallery>

# 草灌木

<div style="float:right;">
[100px](File:Green Shrub (item).png.md)
[100px](File:Green Shrub.png.md)
</div>
这种方块的纹理与[枯萎的灌木](枯萎的灌木.md)相同，主要的区别是草灌木的颜色是基于生物群系着色的。

它只能在[Java版1.5](Java版1.5.md)的快照[13w10a](13w10a.md)后的存档中存在（使用[13w02a](13w02a.md)到[13w09c](13w09c.md)的版本加载含有草灌木的存档会使游戏崩溃，并且会预先显示为通常的矮草丛），并在[Java版1.8](Java版1.8.md)快照[14w10a](14w10a.md)后像许多其他未定义的方块一样纹理丢失。

在打开[Beta 1.6 Test Build 3](Java版Beta 1.6 Test Build 3.md)版本中的其中一个箱子时，可以看到草灌木，因为当时[枯萎的灌木](枯萎的灌木.md)的图像用于数据值为0的高草丛。其于[14w25a](14w25a.md)中被移除。
<gallery>
File:Badlands Green Shrub.png|[平顶山](平顶山.md)中的草灌木
File:Desert Green Shrub.png|[沙漠](沙漠.md)中的草灌木
File:Jungle Green Shrub.png|[丛林](丛林.md)中的草灌木
File:Jungle Edge Green Shrub.png|[丛林边缘](丛林边缘.md)中的草灌木
File:Forest Green Shrub.png|[森林](森林.md)中的草灌木
File:Birch Forest Green Shrub.png|[桦木森林](桦木森林.md)中的草灌木
File:Dark Forest Green Shrub.png|[黑森林](黑森林.md)中的草灌木
File:Swamp Green Shrub.png|[沼泽](沼泽.md)中的草灌木
File:Swamp Green Shrub (Cold).png|沼泽（低温区域）中的草灌木
File:Swamp Green Shrub JE1.png|沼泽（[13w36a](13w36a.md)前）中的草灌木
File:Plains Green Shrub.png|[平原](平原.md)中的草灌木
File:Ocean Green Shrub.png|[海洋](海洋.md)中的草灌木
File:Mushroom Fields Green Shrub.png|[蘑菇岛](蘑菇岛.md)中的草灌木
File:Mountains Green Shrub.png|[峭壁](峭壁.md)中的草灌木
File:Snowy Beach Green Shrub.png|[积雪沙滩](积雪沙滩.md)中的草灌木
File:Giant Tree Taiga Green Shrub.png|[巨型针叶林](巨型针叶林.md)中的草灌木
File:Taiga Green Shrub.png|[针叶林](针叶林.md)中的草灌木
File:Snowy Tundra Green Shrub.png|[冰原](冰原.md)中的草灌木
</gallery>

# 参考

# 导航

[Category:已移除的方块](Category:已移除的方块.md)

[en:Java Edition removed blocks](en:Java Edition removed blocks.md)
[ja:削除されたブロック](ja:削除されたブロック.md)
[pt:Blocos removidos da Edição Java](pt:Blocos removidos da Edição Java.md)