# Java版14w30c

*页面ID: 32652* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w30c**是[Java版1.8](Java版1.8.md)的第40个快照，发布于2014年7月24日<ref></ref>，修复了快照[14w30a](14w30a.md)和[14w30b](14w30b.md)中的一些漏洞和崩溃。

# 更改
# = 方块 =
* *[旗帜](旗帜.md)**
* 现在有了一些新图案。
* * “”在旗帜上添加一个十字图案（比使用横线略细）。
* * “”在旗帜上添加一个方框边图案（比使用横线细）。
* * “”在旗帜上添加一个波纹边图案。
* * “Mojang徽标”在旗帜上添加一个Mojang徽标图案。

# = 游戏内容 =
* *[亮度](亮度.md)**
* 现在会出现一些黑点。
* 黑点的漏洞是因为，这导致某些生物群系中的树木无法产生。<ref></ref>

# 修复
命令会发出信号。
|13771|地毯和雪层在手中显示不正确。
|31572|使用命令放置梯子时，实际放置的是一个透明方块。
|32930|雷雨的光照强度与普通雨的一致。
|37818|一个方块没有背面剔除，而其他方块则有剔除。
|38127|瓶子的纹理有问题。
|44801|1.7.4以上版本中有太多的<code>Excessive client-side chunk ticking</code>。
|45222|活板门锁在适当的位置。
|47974|农民种地时走路正常，但是不种地时走路会加速。
|48904|聊天中的文字不能正确包在一起，也不能正确换行。
|53206|Realms：“从其他位置加入游戏”问题。
|60665|被苦力怕炸毁的马铃薯的掉落物是种子。
|;dev
|45882|多人游戏中农民不种作物。
|46365|将村民推到下界传送门中时，游戏崩溃。
|46632|冰刺的顶部会悬空生成。
|47689|即使是小麦种子，也具有<code>CanPlaceOn</code>标签。
|50306|玩家头颅的<code>SkullOwner</code>标签不使用UUID；在用户名更改后，此标签会损坏。
|50376|使用命令会使得<code>stat.drop</code>统计项增加。
|50517|在手上或快捷栏、物品栏和物品展示框中，特定物品会旋转90°或180°。
|51239|信标光柱有问题。
|52084|玩了20到30分钟左右会出现性能下降。
|52547|在命令上使用的选择器与在它们所作用对象的身上直接使用选择器的效果不一样。
|53500|自定义世界中的海平面问题。
|55253|新的功能<code>{selector:"@..."}</code>在失败的选择器上失败。
|56041|小麦芽在夜间低亮度下会变回种子。
|56917|在某些显卡上，任何空区块（16×16×16）中的任何方块都是不可见的。
|57992|向日葵中部分纹理缺失。
|58512|多人游戏中，戴着玩家头颅的实体/被玩家用手击打的生物有奇怪的渲染问题。
|59704|在调试屏幕中，深色橡木木板变种显示的是<code>big_oak</code>。
|60529|可怕的GC活动。
|61603|向下看时，纹理会出现问题。
|61824|玻璃板纹理有问题。
|62017|使用附魔了精准采集的工具破坏金合欢和深色橡木的叶子时，掉落物显示的是无效纹理。
|62184|奇怪的水渲染。
|62331|打开调试模式会使服务器崩溃。
|62514|4×4资源包导致屏幕闪烁。
|62981|看向太阳、月亮和星星时，如果视距小于7，则看不到它们。
|62984|<code>Tesselating block model</code>崩溃（<code>java.lang.IndexOutOfBoundsException @ java.util.ArrayList.rangeCheck</code>）。
|62989|玩家头颅上的皮肤，除非把头颅放在头盔格或放置到地面上，否则不显示。
|62993|在特定群系中，某些树不正确、稀疏甚至完全不生成。
|63008|快捷栏、物品栏和UI中，如果有一个生物的头颅，那么在相同地方的透明方块的纹理会发生变化。
|63012|按键时，游戏崩溃。（<code>java.lang.NullPointerException: Batching chunks</code>）。
|63107|玩家头颅的问题。
|63288|启动器将崩溃报告的来源当作“被修改的版本”/崩溃报告的底部内容缺失。
|63333|在世界边界附近，地形表现的很奇怪。
|;prev
|63072|<code>Hopper: java.util.ConcurrentModificationException</code>。
|63148|在命令中使用键自动补全，不显示<code>LightningBolt</code>的选项。
|63188|14w30b中的崩溃问题（<code>Batching chunks</code><code>java.lang.ArrayIndexOutOfBoundsException</code>）。
|63197|14w30b中的崩溃问题：<code>Tesselating block model</code>（<code>java.lang.IndexOutOfBoundsException @ at java.nio.Buffer.checkIndex</code>）。
|63246|在世界边界外投掷末影之眼导致游戏崩溃。
|63290|纹理闪烁。
|63305|加载海洋并渲染区块时，游戏崩溃。
|63345|游戏每隔15分钟左右就开始崩溃。
|63369|闪电嵌入方块模型导致崩溃。
|63376|客户端每1-2分钟崩溃一次。
|63395|启动游戏时会随机崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:14w30c](de:14w30c.md)
[en:Java Edition 14w30c](en:Java Edition 14w30c.md)
[es:Java Edition 14w30c](es:Java Edition 14w30c.md)
[fr:Édition Java 14w30c](fr:Édition Java 14w30c.md)
[it:Java Edition 14w30c](it:Java Edition 14w30c.md)
[ja:Java Edition 14w30c](ja:Java Edition 14w30c.md)
[pt:Edição Java 14w30c](pt:Edição Java 14w30c.md)
[ru:14w30c (Java Edition)](ru:14w30c (Java Edition).md)