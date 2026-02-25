# Java版24w45a

*页面ID: 128464* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w45a**是[Java版1.21.4](Java版1.21.4.md)的第2个快照，发布于2024年11月6日<ref></ref>，修复了一些漏洞。

# 新内容
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了方块标签。
* * 蜜蜂会尝试在这些方块上授粉。
* 加入了下列物品标签：
* * ：骷髅更愿意拾取的物品。
* * ：猪灵更愿意拾取的物品。
* * ：掠夺者更愿意拾取的物品。
* * ：溺尸更愿意拾取的物品。

* *[物品模型](物品模型.md)**
* 现在引入新格式以描述物品模型。
* * 目前选用的物品模型都将基于<code>item_model</code>物品堆叠组件，如<code>item_modelfoo:bar</code>储存于。
* ** 文件夹不再受硬编码路径约束，这些文件现在只会在被文件夹中的定义调用时使用。
* ** 仅重定向到一个方块模型的中的模型现已移除。它们现在会直接调用模型。
* * 文件格式如下：
<div class="treeview">
  :*  父标签
  :** ：物品模型定义。
  :*** ：物品模型类型。
  :*** ：其他根据物品模型类型应用的字段，详见下文。
</div>
  * <code>overrides</code>段落已从现有的方块模型移除。
* 加入了下列物品模型类型：
* * <code>model</code>，用于从文件夹中渲染一个扁平模型，附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>model</code>。
  :** ：模型的命名空间ID，如<code>minecraft:block/yellow_glazed_terracotta</code>。
  :** ：对被渲染模型应用元素的着色源列表。首项应用于<code>tintindex</code>0，其次为-1，以此类推。
  :*** ：一个着色源。
  :**** ：着色源类型，见下文。
  :**** ：着色源类型的附加字段。
</div>
  * <code>special</code>，用于渲染一个特殊模型（非数据驱动），附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>special</code>。
  :** ：特殊模型实例。
  :*** ：特殊模型类型，见下文。
  :*** ：特殊模型类型的附加字段。
  :** ：中的模型的命名空间ID，提供转换、粒子纹理和GUI光。
</div>
  * <code>composite</code>，用于渲染多重子模型，所有模型都在同一空间中渲染，附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>composite</code>。
  :** ：要渲染的物品模型列表。
  :*** ：一个模型。列表靠前的会被靠后的模型覆盖。
</div>
  * <code>condition</code>，根据布尔值属性渲染一个物品模型，附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>condition</code>。
  :** ：布尔值属性类型，见下文。
  :** ：布尔值属性类型的附加字段。
  :** ：布尔值属性为<code>true</code>时渲染的物品模型。
  :** ：布尔值属性为<code>false</code>时渲染的物品模型。
</div>
  * <code>select</code>，根据离散值属性渲染一个物品模型，附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>select</code>。
  :** ：离散值属性类型，见下文。
  :** ：离散值属性类型的附加字段。
  :** ：匹配满足的情况列表。
  :*** ：一种情况。
  :**** ：值与属性相匹配，可选值取决于属性类型。
  :**** ：情况满足时所渲染的物品模型。
  :** ：所有情况都不满足时渲染的物品模型。不存在时将渲染“missing”模型。
</div>
  * <code>range_dispatch</code>，根据数字属性渲染一个物品模型，用于取代旧方块模型的<code>overrides</code>段落，附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>range_dispatch</code>。
  :** ：属性类型，见下文。
  :** ：属性类型的附加字段。
  :** ：与属性值相乘的因数。
  :** ：有效项列表。每项的顺序不影响最终结果，因为使用前总会按上界大小将所有项重新排序。
  :*** ：一项。
  :**** ：可接受的最终属性值的上界。小于或等于此值的最后一项将被选中。
  :**** ：此项选中时所渲染的物品模型。
  :** ：没有任何一项小于或等于最终属性值时渲染的物品模型。不存在时将渲染“missing”模型。
</div>
  * <code>bundle/selected_item</code>，渲染<code>bundle_contents</code>组件中选中堆叠的物品模型，没有选中的堆叠时不影响模型。
* 可用的着色源类型如下：
* * <code>constant</code>，返回恒定的RGB值。附加字段如下：
<div class="treeview">
  :** ：整型RGB值或RGB值数组。
</div>
  * <code>dye</code>，返回<code>dyed_color</code>物品堆叠组件的值，如果不存在则返回默认值。附加字段如下：
<div class="treeview">
  :** ：RGB值。
