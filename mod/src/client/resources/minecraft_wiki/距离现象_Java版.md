# 距离现象/Java版

*页面ID: 54797* | *来源: Minecraft Wiki*

随着[玩家](玩家.md)到达[世界](世界.md)的边缘后，某些事物会故障而无法正常工作。

# 原版界限内总体现象
; 游戏内容
* 许多声音会突然停止。<ref name="audio"></ref>
* 雨和雪在Y>=261856后会被拉伸。<ref name="rain"></ref>
* Y=2,048之后，游戏每过4,096格，光照就会停止/工作一次。<ref name="MC-194878"></ref>
* Y=8,388,608以外的实体不再会受到伤害。<ref name="MC-278503"></ref>

; 世界生成
* 温度的分布在X/Z=±16,777,216以外被破坏，<ref name="snow"></ref>可以在[降雨](降雨.md)或[降雪](降雪.md)的时候在[山地](山地.md)生物群系看到明显的块状[雪](雪.md)和[冰](冰.md)生成。
* [末地](末地.md)的地形会在以世界原点为中心的若干个环形区域中缺失。<ref name="MC-159283"></ref>从宏观来看就像以[返回传送门](返回传送门.md)为中心的各个大小相同的圆环。

# = 雨和雪（垂直方向） =

影响版本：[Beta 1.6.5](Java版Beta 1.6.5.md) - 当前<ref></ref>

[缩略图](File:StretchedSnow.png.md)

雨和雪会在Y>=261856时开始部分雨雪粒子被拉伸为原来的两倍,越高越严重。

由于雨和雪在[Indev 20100218-0011](Java版Indev 20100218-0011.md) - [Alpha v1.0.3](Java版Alpha v1.0.3.md)中被移除，这使得该现象被“修复”了。

# = 声音 =

影响版本： - 当前<ref></ref>

声音会从错误的地方发出。

在X/Z=±268,435,456后变得越来越严重，许多声音会越来越听不见。

# = 温度 =

影响版本：[16w02a](16w02a.md) - 当前<ref></ref>

[缩略图](File:Precision loss snow.png.md)

温度在世界远处无法正常运作，导致产生更多的积雪和冰块。

# = 实体 =

影响版本：[1.17](1.17.md) - 当前<ref></ref>

Y=±8,388,608以外的实体不再会受到伤害。

# = 光照停止工作 =

影响版本：[1.14](Java版1.14.md) - 当前

[缩略图](File:Far darkness.png.md)

Y=2,048之后，游戏每过4,096格，光照就会停止或恢复工作一次。

# = 末地地形缺失 =
影响版本：[18w46a](18w46a.md) - 当前<ref></ref>

[缩略图](File:1.21.8 Distance Effect1.png.md)

末地的地形会在以世界原点为中心的若干个圆形区域中缺失，从宏观来看就像以[返回传送门](返回传送门.md)为中心的各个大小相同的圆环。

缺失的区域的内边界与x轴或z轴的交点的坐标满足：

X/Z=<math>\pm\lfloor\sqrt{2(2n-1)}\times{2^{15}}\rfloor\times8</math>

缺失的区域的外边界与x轴或z轴的交点的坐标满足：

X/Z=<math>\pm\lceil\sqrt{n}\times{2^{16}}\rceil\times8</math>

其中<math>n</math>为正整数。

而整个环形缺失区域满足：

<math>\begin{cases}\lceil|x|\div8\rceil^2 +\lceil|z|\div8\rceil^2\geqslant2^{31}\times(2n-1)\\ \lfloor|x|\div8\rfloor^2 +\lfloor|z|\div8\rfloor^2<2^{32}\times{n} \end{cases}</math>

其中<math>n</math>为正整数。

该现象从X/Z=±370,720至524,287开始出现，直到X和Z都为±30,000,317时在[X/Z=±30,001,056](世界界限.md)范围内发生最后一次，共发生6,549次。<ref group="注">此处在世界的一角，并在60,002,112×60,002,112的范围内计算。</ref>

在地形缺失的区域中，[调试屏幕](调试屏幕.md)NoiseRouter项目下的E、AS和N都会变为NaN。

与其他的现象不同，该现象是由于整数溢出而非精度丢失造成的。

# 历史

此历史表格按照这些现象被修复的时间排序。

# = 高坐标浮点精度误差漏洞 =

<gallery>
File:Emeralds do not lose.png|[绿宝石矿石](绿宝石矿石.md)不会被矿脉生成浮精度误差影响了
File:Void particle error 1.png|[1.5.2](Java版1.5.2.md)中的世界的一角，可以明显看到虚空粒子丢失了精度
File:Void particle error 2.png|[Beta 1.8-pre1](Java版Beta 1.8-pre1.md)中的世界一角，可以明显看到网格状的虚空粒子
File:Void particle error 3.png|Beta 1.8-pre1中的虚空，可以看到虚空粒子丢失了精度
File:Void particles in late 1.8 dev.png|[14w34b](14w34b.md)中的虚空，这是虚空粒子存在的最后一个版本，但精度问题依然没有解决
File:Far Lands torch disagreement.png|世界远处的火把与其火焰粒子没有对齐，而且位置也不一致
File:Void fog.png|在世界远处的虚空粒子以一种非常特别的形式排列
File:Redstone ore precision loss 3 axes.png|[1.12.2](Java版1.12.2.md)中在X/Z±=16,777,216外点亮的红石矿石
File:Redstone ore four square 33554432.png|在X/Z=±33,554,432之后四块点亮的红石矿石
</gallery>

# = 其他的远位置问题 =

# = 长时间浮点精度误差漏洞 =
不像严格的距离现象那样，这些浮点精度误差是因为时间值过多而引起的，与空间位置无关。

# 画廊
<gallery>
File:Snow precision normal.png|在出生点附近生成的雪的样子
File:Snow precision broken.png|在远位置处生成的雪的样子。注意正方形和线状的雪
File:Snow gen v1.png|1.8中生成在高山上的雪，这里展示了预期的样子
File:Snow gen v2.png|1.9中同一个位置生成的雪，这里展示了新的破碎生成器
File:1.21.8 Distance Effect2.png|X和Z都等于370,727处的末地地形
File:1.21.8 Distance Effect3.png|X和Z都等于29,999,999处渲染距离为32的末地，可以看到远处的一个虚空环，同时这也是[世界界限](世界界限.md)范围内的最后一个虚空环
</gallery>

# 注释

# 参考

# 外部链接
* [视频展示了Minecraft 1.0.0中存在的几种距离现象](https://www.youtube.com/watch?v=UXUV9Tae0vg)
* [视频展示了Minecraft 1.4.2中存在的几种距离现象](https://www.youtube.com/watch?v=jn5PRPWROsc)
* [视频展示了Minecraft 1.6.4中存在的几种距离现象](https://www.youtube.com/watch?v=cSGJNrT0lZc)
* [视频展示了Minecraft 1.7.2中存在的几种距离现象](https://www.youtube.com/watch?v=noVqSnU_I0Q)
* [视频展示了Minecraft 1.7.10中存在的几种距离现象](https://www.youtube.com/watch?v=YDLKZOyXGcI)

# 导航

[en:Java Edition distance effects](en:Java Edition distance effects.md)
[ja:距離効果/Java Edition](ja:距離効果/Java Edition.md)
[lzh:距離之象/爪哇版](lzh:距離之象/爪哇版.md)