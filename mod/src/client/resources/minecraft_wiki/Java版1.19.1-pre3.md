# Java版1.19.1-pre3

*页面ID: 97147* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.1-pre3**是[Java版1.19.1](Java版1.19.1.md)的第三个预发布版，发布于2022年7月6日<ref></ref>，加入了一条纪念[Technoblade](Technoblade.md)的[闪烁标语](闪烁标语.md)，对[聊天](聊天.md)功能做了一些调整，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[闪烁标语](闪烁标语.md)**
* 加入了“Technoblade never dies!”，用以纪念[Technoblade](Technoblade.md)。

# 更改
# = 常规 =
* *[聊天](聊天.md)**
* 将聊天栏滚动条移至聊天窗格的右侧。
* 系统消息现在会以灰色标记。
* 聊天类型<code>msg_command</code>被拆分为<code>msg_command_incoming</code>和<code>msg_command_outgoing</code>。
* 聊天类型参数<code>team_name</code>重命名为<code>target</code>。
* * 此聊天类型参数现在由聊天类型<code>msg_command_outgoing</code>使用。

* *协议**
* 第三方服务端现在可通过一种新的网络设置其自身的用于普通聊天内容的自动补全选项。

* *[社交屏幕](社交屏幕.md)**
* 现在最近一个发送消息的玩家会被放在玩家列表的最上方。
* 更改了下列举报类型的描述：
* *
* ** 旧描述：
* ** 新描述：-{zh-cn: Someone is shaming, attacking, or bullying you or someone else. This includes when someone is repeatedly trying to contact you or someone else without consent or posting private personal information about you or someone else without consent <ins class="tc-yes">("doxing")</ins>.; zh-tw: 有人羞辱、攻擊、霸凌你或其他人。包含違反您或其他人意願，不斷聯絡騷擾或是散布個人資料（即「肉搜」）。; zh-hk: 有人羞辱、攻擊或欺凌你或其他人。包括未經容許嘅情況下頻繁聯繫你或其他人，以及發佈涉及你或其他人嘅私隱資訊（即「起底」）。}-
* * <!-- 请勿换成“自杀”分类，语言文件如此（见MC-253997） -->
* ** 旧描述：
* ** 新描述：
* * 恐怖主义或暴力极端主义
* ** 旧描述：-{zh-cn: Someone is talking about, promoting, or threatening <del class="tc-no">to commit</del> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.; zh-tw: 有人正在因為政治、宗教、思想等其他原因，談論、推廣或威脅實行恐怖主義或極端暴力。; zh-hk: Someone is talking about, promoting, or threatening <del class="tc-no">to commit</del> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.}-
* ** 新描述：-{zh-cn: Someone is talking about, promoting, or threatening <ins class="tc-yes">with</ins> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.; zh-tw: 有人基於政治立場、宗教信仰、意識形態等原因，討論、推廣或恐嚇從事恐怖活動、極端暴力。; zh-hk: Someone is talking about, promoting, or threatening <ins class="tc-yes">with</ins> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.}-

# 修复
发出的消息会被计入举报系统中。
|;previous
|253742|聊天栏滚动条会与显示聊天信任状态的颜色标识相重叠。
|253773|私聊消息会显示为被服务器修改。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.1-pre3](de:1.19.1-pre3.md)
[en:Java Edition 1.19.1 Pre-release 3](en:Java Edition 1.19.1 Pre-release 3.md)
[es:Java Edition 1.19.1 Pre-release 3](es:Java Edition 1.19.1 Pre-release 3.md)
[fr:Édition Java 1.19.1 Pre-release 3](fr:Édition Java 1.19.1 Pre-release 3.md)
[ja:Java Edition 1.19.1 Pre-release 3](ja:Java Edition 1.19.1 Pre-release 3.md)
[lzh:爪哇版一點一九點一之預三](lzh:爪哇版一點一九點一之預三.md)
[pt:Edição Java 1.19.1 Pre-release 3](pt:Edição Java 1.19.1 Pre-release 3.md)
[ru:1.19.1 Pre-release 3 (Java Edition)](ru:1.19.1 Pre-release 3 (Java Edition).md)