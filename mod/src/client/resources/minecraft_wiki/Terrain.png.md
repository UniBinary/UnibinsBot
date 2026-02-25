# Terrain.png

*页面ID: 54824* | *来源: Minecraft Wiki*

[thumb|在最后一个使用此文件的[[13w01b](File:201301031509 terrain.png.md)中，的纹理展示]]

是一个可在中找到的纹理图集，曾用于存储游戏内的[方块](方块.md)、[液体](液体.md)纹理、方块[挖掘](挖掘.md)动画以及部分[物品](物品.md)的纹理。该图片现已被多个以*minecraft_textures_atlas_*为前缀的.png文件取代，在高版本（如[Java版1.19.4](Java版1.19.4.md)）中，玩家可按下，随后在screenshots文件夹内找到这些替代图片。

# 格式
是一个固定尺寸为256×256像素的文件，整体被分割成多个16×16像素的区域，每个区域对应游戏内单个方块的纹理。

# 用途
在[纹理包](纹理包.md)引入前，若要修改游戏内纹理，必须对进行编辑。为确保修改后的纹理能正常生效，需将编辑后的文件放入对应版本的中。

# = 空置区域 =
[right](File:Placeholder Texture JE1 BE1.png.md)
纹理中未被使用的部分由淡紫色方块填充，这一设计与[13w16a](13w16a.md)之后采用的[无效纹理](无效纹理.md)高度相似。[画的纹理图集](画#画廊.md)同样使用了这种紫色纹理，但其他纹理图集（如和）并未采用该纹理。

这些淡紫色区域仅用于标记图集中未被占用的空间。不过正因如此，纹理中的部分空置区域曾被方块、物品及其他游戏特性无意使用。以下为该纹理被无意使用的重要案例：
* [32px](File:Placeholder Block JE1 BE1.png.md)[32px](File:Locked chest JE3.png.md)[32px](File:Locked chest (S) JE4.png.md) [上锁的箱子](上锁的箱子.md)（/）
* [32px](File:Placeholder Block JE1 BE1.png.md) 损害值为16的非零整数倍的无效数据值羊毛物品（Java版/原主机版）
* [32px](File:Placeholder Texture Wheat JE1.png.md) 生长阶段超过7的[小麦作物](小麦种子.md)（Java版）
* [32px](File:Cake (15 bites) JE1.png.md) 被食用15次的[蛋糕](蛋糕.md)（Java版）
* [32px](File:Water JE5.png.md) 在[生存测试](生存测试.md)的部分版本中出现的[水](水.md)（Java版）
* [32px](File:Placeholder Block JE1 BE1.png.md) 在部分版本中作为手持物品显示的[树叶](树叶.md)（）
* [32px](File:leaves_carried BE1.png.md) [故障叶](故障叶.md)（基岩版）

# 历史

* ：
* * 在in-20100110加入的熔岩纹理是否真的未被使用？还是曾用于流动熔岩纹理？若存在流动熔岩纹理，它是未被使用，还是仅视觉上与静止熔岩一致？甚至流动熔岩是否在该版本加入？或是在更早版本加入时，使用了玻璃顶端纹理位置的纹理作为占位纹理？
* * 类似地，火的占位纹理在6月17日的Infdev版后才加入，但火在六个多月前已添加。那么此前火是否曾有专用占位纹理位置？而该专用占位纹理是否仅在后续被移至上述位置以标记占位纹理？
* * 2010年6月7日的水/熔岩纹理映射漏洞暗示可能存在两种不同火纹理，但该时间点远早于Beta 1.2。这是否意味着存在两个占位格子？
* * 占位纹理如何出现？约在Beta 1.7.3时，有一种方法可使其显现：游戏打开后立即暂停，此时观察带动画的方块（效果与双击打开世界按钮不同）。该方法适用的版本范围是什么？其他版本是否有其他显现占位纹理的方式？测试火和齿轮的不可获得物品形式时，此漏洞或可显示它们的物品使用了哪两种纹理，也可测试着火时第一人称覆盖纹理及燃烧生物身上的覆盖纹理。
* * 不透明的Classic版水纹理何时移除？
* * 火把何时拥有顶部纹理？
* * 门何时不再使用专门的右铰链纹理？
* * 熔炉何时拥有专用顶部纹理？
* * 末影箱的粒子使用了什么纹理？
* * 通用粒子方面，例如原木在整个历史中使用了什么粒子？
* * 需明确本页面中inf-20100624的布料修改——方块数据为35的布料从淡灰色改为白色。
* * 需明确Beta 1.3的红石修改内容。
* * 需明确中继器使用的侧面纹理及影响其的UV修改细节。
* * Beta 1.7的栅栏是否有UV修改？是否应在本页面详细列出所有纯UV修改？
* * 缺失Beta 1.8的修改内容：苔石纹理，以及文件底部两个未使用的纹理。
* * 应添加的内容：
* ** 损害值为16的非零倍数的羊毛物品：在b1.2中显示为[32x32px](File:Placeholder Block JE1 BE1.png.md)，而在b1.9及以后，六个面均使用新种下的下界疣纹理。
* ** b1.7 - b1.7.2中破坏门时的粒子效果。
* ** [奇怪的活塞](:en:Weird Piston.md)相关纹理信息。
* ** 灌木相关纹理信息。
* ** 草灌木相关纹理信息。
* ** 旧物品形式：
* *** 树叶的旧物品形式纹理。
* *** 草方块的旧物品形式纹理。
* *** 草、蕨、灌木及其历史着色相关纹理。
* *** 睡莲的旧物品形式纹理。
* ** 技术性方块的物品形式：
* *** 作物的物品形式纹理。
* *** 橡木告示牌的物品形式纹理。
* *** 墙上橡木告示牌的物品形式纹理。
* *** 橡木门的物品形式纹理。
* *** 铁门的物品形式纹理。
* *** 红石线的物品形式纹理。
* *** 未充能红石中继器的物品形式纹理。
* *** 充能红石中继器的物品形式纹理。
* *** 未充能红石比较器的物品形式纹理。
* *** 充能红石比较器的物品形式纹理。
* *** 南瓜茎的物品形式纹理。
* *** 西瓜茎的物品形式纹理。
* *** 下界疣的物品形式纹理。
* *** 胡萝卜的物品形式纹理。
* *** 马铃薯的物品形式纹理。
* *** 炼药锅的物品形式纹理。
* *** 酿造台的物品形式纹理。
* *** 末地传送门的物品形式纹理。
* *** 活塞头的物品形式纹理。
* *** 移动活塞的物品形式纹理。
* *** 花盆的物品形式纹理。
* *** 头颅的物品形式纹理。
* *** 红色床的物品形式纹理。
* *** 火的物品形式纹理。
* *** 甘蔗的物品形式纹理。
* *** 可可豆的物品形式纹理。
* *** 绊线的物品形式纹理。
* * 可能值得加入的内容：
* ** 流体纹理在0.27 SURVIVAL TEST和inf-20100607中出现的映射漏洞——前者中占位纹理有部分被使用。
* ** 无限水源相关纹理信息。
* ** 无限熔岩源相关纹理信息。
* ** 无面熔炉、燃烧熔炉、南瓜、南瓜灯和投掷器的纹理信息。
* ** 旧物品形式：
* *** 冰的旧物品形式纹理。
* ** 技术性方块的物品形式：
* *** 燃烧熔炉的物品形式纹理。
* *** 点亮红石矿石的物品形式纹理。
* *** 点亮红石灯的物品形式纹理。
* *** 蛋糕的物品形式纹理。
* *** 下界传送门的物品形式纹理。
* *** 双层石质台阶的物品形式纹理。
* *** 双层木质台阶的物品形式纹理。
* *** 熄灭红石火把的物品形式纹理。
* *** 水的物品形式纹理。
* *** 熔岩的物品形式纹理。
* ：
* * 携带版历史中使用过哪些纹理？未使用的纹理何时被启用？
* ：
* * 需将PS4 1.77至PS4 1.90期间的所有版本添加至列表。
}}

