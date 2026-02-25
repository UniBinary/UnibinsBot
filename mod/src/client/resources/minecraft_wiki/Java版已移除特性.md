# Java版已移除特性

*页面ID: 14247* | *来源: Minecraft Wiki*

从[Java版](Java版.md)开发至今，有一些特性已经从游戏中移除。这些特性可能被新特性取代，或者开发人员已决定其今后不会加入游戏。

# 方块

# = 方块特性 =
; [发射器](发射器.md)
在[14w07a](14w07a.md)中，若发射器内有命令方块，其被激活后可以放置一个[命令方块](命令方块.md)。为了解决一些漏洞，这个特性于[Java版1.8.6](Java版1.8.6.md)被移除。<ref></ref><ref></ref>

; [方块更新](方块更新.md)
在[22w11a](22w11a.md)前，方块更新时，会递归触发周围方块的更新逻辑。如果使用包含大量处于BUD状态的[动力铁轨](动力铁轨.md)的特殊装置引发大量更新，递归调用会导致栈溢出，但因为程序在抛出异常后被上层代码捕获，游戏得以继续运行。但由于异常抛出后的代码被放弃执行，所以可以抑制后续方块更新，社区将这种装置称为“[更新抑制器](tutorial:更新抑制.md)”，可用于生成浮空植物、无框下界门等结构，甚至可用于复制方块。

[22w11a](22w11a.md)中改用特殊的Java类来人工模拟栈结构，多余的更新会被放弃执行，完全修复栈溢出错误。

; [水](水.md)
在[16w20a](16w20a.md)中，水在被给予[随机刻](随机刻.md)时会在岩浆块上蒸发。在[18w07a](18w07a.md)中，该效果被[气泡柱](气泡柱.md)替代。

; [红石电路](红石电路.md)加载区块
在[Java版1.14](Java版1.14.md)以前，[区块](区块.md)会因延伸至相邻区块的[红石粉](红石粉.md)或[铁轨](铁轨.md)激活，或因[漏斗](漏斗.md)向相邻区块输出物品而被加载。这使得玩家可以通过特定红石装置远程加载任意区块。在此版本中，新增的区块加载标签能让游戏识别区块是否被加载。

# 物品

# = 物品特性 =
; [物品格式](物品格式.md)
一次物品格式的改动最早在[Java版1.8](Java版1.8.md)的[14w07a](14w07a.md)快照中被部分实装，但在某版本发布前又被还原了。<ref></ref>

# 生物
# = Indev MD3格式生物 =

* *拉娜**、**野兽小子**、**黑史蒂夫**和**史蒂夫**是[Indev](Java版Indev.md)时期中用于测试的游戏原始人类生物<ref></ref>，它们的作者是前Minecraft美工[Hayden Scott-Baron](Hayden Scott-Baron.md)。自Scott-Baron在2010年初离开开发团队后，它们就从游戏中被移除了。尽管MD3文件中包含这些生物的移动动画，它们在游戏中却仅呈现出相同的静态滑行动作，并使用相同的生物ID（）。拉娜死后不会掉落任何物品，野兽小子、黑史蒂夫和史蒂夫分别会掉落0-2根[羽毛](羽毛.md)、0-2个[火药](火药.md)或0-2根[线](线.md)。拉娜生命值为，野兽小子、黑史蒂夫、史蒂夫的生命值为。

# = 人类 =

人类是使用默认皮肤的生物。在[Classic](Java版Classic.md)中，可以通过按键来生成人类。它不使用普通玩家的攻击动画，只会像[僵尸](僵尸.md)一样跑向玩家。其他情况下，人类只会毫无目的地漫游并且不停地无规则绕圈、晃动手臂和头且偶尔跳跃。它们不能移动或破坏方块，也不会被流体所影响。即使在文件中替换玩家的[皮肤](皮肤.md)纹理，也不会改变人类的皮肤。

在庆祝Minecraft十周年的[网页版](Java版Classic 0.0.23a 01（重制）.md)中能够生成人类生物。

# = 临时嘎枝 =
临时嘎枝是实体ID为<code>creaking_transient</code>的一种敌对生物，仅在[24w40a](24w40a.md)到[24w45a](24w45a.md)的版本中短暂存在。

临时嘎枝相当于现今版本中与[嘎枝之心](嘎枝之心.md)绑定的[嘎枝](嘎枝.md)，具有与之类似的行为，如不会受到虚空和之外的伤害，不能被[命名牌](命名牌.md)命名。

[24w46a](24w46a.md)中重新实现了嘎枝，临时嘎枝与持久化嘎枝合并为同一种实体，ID为<code>creaking</code>。

# = 生物特性 =
; [苦力怕](苦力怕.md)
* 在生存测试中，苦力怕会对玩家造成近战伤害，死亡后才会爆炸。在[Java版Indev 0.31](Java版Indev 0.31.md)中,苦力怕不再进行近战攻击。
* 在[Java版1.8](Java版1.8.md)中，生物会主动远离将要爆炸的[苦力怕](苦力怕.md)。由于漏洞，这个特性在[Java版1.8.1-pre1](Java版1.8.1-pre1.md)中被移除。

; [僵尸](僵尸.md)和[僵尸猪人](僵尸猪人.md)
* 在[Java版Beta 1.8](Java版Beta 1.8.md)前，僵尸死后掉落[羽毛](羽毛.md)，在此版本之后改为[腐肉](腐肉.md)；僵尸猪人死后掉落[熟猪排](熟猪排.md)，在此版本后改为[腐肉](腐肉.md)和[金粒](金粒.md)。

; 玩家
* 从[pre-Classic](Java版pre-Classic.md)到[Alpha v1.0.9](Java版Alpha v1.0.9.md)，[玩家](玩家.md)与[人类](人类.md)的行走动画与现在的不同：玩家与人类在行走时会挥舞他们的手臂。
* 在[Java版1.6.1](Java版1.6.1.md)之前，玩家会在死亡时保持站立，略微向上跳跃后消失。在[Java版1.6.1](Java版1.6.1.md)中，死亡动画变更为玩家倒下后消失。
* 在[Java版Beta 1.8](Java版Beta 1.8.md)前，名称为Notch的玩家死亡后会掉落一个苹果。

; 其他
* 在生存测试中，[生物](生物.md)（[猪](猪.md)、[绵羊](绵羊.md)、[骷髅](骷髅.md)、[僵尸](僵尸.md)、[蜘蛛](蜘蛛.md)和[苦力怕](苦力怕.md)）有不同的行走动画。

# = 生物生成 =
* [20w19a](20w19a.md)前，生物生成不受[凋灵玫瑰](凋灵玫瑰.md)影响，任何生物可以在其他条件满足时生成在凋灵玫瑰中。20w19a后，任何生物无法在凋灵玫瑰中生成。[20w21a](20w21a.md)后，[凋灵骷髅](凋灵骷髅.md)又可以生成在凋灵玫瑰中。

# 非生物实体
# = 非生物实体特性 =
; [矿车](矿车.md)
* [14w11a](14w11a.md)提高了矿车的速度，但因为有玩家反馈矿车速度太快会冲出轨道，所以在[14w17a](14w17a.md)中将矿车速度调回了原速。

; [掉落物](掉落物.md)
* 在[生存测试](生存测试.md)中，掉落物各个面纹理相同，并且各个面的纹理大小接近于方块，看起来像是通过裁剪而成。

; 占位掉落物

* [生存测试](生存测试.md)加入的[掉落物](掉落物.md)可通过破坏下列方块得到：

* 在[Indev](Java版Indev.md)版本中这些掉落物随着对应的物品加入而被修改了。

; [喷溅药水](喷溅药水.md)和[滞留药水](滞留药水.md)
* 于[1.21.5](Java版1.21.5.md)的快照[25w04a](25w04a.md)拆分为两个独立实体。此前它们的实体类型均为。

# 游戏内容
# = 配方 =

# = 药水效果 =
在[Java版1.20.5](Java版1.20.5.md)的快照[24w09a](24w09a.md)中，用于[不可合成的药水](不可合成的药水.md)的[药水效果](药水效果.md)<code>minecraft:empty</code>被移除，因为当药水组件<code>potion_contents</code>为空时会默认使用不可合成的药水效果。

