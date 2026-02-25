# 命令/setblock

*页面ID: 39810* | *来源: Minecraft Wiki*

将指定位置的方块更改为另一个方块。

# 语法
* **Java版**
   <code>setblock <pos> <block> [destroy|keep|replace|strict]</code>

* **基岩版**
   <code>setblock <position: x y z> <tileName: Block> [blockStates: block states] [destroy|keep|replace]</code>

# 参数

   指定要被更改方块的位置。


   指定更改后的新方块。


：
   指定新方块的[方块状态](方块状态.md)。


keepreplace|destroykeepreplacestrict}}
   指定方块更改的处理方式，必须为以下其中之一：
  * <code>destroy</code> — 原方块以[掉落物](掉落物.md)的形式掉落（液体方块及如藤蔓等仅可由剪刀采集的方块除外），并播放方块被破坏的音效。
  * <code>keep</code> — 仅当原方块是[空气](空气.md)类方块时才进行更改。
  * <code>replace</code> — 原方块不掉落物品，且不播放方块被破坏的音效。
  * <code>strict</code> — 在放置方块时不触发自身及紧挨着的方块的方块更新和形状更新。
   如果未指定，默认为<code>replace</code>。

# 结果

</ref>||success}}

# 输出

# 示例
* 在你脚的位置上放置一个朝北的[箱子](箱子.md)：
* * ：<code>setblock ~ ~ ~ chest[facing=north]</code>
* * ：<code>setblock ~ ~ ~ chest ["facing_direction"=2]</code>
* 在你的头上放置一个位于上半格的[石英台阶](石英台阶.md)：
* * ：<code>setblock ~ ~2 ~ quartz_slab[type=top]</code>
* * ：<code>setblock ~ ~2 ~ stone_block_slab ["stone_slab_type"="quartz","top_slot_bit"=true]</code>
* 在你位置的北边一格处放置第一行写有“我的箱子”且第二行写有“请勿打开！”的[告示牌](告示牌.md)：
* * <code>setblock ~ ~ ~-1 birch_sign{front_text:{messages:["我的箱子","请勿打开！","",""]<nowiki>}}</nowiki></code>（告示牌即使有几行空着也要把总共四行写全，否则无法正确解析）
* 放置一块内含一个苹果的[可疑的沙砾](可疑的沙砾.md)：
* * <code>setblock ~ ~ ~ minecraft:suspicious_gravel{item:{id:"minecraft:apple",count:1<nowiki>}}</nowiki></code>

# 历史

|。}}
|中对[方块状态](方块状态.md)的支持。}}
|现在可以破坏液体。<ref></ref>}}
|选项。}}
|
|。}}
|
|中对[方块状态](方块状态.md)的支持。}}
|参数。}}
}}

# 参见
*  - 修改一个方块的数据值。
*  - 将一个区域的方块复制到另一区域。
*  - 用方块填充一个区域。

# 参考

# 导航

[de:Befehl/setblock](de:Befehl/setblock.md)
[en:Commands/setblock](en:Commands/setblock.md)
[ja:コマンド/setblock](ja:コマンド/setblock.md)
[pt:Comandos/setblock](pt:Comandos/setblock.md)
[ru:Команды консоли/setblock](ru:Команды консоли/setblock.md)
[uk:Команди консолі/setblock](uk:Команди консолі/setblock.md)