</div>
  * <code>grass</code>，基于返回特定气候参数下的草的颜色。附加字段如下：
<div class="treeview">
  :** ：（）同[生物群系数据格式](生物群系数据格式.md)中的<code>temperature</code>字段。
  :** ：（）同生物群系数据格式中的<code>downfall</code>字段。
</div>
  * <code>firework</code>，返回取自<code>firework_explosion</code>物品堆叠组件的颜色均值，如果组件为空则返回默认颜色。附加字段如下：
<div class="treeview">
  :** ：RGB值。
</div>
  * <code>potion</code>，返回取自<code>potion_contents</code>物品堆叠组件的颜色。组件存在时，优先返回组件中的自定义颜色，在效果列表为空时返回默认颜色，否则返回效果颜色的均值；如果组件不存在，则返回默认颜色。附加字段如下：
<div class="treeview">
  :** ：RGB值。
</div>
  * <code>map_color</code>，返回<code>map_color</code>物品堆叠组件的值；如果组件不存在，则返回默认颜色。附加字段如下：
<div class="treeview">
  :** ：RGB值。
</div>
  * <code>custom_model_data</code>，返回<code>custom_model_data</code>物品堆叠组件中列表中的值。附加字段如下：
<div class="treeview">
  :** ：（默认为0）<code>colors</code>列表中字段的索引。
</div>
* 可用的特殊模型类型如下：
* * <code>bed</code>，渲染一整张[床](床.md)。附加字段如下：
<div class="treeview">
  :** ：纹理的命名空间ID，将使用{{filename|textures/entity/bed/<-{}-此值>.png}}。
</div>
  * <code>banner</code>，渲染带有<code>banner_patterns</code>组件中图案的一幅旗帜。附加字段如下：
<div class="treeview">
  :** ：旗帜基底的颜色，需为16种预设颜色之一。
</div>
  * <code>conduit</code>，渲染[潮涌核心](潮涌核心.md)。
  * <code>chest</code>，渲染一个[箱子](箱子.md)。附加字段如下：
<div class="treeview">
  :** ：纹理的命名空间ID，将使用{{filename|textures/entity/chest/<-{}-此值>.png}}。
  :** ：（默认为0.0）<code>0.0</code>代表完全关闭，<code>1.0</code>代表完全打开。
</div>
  * <code>head</code>，渲染一个[生物头颅](生物头颅.md)。可用时将使用取自<code>profile</code>组件的[档案](档案.md)。附加字段如下：
<div class="treeview">
  :** ：之一。
</div>
  * <code>shulker_box</code>，渲染一个[潜影盒](潜影盒.md)。附加字段如下：
<div class="treeview">
  :** ：纹理的命名空间ID，将使用{{filename|textures/entity/shulker/<-{}-此值>.png}}。
  :** ：（默认为0.0）<code>0.0</code>代表完全关闭，<code>1.0</code>代表完全打开。
  :** ：渲染的方向，默认为<code>up</code>。
</div>
  * <code>shield</code>，渲染一个带有取自<code>banner_patterns</code>组件的图案和<code>base_color</code>组件的颜色的[盾牌](盾牌.md)。
  * <code>trident</code>，渲染一个[三叉戟](三叉戟.md)。
  * <code>decorated_pot</code>，渲染一个[饰纹陶罐](饰纹陶罐.md)，使用<code>pot_decorations</code>组件的值。
* 可用的布尔值属性如下：
* * <code>using_item</code>，玩家正在使用此物品时，返回<code>true</code>。
* * <code>broken</code>，可损坏的物品只剩余1点耐久度时，返回<code>true</code>。
* * <code>damaged</code>，可损坏的物品具有至少1点损耗值时，返回<code>true</code>。
* * <code>has_component</code>，给定组件存在于此物品上时，返回<code>true</code>。附加字段如下：
<div class="treeview">
  :** ：一个组件的命名空间ID。
</div>
  * <code>fishing_rod/cast</code>，[浮漂](浮漂.md)与正在使用的[钓鱼竿](钓鱼竿.md)相连时，返回<code>true</code>。
  * <code>bundle/has_selected_item</code>，[收纳袋](收纳袋.md)中的物品被选中时，返回<code>true</code>。
  * <code>xmas</code>，12月24日至12月26日期间，返回<code>true</code>。
  * <code>selected</code>，快捷栏中此物品被选中时，返回<code>true</code>。
  * <code>carried</code>，物品在GUI的槽位间变动时，返回<code>true</code>。
  * <code>shift_down</code>，玩家按住时，返回<code>true</code>。
  * <code>custom_model_data</code>，返回<code>custom_model_data</code>物品堆叠组件中列表中的值。附加字段如下：
