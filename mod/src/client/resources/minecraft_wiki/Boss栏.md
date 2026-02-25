# Boss栏

*页面ID: 101546* | *来源: Minecraft Wiki*

* *Boss栏（Bossbar）**是显示在[平视显示器](平视显示器.md)正上方的进度条指示器，表示[Boss生物](生物#Boss生物.md)的[生命](生命.md)或[袭击](袭击.md)的状态。

# 机制
多个Boss栏同时显示}}
Boss栏仅由一个进度条和其上方的名称构成。进度条显示<code>-{}-当前值/最大值</code>，根据比例显示进度条的长度，但不会直接显示具体值。

Boss栏的颜色有，样式有。

如果有多个Boss栏，Boss栏之间会垂直排列，较新出现的Boss栏会显示在最下方。

游戏界面最多只能同时显示前9个Boss栏；最多只能同时显示前3个。

# = 末影龙Boss栏 =

[末影龙](末影龙.md)有与其相关的Boss栏，其值为<code>-{}-当前生命值/最大生命值</code>，颜色为粉色<code>pink</code>，样式为<code>progress</code>。

末影龙的Boss栏会在[末地](末地.md)的(0,128,0)位置距玩家192格以内，且与末影龙的战斗进行中时显示；末影龙的Boss栏会在其距玩家125格以内时显示。

末影龙的Boss栏是由游戏的末影龙战斗系统控制的，而非末影龙实体控制的，因此只有被游戏追踪的末影龙会显示其Boss栏，同一时间只会显示至多一个末影龙Boss栏；每一个末影龙都会有各自的Boss栏，多个末影龙的Boss栏可以同时显示。

该Boss栏的名称使用末影龙的名称，如果末影龙被重命名，则Boss栏也会被重命名。

# = 凋灵Boss栏 =

[凋灵](凋灵.md)有与其相关的Boss栏，其值为<code>-{}-当前生命值/最大生命值</code>，颜色为紫色<code>purple</code>，但比的颜色更深<ref></ref>，样式为<code>progress</code>。

凋灵的Boss栏会在其距玩家水平距离76格及以内时出现，水平距离80格及以外时消失；凋灵的Boss栏会在其距玩家55格以内时显示。每一个凋灵都会有各自的Boss栏，多个凋灵的Boss栏可以同时显示。

该Boss栏的名称使用凋灵的名称，如果凋灵被重命名，则Boss栏也会被重命名。

该Boss栏在凋灵的AI被关闭时不会发生变化。<ref></ref>

# = 袭击Boss栏 =

）|class=pixel-image}}
）|class=pixel-image}}
[袭击](袭击.md)有与其相关的Boss栏，其颜色为红色<code>red</code>，样式为<code>notched_10</code>或<code>progress</code>。

每场袭击有各自的Boss栏，玩家位于袭击中心96格内时会显示距离最近的袭击的Boss栏。

袭击处于冷却时，该Boss栏显示<code>-{}-已经过冷却时间/总冷却时间</code>，其他时刻显示<code>-{}-剩余袭击者生命值总和/该波次袭击者的最大生命值总和</code>。

该Boss栏的名称还会用于显示其他的额外信息，总共有以下的显示：
* 剩余存活袭击者不超过2名时： - （x为袭击者数量）
* 袭击胜利后：
* 袭击失败后：
* 其他时刻：

# = 自定义Boss栏 =

[frame|使用自定义的Boss栏，其值为<code>1/2</code>，颜色为<code>blue</code>，样式为<code>notched_20</code>|class=pixel-image](File:Bossbar custom.png.md)

可以创建自定义的Boss栏。Boss栏的值、颜色、样式、可见性均可自由设计。

的存储子命令<code>store (result|success) bossbar</code>可以将命令结果存储至一个Boss栏的值。

# 历史

|
|
|
|</ref>
|Boss栏现在无需玩家看着生物也可以显示。<ref></ref>}}
|生成的末影龙也不再会有Boss栏。}}
|</ref>}}
|</ref>}}
|</ref>}}
|
|命令，可以用于创建自定义的Boss栏。}}
|
|
|
|
|
|
|
|
|。}}
|。}}
|。}}
|
|
|
|
|
|
|
|
}}

# 画廊
<gallery>
File:Bars.png|所有种类的Boss栏
</gallery>

# 参考

# 导航

[Category:UI](Category:UI.md)

[en:Bossbar](en:Bossbar.md)
[fr:Barre de boss](fr:Barre de boss.md)
[ja:ボスバー](ja:ボスバー.md)
[pt:Barra de chefes](pt:Barra de chefes.md)