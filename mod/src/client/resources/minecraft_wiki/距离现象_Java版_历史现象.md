# 距离现象/Java版/历史现象

*页面ID: 155505* | *来源: Minecraft Wiki*

下面介绍了[Java版](Java版.md)历史版本的所有距离现象。

# 方块模型
模型问题在[1.8](Java版1.8.md)中被修复，因为硬编码的方块模型被JSON文件的标准化模型所取代。

# = 火 =

影响版本：[Indev](Java版Indev.md) - [14w17a](14w17a.md)

[缩略图](File:Fire model precision loss.png.md)

在墙上的火在世界远处会发生偏移导致出现深度冲突，或者被拉伸。

# = 齿轮和梯子 =

影响版本：[Indev 20100128-2203](Java版Indev 0.31 20100128-2203.md)（齿轮）/[Infdev 20100616-1808](Java版Infdev 20100616-1808.md)（梯子） - [Infdev 20100630-1835](Java版Infdev 20100630-1835.md)（齿轮）/[Beta 1.7.3](Java版Beta 1.7.3.md)（梯子）

[缩略图](File:Stretched gear.png.md)

[缩略图](File:Distorted ladder.png.md)

由于齿轮和梯子总是会覆盖整个方块表面，因此只有当精度不再能够支持完整方块时，齿轮和梯子才会出现精度损失现象。

从X/Z=±16,777,216开始，齿轮和梯子会被拉伸成两个方块宽。此外，放置在此处相邻的齿轮和梯子中只有其中一个变得可见。

自此之后，每过，这两种现象就会变得更加严重。

由于齿轮在[Alpha v1.0.1](Java版Alpha v1.0.1.md)中被移除，这使得齿轮的该现象被“修复”了。

# = 火把和树苗 =
影响版本：[Infdev 20100313](Java版Infdev 20100313.md)

[缩略图](File:313 far items.png.md)

X/Z>±8,388,608时，火把，树苗和其他十字模型将失去精度，这会导致它们会被显示为2D的。

# = 流动的水和熔岩 =
影响版本：[Infdev 20100616-1808](Java版Infdev 20100616-1808.md) - [Beta 1.7.3](Java版Beta 1.7.3.md)

[缩略图](File:Distorted streams.png.md)

由于流体总是会覆盖整个方块表面，因此只有当精度不再能够支持完整方块时，流体才会出现精度损失现象。

从X/Z=16,777,216开始，流体的侧面会被拉伸成两格方块大小。

自此之后，每过，这种现象就会变得更加严重。

<gallery>
File:Farlandswaterfall.png|拉伸的水
File:Farlandslavafall.png|拉伸的熔岩
</gallery>

# = 铁轨、动力铁轨和探测铁轨 =
影响版本：[Infdev 20100618](Java版Infdev 20100618.md)（铁轨）/[Beta 1.5](Java版Beta 1.5.md) （动力铁轨和探测铁轨） - [Beta 1.7.3](Java版Beta 1.7.3.md)

[缩略图](File:Infdev big rail.png.md)

由于铁轨总是会覆盖整个方块表面，因此只有当精度不再能够支持完整方块时，铁轨才会出现精度损失现象。

从X/Z=±16,777,216开始，铁轨会被拉伸。每四个相邻的铁轨只有中间的一或两个变得可见。爬上方块的铁轨同样会被拉伸。这会导致铁轨的坡度变小。

自此之后，每过，这种现象就会变得更加严重。

<gallery>
File:Redstone rail model bug.png|探测铁轨和动力铁轨
File:Distorted rails.png|动力铁轨，探测铁轨和激活铁轨
File:Distorted rail circle.png|用铁轨围成的一个圈
</gallery>

# = 红石线 =
影响版本：[Alpha v1.0.1](Java版Alpha v1.0.1.md) - [14w11b](14w11b.md)，在[Beta 1.5](Java版Beta 1.5.md)、[Beta 1.8-pre1](Java版Beta 1.8-pre1.md)和[14w02a](14w02a.md)发生改变

