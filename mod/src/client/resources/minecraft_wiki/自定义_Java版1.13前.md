# 自定义/Java版1.13前

*页面ID: 13279* | *来源: Minecraft Wiki*

[250px|缩略图|右|自定义地形的示例图](File:Land of the Ork.png.md)

* *自定义（Customized）**是一种[世界类型](世界类型.md)，使用用自定的特性取代了世界的普通地形。

# 自定内容
# =  =
一共有19项自定内容，将影响到结构的生成和其他的环境元素。

# = 矿物 =
本段11种“矿物”的设置会改变其在地图中的生成设置。这些设置可用来修改几乎所有矿石的分布。唯一的例外是[绿宝石矿石](绿宝石矿石.md)，因为绿宝石矿石只生成在峭壁生物群系里，且矿脉总是1格大。其分布已被硬编码进游戏中，不能修改。[下界](下界.md)的资源分布也不能修改。

除了上述的例外，矿脉大小、数量和分布均可修改。下面是矿物的默认设置：

;注释
<references group="注"/>

# =  =
一共有16项可被用于影响Minecraft地形生成器的自定选项。这些设定共有两页，一页使用滑动条而一页允许文字输入。在文字输入页，试图输入超过上限或下限的数值都会被自动调整到可允许的上限/下限数值。这些设置只更改陆地上山脉和峡谷的数量，结构和其他环境因素（在第1页中设置的）则不受影响。

Minecraft使用Perlin噪点来保证地形的随机性。Perlin生成器的方法比“一般”的杂点能使地形过渡更平滑，看起来更自然。

Minecraft世界生成器使用多组Perlin噪音数据集来生成地形。游戏会把3个数据集来组合为正常的丘陵：1个**主要值**、1个**最低极限**、1个**最高极限**。接着在数据集的每个对应的坐标(X,Z)中，从最低极限和最高极限间选择一个平均值对主要值的数据进行运算。**基础高度**（*深度*）决定每座标准山脉和峡谷的间隔，且该值独立于海平面高度值。<ref>https://www.reddit.com/r/Minecraft/comments/23o5cs/world_customization_preview_minecraft_18/cgyxzpn</ref>

在完成生成的世界中还不能看到默认的景象，因为每个生物群系有特定的属性。例如平原是平坦的、丘陵有低和中等的高度、峭壁是极高的山脉、海洋有海底峡谷以及恶地有低山和平坦的高原等等。每种生物群系都有一个独立的**生物群系深度**和**生物群系因子**（*生物群系比重*）来生成生物群系多变的地形。

# =  =
* *注：使用预设码编辑预设不会受到参数上下限的限制，但这样做可能导致未定义的行为。**

# 历史

|
|
|
|
|
|
|</ref><ref>"Would you really not consider holding off 1.13 until customised worlds are finished? Seems pretty crazy to set a precedent for the chance of losing features for several updates.<br>We came so close to having access to customising structures in world gen this update too, a shame that hasn't made the cut" – u/DaUltraMarine<br></ref><ref>"No customization until after 1.13, or the other things?" – u/Kobbett<br></ref>}}
|
||[Helen Zbihlyj](Helen Zbihlyj.md)称1.14不会重新加入自定义世界。}}
}}

# 你知道吗
* 这个世界类型由[Ryan Holtz](Ryan Holtz.md)在TeamMojang YouTube频道上发布视频预览，<ref></ref>原型是他在2012年制作的一个叫[*Wedge*](http://www.minecraftforum.net/topic/1077039-)的Mod。<ref></ref>
* 以下预设能生成类似于[放大化](放大化.md)世界：<ref>http://www.minecraftforum.net/forums/minecraft-discussion/recent-updates-and-snapshots/2102053-what-is-the-default-preset-for-amplified</ref>

<pre style="overflow: auto;">{"coordinateScale":684.412,"heightScale":684.412,"lowerLimitScale":512.0,"upperLimitScale":512.0,"depthNoiseScaleX":200.0,"depthNoiseScaleZ":200.0,"depthNoiseScaleExponent":0.5,"mainNoiseScaleX":80.0,"mainNoiseScaleY":160.0,"mainNoiseScaleZ":80.0,"baseSize":8.5,"stretchY":12.0,"biomeDepthWeight":2.0,"biomeDepthOffset":1.0,"biomeScaleWeight":4.0,"biomeScaleOffset":1.0,"seaLevel":63,"useCaves":true,"useDungeons":true,"dungeonChance":8,"useStrongholds":true,"useVillages":true,"useMineShafts":true,"useTemples":true,"useRavines":true,"useWaterLakes":true,"waterLakeChance":4,"useLavaLakes":true,"lavaLakeChance":80,"useLavaOceans":false,"fixedBiome":-1,"biomeSize":4,"riverSize":4,"dirtSize":33,"dirtCount":10,"dirtMinHeight":0,"dirtMaxHeight":256,"gravelSize":33,"gravelCount":8,"gravelMinHeight":0,"gravelMaxHeight":256,"graniteSize":33,"graniteCount":10,"graniteMinHeight":0,"graniteMaxHeight":80,"dioriteSize":33,"dioriteCount":10,"dioriteMinHeight":0,"dioriteMaxHeight":80,"andesiteSize":33,"andesiteCount":10,"andesiteMinHeight":0,"andesiteMaxHeight":80,"coalSize":17,"coalCount":20,"coalMinHeight":0,"coalMaxHeight":128,"ironSize":9,"ironCount":20,"ironMinHeight":0,"ironMaxHeight":64,"goldSize":9,"goldCount":2,"goldMinHeight":0,"goldMaxHeight":32,"redstoneSize":8,"redstoneCount":8,"redstoneMinHeight":0,"redstoneMaxHeight":16,"diamondSize":8,"diamondCount":1,"diamondMinHeight":0,"diamondMaxHeight":16,"lapisSize":7,"lapisCount":1,"lapisCenterHeight":16,"lapisSpread":16}</pre>

* 将“”设置的非常高可以使[边境之地](边境之地/Java版#边境之地.md)重新生成<ref>https://www.reddit.com/r/Minecraft/comments/5r348x/far_lands_generating_far_too_close_to_spawn_for/</ref>，而将""设置的非常高可以生成[天空边境之地](边境之地/Java版#天空边境之地.md)。

# 参考

# 导航

[Category:环境](Category:环境.md)
[Category:世界类型](Category:世界类型.md)

[de:Angepasst/Vor 1.13](de:Angepasst/Vor 1.13.md)
[en:Old Customized](en:Old Customized.md)
[fr:Personnalisé/Avant 1.13](fr:Personnalisé/Avant 1.13.md)
[pl:Dostosowany](pl:Dostosowany.md)
[ru:Настраиваемый (тип мира)](ru:Настраиваемый (тип мира).md)