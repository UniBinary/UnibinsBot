# Java版pre-Classic rd-131655

*页面ID: 34789* | *来源: Minecraft Wiki*

<onlyinclude>

* *rd-131655**，即**Cave Game技术测试（*Cave game tech test*<ref></ref>、*Cave Game tech demo*<ref name="tech demo"></ref>）**，是2009年5月13日16时55分（UTC）制作完成的[pre-Classic](Java版pre-Classic.md)版本。<ref name="8x8">[LWJGL IRC记录](#lwjgl logs.md): “*[18:55:45] <Notch_> the chunk size is 16x16 now..*” [...] “*[18:56:47] <Notch_> 8x8 chunks are SLOWER*”</ref>

# 新内容
# = 方块 =
* *[空气](空气.md)**
* 尚未被列为方块。

* *[草方块](草方块.md)**
* 纹理与*[RubyDung](RubyDung.md)*中的相同。
* 草方块为随机生成，有随机概率出现在石头上方的明亮位置，不一定与石头相邻。一个石头的正上方最多生成一个草方块，也可能不生成。Y坐标越高，草方块生成概率越大。

* *[石头](石头.md)**
* 纹理与*[RubyDung](RubyDung.md)*中的相同。

# = 实体 =
* *[玩家](玩家.md)**
* 暂时没有可视化模型。
* 高度为1.72格。

# = 世界生成 =
* *[区块](区块.md)**
* 生成每个区块约需0.1秒。<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[13:37:42] <Notch> rebuilding a chunk of these takes almost 100 ms, but that's everything, including tesselation, calculating lighting, and building the display list.*”</ref>
* 每个区块大小为16×16方块。<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[13:37:08] <Notch> I've got chunks of blocks, 16x16x16 blocks. Each block can have a maximum of three quads, but that's worst case scenario*”</ref>
* 离玩家越近的区块会被优先加载。<ref>[IRC记录](#lwjgl logs.md)：“*[19:51:48] <Notch_> i'll update tiles chunks the player first, and force a full update upon game start*”</ref>

* *[世界生成](世界生成.md)**
* 世界大小为256×64×256。
* * 生成256×64×256大小的世界约需20秒。<ref>[IRC记录](#lwjgl logs.md)：“*[20:02:58] <Notch_> it takes like 20 seconds to grow a 256*256*64 map, though. :-\*”</ref>
* 玩家可跨越[世界界限](世界界限.md)并掉出世界。

* *[洞穴](洞穴.md)**
* 一直延伸到距离世界底部还有几层方块的位置，形成峡谷。

# = 常规 =
* *[亮度](亮度.md)**
* 光照引擎非常简单，仅有明暗两个光照等级。
* * “阳光”从世界顶端开始，垂直照射下方所有方块，不受距离影响。它可穿过透明方块并照亮其下方的方块。
* * 未接收到阳光的方块均处于光照等级相同的阴影中，这与光源距离无关。黑暗中的方块有一层较厚的黑雾，且距离越远看起来越黑。这导致了奇怪的视觉漏洞。

* *[创造模式](创造模式.md)**
* 仅能四处移动。

* *[重生](重生.md)**
* 玩家按下可重生，并被传送到世界中心。</onlyinclude>

# 你知道吗
* 该版本的开发始于2009年5月10日<ref></ref>或11日<ref name="11th">[Rotab's IRC记录](#irc logs.md)：“*(10:40:09) <@Notch> heh, the game game tech test video is from the 13'th*” [...] “*(10:40:18) <@Notch> that was after two days of work, so I started the 11'th, probably*”</ref>，持续到12日<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[13:34:09] <Notch> i was trying to narrow down a performance issue last night.*”</ref>，并在13日继续推进。Notch于当日约17:00（UTC）开始录制视频，并在17:36上传了录制内容。<ref>[LWJGL IRC记录](#lwjgl logs.md)：“*[19:00:52] <Notch_> hmm, I wonder if I could make a vid of this*” [...] “*[19:14:02] <Notch_> haha, the video ended up at 1.05 GB*” [...] “*[19:15:36] <Notch_> well, this is annoying. I guess I have to recapture. Google has a limit of 2 gb*” [...] “*[19:36:42] <Notch_> upload complete, processing video*” [...] “*[19:50:18] <Notch_> ok, the quality is still crap until the processing finishes, but: http://www.youtube.com/watch?v=F9t3FREAZ-k*” </ref>该版本的新增特性可在2009年5月13日发布的*Cave game技术测试*视频中查看。
* 版本号前的“rd”源自[Notch](Notch.md)此前制作后放弃的游戏*[RubyDung](RubyDung.md)*，其代码库后来被Minecraft复用。该游戏是Minecraft的部分灵感来源。

# 画廊
<gallery>
A cave.png|一个洞穴
Cave Game chunk loading.png|该版本中区块加载非常缓慢
Cave Game falling.png|此版本世界的最底层
Cave Game R pressed.png|此版本的地表
How it Started.jpg|一个深坑，左侧与右侧的明暗对比体现了此时光照引擎的简单性
</gallery>

# 参考
*
*  [Rotab's IRC logs](https://archive.org/download/Rotab-Minecraft-IRC-logs) on Archive.org; #minecraft.20090525.log. May 25, 2009 (UTC+2)

# 导航

[Category:未发布的版本](Category:未发布的版本.md)

[cs:Java edice Pre-Classic rd-131655](cs:Java edice Pre-Classic rd-131655.md)
[de:Cave game tech test](de:Cave game tech test.md)
[en:Cave game tech test](en:Cave game tech test.md)
[es:Cave game tech test](es:Cave game tech test.md)
[fr:Édition Java Pré-classique rd-131655](fr:Édition Java Pré-classique rd-131655.md)
[hu:Java Edition pre-Classic rd-131655](hu:Java Edition pre-Classic rd-131655.md)
[it:Cave game tech test](it:Cave game tech test.md)
[ja:Java Edition pre-Classic rd-131655](ja:Java Edition pre-Classic rd-131655.md)
[ko:Java Edition 동굴 게임 데모](ko:Java Edition 동굴 게임 데모.md)
[lzh:爪哇版先典版璐璧鐺一三一六五五](lzh:爪哇版先典版璐璧鐺一三一六五五.md)
[pt:Cave game tech test](pt:Cave game tech test.md)
[ru:Cave game tech test](ru:Cave game tech test.md)
[uk:Pre-Classic rd-131655 (Java Edition)](uk:Pre-Classic rd-131655 (Java Edition).md)