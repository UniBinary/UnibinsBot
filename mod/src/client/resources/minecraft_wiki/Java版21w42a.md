# Java版21w42a

*页面ID: 90331* | *来源: Minecraft Wiki*

<onlyinclude>

* *21w42a**是[Java版1.18](Java版1.18.md)的第6个快照，发布于2021年10月20日<ref></ref>，加入了新的[音乐](音乐.md)曲目和[音乐唱片](音乐唱片.md)，微调了一些[地物](地物.md)的生成，同时修复了一些漏洞。

# 新内容
# = 物品 =
* *[音乐唱片](音乐唱片.md)**
* 加入了音乐唱片otherside，作者为[Lena Raine](Lena Raine.md)。
* * 能够罕见地在[要塞](要塞.md)走廊战利品祭坛的箱子或[地牢](地牢.md)的箱子中找到。

# = 常规 =
* *[音乐](音乐.md)**
* 加入了8首新的音乐<ref group="注">发布到了所有1.18快照中。</ref>，会在[主世界](主世界.md)生存模式和[菜单屏幕](菜单屏幕.md)中播放：
* * 曲目“Stand Tall”“Left to Bloom”“Wending”“Infinite Amethyst”和“One More Day”的作者是Lena Raine。
* ** “Stand Tall”会在[积雪山坡](积雪山坡.md)、[尖峭山峰](尖峭山峰.md)、[冰封山峰](冰封山峰.md)和[裸岩山峰](裸岩山峰.md)中，以及菜单屏幕中播放。
* ** “Left to Bloom”会在[草甸](草甸.md)和[繁茂洞穴](繁茂洞穴.md)中，以及菜单屏幕中播放。
* ** “Wending”会在[雪林](雪林.md)、尖峭山峰、裸岩山峰和[溶洞](溶洞.md)中，以及菜单屏幕中播放。
* ** “Infinite Amethyst”会在雪林和溶洞中，以及菜单屏幕中播放。
* ** “One More Day”会在草甸、积雪山坡和繁茂洞穴中，以及菜单屏幕中播放。
* * 曲目“Floating Dream”“Comforting Memories”和“An Ordinary Day”的作者是[谷冈久美](谷冈久美.md)。
* ** “Floating Dream”会在尖峭山峰和繁茂洞穴中播放。
* ** “Comforting Memories”会在雪林中播放。
* ** “An Ordinary Day”会在积雪山坡、溶洞和繁茂洞穴中播放。

* *[选项](选项.md)**
* 在视频设置中加入了适用于单人游戏的“自动保存指示器”选项，以打开或关闭指示器显示。
* * 指示器会在游戏保存世界时在屏幕右下方显示。

* *[粒子](粒子.md)**
* 加入了<code>block_marker</code>粒子，取代了<code>light</code>和<code>barrier</code>。
* * 会为已分配给已配置方块状态的模型，按照<code>particle</code>槽位中所声明的纹理渲染。<!-- Renders with texture declared in <code>particle</code> slot for model assigned to configured block state. -->
* * 可以使用与<code>block</code>粒子相同的语法（即<code>block_marker wheat[age=2]</code>）生成。

# 更改
# = 世界生成 =
* *[矿石](矿石.md)分布**
* 恶地[金矿石](金矿石.md)的生成高度上限由Y=79提高到Y=256，并增加了其团簇的生成频率。

* *[涌泉](涌泉.md)**
* 现在熔岩泉能在[方解石](方解石.md)、[泥土](泥土.md)、[雪块](雪块.md)、[细雪](细雪.md)和[浮冰](浮冰.md)之中生成，因此可以生成于[雪林](雪林.md)、[积雪山坡](积雪山坡.md)、[尖峭山峰](尖峭山峰.md)、[冰封山峰](冰封山峰.md)和[裸岩山峰](裸岩山峰.md)的地表。
* 水泉不再在Y=192以上生成，并且生成频率略微降低。

# = 常规 =
* *玩家[生成](生成.md)**
* 重新设计了世界出生点算法。
* * 现在会根据与控制生物群系放置和世界生成一致的气候参数来选取。玩家不应再会在[海洋](海洋.md)或其他不方便活动的地方出生。

# 修复
8 Z8处出生。
|185033|单一生物群系世界会出现地下出生点。
|185034|未设置出生点时总在相同方块上重生。
|198232|音乐播放频率比以前低。
|202166|“合成次数”统计项不总是正确显示数据。
|214288|当<code>min_y</code>值大于0时，玩家不能在地表出生。
|221641|洞穴可使海底峡谷生成时不充水。
|233771|趋同事项：手持物品形式的光源方块时，已放置的不显示其光照等级。
|;dev
|236837|新世界时，玩家偶尔会出生在地下。
|238582|沙漠和海洋之间会生成沙滩。
}}</onlyinclude>

# 注释

# 参考

# 导航

[de:21w42a](de:21w42a.md)
[en:Java Edition 21w42a](en:Java Edition 21w42a.md)
[es:Java Edition 21w42a](es:Java Edition 21w42a.md)
[fr:Édition Java 21w42a](fr:Édition Java 21w42a.md)
[it:Java Edition 21w42a](it:Java Edition 21w42a.md)
[ja:Java Edition 21w42a](ja:Java Edition 21w42a.md)
[lzh:二一週四二甲](lzh:二一週四二甲.md)
[pt:Edição Java 21w42a](pt:Edição Java 21w42a.md)
[ru:21w42a (Java Edition)](ru:21w42a (Java Edition).md)
[th:รุ่น Java 21w42a](th:รุ่น Java 21w42a.md)