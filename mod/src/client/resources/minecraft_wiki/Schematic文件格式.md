# Schematic文件格式

*页面ID: 9290* | *来源: Minecraft Wiki*

* *Schematic文件格式**为一种由玩家社区所创建的用于存储Minecraft世界信息，进而可以通过[第三方应用程序](辅助程序与编辑器.md)（如**[McEdit](辅助程序与编辑器/地图工具.md)**、**[Minecraft Note Block Studio](辅助程序与编辑器/Minecraft Note Block Studio.md)**、**[红石模拟器](辅助程序与编辑器/专业工具.md)**、**[WorldEdit](http://www.sk89q.com/projects/worldedit/)**以及[Schematica](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/1285818-schematica)等）进行编辑。地形以[NBT格式](NBT格式.md)储存并大致基于[Indev世界格式](Indev世界格式.md)。方块和数据的目录以YZX的排序存储，也就是说X坐标的变化最频繁。这与[Classic](Java版Classic.md)、[Indev](Java版Indev.md)以及[Anvil](Anvil.md)文件格式中的方块排序相似。这种格式不能将应该覆盖已有方块的空气方块和不应覆盖已有方块的空气方块区分开。

# NBT结构
示意图中的坐标范围从(0,0,0)到(宽-1,高-1,长-1)。
<div class="treeview">
* : Schematic数据。
* * : 沿X轴方向的尺寸。
* * : 沿Y轴方向的尺寸。
* * : 沿Z轴方向的尺寸。
* * : 如果为[Classic](Java版Classic.md)版本的世界，此处则为**"Classic"**；如果为[携带版](携带版.md)的世界，此处则为**"Pocket"**；如果为[Alpha](Java版Alpha.md)及其之后版本的世界，此处则为**"Alpha"**。
* * : 在地形中所用到的[方块ID](Java版数据值#方块.md)，每个方块8位。依次按高（从底部到顶部）、长和宽排序——也就是说，坐标为(x,y,z)的方块的索引为(Y×长度 + Z)×宽度 + X。
* * : 可用于进一步定义地形的额外位（可选）。两个半字节被放入数组中的每个索引中。与普通区块不同，偶数索引使用高半字节并且奇数索引使用低半字节。
* *  *<small>已弃用</small>*: 与AddBlocks相同，使用在旧版本的Schematica格式中。属于字节数组，其中每个字节包含用于定义地形的附加数据。编辑时不应该输入这个标签。
* * : 在地形中额外用到的方块数据。在每字节中只使用低四位。（与[区块存储格式](区块存储格式.md)不同，Schematic格式的方块数据每个占用一个完整字节。）
* * : 复合标签列表。
* **  在Schematic中的每一个实体。
* *** 请参见[实体数据格式](实体数据格式.md)。
* * : 复合标签列表。
* **  在Schematic中的每一个实体。
* *** 请参见[方块实体数据格式](方块实体数据格式.md)。
* * : 由Schematica用作地形图标的物品。
* **
* * : 此地形所保存版本的ID映射，由Schematica使用。仅提供在地形中使用的材料。
* ** : 表示该名称代表被给定的ID（例如：**[名称]**数值为1，其表示<code>minecraft:stone</code>）。
* * : Schematica为扩展而提供的任意附加数据。可选，并且只有在不为空的情况下才会提供。
* * : 仅WorldEdit。X的中心坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅WorldEdit。Y的中心坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅WorldEdit。Z的中心坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅WorldEdit。X的偏移坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅WorldEdit。Y的偏移坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅WorldEdit。Z的偏移坐标。可选，但如果被提供，其余的部分也需要被提供。
* * : 仅MCEdit2。如果使用数字ID（[Java版1.7](Java版1.7.md)）则为17，并且如果使用文本ID（[Java版1.8](Java版1.8.md)）则为18。
* * : 仅MCEdit2。将数字方块ID映射到文本方块ID。
* ** : 该编号所表示的文本ID（例如：**[编号]**为1且值为<code>minecraft:stone</code>）。
* * : 仅MCEdit2。将数字物品ID映射到文本方块ID。 仅在itemStackVersion为17时生效。
* ** : 该编号所表示的文本ID（例如：**[编号]**为1且值为<code>minecraft:stone</code>）。
* * : 仅MCEdit-Unified。队列中方块更新的列表。
* ** 见。
* * : 仅MCEdit-Unified。包含地形中所有生物群系的字节数组。
</div>

# 实现
* [WorldEdit](https://github.com/sk89q/WorldEdit/blob/master/worldedit-core/src/main/java/com/sk89q/worldedit/schematic/MCEditSchematicFormat.java)
* [MCEdit2](https://github.com/mcedit/mcedit2/blob/master/src/mceditlib/schematic.py)
* * [legacy MCEdit](https://github.com/mcedit/pymclevel/blob/master/schematic.py)
* * [MCEdit-Unified](https://github.com/Khroki/MCEdit-Unified/blob/master/pymclevel/schematic.py)
* [Schematica](https://github.com/Lunatrius/Schematica/blob/master/src/main/java/com/github/lunatrius/schematica/world/schematic/SchematicAlpha.java)
* [BuilderTools - PocketMine](https://github.com/CzechPMDevs/BuilderTools)
* [litematica](https://github.com/maruohon/litematica)

# 参见
* [结构存储格式](结构存储格式.md)

# 外部链接
* [minecraft-schematics.com](http://www.minecraft-schematics.com)
* [minecraft-schematics.net](http://www.minecraft-schematics.net)

# 导航

[Category:开发](Category:开发.md)

[en:Schematic file format](en:Schematic file format.md)
[fr:Format de fichier .schematic](fr:Format de fichier .schematic.md)
[nl:Schematisch bestandsformaat](nl:Schematisch bestandsformaat.md)