; X/Z=±8,388,608 - 16,777,215
<gallery>
File:Distant alpha redstone.png|Alpha阶段中X/Z=±8,388,608之后的红石线
</gallery>

; X/Z=±16,777,216 - 33,554,431
<gallery>
File:Far lands redstone.png|世界远处的红石线发生了拉伸
File:Redstone 2^24 dots.png|点状红石在视觉上看起来相邻，但它们在实际上是不相交的
File:Redstone superflat 16777216.png|在[14w02a](14w02a.md)之前的一个超平坦世界，红石线在X/Z=±16,777,216之后占据了两个方块
Redstone superflat 2^24 14w02a.png|在[14w02a](14w02a.md)及之后的一个超平坦世界，红石线在X/Z=±16,777,216之后占据了两个方块
File:Broken redstone up.png|在Alpha阶段中此处爬上方块的红石线
File:Up broken redstone type 1.png|Beta 1.4_01之前的爬上方块的红石线，既发生了位置偏移又发生了视觉拉伸
File:Up broken redstone beta1.png|Beta 1.4_01之前的红石线，同样发生了拉伸和偏移
File:Up broken redstone type 2.png|从Beta 1.5 - Beta 1.7.3的爬上方块的红石线，只发生了位置偏移
File:Up broken redstone beta2.png|从Beta 1.5-Beta 1.7.3的爬上方块的红石线，同样只发生了位置偏移
File:Redstone 16777216 up.png|在Beta 1.8-pre1及之后版本中爬上方块的红石线无论如何都会正常渲染
</gallery>

; X/Z>±33,554,432
<gallery>
File:Redstone superflat 2^30 one axis.png|一个超平坦世界中在X/Z=±1,073,741,824附近的红石线
File:Redstone 2^30 dot.png|X和Z=1,073,741,824处的点状红石在视觉上有128格宽
</gallery>

# = 红石中继器 =

影响版本：[Beta 1.3](Java版Beta 1.3.md) - [Beta 1.7.3](Java版Beta 1.7.3.md)

[缩略图](File:Stretched repeater.png.md)

红石中继器在世界远处丢失精度，顶部会发生位置偏移，底部也会被扩大到几格方块宽。

# = 活塞头 =
影响版本：[Beta 1.7](Java版Beta 1.7.md) - [1.7.10](Java版1.7.10.md)

; X/Z=±16,777,216 - 33,55,44,31
<gallery>
File:Stretched piston arms.png|被拉伸并偏移的活塞头
File:Stretched piston arm cross.png|两个方向上被拉伸的活塞头
</gallery>

# = 睡莲 =
影响版本：[Beta 1.9-pre1](Java版Beta 1.9-pre1.md) - [14w08a](14w08a.md)

[缩略图](File:Lily pad model bug.png.md)

睡莲会在X/Z=±8,388,608处被拉伸，并在X/Z=±8,388,609后消失。

# = 炼药锅和漏斗 =

影响版本：[Beta 1.9-pre2](Java版Beta 1.9-pre2.md)（炼药锅）/[13w01a](13w01a.md)（漏斗） - [1.7.10](Java版1.7.10.md)

<gallery>
High distance cauldron.png|在X和Z坐标上都超过16,777,216的炼药锅，X和Z坐标都是偶数而不是4的倍数
High distance hopper.png|相同的位置的漏斗
</gallery>

# = 绊线 =

影响版本：[12w22a](12w22a.md) - [1.7.10](Java版1.7.10.md)，在[13w02a](13w02a.md)发生改变

<gallery>
File:Tripwire model bug.png|世界远处的绊线丢失精度
File:Tripwire 8388608 close up.png|X和Z=±8,388,608处2×2大小的绊线
File:Tripwire superflat 8388608.png|超平坦世界中X和Z=±8,388,608的绊线
</gallery>

