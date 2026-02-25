# 自定义Boss栏存储格式

*页面ID: 185230* | *来源: Minecraft Wiki*

* *自定义Boss栏存储文件**是游戏存储自定义[Boss栏](Boss栏.md)所用的文件。

# 存储格式
自定义Boss栏存储文件位于{{filepath|-{}-<*存档根目录*>/data/minecraft/custom_boss_events.dat}}。

自定义Boss栏存储文件使用GZip压缩的[NBT](NBT.md)文件格式保存，其内部有下列NBT结构：

<div class="treeview">
*  根标签
* * ：存储数据。
* ** ：一项自定义Boss栏数据。
* *** ：Boss栏的颜色代码，可以为<code>pink</code>（粉色）、<code>blue</code>（蓝色）、<code>red</code>（红色）、<code>green</code>（绿色）、<code>yellow</code>（黄色）、<code>purple</code>（紫色）和<code>white</code>（白色）。
* *** ：Boss栏是否创建世界迷雾效果。
* *** ：Boss栏是否会使天空变得黯淡。
* *** ：Boss栏的最大值。
* *** ：（[文本组件](文本组件.md)）Boss栏所显示的文本。
* *** ：Boss栏的显示样式。可以的值有<code>progress</code>（完整进度条）、<code>notched_6</code>（进度条分为6段）、<code>notched_10</code>（进度条分为10段）、<code>notched_12</code>（进度条分为12段）和<code>notched_20</code>（进度条分为20段）。
* *** ：Boss栏是否播放boss音乐。
* *** ：可以看见Boss栏的玩家列表。
* **** : （[UUID](UUID.md)）一个玩家。
* *** ：Boss栏的当前值。
* *** ：Boss栏是否对列表中的玩家可见。
* * ：保存此自定义Boss栏存储文件的游戏的[数据版本](数据版本.md)。如果此项不存在则游戏认为此项是1343（[Java版1.12.2](Java版1.12.2.md)）。
</div>

# 存储行为
加载存档时，如果不存在自定义Boss栏存储文件，则游戏会自动生成新文件。

自定义Boss栏的所有数据由命令管理，游戏只会在存档保存时更新此文件。

# 历史

|中。}}
}}

# 导航