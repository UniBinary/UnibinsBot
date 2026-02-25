# Java版25w18a

*页面ID: 150667* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w18a**是[Java版1.21.6](Java版1.21.6.md)的第4个快照，发布于2025年4月29日<ref></ref>，更改了[拴绳](拴绳.md)和[失水恶魂](失水恶魂.md)的合成配方以及小恶魂的寻路机制，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[实体数据格式](实体数据格式.md)**
* 为所有[AI生物](AI生物.md)加入了和字段。
* * 设置此值的大部分生物只会在“家”周围的限定范围内寻路。
* ** [蝙蝠](蝙蝠.md)、[史莱姆](史莱姆.md)、[岩浆怪](岩浆怪.md)、[幻翼](幻翼.md)和[末影龙](末影龙.md)可能忽略此影响。
* * [骑乘](骑乘.md)或使用拴绳会改变部分生物的“家”位置。

* *[定位栏](定位栏.md)**
* 加入了<code>bowtie</code>[路径点](路径点.md)样式。

# 更改
# = 方块 =
* *[失水恶魂](失水恶魂.md)**
* 现在合成配方中的[骨块](骨块.md)被替换为[灵魂沙](灵魂沙.md)。
* 现在可以通过与[猪灵](猪灵.md)[以物易物](以物易物.md)获得，概率为（≈2.13%）。

# = 物品 =
* *[拴绳](拴绳.md)**
* 现在合成配方中的[黏液球](黏液球.md)被替换为[线](线.md)。

# = 非生物实体 =
* *[喷溅药水](喷溅药水.md)**
* 药水效果持续时间现在取决于生物碰撞箱与喷溅药水[判定箱](判定箱.md)之间的距离。
* * 即现在直接被喷溅药水击中的生物能获得完整的药水效果。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 精灵图现在也是动态纹理。

* *[字体](字体.md)**
* Unifont已更新至16.0.03。
* 加入了新的内置字体<code>include/unifont_pua</code>，包含了Unifont中位于私用区的未编码字，这些字符由Under-CSUR（Under-ConScript Unicode Registry）管理码位。
* * 游戏文本默认不会使用该字体，但可以在[文本组件](文本组件.md)等中指定该字体。

* *[自定义字体](自定义字体.md)**
* 字形提供器<code>unihex</code>的字段现在可选，且默认为空。

* *[JSON](JSON.md)**
* 世界、包、配置等使用的JSON解析器现在均以严格模式解析文件。

* *[标签](Java版标签.md)**
* 向实体类型标签<code>#followable_friendly_mobs</code>中加入了<code>happy_ghast</code>。

# 修复
包含尾随逗号。
|279284|掷出的附魔之瓶生成的经验球很容易卡进方块中。
|;1.21.5的漏洞
|279875|不能从悬空脚手架斜向爬上台阶。
|280281|浮漂在勾上移动的实体时快速抖动。
|280502|翻译键<code>snbt.parser.undescore_not_allowed</code>包含一处拼写错误。
|295879|疾跑中攻击船并上此船致其陷入下方方块。
|295914|战利品表文件接受无效JSON。
|296784|“”屏幕缺少淡化。
|296866|部分命名空间的谓词不能在中访问。
|;dev
|296354|快乐恶魂不受投掷到头上的药水影响。
|296898|快乐恶魂的游荡原点会随时间略微偏移。
|;prev
|297112|+数字键不能导航到Realms配置菜单中的选项卡。
|297114|Realms菜单误显示Realms即将过期。
|297115|“”框的黑色背景不再显示。
|297184|“mco.errorMessage.realmsService.configurationError”中的“Realms”是小写的。
}}</onlyinclude>

# 参考

# 导航

[de:25w18a](de:25w18a.md)
[en:Java Edition 25w18a](en:Java Edition 25w18a.md)
[es:Java Edition 25w18a](es:Java Edition 25w18a.md)
[fr:Édition Java 25w18a](fr:Édition Java 25w18a.md)
[ja:Java Edition 25w18a](ja:Java Edition 25w18a.md)
[ko:Java Edition 25w18a](ko:Java Edition 25w18a.md)
[lzh:二五週一八甲](lzh:二五週一八甲.md)
[pt:Edição Java 25w18a](pt:Edição Java 25w18a.md)
[ru:25w18a (Java Edition)](ru:25w18a (Java Edition).md)
[uk:25w18a (Java Edition)](uk:25w18a (Java Edition).md)