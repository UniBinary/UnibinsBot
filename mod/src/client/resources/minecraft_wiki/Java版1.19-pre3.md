# Java版1.19-pre3

*页面ID: 96322* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19-pre3**是[Java版1.19](Java版1.19.md)的第3个预发布版，发布于2022年5月25日<ref></ref>，做了一些微调，并修复了一些漏洞。

# 更改
# = 方块 =
* *[幽匿感测体](幽匿感测体.md)**
* <code>item_interact_start</code>游戏事件不再能被感测到，以使更具体的游戏事件（如<code>drink</code>、<code>eat</code>等）可被感测。

# = 生物 =
* *[青蛙](青蛙.md)**
* 不再在[覆地苔藓](覆地苔藓.md)上生成。

* *[监守者](监守者.md)**
* 监守者的远程攻击现在会无视可减伤的魔咒（如[保护](保护.md)）。

# = 非生物实体 =
* *[物品展示框](物品展示框.md)**
* 回退了[22w15a](22w15a.md)中作出的判定箱大小会随地图的放入而变化的更改。

# = 常规 =
* *[标签](Java版标签.md)**
* 从方块标签中移除了覆地苔藓。
* 从游戏事件标签中移除了。

# 修复
”提示的链接目标不正确。
|;dev
|249094|幽匿尖啸体的内部面会被意外剔除掉。
|249097|幽匿尖啸体的底部和侧面不会被固体方块剔除。
|249230|青蛙受到伤害时会优先捕食实体而不是尝试逃离。
|250162|在物品展示框中放置地图会使与其在同一角落处相交的画和带地图的物品展示框被破坏。
|250238|青蛙会尝试寻路到不在其可及范围的实体，此时青蛙会不停地旋转和抽动。
|250983|悦灵会被一直卡在不完整方块内。
|251220|与1.18.2相比，22w17a中方块延伸部分上的亮度要暗的多。
|251858|字幕位置比先前版本中的要高。
|251872|在命令中使用实体选择器时，游戏输出和服务器控制台上会记录“Received chat packet without valid signature”（收到了不含有效的聊天）警告。
|251878|即便是由玩家投掷的物品，幽匿感测体感测到此事件后不会向幽匿尖啸体传递信号。
|251968|使用命令执行另一个聊天类命令时，会在日志中记录“Received chat packet without valid signature”（收到了不含有效的聊天）警告。
|252071|如信号在监守者死亡前处于传播过程中，监守者死亡后仍会探测到此信号。
|252078|受到伤害后，悦灵不再会尝试逃离。
}}</onlyinclude>

# 参考

# 导航

[de:1.19-pre3](de:1.19-pre3.md)
[en:Java Edition 1.19 Pre-release 3](en:Java Edition 1.19 Pre-release 3.md)
[es:Java Edition 1.19 Pre-release 3](es:Java Edition 1.19 Pre-release 3.md)
[fr:Édition Java 1.19 Pre-release 3](fr:Édition Java 1.19 Pre-release 3.md)
[ja:Java Edition 1.19 Pre-release 3](ja:Java Edition 1.19 Pre-release 3.md)
[pt:Edição Java 1.19 Pre-release 3](pt:Edição Java 1.19 Pre-release 3.md)
[ru:1.19 Pre-release 3 (Java Edition)](ru:1.19 Pre-release 3 (Java Edition).md)