# = 快捷栏 =
在[Java版1.3.1](Java版1.3.1.md)之前，玩家在新建并进入一个[创造模式](创造模式.md)的世界后总是会拥有一个填满了物品（包括橡树树苗、砖块、橡木木板、云杉木板、圆石与泥土）的快捷栏。

在[Alpha v1.0.17](Java版Alpha v1.0.17.md)版本中，玩家首次进入世界时会被给予64个栅栏，然后此特性很快在[Alpha v1.0.17_01](Java版Alpha v1.0.17_01.md)版本中被移除。

# = 玩家数据 =
[缩略图|右|250px|已被移除的玩家数据](File:RemovedPlayerStats.png.md)
[缩略图|Indev 0.31（2010年1月25日）里的玩家数据](File:Indev stats reupload.png.md)

在早期的Indev版本中，玩家可以打开物品栏查看三种数据：“ATK（攻击值）”、“DEF（防御值）”和“SPD（速度值）”。这些数据值只存在了很短的时间，当后来有玩家询问时，[Notch](Notch.md)表示他不清楚为什么这些数据值会被短暂地加入游戏，他认为这只是“模糊的计划”中的占位符。<ref></ref>

# = 第一人称视图的视角中心偏移 =
由于性能原因，这个特性在[Java版1.14.4](Java版1.14.4.md)中被移除。

# = 虚空迷雾 =

[缩略图|[[Java版Beta 1.8](File:VoidFogBeta1 8.png.md)中的虚空迷雾]]

[缩略图|玩家的最大视野会随深度的增加而减少](File:VoidFog.png.md)

[缩略图|更直观的动图](File:Voidfog.gif.md)

从[Beta 1.8](Java版Beta 1.8.md)开始，黑色的虚空迷雾在玩家低于Y=17之后出现并开始变浓。当玩家越向下，迷雾的边缘就愈加靠近玩家，直到玩家到达最大深度，此时能见度减少到仅有几个方块，类似[失明](失明.md)效果。在Y=16及以下的区域也会出现深灰色的虚空粒子直至到达虚空。

虚空迷雾和虚空粒子在[Java版1.8](Java版1.8.md)的预览版快照[14w34c](14w34c.md)中被移除，主要原因是为了提高性能。<ref></ref>同时<code>depthsuspend</code>粒子也从虚空中移除，但仍存在于游戏中，直到快照[17w47a](17w47a.md)——它在此快照中作为[扁平化](扁平化.md)的一部分被移除。

# = 旧潮涌核心粒子效果 =

[缩略图|旧潮涌核心粒子效果](File:Old Conduit Particles.png.md)

[Java版1.13](Java版1.13.md)快照[18w15a](18w15a.md)加入了[潮涌核心](潮涌核心.md)及其粒子效果，但这一粒子效果在下一个快照[18w16a](18w16a.md)被移除。截至[基岩版1.21.1](基岩版1.21.1.md)，这些粒子贴图仍然存在于基岩版的<samp>particles.png</samp>中。

# 命令格式

;
* 在[Java版Classic 0.0.16a_01](Java版Classic 0.0.16a_01.md)中被替代。

;
* 移除于[Java版Indev 0.31](Java版Indev 0.31.md)。

;
* 移除于[Java版Indev 0.31](Java版Indev 0.31.md)。

;
* 移除于[Java版Alpha v1.2.0](Java版Alpha v1.2.0.md)。

;
* 移除于[Java版Alpha v1.2.5](Java版Alpha v1.2.5.md)。

;
* 移除于[Java版Indev 0.31](Java版Indev 0.31.md)。而在[Java版1.7.2](Java版1.7.2.md)的快照[13w43a](13w43a.md)中，与其具有相同功能的命令被加入。

;
* 在[Java版1.12](Java版1.12.md)中由于[成就](成就/Java版.md)被[进度](进度.md)取代而被取代。

;
* 在[Java版1.13](Java版1.13.md)的快照[17w45a](17w45a.md)中被整合入。

; 、和
* 在[Java版1.13](Java版1.13.md)的快照[17w45a](17w45a.md)中，、和被完全取代。

;
* 移除于17w45a。

; 和
* 在[Java版1.13](Java版1.13.md)中，（于[17w47a](17w47a.md)）和（于[17w45b](17w45b.md)）被完全取代。

;
* 在[Java版1.17](Java版1.17.md)的快照[20w46a](20w46a.md)中被移除，其功能由命令继承并拓展。

;
* 在[Java版1.19](Java版1.19.md)的快照[22w18a](22w18a.md)中被移除，其功能由子命令继承。

;
* 在[Java版1.19](Java版1.19.md)的快照[22w19a](22w19a.md)中被移除，其功能由子命令继承。

# = 定位新村庄 =
曾经有命令存在于[水域更新](水域更新.md)及旧的村庄结构被移除前的[村庄与掠夺](村庄与掠夺.md)更新的快照阶段。这些“旧”村庄结构从游戏结构的生成列表中一经移除，这条命令就被代替了，因为这个ID不再被需要。

# = 物品NBT格式 =

在[Java版1.20.5](Java版1.20.5.md)的快照[24w09a](24w09a.md)中，旧有的物品NBT格式被[物品堆叠组件](物品堆叠组件.md)取代。但在[24w09a](24w09a.md)-[24w11a](24w11a.md)中，物品NBT格式（<code>{…}</code>）仍然存在，其字段被储存于<code>custom_data</code>组件中。在[24w12a](24w12a.md)中，<code>{…}</code>被彻底移除。

在[24w09a](24w09a.md)之前的版本中按下启用[高级提示框](提示框.md)，会在物品提示框中显示NBT标签数量而非组件数量。

# 世界生成
# = 结构 =
# == 红砖块金字塔 ==

为了进行测试，在[Infdev](Java版Infdev.md)阶段中短暂的一段时间里（[Inf-20100227-1414](Java版Infdev 20100227-1414.md)到[Inf-20100325-1640](Java版Infdev 20100325-1640.md)），加入了红砖块金字塔，它们会生成在世界的特定位置且无视世界[种子](种子.md)。并且它们只能生成在地面。这些位置总是相同的，并且只在正X，正Z象限中生成。正X，正Z象限中每1024×1024格就会生成一个金字塔。这会导致世界上生成976,562,500个金字塔，直到[X/Z=32,000,000](世界界限.md)之后便不会生成（[Inf-20100227](Java版Infdev 20100227-1433.md)的世界会生成1,073,741,824个金字塔，直到[边境之地](边境之地/Java版/Infdev 20100325-1640及之前版本的现象.md)）。这些金字塔是完全实心的，内部没有房间，并且底部有一层泥土和石头。

# == Indev房子 ==

在[Indev](Java版Indev.md)中，当世界被创建后，玩家会生成在一座**Indev房子（Indev House）**中。

Indev房子是一种由7×4×7的[苔石](苔石.md)方块构成的结构，有一个1×2的出口允许玩家进出，室内有两个[火把](火把.md)。Indev房子被加入时，是由[苔石](苔石.md)和[箱子](箱子.md)构成的（当时苔石无法自然生成在世界上的其他地方）。箱子里装满了[TNT](TNT.md)和每种类型的方块和物品各一组（当时一组物品是99个）。当Indev的开发从测试[方块](方块.md)和[物品](物品.md)过渡到测试生存方面时，箱子就被移除了。后来，房子的设计再次被更改，更改后的Indev房子由[石头](石头.md)构成，墙壁和屋顶则是由[木板](木板.md)构成。

# == 黑曜石墙 ==

[黑曜石](黑曜石.md)墙是在Infdev版本中被用于测试目的，并标记主方向的位置。它是在略高于海平面高度的方块上面生成的两道位于原点相交且无限延伸的黑曜石墙壁。其仅存在于[Java版Infdev 20100227-1414](Java版Infdev 20100227-1414.md)和[Java版Infdev 20100227-1433](Java版Infdev 20100227-1433.md)两个版本中。

# == 旧版村庄 ==
、、、
| canspawn = 否
}}

