# Vibrant Visuals

*页面ID: 147994* | *来源: Minecraft Wiki*

}}

</ref><ref></ref>}}

是我们开发者眼中Minecraft改进视觉效果后应有的样子。|Mojang员工<ref name="vv"></ref><ref name="je1"></ref>}}

[thumb|启用与未启用时的画面的对比](File:MCV ChaseTheSkies Announce vibrant visuals 04.jpg.md)

* ***<ref name="vv"/>是一种高级图形模式，允许游戏使用默认或第三方资源包提升画面表现。

# 介绍
允许游戏通过资源包提供如定向光源、阴影、反射和PBR<ref group="注">即“基于物理的渲染（**P**hysically **B**ased **R**endering）”。</ref>纹理等功能的支持。启用时默认使用游戏内置资源包，玩家也可以通过添加其他第三方资源包来获得不同的视觉效果。

仅影响客户端的画面表现，不影响游戏的玩法和服务端计算。<ref></ref>

# 特色功能
# = 水 =
[thumb|水面的反射效果](File:BE vibrant visuals water reflections.jpeg.md)
[thumb|水下的散射和焦散效果](File:BE vibrant visuals underwater with caustics.jpeg.md)
水面使用屏幕空间反射（SSR<ref group="注">即“**S**creen **S**pace **R**eflection”。</ref>）来反射周围的环境。水面还会反射部分光源和[云](云.md)。

阳光、月光和末地闪光照射到水下的方块和实体时其表面上会出现焦散效果。

# = PBR纹理 =
游戏通过访问PBR纹理（根据所存储的参数名称，亦称为**MERS**纹理）获取额外参数用于渲染：
* R通道存储**金属度**（**M**etalness），0为非金属、255为完全金属。
* G通道存储**自发光值**（**E**missive），0为完全不发光、255为最大发光。
* B通道存储**粗糙度**（**R**oughness），0为完全平滑、255为完全粗糙。
* A通道存储**次表面散射值**（**S**ubsurface scattering）。

金属度和次表面散射值**互斥**。游戏会使用两者中较大的值，并将较小的值视为0。如果两者大小相同，游戏会使用后者。

# == 光照反射 ==
通过PBR纹理提供的金属度和粗糙度为方块和实体（如[铁块](铁块.md)）的表面计算光照反射，使得它们对光线有不同的反射程度或效果。

# == 自发光 ==
[thumb|发光的[[溺尸](File:BE vibrant visuals drowned.jpeg.md)]]
通过PBR纹理提供的自发光值为方块、实体和粒子（如[幽匿块](幽匿块.md)和[蜘蛛](蜘蛛.md)）提供在黑暗中发光的效果，使得它们即使处于完全黑暗的环境中也能被看见。此效果不会照亮周围的环境。

# == 次表面散射 ==
通过PBR纹理提供的次表面散射值为方块和实体（如[草丛](草丛.md)）计算内部的光线散射，使得它们接近光的部分略显透明。

# = 体积雾 =
[thumb|沼泽绿色的雾气](File:BE vibrant visuals swampland.jpeg.md)
阳光、月光和末地闪光被方块遮挡时会产生[丁达尔现象](wzh:廷得耳效應.md)，分散出数道光柱。

玩家处于部分生物群系中时天空会出现不同程度和颜色的雾。比如，[沼泽](沼泽.md)中充满了蒙蒙的绿雾；[蘑菇岛](蘑菇岛.md)的整体环境都轻微发紫；在[苍白之园](苍白之园.md)中时，天空会完全被浓雾覆盖住，光线也会减弱。

# = 定向光源和阴影 =
[thumb|末地闪光的效果](File:BE_vibrant_visuals_end_flash.jpeg.md)
阳光、月光和[末地闪光](末地闪光.md)会产生阴影，阴影的方向会随光源的位置而变化。与大多数现有着色器中的阴影不同，使用默认资源包时阴影会与方块的像素对齐。光线穿过建筑中的玻璃和部分透明方块时会更明显。

光线和阴影只影响视觉效果，不影响[光照等级](光照等级.md)的计算。

阳光和月光不会照亮光照等级为0的位置。<ref></ref>

在[末地](末地.md)维度中，天空会不时在某个地方出现紫色的闪光，它会用紫色的光照亮末地并产生阴影，且发出独特的音效。设置中的“隐藏天空闪光”选项可用于控制是否显示末地闪光。

在[下界](下界.md)维度中，红色的光照亮了基岩层上方，但天空是完全黑暗的，也不会产生阴影。

[thumb|启用点光源与未启用点光源画面的对比（上：未启用点光源 下：启用点光源）](File:Vibrant_Visuals_point_lights_comparison.png.md)
若在[实验性玩法](实验性玩法.md)中启用了“”并在“”中启用了“点光源”和“点光源阴影”，则部分其他光源发出的光也会产生阴影，一些光源还会发出彩色的光。如果启用了“体积雾”，它们的光也会产生[](wzh:廷得耳效應.md)。

