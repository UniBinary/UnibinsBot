# Java版Classic 0.0.15a

*页面ID: 35246* | *来源: Minecraft Wiki*

/开发者版本}}
<onlyinclude>

* *0.0.15a**是[多人测试](多人测试.md)的首个版本，也是的一次更新，发布于2009年5月31日<ref>[IRC记录](#logs.md): "*[13:05] <@notch> http://www.minecraft.net/mptest/*" (19:05 UTC)</ref>，加入了[多人游戏](多人游戏.md)。

# 新内容
# = 游戏内容 =
* *[多人游戏](多人游戏.md)**
* 多人游戏中其他玩家的模型都使用[人类](生物（已移除实体）.md)模型渲染。
* 方块[粒子](Java版粒子.md)在多人游戏中被禁用。
* 玩家可以在其他玩家所在的位置放置方块。

# 更改
# = 方块 =
* *[橡树树叶](橡树树叶.md)**
* 更改了纹理。

* *[橡木](原木.md)**
* 更改了纹理。

* *[沙砾](沙砾.md)**
* 更改了纹理。
* 现在只生成在[水](水.md)下。

* *[沙子](沙子.md)**
* 更改了纹理。

* *[熔岩](熔岩.md)**
* 流动速度比以前慢了。
* 现在是完全明亮的。
* 位于方块下方的熔岩不再会造成透视效应。

* *[水](水.md)**
* 位于方块下方的水不再会造成透视效应。

# = 生物 =
* *[人类](生物（已移除实体）.md)**
* 头部和手臂不再剧烈地晃动。

# = 世界生成 =
* *[树木](树木.md)**
* 更改了模型。

# = 常规 =
* *[terrain.png](terrain.png.md)**
* 移除了[泥土](泥土.md)和[草方块](草方块.md)的多余纹理及一个来自[0.0.14a](Java版Classic 0.0.14a.md)的类似云的纹理。

# 重新上传
该版本于6月3日18:16（UTC）被第一次重新上传，以修改玩家和生物的动画，但动画速度过快。<ref>[IRC日志](#logs.md): "*[12:18] <Zolyx> whoa, the animation on the mobs is a little... out ;)*", "*[12:18] <Zolyx> it's like 5000% faster than it should be. they look like they're spazzing :P*" (18:18 UTC)</ref>

该版本于6月3日18:28（UTC）被第二次重新上传，改进了客户端并修复了玩家的动画。<ref>[IRC日志](#logs.md): "*[12:28] <@Notch> the mp test server is updated with better client interpolation. =)*" (18:28 UTC)</ref><ref>[IRC日志](#logs.md)：“*[12:34] <@Notch> the players animate better now, I hope?*”</ref>

该版本于6月3日19:00（UTC）被第三次重新上传<ref>[IRC日志](#日志.md): "*[13:00] <@Notch> ok, restart your clients now. =)*" (19:00 UTC)</ref>，在玩家头顶加入了可见的用户名<ref>[IRC日志](#日志.md)：“*[13:01] <smn> OH INGAME NICKS*”</ref>
，并在多人游戏中加入了粒子效果<ref>[IRC日志](#日志.md): "*[13:02] <smn> ohhh particlez*" (19:02 UTC)</ref>，同时建造和破坏也更加流畅。<ref>[IRC日志](#日志.md)：“*[13:01] <@Notch> try building and removing now. =) [...] it should be much less laggy*”</ref>

该版本于6月3日19:50（UTC）被第四次重新上传<ref name="WON"></ref>，加入了按键打开聊天框的功能。<ref>[IRC日志](#logs.md)：“*[13:53] <ZomBuster> yay ingame chat*”</ref><ref>[IRC日志](#logs.md): "*[13:49] <@Notch> ok, I need to restart the server!!*" [...] "*[13:50] <@Notch> try pressing t*"</ref>

该版本于6月4日16:51（UTC）被第五次重新上传<ref>[IRC日志](#logs.md): "*[10:51] <koekje4life> when is the next MP test again?*" [...] "*[10:51] <@Notch> ir's right now!*", "*[10:51] * Notch changes topic to 'http://www.minecraft.net/  |  Multiplayer test is back up!*" (16:51 UTC)</ref>，改进了发送存档的代码，使其在有新玩家加入时暂停。<ref>[IRC日志](#logs.md): "*[10:50] <@Notch> ok, I did some experimental work on the level sending code..*" [...] "*[10:51] <@taodih> level sending code? *" [...] "*[10:51] <@Notch> yeah, the pauses whenever a player logs in*" (16:51 UTC) </ref>

该版本于6月4日16:58（UTC）被第六次重新上传<ref>[IRC日志](#logs.md): "*[10:52] * Notch changes topic to 'http://www.minecraft.net/  |  Multiplayer test is back down, gimme a sec.'<nowiki/>*" [...] "*[10:58] * Notch changes topic to 'http://www.minecraft.net/  |  Multiplayer test is up! Please test it :D'<nowiki/>*" (16:58 UTC)</ref>，原因未知。

该版本于6月4日17:03（UTC）被第七次重新上传<ref>[IRC日志](#logs.md): "*[11:01] * Notch changes topic to 'http://www.minecraft.net/  |  Multiplayer test is down, hold!  |   Please test mp (when the server is up) at http://www.minecraft.net/mptest/<nowiki>'</nowiki>*" [...] "*[11:03] * Notch changes topic to 'http://www.minecraft.net/  |  Multiplayer test is UP!  |   Please test mp (when the server is up) at http://www.minecraft.net/mptest/<nowiki>'</nowiki>*" (17:03 UTC)</ref>，修复了一个玩家无法移动的漏洞。<ref>[IRC日志](#logs.md)：“*[11:09] <koekje4life> Refresh for movement :D*”（17:09 UTC）</ref></onlyinclude>

# 参考
*  [IRC记录](https://archive.org/download/Testvan-Minecraft-IRC-logs): #minecraft.20090531.log, #minecraft.20090603.log, #minecraft.20090604.log

# 导航

[Category:重新上传过的版本](Category:重新上传过的版本.md)

[de:Classic 0.0.15a (Multiplayer Test 1)](de:Classic 0.0.15a (Multiplayer Test 1).md)
[en:Java Edition Classic 0.0.15a (Multiplayer Test 1)](en:Java Edition Classic 0.0.15a (Multiplayer Test 1).md)
[es:Java Edition Classic 0.0.15a (Multiplayer Test 1)](es:Java Edition Classic 0.0.15a (Multiplayer Test 1).md)
[fr:Édition Java Classique 0.0.15a (Test du Multijoueur 1)](fr:Édition Java Classique 0.0.15a (Test du Multijoueur 1).md)
[ja:Java Edition Classic 0.0.15a (Multiplayer Test 1)](ja:Java Edition Classic 0.0.15a (Multiplayer Test 1).md)
[lzh:爪哇版古典版〇點〇點一五甲](lzh:爪哇版古典版〇點〇點一五甲.md)
[pt:Edição Java Classic 0.0.15a (Multiplayer Test 1)](pt:Edição Java Classic 0.0.15a (Multiplayer Test 1).md)
[ru:Classic 0.0.15a (Multiplayer Test 1) (Java Edition)](ru:Classic 0.0.15a (Multiplayer Test 1) (Java Edition).md)