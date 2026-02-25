# Java版1.17-pre1

*页面ID: 82950* | *来源: Minecraft Wiki*

|parent=1.17
|prevparent=1.16.5
|prev=21w20a
|next=1.17-pre2
|nextparent=1.17.1
}}<onlyinclude>

* *1.17-pre1**是[Java版1.17](Java版1.17.md)的首个预发布版，发布于2021年5月27日<ref></ref>，重新加入了[蜡烛](蜡烛.md)的正常获取方式，加入了[杜鹃花丛盆栽](杜鹃花丛盆栽.md)、新的[进度](进度.md)、[闪烁标语](闪烁标语.md)、命令并修复了一些漏洞。

# 新内容
# = 方块 =
* *[杜鹃花丛盆栽](杜鹃花丛盆栽.md)和[盛开的杜鹃花丛盆栽](盛开的杜鹃花丛盆栽.md)**
* 通过将[杜鹃花丛](杜鹃花丛.md)或[盛开的杜鹃花丛](盛开的杜鹃花丛.md)放入[花盆](花盆.md)获得。

# = 命令格式 =
* ***
* 用于生成并保存性能分析数据。
* 执行会启动一段时长为10秒的记录，记录游戏刻执行时长和占用的堆内存大小等指标。
* 在10秒结束前执行能够提前结束记录。
* 结果保存于<samp>[.minecraft](.minecraft.md)/debug/profiling/<*时间戳*>.zip</samp>。

