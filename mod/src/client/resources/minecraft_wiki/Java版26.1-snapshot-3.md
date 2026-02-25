# Java版26.1-snapshot-3

*页面ID: 182359* | *来源: Minecraft Wiki*

<onlyinclude>

* *26.1-snapshot-3**是[Java版26.1](Java版26.1.md)的第3个快照，发布于2026年1月13日<ref></ref>，修改了命令，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[选项](选项.md)**
* 加入了“世界选项”选项，在先前“难度”选项的位置。
* * 包括“难度”选项和游戏规则屏幕。
* * 因此，现在可以通过暂停菜单进入游戏规则屏幕，而不仅仅是在创建新的世界时。
* * 游戏规则屏幕仅对管理员可用。

* *用户界面**
* 在游戏规则屏幕的顶栏加入了一个搜索框。

* *[世界时钟](世界时钟.md)**
* 世界时钟包含一个内部时间，每[游戏刻](游戏刻.md)都会增加。它们可以定义在[数据包](数据包.md)的<code>world_clock</code>注册表下（<code>data/<namespace>/world_clock/<id></code>）。
* 世界时钟可以暂停或恢复，其时间也可以用查询。
* 格式：空对象。

* *[时间线定义格式](时间线定义格式.md)**
* 加入了<code>clock</code>字段：世界时钟ID，指定此时间线用哪个世界时钟。
* * 必选，但为了与之前的行为匹配，可以使用<code>minecraft:overworld</code>。
* 新增了一个可选的<code>time_markers</code>字段，用以指定带命名空间的时间标记ID与数值或对象的映射。
* * 格式：
* ** 非负整数，此时间标记的游戏刻。
* ** 或对象格式：
* *** <code>ticks</code>：在0至<code>period_ticks</code>的整数，此时间标记的游戏刻。
* *** <code>show_in_commands</code>：此时间标记是否显示在命令提示中，默认为<code>false</code>。

* *时间标记**
* 时间标记为特定世界时钟的特定时间节点赋予特定名称。时间标记取代了之前用在中的预设名称，如<code>day</code>和<code>night</code>。
* 时间标记会在特定的世界时钟中存在，这意味着不同的时间标记可以被不同的时间线定义，但只有一个具有特定ID、代表特定世界时钟的时间标记。这也意味着两个世界时钟可以有相同的时间标记。
* 时间标记的内置用途
* * 部分时间标记被用于控制游戏行为，它们不会在命令中提示：
* ** <code>minecraft:wake_up_from_sleep</code>：玩家从睡眠中醒来的时间。
* ** <code>minecraft:roll_village_siege</code>：开始评估僵尸围城发生的时间。

