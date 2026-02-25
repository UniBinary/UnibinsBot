# 编码格式/Item

*页面ID: 143845* | *来源: Minecraft Wiki*

此条目记录了物品相关的NBT标签树。

本条目部分内容合并自其他页面，详见[本页面的链入页面](special:链入页面/编码格式/Item.md)。

下列结构需要与最新版本同步更新：

下列特定版本中出现的NBT结构：

# 当前版本
# = 数据组件修订 =

<div class="treeview">
*  <code>DataComponentPatch::CODEC</code><section begin="codec_data_component_patch"/>
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
<section end="codec_data_component_patch"/>
</div>

# = 物品共通标签 =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code><section begin="codec_item"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在或无效时则默认为1。
<section end="codec_item"/>
</div>

# = 物品共通标签（具有槽位） =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code> & <code>ContainerHelper::loadAllItems</code> & <code>ContainerHelper::saveAllItems</code><section begin="codec_item_with_slot"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在或无效时则默认为1。
* * ：当前物品所在的物品槽位。
<section end="codec_item_with_slot"/>
</div>

# = 物品模板 =

<div class="treeview">
*  <code>ItemStackTemplate::CODEC</code><section begin="codec_item_template"/>
* * ，则为一个物品的命名空间ID，此时物品的数量为1，物品堆叠的所有组件均使用默认值。此格式只用于定义，游戏只保存为格式。}}
* * }}，则可以指定物品堆叠的数量和组件修订。此物品堆叠必须满足[严格性验证](物品格式#严格性验证.md)，否则定义物品时解析失败，加载物品时认为是空气。}}
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠，不允许为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：要设置的数据组件。该标签的内容为相应的组件数据，将覆盖物品的默认组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：要移除的数据组件。该标签的内容将被忽略，物品不会具有该组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（默认为1，）物品的堆叠数。
<section end="codec_item_template"/>
</div>

# = 游戏档案 =

<div class="treeview">
*  <code>ResolvableProfile::CODEC</code><section begin="codec_resolvable_profile"/>
* *
* * ：玩家的[UUID](UUID.md)。
* * ：（长度不超过16，不能有空格和特殊字符，见）玩家名称。如果此项不存在则使用加载玩家数据。
* * ：玩家游戏档案属性。
* ** 形式，则游戏档案属性数据可以具有，且内部标签如下：}}
* ** ：一项游戏档案属性。
* *** ：游戏档案属性的名称。
* *** ：游戏档案属性的数据，是使用Base64编码的JSON数据。
* *** ：游戏档案属性的。
* ** 形式，则游戏档案属性数据不具有，且内部标签如下：}}
* ** ：游戏档案属性，可以保存多个不同数据但具有相同属性名称的游戏档案属性。
* *** ：游戏档案属性的数据，是使用Base64编码的JSON数据。
* *
* * ：（命名空间ID）[披风](披风.md)纹理。此值不存在时什么也不会渲染。游戏在渲染时将此值解析为。
* * ：（命名空间ID）[鞘翅](鞘翅.md)纹理。将覆盖生物实际装备的鞘翅纹理，此值不存在或生物没有装备鞘翅时什么也不会渲染。游戏在渲染时将此值解析为。
* * ：玩家模型类型，可以为。
* * ：（命名空间ID）[皮肤](皮肤.md)纹理。游戏在渲染时将此值解析为。
<section end="codec_resolvable_profile"/>
</div>

# = 单堆叠物品标签 =

<div class="treeview">
*  <code>ItemStack::SINGLE_ITEM_CODEC</code><section begin="codec_single_item"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
<section end="codec_single_item"/>
</div>

# 特定版本
# = 物品共通标签（23w13a_or_b） =

<div class="treeview">
*  <code>ItemStack::CODEC</code><section begin="codec_item_23w13a_or_b"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：[物品](物品.md)的堆叠数，不存在时则默认为1。当此值不大于0时在游戏系统中将此物品视为空气。
* * ：关于当前物品的额外信息，详细内容见[物品格式](物品格式/Java版1.20.5前.md)。此标签对于多数物品来说都是非必须项。
<section end="codec_item_23w13a_or_b"/>
</div>

# = 物品共通标签（具有槽位）（23w13a_or_b） =

<div class="treeview">
*  <code>ItemStack::CODEC</code> & <code>ContainerHelper::loadAllItems</code> & <code>ContainerHelper::saveAllItems</code><section begin="codec_item_with_slot_23w13a_or_b"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：[物品](物品.md)的堆叠数，不存在时则默认为1。当此值不大于0时在游戏系统中将此物品视为空气。
* * ：当前物品所在的物品槽位。
* * ：关于当前物品的额外信息，详细内容见[物品格式](物品格式/Java版1.20.5前.md)。此标签对于多数物品来说都是非必须项。
<section end="codec_item_with_slot_23w13a_or_b"/>
</div>

# = 物品共通标签（24w14potato） =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code><section begin="codec_item_24w14potato"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在时则默认为1。
<section end="codec_item_24w14potato"/>
</div>

# = 物品共通标签（具有槽位）（24w14potato） =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code> & <code>ContainerHelper::loadAllItems</code> & <code>ContainerHelper::saveAllItems</code><section begin="codec_item_with_slot_24w14potato"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在时则默认为1。
* * ：当前物品所在的物品槽位。
<section end="codec_item_with_slot_24w14potato"/>
</div>

# = 物品共通标签（25w14craftmine） =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code><section begin="codec_item_25w14craftmine"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在时则默认为1。
<section end="codec_item_25w14craftmine"/>
</div>

# = 物品共通标签（具有槽位）（25w14craftmine） =

<div class="treeview">
*  <code>ItemStack::CODEC/MAP_CODEC</code> & <code>ContainerHelper::loadAllItems</code> & <code>ContainerHelper::saveAllItems</code><section begin="codec_item_with_slot_25w14craftmine"/>
* * ：（[命名空间ID](命名空间ID.md)）表示某种类的物品堆叠。若未指定，游戏会在加载区块或者生成物品时将其变更为空气。
* * ：当前物品的组件修订，将修改物品的[数据组件](数据组件.md)信息。
* ** ：一项组件和其对应的数据，代表物品拥有此组件。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* ** ：存在时，使一个数据组件失效。此复合标签的内容不影响行为。设置组件数据时可以不写命名空间，但游戏在导出时会自行加上<code>minecraft:</code>前缀。
* * ：（）[物品](物品.md)的堆叠数。不存在时则默认为1。
* * ：当前物品所在的物品槽位。
<section end="codec_item_with_slot_25w14craftmine"/>
</div>

[Category:顶级数据值页面](Category:顶级数据值页面.md)
[Category:通过Nbt inherit加载的页面](Category:通过Nbt inherit加载的页面.md)