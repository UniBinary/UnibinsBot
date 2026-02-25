# Java版15w32b

*页面ID: 17282* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w32b**是[Java版1.9](Java版1.9.md)的第5个快照，发布于2015年8月6日<ref></ref>，更新了记分板，并修复了[15w32a](15w32a.md)中的一些漏洞。

# 新内容
# = 常规 =
* *[记分板](记分板.md)**
* 加入 <code>players tag ...</code>命令。
* * 可以对实体/玩家增加基于NBT标签的标签。
* ** 例如{{cmd|scoreboard players tag @a add test {OnGround:0b} }}将把未在地面的玩家添加“test”标签。
* * 标签能用于目标选择器；test] stone 1}}将给有“test”标签的玩家数目为1的石头。
* * 可以用查看某个实体上的标签。（注：此版本无法用tab键补全得到list选项）。
* * 标签储存在玩家数据文件中，而不是记分板数据文件。
* ** 这意味着想要贴标签，玩家必须存在且在线，实体必须存在。
* ** 不像记分板的变量，标签不能在侧边栏或是任何地方显示。只有通过list项才能知道实体上的标签。

# 更改
# = 生物 =
* *[潜影贝](潜影贝.md)**
* 设定<code>NoAI</code>后不再传送。
* 可以用或传送了。

# = 常规 =
* *世界选择界面**
* 会显玩家最后所在位置的缩略图。
* * 如果地图未在15w32b打开过，或游戏无法得知地图最后运行时的位置，将只有一个灰色的图片。
* 在此版本未打开过的地图会有警示符号提示。
* * 同时也会提示如果地图在新版本打开过，在旧版本打开时地图可能会不可逆地出错。
* 如果地图曾在更新的版本打开过，版本号会显示为红色。
* 可以点击缩略图上的开始箭头打开地图，就像服务器那样。

# 修复
无法将非盔甲物品放入盔甲架的槽位中。
|84035|除非末影龙栖息在返回传送门上，否则玩家无法击杀末影龙。
|;previous
|85110|向末影龙射箭会导致游戏崩溃。
|85152|加载世界后命令方块矿车会消失。
}}</onlyinclude>

# 参考

# 导航

[de:15w32b](de:15w32b.md)
[en:Java Edition 15w32b](en:Java Edition 15w32b.md)
[es:Java Edition 15w32b](es:Java Edition 15w32b.md)
[fr:Édition Java 15w32b](fr:Édition Java 15w32b.md)
[it:Java Edition 15w32b](it:Java Edition 15w32b.md)
[ja:Java Edition 15w32b](ja:Java Edition 15w32b.md)
[pt:Edição Java 15w32b](pt:Edição Java 15w32b.md)
[ru:15w32b (Java Edition)](ru:15w32b (Java Edition).md)