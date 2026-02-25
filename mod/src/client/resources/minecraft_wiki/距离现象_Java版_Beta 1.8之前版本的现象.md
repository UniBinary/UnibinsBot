# 距离现象/Java版/Beta 1.8之前版本的现象

*页面ID: 54800* | *来源: Minecraft Wiki*

下面介绍了[Beta 1.8](Java版Beta 1.8.md)之前的距离现象。

# 总体现象
某些现象可能在任何距离发生，它们随着[坐标](坐标.md)的增加会逐渐恶化。

# = 抖动 =
[thumb](File:Farlandsblockmovement.gif.md)

世界在玩家周围开始渲染时会渲染出两个不同的版本，一个渲染方块本身（实体和所需方块生成数量）另一个则渲染视觉外观（比如说碰撞箱、方块像素等等）。游戏渲染引擎使用了双精度浮点数，这决定了玩家周围的世界位置。但渲染引擎会使用单精度浮点数来确定玩家移动至周围的方块所需的距离，由于单精度浮点数的精确度只有双精度浮点数的一半，导致渲染引擎没有办法从中得到足够信息去正确渲染地形，并且距离翻倍的位置上信息又会被削减一半，这就导致了移动时产生的抖动。

# = 方块渲染错误 =
[thumb](File:Up broken redstone type 2.png.md)

红石粉和梯子等方块在较远的距离处会发生明显的拉伸。每过一次，这种现象就会变得更严重。比如说在X/Z=±268,435,456上红石粉会变为一个区块大，而在X/Z=±1,073,741,824时就会变为128个方块长。

# = 方块功能错误 =
[thumb](File:Pressure plate precision loss.png.md)

在较远距离处，很多方块的功能开始出现问题，包括但不限于：

* 较远处的下落的方块可能不会自然下落，同时也可能会复制物品，导致可能会自然生成上千的物品实体。
* 较远处的压力板会在错误的位置检测踩上压力板的实体。
* * 有时压力板仅在玩家踩到精度损失点时才能检测到，而有时压力板甚至可以在玩家离开时保持状态。
* 探测铁轨无法正确检测到矿车的存在。

# = 出生点区块复制 =
[thumb](File:Farlands Trees.png.md)

在X/Z=±524,288，出生点附近的区块就会重新在此生成，并覆盖原有的地形。之后每过一次，出生点附近的区块就会被复制一次。

这类“复制区域”与出生点区块是同步的，这意味着玩家在“复制区域”做的任何事情都会被同步回出生点。

# = 世界渲染错误 =
[thumb](File:2 billion intersection.png.md)

从X/Z=±268,435,456开始，世界渲染会出现漏洞导致地形闪烁。实际上该现象在之前就已出现，但在此之后变得更为严重，且每过，就会变得越来越明显。

这个现象可能是由于浮点数误差，游戏错误定位了玩家的位置，从而错误地认为玩家看不到某些区块。

# 具体现象
此历史表格按照这些现象开始出现的时间排序。

# 水平方向极限

# 垂直方向极限

# 画廊
<gallery>
File:Xraybug.png|移动时的透视漏洞
File:Brokenhitbox.png|由于漏洞而错位的判定箱问题
File:Itembug.png|由于漏洞而悬浮的物品问题
File:Farlandswaterfall.png|被拉伸的瀑布
File:Farlandslavafall.png|被拉伸的熔岩瀑布
File:Distorted rails.png|之前的被拉伸的铁轨、动力铁轨和激活铁轨
File:Distorted rail circle.png|之前的呈环形的铁轨
File:Farlandpistonside.png|侧面放置并激活的[活塞](活塞.md)。它的活塞臂被拉伸了，但是它的判定箱还是不变的
File:Farlandpistonup.png|向上放置并激活的活塞，它的活塞臂被渲染成一整个方块
File:Stretched piston arm cross.png|X/Z±16,777,216后两个被拉伸的活塞臂摆成的V字形
File:Distant alpha redstone.png|在Alpha中X/Z±8388608后的红石。由于默认情况下呈十字形，因此需要在其旁边放上红石粉以显示此处的拉伸效果
File:Broken redstone up.png|爬上一个方块的红石
File:Up broken redstone type 1.png|爬上方块的红石在远距离处的样子
File:Up broken redstone is fixed.png|另外一个更新版本的例子
File:Giantcreepyredstone.png|巨型红石
File:Redstone 1048576 dots.png|第一个由于红石精度损失而发生的现象。最小的红石（图中最上面那个）在X/Z±1048576前，最底下那个在X/Z±1048576的后面，其余两侧的仅在一个方向上被拉伸
File:Redstone 4194304.png|放置在X/Z±4194304后的红石，错误逐渐扩大到一半方块的大小。点状红石在这里不可见，其他红石形状开始出现明显的失真
File:Redstone 8388608.png|放置在X/Z±8388608后的红石，错误扩大到一整个方块。点状红石变为一整个方块的大小，除了线状和十字形以外，其他形状都被拉伸
File:Redstone 16777216.png|放置在X/Z±16777216后的红石，错误扩大到两个方块的大小。实际上，所有放置的红石中只有四分之一在此处渲染，并且在渲染时会被伸展
File:Redstone 16777216 up.png|在这个位置上的红石行为，红石爬上了方块，底部的红石被拉伸，但是墙上的红石没有
</gallery>

# 参考

# 导航

[en:Java_Edition_hard_limits](en:Java_Edition_hard_limits.md)