; 点光源方块及颜色

# = 泛光 =
物品和方块发出的光会轻微向外扩散，使它们在视觉效果上显得更亮。

# = 色调 =
游戏画面的整体颜色会根据玩家所在的生物群系的温度和特征而轻微改变。在温度较高的生物群系中偏暖，在温度较低的生物群系中偏冷。

# 使用方式
在部分[支持的设备](#设备支持.md)上为默认图形模式。

在主菜单将设置中的“”切换为“”即可使用。
* 若在设置中启用了“”选项，则也可以在世界中切换。

的部分视觉效果可以在视频设置中调整，另一部分视觉效果需要使用资源包调整。

因为光线追踪资源包所需资源是资源包的一部分，其也可以用于激活。

无法在[分屏游戏](分屏.md)时使用。若在使用时进入分屏游戏，游戏会自动将切换回“”或“”。<ref></ref>

只有部分来自[市场](市场.md)的世界和纹理包可以与一同使用；而[行为包](行为包.md)、[皮肤](皮肤.md)和角色物件不受影响。类似地，只有清单文件中指定“pbr”的纹理包才可以与同时使用。

是客户端功能，因此在多人游戏中，玩家只能为自己启用。

服务端可通过中的属性控制是否禁止客户端使用。除Mob Maze以外的所有[精选服务器](精选服务器.md)均禁止客户端使用。

# 画面选项
切换“图形模式”至后，设置中的“亮度”设置会被锁定，“|呈現距離}}”会更名为“|延遲渲染距離}}”并减少可选择的区块数量（因设备而异），同时在下方的“”中提供以下选项，并提供“”和“”2个预设。

# 设备支持

可在以下设备上使用：<ref>https://help.minecraft.net/hc/articles/37413608357773-Learn-about-Vibrant-Visuals-Graphics-Mode</ref>

目前不支持在ChromeOS、Amazon Kindle Fire、Nintendo Switch和Nintendo Switch 2上使用。

# 音效

# 视频

# 历史
。}}
|
|但未加载第三方资源包时使用。}}
|重新启用了局部曝光。
|加入了“”画面选项，但没有在options.txt中加入对应的值，且会在重启游戏后被重置为“中”。<ref name="MCPE-219587"></ref>}}
|图形模式和内置资源包不再属于[实验性玩法](实验性玩法.md)。
|现在在支持的设备上会默认启用。
|提高了水下能见度，以与未开启时的画面保持一致。
|在Xbox平台上，末地的环境不再闪烁，而是保持蓝色常亮。其他平台的末地光照则是完全损坏的。<ref></ref>
|更新了[一些MERS纹理](基岩版1.21.90.20#常规_2.md)。}}
|
|相关文件从移动至。
|现在部分Android设备不再默认启用。
|更新了[一些MERS纹理](基岩版1.21.90.23#常规_2.md)。
|现在末地光照恢复正常，并且末地闪光再次可见。
|改进了在水下仰视时的[斯涅尔窗](wikipedia:Snell's window.md)效果。}}
|切换的功能。
|将gamma_calibration的最高值由3下降至1.5。}}
|的Android设备加入了启用前的提示。
|为末地闪光加入了音效。由于一个漏洞，该音效在玩家离开末地后仍会播放。<ref></ref>
|现在在不同生物群系、维度或天气时会正确应用天空效果。
|现在画面色调会根据玩家所处生物群系的温度或特征轻微改变。
|重新校准了所有MERS纹理中的自发光值。
|增强了自发光纹理的光晕效果，现在物品的掉落物形式或在玩家手中时也有光晕效果了。
|改善了夜视状态下的效果，此前仅会提高画面gamma值。<ref></ref>
|降低了水下焦散效果的强度和速度。
|在中添加了，其值为，用于禁用客户端使用，但由于被注释而不生效。}}
|</ref>
|修改了部分生物群系的体积雾效果。
|暂时回退了1.21.90.26中随天气变化的天空效果。
|将末地天空的颜色由黑色更改为暗紫色。
|现在屏幕边缘的方块和实体能够被反射。<ref></ref>}}
|。}}
|
|</ref>
|现在“”不再会在重启游戏后被重置为“中”。<ref name="MCPE-219587"/>
|现在焦散效果可以作用在第一人称玩家的手臂或手持物品上。
|现在使用[望远镜](望远镜.md)和[着火](着火.md)时的屏幕遮罩受“调整亮度”影响。}}
|
|
|设置中的“隐藏天空闪光”选项控制。}}
|”。
|为伽马值校准屏幕加入了“重置为默认值”按钮。
|现在伽马值校准屏幕中的滑块会显示当前的伽马值，滑块的中间对应默认伽马值。}}
|
}}

