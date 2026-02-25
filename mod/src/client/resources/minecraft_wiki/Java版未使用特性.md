# Java版未使用特性

*页面ID: 8646* | *来源: Minecraft Wiki*

自从[Minecraft](Minecraft.md)的开发初期以来，有许多加入了游戏但没什么实际作用的特性。这些特性一些是被移除特性的残留物，或者只是作为新特性的占位符。

# 方块
# = 方块状态组合 =
一些方块的方块状态组合不能在[生存模式](生存模式.md)中正常使用，它们只能使用[命令](命令.md)、[调试棒](调试棒.md)或者在[调试模式](调试模式.md)的世界类型中呈现。基于它们的特点，一些地图制作者会使用这些组合来作为画板或制作自定义方块模型。并且这些组合通常都是不稳定的。

* [藤蔓](藤蔓.md)的所有方向的状态设置为<samp>false</samp>是不可能正常出现的。其模型与各方向状态均为<samp>true</samp>的藤蔓相同，但其轮廓线为一个完整方块。
* [墙](墙.md)也有一些不可能正常出现的组合，例如6个方向都设置为<samp>false</samp>的方块状态组合会导致墙完全不可见，当然还有一些不正常的组合可以导致可以看见墙的内侧纹理。
* [铁门](铁门.md)和[铁活板门](铁活板门.md)独特的“open”和“powered”状态，正常情况下两者是同步（同时为true或false）的。因此不同步的组合不会正常出现。
* [红石粉](红石粉.md)在只连接到一个红石组件的情况下会延伸到组件相对的一侧，尽管存在有效的不同方块状态，这些状态视觉上只显示其中一个连接方向。此外在[20w18a](20w18a.md)红石线有了不同的模型，因此在生存模式中这些方块状态组合不能正常出现。
* [营火](营火.md)在使用调试棒时既能含水又能点燃，但在正常情况下是不可能做到的。
* * 同样，[蜡烛](蜡烛.md)也可以既能含水又能点燃，但它的粒子效果必须从水里或将视频选项设置为*极佳！*才能被看见。
* [台阶](台阶.md)可以既能是含水状态又能是双层状态，但在生存模式中是不可能做到的。
* “unstable”设置为<samp>true</samp>的[TNT](TNT.md)能被玩家击打点燃。
* [紫颂植株](紫颂植株.md)的上下两面至少有一面设置为<samp>true</samp>，虽然可以放置，但会立即破裂。此外，上下面都设置为<samp>false</samp>，但有两个侧面设置为<samp>true</samp>的[紫颂植株](紫颂植株.md)不能被放置。
* “distance”设置为7的[脚手架](脚手架.md)虽然可以被放置，但会立即成为一个下落的实体，它将落在任何可站立表面并变回方块，或者被破坏。
* 所有方向状态设置为<samp>false</samp>的[发光地衣](发光地衣.md)和[幽匿脉络](幽匿脉络.md)在正常情况下是无法放置的。其模型与各方向状态均为<samp>true</samp>的对应方块相同，但其轮廓线为一个完整方块，且即使使用合适的工具采集时也没有掉落物。

# = 无法实现的流体状态的组合 =
* 静止的[水](水.md)和[熔岩](熔岩.md)都有一个名为“falling”的流体状态，此状态总为<samp>false</samp>。
<!--请求帮忙更正翻译-->
* [水](水.md)和[熔岩](熔岩.md)在上方有方块时的流体状态“falling”都被设置为<samp>true</samp>，“height”被设置为8，而上方没有方块时流体状态“falling”被设置为<samp>false</samp>，“height”被设置为1到7，使得“falling”被设置为<samp>false</samp>，“height”被设置为8，以及“falling”被设置为<samp>true</samp>，“height”被设置为1到7的组合不可用。

# 生物
# = 巨人 =
[100px|右](File:Zombie.png.md)

巨人是一种在[Indev](Java版Indev.md)中加入的未被使用的[生物](生物.md)。它们看起来像是巨型[僵尸](僵尸.md)。巨人没有运动AI，因此它们无法自行移动。它们无法自然生成，因为游戏要求亮度等级大于11且小于8，而这些条件在原版中无法满足。这也使得它们无法通过[刷怪笼](刷怪笼.md)产生。

巨人只能通过生成。

# = 杀手兔 =
[100px|右](File:Killer Bunny.png.md)

杀手兔是兔子的一种攻击性变种，对所有的玩家和狼都有敌意。它拥有纯白色的皮毛，以及横向的血红色眼睛，和普通兔子的竖向眼睛明显不同。

