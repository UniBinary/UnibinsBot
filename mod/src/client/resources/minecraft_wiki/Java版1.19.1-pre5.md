# Java版1.19.1-pre5

*页面ID: 97266* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.1-pre5**是[Java版1.19.1](Java版1.19.1.md)的第五个预发布版，发布于2022年7月15日<ref></ref>，对[聊天](聊天.md)功能做了一些调整，并修复了一些漏洞。

# 更改
# = 常规 =
* *[聊天](聊天.md)**
* 输入聊天消息时，聊天消息的签署状态会用颜色进行标识。
* * 颜色标识会出现在聊天输入内容左侧。如果正在使用聊天预览，则显示在聊天预览左侧。其显示为一个纯色长方形。
* * 显示的消息被签署后，标识为绿色。
* * 显示的消息待签署时，标识为橙色。
* 聊天类型<code>team_msg_command</code>被拆分为<code>team_msg_command_incoming</code>和<code>team_msg_command_outgoing</code>。

* *[聊天](聊天.md)预览**
* 预览待签署内容时，其背景颜色深度会较其他情况淡。
* 聊天预览的“”模式不再在消息未被服务器修改时显示预览。
* 聊天预览现在在单人游戏中启用，并在使用含选择器替换的命令（如）时显示。
* 预览过的悬停事件和点击事件现在以纯色背景高亮显示。

* *[选项](选项.md)**
* 在“聊天预览”选项中加入了“”选项，用于仅在发送消息时更新聊天预览。
* * 选择“”时，如要确认发送消息，需要先按键显示聊天预览，再按一次才会发送。
* * 之前的“”选项更名为“”。

* *[社交屏幕](社交屏幕.md)**
* 更改了下列举报类型的描述：
* * （仅原文变动）：
* ** 旧描述：Someone is threatening to harm themselves in real life<del class="tc-no">,</del> or talking about harming <del class="tc-no">yourself</del> in real life.
* ** 新描述：Someone is threatening to harm themselves in real life or talking about harming <ins class="tc-yes">themselves</ins> in real life.
* *
* ** 旧描述：
* ** 新描述：
* * 恐怖主义或暴力极端主义
* ** 旧描述：-{zh-cn: Someone is talking about, promoting, or threatening <del class="tc-no">with</del> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.; zh-tw: 有人正在因為政治、宗教、思想等其他原因，談論、推廣或威脅實行恐怖主義或極端暴力。; zh-hk: Someone is talking about, promoting, or threatening <del class="tc-no">with</del> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.}-
* ** 新描述：-{zh-cn: Someone is talking about, promoting, or threatening <ins class="tc-yes">to commit</ins> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.; zh-tw: 有人因為政治、宗教、思想等其他原因，談論、推廣或威脅實行恐怖主義或極端暴力。; zh-hk: Someone is talking about, promoting, or threatening <ins class="tc-yes">to commit</ins> acts of terrorism or violent extremism for political, religious, ideological, or other reasons.}-

# 修复
命令返回的停止消息总是遵循操作系统区域设置特定数字格式。
|149047|滚轮灵敏度滑块上的文字总是遵循操作系统区域设置特定数字格式。
|;1.19的漏洞
|252546|与1.18.2相比，音频较差。
|252702|尝试用阿拉伯语、波斯语启动1.19时，游戏会崩溃。
|253888|被服务器更改过的消息仍会被签署且能被举报。
|254228|依赖操作系统区域设置的<code>String.format</code>Java函数导致客户端数据生成器崩溃。
|254230|命令回显使用了操作系统的特定数字格式。
|;dev
|253223|<code>gui.abuseReport.reason.terrorism_or_violent_extremism.description</code>英语字符串中，有一个介词的用法不正确。
|253950|键入聊天消息后过快将其发出，会使最终正确的聊天预览无法被签署。
|253997|“”的描述看上去与其标题不符。
|;previous
|254089|聊天预览组件可允许服务器“隐藏”聊天内容。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.1-pre5](de:1.19.1-pre5.md)
[en:Java Edition 1.19.1 Pre-release 5](en:Java Edition 1.19.1 Pre-release 5.md)
[es:Java Edition 1.19.1 Pre-release 5](es:Java Edition 1.19.1 Pre-release 5.md)
[fr:Édition Java 1.19.1 Pre-release 5](fr:Édition Java 1.19.1 Pre-release 5.md)
[ja:Java Edition 1.19.1 Pre-release 5](ja:Java Edition 1.19.1 Pre-release 5.md)
[lzh:爪哇版一點一九點一之預五](lzh:爪哇版一點一九點一之預五.md)
[pt:Edição Java 1.19.1 Pre-release 5](pt:Edição Java 1.19.1 Pre-release 5.md)
[ru:1.19.1 Pre-release 5 (Java Edition)](ru:1.19.1 Pre-release 5 (Java Edition).md)