# 你知道吗
* 并非作为一个独立功能，而是作为Minecraft的一部分加入游戏，且会在之后的游戏更新中持续获得改进。<ref></ref>
* 据[Jasper Boerstra](Jasper Boerstra.md)所说，没有添加动态光源功能是为了平衡开启了和未开启的玩家之间的游戏体验。<ref></ref>
* 尽管目前仅支持部分设备，但[Mojang](Mojang.md)称可能会在未来添加对更多设备的支持。<ref></ref>
* * Mojang还宣称在Java版正式上线时，会尽可能支持所有能够运行Java版的平台和设备。<ref></ref>
* * 官方称正在开发Java版的，但不会与基岩版完全一致。
* ** 为此，官方计划在2026年夏季更换现有的Java版渲染API为Vulkan。
* 据Vibrant Vanguard Discord服务器上的问答环节所说，Java版将不会支持彩色光源功能。<ref></ref>
* 在[1.21.90.26](基岩版1.21.90.26.md)后，使用时游戏主菜单的全景图也会随之改变。
* Minecraft.net上的短篇故事系列*[Overworld Adventures](:en:Overworld Adventures.md)*均使用了启用时的插图。

# 画廊
# = 游戏截图 =
<gallery>
BE vibrant visuals player exploring a cave.jpeg|一名玩家在探索洞穴
BE vibrant visuals monument.jpeg|一座海底神殿，拍摄时关闭了体积雾以提高水下能见度
BE vibrant visuals nighttime rain with fog.jpeg|夜晚下雨时远处出现的雾
BE vibrant visuals inside of bastion remnant.jpeg|堡垒遗迹的宝藏室
BE vibrant visuals inside of end ship.jpeg|末地船的宝藏室，拍摄时启用了点光源阴影
BE vibrant visuals colored light sourse.png|所有会发出彩色光的火把，从左到右依次为绿色火把、灵魂火把、蓝色火把、紫色火把、红色火把和红石火把
</gallery>

# = 体积雾 =
<gallery>
BE vibrant visuals underwater.jpeg|阳光在水下散射的效果
BE vibrant visuals swampland.jpeg|沼泽绿色的雾气
BE vibrant visuals mushroom island.jpeg|蘑菇岛紫色的天空
BE vibrant visuals pale garden.jpeg|进入苍白之园后出现的雾
</gallery>

# = 色调 =
<gallery>
BE vibrant visuals desert.jpeg|[沙漠](沙漠.md)的色调
BE vibrant visuals warmish biome.jpeg|热带生物群系的色调
BE vibrant visuals temperate biome.jpeg|温带生物群系的色调
BE vibrant visuals cold biome.jpeg|寒冷生物群系的色调
BE vibrant visuals ice spikes.jpeg|[冰刺之地](冰刺之地.md)的色调
</gallery>

# = 提示 =

# = 开发截图 =
<gallery>
Zuri's vibrant boat ride.jpg|日落时分，[Zuri](Zuri.md)在丛林生物群系的海岸上
Vibrant forest.jpg|森林生物群系
Mountain vibrant comparison.jpg|与默认画面的对比，拍摄于樱花树林
Dark vibrant comparison.jpg|与默认画面的对比，拍摄于[林地府邸](林地府邸.md)外
Cold vibrant comparison.jpg|与默认画面的对比，拍摄于冻洋
Vibrant juxtaposition.jpg|一个沙漠村庄
Vibrant jungle cruise.jpg|一艘铜船驶过丛林河流
Vibrant iceberg.jpg|日落时的冰冻海洋
Vibrant canyon lake.jpg|恶地生物群系中的湖泊
Vibrant meadow.jpg|日出时的平原生物群系，背景是一座山
Vibrant village.jpg|日出时位于平原生物群系中的[村庄](村庄.md)
</gallery>

# 外部链接
* [官方页面](https://www.minecraft.net/vibrant-visuals-update)

# 注释

# 参考

# 导航

[de:Vibrant Visuals](de:Vibrant Visuals.md)
[en:Vibrant Visuals](en:Vibrant Visuals.md)
[es:Visuales vibrantes](es:Visuales vibrantes.md)
[fr:Graphismes éclatants](fr:Graphismes éclatants.md)
[ja:バイブラントビジュアルズ](ja:バイブラントビジュアルズ.md)
[lzh:Vibrant Visuals](lzh:Vibrant Visuals.md)
[pt:Visuais Vibrantes](pt:Visuais Vibrantes.md)
[ru:Vibrant Visuals](ru:Vibrant Visuals.md)
[uk:Vibrant Visuals](uk:Vibrant Visuals.md)