旧版[村庄](村庄.md)可以生成在[平原](平原.md)、[沙漠](沙漠.md)、[热带草原](热带草原.md)和[针叶林](针叶林.md)生物群系中。这种类型的村庄中所有建筑的风格都是由村庄的水井所在的[生物群系](生物群系/1.18前.md)决定的。不同生物群系中所有村庄建筑的风格基本相同。

在[Java版1.10](Java版1.10.md)前，热带草原和草原村庄使用同一样式的建筑；村庄的道路使用[沙砾](沙砾.md)铺成，沙砾下方铺有[圆石](圆石.md)，在此版本之后被改为[草径](草径.md)。但是草径只会取代[草方块](草方块.md)，原先的沙砾路并没有被移除。

[村庄与掠夺](村庄与掠夺.md)更新后，[拼图方块](拼图方块.md)的出现打破了旧的结构生成方式。<ref></ref>

# == 玻璃柱 ==

| canspawn = 否
}}
* *玻璃柱（Glass Pillar）**是一种由[玻璃](玻璃.md)构成的测试[结构](结构.md)，会自然生成在要塞主入口和传送门房间处，其会从要塞一直延伸到高度上限。

玻璃柱在[Java版Beta 1.9-pre3](Java版Beta 1.9-pre3.md)被加入游戏，用于定位[要塞](要塞.md)，而其在[Java版Beta 1.9-pre4](Java版Beta 1.9-pre4.md)被移除，其定位要塞的功能被[末影之眼](末影之眼.md)取代。

# = 地物 =
# == 占位符性质的树 ==

一些新树种在最初加入时，还没有相应的[原木](原木.md)和[树叶](树叶.md)方块，而暂时使用了其他树种的原木和树叶方块。例如：在最初加入金合欢树时，它们的树干是[丛林原木](丛林原木.md)，树叶是[橡树树叶](橡树树叶.md)。

<gallery>
File:Jungle-Acacia tree.png|一棵有着丛林木和橡树树叶的金合欢树
File:Spruce Oak Tree.png|一棵有着云杉木和橡树树叶的深色橡树
</gallery>