# = 花盆 =

影响版本：[12w34a](12w34a.md) - [1.7.10](Java版1.7.10.md)

<gallery>
High distance cauldron.png|四个花盆在双奇坐标处，有炼药锅用于比较
High distance hopper.png|四个花盆在双奇坐标处，漏斗用于比较
</gallery>

# = 半透明方块 =

影响版本：[13w41a](13w41a.md) - [24w35a](24w35a.md)

[缩略图](File:Translucent rendering precision loss.png.md)

在世界远处，半透明方块有时会错误地阻止其后面不同纹理的半透明方块渲染。

这可能是由于精度损失，游戏错误地认为玩家看不到它们。

# 方块判定箱
# = 仙人掌和蛋糕 =

影响版本：[Alpha v1.0.11](Java版Alpha v1.0.11.md)（仙人掌）/[Beta 1.2](Java版Beta 1.2.md)（蛋糕） - [15w38a](15w38a.md)（蛋糕的判定箱）/[15w49a](15w49a.md)（轮廓箱）<ref></ref>

}
|-
|X/Z ±2,097,152（2<sup>21</sup>）~±4,194,303
|
|
|-
|X/Z ±4,194,304（2<sup>22</sup>）~±8,388,607
|
|
|-
|X/Z ±8,388,608（2<sup>23</sup>）~±16,777,215
|
|[64px](File:Cakeglitch.png.md)
|-
|X/Z ±16,777,215（2<sup>24</sup>）~±33,554,431
|在一个坐标轴到达此处，轮廓箱要么是一个平面，要么被拉伸同时占据两个不同的方块。
|[64px](File:Cake hitbox bug.png.md)
|}

<gallery>
File:Cactus hitbox bug.png|仙人掌的轮廓箱在世界远处丢失精度
File:Cactus collision precision loss.png|仙人掌的碰撞箱在世界远处丢失精度
File:Cake collision precision loss.png|蛋糕的碰撞箱在世界远处丢失精度
</gallery>

# = 栅栏、栅栏门和墙 =
影响版本：[Beta 1.9-pre2](Java版Beta 1.9-pre2.md)（栅栏）/[12w01a](12w01a.md)（栅栏门）/[12w34a](12w34a.md)（墙） - [13w06a](13w06a.md)（栅栏）/[15w38a](15w38a.md)（栅栏门）/[1.4.3](Java版1.4.3.md)（墙）

}
|-
|X/Z ±8,388,608（2<sup>23</sup>）~±16,777,215
|碰撞箱被拉伸到可以填充它们所占据的整个方块。
|}}
|-
|X/Z ±16,777,216（2<sup>24</sup>）~±33,554,431
|仅在一个坐标轴上到达该坐标，每四个相邻的栅栏、栅栏门和墙碰撞箱的情况都会有所不同：
* 4n：在负方向上的极薄的碰撞箱
* 4n+1：没有碰撞箱
* 4n+2：在负方向上的极薄的碰撞箱
* 4n+3：在正方向上的极薄的碰撞箱
|[64px](File:Fence 2^24 solidplanes.png.md)
|}

<gallery>
File:Fence collision precision loss.png|栅栏的碰撞箱在世界远处失去精度
File:Fence gate collision precision loss.png|栅栏门的碰撞箱在世界远处丢失精度
File:Wall collision precision loss.png|墙的碰撞箱在世界远处失去精度
</gallery>

# 粒子精度损失

<gallery>
File:Lava_particle_precision_loss_old.png|12w17a及之前末地传送门框架上的末影之眼发出的烟在世界远处丢失精度
Lava_particle_precision_loss_old.png|1.7.10及之前在世界远处的熔岩余烬粒子
White Explosion precision loss.png|TNT爆炸粒子在世界远处丢失精度
Water_particle_error_early.png|1.7.10及之前水下粒子在世界远处丢失精度
File:Rain particle grid.png|Infdev在世界远处丢失精度的降雨粒子
File:Rain precision loss old.png|1.7.10及以前在世界远处丢失精度的降雨粒子
</gallery>

