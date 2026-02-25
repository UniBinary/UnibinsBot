# Brickcraft

*页面ID: 152650* | *来源: Minecraft Wiki*

|customlinks=
* 由Omniarchive[存档的下载](https://vault.omniarchive.uk/archive/misc/Rex-2012-06-28.zip)
}}

* **Brickcraft***（代号为“***Project Rex Kwon Do***”<ref></ref>）是由[Mojang AB](Mojang AB.md)和[乐高集团](wzh:樂高集團.md)于2011年9月5日开始开发的一款游戏，直到2012年7月19日被取消。

# 游戏内容
游戏的开发目标是创建一个乐高积木世界，其中包含基于不同乐高套装的生物群落。游戏内容有点类似于[Minecraft](Minecraft.md)，但玩家将使用各种形状和大小的乐高积木建造，而不是方块。<ref name="bitsnbricks">https://www.lego.com/cdn/cs/set/assets/bltf87fd15a8f67c6fd/bits_n_bricks_s01e01_minecraft_feature_and_transcript.pdf</ref>

该游戏以程序生成的乐高世界为特色。地形下方是一个无限的灰色底板。玩家可以使用键盘在世界各地移动，放置或打破积木。玩家的物品栏由以下5种类型的积木组成：
* 3005砖1×1
* 3004砖1×2
* 3003砖2×2
* 3001砖2×4
* 3040斜面砖45度2×1

玩家生成时携带每种类型的积木10,000块。打破现有积木会增加该类型积木的可用数量。在世界中放置积木会消耗积木。积木可以放置和旋转。使用滚轮可在不同的颜色之间切换，其中总共有39种颜色，每种都对应于实际的乐高积木颜色。<ref>https://www.mecabricks.com/docs/colour_chart.pdf</ref>

玩家可以在世界各地移动、疾跑和跳跃。坐标显示在左下角，建筑高度限制为底板上方80块积木。

游戏在客户端（可执行文件）和服务器（可执行文件）之间分配。客户端没有内部服务器，因此即使是单人游戏也需要服务器。该服务端还允许多人游戏。

游戏使用UDP协议（以[RakNet](w:RakNet.md)为上层）进行传输。服务器侦听所有IPv4地址，端口37373。客户端连接到服务器，其IPv4地址或名称解析为<code>connection.cfg</code>文件中列出的IPv4地址，端口37373。

世界文件是一个SQLite3数据库。

游戏支持从LXFML文件（由Lego Digital Designer使用）导入结构。该发行版包括两个LXFML文件：，一棵树和，分别由每类积木组成的几个彩色小柱子。