<div class="treeview">
  :** ：（默认为0）<code>flags</code>列表中字段的索引。
</div>
* 可用的离散值属性如下：
* * <code>main_hand</code>，返回玩家持此物品的主手，可能为。
* * <code>charge_type</code>，返回储存于<code>charged_projectiles</code>物品堆叠组件中的填充物类型，可能为（组件为空或不存在）、（组件中至少存在一个[烟花火箭](烟花火箭.md)）或（其他情况）。
* * <code>trim_material</code>，在存在<code>trim</code>物品堆叠组件时返回其中<code>material</code>字段的值。
* * <code>block_state</code>，在存在<code>block_state</code>物品堆叠组件时返回其中指定属性字段的值。附加字段如下：
<div class="treeview">
  :** ：指定的方块属性。
</div>
  * <code>display_context</code>，返回物品渲染环境上下文，可能为。
  * <code>custom_model_data</code>，返回<code>custom_model_data</code>物品堆叠组件中列表中的值。附加字段如下：
<div class="treeview">
  :** ：（默认为0）<code>strings</code>列表中字段的索引。
</div>
* 可用的数字属性如下：
* * <code>custom_model_data</code>，返回<code>custom_model_data</code>物品堆叠组件中列表中的值。附加字段如下：
<div class="treeview">
  :** ：（默认为0）<code>floats</code>列表中字段的索引。
</div>
  * <code>bundle/fullness</code>，返回<code>bundle_contents</code>物品堆叠组件的总权重，组件不存在时返回0。
  * <code>damage</code>，返回<code>damage</code>物品堆叠组件的值，组件不存在时返回0。附加字段如下：
<div class="treeview">
  :** ：（默认为<code>true</code>）为<code>true</code>时返回损耗值（<code>damage</code>组件的值）与耐久度上限（<code>max_damage</code>组件的值）的比值（钳制于<code>0..1</code>间）；为<code>false</code>时返回损耗值（钳制于<code>0..max_damage</code>间）。
</div>
  * <code>count</code>，返回堆叠数量。附加字段如下：
<div class="treeview">
  :** ：（默认为<code>true</code>）为<code>true</code>时返回堆叠数与最大堆叠数（<code>max_stack_size</code>组件的值）的比值（钳制于<code>0..1</code>间）；为<code>false</code>时返回堆叠数（钳制于<code>0..max_stack_size</code>间）。
</div>
  * <code>cooldown</code>，返回物品剩余冷却时间的占比。
  * <code>time</code>，返回一日时间的占比，用于[钟](钟.md)。附加字段如下：
<div class="treeview">
  :** ：（默认为<code>true</code>）为<code>true</code>时，返回值会在目标值上下浮动一段时间，直到逐渐稳定。
  :** ：（默认为<code>true</code>）为<code>true</code>时，如果在<code>naturalfalse</code>的维度中，则返回随机值。
</div>
  * <code>compass</code>，返回持有者位置与目标位置在X-Z平面上的形成的角度占比。目标不存在、不在同一维度或离持有者太近时，返回随机值。附加字段如下：
<div class="treeview">
  :** ：可以为（指向[世界出生点](世界出生点.md)）、（指向储存于<code>lodestone_tracker</code>组件中的[磁石](磁石.md)的位置）或（指向玩家上次的死亡位置）。
  :** ：（默认为<code>true</code>）为<code>true</code>时，返回值会在目标值上下浮动一段时间，直到逐渐稳定。
</div>
  * <code>crossbow/pull</code>，返回[弩](弩.md)独有的使用次数。
  * <code>use_duration</code>，返回物品被持续的刻数。附加字段如下：
<div class="treeview">
  :** ：（默认为<code>false</code>）为<code>true</code>时，返回剩余使用刻数；为<code>false</code>时，返回已使用刻数。
</div>
  * <code>use_cycle</code>，返回以<code>period</code>为模的剩余使用刻数。附加字段如下：
<div class="treeview">
  :** ：（，默认为<code>1.0</code>）每次使用的周期刻数。
</div>

# 更改
# = 方块 =
* *[眼眸花](眼眸花.md)**
* 上个快照中张开的眼眸花和闭合的眼眸花相反的[地图基色](地图基色.md)和状态效果粒子颜色已修正。

* *[光源方块](光源方块.md)**
* 现在其物品默认具有<code>block_state</code>物品堆叠组件。

