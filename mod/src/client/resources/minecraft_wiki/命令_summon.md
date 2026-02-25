# 命令/summon

*页面ID: 39818* | *来源: Minecraft Wiki*

召唤一个[实体](实体.md)。

# 语法
* **Java版**
   <code>summon <entity> [<pos>]</code>
   <code>summon <entity> <pos> [<nbt>]</code>

* **基岩版**
   <code>summon <entityType: EntityType> [spawnPos: x y z] [yRot: float] [xRot: float] [spawnEvent: string] [nameTag: string]</code>
   <code>summon <entityType: EntityType> <nameTag: string> [spawnPos: x y z]</code>
   <code>summon <entityType: EntityType> [spawnPos: x y z] facing <lookAtEntity: target> [spawnEvent: string] [nameTag: string]</code>
   <code>summon <entityType: EntityType> [spawnPos: x y z] facing <position: x y z> [spawnEvent: string] [nameTag: string]</code>

# 参数

   指定要被召唤的实体类型。

   玩家（）和浮漂（）实体无法被召唤。尝试召唤这两种实体会使命令执行失败。
   只有特定实体类型允许被召唤。允许召唤的实体类型可见于命令的自动补全建议列表。指定列表外的实体类型会使命令无法解析。

   指定该实体的召唤位置。如果未指定，默认为命令执行位置。


：
   指定该[实体的NBT](实体数据格式.md)。


：和
   指定该实体生成时的旋转角度。
   必须为两个单精度浮点数组成的朝向，分别表示绕Y轴旋转和绕X轴旋转，以度为单位。
  * 绕Y轴旋转时，-180.0表示北，-90.0表示东，0.0表示南，90.0表示西。
  * 绕X轴旋转时，竖直上方为-90.0，至竖直下方90.0。
   加上波浪号前缀将相对于执行朝向进行旋转。

：
   指定该实体生成时的要朝向的实体。


：
   指定该实体生成时的要朝向的坐标。


：
   指定该实体的召唤时附带的实体事件，应为一个行为包内适用于实体的[生成事件](生成事件.md)的名称。


：
   指定该实体的名称，生成时为该实体命名。


# 结果

或实体。|fail|N/A}}

# 输出

# 示例
* 在当前位置往西面10格处生成一个闪电：
* * <code>/summon lightning_bolt ~-10 ~ ~</code>
* 在坐标(0,0,0)生成一个猪：
* * <code>/summon pig 0 0 0</code>

：
* 在当前位置生成一个名为“充能苦力怕”的[闪电苦力怕](闪电苦力怕.md)：
* * <code>/summon creeper ~ ~ ~ {powered:1b,CustomName:"充能苦力怕"}</code>
* 在当前位置生成一个[蜘蛛骑士](蜘蛛骑士.md)：
* * <code>/summon spider ~ ~ ~ {Passengers:[{id:"minecraft:skeleton",equipment:{mainhand:{id:"minecraft:bow",count:1}}}]}</code>
* 在当前位置生成一个数量为64的掉落物[钻石](钻石.md)：
* * <code>/summon item ~ ~ ~ {Item:{id:"minecraft:diamond",count:64}}</code>
* 在当前位置生成一个被禁用AI、朝向西面的[骷髅](骷髅.md)：
* * <code>/summon skeleton ~ ~ ~ {NoAI:1b,Rotation:[90F,0F]}</code>
* 在当前位置生成一个向上飞的[猪](猪.md)：
* * <code>/summon pig ~ ~ ~ {Motion:[0d,5d,0d]}</code>
* 在当前位置生成一只蓝色美西螈：
* * <code>/summon axolotl ~ ~ ~ {Variant:4}</code>

：
* 在当前位置生成一个名为“充能苦力怕”的闪电苦力怕：
* * <code>/summon creeper ~ ~ ~ ~ ~ minecraft:become_charged "充能苦力怕"</code>
* 在当前位置生成一个[掠夺者](掠夺者.md)[袭击队长](袭击队长.md)：
* * <code>/summon pillager ~ ~ ~ ~ ~ minecraft:spawn_as_illager_captain</code>
* 在当前位置生成一个[灾厄巡逻队](灾厄巡逻队.md)的掠夺者袭击队长：
* * <code>/summon pillager ~ ~ ~ ~ ~ minecraft:promote_to_patrol_captain</code>
* 在当前位置生成一个名为“”的[海豚](海豚.md)：
* * <code>/summon dolphin "§6海豚" ~ ~ ~</code>
* 在当前位置往东面5格处生成一个朝向当前坐标的[僵尸](僵尸.md)：
* * <code>/summon zombie ~5 ~ ~ facing ~ ~ ~</code>

# 历史

|。}}
|来生成[闪电](闪电.md)。}}
|现在不允许<*x*>或<*z*>超出[-30000000, 30000000)或<*y*>超出[-20000000, 20000000)。}}
|来生成[火球](火球.md)。
|现在不再可以使生成位置的<x>或<z>超出[-30000000, 30000000)或<y>超出[-20000000, 20000000)。}}
|现在使用参数类型。在此之前使用的参数类型为。}}
|
|
|。}}
|
|
|
|
|语法。}}
}}

# 导航

[de:Befehl/summon](de:Befehl/summon.md)
[en:Commands/summon](en:Commands/summon.md)
[es:Comandos/summon](es:Comandos/summon.md)
[fr:Commandes/summon](fr:Commandes/summon.md)
[ja:コマンド/summon](ja:コマンド/summon.md)
[pt:Comandos/summon](pt:Comandos/summon.md)
[ru:Команды консоли/summon](ru:Команды консоли/summon.md)
[uk:Команди консолі/summon](uk:Команди консолі/summon.md)