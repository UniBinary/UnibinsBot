# Java版1.17-pre3

*页面ID: 83352* | *来源: Minecraft Wiki*

|parent=1.17
|prevparent=1.16.5
|prev=1.17-pre2
|next=1.17-pre4
|nextparent=1.17.1
}}<onlyinclude>

* *1.17-pre3**是[Java版1.17](Java版1.17.md)的第3个预发布版，发布于2021年6月1日<ref></ref>，对[山羊](山羊.md)、[美西螈](美西螈.md)和[发光鱿鱼](发光鱿鱼.md)进行了部分调整，并修复了一些漏洞。

# 更改
# = 方块 =
* *[蜡烛](蜡烛.md)**
* 更改了染色蜡烛被点燃时的纹理。

# = 生物 =
* *[山羊](山羊.md)**
* 被山羊冲撞到的生物不会再尝试回击。

* *[美西螈](美西螈.md)和[发光鱿鱼](发光鱿鱼.md)**
* 现在只会在完全黑暗、且下方5格距离内有（带有<code>base_stone_overworld</code>[标签](Java版标签.md)）的水源中生成。

# = 游戏内容 =
* *[进度](进度.md)**
* 进度“[](进度#advancements-anchor-husbandry.wax_on.md)”的英文描述由“Apply Wax to a Copper block!”改为“Apply Honeycomb to a Copper block!”，中文描述由“”改为“”。

# 修复
命令放置的没有相应附着方块的藤蔓交互。
|171229|优化世界后加载动画显示不正确。
|223227|海底洞穴中的水体呈悬浮状态。
|225077|藤蔓可以向上生长到不完整方块上。
|;dev
|203773|第三人称视角下玩家握着的避雷针会浮在空中。
|215946|游戏在探索区块时出现致命崩溃<code>IllegalStateException: Accessing PalettedContainer from multiple threads</code>。
|222223|幼年美西螈会消失。
|223146|末影人手持的藤蔓不再被显示出来。
|223147|使用放置的藤蔓不会被渲染。
|225344|在（似乎）随机的区块边界上，洞穴生成存在问题。
|226441|蛋糕上点亮的蜡烛的纹理不会变化。
|226514|启动世界时出现崩溃：<code>java.lang.NullPointerException: Cannot read field "u" because "â˜ƒ" is null</code>。
|226660|关闭游戏后出现“Double closing program”警告。
|226874|生物戴上的玩家自定义头颅会闪烁。
|;previous
|226956|受重力影响的方块在规则<code>doEntityDrops</code>设为假时不会被破坏。
|226970|星星会被渲染距离的雾遮挡。
|227018|更换或重载资源包时不会重载核心着色器，只有再次重载才会生效。
}}</onlyinclude>

# 参考

# 导航

[de:1.17-pre3](de:1.17-pre3.md)
[en:Java Edition 1.17 Pre-release 3](en:Java Edition 1.17 Pre-release 3.md)
[es:Java Edition 1.17 Pre-release 3](es:Java Edition 1.17 Pre-release 3.md)
[fr:Édition Java 1.17 Pre-release 3](fr:Édition Java 1.17 Pre-release 3.md)
[ja:Java Edition 1.17 Pre-release 3](ja:Java Edition 1.17 Pre-release 3.md)
[pt:Edição Java 1.17 Pre-release 3](pt:Edição Java 1.17 Pre-release 3.md)
[ru:1.17 Pre-release 3 (Java Edition)](ru:1.17 Pre-release 3 (Java Edition).md)
[th:รุ่น Java 1.17 Pre-release 3](th:รุ่น Java 1.17 Pre-release 3.md)