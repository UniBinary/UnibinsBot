# Java版1.18-pre3

*页面ID: 90832* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.18-pre3**是[Java版1.18](Java版1.18.md)的第3个预发布版，发布于2021年11月17日<ref></ref>，修复了一些漏洞。

# 更改
# = 常规 =
* *[服务器](服务器.md)**
* 现在在启动<samp>server.jar</samp>时指定了空的<code>bundlerMainClass</code>属性时，服务端会只校验并解压文件，然后退出。

# 修复
-64处的方块上不产生相应粒子。
|196423|雨打在世界底部的方块上不播放相应声音。
|223840|洞穴从熔岩含水层下方穿过时，由熔岩含水层生成的熔岩方块不会被更新。
|240229|在特定高度范围的方块上会同时下雨和下雪。
|;dev
|236740|在尝试使用命令或打开/破坏一个内有地图的箱子时，有时服务端侧会有短暂的卡顿。
|236764|光照更新落后于世界生成过程。
|239397|熔岩涌泉可以在冰山上生成。
|239610|1.18快照在反序列化区块时，世界会被严重损坏，而同样的操作在1.17中正常。
|239682|内存耗尽导致崩溃：世界生成耗尽Java堆空间。
|239950|地物放置时不检测生物群系，导致不必要的卡顿。
|240483|雪林中生成的狐狸不是雪地变种。
|240589|玩家飞行并加载区块时，游戏会卡住几分钟然后崩溃。
|241245|生成出的深板岩会覆盖矿石团簇（主要是铁矿石团簇）。
|241255|游戏在运行几分钟后性能会大幅下降。
|241352|服务端和客户端中的目录结构不一致。
}}</onlyinclude>

# 参考

# 导航

[de:1.18-pre3](de:1.18-pre3.md)
[en:Java Edition 1.18 Pre-release 3](en:Java Edition 1.18 Pre-release 3.md)
[es:Java Edition 1.18 Pre-release 3](es:Java Edition 1.18 Pre-release 3.md)
[fr:Édition Java 1.18 Pre-release 3](fr:Édition Java 1.18 Pre-release 3.md)
[ja:Java Edition 1.18 Pre-release 3](ja:Java Edition 1.18 Pre-release 3.md)
[pt:Edição Java 1.18 Pre-release 3](pt:Edição Java 1.18 Pre-release 3.md)
[ru:1.18 Pre-release 3 (Java Edition)](ru:1.18 Pre-release 3 (Java Edition).md)
[th:รุ่น Java 1.18 Pre-release 3](th:รุ่น Java 1.18 Pre-release 3.md)