|。|该版本可追溯至2009年2月，比游戏的第一个构建包早3个月，且可能意味着其在*[RubyDung](RubyDung.md)*中使用过。|[32px](File:Grass Block JE1.png.md) [32px](File:Stone JE1.png.md) 加入了[草方块](草方块.md)和[石头](石头.md)的纹理。}}
|
|
|
|
|
|
|
|，但无法找到该版本中所做出的修改，因为该版本尚未被归档。|[32px](File:Sponge JE1 BE1.png.md) [32px](File:Glass JE1.png.md) 加入了[海绵](海绵.md)和[玻璃](玻璃.md)的纹理。|[32px](File:Lava JE4.png.md) [32px](File:Water JE3.png.md) [熔岩](熔岩.md)和[水](水.md)现在使用由过程-{}-式编码生成的动态纹理。|[32px](File:Lava (placeholder texture) JE1 BE1.png.md) [32px](File:Water (placeholder texture) JE1 BE1.png.md) 此前的[熔岩](熔岩.md)和[水](水.md)的纹理被作为动态占位纹理使用。}}
|，但无法找到该版本中所做出的修改，因为该版本尚未被归档。|[32px](File:Glass JE2.png.md) 更改了[玻璃](玻璃.md)的纹理。}}
|
|
|
| [32px](File:Brick Variations Classic.png.md) 加入了未使用的[蜘蛛网](蜘蛛网.md)、[四个红砖块变种](Java版已移除特性#红砖块变种.md)和两个没有对齐的奇怪[金块](金块.md)侧面纹理。}}
|
|
||[32px](File:Water (placeholder texture) JE1 BE1.png.md) 加入了另一个旧式水/水的占位纹理，这可能是因为加入了流动[水](水.md)的纹理。|移除了未使用的红[砖块](砖块.md)变种纹理和没有对齐的奇怪金块纹理。}}
|
|}}
|
|
|
|的下一行。在其中，有六个使用了淡紫色的“占位”纹理，另外两个实际上是使用了在其他地方没有被用到的椅子及桌子的纹理。|移动了[橡树树叶](橡树树叶.md)、[铁块](铁块.md)、[金块](金块.md)和[钻石块](钻石块.md)的纹理。}}
|
|
|
|
|
|现在从16x16更改为32x32，考虑到流动的液体所使用的新图形与纹理映射需要更大的纹理才能够负担起上述纹理的旋转。|所有的液体占位纹理（静止的[水](水.md)、静止的[熔岩](熔岩.md)、流动的[水](水.md)和流动的[熔岩](熔岩.md)）被移动到了的右下角。}}
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
|。更高的解析度仍未完全支持。}}
|
|
|。|[32px](File:Cobblestone Slab JE1 BE1.png.md) [32px](File:Oak Slab JE1 BE1.png.md) [32px](File:Sandstone Slab JE1 BE1.png.md) [圆石台阶](圆石台阶.md)、木质（石化橡木）[台阶](台阶.md)和砂岩[台阶](台阶.md)分别使用[圆石](圆石.md)、[木板](木板.md)和[砂岩](砂岩.md)的纹理。|[32px](File:Seamless Stone Slab JE1.png.md) [32px](File:Smooth Stone JE1 BE1.png.md) 加入了[“无缝”石台阶](平滑石头.md)，它的双台阶变种是一个意外产物，且实际上也是平滑石头的前身。|[32px](File:Crying Obsidian Original Texture.png.md) 加入了未使用的[哭泣的黑曜石](哭泣的黑曜石.md)纹理。|[32px](File:Wheat Age 8 JE2.png.md) [32px](File:Wheat Age 9 JE3.png.md) [32px](File:Wheat Age 10 JE5.png.md) [32px](File:Wheat Age 11 JE4.png.md) [32px](File:Placeholder Texture Wheat JE1.png.md) [32px](File:Placeholder Texture Wheat JE1.png.md) [32px](File:Wheat Age 14 JE2.png.md) [32px](File:Wheat Age 15 JE2.png.md) 移除了旧的红石线纹理并加入了新的红石纹理，使用着色系统。这导致数据值为12和13的小麦现在再次使用占位纹理。}}
|
|
|
|
|
||加入了未使用的“村庄边界”纹理。|[32px](File:Cake (8 bites) JE1.png.md) [32px](File:Cake (9 bites) JE3.png.md) [32px](File:Cake (10 bites) JE3.png.md) [32px](File:Cake (11 bites) JE3.png.md) [32px](File:Cake (12 bites) JE3.png.md) [32px](File:Cake (13 bites) JE3.png.md) [32px](File:Cake (14 bites) JE3.png.md) [32px](File:Cake (15 bites) JE3.png.md) 数据值为8至15的蛋糕现在使用[红色蘑菇方块](红色蘑菇方块.md)的纹理。|[32px](File:Stem Age 8 JE1.png.md) [32px](File:Stem Age 9 JE1.png.md) [32px](File:Stem Age 10 JE1.png.md) [32px](File:Stem Age 11 JE1.png.md) [32px](File:Stem Age 12 JE1.png.md) [32px](File:Stem Age 13 JE1.png.md) [32px](File:Stem Age 14 JE1.png.md) [32px](File:Stem Age 15 JE1.png.md)|[32px](File:Attached Stem Age 8 JE1.png.md) [32px](File:Attached Stem Age 9 JE1.png.md) [32px](File:Attached Stem Age 10 JE1.png.md) [32px](File:Attached Stem Age 11 JE1.png.md) [32px](File:Attached Stem Age 12 JE1.png.md) [32px](File:Attached Stem Age 13 JE1.png.md) [32px](File:Attached Stem Age 14 JE1.png.md) [32px](File:Attached Stem Age 15 JE1.png.md) 数据值为8-15的茎使用其下方的纹理——茎使用连接的茎纹理，而连接的茎使用藤蔓的纹理。}}
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
|文件被单独的方块与物品纹理取代，从而允许高清和动态纹理的出现。现在实际上已被由程序生成的[纹理图集](纹理#纹理图集.md)替代。
|[left|128px](File:Results.png.md) 一个名为的新文件出现在了方块纹理文件夹中，包含大多数未提取的纹理（但下界传送门的占位符纹理神秘消失了）。这份文件似乎是12w42a文件的拆分版本，而不是13w01a版本。}}
|自现在起从jar文件里被移除。}}
|自现在起从jar文件里被移除。}}

