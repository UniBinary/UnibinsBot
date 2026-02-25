# 边境之地/Java版

*页面ID: 54886* | *来源: Minecraft Wiki*

本文介绍[Beta 1.8](Java版Beta 1.8.md)后的边境之地。由于地形生成算法的改变，边境之地不再在“默认”世界类型中生成。

# 结构
在[1.13](Java版1.13.md)前，可以通过[自定义世界](自定义/Java版1.13前.md)来生成边境之地。

# = 边境之地 =
在自定义世界中，将设置得非常高可以生成边境之地。

# == 边境之墙 ==
[缩略图|边境之墙的起始处，注意左侧的破碎地形](File:1.12.2 Farlands16.png.md)

与[Beta 1.8之前的边境之墙](边境之地/Java版/Infdev 20100327至Beta 1.7.3的现象.md)原理一致，边境之墙会在X/Z = <math>\pm\frac{2^{63}}{\frac{k}{4}}</math>处生成（k代表），但与前者不同的是后者高达Y=256而非Y=128。

理论上其外形应与Beta 1.8之前的边境之墙一致，但由于未知原因，其外形看上去发生了较大的改变。

值得一提的是，X轴上的边境之墙似乎比Z轴上的边境之墙更完整一些。

<gallery>
File:1.12.2 Farlands7.png|另一平面比例的边境之墙
File:1.12.2 Farlands9.png|Z轴上的边境之墙开始生成处
File:1.12.2 Farlands10.png|Z轴上的边境之墙
File:1.12.2 64bit Farlands.png|边境之墙的内部
</gallery>

# == 边境之角 ==
[缩略图|边境之角](File:1.12.2 Farlands11.png.md)

两座边境之墙的交汇处即为边境之角。与边境之墙一样，边境之角高达Y=256而非Y=128。

<gallery>
File:1.12.2 Farlands8.png|边境之角
</gallery>

# = 遥远之地 =

[缩略图|遥远之地](File:1.12.2 Farlands17.png.md)

由于过高的平面缩放比例扭曲了地形细节，**遥远之地（Farther Lands）**的外形相对边境之地没有明显变化。

<gallery>
File:1.12.2 64bit Farther lands.png|遥远之地内部
File:1.12.2 64bit Corner Farther lands.png|遥远之角
</gallery>

# = 边缘之地 =

[缩略图|边缘之地](File:1.12.2 Fringe Lands.png.md)

与常规的边境之地一样，**边缘之地（Fringe Lands）**同样需要将平面比例设置得非常高才可以生成，但该值通常要更高一些。

# = 天空边境之地 =

[缩略图|天空边境之地](File:Far lands on Y.png.md)
自定义世界的“”设置缩放Y轴高度可以使天空边境之地在正常世界内生成。

<gallery>
File:1.12.2 SkyFarlands1.png|从天空边境之地上有很多沙砾落下
File:1.12.2 SkyFarlands2.png|天空边境之地的顶端
File:1.12.2 SkyFarlands3.png|在天空边境之地下方生成的村庄
File:1.12.2 SkyFarlands4.png|从下方看天空边境之地
File:1.12.2 SkyFarlands5.png|天空边境之地的鸟瞰图
</gallery>

# 历史

|
|±32,000,000之后生成，这导致边境之地被“移除”了。}}
|±12,550,821至±32,000,000的区域内生成。}}
|
|
|
|±32,000,000之后的[假区块](世界界限#假区块.md)中生成。}}
|
|
|
|
|
|
}}

# 参见

# 注释

# 导航

[Category:边境之地](Category:边境之地.md)

[en:Far Lands (Java Edition)](en:Far Lands (Java Edition).md)
[es:Tierras lejanas de Java Edition](es:Tierras lejanas de Java Edition.md)
[pt:Far Lands (Edição Java)](pt:Far Lands (Edição Java).md)