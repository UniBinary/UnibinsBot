# 命令/clear

*页面ID: 39641* | *来源: Minecraft Wiki*

清除玩家物品栏的物品。

# 用法
可以清除物品栏中的物品，当从容器（箱子、工作台等）中用光标拿起物品时，此类物品也可以清除。

还可以清除光标持有的、来自物品栏的物品，而此类物品只能在非创造模式下清除。

还可以清除玩家的2×2合成槽位中的物品。

# 语法
* **Java版**
   <code>clear [<targets>] [<item>] [<maxCount>]</code>

* **基岩版**
   <code>clear [player: target] [itemName: Item] [data: int] [maxCount: int]</code>

# 参数

   指定要被清除物品的玩家。如果未指定，默认为命令执行者。


   指定要被清除的物品。如果未指定，默认为所有物品。


   指定要被清除物品的[数据值](基岩版数据值.md)。如果未指定或为，则不考虑物品的数据值；如果指定数据值对该物品无效，默认为。
   应该在-1到2147483647之间（含）。

   指定要被清除物品的最大值。如果未指定}}，则默认清除所有符合要求的物品；如果为，则不会清除物品，而是返回指定物品的数量。
   应该在-1到2147483647之间（含）。

# 结果

# 输出

# 示例
* 清除自己的所有物品：<code>clear</code>
* 清除Alice的所有物品：<code>clear Alice</code>
* 清除Alice的所有羊毛：<code>clear Alice #minecraft:wool</code>或<code>clear Alice minecraft:wool</code>
* 清除所有玩家的橙色羊毛：<code>clear @a minecraft:orange_wool</code>或<code>clear @a wool 1</code>
* 清除距离最近玩家的带有“[锋利](锋利.md) I”[附魔](附魔.md)的金剑：<code>clear @p minecraft:golden_sword[minecraft:enchantments[{"minecraft:sharpness":1}]</code>
* 检测一个随机玩家的物品栏内是否拥有石头：<code>clear @r minecraft:stone -1 0</code>或<code> clear @r minecraft:stone 0</code>

# 历史

|命令。 }}
|加入了参数。}}
|加入了参数。}}
|现在可以更改副手槽位的物品。}}
|的语法从变为。}}
|现在会清除玩家合成栏中的物品。}}
|现在会正确地清除玩家合成栏中的物品。}}
|
|
|命令。}}
}}

# 参见
*  — 更改或移除实体物品栏和容器内的物品和NBT
*  — 给予玩家物品
*  — 清除实体
*  — 修改方块或实体的物品栏中的物品
*  — 替换方块或实体的物品栏中的物品

# 导航

[de:Befehl/clear](de:Befehl/clear.md)
[en:Commands/clear](en:Commands/clear.md)
[es:Comandos/clear](es:Comandos/clear.md)
[fr:Commandes/clear](fr:Commandes/clear.md)
[ja:コマンド/clear](ja:コマンド/clear.md)
[ko:명령어/clear](ko:명령어/clear.md)
[pt:Comandos/clear](pt:Comandos/clear.md)
[ru:Команды консоли/clear](ru:Команды консоли/clear.md)
[th:คำสั่ง/clear](th:คำสั่ง/clear.md)
[uk:Команди консолі/clear](uk:Команди консолі/clear.md)