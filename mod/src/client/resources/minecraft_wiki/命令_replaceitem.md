# 命令/replaceitem

*页面ID: 39804* | *来源: Minecraft Wiki*

命令取代。}}

替换方块（箱子、熔炉等）或实体（玩家或生物）物品栏内的物品。

# 语法
   <code>replaceitem block <position: x y z> slot.container <slotId: int> <itemName: Item> [amount: int] [data: int] [components: json]</code>
   <code>replaceitem block <position: x y z> slot.container <slotId: int> <oldItemHandling: ReplaceMode> <itemName: Item> [amount: int] [data: int] [components: json]</code>
   <code>replaceitem entity <target: target> <slotType: EntityEquipmentSlot> <slotId: int> <itemName: Item> [amount: int] [data: int] [components: json]</code>
   <code>replaceitem entity <target: target> <slotType: EntityEquipmentSlot> <slotId: int> <oldItemHandling: ReplaceMode> <itemName: Item> [amount: int] [data: int] [components: json]</code>

# 参数
<!--
物品栏：[ slot.weapon.mainhand ]
槽位  ：[ slot.weapon.mainhand 槽位编号 ]
-->
<code>position: x y z</code>（仅<code>block</code>模式）
   指定要改变的方块的位置。可用[波浪号](坐标#相对坐标.md)（<code>~ ~ ~</code>）或[脱字符](坐标#局部坐标.md)（<code>^ ^ ^</code>）来指定一个相对于命令执行处的位置。

<code>target: target</code>（仅<code>entity</code>模式）
   指定要改变的实体。必须为一个玩家名或[目标选择器](目标选择器.md)。

<code>slotType: EntityEquipmentSlot</code>、<code>slot.container</code>和<code>slotId: int</code>
   指定要改变的物品栏槽位。有效值取决于要改变的方块或实体。

   对于方块，必须为<code>-{}-slot.container *槽位编号*</code>，其中*槽位编号*用具体的槽位编号数值代替。
  * [箱子](箱子.md)、[发射器](发射器.md)、[投掷器](投掷器.md)、[漏斗](漏斗.md)和[陷阱箱](陷阱箱.md)左上角的槽位被编号为0，而后从左到右、从上到下递增（例如，箱子的第一行槽位被从左至右编号为0至8）。大型箱子与大型陷阱箱被视为一个整体，其槽位编号为0至53。
  * [酿造台](酿造台.md)底部槽位从左至右编号为0至2，而其顶部槽位为3。烈焰粉的槽位为4。
  * [熔炉](熔炉.md)的槽位中输入槽位编号为0，燃料槽位为1，而输出槽位为2。

   对于实体，必须为下列之一，其中*槽位编号*用具体的槽位编号数值代替：
  :

<code>itemName: Item</code>
   指定被放置于方块或实体的物品栏槽位内的物品。必须为[物品ID](基岩版数据值/物品ID.md)。

<code>amount: int</code>（可选）
   指定被放置物品的数量。必须在1至64间（含），可以突破物品的堆叠限制。
   当该值突破某物品的堆叠限制时，命令仍会执行成功，但得到的总是该物品的最大堆叠数量（如执行<code>/replaceitem entity @a slot.weapon.mainhand 0 snowball 64</code>会将所有玩家的主手替换为16个雪球）。

<code>data: int</code>（可选）
   指定被放置物品的物品数据。必须为一个在-2,147,483,648至2,147,483,647间（含，不输入逗号）的整数，且在对指定物品无效时被重置为0。若未指定，默认为0。

<code>components: json</code>（可选）
   指定被放置物品的[物品堆叠组件](基岩版物品堆叠组件.md)。类似于[NBT标签](NBT标签.md)，但仅支持。

<code>oldItemHandling: ReplaceMode</code>（可选）
   必须是下列之一：
  * <code>destroy</code> - 忽略指定槽位中的原始物品，直接进行替换。
  * <code>keep</code> - 如果一个物品占用了该槽位，则不进行替换。

# 结果

）}}

# 输出

# 示例
* 将上方1格处的一个小型箱子右下角槽位内的物品替换成4棵[云杉树苗](云杉树苗.md)：
* * <code>replaceitem block ~ ~1 ~ slot.container 26 minecraft:sapling 4 1</code>
* 将自己的快捷栏最右槽位内的物品替换成4棵云杉树苗：
* * <code>replaceitem entity @s slot.hotbar 8 minecraft:sapling 4 1</code>
* 将所有人的副手内的物品换成空气：
* * <code>replaceitem entity @a slot.weapon.offhand 0 air 1 0</code>
* 把自己物品栏右下角槽位内的物品换成空气：
* * <code>replaceitem entity @s slot.inventory 26 air 1 0</code>
* 给所有[僵尸](僵尸.md)都戴上[金头盔](金头盔.md)：
* * <code>replaceitem entity @e[type=zombie] slot.armor.head 0 golden_helmet</code>

# 历史

|命令。}}
|
|，并加入了取代其功能。}}
|
|命令。}}
|命令支持<code>canplaceon</code>和<code>candestroy</code>。}}
|
|加入了新参数和来指定替换模式。}}
}}

# 参见
*  - 也能替换一个容器或实体物品栏中的物品，或改变盔甲与武器的掉落率。
*  - 不指定具体槽位、不覆盖原有物品地给予玩家物品。

# 导航

[de:Befehl/replaceitem](de:Befehl/replaceitem.md)
[en:Commands/replaceitem](en:Commands/replaceitem.md)
[ja:コマンド/replaceitem](ja:コマンド/replaceitem.md)
[pt:Comandos/replaceitem](pt:Comandos/replaceitem.md)
[ru:Команды консоли/replaceitem](ru:Команды консоли/replaceitem.md)
[uk:Команди консолі/replaceitem](uk:Команди консолі/replaceitem.md)