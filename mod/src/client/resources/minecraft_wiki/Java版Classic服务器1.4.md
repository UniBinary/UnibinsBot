# Java版Classic服务器1.4

*页面ID: 45306* | *来源: Minecraft Wiki*

* *1.4**是[Classic](Java版Classic.md)服务器的一次更新，发布于2009年6月13日13:30（UTC）。<ref>[6月13日的IRC记录](#0613 logs.md): "*A8:30:10 <Notch> there's a new minecraft-server.zip up*" (13:30:10 UTC)</ref><ref name=":0"></ref>

# 新内容
# = 常规 =
* *[服务器](服务器.md)**
* 添加了服务器对的支持。<ref>[6月14日的IRC记录](#0614 logs.md): "*A5:57:41 <Notch> there is a teleport command in the new server. =)*", "*A5:57:48 <Notch> /teleport <name>*" (10:57 UTC)</ref>

# 更改
# = 游戏内容 =
* *[多人游戏](多人游戏.md)**
* 现在服务器会检查所有传来的字符串长度是否在一合理范围内，并自动踢出发送过长字符串的客户端。<ref name=":0"/>

# = 常规 =
* *日志**
* 服务器输出现在会记录在文件里。<ref>[6月13日的IRC记录](#0613 logs.md): "*P6:38:36 <smn> Notch, is there any way to log server output?*", "*P6:38:47 <Notch> it should do so already since the latest server update!*", "*P6:38:49 <Notch> server.log*" (23:38 UTC)</ref>

# 修复
* *修复了1个漏洞**
* 修复了一个通过发送假的文字消息来使所有连接到该服务器的客户端崩溃的严重漏洞。<ref name=":0" />
* * 客户端会尝试渲染奇怪的Unicode字符，但是当客户端尝试在一个256大小的数组里查找第10000个数据时会因为下标越界而崩溃。<ref name=":0" />

# 重新上传
该版本于14:22（UTC）被重新上传<ref>[6月13日的IRC记录](#0613 logs.md): "*A9:22:34 <Notch> robink93: new server.zip up*" (14:22:34 UTC)</ref>，以修复一个玩家可以在世界外点击的漏洞。<ref></ref><ref>[6月13日的IRC记录](#0613 logs.md): "*A9:15:36 <robink93> Cheat detected: clicked outside map.*" [...] "*A9:15:51 <Notch> and it wasn't, robink93?*", "*A9:15:54 <robink93> yes it was*", "*A9:16:02 <robink93> jump, place block under, repeat*", "*A9:16:09 <Notch> ok, I can make it not kick on that, I guess. :D*" (14:15 to 14:16 UTC)</ref>

# 参考
*  6月13日的IRC记录： [IRC logs](https://archive.org/download/Minecraft_IRC_Logs_2009/DBN-IRC-Logs/) on Archive.org; #minecraft.20090613.log. 2009年6月13日 (UTC&minus;5)。
*  6月14日的IRC记录： [IRC logs](https://archive.org/download/Minecraft_IRC_Logs_2009/DBN-IRC-Logs/) on Archive.org; #minecraft.20090614.log. 2009年6月14日 (UTC&minus;5)。

# 导航

[Category:重新上传过的版本](Category:重新上传过的版本.md)

[de:Classic Server 1.4](de:Classic Server 1.4.md)
[en:Java Edition Classic server 1.4](en:Java Edition Classic server 1.4.md)
[es:Java Edition Classic server 1.4](es:Java Edition Classic server 1.4.md)
[ja:Java Edition Classic server 1.4](ja:Java Edition Classic server 1.4.md)
[lzh:爪哇版古典版伺服器一點四](lzh:爪哇版古典版伺服器一點四.md)
[pt:Edição Java Classic server 1.4](pt:Edição Java Classic server 1.4.md)
[ru:Сервер Classic 1.4 (Java Edition)](ru:Сервер Classic 1.4 (Java Edition).md)