# Java版17w14a

*页面ID: 28932* | *来源: Minecraft Wiki*

<onlyinclude>

* *17w14a**是[Java版1.12](Java版1.12.md)的第4个快照，发布于2017年4月5日<ref></ref>，更改了一些特性，并修复了一些漏洞。

# 更改
# = 生物 =
* *[鹦鹉](鹦鹉.md)**
* 它们坐在玩家肩膀上时会发出声音。
* 附近有[唱片机](唱片机.md)播放音乐时，鹦鹉会跳舞并变色。
* 右键功能改变：
* * 右键点击一只驯化的鹦鹉会命令它坐下。
* 玩家从鹦鹉所在位置走过时，鹦鹉就会坐到玩家的肩膀上。

* *[僵尸](僵尸.md)**
* 新的<code>ConversionPlayerLeast</code>和<code>ConversionPlayerMost</code>标签：
* * 玩家治疗僵尸村民时，僵尸村民会记录玩家的UUID。
* * 使用“minecraft:cured_zombie_villager”触发该进度。

# = 常规 =
* *[进度](进度.md)**
* 加入了新的进度，包括一个新的“冒险”页面。
* 玩家完成进度时会弹出提示框。
* * 新的弹出效果。
* * 有两种颜色，完成普通进度时为黄色，完成“挑战”进度时为紫色。

* *[配方书](配方书.md)**
* 触发按钮的图标由一本普通的书变为[知识之书](知识之书.md)。
* 按下Shift时左键单击一个配方可以将所有可用的原材料放入合成方格了。
* 加入了一个灰白色的提示框，当玩家解锁新合成配方时会弹出。
* * 重新加载世界时提示框才会弹出；[Dinnerbone](Dinnerbone.md)已确认这是个漏洞。<ref>https://www.reddit.com/r/Minecraft/comments/63lprq/snapshot_17w14a_out_for_testing/dfv6qw0/?context=1</ref>
* 如果在配方书内搜索“excited”，玩家的游戏语言会变成海盗语。

* *[NBT标签](NBT标签.md)**
* <code>recipeBook</code>：现在使用复合标签（以前是字符串）来存储配方书的信息。
* * <code>isFilteringCraftable</code>：当玩家开启配方书的“仅显示可合成”功能时，该值变为1。
* * <code>isGuiOpen</code>：检查GUI是否在打开状态。
* ** <code>unlocked</code>
* * <code>recipes</code>：包含玩家看过的所有合成表的信息。
* ** <code>displayed</code>：检查玩家已经在配方书内打开过了哪些合成配方。

* *[闪烁标语](闪烁标语.md)**
* “Now Java 6!”改为了“Now Java 8!”。

# 修复
中有无效的玩家参数时，会导致未知错误。
|114999|物品悬浮的文字会被显示在合成提示的下面。
|115028|合成配方会显示在背包界面中的物品上方。
|115054|背包关闭后，配方界面不保存选择了“显示全部”还是“显示可合成”的设置。
|115065|进度中的战利品奖励不给物品了。
|115067|进度中所有实体匹配条件的实例都不工作。
|115074|药水效果仍然会在配方书的下方显示。
|115100|合成提示中物品提示框中的文本和文本框与在物品栏中所使用的不同。
|115107|使用自动配方功能后，头盔不渲染。
|115129|配方书显示的缺少的物品会显示在物品提示框前面。
|115153|命令的第一个参数无效时，命令不显示错误信息。
|115175|新合成菜单有纹理问题。
|115204|背包满时，取消或更换配方书里的配方导致游戏崩溃。
|;previous
|115191|鹦鹉在通过传送门离开末地后会完全消失。
|115209|合成配方书不计算物品数量。
|115409|被拴到栅栏上的鹦鹉可以坐到玩家的肩膀上。
}}</onlyinclude>

# 参考

# 导航

[de:17w14a](de:17w14a.md)
[en:Java Edition 17w14a](en:Java Edition 17w14a.md)
[es:Java Edition 17w14a](es:Java Edition 17w14a.md)
[fr:Édition Java 17w14a](fr:Édition Java 17w14a.md)
[it:Java Edition 17w14a](it:Java Edition 17w14a.md)
[ja:Java Edition 17w14a](ja:Java Edition 17w14a.md)
[nl:17w14a](nl:17w14a.md)
[pt:Edição Java 17w14a](pt:Edição Java 17w14a.md)
[ru:17w14a (Java Edition)](ru:17w14a (Java Edition).md)