# 渲染漏洞
# = 方块轮廓箱 =
影响版本：游戏早期开发 - [Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

<!--
# = 世界定期停止渲染 =

影响版本：游戏早期开发 - [Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

[缩略图](File:Infdev_Chunk_Detaching.jpg.md)

在世界远处世界会定期停止渲染，从而形成条纹状的地形。

-->
# = Infdev 20100227中的区块抖动 =
影响版本：[Infdev 20100227-1414](Java版Infdev 20100227-1414.md)、[Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

# = 下落的方块 =

; 位置偏移
影响版本：[14w32a](14w32a.md) - [15w47c](15w47c.md)

[缩略图](File:Falling_block_older_precision_loss.png.md)

下落的方块在世界远处被渲染在方块的一角。

; 渲染错误
影响版本：[15w49a](15w49a.md) - [19w38b](19w38b.md)<ref></ref>

[缩略图](File:Falling block precision loss.png.md)

在世界远处，[下落的方块](下落的方块.md)的渲染被破坏，导致其渲染会跟随玩家的位置和视角。

在某些GPU上，在世界远处下落的方块也有可能会被扭曲成非立方体。

<gallery>
File:Falling Block Glitch.png|下落的方块在世界远处丢失精度
</gallery>

# = 世界渲染器 =
影响版本：[Infdev 20100624](Java版Infdev 20100624.md) - [Beta 1.7.3](Java版Beta 1.7.3.md)

[缩略图](File:Brokenhitbox.png.md)

地图在玩家周围开始渲染时会渲染出两个不同的版本，一个渲染方块本身（实体和所需方块生成数量）另一个则渲染视觉外观（比如说碰撞箱、方块像素等等）。世界渲染视觉外观出现了失去精度的现象，导致了卡顿的移动发生。世界精度丢失的原因是因为游戏渲染引擎使用了双精度浮点数，这决定了玩家周围的世界位置。但渲染引擎会使用单精度浮点数来确定玩家移动至周围的方块所需的距离，由于单精度浮点数的精确度只有双精度浮点数的一半，导致渲染引擎没有办法从中得到足够信息去正确渲染地形，并且距离翻倍的位置上信息又会被削减一半。

<gallery>
Xraybug.png|移动时的透视漏洞
Itembug.png|由于漏洞而浮动的掉落物
File:2 billion intersection.png|在下界远处，周围的区块发生了渲染故障
</gallery>

# = 移动的活塞 =

影响版本：[Beta 1.7](Java版Beta 1.7.md) - [1.10.2](Java版1.10.2.md)<ref></ref>

[缩略图](File:Piston offset bug.png.md)

在世界远处，[移动的活塞](移动的活塞.md)的渲染被破坏，导致其渲染会跟随玩家的位置和视角。

# = 雨和雪 =

; 水平方向
影响版本：[Beta 1.8-pre1](Java版Beta 1.8-pre1.md) - [1.8.2-pre4](Java版1.8.2-pre4.md)<ref>虽然修复没有立即被注意到，且过去了很多个版本。</ref>

[缩略图](File:High dist rain.png.md)

雨和雪会在世界远处丢失精度，从而错误地聚集在一条线上。

; 垂直方向
影响版本： - [Indev 20100214](Java版Indev 20100214.md)、[Alpha v1.0.4](Java版Alpha v1.0.4.md) - [Alpha v1.1.2_01](Java版Alpha v1.1.2_01.md)

[缩略图](File:StretchedSnow.png.md)

雨和雪会在极端高度下被拉伸。

由于雨和雪在[Indev 20100218-0011](Java版Indev 20100218-0011.md) - [Alpha v1.0.3](Java版Alpha v1.0.3.md)中被移除，这使得该现象被“修复”了。

; Indev 0.31
<gallery>
File:Stretched rain indev.png|极端高度下被拉伸的雨
</gallery>

; Alpha
<gallery>
File:Stretched alpha snow.png|冬天模式中极端高度下被拉伸的雪
</gallery>

# = 末地传送门 =

影响版本：[Beta 1.9-pre3](Java版Beta 1.9-pre3.md) - [16w39c](16w39c.md)

[缩略图](File:Black portal block.png.md)

末地传送门方块的在世界远处渲染被破坏并发生深度冲突。

# = 13w38a实体、半透明方块和轮廓箱抖动 =

影响版本：[13w38a](13w38a.md) - [13w39b](13w39b.md)<ref>尽管修复版本不正确。</ref>

实体、实体方块、半透明方块和轮廓箱在世界远处会发生偏移和抖动。

<gallery>
File:1.7 dev painting.png|发生偏移的画
File:1.7 dev frame.png|在世界远处物品展示框发生位置偏移
</gallery>

# = 14w30a和14w30b中的区块抖动 =

影响版本：[14w30a](14w30a.md)、[14w30b](14w30b.md)<ref></ref>

[缩略图](File:Shaky terrain third person.png.md)

在某些硬件上，过远的距离会导致区块会在视觉上彼此分离并产生抖动。

# = 末地折跃门 =

影响版本：[15w31a](15w31a.md) - [15w32c](15w32c.md)

[缩略图](File:End_gateway_precision_loss.png.md)

末地折跃门方块的效果在世界远处被破坏。

# 游戏内容
# = 实体位置 =
影响版本：游戏早期开发 - [Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

实体使用单精度浮点数来计算位置，而非双精度浮点数。

# = 生物寻路 =

影响版本： - [20w22a](20w22a.md)<ref></ref>

生物寻路在世界远处被破坏，导致生物在原地转圈。

# = 打破容器产生的掉落物 =

影响版本：[Indev 0.31 20100124-2119](Java版Indev 0.31 20100124-2119.md) - [14w27b](14w27b.md)

[缩略图](File:Furnace drop precision loss.png.md)

在世界远处打破容器时，所包含的物品会掉入错误的区域。

# = Indev实体移动 =

影响版本：[Indev 0.31 20100106-2158](Java版Indev 0.31 20100106-2158.md) - [Indev 20100223](Java版Indev 20100223.md)

# = TNT =

; 被点燃
影响版本： - [1.15-pre3](Java版1.15-pre3.md)<ref></ref>

[缩略图](File:TNT offset bug.png.md)

TNT在世界远处被点燃会发生位置偏移。

; 被引爆
影响版本： - [20w22a](20w22a.md)<ref></ref>

[缩略图](File:Detonation_offset.png.md)

在世界远处TNT被引爆时会发生位置偏移。

# = 画 =

影响版本： - [1.8-pre1](Java版1.8-pre1.md)

[缩略图](File:Painting bug pre 38a.png.md)

在世界远处的[画](画.md)可能会发生位置偏移。

<gallery>
Painting precision loss.png|在世界远处，发生了位置偏移的画
</gallery>

# = Infdev 20100227方块碰撞箱丢失 =

影响版本：[Infdev 20100227-1414](Java版Infdev 20100227-1414.md)、[Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

在X/Z>±16,777,216，玩家不再能够站在方块上，从而落入虚空中的熔岩海。

# = 下落的方块 =

; 复制物品
影响版本：[Infdev 20100618](Java版Infdev 20100618.md) - [1.4.5](Java版1.4.5.md)

下落的方块在世界远处可以复制物品，导致可能会自然生成上千的物品实体。这可能会导致世界远处出现严重卡顿。

; 悬空
影响版本：[Infdev 20100618](Java版Infdev 20100618.md) - [14w31a](14w31a.md)

[缩略图](File:Physics_precision_loss.png.md)

下落的方块在世界远处可能会悬空，而一旦收到一次方块更新就可以在变回方块之前在某些帧生成一个实体。

# = 矿车及其骑乘者 =

影响版本：[Infdev 20100624](Java版Infdev 20100624.md) - [14w31a](14w31a.md)

[缩略图](File:Minecart_precision_loss.png.md)

在世界远处放置的矿车和骑乘者的位置可能会不正确。

在被拉伸的铁轨上时矿车可能会被渲染在正确的位置，但是骑乘者和影子的位置还是会发生偏移。

# = 压力板 =

影响版本：[Alpha v1.0.1](Java版Alpha v1.0.1.md) - [15w36d](15w36d.md)

[缩略图](File:Pressure_plate_precision_loss.png.md)

压力板在世界远处会在错误的位置检测到踩上压力板的实体。

有些压力板仅在玩家踩到精度损失点时才能检测到，而某些压力板甚至可以在玩家离开时仍保持状态。

# = 船 =

影响版本：[Alpha v1.0.6](Java版Alpha v1.0.6.md) - [16w03a](16w03a.md)

[缩略图](File:Boat_precision_loss.png.md)

在世界远处船会被放置在错误的位置。

# = 玩家的上床位置 =
影响版本：[Beta 1.3](Java版Beta 1.3.md) - [19w07a](19w07a.md)

# = 探测铁轨 =

影响版本：[Beta 1.5](Java版Beta 1.5.md) - [20w22a](20w22a.md)<ref></ref>

[缩略图](File:Detector_rail_precision_loss.png.md)

探测铁轨在世界远处无法正确检测到矿车的存在。

# = 方块的方向 =

影响版本： - [16w39c](16w39c.md)<ref></ref>

[缩略图](File:Placement precision loss.png.md)

活塞、命令方块和其他能朝向六个面的其中一个的方块的放置方向不再使用失去精度的玩家位置的浮点数决定。

<!--
# = 黑曜石柱上的末影水晶 =

影响版本：[Beta 1.9-pre6](Java版Beta 1.9-pre6.md) - [1.8.9](Java版1.8.9.md)<ref></ref>

[缩略图](File:18CornerEnd.png.md)

黑曜石柱生成的末地水晶在世界远处会发生位置偏移。

也许不可能在原版见到这个现象，因为在当时末地不会在世界远处生成地形。

-->
# = 附魔台上的书 =

; 错误朝向
影响版本：[Beta 1.9-pre3](Java版Beta 1.9-pre3.md) - [1.15-pre3](Java版1.15-pre3.md)<ref></ref>

[缩略图](File:Enchantment table angle precision loss.png.md)

附魔台上的书在世界远处会朝向错误的位置。

; 不会打开

影响版本：[Beta 1.9-pre3](Java版Beta 1.9-pre3.md) - [20w22a](20w22a.md)<ref></ref>

[缩略图](File:Enchantment table presence precision loss.png.md)

附魔台上的书在世界远处有时候不会自动打开。

# = 物品展示框 =

影响版本：[12w34a](12w34a.md) - [16w05b](16w05b.md)<ref>尽管修复版本不正确。</ref><ref></ref>

在[13w41a](13w41a.md)和[1.8-pre1](Java版1.8-pre1.md)中改变

[缩略图](File:Item frame position precision loss 1.7.png.md)

在世界远处的物品展示框会被放置在错误的位置。
* 在1.8-pre1之前，在世界远处的物品展示框不但会发生位置偏移，还会变得无法交互。
* 在13w41a及之后，物品展示框的偏移位置发生了改变。

<gallery>
File:Frame clipping.png|在世界远处的物品展示框偏移进了方块内部，并无法交互
</gallery>

# = 烟花火箭 =

影响版本：[12w49a](12w49a.md) - [19w02a](19w02a.md)

[缩略图](File:Firework precision loss.png.md)

在世界远处烟花火箭会被放置在错误的位置。

# = 废弃矿井中的运输矿车 =

影响版本：[13w02a](13w02a.md) - [20w22a](20w22a.md)<ref></ref>

[缩略图](File:Minecart generation precision loss.png.md)

在世界远处生成在废弃矿井里的运输矿车会发生位置偏移。

# = 拴绳结 =

影响版本：[13w16a](13w16a.md) - [16w05b](16w05b.md)

[缩略图](File:Lead position precision loss.png.md)

在世界远处拴绳结会被放置在错误的位置。

# = 世界响应缓慢 =

影响版本：[1.8](Java版1.8.md) - [1.12](Java版1.12.md)

世界会在高坐标处存在明显延迟，并响应缓慢。

# = 生物生成 =

影响版本：[1.8](Java版1.8.md) - [20w22a](20w22a.md)<ref></ref>

生物生成在世界远处被破坏。</ref>}}

# = 末影水晶 =

影响版本：[15w44a](15w44a.md) - [17w46a](17w46a.md)<ref></ref>

[缩略图](File:End crystal precision loss.png.md)

在世界远处放置末地水晶会被放置在错误的地方。

# = 幽匿感测体振动 =

影响版本：[20w49a](20w49a.md) - [22w11a](22w11a.md)

# 世界生成
# = 块状地形 =

影响版本：[Infdev 20100227-1414](Java版Infdev 20100227-1414.md)、[Infdev 20100227-1433](Java版Infdev 20100227-1433.md)<ref name="notch"/>

# = 块状矿脉 =

影响版本：[Infdev 20100325-1545](Java版Infdev 20100325-1545.md) - [20w27a](20w27a.md)<ref></ref>

[缩略图](File:Ore_gen_precision_loss.png.md)

在世界远处地下会生成更多块状的矿脉。

# = 出生点区块复制 =

影响版本： - [Beta 1.7.3](Java版Beta 1.7.3.md)

[缩略图](File:Farlands Trees.png.md)

在X/Z±=2及其整数倍时，出生点附近的区块会被复制到该区域，并覆盖原有地形。

# 长时间浮点精度误差漏洞
不像严格的距离现象，这些浮点精度误差是因为时间值过多而引起的，与空间位置无关。

# = 信标光束停止旋转 =

影响版本：<ref></ref>

[缩略图](File:Ancient beacon.png.md)

[信标](信标.md)光束旋转变得卡顿，最终因高时间值而停止旋转，且视觉效果被破坏。

# = 旗帜停止摆动 =
影响版本：[14w30a](14w30a.md) - [19w34a](19w34a.md)、[19w38a](19w38a.md) - [1.15-pre2](Java版1.15-pre2.md)<ref></ref>

[缩略图](File:Frozen banner.png.md)

[旗帜](旗帜.md)在3分至3.5分之间在风中停止摆动。

# = 守卫者激光停止渲染 =

影响版本：[19w40a](19w40a.md) - [1.19.3](Java版1.19.3.md)<ref></ref>

[缩略图](File:Guardian beam does not render.png.md)

中的超过特定值时，守卫者激光不渲染。

# = 不祥之物生成器动画受损 =

影响版本：[24w13a](24w13a.md) - [1.21.1](Java版1.21.1.md)<ref></ref>

若中的“<code>Time</code>”值超过特定的值，不祥之物生成器的动画就会受损。

# = 气泡柱中的船动画受损 =

影响版本：[24w44a](24w44a.md) - [1.21.4](Java版1.21.4.md)<ref></ref>

[缩略图](File:Boats in bubble columns breaks.png.md)

中的<code>Time</code>大于某特定值时，气泡柱中的船的动画损坏。

# = 实体动画停止 =

影响版本：[12w38a](12w38a.md) - [25w44a](25w44a.md)<ref></ref>

[缩略图](File:Certain entity animations stop.png.md)

某些实体的动画在世界中存在太长时间后停止。

# 注释

# 参考

# 导航

[en:Java Edition distance effects/Historical effects](en:Java Edition distance effects/Historical effects.md)