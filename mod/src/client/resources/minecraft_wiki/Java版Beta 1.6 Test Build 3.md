# Java版Beta 1.6 Test Build 3

*页面ID: 32468* | *来源: Minecraft Wiki*

<onlyinclude>

* *Beta 1.6 Test Build 3**是Minecraft在发布[Beta 1.6](Java版Beta 1.6.md)前发布的一个测试版本。它没有公开发布，但是可以在旧的更新服务器里找到被打包成.zip文件的客户端和服务端文件。<ref>https://web.archive.org/web/20111117134739/https://s3.amazonaws.com/MinecraftDownload/prerelease/build.zip</ref>

# 新内容
# = 方块 =
* *[枯萎的灌木](枯萎的灌木.md)**
* 可以在[沙漠](沙漠.md)中找到。

* *[草](草.md)**
* 可以在特定的[生物群系](生物群系.md)中找到。
* [种子](种子.md)现在可以通过破坏草获得。

* *[蕨](蕨.md)**
* 与草的特性相同。

* *[活板门](活板门.md)**
* 可以被打开或关闭。

# = 物品 =
* *[地图](地图.md)**
* 使玩家能以俯瞰视角浏览已探索的特定区域。

# = 命令格式 =
* *[server.properties](server.properties.md)**
* 添加了新的设置选项：
* * <code>view-distance</code>
* * <code>allow-nether</code>

# = 游戏内容 =
* *[多人游戏](多人游戏.md)**
* 添加了对[下界](下界.md)的支持。

# 更改
# = 方块 =
* *常规**
* 多人游戏中由其他玩家破坏的方块现在会正常显示破坏粒子效果。
* 在地图顶端不再能放置固体方块。
* 方块数据改变而不产生方块更新时，不再改变方块的外观。

* *[床](床.md)**
* 尝试在下界睡觉会导致爆炸。

* *[发射器](发射器.md)**
* 在多人游戏中被激活后能正常播放声音和粒子效果。

* *[门](门.md)**
* 现在会为多人游戏中的其他玩家播放声音。

* *[火](火.md)**
* 由于原先的机制受到玩家反馈，现在其传播的速度更慢并且不再无限制的传播。

* *[冰](冰.md)**
* 现在无论是否下雪都可以重新生成。

* *[唱片机](唱片机.md)**
* 现在使用方块实体以通过它们的物品ID来保存音乐唱片的音轨，现在唱片机可以支持超过15张不同的音乐唱片。
* 不再使用单独的数据值。

* *[蘑菇](蘑菇.md)**
* 现在可以缓慢地蔓延。

* *[动力铁轨](动力铁轨.md)**
* 现在可以避免矿车被加速的错误。

* *[水](水.md)**
* 水源方块下面的水不再表现得与水源方块一样。

# = 物品 =
* *[箭](箭.md)**
* 现在玩家射出的箭可被其他玩家捡起。

# = 非生物实体 =
* *[船](船.md)和[矿车](矿车.md)**
* 当玩家乘船或矿车穿过下界传送门时会停止骑乘。

# 与Beta 1.6的不同
* 为了调试目的，在出生点附近会产生包含每个方块和物品的完整堆叠的[箱子](箱子.md)。
* 高级OpenGL仍会启用，开启时会使游戏崩溃（在正式版禁用）。
* * OpenGL遮挡仍然启用。
* 骑乘[矿车](矿车.md)或生物穿过[下界传送门](下界传送门.md)时游戏崩溃的漏洞会以不同方式去修复。
* 会话更改：
* * 会话请求现在通过HTTP而不是HTTPS执行。
* * 会话请求会在HTTP 200以外的任何代码中失败，而不是仅仅只有HTTP 400。
* 捡起一组物品时，物品会在物品栏里拆开并分布于在多个槽位里，但不会在同一次操作中填充所有有效槽位，需要多次操作才能捡起该组物品。
* 这个版本的协议版本号为<code>12</code>，而不是[Beta 1.5](Java版Beta 1.5.md)里的<code>11</code>和[Beta 1.6](Java版Beta 1.6.md)里的<code>13</code>。这是在[13w41a](13w41a.md)中重置协议版本号之前该协议版本号的唯一版本。
* 渲染物品时的GL状态未被正确重置，可能会导致图形工件出现。
* 高草呈现方式不同：


# 验证
该版本使用地址<code>s3.amazonaws.com/MinecraftDownload</code>提供，区别于后面较长一段时间的Minecraft版本使用的地址（<code>s3.amazonaws.com/Minecraft.Download</code>）。该地址并不归[Mojang](Mojang.md)所有，但是以下几点可以证明其被Mojang所承认：
* 旧版的Minecraft[启动器](启动器.md)（自从2013以来）会使用这个地址来更新，并且可以通过反编译器来验证。
* 在Minecraft [Classic](Java版Classic.md)版本仍能通过官网进行游戏时通过<code>s3.amazonaws.com/MinecraftDownload/classic/lzma.jar?v=15</code>加载。<ref group="注">由于此Classic版本页面已不再可用，可在[网页存档](http://web.archive.org/web/20150910183326/https://minecraft.net/classic/play)中找到此链接。</ref>
* 在Minecraft还能在官网游玩时从<code>s3.amazonaws.com/MinecraftDownload/launcher/MinecraftLauncher.jar</code>获取启动器。</onlyinclude>

# 画廊
<gallery>
b1.6-tb3 Unlicensed.png
</gallery>

# 注释

# 参考

# 导航

[de:Beta 1.6 Test Build 3](de:Beta 1.6 Test Build 3.md)
[en:Java Edition Beta 1.6 Test Build 3](en:Java Edition Beta 1.6 Test Build 3.md)
[es:Java Edition Beta 1.6 Test Build 3](es:Java Edition Beta 1.6 Test Build 3.md)
[ja:Java Edition Beta 1.6 Test Build 3](ja:Java Edition Beta 1.6 Test Build 3.md)
[pt:Edição Java Beta 1.6 Test Build 3](pt:Edição Java Beta 1.6 Test Build 3.md)
[ru:Beta 1.6 Test Build 3 (Java Edition)](ru:Beta 1.6 Test Build 3 (Java Edition).md)