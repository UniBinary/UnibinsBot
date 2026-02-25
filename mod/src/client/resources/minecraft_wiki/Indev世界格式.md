# Indev世界格式

*页面ID: 23786* | *来源: Minecraft Wiki*

* *Indev世界格式**是游戏存储Indev世界所用的格式。

# 存储格式

Indev世界使用[NBT](NBT.md)文件格式保存，其内部有下列NBT结构：

<div class="treeview">
* ：根标签。
* * ：世界相关信息。
* ** ：世界创建时的UNIX时间。
* ** ：世界名称，默认为“A Nice World”。
* ** ：创建该世界的玩家用户名。
* * ：有关世界创建环境的信息，这会根据世界生成设置变化。
* ** ：影响昼夜更替的时间刻。范围为0 - 24000。
* ** ：天空光照等级，0至15。
* ** ：天空的RGB颜色，24位。红为，绿为，蓝为。
* ** ：雾的RGB颜色，24位。红为，绿为，蓝为。
* ** ：云的RGB颜色，24位。红为，绿为，蓝为。
* ** ：云的高度（Y坐标）。
* ** ：构成世界外围地面的方块ID。该标签实际上并未被使用，因为游戏总是会将其值视为2。
* ** ：世界外围地面的高度。
* ** ：构成世界外围液体的方块ID。如果该值不为8或9，其会错误地显示为[熔岩](熔岩.md)的纹理。
* ** ：世界外围液体的高度。
* * ：世界数据。
* ** ：世界宽度。
* ** ：世界长度。
* ** ：世界高度。
* ** ：3个TAG_Shorts的列表，用于X、Y和Z的出生坐标。
* ** ：字节方块ID。（8位）
* ** ：字节方块数据（4位）和光照值（接下来4位）。
* * ：TAG_Compounds列表，用于世界中的实体。
* **  一个实体。玩家拥有自己的实体，如下例所示。
* *** ：实体ID。玩家则为“LocalPlayer”。
* *** ：3个TAG_Floats的列表，用于玩家的X、Y和Z位置。
* *** ：2个TAG_Floats的列表，用于玩家视角的偏航和俯仰。
* *** ：3个TAG_Floats的列表，用于X、Y和Z的运动，以米每刻为单位。
* *** ：玩家下落的距离。
* *** ：玩家拥有的生命值。20为10颗心。
* *** ：玩家免受攻击的刻数。
* *** ：玩家被攻击后红色的刻数。
* *** ：玩家死亡的刻数 — 用于控制死亡动画。
* *** ：玩家开始溺水之前的刻数。从300开始。
* *** ：当为负数时，玩家将被点燃之前的刻数。当为正数时，火扑灭前的刻数。
* *** ：玩家的得分。该分数从未在Alpha或甚至beta中使用，因此该值无关紧要。
* *** ：TAG_Compounds的列表，表示玩家背包中的物品。
* ****  一叠物品。
* ***** ：物品所在的槽。
* ***** ：物品[ID](Java版数据值#ID.md).
* ***** ：物品的数据值，或工具的损伤值。
* ***** ：叠中此物品的编号。范围-128到127。小于2的值不会在游戏中显示。
* * ：TAG_Compounds的列表，用于地图中的实体附加值。
* **  实体附加值。
* *** ：实体附加值ID。在本例中为“箱子（Chest）”。
* *** ：实体附加值的位置，稍后解释。
* *** ：TAG_Compounds的列表，表示箱子中的物品。
* ****  一叠物品。
* ***** ：物品所在的槽。
* ***** ：物品的数据值，或工具的损伤值。
* ***** ：物品的数据值，或工具的损伤值。
* ***** ：叠中此物品的编号。范围-128到127。小于2的值不会在游戏中显示。
</div>
计算实体附加值的“Pos”标记：

 pos = x + (y << 10) + (z << 20)

从“Pos”标记计算X、Y和Z：

 x = pos % 1024

 y = (pos >> 10) % 1024

 z = (pos >> 20) % 1024

# 方块
方块字节数组用于定义占用地图的方块类型。可以通过乘以地图的维度来计算数组中的字节数。Y是向上方向而不是Z.对于Hex值，请参见[方块ID](Java版数据值#方块.md)。

要从XYZ坐标访问方块或数据数组中的特定方块，请使用以下公式：

 array index = (y * height + z) * width + x;

# 数据
数据字节数组用于光照和额外的方块数据。

有关方块元数据的扩展信息，请参阅[Java版数据值](Java版数据值/Indev.md)。

# 光照
[File:Lighting values.png](File:Lighting values.png.md)

对于方块有16个级别的光照，范围从0x0（0，无光）到0xF（15，全光）。

# 历史

|
|
|
|
}}

# 导航

[Category:开发](Category:开发.md)

[de:Spielstand-Speicherung/Indev Level Format](de:Spielstand-Speicherung/Indev Level Format.md)
[en:Java Edition Indev level format](en:Java Edition Indev level format.md)
[fr:Format de niveau de l'édition Java Indev](fr:Format de niveau de l'édition Java Indev.md)
[ja:Levelフォーマット/Java Edition Indev](ja:Levelフォーマット/Java Edition Indev.md)
[nl:Indev level formaat](nl:Indev level formaat.md)
[pt:Formato de nível da Edição Java Indev](pt:Formato de nível da Edição Java Indev.md)
[ru:Формат файлов Minecraft (NBT)](ru:Формат файлов Minecraft (NBT).md)