游戏使用的着色器无效，使其只能在Nvidia显卡上运行。在AMD和Intel显卡上运行[需要一个补丁](https://omniarchive.uk/news/file/brickcraft-shaders-fix.zip)。<ref name="omniarchive"/>

# = 控制 =
游戏使用鼠标和键盘进行。
* ：向前移动
* ：向后移动
* ：向左移动
* ：向右移动
* ：疾跑
* ：跳跃
* ：切换放置模式和破坏模式
* ：切换到上一个积木颜色
* ：切换到下一个积木颜色
* ：从选定的LXFML文件导入结构
* ：导入上次导入的结构。如果在会话期间没有导入任何结构，则服务端将崩溃。
* ：删除上次导入的结构
* ：退出游戏
* 鼠标：移动相机
* 向上滚动滚轮：选择下一个积木类型
* 向下滚动滚轮：选择上一个积木类型
* 鼠标左键
* * 在放置模式下：将当前选定的积木放置在目标空间中。按住并拖动鼠标可调整放置位置。
* * 在破坏模式下：打破目标积木
* 鼠标右键
* * 在放置模式下：选择备用积木旋转角度
* * 在破坏模式下：切换到放置模式

# = 命令 =
服务器接受对其标准输入的命令。这些命令可以使用Lua API定义。

默认情况下，服务器定义了一些命令。

还有一些命令被注释了，但如果它们没有被注释，则它们将正常工作。

# = Lua API =
服务器支持使用Lua编程语言的有限修改的API。此API可用于定义可调用的命令和影响玩家实体行为的玩家物品。

# = 目录结构 =
<div class="treeview">
*
* *
* **
* *** ：未使用的Adobe Flash程序，可能用于HUD
* ** ：用于Mod API的Lua脚本
* ***
* ***
* ** ：GLSL着色器
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ** : Textures
* *** ：用于积木的1x1纹理图集。BMP3格式。
* *** ：积木楔子纹理。PNG格式。
* ** ：用于HUD的TrueType字体
* *
* **
* *** ：定义客户端连接到的服务器地址的ASCII文本文件
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* *** ：客户端可执行文件
* ***
* ***
* ***
* ***
* *** ：服务端可执行文件
* ***
* ***
* ***
* ***
* ***
* ***
* ***
* *** ：包含一棵树的LXFML文件
* *** ：包含分别由每类积木组成的几个小的彩色柱子的LXFML文件
* ***
* ***
* *** ：世界文件。运行后生成，而不是原文件的一部分。
* ***
* ***
* **
* ***
* ***
* ***
* ***
* ***
</div>

# 历史
[Notch](Notch.md)和[Kappische](Kappische.md)设想了Minecraft和乐高积木的混合体，并联系了乐高集团与他们合作开发一款游戏，代号为“Project Rex Kwon Do”，参考电影《[大人物拿破仑](wzh:拿破崙炸藥.md)》。Mojang聘请了两名新程序员来开发游戏，Notch创建了一个原型。

在游戏达到重要的发展阶段之前，Mojang取消了合作，专注于开发自己的游戏：[Minecraft](Minecraft.md)，[Scrolls](Scrolls.md)，和[0x10<sup>c</sup>](0x10c.md)。<ref></ref>Notch当时声称该游戏是一款第一人称射击游戏。<ref></ref>

直到2020年12月，乐高集团为庆祝第一款乐高电子游戏发布25周年而创建的Bits N' Bricks播客的一集中揭示了Brickcraft的存在，该游戏的真实性质才为公众所知。当时的乐高集团员工Daniel Mathiasen将取消归咎于乐高集团为保护该产品的家庭友好形象而设置的一系列法律障碍，Daniel Kaplan声称Mojang的员工感觉更像是该项目的顾问，而不是设计师。

尽管被取消，乐高集团仍与Mojang合作生产[乐高Minecraft](乐高Minecraft.md)套装，并短暂考虑收购Mojang，但根据乐高游戏亚太区高级总监Ronny Scherer的说法，他们决定不这样做，因为Minecraft“仍在兴起”，他们“无法保证它最终会成为它所成为的文化现象”。<ref></ref><ref>https://www.lego.com/en-us/legogames-25</ref><ref name="bitsnbricks"/>

2025年6月24日，2012年6月28日的Brickcraft开发版本被重新发现并上传到Omniarchive网站。<ref name="omniarchive"></ref>

# 画廊
<gallery>
Project Rex Kwon Do.jpg|Notch发布的“Project Rex Kwon Do”的截图，后来被发现是Brickcraft
Brickcraft Player.png|玩家模型
Brickcraft Tree.png|树结构（）
Brickcraft Thing.png|其他结构（）
Brickcraft Baseplate.png|一个移除了所有积木的世界
Brickcraft Acacia.png|一棵玩家建造的树
Brickcraft 1.png|一张屏幕截图，在早期版本中没有斜面砖
Brickcraft 2.png|同上
Brickcraft 3.png|同上
Brickcraft Screenshot.png|一张游戏截图
</gallery>

# 参考

# 导航

[Category:游戏](Category:游戏.md)

[en:Brickcraft](en:Brickcraft.md)
[fr:Brickcraft](fr:Brickcraft.md)
[pt:Brickcraft](pt:Brickcraft.md)