# = 游戏内容 =
* *[进度](进度.md)**
* 加入了11个新进度。
<!--
版本页面的内容属于“历史内容”，进度描述请勿使用模板。
要修改进度名称，请到和中进行。
在Crowdin approved前，请不要汉化尚未approved的进度名称和描述。
繁简转换请用。
-->
* * [](进度#advancements-anchor-adventure.spyglass_at_parrot.md)
* **
* * [](进度#advancements-anchor-adventure.spyglass_at_ghast.md)
* **
* * [](进度#advancements-anchor-adventure.spyglass_at_dragon.md)
* **
* * [](进度#advancements-anchor-adventure.lightning_rod_with_villager_no_fire.md)
* **
* * [](进度#advancements-anchor-adventure.walk_on_powder_snow_with_leather_boots.md)
* **
* * [](进度#advancements-anchor-husbandry.wax_on.md)
* **
* * [](进度#advancements-anchor-husbandry.wax_off.md)
* **
* * [](进度#advancements-anchor-husbandry.ride_a_boat_with_a_goat.md)
* **
* * [](进度#advancements-anchor-husbandry.make_a_sign_glow.md)
* **
* * [](进度#advancements-anchor-husbandry.axolotl_in_a_bucket.md)
* **
* * [](进度#advancements-anchor-husbandry.kill_axolotl_target.md)
* **
* 加入了3个进度触发器：
* * 加入了<code>started_riding</code>进度触发器，在玩家开始骑乘载具、或[实体](实体.md)开始骑乘玩家正在骑乘的载具时被触发。有以下可用条件：
* ** <code>player</code>对应开始骑乘载具的玩家或者载具上的乘客。
* * 加入了<code>lightning_strike</code>进度触发器，当雷击结束时触发（即[闪电](闪电.md)实体消失时）。可以作用于服务器上的任意玩家。有以下可用条件：
* ** <code>player</code>对应导致这个触发器被触发的玩家。
* ** <code>lightning</code>作为闪电实体的谓词。
* ** <code>bystander</code>作为位于闪电击中的区域周围但未被击中的实体的谓词。
* * 加入了<code>using_item</code>进度触发器，在任意游戏刻使用物品（如[弩](弩.md)、望远镜、[钓鱼竿](钓鱼竿.md)）时触发。有以下可用条件：
* ** <code>player</code>对应使用物品的玩家。
* ** <code>item</code>对应被使用的物品。

# = 常规 =
* *谓词**
* 加入了<code>lightning_bolt</code>子谓词。

* *[闪烁标语](闪烁标语.md)**
* 加入了下列闪烁标语：
* * <nowiki>[this splash text has been delayed until part 2]</nowiki>
* * Contains simulated goats!
* * Home-made!
* * There's <<a cat on ,my keyboard!~
* * The cutest predator you'll ever meet!
* * Now you are thinking with pistons!
* * Get to the coppah!
* * Board game version also available!
* * Honey, I waxed the copper!
* * Plant-based light sources!
* * Made by "real" people!

* *[标签](Java版标签.md)**
* 加入了<code>lava_pool_stone_replaceables</code>方块标签。
* * 包含所有[树叶](树叶.md)和[基岩](基岩.md)、[刷怪笼](刷怪笼.md)、[箱子](箱子.md)、[末地传送门框架](末地传送门框架.md)。

* 加入了<code>geode_invalid_blocks</code>方块标签。
* * 包含基岩、[水](水.md)、[熔岩](熔岩.md)、[冰](冰.md)、[浮冰](浮冰.md)、[蓝冰](蓝冰.md)。

# 更改
# = 方块 =
* *[蜡烛](蜡烛.md)**
* 重新将蜡烛加入到[创造模式物品栏](创造模式物品栏.md)中。
* 重新加入了蜡烛的合成配方。
* 更改了被点燃时的纹理。

* *[告示牌](告示牌.md)**
* 告示牌上的发光文字现在拥有发光外边框。

* *[杜鹃花丛](杜鹃花丛.md)和[盛开的杜鹃花丛](盛开的杜鹃花丛.md)**
* 现在放置在[黏土](黏土.md)上也能被[骨粉](骨粉.md)催熟为[杜鹃树](杜鹃树.md)。
* 不再能被[末影人](末影人.md)搬起。
* 盛开的杜鹃花丛不再能用于合成谜之炖菜。

* *[盛开的杜鹃树叶](盛开的杜鹃树叶.md)**
* 不再能用于合成谜之炖菜。

# = 命令格式 =
* ***
* 移除了命令，其功能被[调试组合键](调试屏幕#调试组合键.md)和命令取代。

# = 游戏内容 =
* *[进度](进度.md)**
* 为<code>effects_changed</code>进度触发器加入了新的条件<code>source</code>，对应触发更改的[实体](实体.md)。在以下情况下为空：
* * 不存在触发更改的实体（如从[信标](信标.md)中获得状态效果）
* * 实体将更改应用到自身
* * 实体被移除

# = 常规 =
* *制作人员名单**
* 更新了制作人员名单的文本，以与同步。
* 文本文件的格式由改为。
* 现在按住空格键可以加快[胜利屏幕](胜利屏幕.md)和[鸣谢与著作权说明屏幕](鸣谢与著作权说明屏幕.md)的滚动速度。

* *谓词**
* 为实体谓词加入了属性。
* 为子谓词加入了条件，对应玩家正在注视的实体。
* 物品谓词的字段被扩充为，现在能够接受物品类型的数组。
* 方块谓词的字段被扩充为，现在能够接受方块类型的数组。

* *[闪烁标语](闪烁标语.md)**
* 移除了“Woo /v/!”闪烁标语。

* *[标签](Java版标签.md)**
* 将[盛开的杜鹃花丛](盛开的杜鹃花丛.md)和[盛开的杜鹃树叶](盛开的杜鹃树叶.md)移出了<code>small_flowers</code>方块和物品标签，并加入到<code>flowers</code>方块和物品标签中。
* 从<code>mineable/axe</code>方块标签中移除了[覆地苔藓](覆地苔藓.md)。
* 将未涂蜡的氧化[铜块](铜块.md)及其各个变种加入到<code>needs_stone_tool</code>方块和物品标签中。

* *日志**
* 添加了slf4j（1.8.0-beta4）和对应的Log4j 2绑定作为日志门面。

# 修复
0处。
|148809|结构方块数据长度被限制到12。
|163945|相互交错的结构可以产生被损坏的方块实体（刷怪笼或箱子）。
|189336|在服务器列表中按住键移动服务器时会导致游戏崩溃（<code>ArrayIndexOutOfBoundsException</code>）。
|190952|制作者名单中，“Developers of Mo' Creatures”标题里的撇号与的其他地方的撇号不一致。
|192889|放置特定头颅或把它放在生物头盔槽内时会导致游戏回弹。
|197942|熔岩池附近的树叶会变成石头（MC-48340的后续问题）。
|198957|熔岩池附近的末地传送门框架会变成石头。
|202249|在新下界区块中的被激怒的被动生物会离旧区块很远，当它们进入下界传送门时会导致服务器卡死。
|203131|在模板池中把权重设置为一个很高的值时，会导致世界卡住和内存不足错误。
|209819|服务器会在寻路到一个被传送到很远的玩家处时崩溃。
|213062|废弃传送门会在末地传送门中间生成。
|218112|<code>SynchedEntityDatas</code>中使用线程锁的方法有误。
|218972|实体隐形时，发光效果的光圈会忽略实体的一部分。
|224778|不具有<code>facing</code>方块状态的方块在具有<code>#wall_corals</code>标签的暖水海洋中时，游戏崩溃。
|;dev
|203558|有时在点燃蜡烛时会出现延迟。
|203661|流体流过遮光玻璃时会很暗。
|203704|粒子设为“最少”时，蜡烛不显示火焰动画。
|204649|紫水晶块被特定生物走过时不会发出叮铃声。
|205035|在创造模式物品栏中，细雪桶没有与雪球或铁桶放在一起。
|208604|副手持已装填的弩且主手没有持有物品时，会看不见主手。
|211601|处理在计划刻后加载的实体会导致探测铁轨和压力板等方块被关闭。
|212142|即使已有自定义颜色时，对告示牌使用荧光墨囊不会让文本发光显示。
|212146|发光地衣可以在地下结构中浮空生成。
|212207|紫晶洞会在冰山内生成。
|213799|玩家手持垂滴叶时显示不正确。
|214057|同时处于水和熔岩中时，实体不再显示火焰动画。
|214636|小型垂滴叶的各叶片间会相互重叠，并导致深度冲突。
|214684|杜鹃花丛不能被放在花盆里。
|216276|自定义世界生成时，熔岩池会使基岩层被破坏。
|218831|游戏资源文件中缺失了一些着色器。
|219762|<code>BlendedNoise</code>中性能更高的噪声混合算法。
|221554|使用搜索功能搜索山羊刷怪蛋时，刷怪蛋会出现在不同种类的船之间。
|221819|不一致性：末影人能拿起盛开的杜鹃树叶，但不能拿起其他种类的树叶。
|221820|不一致性：末影人可以拿起盛开的杜鹃花丛，但不能拿起杜鹃花丛。
|223021|1.17中，<code>glShaderSource</code>会在某些AMD驱动上失败，并导致崩溃。
|223843|菌丝体在<code><samp>enderman_holdable.json</samp></code>中出现了两次。
|224159|有凋零效果时，伤害吸收部分的心的样式不会受到影响。
|224349|同一秒内尝试保存多个调试配置文件时无法正确保存除第一个以外的所有配置文件。
|224445|使用AMD驱动在极佳画质下重载资源包时屏幕会变黑，几次后会崩溃。
|224861|下落的方块在落地瞬间会消失。
|224862|即使在黏土上，对杜鹃花丛和杜鹃花丛使用骨粉也会被消耗。
|225010|在鼠标取着物品时关闭创造模式物品栏会把正拿着的物品变成幽灵物品。
|225129|玩家重生前不会消失。
|225193|山羊会尝试冲撞世界边界外的实体。
|225315|告示牌上被选中的文本会闪烁。
|225404|斧仍然是挖掘覆地苔藓的最佳工具。
|225722|<code>java.lang.IllegalArgumentException: bound must be positive</code>。
|225773|美西螈装死时会发出环境噪音。
|226192|尝试创建记分项时崩溃：<code>java.lang.NullPointerException: Cannot invoke "String.toLowerCase(java.util.Locale)" because "â˜ƒ" is null</code>。
|;previous
|225843|雪层仍然可以在湖上方浮空生成。
|225850|草、高草、花、高花、蕨、大型蕨和树可以被生成在沙子或沙砾上。
|225853|第一次启动21w20a时，游戏有时候会崩溃。
|225895|草仍然可以在熔岩湖上方浮空生成。
|225916|锈蚀的非涂蜡的铜块不需要石质及以上工具就可以被挖掘。
|225919|化石中的煤矿石可以穿过基岩生成。
|225929|物品统计的排序功能不能正常工作。
|225978|锈蚀的非涂蜡的铜块在<code><samp>needs_stone_tool.json</samp></code>中出现了两次。
|;private
|213869|末影龙所处区块重载后，末影龙死亡动画会被重置。
}}</onlyinclude>

# 画廊
<gallery>
1.17-pre1 (HD).png|更新日志首图的完整截图
</gallery>

# 参考

# 导航

[de:1.17-pre1](de:1.17-pre1.md)
[en:Java Edition 1.17 Pre-release 1](en:Java Edition 1.17 Pre-release 1.md)
[es:Java Edition 1.17 Pre-release 1](es:Java Edition 1.17 Pre-release 1.md)
[fr:Édition Java 1.17 Pre-release 1](fr:Édition Java 1.17 Pre-release 1.md)
[ja:Java Edition 1.17 Pre-release 1](ja:Java Edition 1.17 Pre-release 1.md)
[pt:Edição Java 1.17 Pre-release 1](pt:Edição Java 1.17 Pre-release 1.md)
[ru:1.17 Pre-release 1 (Java Edition)](ru:1.17 Pre-release 1 (Java Edition).md)