# == 湖泊和大型湖泊 ==
* *湖泊（Water lake）**是一种小型水体，能够在地表或洞穴中生成。在寒冷的[生物群系](生物群系#气候列表.md)中，湖泊在下雪后会结冰。湖泊生成时，上方会伴有一个小的口袋形气室，这可能会导致在湖上方出现浮空的[沙子](沙子.md)、[雪层](雪层.md)等，甚至还会导致树的上部分悬浮在湖上。

水会在Y=63以下的地表生成，它所覆盖的地面可以演变为**大型湖泊（Large lake）**。大型湖泊的湖底会生成一些由[沙子](沙子.md)和[黏土](黏土.md)组成的[圆盘](圆盘.md)，但不像[河流](河流.md)一样会出现[海草](海草.md)。在海岸旁生成的大型湖泊还可能会被转换为小海湾。

湖泊和大型湖泊在[21w40a](21w40a.md)中被移除，因为它们已被[含水层](含水层.md)取代。

<gallery widths="200px">
File:PlainsLake.png|[平原](平原.md)生物群系中的一个湖泊
File:ColdTaigaLake.png|[冷针叶林](冷针叶林.md)生物群系中的一个湖泊，部分已结冰
File:Large lake.png|[繁花森林](繁花森林.md)中的大型湖泊
File:Large and small lakes.png|一个临近普通湖泊的大型湖泊
File:Large lake meets river.png|大型湖泊与河流交汇
</gallery>

# == Infdev大树 ==
在[Infdev 20100413-1951](Java版Infdev 20100413-1951.md)中加入了Infdev大树作为新地形生成器的[树木](树木.md)替代品，采用了[Paul Spooner](Paul Spooner.md)的代码。随着Infdev大树的加入，树苗也可以长成Infdev大树。在地形生成器的又一次更新后，Infdev大树被如今的[橡树](树木.md)取而代之。
[缩略图|300px|一个生成了Infdev大树的Infdev世界](File:Infdev 20100415 in-game.png.md)

# = 地形 =
# == 边境之地 ==

[缩略图|Infdev 20100227-1433中边境之地的石墙结构](File:FarlandsCliffs.jpg.md)
[缩略图|边境之角（上）、边境之墙（左、右）和正常世界（下）](File:Farlandscornerflying.png.md)

边境之地指的是[Beta 1.8](Java版Beta 1.8.md)之前版本中出现在“无限”地图的“边缘”地带的一种奇怪地形。

在Infdev 20100227-1433中，边境之地为生成在X/Z=±33,554,432以外的实心石头墙。

在Infdev 20100327之后，边境之地于X/Z=12,550,821处开始生成，一般有两种类型：边境之墙和边境之角，都有着十分奇怪的地形。

在[Alpha v1.2.0](Java版Alpha v1.2.0.md)之后，第二组边境之地开始从X/Z=1,004,065,600开始生成，它完全覆盖了已有的第一组边境之地，并比后者拥有更细长且更呈线条型的地形。前者非常平坦的地形与几乎只有洞穴的第一组边境之地形成了对比。

边境之地最终在Beta 1.8中被移除。

# ==  独石柱 ==
* *独石柱（Monolith）**是一种因噪声生成器的错误而生成的地形。其常在平坦的地形周围生成，这种特殊地形直接上升到了高度限制，一般由矿石、石头与泥土组成。其下面是完全中空的，除了生成海平面一层的水和在底部的一层基岩。这种错误发生在[Infdev](Java版Infdev.md)的后期版本，并在[万圣节更新](万圣节更新.md)中被修复。

若在[旧版自定义世界](自定义/Java版1.13前.md)中将生物群系规模设置成负值，便可以在从[1.8](Java版1.8.md)的快照[14w17a](14w17a.md)到[1.13](Java版1.13.md)的快照[18w05a](18w05a.md)中生成这种地形。由于1.13的快照[18w06a](18w06a.md)完全移除了“自定义”世界类型，故不再能通过此法生成独石柱。[1.16](Java版1.16.md)到[1.17.1](Java版1.17.1.md)则可通过将[自定义](自定义.md)世界的生物群系规模设为负数而生成独石柱。

独石柱理论上可以无限地向外生成，即直到[天空边境之地](边境之地/Java版#天空边境之地.md)。

<gallery>
File:Monolith small.png|一个小型独石柱
File:Monolith twin.png|两个大型独石柱
File:Monolith hole.png|结构内的一段常规地形，留下疤痕
File:Monolith cavernL.png|海滩的一个区域暴露在洞穴里
File:Monolith cavernR.png|同一个地方不同方向
File:Monolith insidecave.png|洞穴内景
File:Monolith inverse.png|上述同一段“正常地形”，对浸水的洞穴产生影响
File:Map2-day original.png|有许多独石柱的地图的等轴透视渲染（共12个独石柱）
</gallery>

# == 裂隙 ==

裂隙是一种从地表向下延伸的地形，类似于[峡谷](峡谷.md)，但比峡谷更窄更直。其最多可以深达90个方块，直通[深板岩](深板岩.md)层。

快照[21w08a](21w08a.md)中加入了裂隙，为玩家提供了直达地下深处的通道。但在[21w15a](21w15a.md)中由于技术等问题，[21w06a](21w06a.md)至[21w14a](21w14a.md)关于世界生成机制的新内容和更改（包括裂隙）都被回退，并单独整合到[洞穴与山崖预览数据包](洞穴与山崖预览数据包.md)中。这些内容在[1.18](Java版1.18.md)中被重新添加到默认世界，然而因为[噪声洞穴](噪声洞穴.md)的功能已经可以完全替代裂隙，便没再把裂隙重新加入游戏。<ref></ref>
[缩略图|300px|裂隙的透视图](File:Xray view of crack carvers.png.md)

# 地图设置
# = 自定义云、天空、雾 =

在[Indev](Java版Indev.md)的[.mclevel](Indev世界格式.md)文件中可以自定义天空，雾的颜色及云的颜色和高度，但是此功能在[Infdev](Java版Infdev.md)中被移除。在如今的[自定义世界](自定义世界.md)中，该功能尚未重新加入。

# = 等轴截图 =
在[Indev](Java版Indev.md)版本中，你可以按下获得一张地图的等轴透视截图。

当游戏生成一张等轴截图的时候，它将保存所有生物的当前位置。从日出时太阳所处的位置能够看到世界全景。如果玩家在截图前没有切换至第三人称视角，那么截图中玩家将不可见。

等轴截图会保存在你的用户文件夹内，文件名为"mc_map_####.png"，####所代表的数字范围为0000至9999。

由于一个漏洞，截图只能捕捉到在玩家渲染距离内的方块，其他方块将显示为黑色，或显示其他在地下而不在渲染距离内的方块。

<gallery>
File:Isometric screenshot bug.png|这是一个例子，展示了没有被玩家视野捕捉到的区块的渲染错误的截图
File:Isometric screenshot.png|一个等轴截图的例子
File:Mc map 2333-G.png|一个等轴截图的例子，部分方块看起来被严重切分
</gallery>

# = Indev世界选项 =

[缩略图|Indev创建新的世界屏幕中的四个选项](File:Indev map settings.png.md)

在Indev版本的[创建新的世界](创建新的世界.md)屏幕中，共有四个按钮可控制世界的类型、形状、大小和主题，从上至下分别对应着世界类型、世界形状、世界大小和世界主题。

总共有四种世界类型：
* 岛屿：世界为一座岛屿，其上通常会有较小的山丘，世界周围是一片水或熔岩。
* 浮岛：世界为许多大大小小的浮岛，浮空的沙砾和沙子随处可见，而水比较罕见。
* 平坦：世界为一座平地，类似于超平坦世界，同时会生成一些树和花朵。
* 内陆/原始：世界整体类似于岛屿世界类型，会生成一些丘陵，同时世界被基岩和草方块包围。

总共有三种世界形状和世界大小：

总共有四种世界主题：

* 普通：世界会正常昼夜更替，太阳亮度足够，草方块随处可见。
* 地狱：世界中的草方块会大量被替代为泥土，天空为血红色，白天亮度显著减少从而使怪物随处生成，蘑菇会大量在地表生成，作物生长缓慢，同时世界中所有水都会被熔岩替代。
* 天堂：世界会有着更大的沙滩，不同种类的花也会在地表大量生成，作物生长较快，天空颜色较淡，云层较高，时间也会维持在正午。
* 树林：世界中树木会大量生成，天空颜色较暗且亮度较低，蘑菇也较常见。

这些内容均在[Java版Infdev 20100227-1414](Java版Infdev 20100227-1414.md)中被移除，并在[Java版Infdev 20100327](Java版Infdev 20100327.md)在创建新的世界屏幕移除了对应的四个选项。其部分功能最终被[Java版Alpha v1.2.0](Java版Alpha v1.2.0.md)引入的[生物群系](生物群系.md)和[Java版1.1](Java版1.1.md)加入的[世界类型](世界类型.md)替代。

# = 冬天模式 =

[缩略图|右|冬天模式的地图](File:Snowscene.png.md)

* *冬天模式（Winter Mode）**是一种世界类型，于[Java版Alpha v1.0.4](Java版Alpha v1.0.4.md)被加入至游戏。与普通世界相比，冬天模式的世界会永远处于[降雪](降雪.md)状态，多数外露的水都会被冻成[冰](冰.md)，这使得[甘蔗](甘蔗.md)变得十分罕见。除此之外，被动型生物的生成也会有所降低。

世界被创建时会有25%的概率处于冬天模式，可以通过更改中的<code>SnowCovered</code>来控制世界是否处于冬天模式。

冬天模式最终在[Alpha v1.2.0](Java版Alpha v1.2.0.md)被正式的生物群系所取代。

# = Beta 1.8前的生物群系 =

[Beta 1.8](Java版Beta 1.8.md)对生物群系进行了一次大改，移除、更改了许多生物群系。在这些改变之前，仅有的13个生物群系更小，区别也更少。

# = 1.18前的生物群系 =

[Java版1.18](Java版1.18.md)使得地形高度不再与生物群系本身相关，因而移除了以下重复和未使用的生物群系：

# = 自定义世界类型 =

* *自定义世界**曾经是一种可以控制许多影响地形生成的设置的[世界类型](世界类型.md)，可以调整例如矿物、海平面、生物群系、结构和许多控制地形的随机形状的变量。它在[Java版1.8](Java版1.8.md)的快照[14w17a](14w17a.md)中引入，在[Java版1.13](Java版1.13.md)的快照[18w06a](18w06a.md)被移除。

新的[自定义](自定义.md)功能于[Java版1.16](Java版1.16.md)的快照[20w21a](20w21a.md)重新引入，并在[Java版1.16.2](Java版1.16.2.md)的快照[20w28a](20w28a.md)中进一步完善。不过，其与旧版自定义世界有很大不同。新的自定义功能在[23w05a](23w05a.md)被移除。

# 用户界面
# = 游玩过程中显示的版本数字 =
[缩略图|在Beta 1.6 Test Build 3里显示的版本数字](File:Numerical Display.png.md)
[缩略图|独家全文显示，仅在Beta 1.3 PC Gamer Demo中显示](File:Exclusive All Text Display.png.md)
自[Classic 0.0.9a](Java版Classic 0.0.9a.md)开始，会有文字显示在屏幕的左上角，以告诉玩家目前游玩的版本。此特性一直到快照[Java版1.0.0-rc2](Java版1.0.0-rc2.md)才被移除。在[Beta 1.6.4](Java版Beta 1.6.4.md)和[Beta 1.7.3](Java版Beta 1.7.3.md)之间的版本不会有这个文字。从0.0.9a至[Indev 0.31 20100205-1558](Java版Indev 0.31 20100205-1558.md)只会显示版本数字，但在[Indev 20100206-2034](Java版Indev 20100206-2034.md)之后，会在版本数字之前显示“Minecraft”。在Alpha开发阶段，文字写着Minecraft Alpha v#.#.#(_#)；在Beta开发阶段，文字写着Minecraft Beta #.#(_#)。此功能仅被部分移除，因为现在可以在玩游戏时通过按来显示版本数字（版本数字是[调试屏幕](调试屏幕.md)的一部分）。

# = 未经许可的副本信息 =
[缩略图|Beta 1.7.3里的信息](File:Unlicenced Copy.png.md)
在Minecraft的开发的Beta阶段，一个信息写着“Minecraft Beta #.#.# (_0#) Unlicensed Copy :( (Or logged in from another location) Purchase at [minecraft.net](minecraft.net.md)”。这串字符只在[Beta 1.6 Test Build 3](Java版Beta 1.6 Test Build 3.md)和[Beta 1.7.3](Java版Beta 1.7.3.md)之间的版本中显示，在[Beta 1.8](Java版Beta 1.8.md)中删除了信息的字节码。

# = 闪烁标语 =
当一个[闪烁标语](闪烁标语.md)被移除时，其在splashes.txt所占用的行会被删除，意味着后面的标语的行号都会减1。

# == 主标语 ==

# == 特殊的闪烁标语 ==

# = 超级秘密设置 =
* *超级秘密设置（Super Secret Settings）**于[Java版1.7.2](Java版1.7.2.md)快照[13w38a](13w38a.md)加入，并在[Java版1.9](Java版1.9.md)快照[15w31a](15w31a.md)中因内部代码重写而被移除。这是一个位于[设置](设置.md)里的按钮，按下后会发出一个随机的、音调很低的声音，并会激活[着色器](着色器/Java版1.9前.md)。

# = 本地Twitch.tv集成 =
“本地Twitch.tv集成”于[Java版1.7.4](Java版1.7.4.md)快照[13w47a](13w47a.md)加入，并在[Java版1.9](Java版1.9.md)快照[15w31a](15w31a.md)中被移除。因为Twitch聊天已经在游戏中集成。

# = Realms界面上的“Player Activity”按钮 =
[Realms](Realms.md)界面上的“Player Activity”按钮于[Java版1.5](Java版1.5.md)加入，用来展示在线玩家的活动。此按钮在[Java版1.14.4](Java版1.14.4.md)中被移除。

# = 3D效果 =
[150px|缩略图|1.13之前的3D效果按键](File:3D Anaglyph pre-17w43a.png.md)
[150px|缩略图|Notch博文中的3D效果图像](File:Notch3D.jpg.md)

3D效果是一个在视频设置中的选项，它会启用红蓝立体效果，使得佩戴红蓝3D眼镜时可以在游戏中感受到更大的深度。在[Java版1.13](Java版1.13.md)快照[17w43a](17w43a.md)中，视频设置内的3D效果设置被移除了。

# 声音

# = 方块声音 =

# = 生物声音 =

# = 玩家声音 =

# = 循环音效 =
在游戏文件中可以找到一些未被使用的循环音效，它们可能在当玩家处于一个特定类型的位置（例如[洞穴](洞穴.md)、[森林](森林.md)、[海洋](海洋.md)和瀑布旁边）时播放。这些音效只在[C418](C418.md)的2009年6月4日音效测试使用过。<ref></ref>

可以在中找到它们，共有4个未使用文件，包括鸟鸣叫声、洞穴的风声、海洋和瀑布流水声。

# = 其他音效 =
;

[File:Calm4.ogg](File:Calm4.ogg.md)

是一个和其他音乐文件并列的音乐文件，是由[Notch](Notch.md)自己创建的beta-tested文件，其时长为3:13。

它包含一个弱起拍的、像战斗一样的音调。在音乐的1:36秒时，你可以听到Notch在慢速地说着“[Mojang Specifications](Mojang Studios.md)”，在2:44秒时，左右声道会不断快速切换。这个音乐是在[Alpha 1.1.1](Java版Alpha v1.1.1.md)左右发布的，但是不知为何不在下载的游戏文件中。如果把此音乐下载下来放到文件夹中，它依然会在生存模式下播放，因为该文件夹下任何的音乐都会被播放。

随着[启动器](启动器.md)1.6.1的发布，游戏不再能读取并播放旧版本的音乐文件，因为音乐不再存储在[client.jar](client.jar.md)中，而是单独下载。

在2020年2月2日，被[Notch](Notch.md)重新上传到了他的[SoundCloud页面](https://soundcloud.com/markusalexei)中，并取名为["Magnetic Circuit"](https://soundcloud.com/markusalexei/magnetic-circuit)。

; entity.hanging.place和entity.hanging.pop
<code>entity.hanging.place</code>和<code>entity.hanging.pop</code>这两种声音效果加入于[Java版1.9](Java版1.9.md)的快照[15w49a](15w49a.md)，但在下一个快照[15w49b](15w49b.md)中就被移除了。

# 未使用的特性
这些特性只存在于技术层面上，从来没有在游戏中出现过。

# = 方块纹理 =
;
[缩略图|右|Indev中terrain.png里的椅子文件](File:Chair and table.png.md)
[Notch](Notch.md)曾数次提到加入家具和椅子（以及更多特别的椅子）的计划。<ref></ref><ref></ref><ref></ref><ref></ref>

在[Indev 20100206-2034](Java版Indev 20100206-2034.md)到[Infdev 20100627](Java版Infdev 20100627.md)的[terrain.png](terrain.png.md)里有2个可以被看作是椅子的纹理，第一个纹理通常被认为是椅子的侧视图，第二个纹理通常被认为是桌子的侧视图或椅子的正视图。

在[Infdev 20100618](Java版Infdev 20100618.md)中，椅子的纹理被修改得略微偏暗。这可能是无意的，因为与此同时terrain.png上离椅子纹理较近的[门](门.md)和[梯子](梯子.md)的纹理也被调暗了。

这些纹理的实际用途一直不明。后来它们被移除出terrain.png。
<gallery>
Chair (texture) JE1.png|椅子的侧视图的初始纹理
Chair (texture) JE2.png|椅子的侧视图调暗后的纹理
Chair or table (texture) JE1.png|可能是桌子的侧视图或椅子的正视图的纹理
File:Chair.png|Indev椅子可能的外观，由3D模型程序制作
File:Table.png|Indev桌子可能的外观，由3D模型程序制作
</gallery>

;
[100px|右](File:Oak Planks (texture) JE3 BE1.png.md)
[Indev 20100206-2034](Java版Indev 20100206-2034.md)还添加了一个重复的[橡木木板](橡木木板.md)纹理。这可能被用于上述木质家具（作为椅子的背部或座位部分，或桌子的桌面），也可能只是用于切分两种家具纹理的复制纹理。在[Infdev 20100627](Java版Infdev 20100627.md)中，这个纹理比两个可能是家具的纹理更早被移除。

;
[缩略图|右|100px](File:Paeonia texture.png.md)
[缩略图|右|150px](File:Paeonia.png.md)
* *芍药（Paeonias）**是最初计划在[Java版1.7.2](Java版1.7.2.md)中加入的一种花。最初由[Jeb](Jeb.md)在一张截图中透露<ref>https://www.instagram.com/p/dE8ljlJMLb/?taken-by=jebkhaile</ref>，这种花没有被实际加入游戏，最终被两格高的[牡丹](牡丹.md)所取代。

其纹理文件仍在[Java版1.7.2](Java版1.7.2.md)的快照[13w36a](13w36a.md)被添加进文件夹里并称为，但它在[Java版1.13](Java版1.13.md)的快照[17w47a](17w47a.md)中被移除。

有趣的是，尽管这个纹理在游戏文件中一直从未使用，但芍药纹理在[纹理更新](纹理更新.md)测试包中得到了更新。
<div style="text-align: center;">
<gallery>
File:Paeonia (texture) TU1.png|[纹理更新](纹理更新.md)后的芍药纹理
File:Paeonia First Image.png|Jeb最初在Instagram上展示的有关芍药的截图
</gallery>
</div>

;
[64px|右](File:Brick_Variations_Classic.png.md)
在[Classic](Classic.md)中加入了4种相似的红砖块纹理，它们彼此有细微的不同，暗示可能当时已经计划添加纹理的变种。

;
[64px|右](File:Doors_Infdev.png.md)在[Infdev](Infdev.md)的[terrain.png](terrain.png.md)中可以发现除了铰链和手柄外，看起来相同的两个门的纹理位于相对的两侧，但在现在的游戏中只有一个纹理被使用，而且被翻转，即铰链和手柄在另外一边。

;
[右](File:Door_Entity_Infdev.png.md)在Infdev中的item文件夹（在那个时候[告示牌](告示牌.md)、[箭](箭.md)和[矿车](矿车.md)等的纹理可以从那个文件夹中找到）你可以看见一个名为“”的文件，它有可能被[Notch](Notch.md)用于他想要添加的门的动画。

;
[|100px|右](File:Unknown 2 (texture) JE1.png.md)
[Infdev 20100629](Java版Infdev_20100629.md)时，在[terrain.png](terrain.png.md)中添加了早期珊瑚块纹理，由几个全透明的、黑色的、白色的和各种灰度的像素组成。这个纹理在[Alpha v1.0.4](Java版Alpha v1.0.4.md)中被移除了，纹理位置被覆雪的草方块的侧面纹理所取代。

;
[framless|100px|右](File:Root Vines (head texture) JE1.png.md)
[Java版1.17](Java版1.17.md)的[21w05a](21w05a.md)快照加入了名为“根藤”（Root Vines）的植物尖端纹理但未被使用，纹理类似于[洞穴藤蔓](洞穴藤蔓.md)。其存在于目录中，并于[21w16a](21w16a.md)移除。

# = 物品纹理 =
; 中的蛋糕
蛋糕的物品纹理在[Java版1.2](Java版1.2.md)中被加入，但从未使用过，在红石更新中被移除。

;

[75px|右](File:Ruby.png.md)
[缩略图|75px|右|红宝石的原始纹理](File:Ruby (pre-release).png.md)

2012年5月21日，Jeb发布了一张测试[交易](交易.md)系统的截图<ref></ref><ref>https://imgur.com/Z113y</ref>，其中交易的货币为红宝石。然而[Java版1.3.1](Java版1.3.1.md)的快照[12w21a](12w21a.md)加入的则是[绿宝石](绿宝石.md)，且游戏文件中加入了未使用的红宝石纹理。

[Dinnerbone](Dinnerbone.md)在一个论坛帖子留言说<ref></ref>，决定让绿宝石取代红宝石是因为他是一个红绿色盲，很难分清红宝石矿石和红石矿石。

红宝石的纹理曾一直被保留于游戏数据中，但最终在[Java版1.17](Java版1.17.md)的快照[21w13a](21w13a.md)被删除。

在[愚人节玩笑](愚人节玩笑.md)快照[23w13a_or_b](23w13a_or_b.md)中，红宝石又作为绿宝石纹理的替代加入游戏，但仅存在于这个版本中。

<gallery>
File:Villager trading preview.png|Jeb发布的测试交易系统的截图，使用的是红宝石
</gallery>

;
<gallery>
File:Wax Block (texture).png|蜂蜡块的纹理
File:Wax Block Render.png|使用蜂蜡块的纹理渲染为方块的外观
File:Crystallized Honey.png|结晶蜜的纹理
</gallery>
蜂蜡块和结晶蜜的纹理加入于[Java版1.15](Java版1.15.md)的快照[19w34a](19w34a.md)，但从来没有被使用过，并在[19w42a](19w42a.md)被移除。

# = 实体纹理 =
;

[100px|右](File:Pigman.png.md)
[右|100px|缩略图|[[.minecraft](File:Pigman Texture.png.md)中猪人的纹理]]

Minecraft玩家[Miclee](:en:User:Miclee-gpuser.md)提出了猪人的主意<ref></ref>，因此Notch给予其培根披风作为奖励。但当玩家要求[Notch](Notch.md)给其他用户制作类似的私人披风时，他移除了这件披风。Notch在2011年4月25日提到，他可能会加入猪人，并作为[村庄](村庄.md)的村民，<ref name=pigman></ref>虽然在[Beta 1.9](Beta 1.9.md)的预发布版里已引入了一种不同于猪人的生物——[村民](村民.md)。在[1.6.2](Java版1.6.2.md)中，猪人的纹理文件被删除。

; [生存测试](生存测试.md)中的盔甲
[右|179x179像素](File:Armor plate (Entity).png.md)
[右|220x220像素](File:Armor chainmail (Entity) Revision 1.png.md)
在从[0.24 SURVIVAL TEST](Java版Classic 0.24 SURVIVAL TEST.md)到[Indev 20100207-1703](Java版Indev 20100207-1703.md)这段时间中，游戏文件内有一个叫做的文件夹，内含两个盔甲的纹理文件，且仅有头盔和胸甲。其中一套叫做，类似锁链盔甲；另外一套叫做。这些文件在[Indev 20100212-1210](Java版Indev 20100212-1210.md)被移除并被新的盔甲替代。

; 板甲
板甲在生存测试中可被生物穿戴，但它并不会给予穿戴者任何保护。

<gallery>
File:Hypothesis.png|玩家穿上全套板甲的样子
File:Zombie helmet.png|穿戴着板甲头盔的僵尸
File:Zombie chestplate.png|穿戴着板甲胸甲的僵尸
File:Zombie full set.png|穿戴着全套板甲的僵尸
File:Skeleton helmet.png|穿戴着板甲头盔的骷髅
</gallery>

; 锁链盔甲
不像板甲，锁链盔甲在游戏中不可获取，因此它是个未使用的纹理。它后来被移除并被一个带[护腿](护腿.md)和[靴子](靴子.md)的新[模型](模型.md)替换。

; Steve村民
[right](File:Steve Villager before 1.5.png.md)
村民被加入之后，可以在纹理文件夹的文件夹里找到一个奇怪的文件（位于文件夹外面），被称为。这似乎是某种史蒂夫与村民的混合物。由于纹理包被资源包取代，此文件在[1.5](1.5.md)中被移除。
<gallery>
File:IntentionForVillageSteve.png|Steve村民可能的外观，由3D模型程序制作
File:VillageSteveWithVillagerModel.png|将纹理应用至标准[村民](村民.md)模型上的外观
</gallery>

; <samp>char.png</samp>

在[0.27 SURVIVAL TEST 10](Classic 0.27 SURVIVAL TEST 10.md)的纹理文件夹中，可以找到一个文件，Steve的头发在第二层而不是在第一层。这可能是一次失败的皮肤测试。

在[Indev](Indev.md)2010年2月12日版本的纹理文件夹中，可能是在Indev中另一次的失败的皮肤测试，Steve头部的右上角有两块黄色的像素。
<gallery>
File:Char 1.png|alt=位于第二层的Steve头发
File:Char 2.png|alt=Steve头部的黄色像素
</gallery>

; 炽足兽的鳍

[32px|缩略图|右|炽足兽的鳍](File:Strider fin.png.md)
[炽足兽](炽足兽.md)的纹理文件在最初加入时包含了未使用的鳍的纹理，在[20w15a](20w15a.md)中这个纹理被移除了。

; 旧版僵尸村民

[framless|100px|右](File:Zombie Villager.png.md)
自[12w32a](12w32a.md)快照起，僵尸村民的旧纹理仍存在于目录中但未被使用。有趣的是，尽管长时间未被使用，其在[纹理更新](纹理更新.md)中却得到了更新。

未使用的僵尸村民纹理在[Java版1.17](Java版1.17.md)中被移除。
<gallery widths="64" heights="64">
Husk noAlpha.png|alt=尸壳纹理中有隐藏旧版僵尸村民的纹理
Zombie noAlpha.png|alt=僵尸纹理中有隐藏旧版僵尸村民的纹理
</gallery>

; 美西螈的张嘴纹理

[frameless|100px|右](File:Lucy Axolotl Texture (21w17a).png.md)

自[20w51a](20w51a.md)加入美西螈起，其纹理中有未使用的、类似于张开的嘴的部分。[21w18a](21w18a.md)中，这一部分被替换为透明像素。

; 村民、卫道士、唤魔者和女巫的兜帽

[村民](村民.md)、[唤魔者](唤魔者.md)、[卫道士](卫道士.md)和[女巫](女巫.md)曾经具有未使用的兜帽（或者说假发）纹理。村民的兜帽纹理在[18w50a](18w50a.md)中随其旧纹理一起被移除，而灾厄村民和女巫未使用的兜帽则在[Java版1.18-pre5](Java版1.18-pre5.md)中被替换为透明像素。<ref></ref>

图书管理员、牧师和傻子村民在[村庄与掠夺](村庄与掠夺.md)前本就具有不同颜色的兜帽的纹理，但这时的兜帽纹理不会被渲染；村庄与掠夺后，若启用“Programmer Art”资源包，则所有村民的头上都会渲染原先傻子村民的兜帽纹理<ref></ref>，而其他村民的纹理虽在此资源包中，但未被使用。

有趣的是，尽管这些兜帽都没有加入到正式游戏中，在[官网文章《遇见唤魔者》](https://www.minecraft.net/article/meet-evoker)中，唤魔者的图片却使用了有兜帽的外观。
<gallery>
File:Witch 18w50a.png|[18w50a](18w50a.md)中女巫的兜帽
File:Villager unused hood MC-169632.png|游戏中未使用的村民的帽子
File:MEET THE EVOKER.png|官网文章“遇见唤魔者”（Meet The Evoker）中戴兜帽的唤魔者
</gallery>

; 旧版恼鬼

未使用的部分有更大的头部纹理和多余的翅膀纹理。在Java版[22w45a](22w45a.md)和[基岩版1.19.60.22](基岩版1.19.60.22.md)中随着模型和纹理更新被一并移除。
<gallery widths="64" heights="64">
Vex noAlpha.png|alt=有隐藏纹理的恼鬼纹理
Vex charging noAlpha.png|alt=隐藏纹理———“蓄力中”的恼鬼纹理
</gallery>

; 烈焰人
<gallery widths="64" heights="64">Blaze_noAlpha.png</gallery>
[烈焰人](烈焰人.md)有着隐藏的身体纹理。

; 岩浆怪
<gallery widths="64" heights="64">Magmacube_noAlpha.png</gallery>
[岩浆怪](岩浆怪.md)有着多余的一些纹理。

; 守卫者
<gallery widths="64" heights="64">
Guardian noAlpha.png|alt=有隐藏像素的守卫者纹理
Guardian beam noAlpha.png|alt=有隐藏像素的守卫者光束纹理
Guardian elder noAlpha.png|alt=有隐藏像素的远古守卫者纹理
</gallery>
在设计[守卫者](守卫者.md)时似乎用了一个模板纹理。

;
[framless|100px|右](File:Purple Arrow JE1.png.md)
[缩略图|箭和紫色的箭以彼此相应的顺序排列](File:Arrowandpurplearrow.png.md)

紫色的箭在[生存测试](生存测试.md)中由[骷髅](骷髅.md)射出，效果和一般的[箭](箭.md)一样，但这个纹理并没有被使用。

在[Java版1.9](Java版1.9.md)中加入了箭的新纹理，导致原始箭的纹理（包括紫色的箭）完全未被使用。这个原始纹理文件在[21w13a](21w13a.md)中被移除。
<gallery>
File:Purple arrow in game.jpg|在生存测试中，一只骷髅射出紫色的箭
</gallery>

; 矿车、蝙蝠、盾牌和Alex的隐藏纹理
<gallery widths="64" heights="64">
Minecart_dirt.png|矿车旧纹理
Bat noAlpha.png|蝙蝠覆盖蜘蛛的纹理
File:Shield base nopattern noAlpha.png|[盾牌](盾牌.md)的纹理覆盖了隐藏的[旗帜](旗帜.md)纹理
File:Alex all visible.png
File:Alex hidden skin.png
File:Alex hidden skin back.png
</gallery>

[矿车](矿车.md)的这个隐藏纹理会在其模型中渲染，但会被其他的纹理挡住，所以只能在旁观模式下看到。这些像素看起来像是覆盖在矿车上的布料，是首次加入[箱子矿车](箱子矿车.md)时遗留下来的特性。在[Java版1.18-pre2](Java版1.18-pre2.md)中，这些多余的像素被替换为透明像素。

在更改[蝙蝠](蝙蝠.md)的纹理前，可以看到蝙蝠未使用的脸部纹理，在翅膀下可以看到[蜘蛛](蜘蛛.md)头部的纹理。蜘蛛的纹理被用来作为蝙蝠的模板。

在[1.8](1.8.md)中，Alex被加入到了游戏中。隐藏的像素包括Alex戴眼镜的脸，可能是对[Jeb](Jeb.md)很好的参照，以及类似于史蒂夫使用的未完成的手臂纹理。

;
[缩略图|右|滑雪板的纹理](File:skis.png.md)

在游戏中还有一个未被使用的纹理—，在[骇人更新](骇人更新.md)中被加入。该纹理是被[Dinnerbone](Dinnerbone.md)作为[红鲱鱼](wzh:红鲱鱼.md)加入的。<ref></ref>该纹理在[马匹更新](马匹更新.md)中被移除。

# = 药水 =
在版本中，有30个没有任何用途的药水。所有未使用的药水均没有效果且与其他药水共用同一个纹理。这些药水在[Java版1.9](Java版1.9.md)版本快照[15w44b](15w44b.md)中被移除。

这些药水只能通过命令{{cmd|give <*玩家名*> minecraft:potion 1 <data-value> {CustomPotionEffects:[]} }}得到。对数值乘以64会得到一样的东西。数值加上16384会得到喷溅版本的药水。

注：在命令最后有一个*****的值不提供<code>{CustomPotionEffects:[]}</code>。

# = "chunkinfo"命令 =
从[Java版1.8](Java版1.8.md)（[14w30a](14w30a.md)）至[Java版1.13](Java版1.13.md)（[17w45a](17w45a.md)），文件包含了<code>/chunkinfo</code>命令的翻译字符串，而在游戏中从未存在过。字符串如下：

<pre>
commands.chunkinfo.usage=/chunkinfo [<x> <y> <z>]
commands.chunkinfo.location=Chunk location: (%s, %s, %s)
commands.chunkinfo.noChunk=No chunk found at chunk position %s, %s, %s
commands.chunkinfo.notEmpty=Chunk is not empty.
commands.chunkinfo.empty=Chunk is empty.
commands.chunkinfo.notCompiled=Chunk is not compiled.
commands.chunkinfo.compiled=Chunk is compiled.
commands.chunkinfo.hasNoRenderableLayers=Chunk has no renderable layers.
commands.chunkinfo.hasLayers=Chunk has layers: %s
commands.chunkinfo.isEmpty=Chunk has empty layers: %s
commands.chunkinfo.vertices=%s layer's buffer contains %s vertices
commands.chunkinfo.data=First 64 vertices are: %s
</pre>

目前尚不清楚Mojang是否将此命令用于开发，或者仅仅是一个被错误加入的功能。

# = 粒子效果 =
; 脚印
[缩略图|175x175px|在沙子上的脚印粒子效果](File:Particle footstep.png.md)
游戏文件中曾经引入了脚印粒子效果，但在游戏里从未使用过。在[扁平化](扁平化.md)中，该粒子在快照[17w47a](17w47a.md)中被移除，但其纹理仍然存在。之后快照[21w13a](21w13a.md)移除了脚印粒子的纹理。

脚印粒子多次在[愚人节玩笑](愚人节玩笑.md)中加入。
* 在[20w14∞](20w14∞.md)快照中，脚印作为一个物品生成在“missing”维度的箱子中。
* 在2021发布的[Minecraft Plus!](Minecraft Plus!.md)屏保中，脚印在“彩色脚印”内容中出现。在[22w13oneBlockAtATime](22w13oneBlockAtATime.md)快照中，加入了脚印粒子，会在手持物品的玩家行走时产生。
* 在[23w13a_or_b](23w13a_or_b.md)快照中加入了footprints[投票规则](投票规则.md)，每次对应提案项批准此规则内部计数器加一，直到计数器达到11时启用脚印粒子。

; Beta 1.4蓝色粒子效果
<div style="float:right;">
[100px](File:Water Flame (texture) JE1 BE1.png.md)
[100px](File:Water Lava (texture) JE1 BE1.png.md)
</div>
在[Beta 1.4](Java版Beta 1.4.md)中，有两个蓝色的粒子效果被添加到，其用途未知。它们在视觉上类似水滴，可能是早期计划添加后来在[1.0.0](Java版1.0.0.md)中添加的滴水效果，或者是对现有水花效果的改变。这些粒子纹理最终在[19w06a](19w06a.md)中被删除，因为被分成单独的不同的粒子纹理，未使用的粒子纹理则直接移除。

这些纹理也被添加到了[携带版0.1.0](携带版0.1.0.md)中，原因是该版本的与Beta 1.4的相同。截至[基岩版1.21.93](基岩版1.21.93.md)，这些粒子仍然存在于基岩版的中。

值得注意的是，这两个粒子在形状上也与现在使用的<samp>flame</samp>和<samp>lava</samp>粒子非常相似，可能暗示着计划中的联系:

; 愤怒的村民
[framless|50px|右](File:AngryVillager.png.md)

在[12w34a](12w34a.md)中，一个类似于愤怒的村民头像的纹理被添加到了中。然而，它从未被使用，很可能是被旁边的破裂纹理所取代了。这个纹理也在[19w06a](19w06a.md)中因未使用而被移除。

这个未使用的纹理在v0.12.1 alpha build 1被添加到携带版中，因为这个版本的被替换为基于Java版[12w34a](12w34a.md)中的。截至[基岩版1.21.93](基岩版1.21.93.md)，它仍然存在于基岩版的中。

# = GUI纹理 =
; 村民谈话气泡
[framless|200px|右](File:Unused villager speech bubble.png.md)

村民谈话气泡是一幅图像，它连同交易系统一起被加入到游戏中，气泡储存在jar文件里面的。气泡展示了一个交易组合，即卖给村民一个生鸡肉可以得到另一个生鸡肉。两个生鸡肉都使用了旧的纹理。在一次关于村民的访谈中，Jeb做出了一种可能的解释：“我们做了一些关于想法气泡的实验，但看起来效果并不理想。因此最后，在我于Minecraft方面领导一年后，我们决定加入一个界面作为替代。”<ref></ref>

在[Java版1.9](Java版1.9.md)后的纹理中，气泡的一部分被选择性箭头覆盖, 标志着这个纹理已经没有用途了。[Java版1.14](Java版1.14.md)以后，村民的交易UI开始使用新的纹理，但有趣的是原来的谈话气泡部分仍然存在，而且仍被部分覆盖。这部分纹理在[Java版1.20.2](Java版1.20.2.md)的首个快照[23w31a](23w31a.md)中被移除，纹理也在此时被重命名为了。

; 已选择与未选择
标有“SEL”和“UN SEL”【可能分别指“SELECTED”（已选择）和“UNSELECTED”（未选择）】的正方形可以在“”中被找到。其目的未知，有可能仅仅是标记区分已选择和未选择的创造模式物品栏标签页纹理。这部分纹理在Java版1.20.2的首个快照23w31a中被移除。

# = 未使用的白色纹理 =
[缩略图|未使用的纹理](File:Unknown 1 (texture) JE1.png.md)
在[0.0.14a_08](Java版Classic 0.0.14a_08.md)的纹理文件中可以发现一个在游戏中未被使用的白色纹理，有可能是云的纹理。它加入于0.0.14a并在0.0.15a中被移除。

# = Beta/正式版白色纹理 =
[class=drop-shadow-light|缩略图|右](File:Unknown 4 (texture) JE1.png.md)
这个白色纹理是[Beta 1.8](Java版Beta 1.8.md)预发布版中添加的四个未使用的纹理中的最后一个，与其他三个纹理并列，用途未知。在[13w02a](13w02a.md)中被移除。

这个纹理从未出现在携带版Alpha中，因为它的位置被info update2的纹理所取代。

# =  =
[128x128px|缩略图|Fluff.png](File:Fluff.png.md)
[缩略图|Infdev的云的纹理，来自fluff.png](File:Cloudsold.png.md)
在Infdev中，一个被名为“”的纹理被加入，其用于[Infdev](Java版Infdev.md)中的[云](云.md)的纹理，在[Alpha](Java版Alpha.md)的早期版本中被移除。

# = 旧的水和熔岩的纹理 =
在旧的中可以找到Alpha版本中旧的水和熔岩的纹理。在[红石更新](红石更新.md)中，这些纹理被替换为了不同的水和熔岩的动画纹理。

# = “脚印”纹理 =
[缩略图](File:Unknown 3 (texture) JE1 BE1.png.md)
在[Beta 1.8](Java版Beta 1.8.md)预发布版中，一个类似于由三个脚印组成的纹理被添加到[terrain.png](terrain.png.md)中，用途不明。由于terrain.png的废弃，该纹理最终在[13w02a](13w02a.md)中被移除。

由于携带版当时使用的是基于[Java版1.0.0](Java版1.0.0.md)的，这种纹理也被带到了携带版0.2.0版本中，然后在0.8.0版本的alpha build 2中被移除。

# = 村庄边界的纹理 =
[缩略图|村庄边界纹理](File:Village Border (Removed Features).png.md)
这两个纹理在[Beta 1.8](Java版Beta 1.8.md)的预发布版中也被添加到了[terrain.png](terrain.png.md)中，但未被使用，在[13w02a](13w02a.md)中被移除。据说这些纹理被[Mojang](Mojang.md)用来标记村庄的边界，正如在Beta1.8版的PAX demo中所看到的那样<ref>https://tcrf.net/index.php?title=Minecraft:_Java_Edition/Unused_Graphics&oldid=158074#Village_Border</ref>，但是这些纹理的实际上似乎并未被应用。

“边界”纹理在0.2.0版的alpha版本中被带到了携带版，但是“拐角”纹理却没有，因为它的位置被[info update](info update.md)纹理占用了。在v0.8.0 alpha build 2中，“边界”随着[terrain.png](terrain.png.md)的移除而一起被移除。
<gallery>
File:Village Border Edge (texture) JE1 BE1.png|“边界”
File:Village Border Corner (texture) JE1.png|“拐角”
</gallery>

# = 火的占位符纹理 =
[缩略图|100px|右|[[Java版Infdev 20100624|Infdev 20100624](File:Fire Placeholder JE1.png.md)之前的火的占位符]]
[缩略图|100px|右|[[火](File:Fire Placeholder JE2 BE1.png.md)的占位符纹理]]
在旧的[terrain.png](terrain.png.md)中可以找到火的占位符纹理，游戏在运行时会在显存中用真正的火的动态纹理来替换该占位符纹理。占位符纹理上的文字为“FIRE TEX! HNST”，也就是“我认真的，这是火的纹理！（Fire texture! Honest!）”。此占位符在[Java版1.5](Java版1.5.md)中被移除，替换成了真正的火的动画纹理。

# =  =
[右](File:waterterrain Infdev.png.md)
在Infdev中，一个类似于的文件“”能够被找到。仍不清楚这个文件是什么时候加入的，也不清楚其在什么时候被移除。它似乎是某种箭头，这可能用来测试水的动画/流向。

# = “玩教程关卡”按钮 =
“玩教程关卡”按钮在[Indev 0.31 20100131-2157](Java版Indev 0.31 20100131-2157.md)版本中被加入到主界面上，但它不能被点击，游戏内也没有教程关卡。它最终在Alpha 1.2.2版本被替换为“模组与纹理包”按钮。

# 其他
# = 控制 =
; 按生成下界传送门
在[Java版Alpha v1.2.2a](Java版Alpha v1.2.2a.md)中，玩家可以通过按来生成一个下界传送门。在随后的Alpha v1.2.2中，该操作被移除。

; 时间控制按钮和
在[Java版Beta 1.8-pre1](Java版Beta 1.8-pre1.md)中，受残存的调试代码影响，玩家可以按和来控制时间。随后的[Java版Beta 1.8-pre2](Java版Beta 1.8-pre2.md)移除了该功能。

# = 成就 =

[成就](成就/Java版.md)在从[Java版Beta 1.5](Java版Beta 1.5.md)到[Java版1.12](Java版1.12.md)（[17w13a](17w13a.md)）可用。它们最终被[进度](进度.md)取代。

# = 纹理包 =

纹理包在[Java版Alpha v1.2.2](Java版Alpha v1.2.2.md)加入，在[Java版1.6.1](Java版1.6.1.md)（[13w24a](13w24a.md)）中被移除，由[资源包](资源包.md)所取代。

# = 标签 =

# = Java版启动器的彩蛋 =

在Java版启动器版本[2.1.497x](启动器2.1.497x.md)发布之前，启动器内有数个彩蛋存在。如果玩家在“开始游戏”按钮上停留几秒钟，启动器的右下角就会出现一个随机的生物。启动器的左上角有一个半透明的苦力怕的脸，其有的概率被替换为一个耸肩的颜文字。两者被点击时都会变为纯白色，再点一下又会回到半透明状态。此外，按下会播放[经验球](经验球.md)被捡起的声音。这些彩蛋于启动器版本[2.1.497x](启动器2.1.497x.md)中被移除。

# 参考

# 导航

[Category:Minecraft](Category:Minecraft.md)

[de:Entfernte Features](de:Entfernte Features.md)
[en:Java Edition removed features](en:Java Edition removed features.md)
[es:Características eliminadas de Java Edition](es:Características eliminadas de Java Edition.md)
[ja:削除された要素/Java Edition](ja:削除された要素/Java Edition.md)
[ko:Java Edition 제거된 기능](ko:Java Edition 제거된 기능.md)
[pt:Recursos removidos da Edição Java](pt:Recursos removidos da Edição Java.md)
[ru:Удалённый контент](ru:Удалённый контент.md)
[th:รุ่น Java ฟีเจอร์ที่นำออก](th:รุ่น Java ฟีเจอร์ที่นำออก.md)
[uk:Вилучений контент (Java Edition)](uk:Вилучений контент (Java Edition).md)