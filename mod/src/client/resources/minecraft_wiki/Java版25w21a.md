# Java版25w21a

*页面ID: 151881* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w21a**是[Java版1.21.6](Java版1.21.6.md)的第7个，也是最后一个快照，发布于2025年5月20日<ref></ref>，加入了一些新音效，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[拴绳](拴绳.md)**
* 为拴绳断裂加入了新音效<code>entity/leashknot/break</code>。

* *[剪刀](剪刀.md)**
* 为剪下[鞍](鞍.md)、[马铠](马铠.md)和羊驼身上的[地毯](地毯.md)分别加入了新音效。

# 更改
# = 生物 =
* *[马](马.md)、[驴](驴.md)和[骡](骡.md)**
* 现在可以通过喂食[胡萝卜](胡萝卜.md)以治疗它们、加速其幼年变种成长和使其更容易驯服。

# = 游戏内容 =
* *[云](云.md)**
* 更新了。
* * 包含一个向右旋转90°的[苦力怕](苦力怕.md)图案。

# = 常规 =
* *[音效](音效.md)**
* 更改了以下音效的名称：
* * <code>entity/leashknot/break1</code>→<code>entity/leashknot/unleash1</code>
* * <code>entity/leashknot/break2</code>→<code>entity/leashknot/unleash2</code>
* * <code>entity/leashknot/break3</code>→<code>entity/leashknot/unleash3</code>
* * <code>entity/leashknot/place1</code>→<code>entity/leashknot/leash1</code>
* * <code>entity/leashknot/place2</code>→<code>entity/leashknot/leash2</code>
* * <code>entity/leashknot/place3</code>→<code>entity/leashknot/leash3</code>

* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *[标签](Java版标签.md)**
* 向<code>#horse_food</code>物品标签中加入了<code>carrot</code>。

* *[对话框](对话框.md)**
* <code>run_command</code>点击事件现在能正常关闭对话框，不论是否需要不为0的权限等级。
* 通常情况下，对话框关闭后应该返回打开此对话框的上一个屏幕。
* 如果玩家正在警告屏幕时接收到对话框，则游戏不会显示对话框，仅当玩家退出警告屏幕后才显示。
* 对话框的部分元素现在具有上限：
* * 所有按钮的：1 - 1024
* * <code>plain_message</code>主体元素的：1 - 1024
* * <code>item</code>主体元素：
* ** ：1 - 1024
* ** ：1 - 256
* ** ：1 - 256
* * <code>text</code>输入控件的：1 - 1024
* * <code>single_option</code>输入控件的：1 - 1024
* * <code>number_range</code>输入控件的：1 - 1024
* <code>single_option</code>输入控件：
* * 加入<code>max_length</code>字段，表示输入文本的最大长度。
* * 加入<code>multiline</code>字段，存在时允许输入多行文本。
* ** <code>max_lines</code>：如果存在，则限制最大行数。
* ** <code>height</code>：最大高度，取值在1至512之间。
* *** 如果省略此字段，但存在<code>max_lines</code>则以其行数作为文本框高度。
* *** 如果<code>multiline</code>为空，则渲染4行文本的高度。
* <code>number_range</code>输入控件：
* * 删除<code>steps</code>字段，以<code>step</code>代替，为一个可选的正浮点数。
* ** 如果存在，则允许输入<code>initial + <any integer> * step</code>的值。
* ** 如果不存在，则允许输入任何值。
* * <code>initial</code>现在默认为取值区间的中点。
* <code>multi_action_input_form</code>对话框类型：
* * 加入了<code>columns</code>字段，表示提交操作按钮的列数，默认为2。

# 修复
”设置为“”时，破坏冰和飞行时出现渲染问题。
|258336|使用线程化或半阻塞区块构建器时，冰霜行者在区块边界频繁产生视觉崩坏。
|;1.21.5的漏洞
|296337|矿车导致内存使用量增加并引发崩溃。
|297264|猫的种类不再基于种子随机。
|;dev
|297336|对角落掷出的附魔之瓶生成的经验球很容易卡进方块中。
|297615|尝试加入已关闭的Realm时出现不可翻译的错误消息。
|;prev
|297803|字符串“menu.custom_screen_info.contents”将“personal”错拼为“pesonal”。
|297806|<code>music.game.swamp.labyrinthine</code>错拼曲名。
|297808|<code>music.game.oxygene</code>缺少抑音符。
|297812|粗体文本的渲染与上个版本不同。
|297813|Amos Roddy未列入鸣谢名单。
|297823|<code>music.game.mice_on_venus</code>使用了错误的大小写。
|297845|在单人游戏中，直到返回游戏前，点击统计信息按钮不会播放按钮点击音效。
|297846|“音乐”滑动条设为0时，暂停菜单中的音乐弹窗闪烁。
|297875|聊天消息中带下划线文本的阴影与其下方的文本重叠。
|297888|使用不同字体时，文本不再以一致的顺序呈现。
|297917|显示具有极宽按钮的对话框时，客户端停止响应。
|297977|对话框列布局在网格和溢出线性布局间存在额外间距。
|298013|书中带有<code>click_event</code>的文本不再关闭书本屏幕。
}}</onlyinclude>

# 参考

# 导航

[de:25w21a](de:25w21a.md)
[en:Java Edition 25w21a](en:Java Edition 25w21a.md)
[fr:Édition Java 25w21a](fr:Édition Java 25w21a.md)
[it:Java Edition 25w21a](it:Java Edition 25w21a.md)
[ja:Java Edition 25w21a](ja:Java Edition 25w21a.md)
[ko:Java Edition 25w21a](ko:Java Edition 25w21a.md)
[pt:Edição Java 25w21a](pt:Edição Java 25w21a.md)
[ru:25w21a (Java Edition)](ru:25w21a (Java Edition).md)
[uk:25w21a (Java Edition)](uk:25w21a (Java Edition).md)