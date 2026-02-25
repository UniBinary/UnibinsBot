# RenderDragon

*页面ID: 47690* | *来源: Minecraft Wiki*

[缩略图|在Minecraft文件中找到的RenderDragon徽标](File:Render dragon logo from minecraft earth 0.28.png.md)
* *RenderDragon**是用于[基岩版](基岩版.md)和[教育版](教育版.md)的跨平台渲染引擎，以取代老旧的HAL着色器。<ref name="Helen"></ref>
[缩略图](File:RTX.png.md)[缩略图|市场上的地图光线追踪效果封面](File:Rtx02.png.md)

# 图形API
不同的设备平台使用了不同的图形API，分别如下：
* DirectX（Windows和Xbox版本）
* OpenGL ES（Android版本）
* Metal（iOS和iPadOS版本）
* Vulkan（Nintendo Switch版本）
* GNM（PlayStation版本）

# 功能
作为视觉和性能升级的一部分，RenderDragon具有边缘高光和新的照明技术。它支持一系列图形功能，具体取决于设备的功能。

RenderDragon虽然可以提升Minecraft在部分设备上的性能，但同时也降低了Minecraft在不少设备上的性能。<ref></ref>

RenderDragon支持基于物理的渲染（PBR）管线，可用于光线追踪和延迟渲染。PBR纹理格式如下：
* R通道存储**金属度**，0为非金属、255为完全金属。
* G通道存储**自发光值**，0为完全不发光、255为最大发光。
* B通道存储**粗糙度**，0为完全平滑、255为完全粗糙。
* A通道存储**次表面散射值**（仅延迟渲染支持）。

# = 第三方着色器 =

目前RenderDragon暂未提供第三方[着色器](着色器.md)支持，亦不兼容基于HAL的着色器。但借助[BetterRenderDragon-xmake](https://github.com/dreamguxiang/BetterRenderDragon-xmake)、[MaterialBinLoader](https://github.com/ddf8196/MaterialBinLoader)或[Matject](https://github.com/faizul726/matject)可修改.bin文件来应用适用于RenderDragon的第三方着色器。

# = 光线追踪 =

</ref>
| text = 其最终版本仍然可用，但已不再会收到任何修复和改进。
| mini = 1
}}

RenderDragon支持任何兼容DXR 1.1的显卡使用光线追踪，官方声称支持光线追踪的图形设备有NVIDIA GeForce RTX系列和AMD Radeon RX 6000系列的显卡。但DXR API并不局限于这些显卡，因为已经证明RenderDragon的光线追踪可通过DXR仿真来实现。

光线追踪可在满足配置需求且装载光线追踪资源包的世界中开启。

# = 延迟渲染 =
}}

延迟渲染管线是一组实验性的图形自定义功能，创作者可在资源包中为其提供支持并自定义其效果。

目前支持的功能有：PBR纹理、、体积雾、全局照明、阴影、光华、色调映射、次表面散射、屏幕空间反射等内容。

延迟渲染管线可在符合配置需求的世界中开启，若未装载第三方PBR资源包则会使用[游戏内置资源包](Vibrant Visuals.md)。

; 配置要求
* 见

# 历史
|[Helen Zbihlyj](Helen Zbihlyj.md)在推特上发布了一张在上使用RenderDragon v0.0.2的图像。}}
|
|</ref>}}
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|完全损坏了，进入使用光线追踪模板创建的地图后也不会自动切换到光线追踪。<ref></ref>}}
|
|
|
|”（Vibrant Visuals）。}}
|切换图形模式的功能。}}
|
|
|
}}

# 你知道吗
* [Helen Zbihlyj](Helen Zbihlyj.md)声称RenderDragon起初是为[Java版](Java版.md)设计的引擎，尽管后来它没有在Java版中使用。<ref></ref>但据[Felix Jones](Felix Jones.md)所说，代码中没有任何内容可以证明这一点。<ref></ref>

# 画廊
<gallery>
File:Render Dragon v0.0.2.jpg|由Helen Zbihlyj在Twitter上发布的RenderDragon v0.0.2的图片<ref name="Helen"/>
</gallery>

# 参考

# 导航

[de:RenderDragon](de:RenderDragon.md)
[en:RenderDragon](en:RenderDragon.md)
[es:RenderDragon](es:RenderDragon.md)
[fr:RenderDragon](fr:RenderDragon.md)
[ja:RenderDragon](ja:RenderDragon.md)
[pl:RenderDragon](pl:RenderDragon.md)
[pt:RenderDragon](pt:RenderDragon.md)
[ru:Render Dragon](ru:Render Dragon.md)