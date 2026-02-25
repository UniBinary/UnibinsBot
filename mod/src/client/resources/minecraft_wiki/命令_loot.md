# 命令/loot

*页面ID: 39869* | *来源: Minecraft Wiki*

将指定的战利品放入物品栏或世界。

# 语法
* **Java版**
   <code>-{}-loot <*目标*> <*来源*></code>

   其中：
  : <code>-{}-<*目标*></code>可以为：
  :: <code>give <players></code>
  ::: 给予玩家物品。空物品堆叠会被直接忽略。
  :: <code>insert <targetPos></code>
  ::: 将物品发放到容器方块中。空物品堆叠会被直接忽略。
  :: <code>spawn <targetPos></code>
  ::: 生成[物品实体](物品实体.md)。空物品堆叠也会生成，但会立即消失。
  :: <code>replace block <targetPos> <slot></code>
  :: <code>replace entity <entities> <slot></code>
  ::: 用物品堆叠按顺序逐一替换连续的[槽位](槽位.md)。空物品堆叠会清空一个槽位。
  :: <code>replace block <targetPos> <slot> <count></code>
  :: <code>replace entity <entities> <slot> <count></code>
  ::: 清空指定数量的连续的[槽位](槽位.md)，并将物品按顺序放置至其中。空物品堆叠也会正常放置。若生成的物品堆叠数量超过指定的槽位数量，超出的物品堆叠直不会生成。
  : <code>-{}-<*来源*></code>可以为：
  :: <code>fish <loot_table> <pos> [<tool>|mainhand|offhand]</code>
  ::: 模拟在指定位置使用指定工具[钓鱼](钓鱼.md)。
  :: <code>kill <target></code>
  ::: 模拟杀死指定实体。
  :: <code>loot <loot_table></code>
  ::: 直接使用指定[战利品表](战利品表.md)。
  :: <code>mine <pos> [<tool>|mainhand|offhand]</code>
  ::: 模拟使用指定工具挖掘指定位置的方块。

  :各个来源所提供的[战利品上下文](战利品上下文.md)为：
  ::

* **基岩版**
   <code>-{}-loot <*目标*> <*来源*></code>

   其中：
  : <code>-{}-<*目标*></code>可以为：
  :: <code>give <player: target></code>
  ::: 给予玩家物品。空物品堆叠会被直接忽略。
  :: <code>insert <position: x y z></code>
  ::: 将物品发放到容器方块中。空物品堆叠会被直接忽略。
  :: <code>spawn <position: x y z></code>
  ::: 生成[物品实体](物品实体.md)。空物品堆叠会被直接忽略。
  :: <code>replace block <position: x y z> slot.container <slotId: int></code>
  :: <code>replace entity <entity: target> <slotType: EntityEquipmentSlot> <slotId: int></code>
  ::: 用物品堆叠按顺序逐一替换连续的[槽位](槽位.md)。空物品堆叠会清空一个槽位。
  :: <code>replace block <position: x y z> slot.container <slotId: int> [count: int]</code>
  :: <code>replace entity <entity: target> <slotType: EntityEquipmentSlot> <slotId: int> [count: int]</code>
  ::: 清空指定数量的连续的[槽位](槽位.md)，并将物品按顺序放置至其中。空物品堆叠也会正常放置。若生成的物品堆叠数量超过指定的槽位数量，超出的物品堆叠直接忽略。要求一个实体或目标容器必须存在指定数量的连续槽位，才会进行清除和放置。
  : <code>-{}-<*来源*></code>可以为：
  :: <code>kill <entity: target> ["<tool>|mainhand|offhand": string]</code>
  ::: 模拟使用指定工具杀死指定实体。
  :: <code>loot <loot_table: string> ["<tool>|mainhand|offhand": string]</code>
  ::: 模拟使用指定工具获取指定战利品表。
  :: <code>mine <TargetBlockPosition: x y z> ["<tool>|mainhand|offhand": string]</code>
  ::: 模拟使用指定工具挖掘指定位置的方块。

# 参数
：<br>
：
   指定所使用的[战利品表](战利品表.md)。

   且应指向路径为<code>loot_tables/loot_table: string.json</code>的战利品表。

：
   指定用来模拟挖掘或钓鱼的工具物品。


：mainhandoffhand": string|string}}
   指定用来模拟杀死生物或获取战利品的工具。
   可以为<code>mainhand</code>（使用执行者主手的物品）、<code>offhand</code>（使用执行者副手的物品），或指定物品ID。

（来源为<code>kill</code>）
   指定要模拟杀死的实体。



   指定要给予物品的一个或多个玩家。


：和（仅<code>replace block</code>或<code>insert</code>模式）<br>
：和 (仅<code>replace block</code>或<code>insert</code>模式)
   指定方块坐标。