* *[树脂团](树脂团.md)**
* 现在能被方块直接替换。

# = 物品 =
* *[地图](地图.md)**
* 无效（即不具有<code>map_id</code>物品堆叠组件）的<code>filled_map</code>物品不再改变[物品展示框](物品展示框.md)的大小。

* *[谜之炖菜](谜之炖菜.md)**
* 修改了部分谜之炖菜状态效果的持续时间以同步：<!--未更改的效果不在此列-->
* * [抗火](抗火.md)：
* * [失明](失明.md)（使用[蓝花美耳草](蓝花美耳草.md)合成）：
* * [虚弱](虚弱.md)：
* * [生命恢复](生命恢复.md)：
* * [跳跃提升](跳跃提升.md)：
* * [凋零](凋零.md)：
* * [中毒](中毒.md)：

* *[树脂砖](树脂砖.md)**
* 试图使其取代树脂团成为盔甲纹饰材料。
* * 但由于未将其在物品标签<code>#trim_materials</code>中替换，这一更改并未完全实现，并导致锻造台出现一些怪异行为<ref></ref>。
* * 现在仍然可以将[树脂团](树脂团.md)放入锻造台，但不会输出任何物品。<ref></ref>
* * 树脂砖虽然已被覆写为新的[盔甲纹饰材料](盔甲纹饰材料.md)，但由于无法被放入锻造台，实际上没有作用。
* 不再在[林地府邸](林地府邸.md)的战利品箱内出现。

* *[创造模式物品栏](创造模式物品栏.md)**
* [眼眸花](眼眸花.md)物品现在位于火把花之后，而非蒲公英之后。

# = 生物 =
* *[蜜蜂](蜜蜂.md)**
* 不再尝试接触闭合的眼眸花。
* 不再能用闭合的眼眸花喂食蜜蜂。

* *[嘎枝](嘎枝.md)**
* 现在在生存模式或冒险模式玩家视线检测范围内的嘎枝不再能被击退。

* *幼年[狼](狼.md)和幼年[猫](猫.md)**
* 项圈颜色现在默认为其父母项圈颜色的有效混色，除非混色不存在或父母的项圈颜色无法混合。

* *[溺尸](溺尸.md)**
* 现在更愿意拾取[三叉戟](三叉戟.md)。

* *[玩家](玩家.md)**
* 客户端加载完成后，玩家的[无懈可击](无懈可击.md)会立即停止。
* * 加载期间，玩家仍然无懈可击，直到加载时长超过。

* *[猪灵](猪灵.md)和[掠夺者](掠夺者.md)**
* 现在更愿意拾取[弩](弩.md)。

* *[骷髅](骷髅.md)及其变种**
* 现在更愿意拾取[弓](弓.md)。

* *拾取[物品](物品（实体）.md)**
* 现在能装备于盔甲槽的物品会按以下顺序相比较：
* * 具有<code>prevent_armor_change</code>[魔咒效果组件](魔咒效果组件.md)（即[绑定诅咒](绑定诅咒.md)魔咒）的旧物品不会被替换。
* * 新物品具有更高的基础[护甲值](属性/护甲值.md)时，旧物品会被替换；更低时，不会发生替换；相同时，比较下一项。
* * 新物品具有更高的基础[盔甲韧性](属性/盔甲韧性.md)时，旧物品会被替换；更低时，不会发生替换；相同时，比较下一项。
* * 新物品附有更多[魔咒](魔咒.md)（仅<code>enchantments</code>组件中的魔咒）时，旧物品会被替换；更少时，不会发生替换；数量相同时，比较下一项。
* * 新物品拥有更多[耐久度](耐久度.md)时，旧物品会被替换；更少时，不会发生替换；相同时，比较下一项。
* * 新物品拥有自定义名称，且当前所装备的物品没有时，旧物品会被替换。否则，不会发生替换。
* 现在属于主手槽位的物品会按以下顺序相比较：
* * 新物品符合生物的意愿，且当前所持的物品不符合时，物品会被替换；反之，新物品不符合生物的意愿，且当前所持的物品符合时，物品不会被替换；其他情况则比较下一项。
* * 新物品具有更高的基础[攻击伤害](属性/攻击伤害.md)时，旧物品会被替换；更低时，不会发生替换；相同时，比较下一项。
* * 新物品附有更多魔咒（仅<code>enchantments</code>组件中的魔咒）时，旧物品会被替换；更少时，不会发生替换；数量相同时，比较下一项。
* * 新物品拥有更多耐久度时，旧物品会被替换；更少时，不会发生替换；相同时，比较下一项。
* * 新物品拥有自定义名称，且当前所持物品没有时，旧物品会被替换。否则，不会发生替换。