|
|，基于Beta 1.3。|[32px](File:Aggies BE1.png.md) 加入了...按钮。<br>[32px](File:Fire 0 (placeholder texture) BE1.png.md) 火的占位纹理和Java版不同。}}
|
|
|
|
|
|
|
|不再使用且被移除，现在被取代。}}

|
|。}}
|。}}
|的mip映射版本图集。}}
|资源，这些资源自现在起替换了原，在TU12前一直被临时使用。}}
|
|资源现被弃用，现再次开始使用原位于res/内的资源。}}
|
|}}
|}}
|}}
|}}
|}}
|}}
|}}
|}}
|}}
|}}
|}}
|}}

|
|。|[32px](File:Initialized Nether Reactor Core PI1.png.md) 激活的下界反应核似乎拥有一个独特的纹理。}}
|，使其现在与携带版的图集一致。}}
}}

# 画廊
<gallery>
File:TerrainGuide.png|中所有纹理的指示说明
File:Unused textures arrangement in the terrain.png|中大多数在历史版本内未使用的纹理，除了所占位置重叠的纹理（比如火的占位纹理）。
</gallery>

# 参考

# 参见
* [纹理包](纹理包.md)

# 导航

[en:Terrain.png](en:Terrain.png.md)
[es:Terrain.png](es:Terrain.png.md)
[fr:Terrain.png](fr:Terrain.png.md)
[ja:Terrain.png](ja:Terrain.png.md)
[pt:Terrain.png](pt:Terrain.png.md)
[ru:Terrain.png](ru:Terrain.png.md)