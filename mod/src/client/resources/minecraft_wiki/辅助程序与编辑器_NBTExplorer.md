# 辅助程序与编辑器/NBTExplorer

*页面ID: 20541* | *来源: Minecraft Wiki*

}}

* *NBTExplorer**是一个低阶的Minecraft [NBT](NBT.md)图形界面编辑器。其界面为树形结构，可简便地浏览多个存档，并支持最新的NBT格式。NBTExplorer基于[Substrate](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/1261313-sdk-substrate-map-editing-library-for-c-net-1-3-8)构建。由于任何Minecraft版本的地图大多基于NBT格式的文件，因此它通常可用于最新版的Minecraft而无需更新NBTExplorer。

# 用法
NBT标签控制着一切世界参数，包括玩家的[末影箱](末影箱.md)内容、物品栏、游戏模式、极限与否等。NBTExplorer可用于查看和编辑游戏数据，以下是一些典型案例：
;修改[level.dat](level.dat.md)的相关内容，包括但不限于：
* 定位生成的[结构](结构.md)；
* 添加与修改物品、添加[附魔](附魔.md)；
* 修改世界生成用的种子；
* 无需即可改变[游戏规则](游戏规则.md)；
* 为存档和服务器名称应用[格式化代码](格式化代码.md)；
* 修改世界名称；
* 修改玩家的[游戏模式](游戏模式.md)、[生命值](生命值.md)、位置等。例如，当玩家被传送到“非法区域”而无法通过恢复位置时，NBTExplorer可将玩家带回到正常位置；
* 修改世界地形生成的设置，不会影响已生成的区块；
;修改[区块](区块.md)，包括但不限于：
* 修改区块的[生物群系](生物群系.md)；
* 修改实体数据或者删除实体，例如，若不慎产生超多实体而导致世界容易崩溃，用NBTExplorer可轻松去除过多实体；
* 修改方块实体的数据，包括[命令方块](命令方块.md)、[箱子](箱子.md)、[告示牌](告示牌.md)等。

# 兼容格式
* 标准NBT格式文件（例如level.dat）
* Schematic文件
* 未压缩的NBT文件（例如idcounts.dat）
* Minecraft Region格式区块数据（*.mcr）
* Minecraft Anvil格式区块数据（*.mca）
* Cubic Chunks Region格式区块数据

# 外部链接
* [Github上的NBTExplorer](https://github.com/jaquadro/NBTExplorer)

[Category:自定义软件](Category:自定义软件.md)

[en:Tutorials/Programs and editors/NBTExplorer](en:Tutorials/Programs and editors/NBTExplorer.md)