* *[标签](Java版标签.md)**
* 加入了方块标签：
* * ：
* ** 无法支撑[海带](海带.md)的方块。
* * ：
* ** 无法支撑[海草](海草.md)和[高海草](高海草.md)的方块。
* * ：
* ** 能生成[涡流气泡柱](涡流气泡柱.md)的方块。
* * ：
* ** 能生成[涌流气泡柱](涌流气泡柱.md)的方块。
* * ：
* ** 上方种植的[小麦植株](小麦植株.md)、[胡萝卜](胡萝卜.md)、[马铃薯](马铃薯.md)、[甜菜根](甜菜根.md)、[火把花植株](火把花植株.md)、[瓶子草植株](瓶子草植株.md)、[南瓜茎](南瓜茎.md)、[西瓜茎](西瓜茎.md)能够生长的方块。
* * ：
* ** 能支撑[仙人掌花](仙人掌花.md)、无视上表面完整性的方块。
* * ：
* ** 能支撑所有生长阶段的小麦植株、胡萝卜、马铃薯、甜菜根、火把花植株及瓶子草植株的方块。
* * ：
* * ：
* ** 能支撑[西瓜茎](西瓜茎.md)的方块。
* * ：
* ** 能支撑[南瓜茎](南瓜茎.md)的方块。
* * ：
* ** 能支撑[灌木丛](灌木丛.md)、[萤火虫灌木丛](萤火虫灌木丛.md)、[甜浆果丛](甜浆果丛.md)、[矮草丛](矮草丛.md)、[高草丛](高草丛.md)、[蕨](蕨.md)、[大型蕨](大型蕨.md)、[花](花.md)（[凋灵玫瑰](凋灵玫瑰.md)除外）、[粉红色花簇](粉红色花簇.md)、[野花簇](野花簇.md)、[树苗](树苗.md)的方块。
* * ：
* ** 能支撑[杜鹃花丛](杜鹃花丛.md)和[盛开的杜鹃花丛](盛开的杜鹃花丛.md)的方块。
* * ：
* ** 能支撑[仙人掌](仙人掌.md)的方块。
* * ：
* ** 能支撑[紫颂花](紫颂花.md)的方块。
* * ：
* ** 能支撑[紫颂植株](紫颂植株.md)的方块。
* * ：
* ** 能支撑[可可果](可可果.md)的方块。
* * ：
* ** 能支撑[诡异菌](诡异菌.md)的方块。
* * ：
* ** 能支撑[绯红菌](绯红菌.md)的方块。
* * ：
* ** 能支撑[诡异菌索](诡异菌索.md)的方块。
* * ：
* ** 能支撑[绯红菌索](绯红菌索.md)的方块。
* * ：默认为空
* ** 能支撑[青蛙卵](青蛙卵.md)的方块。
* * ：
* ** 能支撑[红树胎生苗](红树胎生苗.md)的方块。
* * ：
* ** 能支撑悬挂的红树胎生苗的方块。
* * ：
* ** 能支撑[睡莲](睡莲.md)的方块。
* * ：
* ** 能支撑[下界苗](下界苗.md)的方块。
* * ：
* ** 能支撑[下界疣](下界疣.md)的方块。
* * ：
* ** 能支撑[甘蔗](甘蔗.md)的方块。
* * ：
* ** 能与甘蔗下方方块毗邻的方块。
* * ：
* ** 能支撑[凋灵玫瑰](凋灵玫瑰.md)的方块。
* 加入了流体标签：
* * ：
* ** 能被[气泡柱](气泡柱.md)占据的流体。
* * ：
* ** 能支撑[青蛙卵](青蛙卵.md)的流体。
* * ：
* ** 能支撑[睡莲](睡莲.md)的流体。
* * ：
* ** [甘蔗](甘蔗.md)下方方块需要毗邻的流体。

# 更改
# = 方块 =
* *[铜箱子](铜箱子.md)**
* 圣诞节期间不再使用圣诞节礼物纹理。

# = 命令格式 =
* ***
* 现在所有的参数均可省略。
* * 目标选择器不存在时，默认为<code>@s</code>。
* * 挥动的手臂不存在时，默认为<code>mainhand</code>。

* ***
* 现在基于世界时钟。
* * 世界时钟可选择性地指定为命令的输入，如<code>/time of <clock> ...</code>。
* * 如果未指定世界时钟（像之前一样的<code>time ...</code>），则使用本维度默认的世界时钟。
* <code>set</code>和<code>add</code>子命令的返回值（<code>/execute store ...</code>）现在是世界时钟经过的总刻数，而不是当前时间。
* * 语法：
* ** <code>time [of <clock>] set &lt;time></code>：设置世界时钟经过的总刻数。
* ** <code>time [of <clock>] set <timemarker></code>：将当前的世界时钟快进到下一时间标记。
* *** 对于世界时钟<code>minecraft:overworld</code>，可用的时间标记是。
* ** <code>time [of <clock>] add &lt;time></code>：将当前的世界时钟加上刻数，可以为正数或负数。
* ** <code>time [of <clock>] pause</code>：暂停当前世界时钟。
* ** <code>time [of <clock>] resume</code>：继续暂停的世界时钟。
* ** <code>time [of <clock>] query &lt;timeline></code>：显示并返回当前时间线在本周期内经过的刻数。
* ** <code>time [of <clock>] query &lt;timeline> repetitions</code>：显示并返回当前时间线经过的周期数。
* ** <code>time [of <clock>] query time</code>：显示并返回当前世界时钟经过的总刻数。
* ** <code>time query gametime</code>：与之前一样，世界中经过的总刻数，不受更改的影响。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>97.0</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>78.0</code>。
* 绊线的纹理现在由alpha cutout渲染，而不再是透明的。

