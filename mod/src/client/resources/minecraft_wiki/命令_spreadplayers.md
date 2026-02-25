# 命令/spreadplayers

*页面ID: 39815* | *来源: Minecraft Wiki*

把[实体](实体.md)随机传送到区域内地表的某个位置。

# 用法
实体总是会被传送到某个位置最顶部的非[空气](空气.md)方块上。在<code>under</code>模式下，实体则被传送到指定的最大高度之下的、上方有两格空气的最高的非空气方块上。若没有所述方块，则此水平坐标位置无效。

实体总是会被传送到某个位置最顶部的固体方块上方距离一格的位置。若使用 <code>maxHeight: value</code>参数，实体则被传送到指定的最大高度之下的最高的固体方块上。若没有所述固体方块，则此水平坐标位置无效。若所述固体方块上方没有两格空气，则此水平坐标位置亦无效。

[熔岩](熔岩.md)、[水](水.md)、[气泡柱](气泡柱.md)或[火](火.md)上不是有效位置，实体不会被传送到其上。除此之外，[岩浆块](岩浆块.md)、[凋灵玫瑰](凋灵玫瑰.md)、[营火](营火.md)、[灵魂营火](灵魂营火.md)、[甜浆果丛](甜浆果丛.md)、[下界传送门](下界传送门（方块）.md)、[末地传送门](末地传送门（方块）.md)和[末地折跃门](末地折跃门（方块）.md)也不是有效位置。

实体将在命令的执行维度扩散。该命令仅更改实体的坐标，而不改变维度，但有效位置仍基于命令的执行维度判断。

如果没任何有效位置，或有效位置无法满足最小间距（<code><spreadDistance></code>或<code>spreadDistance: float</code>）的要求，没有任何实体会被传送。

# 语法
* **Java版**
   <code>spreadplayers &lt;center&gt; <spreadDistance> <maxRange> <respectTeams> <targets></code>
  : 随机传送指定实体到最顶部的非空气方块上。
   <code>spreadplayers &lt;center&gt; <spreadDistance> <maxRange> under <maxHeight> <respectTeams> <targets></code>
  : 随机传送指定实体到指定的最大高度（<code><maxHeight></code>）之下的最高的、上方有两格空气的非空气方块上。

* **基岩版**
   <code>spreadplayers <x: value> <z: value> <spreadDistance: float> <maxRange: float> <victim: target> [maxHeight: value]</code>

# 参数
：<br>
：和
   指定传送目的地区域的中心。


   指定传送目标之间的最小间距。
   应该大于等于0.0。

   指定目标区域边界与区域中心在X和Z轴上的距离（因此区域是正方形而不是圆形）。
   应至少比<code>spreadDistance: float</code>大1.0。

：
   同队成员在传送后会不会出现在一起。如果为<code>true</code>，同队的实体会被传送到同一个位置。


：<br>
：
   若指定，限制传送位置的最大高度。



   指定需要随机传送的目标。


# 结果

# 输出

# 示例
* 传送所有玩家到以(0,0)为中心，大小为1,000×1,000的区域中的一个随机的地点，同队的玩家聚集在一起，且每队之间最小的间隔为200格：
  : <code>spreadplayers 0 0 200 500 true @a</code>

* 从同一队伍（Red）中选取所有实体，传送至以(0,0)为中心，最大高度为80，大小为200×200的区域中，且该队伍实体之间最小的间隔为50格：
  : <code>spreadplayers 0 0 50 100 under 80 false @e[team=Red]</code>

* 把所有玩家传送到以(10,10)为中心的区域内，传送半径为10格，最小间距为1格，最大高度为100：
  : <code>spreadplayers 10 10 1 10 @a 100</code>

# 历史

|。}}
|
|</ref>}}
|
|。}}
|
|
}}

# 参见
* （别名） — 传送实体到指定位置。

# 参考

# 导航

[de:Befehl/spreadplayers](de:Befehl/spreadplayers.md)
[en:Commands/spreadplayers](en:Commands/spreadplayers.md)
[ja:コマンド/spreadplayers](ja:コマンド/spreadplayers.md)
[pt:Comandos/spreadplayers](pt:Comandos/spreadplayers.md)
[ru:Команды консоли/spreadplayers](ru:Команды консоли/spreadplayers.md)
[uk:Команди консолі/spreadplayers](uk:Команди консолі/spreadplayers.md)