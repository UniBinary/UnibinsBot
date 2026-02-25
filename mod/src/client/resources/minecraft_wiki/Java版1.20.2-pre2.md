# Java版1.20.2-pre2

*页面ID: 105704* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.20.2-pre2**是[Java版1.20.2](Java版1.20.2.md)的第2个预发布版，发布于2023年9月7日<ref></ref>，回退了上个版本对配方书搜索机制的更改，并修复了一些漏洞。

# 更改
# = 游戏内容 =
* *[配方书](配方书.md)**
* 回退了上个版本的修改。

# = 常规 =
* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>18</code>。

# 更改（实验性）
以下内容仅在创建世界时启用“”内置数据包后才会出现。

# = 常规 =
* *[标签](Java版标签.md)**
* 将结构标签移至<samp>trade_reblance</samp>内置数据包中。

# 修复
键将焦点移出命令方块的文本框。
|235762|截图宽度大于16384像素时游戏崩溃：<code>java.lang.OutOfMemoryError: Out of stack space</code>。
|249702|若<samp>banned-ips.json</samp>格式有误，服务器启动时会崩溃。
|261119|引导屏幕上的按钮没有使用独立的字符串。
|262754|<code>AbstractScrollWidget</code>中的更改破坏了<code>MultiLineEditBox</code>的单击移动光标行为。
|;dev
|264759|会错误地命令方块中为切换命令建议而按的键。
|;previous
|265237|包含任何非英语字符时，配方书的搜索功能不再能搜索到任何配方。
|265241|配方书的搜索功能不能在使用复合词不分开的语言时搜索到相关的物品。
|265243|合成配方中的不可合成的变种现在也会显示为可合成。
|265244|以浮点数输入的的参数会被转换为科学计数法。
|265245|搜索词中包含空格时，配方书的搜索功能不再能搜索到任何配方。
|265253|的值不可翻译。
|265260|放置时，船和竹筏会转向南方。
|265262|被撤销的配方会保留在配方书中，直至重新登录。
|265263|<code>enderPearlsVanishOnDeath</code>设为<code>false</code>时，末影珍珠会在客户端侧消失。
|265264|与有关的标签没有放在其专门的数据包中。
|265276|自然生成的末地水晶下方的火焰不总是正确地发光。
|265280|进入单人游戏存档时，生物有时会不可见。
}}</onlyinclude>

# 参考

# 导航

[de:1.20.2-pre2](de:1.20.2-pre2.md)
[en:Java Edition 1.20.2 Pre-release 2](en:Java Edition 1.20.2 Pre-release 2.md)
[es:Java Edition 1.20.2 Pre-release 2](es:Java Edition 1.20.2 Pre-release 2.md)
[fr:Édition Java 1.20.2 Pre-release 2](fr:Édition Java 1.20.2 Pre-release 2.md)
[ja:Java Edition 1.20.2 Pre-release 2](ja:Java Edition 1.20.2 Pre-release 2.md)
[pt:Edição Java 1.20.2 Pre-release 2](pt:Edição Java 1.20.2 Pre-release 2.md)
[uk:1.20.2 Pre-release 2 (Java Edition)](uk:1.20.2 Pre-release 2 (Java Edition).md)