* *[调试屏幕](调试屏幕.md)**
* 从<code>local_difficulty</code>项拆分出了<code>day_count</code>项，显示玩家在世界内度过的游戏日。

* *[测试环境定义格式](测试环境定义格式.md)**
* 将<code>time_of_day</code>替换为<code>clock_time</code>。
* * 新增必选字段<code>clock</code>：一个世界时钟的ID，此世界时钟将被设置为对应时间。

* *[谓词](谓词.md)**
* <code>time_check</code>：
* * 新增字段<code>clock</code>：一个世界时钟的ID，指定对哪个世界时钟进行检查。

* *[配方](配方.md)**
* <code>result</code>字段现在在所有配方类型中更加一致。
* * 它现在可以使用简写格式，如<code>"minecraft:foo"</code>相当于<code>{"id":"minecraft:foo", "count": 1}</code>。
* * 对于配方类型，现在也可以接受<code>count</code>字段。

* *[维度类型](维度类型.md)**
* 增加了下列字段：
* * <code>default_clock</code>：可选的世界时钟ID。
* ** 指定用于的默认世界时钟。
* *** 如果不存在，那么将需要明确的世界时钟参数。
* ** 同时指定了要应用时间标记<code>minecraft:wake_up_from_sleep</code>和<code>minecraft:roll_village_siege</code>的世界时钟。
* *** 如果不存在，则这些时间标记将在本维度内永远不会生效。

* *[标签](Java版标签.md)**
* 更改了以下标签的名称以保持一致性：
* * <code>#dry_vegetation_may_place_on</code> → <code>#supports_dry_vegetation</code>
* ** 同时其中的值被替换为。
* * <code>#bamboo_plantable_on</code> → <code>#supports_bamboo</code>
* * <code>#small_dripleaf_placeable</code> → <code>#supports_small_dripleaf</code>
* * <code>#big_dripleaf_placeable</code> → <code>#supports_big_dripleaf</code>
* * <code>#mushroom_grow_block</code> → <code>#overrides_mushroom_light_requirement</code>
* * <code>#snow_layer_can_survive_on</code> → <code>#support_override_snow_layer</code>
* * <code>#snow_layer_cannot_survive_on</code> → <code>#cannot_support_snow_layer</code>

# 修复
挥动生物的副手时，主手的矛会播放动画。
|305156|UI刷新前，对话框元素不会显示。
|305251|旋风人对所有生物敌对。
|305261|<code>enchant_with_levels</code>和<code>enchant_randomly</code>物品修饰器类型会使游戏崩溃。
|305459|使用刷怪蛋生成村民时，其变种由世界原点(0,0,0)处的生物群系决定。
|;prev
|305540|流浪商人以3个绿宝石出售南瓜而不是海带。
|305577|猪灵不再逃离数量更多的疣猪兽。
}}</onlyinclude>

# 影片
由[slicedlime](slicedlime.md)製作的影片：

# 参考

# 导航

[de:26.1-snapshot-3](de:26.1-snapshot-3.md)
[en:Java Edition 26.1 Snapshot 3](en:Java Edition 26.1 Snapshot 3.md)
[es:Java Edition 26.1 Snapshot 3](es:Java Edition 26.1 Snapshot 3.md)
[fr:Édition Java 26.1 Snapshot 3](fr:Édition Java 26.1 Snapshot 3.md)
[it:Java Edition 26.1 Snapshot 3](it:Java Edition 26.1 Snapshot 3.md)
[ja:Java Edition 26.1 Snapshot 3](ja:Java Edition 26.1 Snapshot 3.md)
[lzh:爪哇版二六點一之快照三](lzh:爪哇版二六點一之快照三.md)
[pt:Edição Java 26.1 Snapshot 3](pt:Edição Java 26.1 Snapshot 3.md)
[ru:26.1 Snapshot 3 (Java Edition)](ru:26.1 Snapshot 3 (Java Edition).md)