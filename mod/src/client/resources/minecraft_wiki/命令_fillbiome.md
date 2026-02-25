# 命令/fillbiome

*页面ID: 100072* | *来源: Minecraft Wiki*

设置指定区域的[生物群系](生物群系.md)。

# 用法
生物群系以元胞为单位存储，4×4×4方块为一个元胞，该命令应用于选中的每一元胞，而不是方块。

尽管生物群系是按元胞存储的，但元胞间的生物群系存在平滑过渡，生物群系的形状会变得不规则。

该命令只会改变生物群系，并不会对其中的方块造成改变。例如，使用该命令将一片森林改为沙漠，并不会把草方块变成沙子，也不会长出仙人掌，但是兔子会在新“沙漠”中生成，这片“沙漠”看起来依然像个森林。
<gallery heights="100" mode="packed" style="text-align:left">
File:Fillbiome example-before.png|使用该命令尝试将两个石头间的生物群系变为沙漠
File:Fillbiome example-after.png|可以看到，生物群系并没有按照指定的准确坐标改变
</gallery>

# 语法
   <code>/fillbiome <from> <to> <biome></code>
   <code>/fillbiome <from> <to> <biome> replace <filter></code>

# 参数
和
   指定填充区域的两个对角方块的坐标。注意：由于生物群系信息并非按方块存储，最终起效的范围不一定精准匹配给出的范围。


   指定要设置的生物群系的命名空间ID。参见[生物群系#数据值](生物群系#数据值.md)以查看所有可用的生物群系ID。


   指定要被替换的生物群系。
   若未指定，所有生物群系都将被替换。


# 结果

的设定值}}

# 输出

# 示例
* 将范围为<code>0 0 0</code>到<code>32 28 32</code>的区域的生物群系设置为恶地：<code>/fillbiome 0 0 0 32 28 32 minecraft:badlands</code>
* 将范围为<code>0 0 0</code>到<code>32 28 32</code>的区域内的虚空生物群系替换为恶地：<code>/fillbiome 0 0 0 32 28 32 minecraft:badlands replace minecraft:the_void</code>
* 将范围为<code>0 0 0</code>到<code>32 28 32</code>的区域内能自然生成远古城市的生物群系替换为恶地：<code>/fillbiome 0 0 0 32 28 32 minecraft:badlands replace #minecraft:has_structure/ancient_city</code>

# 历史

|命令。}}
|语法。}}
|游戏规则控制单次执行可更改的最大方块数。}}
}}

# 导航

[de:Befehl/fillbiome](de:Befehl/fillbiome.md)
[en:Commands/fillbiome](en:Commands/fillbiome.md)
[es:Comandos/fillbiome](es:Comandos/fillbiome.md)
[ja:コマンド/fillbiome](ja:コマンド/fillbiome.md)
[pt:Comandos/fillbiome](pt:Comandos/fillbiome.md)
[ru:Команды консоли/fillbiome](ru:Команды консоли/fillbiome.md)