即使是在和平难度下，杀手兔也不会消失，尽管它是敌对生物。它仍会攻击狼（不管是驯服还是未驯服的）。杀手兔于[Java版1.8](Java版1.8.md)版本的快照中被加入游戏，曾作为兔子的一个罕见变种生成，但在正式版发布之前就被删除了。

杀手兔只能通过{{cmd|summon rabbit ~ ~ ~ {RabbitType:99} }}命令生成。

# = 幻术师 =
[100px|右](File:Illusioner.png.md)

幻术师是在[Java版1.12](Java版1.12.md)加入的一种未使用的[灾厄村民](灾厄村民.md)。它们会攻击距离其12格以内的玩家、村民和铁傀儡。它们会使用咒语和弓进行攻击。

幻术师有两种咒语：一种是使其对手失明的咒语，另一种是生成分身并使本体隐身的咒语。

幻术师只能通过命令生成。

# 药水

不可合成的药水在[Java版1.9](Java版1.9.md)快照[15w44b](15w44b.md)中添加，它在生存模式中不可获得且没有效果。它的喷溅药水、滞留药水和药水箭的形式都可以获得。它作为缺失或具有无效的效果标签的药水的占位符使用。

可通过该命令获取不可合成的药水：

还有一些药水不能被酿造，但可以给予[状态效果](状态效果.md)，比如反胃药水和[衰变药水](衰变药水.md)。这些药水只能通过自定义药水效果来得到（在[基岩版](基岩版.md)的创造模式物品栏中，存在着给予玩家凋零效果的衰变药水）。

# 状态效果

在游戏中一些状态仍未使用。它们可以使用 或修改NBT数据来获得。

# =  幸运 =
[幸运](幸运.md)状态效果会增加玩家钓鱼时获得宝藏的概率。

该效果对应的[药水](药水.md)、[喷溅药水](喷溅药水.md)、[滞留药水](滞留药水.md)和[药箭](药箭.md)可以通过[创造模式物品栏](创造模式物品栏.md)获得。

该效果可以通过在[24w14potato](24w14potato.md)中食用附魔金毒马铃薯获得。

# =  霉运 =
[霉运](霉运.md)状态效果会减少玩家钓鱼时获得宝藏的概率。

该效果可以通过在[24w14potato](24w14potato.md)中食用附魔金毒马铃薯获得。

# =  生命提升 =
[生命提升](生命提升.md)状态效果会暂时性地增加玩家的生命值上限。

可以通过食用[金苹果](金苹果.md)和[附魔金苹果](附魔金苹果.md)来达到类似的效果，不过它们给玩家的效果是[伤害吸收](伤害吸收.md)而不是生命提升。

# 声音
# = 循环音效 =
循环音效是一些未使用的声音，它们在游戏文件中找到，它们可能在当玩家处于一个特定类型的位置（在山洞里、森林、海洋和瀑布旁边）时播放。这些声音只在[Classic 0.0.14a_08](Java版Classic 0.0.14a_08.md)里的一个未公开的测试版中使用，但最后并没有加入到任何公开版本里。

这些循环音效可以在<code>.minecraft/resources/sound/loops/</code>中找到，并可以转换为4个循环，这些音效有鸟鸣叫声、洞穴的风声、海洋和瀑布的吵闹声。

[Java版1.13](Java版1.13.md)和[1.16](Java版1.16.md)加入的水下和下界[环境音效](环境音效.md)可以认为是这些循环音效的替代。

# = 其他 =

一些声音仍然可以在游戏内播放：
* 播放“恶魂深情尖叫”声音。
* 播放“喘息”声音。
* 播放“嚎叫”声音。
* 播放“蠹虫行走”声音。

# 资源
一些位于游戏文件夹的资源并未被使用。

# =  =
<div style="float:right;">
[100px](File:Debug.png.md)
[100px](File:Debug2.png.md)
</div>

这些纹理是在1.9快照[15w31a](15w31a.md)中添加的。它们被开发人员用来制作方块[模型](模型.md)。

使用debug.png作为纹理的方块可以在[18w07a](18w07a.md)中通过推动气泡柱看到，但推动后不会发生任何事情，这个方块也不会生成。

