# Java版1.9.3

*页面ID: 20756* | *来源: Minecraft Wiki*

* *1.9.3**是的一次次要更新，发布于2016年5月10日<ref></ref>，加入了一条新的命令，并修复了一些漏洞。此版本不兼容1.9到1.9.2的服务端。

# 新内容
* *[命令](命令.md)**
* 新命令：
* * 它允许玩家选择停止播放哪一种具体的声音。
* * 用法：<code>/stopsound <nowiki><player></nowiki> [source] [sound]</code>

# 更改
* *[命令](命令.md)**
* 不会再把玩家传送到y轴-512至512以外的地方。

* *网络**
* 这个版本发布以后，Minecraft使用的[Netty](http://netty.io/)网络库现在会在连接到多人游戏服务器时检查https://sessionserver.mojang.com/blockedservers，还有服务器如果在被封禁的服务器列表上时，它会向用户报告这个服务器不可用。
* * 封禁列表由违反了[EULA](EULA.md)（最终用户协议）的服务器组成。
* * 这会影响依赖Netty网络库的所有版本，回退到[1.7.2](版本记录.md)版本。
* 更好的内存用于寻找路径和[生物群系](生物群系.md)缓存。
* * 这可以防止内存溢出。

# 修复
命令传送到很高负值的高度时会导致游戏存档损坏。
|100442|导航侦听器使用了非常慢的代码。
|otherissuescount=1
}}
* *其他修复**
* 修复了一个潜在的流动的水或熔岩的崩溃漏洞。<ref></ref>

# 参考

# 导航

[de:1.9.3](de:1.9.3.md)
[en:Java Edition 1.9.3](en:Java Edition 1.9.3.md)
[es:Java Edition 1.9.3](es:Java Edition 1.9.3.md)
[fr:Édition Java 1.9.3](fr:Édition Java 1.9.3.md)
[ja:Java Edition 1.9.3](ja:Java Edition 1.9.3.md)
[nl:1.9.3](nl:1.9.3.md)
[pl:1.9.3](pl:1.9.3.md)
[pt:Edição Java 1.9.3](pt:Edição Java 1.9.3.md)
[ru:1.9.3 (Java Edition)](ru:1.9.3 (Java Edition).md)