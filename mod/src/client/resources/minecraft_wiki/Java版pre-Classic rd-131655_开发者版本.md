# Java版pre-Classic rd-131655/开发者版本

*页面ID: 138348* | *来源: Minecraft Wiki*

[Cave Game技术测试](Java版pre-Classic rd-131655.md)由[Notch](Notch.md)从2009年5月10日<ref></ref>或11日开始开发<ref name="11th">[Rotab's IRC记录](#irc logs.md)：“*(10:40:09) <@Notch> heh, the game game tech test video is from the 13'th*” [...] “*(10:40:18) <@Notch> that was after two days of work, so I started the 11'th, probably*”</ref>，持续到12日<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[13:34:09] <Notch> i was trying to narrow down a performance issue last night.*”</ref>并在13日继续开发，*Cave Game*的第一个视频在13日17:36（UTC）上传。

# 5月10日-5月11日
据Notch称，*Cave Game*的开发可能开始于2009年5月10日或5月11日。<ref></ref>此时的游戏以*[RubyDung](RubyDung.md)*的源代码为基础。

# 5月12日
此时，Notch已经加入[亮度](亮度.md)、[区块](区块.md)、[世界生成](世界生成.md)和一些[方块](方块.md)。但是，游戏出现了一些性能问题<ref></ref>，其会占用很高的内存<ref></ref>，并且每次更新区块时都会发生的巨大滞后峰值。<ref></ref>

# = 新内容 =
; [空气](空气.md)
* 此时还没有被列为方块。

; [草方块](草方块.md)
* 纹理取自*RubyDung*。

; [石头](石头.md)
* 纹理取自*RubyDung*。

; [玩家](玩家.md)
* 没有可视化模型。
* 有1.72格高。

; [区块](区块.md)
* 一个区块大约需要0.1秒才能生成。
* 区块大小为8×8。

; [世界生成](世界生成.md)
* 地图大小为256×64×256。

; [光照](光照.md)
* 光照引擎非常简单，这时只有明暗两个光照等级。
* * “阳光”由世界顶端开始，竖直照射在其下方的任何方块上，无论距离远近。它可以穿过透明方块并照亮其下方的方块。
* * 没有接收到阳光的方块都处在光照等级相同的阴影中，且与距光源的距离无关。处在黑暗中的方块都具有一层较厚的黑雾，且在更远的距离上看起来更黑。这导致了奇怪的视觉漏洞。

; [创造模式](创造模式.md)
* 这是它最基础的版本，玩家不能飞行或放置方块，也没有物品栏和快捷栏来获得方块。

; [重生](重生.md)
* 玩家可以按下重生，并将自己传送到世界中心。

# 5月13日
前一天的性能问题在16:41（UTC）得到了改善。游戏每帧最多加载两个区块，但仍然很缓慢。<ref></ref>在16:48（UTC）之前，Notch设法让游戏可以运行。当时的报告显示，帧率提高为每秒72帧，每秒加载288个区块。<ref></ref>在16:55（UTC），Notch将区块大小从8×8更改为16×16。<ref></ref>

[thumb|Notch视频的一张截图](File:Cave game tech test tiny.png.md)
Notch在大约17:00（UTC）开始录制游戏的视频，并于17:36（UTC）上传了录制的视频。<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[19:00:52] <Notch_> hmm, I wonder if I could make a vid of this*” [...] “*[19:14:02] <Notch_> haha, the video ended up at 1.05 GB*” [...] “*[19:15:36] <Notch_> well, this is annoying. I guess I have to recapture. Google has a limit of 2 gb*” [...] “*[19:36:42] <Notch_> upload complete, processing video*” [...] “*[19:50:18] <Notch_> ok, the quality is still crap until the processing finishes, but: http://www.youtube.com/watch?v=F9t3FREAZ-k*”</ref>

# = 更改 =
; [区块](区块.md)
* 大小从8×8更改为16×16。

# 你知道吗
* 版本号前的“rd”表示[Notch](Notch.md)之前制作过但最终放弃了的游戏*[RubyDung](RubyDung.md)*，其代码库随后被Minecraft重新使用。
* * *[RubyDung](RubyDung.md)*是Minecraft的部分灵感所在。<ref>https://web.archive.org/web/0/https://notch.tumblr.com/post/227922045</ref>

# 参考

# 导航

[Category:开发者版本](Category:开发者版本.md)

[en:Cave game tech test/Development](en:Cave game tech test/Development.md)
[es:Cave game tech test/Desarrollo](es:Cave game tech test/Desarrollo.md)
[pt:Cave game tech test/Desenvolvimento](pt:Cave game tech test/Desenvolvimento.md)
[ru:Cave game tech test/Разработка](ru:Cave game tech test/Разработка.md)