（仅<code>spawn</code>模式）
   指定要生成物品实体的位置。



   指定要修改的一个或多个实体。



   指定要清空并放入物品的连续槽位数。


：<br>
：，<code>slot.container</code>和
   指定要修改的物品栏[槽位](槽位.md)。


# 结果

位于世界外或未被加载|fail|fail}}

非有效的战利品表}}

{{Result table|cmd=-{}-/loot replace entity <entities> <slot> <*来源*><br>/loot replace entity ... <slotId: int> <*来源*>|<code>-{}-<*来源*></code>提供了一个或多个物品堆叠，且所有目标实体都无指定的单个槽位|success}}
{{Result table|cmd=-{}-/loot replace entity <entities> <slot> <count> <*来源*><br>/loot replace entity ... <slotId: int> <count: int> <*来源*>|<code>-{}-<*来源*></code>提供了一个或多个物品堆叠，且所有目标实体都不完整拥有指定的多个连续的槽位}}

{{Result table|cmd=-{}-/loot replace block <targetPos> <slot> <*来源*><br>/loot replace block ... <slotId: int> <*来源*>|获取的物品堆叠的数量加上<code><slot></code>超过了该容器的槽位编号上限|exception|success}}
（或）加上（或）超过了该容器的槽位编号上限||fail}}

# 输出

}}

{{Output table|cmd=-{}-/loot replace entity ... <slotId: int> <*来源*>|执行成功|若<*来源*>提供了0个物品堆叠，输出1。否则输出拥有指定的单个槽位的实体的数量}}
{{Output table|cmd=-{}-/loot replace entity ... <slotId: int> <count: int> <*来源*>|执行成功|若<*来源*>提供了0个物品堆叠，输出1。否则输出完整拥有指定的多个连续的槽位的实体数量}}

# 示例
<syntaxhighlight lang="mcfunction">
loot give @s loot minecraft:entities/zombie
</syntaxhighlight>
* 根据战利品表生成物品并给予执行者。

<syntaxhighlight lang="mcfunction">
loot insert 1 2 3 loot minecraft:chests/end_city_treasure
</syntaxhighlight>
* 根据战利品表生成物品，并将生成的物品插入到位于(1, 2, 3)处的容器方块中。

<syntaxhighlight lang="mcfunction">
loot replace block 1 2 3 container.0 3 loot minecraft:chests/abandoned_mineshaft
</syntaxhighlight>
* 根据战利品表生成3个物品堆叠，并将(1, 2, 3)处容器方块槽位及其之后一共3个格子中的物品替换为生成的物品。

<syntaxhighlight lang="mcfunction">
loot spawn 1 2 3 loot minecraft:equipment/trial_chamber
</syntaxhighlight>
* 根据战利品表生成物品，该物品将以掉落物的形式生成在主世界的(1.5, 2.5, 3.5)坐标处（坐标经过了中心修正）。

<syntaxhighlight lang="mcfunction">
loot give @s fish minecraft:gameplay/fishing/treasure 1 2 3 mainhand
</syntaxhighlight>
* 根据战利品表生成物品并给予执行者。该过程如同执行者使用主手物品从(1, 2, 3)位置进行了一次“钓鱼”。

<syntaxhighlight lang="mcfunction">
loot give @s kill @r[type=minecraft:pig]
</syntaxhighlight>
* 根据战利品表生成物品并给予执行者。所给予的物品如同击杀某只猪后所掉落的物品。

<syntaxhighlight lang="mcfunction">
loot give @s mine 1 2 3 mainhand
</syntaxhighlight>
* 如果(1, 2, 3)位置处为一个铁矿石，则会根据其战利品表生成物品并给予执行者，所给予的物品如同执行者使用主手挖掘该铁矿石后所掉落的物品。即使主手未持有石镐或品质更好的镐，仍会掉落1个粗铁。

# 历史

|。}}
|{{HistoryLine|||dev=18w44a|删除了<code>-{}-<*来源*></code>中的award。}}
|重命名为并重做。}}
|{{HistoryLine||1.20.5|dev=24w09a|更改了语法，现在不再使用物品<code>-{}-*NBT标签*</code>，而是<code>-{}-*物品堆叠组件*</code>。}}
|
|
|
|。}}
|。}}
|。}}
|语法。}}
|
|
|
|
|
|
}}

# 参见
*  — 不通过战利品表，直接给予玩家指定物品。

# 导航

[de:Befehl/loot](de:Befehl/loot.md)
[en:Commands/loot](en:Commands/loot.md)
[es:Comandos/loot](es:Comandos/loot.md)
[ja:コマンド/loot](ja:コマンド/loot.md)
[ko:명령어/loot](ko:명령어/loot.md)
[pt:Comandos/loot](pt:Comandos/loot.md)
[ru:Команды консоли/loot](ru:Команды консоли/loot.md)
[uk:Команди консолі/loot](uk:Команди консолі/loot.md)