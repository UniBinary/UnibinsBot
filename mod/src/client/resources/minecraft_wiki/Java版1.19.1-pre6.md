# Java版1.19.1-pre6

*页面ID: 97318* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.1-pre6**是[Java版1.19.1](Java版1.19.1.md)的第六个，也是最后一个预发布版，发布于2022年7月20日<ref></ref>，对[幽匿催发体](幽匿催发体.md)和[幽匿感测体](幽匿感测体.md)做了一些调整，并修复了一些漏洞。

# 更改
# = 方块 =
* *[幽匿催发体](幽匿催发体.md)**
* 现在被破坏后会掉落而不是。

# = 命令格式 =
* *[命令](命令.md)**
* 文本组件的<code>run_command</code>事件不再支持任何可发送聊天消息的命令。
* * 使用命令可以实现对应的功能。

=== 常规 ===
* *[聊天](聊天.md)**
* 对聊天消息签署情况的颜色标识做了调整。
* * 被签署的消息由绿色改为浅蓝色。
* * 待签署的消息由橙色改为浅黄色。

# 修复
中引用不存在的谓词会<code>java.lang.NullPointerException</code>异常。
|252265|在一些服务器上，<code>--server</code>参数会<code>java.lang.NullPointerException</code>异常，并导致崩溃。
|;1.19的漏洞
|252190|玩家抛掷物品是否产生振动，取决于玩家在物品触地时是否处于潜行状态，而不是扔出物品时是否处于潜行状态。
|252258|除非由潜行玩家掷出，物品形式的羊毛和地毯会产生振动。
|253402|玩家死亡的同时，用+鼠标右键将快捷栏中的物品放入箱子时，游戏崩溃。
|254349|在第三方服务端上，将染料放入织布机会导致客户端崩溃。
|;previous
|254255|睡觉时，不能在处于“”模式下的聊天预览中输入文本。
|254261|睡觉时，聊天预览的背景框会显示在“”按钮后面。
|254284|发送带无效消息类型ID的聊天会导致游戏崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.1-pre6](de:1.19.1-pre6.md)
[en:Java Edition 1.19.1 Pre-release 6](en:Java Edition 1.19.1 Pre-release 6.md)
[es:Java Edition 1.19.1 Pre-release 6](es:Java Edition 1.19.1 Pre-release 6.md)
[fr:Édition Java 1.19.1 Pre-release 6](fr:Édition Java 1.19.1 Pre-release 6.md)
[ja:Java Edition 1.19.1 Pre-release 6](ja:Java Edition 1.19.1 Pre-release 6.md)
[lzh:爪哇版一點一九點一之預六](lzh:爪哇版一點一九點一之預六.md)
[pt:Edição Java 1.19.1 Pre-release 6](pt:Edição Java 1.19.1 Pre-release 6.md)
[ru:1.19.1 Pre-release 6 (Java Edition)](ru:1.19.1 Pre-release 6 (Java Edition).md)