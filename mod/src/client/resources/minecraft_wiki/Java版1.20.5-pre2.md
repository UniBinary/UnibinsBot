# Java版1.20.5-pre2

*页面ID: 119043* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.20.5-pre2**是[Java版1.20.5](Java版1.20.5.md)的第2个预发布版，发布于2024年4月15日<ref></ref>，修复了一些漏洞。

# 更改
# = 生物 =
* *[狼](狼.md)**
* 不再渲染铠甲槽的[马铠](马铠.md)。

# = 游戏内容 =
* *[进度](进度.md)**
* 将“”重命名为“[](进度#advancements-anchor-husbandry.remove_wolf_armor.md)”。

# = 常规 =
* *[属性](属性.md)**
* <code>generic.scale</code>属性不再影响[末影龙](末影龙.md)的[边界箱](边界箱.md)。
* <code>generic.step_height</code>现在会在与生物的高度差≤10的方块中从低到高寻找可容纳生物的空间。

* *[选取方块](选取方块.md)**
* 现在所选取方块的物品提示框中不再显示<code>(+NBT)</code>。

* *[背景图](背景图.md)**
* 现在进入世界加载地形时，会显示[主菜单](主菜单.md)全景图。
* 现在从[下界](下界.md)跨越维度或前往下界时，会显示[下界传送门](下界传送门（方块）.md)纹理动画。
* 现在从[末地](末地.md)跨越维度或前往末地时，会显示[末地传送门](末地传送门（方块）.md)纹理动画。
* * 从下界前往末地或从末地前往下界总会显示下界传送门纹理动画。<ref></ref>

* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *协议**
* 从服务器发送中的无效数据现在将导致游戏客户端断开连接。

* *[战利品表函数](战利品表函数.md)**
* <code>set_fireworks</code>中的现在被组合为一个复合标签。
* * 示例：<code>{ "explosions": <list>, "mode": <mode>, <mode-dependent fields>}</code>现在变为<code>{"explosions": {"values": <list>, "mode": <mode>, <mode-dependent fields>}}</code>。
* ** 其中，<code>explosions</code>可选，而<code>values</code>必选。

# 修复
有时不检查位置是已加载还是在世界外，游戏崩溃了。
|265585|含水屏障不会漫射天空光照。
|265709|（仅限服务器）GUI中超过第32行的切石机输出终止。
|265741|含水屏障不在地图上显示。
|266997|破坏正在播放闭合动画的潜影盒时，天空光照不更新。
|;1.20.4的漏洞
|267352|中不存在<code>Player</code>标签时，单人世界不加载。
|269472|当<code>table_bonus</code>战利品表条件具有空概率列表时，游戏崩溃。
|269755|在“”界面的滚动条将半透明像素渲染得不透明，这与其他滚动条不同。
|269763|在“Minecraft Realms”界面的滚动条将半透明像素渲染得不透明，这与其他滚动条不同。
|;dev
|267381|<code>generic.step_height</code>属性较高时不能潜行移动。
|267414|末影龙的<code>scale</code>属性造成严重的TPS损失。
|268015|潜影贝发射的潜影弹不使用<code>scale</code>属性。
|268035|更改语言时，True Type字体造成渲染遮盖错误。
|268064|未蜷缩的犰狳可以在死亡动画中蜷缩。
|268257|给羊驼装备地毯不播放音效。
|268804|尽管生命值为满，在狼攻击时为其穿上狼铠会重置喂食计数器。
|268810|尽管NBT已被组件取代，但使用+键获取的箱子仍叫<code>(+NBT)</code>。
|268854|物品中缺失<code>Type</code>字段的烟花火箭爆炸未被正常升级。
|268858|将狼铠放进附魔台时，用于附魔的按钮启用了。
|268984|运行抛出<code>EncoderException</code>。
|269123|在重新加载更改着色器的资源包前，启用或禁用此资源包不会影响着色器。
|269161|切石机不支持<code>result</code>物品类型相同的多个配方。
|269171|当接收包含深度嵌套的NBT数据的<code>system_chat</code>数据包时，客户端断开连接。
|269173|服务端不能发送包含深度嵌套的NBT数据的<code>system_chat</code>数据包。
|269300|“”离标题分隔符太近。
|269304|狼身上的马铠渲染异常。
|269415|<code>set_fireworks</code>中，即使当<code>explosions</code>可选时，<code>mode</code>也是必要的。
|269619|在“”界面的滚动条将半透明像素渲染得不透明，这与其他滚动条不同。
|269660|<code>arguments.item.predicate.unknown</code>的引号不相同。
|269802|选中一个村民交易项会合并带有不同组件的物品。
|269932|尝试用最大堆叠数量较低的物品交易时，物品消失了。
|270003|灾厄旗帜不能被键选取。
|270049|附魔台按钮和等级图标将半透明像素渲染得不透明。
|270116|<code>minecraft:generic.fall_damage_multiplier</code>属性对许多具有非标准掉落伤害行为的生物无效。
|270117|计算马、驴、骡、僵尸马、骷髅马、骆驼、羊驼、行商羊驼和狐狸的摔落伤害时，忽略了<code>minecraft:generic.safe_fall_distance</code>。
|270262|玩家可以在进入世界时看到加载世界的过程。
|270265|模糊程度滑动条被设为0%时不显示为“”。
|270413|一个方块的NBT副本与此方块的原始副本**完全**相同，此方块的n次复制物品带有一个<code>Items</code>方块数据且会在物品提示框中显示n行<code>(+nbt)</code>。
|270559|<code>FreeType error: Unrecognized error: 0x62 (Loading glyph)</code>。
|;prev
|270590|创造模式物品栏开启时，从其中掉落的物品被删除。
|270603|升级世界时崩溃：<code>ClassCastException: RegularImmutableList cannot be cast to class com.mojang.datafixers.util.Pair</code>。
|270610|一些新进度的标题被错误地大小写。
|270648|带有绑定诅咒魔咒的狼铠不能被创造模式玩家剪刀从狼身上取下。
|270679|点击带有<code>run_command</code>的文本会导致<code>EncoderException</code>并退回多人游戏菜单。
|270712|如果<code>generic.step_height</code>被设为0，则不能在潜行时移动。
|270767|皮革马铠不再保护马不受细雪冻伤。
}}</onlyinclude>

# 参考

# 导航

[de:1.20.5-pre2](de:1.20.5-pre2.md)
[en:Java Edition 1.20.5 Pre-Release 2](en:Java Edition 1.20.5 Pre-Release 2.md)
[es:Java Edition 1.20.5 Pre-Release 2](es:Java Edition 1.20.5 Pre-Release 2.md)
[fr:Édition Java 1.20.5 Pre-Release 2](fr:Édition Java 1.20.5 Pre-Release 2.md)
[ja:Java Edition 1.20.5 Pre-Release 2](ja:Java Edition 1.20.5 Pre-Release 2.md)
[lzh:爪哇版一點二〇點五之預二](lzh:爪哇版一點二〇點五之預二.md)
[pt:Edição Java 1.20.5 Pre-Release 2](pt:Edição Java 1.20.5 Pre-Release 2.md)
[ru:1.20.5 Pre-Release 2 (Java Edition)](ru:1.20.5 Pre-Release 2 (Java Edition).md)
[uk:1.20.5 Pre-Release 2 (Java Edition)](uk:1.20.5 Pre-Release 2 (Java Edition).md)