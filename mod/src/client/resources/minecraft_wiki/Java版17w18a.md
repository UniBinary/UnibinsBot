# Java版17w18a

*页面ID: 29675* | *来源: Minecraft Wiki*

（）

|parent=1.12
|prevparent=1.11.2
|prev=17w17b
|next=17w18b
|nextparent=1.12.1
}}<onlyinclude>

* *17w18a**是[Java版1.12](Java版1.12.md)的第10个快照，发布于2017年5月3日<ref></ref>，加入了新的进度及进度触发器、1条新的游戏规则，以及新的命令，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[进度](进度.md)**
* 重新添加当玩家完成进度时的聊天栏提示。
* * 像以前的[成就](成就/Java版.md)一样，会悬停显示描述。
* 添加了新的冒险进度：
* *  - [驯服](生物.md)一个动物
* *   - 使两只动物[繁殖](繁殖.md)
* *  - 繁殖所有动物！(要求[绵羊](绵羊.md)、[牛](牛.md)、[猪](猪.md)、[兔子](兔子.md)、[鸡](鸡.md)、[马](马.md)、[狼](狼.md)、[豹猫](豹猫.md)、[哞菇](哞菇.md)和[羊驼](羊驼.md)）
* 加入<code>minecraft:tick</code>触发器。
* * 对玩家而言，每一刻都是激活的，前提是下一刻开始前进度已经撤销。
* 加入<code>minecraft:tame_animal</code>触发器。
* * 玩家驯服动物时激活，<code>entity</code>条件能够被指定用来检查动物是否被驯服。
* 加入<code>show_toast</code>显示选项。
* * 可选的布尔值默认为，当为时、一个进度满足时，被指定的进度不会有气泡提示。
* 加入<code>announce_to_chat</code>显示选项。
* * 可选的布尔值默认为，当为时，指定的进度不会在所有玩家都能见到的聊天中通知满足条件的玩家。

# = 命令 =
*
* * 默认为。
* * 切换进度的通知，取代了。
*
* * 用于重新加载硬盘内的[进度](进度.md)与[战利品表](战利品表.md)。
* * 单人游戏中有[管理员](管理员.md)权限的玩家，或多人游戏中的op才能使用这个命令。
* * 不能用[命令方块](命令方块.md)执行。

# 更改
# = 方块 =
* *[命令方块](命令方块.md)**
* 优化命令方块中的错误状况。

* *[TNT](TNT.md)**
* 现在侧面可以放置[绊线钩](绊线钩.md)，但绊线钩会在收到[方块更新](方块更新.md)时掉落。

# = 物品 =
* *[地图](地图.md)**
* 再次改变地图周围的颜色。
* * 恢复地图中的羊毛颜色。
* * 旗帜一类的染色方块在地图上的显示使用新的陶瓦调色板。

# = 常规 =
* *[进度](进度.md)**
* "entity"对象和<code>minecraft:levitation</code>触发器现在使用一个共享的"distance"对象。
* * 检查玩家是否制定范围的里面或外面通过<code>x</code>、<code>y</code>或<code>z</code>轴（在任何一个正或负方向）。
* * <code>absolute</code>和<code>horizontal</code>范围会检查玩家是否在所有轴范围内，而<code>horizontal</code>会排除Y轴在外。
* 更改了“这上面的风景不错”进度的条件，现在是上浮50个方块。
* 更改了“狙击手的对决”进度，现在是横向距离。
* JSON里进度的加载变严格了。

* *[复述功能](复述功能.md)**
* 复述功能优化，可以为更多人运行。

* *[配方书](配方书.md)**
* 优化了配方书。
* 如果在配方书内搜索“excitedze”，游戏语言会被切换为海盗语。
* * 搜索“excited”将不再会这样。

# 修复

# 重新上传
该版本于14:50（UTC）被重新上传，原因未知。</onlyinclude>

# 参考

# 导航

[Category:重新上传过的版本](Category:重新上传过的版本.md)

[de:17w18a](de:17w18a.md)
[en:Java Edition 17w18a](en:Java Edition 17w18a.md)
[es:Java Edition 17w18a](es:Java Edition 17w18a.md)
[fr:Édition Java 17w18a](fr:Édition Java 17w18a.md)
[it:Java Edition 17w18a](it:Java Edition 17w18a.md)
[ja:Java Edition 17w18a](ja:Java Edition 17w18a.md)
[nl:17w18a](nl:17w18a.md)
[pt:Edição Java 17w18a](pt:Edição Java 17w18a.md)
[ru:17w18a (Java Edition)](ru:17w18a (Java Edition).md)