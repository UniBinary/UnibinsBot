# Java版1.20-pre7

*页面ID: 104354* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.20-pre7**是[Java版1.20](Java版1.20.md)的第7个，也是最后一个预发布版，发布于2023年5月29日<ref></ref>，加入了适用于文件夹内符号链接的白名单机制，并修复了一个漏洞。

# 更改
# = 常规 =
* *[标签](Java版标签.md)**
* 向方块和物品标签中加入了。
* 向方块和物品标签中加入了。

* *常规**
* 为提升安全性，游戏现在会检测文件夹内的。
* * 如果符号链接指向的目标不在用户配置的白名单内，游戏将不会加载世界。
* ** 世界文件夹自身可被链接。
* * 允许的符号链接目标存储于客户端或服务端文件夹顶层的文件里。
* * 此文件由符合以下格式的条目（每行一个）组成：
* ** 起始的行是注释行，并会被忽略。
* ** 格式：，可以是、或。
* *** 可匹配上开头包含此字符串的路径。例如可以匹配上这些路径。
* *** 将正则表达式与整个路径相匹配。
* *** 执行与操作系统有关的匹配模式。例如通常可以匹配上所有扩展名为的文件。
* *** 路径分隔符与系统有关。
* ** 格式：，默认类型为。

# 修复
方块和物品标签。
}}</onlyinclude>

# 参考

# 导航

[de:1.20-pre7](de:1.20-pre7.md)
[en:Java Edition 1.20 Pre-release 7](en:Java Edition 1.20 Pre-release 7.md)
[es:Java Edition 1.20 Pre-release 7](es:Java Edition 1.20 Pre-release 7.md)
[fr:Édition Java 1.20 Pre-release 7](fr:Édition Java 1.20 Pre-release 7.md)
[ja:Java Edition 1.20 Pre-release 7](ja:Java Edition 1.20 Pre-release 7.md)
[lzh:爪哇版一點二〇之預七](lzh:爪哇版一點二〇之預七.md)
[pt:Edição Java 1.20 Pre-release 7](pt:Edição Java 1.20 Pre-release 7.md)
[ru:1.20 Pre-release 7 (Java Edition)](ru:1.20 Pre-release 7 (Java Edition).md)
[uk:1.20 Pre-release 7 (Java Edition)](uk:1.20 Pre-release 7 (Java Edition).md)