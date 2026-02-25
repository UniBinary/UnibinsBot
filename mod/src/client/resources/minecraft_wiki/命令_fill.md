# 命令/fill

*页面ID: 39780* | *来源: Minecraft Wiki*

用特定方块填充一个区域的全部或部分。

# 语法
* **Java版**
   <code>fill <from> <to> <block> [outline|hollow|destroy|strict|replace|keep]</code>
   <code>fill <from> <to> <block> replace <filter> [outline|hollow|destroy|strict]</code>

* **基岩版**

   <code>fill <from: x y z> <to: x y z> <tileName: Block> <blockStates: block states> [oldBlockHandling: FillMode]</code>

   <code>fill <from: x y z> <to: x y z> <tileName: Block> [oldBlockHandling: FillMode]</code>

<hr>

  当<code>oldBlockHandling: FillMode</code>使用<code>replace</code>参数时的语法：

   <code>fill <from: x y z> <to: x y z> <tileName: Block> <blockStates: block states> replace [replaceTileName: Block] [replaceBlockStates: block states]</code>

   <code>fill <from: x y z> <to: x y z> <tileName: Block> replace [replaceTileName: Block] [replaceBlockStates: block states]</code>

# 参数
：和<br>
：和
   定义填充区域的两组对角方块坐标。

   构成边角的方块在此方块的坐标正方向上延伸。因此，各轴上较小的坐标将会正好贴合区域边界，但较大的坐标将会超过边界1方块，源区域的体积则为(x<sub>大</sub> - x<sub>小</sub> + 1) × (y<sub>大</sub> - y<sub>小</sub> + 1) × (z<sub>大</sub> - z<sub>小</sub> + 1)。例如：<code>0 0 0 0 0 0</code>的体积为1方块，<code>0 0 0 1 1 1</code>与<code>1 1 1 0 0 0</code>都指定同一块8方块大小的区域。

   指定用于填充该区域的方块。


：
   指定方块要使用的[方块状态](方块状态.md)。


[缩略图|用destroy填充[[空气](File:Command fill "destroy".jpg.md)]]
[缩略图|用hollow填充[[玻璃](File:Command fill "hollow".jpg.md)]]
[缩略图|用outline填充[[玻璃](File:Command fill "outline".jpg.md)]]
：hollowdestroystrictreplacekeep|replace|outlinehollowdestroystrict}}<br>
：
   指定方块更改的处理方式，必须为以下其中之一：
  * <code>destroy</code> — 用指定方块替换填充区域内所有方块（包括空气），原有方块视为被无附魔的下界合金[锹](锹.md)或[镐](镐.md)采掘而掉落对应的物品实体形式。（只能被[剪刀](剪刀.md)采集的方块，如[藤蔓](藤蔓.md)，不会掉落；流体方块同理。）
  * <code>hollow</code> — 仅用指定方块替换填充区域外层的方块。内部方块被替换为空气。若被填充的区域没有内部（长、宽、高至少一个不足3方格）时，与默认效果相似。
  * <code>outline</code> — 仅用指定方块替换填充区域外层的方块。内部方块不受影响。若被填充的区域没有内部（长、宽、高至少一个不足3方格）时，与默认效果相似。
  * <code>keep</code> — 仅用指定方块替换填充区域内的空气方块。
  * <code>replace</code> — 单独使用时与默认效果相同，但在其后指定<code><filter></code>或<code>tileName: Block</code>可限制被替换的方块类型。
  * <code>strict</code> — 在放置方块时不触发自身及紧挨着的方块的方块更新和形状更新。
   若未指定，默认用指定方块替换填充区域内所有方块（包括空气），而不以实体形式掉落被替换的方块和方块内容物。

   指定将要替换的方块。若未指定，将替换填充区域内的所有方块。


：
   指定要替换的方块的方块状态。

# 结果

或<br>的设定值}}

# 输出

# 示例
* <code>/fill 52 63 -1516 33 73 -1536 gold_block replace white_concrete</code>
* * 在指定坐标的区域内将[白色混凝土](白色混凝土.md)替换为[金块](金块.md)。
* <code>/fill ~-3 ~-3 ~-3 ~3 ~-1 ~3 water</code>
* * 将玩家脚下为顶面中心7×3×7的区域替换为[水](水.md)。
* <code>/fill ~-3 ~ ~-4 ~3 ~4 ~4 oak_planks hollow</code>
* * 在玩家四周生成由[橡木木板](橡木木板.md)组成的一个普通房间大小的盒子，并将内部替换为[空气](空气.md)。
* <code>/fill ~-15 ~-15 ~-15 ~15 ~15 ~15 stone</code>
* * 以玩家为中心生成一个实心的[石头](石头.md)立方体。
* <code>/fill ~ ~ ~ ~9 ~9 ~9 glass outline</code>
* * 在玩家所处位置上生成一个10×10×10的[玻璃](玻璃.md)罩，并保留内部结构。
* <code>/fill ~-1 ~ ~ ~1 ~ ~ prismarine_brick_stairs[facing=south,waterlogged=true]</code>
* * 将玩家周围指定位置的方块替换为面向南方且含水的[海晶石砖楼梯](海晶石砖楼梯.md)。
* <code>/fill ~-16 ~-14 ~-16 ~16 ~14 ~16 sandstone["sand_stone_type"="heiroglyphs"] replace netherrack</code>
* * 以玩家为中心将33×29×33区域内的[下界岩](下界岩.md)替换为[雕纹砂岩](雕纹砂岩.md)。

# 历史

|命令。}}
|
|游戏规则控制单次执行可更改的最大方块数。}}
|选项可以在后面附加额外选项。
|加入了选项。}}
|
|命令。}}
|
|命令可更改的最大方块数现在为32768。}}
|中对[方块状态](方块状态.md)的支持。}}
|和参数。}}
}}

# 导航

[de:Befehl/fill](de:Befehl/fill.md)
[en:Commands/fill](en:Commands/fill.md)
[es:Comandos/fill](es:Comandos/fill.md)
[fr:Commandes/fill](fr:Commandes/fill.md)
[ja:コマンド/fill](ja:コマンド/fill.md)
[pt:Comandos/fill](pt:Comandos/fill.md)
[ru:Команды консоли/fill](ru:Команды консоли/fill.md)
[uk:Команди консолі/fill](uk:Команди консолі/fill.md)