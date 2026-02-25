# Java版1.19.1-pre2

*页面ID: 97066* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.1-pre2**是[Java版1.19.1](Java版1.19.1.md)的第二个预发布版，发布于2022年6月30日<ref></ref>，加入了聊天信任状态，对聊天类型做了更改，将服务端的<code>enforce-secure-profile</code>改为默认开启，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[聊天](聊天.md)**
* 没有被聊天安全系统签署或被服务器更改的消息现在会被标记。
* * 缺少签名或含有无效签名的消息会标记为不安全。
* * 监测到被更改的消息会标记为被更改。
* 聊天消息的信任状态会以颜色标识和图标的形式进行显示。
* * 颜色标识会始终显示。
* * 图标只会在打开聊天栏后显示。
* 鼠标悬停在图标上可以显示更多关于消息信任状态的信息。
* * 修改过的消息的原文也将显示在对应提示中。

* *[资源包](资源包.md)**
* 加入了<samp>chat_tags.png</samp>，其中包含2个与聊天消息信任状态有关的图标。

# 更改
# = 常规 =
* *[聊天](聊天.md)**
* 加入到<code>chat_types</code>注册项中的聊天类型现在只会用于玩家消息，而不用于系统消息。
* * 移除了<code>system</code>和<code>game_info</code>类型。
* 简化了聊天类型，现在只需要定义<code>chat</code>和<code>narration</code>两个参数<!-- 原文为decoration -->即可。
* * 现在不再支持叠加聊天类型。
* * 叠加效果应使用系统信息来实现。

* *<samp>[server.properties](server.properties.md)</samp>**
* <code>enforce-secure-profile</code>的默认值改为<code>true</code>。

# 修复
”菜单上。
|;previous
|253493|的描述文本再次与“描述：”文本重叠在一起。
|253495|用键选中“”菜单中的列出的内容时，显示的选择框不是白色的。
|253497|来源于实体与其他非玩家的消息可以出现在上。
|253501|“”菜单中的长消息会超出选择框和穿过滚动条。
|253517|已通过联机验证的玩家连接到未启用联机验证的服务器时，会因“”而被踢出。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.1-pre2](de:1.19.1-pre2.md)
[en:Java Edition 1.19.1 Pre-release 2](en:Java Edition 1.19.1 Pre-release 2.md)
[es:Java Edition 1.19.1 Pre-release 2](es:Java Edition 1.19.1 Pre-release 2.md)
[fr:Édition Java 1.19.1 Pre-release 2](fr:Édition Java 1.19.1 Pre-release 2.md)
[ja:Java Edition 1.19.1 Pre-release 2](ja:Java Edition 1.19.1 Pre-release 2.md)
[pt:Edição Java 1.19.1 Pre-release 2](pt:Edição Java 1.19.1 Pre-release 2.md)
[ru:1.19.1 Pre-release 2 (Java Edition)](ru:1.19.1 Pre-release 2 (Java Edition).md)