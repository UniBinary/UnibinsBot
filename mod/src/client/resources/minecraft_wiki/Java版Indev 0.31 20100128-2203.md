# Java版Indev 0.31 20100128-2203

*页面ID: 172455* | *来源: Minecraft Wiki*

<onlyinclude>
* *0.31**的一个版本发布于2010年1月28日22:03（UTC），加入了一些新特性，并修复了一些漏洞。<ref name="WoN 0128 release"></ref><ref>[Adura的IRC记录](#logs.md): "(16:59:39) <Notch> Ah, I'll just update now"..."(17:03:50) <Notch> ok, it's updated now"</ref>

# 新内容
# = 方块 =
* *[钻石矿石](钻石矿石.md)<ref group="注" name="diamond blocks">[钻石块](钻石块.md)和[钻石矿石](钻石矿石.md)的纹理最迟于2010年1月28日17:03（UTC），即版本发布的几个小时前，被添加到terrain.png中。</ref>**
* 被破坏后掉落1-3个钻石。

* *[钻石块](钻石块.md)<ref group="注" name="diamond blocks" />**
* 被破坏后掉落自身。

* *[齿轮](齿轮.md)**<ref group="注">此版本中引入了齿轮的证据：
* Indev 20100125-2的文件中没有齿轮纹理。
* Indev 20100129的文件中含有齿轮纹理，时间为2010年1月26日 1:13-1:15（UTC）。
* Notch在2010年1月26日 1:36（UTC）的YouTube视频中展示了齿轮。
* * 这说明齿轮存在于2010年1月26日 1:15（UTC）至2010年1月29日 14:53（UTC）间发布的任意版本中，恰包括了此版本。</ref>
* 被破坏后掉落自身。
* 最开始在物品栏中无法显示其样子。<ref> 2010年1月26日 1:36 UTC。于2018年4月22日[存档](https://www.youtube.com/watch?v=V9H_ymjT-4E)。</ref>过了一段时间后，物品栏中的齿轮会变成一个旋转的齿轮动画，就像齿轮被放置后一样。
* 既不能直接破坏，也不能通过破坏其附着的方块来破坏齿轮，因为实际上齿轮仅与其相邻，就像[水](水.md)一样。
* * 只能通过爆炸来破坏齿轮。

# = 物品 =
* *[煤炭](煤炭.md)<ref name="release vid">2010年1月29日 10:32（UTC）。</ref>**
* 目前没有实际用途。

* *[钻石](钻石.md)<ref name="release vid" />**
* 目前没有实际用途。

* *[金锭](金锭.md)<ref name="release vid" />**
* 目前没有实际用途。

* *[铁锭](铁锭.md)<ref name="release vid" />**
* 目前没有实际用途。

* *[剑](剑.md)<ref name="release vid" />**
* 现在使用剑挖掘方块是徒手的1.5倍。

* *[工具](工具.md)**
* 加入了木质、石质和钻石质工具，即[斧](斧.md)、[锄](锄.md)、[镐](镐.md)、[锹](锹.md)和[剑](剑.md)的木质、石质和钻石变种。
* * 攻击伤害和挖掘速度钻石质比铁质高，石质比铁质低，木质最低。

# = 游戏内容 =
* *[合成](合成.md)**
* 按键进入合成界面。<ref name="WoN 0128 release" />
* 目前处于初步测试阶段。<ref></ref>
* 由于漏洞，目前暂时无法使用。<ref name="Crafting">[Adura的IRC记录](#logs.md): "(17:31:49) <Notch> press b in indev for a sneak preview (it doesn't work)"</ref>

# = 世界生成 =
* *[Indev房子](Indev房子.md)**
* 将新物品加入到工具箱子中。<ref name="release vid" />
* * 现在含有所有24种物品。

# = 常规 =
* *[控制](控制.md)**
* 按键进入合成界面。<ref name="WoN 0128 release" />
* * 与打开物品栏时不同，合成时[玩家](玩家.md)不能移动。

# 更改
# = 方块 =
* *[铁矿石](铁矿石.md)**
* 被破坏后会掉落它自身。

* *[金矿石](金矿石.md)**
* 被破坏后会掉落它自身。

* *[煤矿石](煤矿石.md)**
* 被破坏后会掉落1-3个[煤炭](煤炭.md)。

# = 物品 =
* *常规**
* 手持的物品现在拥有3D外观。<ref name="WoN 0128 release" /><ref name="release vid" /><ref></ref>

# = 世界生成 =
* *[Indev房子](Indev房子.md)**
* [箱子](箱子.md)中起始物品的堆叠数量从99升至100。<ref name="release vid" />

# = 游戏内容 =
* *[HUD](HUD.md)**
* 全屏模式不再会影响[平视显示器](平视显示器.md)，快捷栏和文本的显示。
* 即使重新加载世界，盔甲纹理也不会在对应的槽位中展示。

* *常规**
* 当玩家打开箱子时不再能移动。
* 物品栏中一组物品的数量上限从99降至50，箱子则由99升至100。<ref name="release vid" />

# = 常规 =
* *[控制](控制.md)**
* 左键单击物品栏会拿取或放下一组物品，右键单击物品栏会拿取或放下一个物品。<ref name="WoN 0128 release" />
* * 放下物品时，最多仅能恰好堆叠到一组。
* * 多余的物品仍会绕指针旋转。

# 修复
* *修复了1个漏洞**
* 由于从游戏中移除了盔甲槽纹理，现在不再能够获得了。</onlyinclude>

# 注释

# 参考
* [IRC记录](https://archive.org/download/Minecraft-IRCLogs), Adura.7z（UTC-5）

# 导航

[de:Indev 0.31 20100128](de:Indev 0.31 20100128.md)
[en:Java Edition Indev 0.31 20100128-2200](en:Java Edition Indev 0.31 20100128-2200.md)
[es:Java Edition Indev 0.31 20100128](es:Java Edition Indev 0.31 20100128.md)
[ja:Java Edition Indev 0.31 20100128](ja:Java Edition Indev 0.31 20100128.md)
[lzh:爪哇版方製版〇點三一二〇一〇〇一二八](lzh:爪哇版方製版〇點三一二〇一〇〇一二八.md)
[pt:Edição Java Indev 0.31 20100128](pt:Edição Java Indev 0.31 20100128.md)
[ru:Indev 0.31 20100128 (Java Edition)](ru:Indev 0.31 20100128 (Java Edition).md)