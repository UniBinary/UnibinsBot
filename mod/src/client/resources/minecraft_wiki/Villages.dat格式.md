# Villages.dat格式

*页面ID: 9736* | *来源: Minecraft Wiki*

* *villages.dat**位于每个Minecraft世界存档的data文件夹内，用于存储和[村庄](村庄.md)相关的信息。此文件是Gzip压缩的NBT文件。<!-- No longer accurate with 1.13 -->

类似的文件**villages_nether.dat**和**villages_end.dat**也会被存储，允许玩家在下界和末地建造村庄。

当区块被卸载后村庄会被“遗忘”，并且不会保存到这个文件里，原因可能是村民没有被加载，因此它们不能“看见”门。

# NBT结构
<div class="treeview">
* ：根标签。
* *
* ** ：内部时钟。
* ** ：村庄数据。
* *** ：一个村庄。
* **** ：所有房屋的X坐标之和。
* **** ：所有房屋的Y坐标之和。
* **** ：所有房屋的Z坐标之和。
* **** ：村庄中心的X坐标。
* **** ：村庄中心的Y坐标。
* **** ：村庄中心的Z坐标。
* **** ：铁傀儡的数量。
* **** ：最后一次有村民死于生物的攻击或当玩家在附近时与实体无关的伤害源的时间。
* **** ：[村民](村民.md)的数量。
* **** ：村庄的半径。
* **** ：最后一次有房子被添加到了村庄里的时间。
* **** ：内部时钟。
* **** ：村庄内的门。
* ***** ：一个门。
* ****** ：X轴上门内侧的朝向。
* ****** ：Z轴上门内侧的朝向。
* ****** ：最后一次有村民在附近的时间。
* ****** ：X坐标。
* ****** ：Y坐标。
* ****** ：Z坐标。
* **** ：与此村庄相关的玩家数据。
* ***** ：一个与村民交易了或伤害了村民的玩家。
* ****** ：玩家名称。
* ****** ：村民对玩家的态度。可为负。与村民交易时上升，伤害村民时下降。
* * ：保存此villages.dat文件的游戏的[数据版本](数据版本.md)。如果此项不存在则游戏认为此项是1343（[Java版1.12.2](Java版1.12.2.md)）。
</div>

# 历史

|
|
|
}}

# 参见
* [Tutorial:村庄机制](Tutorial:村庄机制.md)

# 导航

[Category:开发](Category:开发.md)

[de:Dorfdaten](de:Dorfdaten.md)
[en:Villages.dat format](en:Villages.dat format.md)
[fr:Format villages.dat](fr:Format villages.dat.md)
[nl:Villages.dat formaat](nl:Villages.dat formaat.md)
[ru:Формат Villages.dat](ru:Формат Villages.dat.md)