# = 常规 =
* *[盔甲纹饰](盔甲纹饰.md)定义**
* [注册表](注册表.md)中的<code>item_model_index</code>字段现在由于模型渲染不再需要而移除。

* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *数据生成器**
* 服务端Jar（<code>net.minecraft.data.Main</code>）中的数据生成器不再生成文件夹。
* * <code>--client</code>选项已从此入口点命令行移除。
* 新入口点（<code>net.minecraft.client.data.Main</code>）现在存在于客户端Jar文件内，命令行结构与服务端Jar中的相同。
* * 目前有效的选项：
* ** <code>--client</code>：生成文件夹。

* *[物品堆叠组件](物品堆叠组件.md)**
* 由<code>block_entity_data</code>组件产生的物品提示框警告不再能由其他任何组件隐藏。
* <code>equippable</code>组件中的<code>model</code>字段现已重命名为<code>asset_id</code>。
* 扩展了<code>custom_model_data</code>组件，现在格式如下：
<div class="treeview">
  *  父标签
  **  物品堆叠组件
  *** ：浮点数列表。
  *** ：布尔值列表。
  *** ：字符串列表。
  *** ：RGB颜色值列表。
</div>

* *[物品修饰器](物品修饰器.md)**
* <code>set_custom_model_data</code>修饰器现在拥有更多字段来适应更复杂的<code>custom_model_data</code>组件结构。
<div class="treeview">
  *  父标签
  ** ：<code>set_custom_model_data</code>。
  ** ：操控数值提供器列表。
  ** ：操控布尔值列表。
  ** ：操控字符串列表。
  ** ：操控RGB颜色值列表。
</div>
  * 列表中的操作与<code>set_fireworks</code>修饰器中的<code>explosions</code>格式相同。
  * 示例如<code>{function:"set_custom_model_data",floats:{values:[2],mode:replace_all}}</code>设置会将<code>floats</code>替换为2。

* *网络协议**
* 客户端现在会在首次载入世界或重生加载屏幕后的加载地形界面关闭时发送<code>minecraft:player_loaded</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 文件夹现在上移一级，即现在移动到。
* <code>broken_elytra</code>模型和纹理现在重命名为<code>elytra_broken</code>。

* *[标签](Java版标签.md)**
* 移除了<code>#tall_flowers</code>方块标签。
* 移除了物品标签。