尽管这两个方块都没有使用过，但在[2018年愚人节](愚人节玩笑#2018.md)的更新中，这两个方块都被赋予了新的纹理：
 。

# = 僵尸猪人、守卫者和盔甲架的纹理签名 =
在[纹理更新](纹理更新.md)前，[僵尸猪人](僵尸猪人.md)纹理包含文本“THX XATHOBIA”；[守卫者](守卫者.md)和[远古守卫者](远古守卫者.md)纹理包含文本“jeb_”——[Jens Bergensten](Jens Bergensten.md)的昵称；[盔甲架](盔甲架.md)纹理包含文本“Searge”——[Michael Stoyke](Michael Stoyke.md)的昵称。

[纹理更新](纹理更新.md)后，僵尸猪人和守卫者纹理内的文本均被删去，而盔甲架纹理中的文本“Searge”则得以保留，并且添加了文本“JAPPA”——新纹理作者[Jasper Boerstra](Jasper Boerstra.md)的昵称。[Java版1.18-pre5](Java版1.18-pre5.md)中，盔甲架平滑石头底座的边框纹理得以更新，又添加了文本“CHIWI”——更新此纹理的Mojang职员Chi Wong的昵称。

# = 旗帜部件 =

实体纹理banner_base及物品纹理banner_overlay自[14w30a](14w30a.md)被加入且用于白色旗帜，在[14w30b](14w30b.md)开始未被使用，其可能将用于预先存在的彩色旗帜的缩略图，单独给覆盖层上色，类似皮革套装一样。

banner_overlay现已被移除。

# = 地图图标 =

一些额外的地图图标。仅有左上角的白色和绿色箭头图标被普遍使用，其中彩色的图标仅被用于基岩版和原主机版的多人游戏中。

# = 骷髅及其变种的空手近战攻击 =
可以用命令生成没有武器的[骷髅](骷髅.md)、[流浪者](流浪者.md)、[沼骸](沼骸.md)、[焦骸](焦骸.md)或[凋灵骷髅](凋灵骷髅.md)，它们会进行近战攻击。

然而，骷髅和流浪者可以捡起剑等物品并进行近战攻击。

# = 隐藏在透明度中的纹理 =
一些纹理的部分像素的不透明度被设置为0，这使得它们在用大多数图像查看器查看时显得透明而不可见。然而，这些像素的颜色信息仍然存在，可以通过禁用alpha通道来检索。这些纹理中的大多数可能是创建纹理时的遗留特性，编辑程序时没有删除，而是简单地将不透明度设置为0。这里列出的纹理都禁用了它们的alpha通道，以显示纹理中未使用/隐藏的像素。大多数不可见的像素是在开发纹理时产生的，或者在开发过程中将既有的纹理用作了模板。

# == 实体 ==
<gallery widths="64" heights="64">
File:Lead knot noAlpha.png|[箭](箭.md)的纹理被用作[拴绳](拴绳.md)的模板
File:Stray overlay noAlpha.png|[锁链盔甲](锁链盔甲.md)的纹理被用作[流浪者](流浪者.md)长袍的模板
File:Bell noAlpha.png|[钟](钟.md)的纹理文件似乎有多余的面
</gallery>

# == 生物 ==
这些生物的纹理有隐藏的像素。截至[Java版1.16.5](Java版1.16.5.md)，除了豹猫和猫仍有隐藏像素外，其他的隐藏像素均被移除。

# === 蠹虫 ===
<gallery widths="64" heights="64">
File:Silverfish noalpha.png|alt=Silverfish texture with hidden pixels revealed
</gallery>
[蠹虫](蠹虫.md)是在[Beta 1.8](Java版Beta 1.8.md)中加入的，但蠹虫纹理在[Beta 1.7](Java版Beta 1.7.md)中已被加入，隐藏像素由“毛发”纹理周围的一些不同颜色的像素区域组成。

# === 末影螨 ===
<gallery widths="64" heights="64">
Endermite noAlpha.png
</gallery>
[末影螨](末影螨.md)用于[14w11a](14w11a.md)时模型的纹理像素被隐藏在了在新纹理的下方。

# === 豹猫和猫 ===
<gallery widths="64" heights="64" caption="1.14前">
File:Ocelot noalpha.png|alt=显示出隐藏像素的豹猫旧纹理
File:Cat black noalpha.png|alt=显示出隐藏像素的西服猫旧纹理
File:Cat red noalpha.png|alt=显示出隐藏像素的红虎斑猫旧纹理
File:Cat siamese noalpha.png|alt=显示出隐藏像素的暹罗猫旧纹理
</gallery><gallery widths="64" heights="64" caption="新的猫的变种">
File:Black cat noalpha.png|alt=显示出隐藏像素的黑猫纹理
File:Tuxedo cat noalpha.png|alt=显示出隐藏像素的西服猫纹理
File:British shorthair cat noalpha.png|alt=显示出隐藏像素的英国短毛猫纹理
File:Calico cat noalpha.png|alt=显示出隐藏像素的花猫纹理
File:Jellie cat noalpha.png|alt=显示出隐藏像素的Jellie猫纹理
File:Persian cat noalpha.png|alt=显示出隐藏像素的波斯猫纹理
File:Ragdoll cat noalpha.png|alt=显示出隐藏像素的布偶猫纹理
File:Red cat noalpha.png|alt=显示出隐藏像素的红虎斑猫纹理
File:Siamese cat noalpha.png|alt=显示出隐藏像素的暹罗猫纹理
File:Tabby cat noalpha.png|alt=显示出隐藏像素的虎斑猫纹理
File:White cat noalpha.png|alt=显示出隐藏像素的白猫纹理
</gallery>
在[Java版1.2.1](Java版1.2.1.md)中加入了[豹猫](豹猫.md)和[猫](猫.md)的变种。[豹猫](豹猫.md)的隐藏像素包含一个额外的头部纹理，而所有的猫纹理都有一个横跨黑色线条的橙色纹理。在Java版1.14更新后，豹猫纹理不再包含隐藏像素。大多数新的猫纹理都是由旧的纹理编辑而成的，正如类似的隐藏图案所显示的那样。这些纹理似乎也被裁剪过，因为旧的隐藏纹理的很大一部分都不见了，只有红猫纹理除外，似乎没有变化。

# === 狼 ===
<gallery widths="64" heights="64">
File:Wolf noalpha.png|alt=Wolf texture with hidden pixels revealed
File:Wolf angry noalpha.png|alt=Angry wolf texture with hidden pixels revealed
File:Wolf collar noalpha.png|alt=Wolf collar texture with hidden pixels revealed
File:Wolf tame noalpha.png|alt=Tame wolf texture with hidden pixels revealed
</gallery>
[狼](狼.md)在[Beta 1.4](Java版Beta 1.4.md)中加入。当时所有四个狼的纹理文件都具有类似的隐藏纹理，这表明，它们是通过修改同一个文件创建的。最极端的是项圈纹理，它原本只包含项圈，但在透明像素中隐藏着整个狼的纹理。

在[24w03a](24w03a.md)中，项圈纹理中的额外纹理被去除。在[24w10a](24w10a.md)中，新增的狼的每个变种的三个纹理文件也是由修改同一个文件的方式创建的。

# === 凋灵 ===
<gallery widths="64" heights="64">
File:Wither armor noAlpha.png|alt=Wither's armor layer texture with hidden pixels revealed.
File:Wither noAlpha.png|alt=Wither texture with hidden pixels revealed.
File:Wither invulnerable noAlpha.png|alt=Invulnerable Wither texture with hidden pixels revealed.
</gallery>
[凋灵](凋灵.md)的护甲纹理是基于[闪电苦力怕](闪电苦力怕.md)的护甲纹理。在凋灵的纹理中，在较小的头颅下面有一个主头的重复纹理。浅蓝色的纹理在不去除透明度的情况下是可见的。

# 历史

|
|
|
|
|
|[命令](命令.md)生成。
|[32px](File:Zombie Horse JE1 BE1.png.md) 加入命令使得僵尸马现在无需第三方工具即可生成。}}
|
|降低到了。}}
|
|
|</ref>
|黑白斑驳皮毛兔子的眼睛的颜色现已从粉红色变为黑色。}}
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
}}

# 参考

# 导航

[Category:Minecraft](Category:Minecraft.md)
[Category:未使用的特性](Category:未使用的特性.md)

[cs:Neimplementovány funkce](cs:Neimplementovány funkce.md)
[de:Ungenutzte Spielelemente](de:Ungenutzte Spielelemente.md)
[en:Java Edition unused features](en:Java Edition unused features.md)
[es:Características no usadas de Java Edition](es:Características no usadas de Java Edition.md)
[it:Funzioni non usate nella Java Edition](it:Funzioni non usate nella Java Edition.md)
[ja:使用されていない要素/Java Edition](ja:使用されていない要素/Java Edition.md)
[ko:Java Edition 미사용 기능](ko:Java Edition 미사용 기능.md)
[pl:Nieużywane elementy w Java Edition](pl:Nieużywane elementy w Java Edition.md)
[pt:Recursos não implementados na Edição Java](pt:Recursos não implementados na Edição Java.md)
[ru:Неиспользуемый контент (Java Edition)](ru:Неиспользуемый контент (Java Edition).md)