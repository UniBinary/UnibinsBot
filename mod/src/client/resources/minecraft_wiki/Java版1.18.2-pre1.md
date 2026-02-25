# Java版1.18.2-pre1

*页面ID: 93191* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.18.2-pre1**是[Java版1.18.2](Java版1.18.2.md)的首个预发布版，发布于2022年2月18日<ref></ref>，改进了与[结构](结构.md)有关的标签和命令，更新了[数据包](数据包.md)，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了以下结构地物标签：
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。

# 更改
# = 生物 =
* *[海豚](海豚.md)**
* 会更准确地选择离其最近的结构，而无论结构的类型如何。

# = 世界生成 =
* *[堡垒遗迹](堡垒遗迹.md)**
* 稍微提高了结构边界箱的准确度，现在会更贴近结构本身的形状。

# = 命令格式 =
* ***
* 现在支持标签，用<code>#</code>前缀与一般的ID做区分。
* 参数类型由结构类型（Structure Type）改为配置的结构（Configured Structure）。
* * 例如现在可以执行像或这样的命令。
* 定位指定结构类别的旧用法现在改由定位指定标签来完成。
* * 例如现在变成了。

* ***
* 现在支持标签，用<code>#</code>前缀与一般的ID做区分。
* * 例如现在可以执行像这样的命令。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本由<code>8</code>提高到<code>9</code>。
* 现在可在实验性数据包中添加自定义结构，即游戏现在可生成并存储由数据驱动的配置的结构。
* * 现在可在实验性数据包中添加新结构集。
* * <code>location_predicates</code>中<code>feature</code>字段现在引用的是一个配置地物。
* * <code>exploration_map</code>战利品表函数中<code>destination</code>字段现在是一个配置地物标签ID。
* * <code>exploration_map</code>战利品表函数现在不再自动设置地图的显示名称。
* 现在可通过数据包对一些洞穴生成机制进行配置。
* * 向[密度函数](密度函数.md)中加入了一个新注册表（Registry）（洞穴由它们组合在一起生成）。
* * 向噪声设置中加入了<code>noise_router</code>字段，同时移除了许多布尔字段。
* ** 详情请参阅worldgen report中的<samp>worldgen/noise_settings</samp>文件夹。
* * Noise Router会将数据驱动型洞穴生成机制与其余的代码部分连接起来。

* *常规**
* 由于对32位运行环境的操作系统即将结束支持，在主菜单上向使用该环境启动游戏的用户加入了警告信息。

# 修复
定位到的要塞位置上实际没有生成要塞。
|;1.18的漏洞
|241288|对自定义结构的支持被移除。
|244137|<samp>server.properties</samp>中默认不含<code>level-seed</code>选项。
|;1.18.1的漏洞
|245850|在多人游戏警告界面使用键时，选中的位置会不按顺序选中。
|;dev
|248532|双持烟花时，鞘翅烟花粒子会在错误的手上生成。
}}</onlyinclude>

# 参考

# 导航

[de:1.18.2-pre1](de:1.18.2-pre1.md)
[en:Java Edition 1.18.2 Pre-release 1](en:Java Edition 1.18.2 Pre-release 1.md)
[es:Java Edition 1.18.2 Pre-release 1](es:Java Edition 1.18.2 Pre-release 1.md)
[fr:Édition Java 1.18.2 Pre-release 1](fr:Édition Java 1.18.2 Pre-release 1.md)
[ja:Java Edition 1.18.2 Pre-release 1](ja:Java Edition 1.18.2 Pre-release 1.md)
[pt:Edição Java 1.18.2 Pre-release 1](pt:Edição Java 1.18.2 Pre-release 1.md)
[ru:1.18.2 Pre-release 1 (Java Edition)](ru:1.18.2 Pre-release 1 (Java Edition).md)