# 修复
+不会复制它们的蜂蜜等级。
|160051|玩家能通过重载世界/重进服务器免疫火焰伤害。
|166072|自定义三叉戟模型忽略段落。
|186341|命令自动补全不考虑斜杠或句点后的部分。
|193176|大多数具有<code>CanPickUpLoot</code>的生物都倾向于剑而非斧，使得它们的武器降级。
|193313|生物拾取物品的行为判断不清晰，导致生物不断掉落和拾取物品。
|193336|被末影人拿着或作为方块展示实体的头颅不渲染。
|201940|死亡后，末影龙身体部件碰撞箱不会随主体碰撞箱上移。
|202250|在浮于浅水的船上时，会出现疾跑粒子。
|206684|望远镜粒子没有相关纹理。
|229142|望远镜纹理不允许由资源包覆写。
|236295|游戏不会向输出日志报告模型中缺失的粒子纹理引用。
|249079|背面的幽匿脉络未正常镜像。
|260216|被末影人拿着或作为方块展示实体的饰纹陶罐不渲染。
|266572|经验球被风弹击中时，其物理碰撞比物品实体更卡顿。
|267343|疾跑未在骑上实体时取消。
|269616|遥测数据滚动条没有背景。
|269749|举报玩家滚动条没有背景。
|270136|具有<code>custom_model_data</code>的投掷物破碎时没有保持合适的粒子。
|270529|空气的模型未定义粒子纹理，导致出现问题。
|271786|<code>noise_provider</code>中的空方块状态未产生验证错误，进而导致崩溃。
|272994|玩家绑定的悦灵能被火焰附加的横扫攻击引火上身。
|273407|具有自定义方块状态的方块实体物品被放置时会将此状态以组件保存。
|273450|<code>CanPickUpLoot:1b</code>的生物对重锤/三叉戟的行为不一致。
|273522|具有<code>CanPickUpLoot</code>的生物不再在已拾取未附魔物品后拾取附魔物品。
|273635|放置试炼刷怪笼的玩家脱离创造模式后，试炼刷怪笼会忘记其被刷怪蛋指定的生物。
|274268|冷却结束后，试炼刷怪笼不断闪烁。
|275011|站在蜘蛛网中时，瞬间挖掘不生效。<!--
|275215|窗口过小时，实验性内容警告超出屏幕。-->
|275338|在骑乘脱轨矿车的同时能看见疾跑粒子。
|276110|<code>honey_level</code>模型谓词的范围为1表示5级，而0表示级。
|276115|蜂巢和蜂箱的新物品模型未使用父级方块。
|276412|自定义物品模型设为盾牌和其他几种物品时，物品隐形。
|276654|<code>item_model</code>物品组件对三叉戟失效。
|276728|自定义物品模型为方块时，物品栏中的三叉戟和望远镜显暗。
|276730|自定义物品模型为方块时，物品栏中展示物品的收纳袋显暗。
|276731|使用实体模型的物品不会渲染另一个通过物品模型组件指定的实体模型。
|276732|由物品ID限定的颜色会影响到目标模型。
|276764|具有自定义模型的鸡蛋能使用这个模型的粒子，但雪球不能。
|276769|投掷使用特殊模板模型的鸡蛋时出现无效纹理。
|276771|使用模板模型的可损坏物品缺少损坏纹理。
|276828|模型未能定义纹理时，Minecraft不再将错误输出到游戏日志。
|276847|给定不同收纳袋模型的收纳袋不会在展示其中物品时保留颜色。
|277082|嘎枝能被风弹击退。
|277092|隐形的嘎枝的眼眸不可见。
|277149|嘎枝能被重锤猛击的击退影响。
|277243|嘎枝能被冲击弓击退。
|277264|嘎枝能被僵尸疣猪兽击退。
|277916|升级某些版本的世界时，容器被上锁。
|;1.21.3的漏洞
|277961|经验球的弹跳有问题。
|;prev
|277925|树脂砖楼梯不在<code>#stairs</code>方块标签和物品标签中。
|277926|树脂砖台阶不在<code>#slab</code>方块标签和物品标签中。
|277929|尝试使用虚空预设时，游戏崩溃。
|277930|眼眸花的字幕反了。
|277931|和张开的眼眸花不在地图上正常显示。
|277932|树脂团不在<code>#replaceable</code>方块标签中。
|277933|锻造台原料槽不会展示树脂团图标。
|277939|Programmer Art的空槽位图标可能未于24w44a正常更新。
|277941|<code>resin_clump</code>的背面未正常镜像。
|277945|“Elytra swooshes”字幕中动词形式不当。
|277950|张开的眼眸花盆栽较暗（<code>flower_pot_cross_emissive</code>）。
|277951|创造模式物品栏中的眼眸花的位置不在意料之中。
|277952|疾跑不在用鞘翅起飞时取消。
|277954|水下的嘎枝之心循环播放生成音效。
|277955|使用织布机会导致游戏崩溃。
|277964|被玩家驯服的狼攻击的嘎枝不会导致树脂生成。
|277966|嘎枝不会因玩家造成的爆炸生成树脂。
|277967|发生于死亡动画中的嘎枝附近的某些爆炸会导致游戏崩溃。
|277970|与方块侧面连接的悬挂式告示牌未显示锁链。
|277972|在台阶下下蹲不再能游泳。
|277983|自然生成的嘎枝之心会在被创造模式玩家破坏时掉落经验。
|277994|选取饰纹陶罐或潜影盒总是保留其容器数据。
|278002|嘎枝之心生成树脂不会激活幽匿感测体。
|278004|用风弹击中嘎枝之心能杀死嘎枝。
|278028|在水下使用物品能强制脱离游泳模式。
|278071|投掷三叉戟时，“minecraft.used:minecraft.trident”不会增长。
}}</onlyinclude>

# 参考

# 导航

[de:24w45a](de:24w45a.md)
[en:Java Edition 24w45a](en:Java Edition 24w45a.md)
[es:Java Edition 24w45a](es:Java Edition 24w45a.md)
[fr:Édition Java 24w45a](fr:Édition Java 24w45a.md)
[ja:Java Edition 24w45a](ja:Java Edition 24w45a.md)
[pt:Edição Java 24w45a](pt:Edição Java 24w45a.md)
[ru:24w45a (Java Edition)](ru:24w45a (Java Edition).md)
[uk:24w45a (Java Edition)](uk:24w45a (Java Edition).md)