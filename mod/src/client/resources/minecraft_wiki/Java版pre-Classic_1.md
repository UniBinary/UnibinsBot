# Java版pre-Classic

*页面ID: 10556* | *来源: Minecraft Wiki*

* *pre-Classic**是[Java版](Java版.md)的首个开发阶段，始于2009年5月10日<ref></ref>或5月11日<ref name="11th">[Rotab的IRC记录](https://archive.org/download/Rotab-Minecraft-IRC-logs) on Archive.org; #minecraft.20090525.log. 2009年5月25日 (UTC+2)。 "*(10:40:09) <@Notch> heh, the game game tech test video is from the 13'th*"[...]"*(10:40:18) <@Notch> that was after two days of work, so I started the 11'th, probably*"</ref>，结束于5月16日。

# 新内容
# = 方块 =
; [空气](空气.md)
* 自然生成在世界中。

; [草方块](草方块.md)
* 自然生成在世界中，无法通过常规方法获得。
* 若未暴露在阳光下，会恢复为泥土。

; [石头](石头.md)
* 自然生成在世界中。

; [泥土](泥土.md)
* 会自然生成在草方块下方，通常会生成几层。
* 在阳光下放置一段时间后会形成[草方块](草方块.md)。

; [圆石](圆石.md)
* 不会在世界中自然生成，只能由[玩家](玩家.md)放置。

; [木板](木板.md)
* 不会在世界中自然生成，只能由玩家放置。

; [树苗](树苗.md)
* 不会在世界中自然生成，只能由玩家放置。
* 若处于黑暗中或未放置在[泥土](泥土.md)或[草方块](草方块.md)上时会消失。

; 常规
* 现在支持不同类型的方块和动态方块。

# = 生物 =
; [玩家](玩家.md)
* 暂时没有可视化模型。
* 高度为1.72格。

; [人类](生物（已移除实体）.md)
* 会自然生成在世界中。
* 随意移动，无正式AI。
* 不会被游戏保存。

# = 游戏内容 =
; [轮廓箱](轮廓箱.md)
* 一个闪烁的白色覆盖层，用于显示玩家鼠标所指的方块。

; [亮度](亮度.md)
* 光照引擎非常简单，仅有明暗两个光照等级。
* * “阳光”从世界顶端开始，垂直照射下方所有方块，不受距离影响。它可穿过透明方块并照亮其下方的方块。
* * 未接收到阳光的方块均处于光照等级相同的阴影中，这与光源距离无关。黑暗中的方块有一层较厚的黑雾，且距离越远看起来越黑。这导致了奇怪的视觉漏洞。

; [平视显示器](平视显示器.md)
* 加入了十字准星。

; 常规
* 可放置和破坏方块。
* * 左键单击放置方块，右键单击破坏方块。
* 无法在世界外放置方块。

# = 世界生成 =
; [区块](区块.md)
* 生成每个区块约需0.1秒。
* 每个区块大小为16×16方块。
* 离玩家越近的区块会被优先加载。

; 常规
* 世界大小为256×64×256。
* * 生成256×64×256大小的世界约需20秒。
* 玩家可跨越[世界界限](世界界限.md)并掉出世界。
* 现在较远处的明亮方块表面会出现一层薄雾。

; [洞穴](洞穴.md)
* 一直延伸到距离世界底部还有几层方块的位置，形成峡谷。

# = 常规 =
; [粒子](Java版粒子.md)
* 加入了方块粒子。
* * 打破方块时会出现。
* * 掉落到地面后会消失。

; [控制](控制.md)
* 按下可将传送至世界中心。
* 按下可保存存档。
* * 关闭游戏时存档也会自动保存。
* 按下可生成[生物](生物（已移除实体）.md)。
* 按数字键–可选择方块。
* * 当前选定的方块会显示在右上角。
* 按可交换鼠标Y轴。</onlyinclude>

# 启动器版
截至目前，[启动器](启动器.md)共有5个可供下载的pre-Classic版本。

# 你知道吗
* 这一开发阶段鲜为人知，因为当时游戏尚未公开发布，且仅有[Notch](Notch.md)能够测试游戏，该阶段的部分版本直到2013年才得以公开。
* 这一开发阶段的[命名系统](版本格式#Pre-Classic.md)为“*id*-*ddhhmm*”，其中*id*代表游戏名称的首字母（“rd”指Notch早期的计划*[RubyDung](RubyDung.md)*，“mc”代表之后的Minecraft，即pre-Classic的公开版本），*dd*为发布日期，*hh*为发布小时，*mm*为发布分钟，因此[rd-132211](rd-132211.md)发布于5月**13**日**22:11**。
* * 例外情况是[rd-20090515](rd-20090515.md)，该版本采用了完整的“*yyyymmdd*”格式。

# 参见
*
*
* [Java版Classic](Java版Classic.md)
* * [早期创造](早期创造.md)
* * [多人测试](多人测试.md)
* * [生存测试](生存测试.md)
* * [后期创造](后期创造.md)
* [Java版Indev](Java版Indev.md)
* [Java版Infdev](Java版Infdev.md)
* [Java版Alpha](Java版Alpha.md)
* [Java版Beta](Java版Beta.md)
* [Java版1.0.0](Java版1.0.0.md)

# 参考

# 导航

[Category:版本](Category:版本.md)
[Category:开发阶段](Category:开发阶段.md)

[cs:Pre-Classic](cs:Pre-Classic.md)
[de:Pre-Classic](de:Pre-Classic.md)
[en:Java Edition pre-Classic](en:Java Edition pre-Classic.md)
[es:Java Edition pre-Classic](es:Java Edition pre-Classic.md)
[fr:Édition Java Pré-classique](fr:Édition Java Pré-classique.md)
[hu:Pre-classic](hu:Pre-classic.md)
[it:Java Edition pre-Classic](it:Java Edition pre-Classic.md)
[ja:Java Edition pre-Classic](ja:Java Edition pre-Classic.md)
[ko:Java Edition 프리클래식](ko:Java Edition 프리클래식.md)
[lzh:爪哇版先典版](lzh:爪哇版先典版.md)
[nl:Pre-Classic](nl:Pre-Classic.md)
[pl:Java Edition Pre-classic](pl:Java Edition Pre-classic.md)
[pt:Edição Java pre-Classic](pt:Edição Java pre-Classic.md)
[ru:Pre-Classic (Java Edition)](ru:Pre-Classic (Java Edition).md)
[th:รุ่น Java pre-Classic](th:รุ่น Java pre-Classic.md)
[uk:Pre-Classic (Java Edition)](uk:Pre-Classic (Java Edition).md)