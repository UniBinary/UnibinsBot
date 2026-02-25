# 编码格式/CritereonPredicate

*页面ID: 144292* | *来源: Minecraft Wiki*

此条目记录了所有准则谓词/进度谓词（Critereon Predicate）。

本条目部分内容合并自其他页面，详见[本页面的链入页面](special:链入页面/编码格式/CritereonPredicate.md)。

下列所有结构均需要与最新版本同步更新。

# 准则谓词
# = 方块谓词 =

<div class="treeview">
*  <code>BlockPredicate::CODEC</code><section begin="codec_block_predicate"/>
* * ：匹配的[方块](方块.md)。可以为以<code>#</code>开头的方块[标签](Java版标签.md)、一个方块ID的字符串、或以多个方块ID组成的字符串列表。
* * ：检查[方块实体组件](数据组件#方块实体组件.md)。当方块实体的组件内容与检测内容完全相同时测试成功。
* ** ：一项组件及检测内容。
* * ：匹配方块实体的任意NBT数据。可以为复合标签或字符串包裹的SNBT，格式参见和。
* * ：检查方块实体的某个组件是否满足某种条件。
* ** ：一个组件的检查。具体格式详见[数据组件谓词](数据组件谓词.md)。
* * ：匹配[方块状态](方块状态.md)。
* ** ：匹配指定方块属性。可以为精确匹配，也可以为范围匹配。为范围匹配时，若方块属性值为数字字符串，则直接比较数值；若为布尔值字符串，则<code>"true"</code>为较大值；其他方块属性值则按游戏内部顺序比较，例如拼图方块<code>orientation</code>方块属性的<code>"east_up"</code>大于<code>"up_north"</code>。
* *** ：方块属性值的最小值。
* *** ：方块属性值的最大值。
<section end="codec_block_predicate"/>
</div>

# = 伤害谓词 =

<div class="treeview">
*  <code>DamagePredicate::CODEC</code><section begin="codec_damage_predicate"/>
* * ：检查伤害是否被成功阻挡。
* * ：检查在减少伤害前实体即将受到的伤害总量。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查伤害的[来源实体](伤害来源.md)。
* **
* * ：检查在减少伤害后实体即将受到的伤害总量。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查伤害类型。
* **
<section end="codec_damage_predicate"/>
</div>

# = 伤害来源谓词 =

<div class="treeview">
*  <code>DamageSourcePredicate::CODEC</code><section begin="codec_damage_source_predicate"/>
* * ：检查伤害的[直接实体](伤害来源.md)。
* **
* * ：检查伤害的来源实体是否是直接造成伤害的实体。
* * ：检查伤害的[来源实体](伤害来源.md)。
* **
* * ：检测伤害类型标签。
* ** ：一项标签谓词。
* *** ：检查此伤害类型是否在此标签内。
* *** ：（命名空间ID）一个伤害类型[标签](Java版标签.md)。
<section end="codec_damage_source_predicate"/>
</div>

# = 距离谓词 =

<div class="treeview">
*  <code>DistancePredicate::CODEC</code><section begin="codec_distance_predicate"/>
* * ：检查绝对距离，以[欧几里得距离](欧几里得距离.md)计算。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查水平方向的距离，以欧几里得距离计算。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查X轴上的距离。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查Y轴上的距离。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查Z轴上的距离。匹配一个精确值，或者检测数值是否在范围之间。
* **
<section end="codec_distance_predicate"/>
</div>

# = 实体谓词 =

<div class="treeview">
*  <code>EntityPredicate::CODEC</code><section begin="codec_entity_predicate"/>
* * ：检查[实体组件](数据组件#实体组件.md)。当从实体获取的组件内容与检测内容完全相同时测试成功。
* ** ：一项组件及检测内容。
* * ：检查实体到执行位置的距离。
* **
* * ：检查实体的状态效果。
* **
* * ：检查实体身上的装备。
* ** ：检查动物身体槽位物品。
* ***
* ** ：检查胸甲槽位物品。
* ***
* ** ：检查靴子槽位物品。
* ***
* ** ：检查头盔槽位物品。
* ***
* ** ：检查护腿槽位物品。
* ***
* ** ：检查主手槽位物品。
* ***
* ** ：检查副手槽位物品。
* ***
* * ：检查实体特质。
* ** ：检查该实体是否是幼体。如果该实体是盔甲架，则以是否是小型盔甲架来判断。
* ** ：检查该实体是否正在飞行。
* ** ：检查该实体是否正立在地面上。
* ** ：检查该实体是否正在着火。
* ** ：检查该实体是否正在潜行。
* ** ：检查该实体是否正在疾跑。
* ** ：检查该实体是否正在游泳。
* ** ：检查该实体是否正在接触水。对气泡柱等方块也有效。
* ** ：检查该实体是否正在用鞘翅滑翔。
* * ：检查实体的位置。
* **
* * ：检查实体的运动状况，所有速度单位均为米每秒。
* ** ：检查摔落高度。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查水平速度分量。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查速度。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查垂直速度分量绝对值。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查X轴运动向量分量。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查Y轴运动向量分量。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查Z轴运动向量分量。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* * ：检查影响实体移动速度的方块位置，此位置最低不超过实体位置0.5格以下。
* **
* * ：匹配实体的任意NBT数据。可以为复合标签或字符串包裹的SNBT，格式参见和。
* * ：检查正在骑乘此实体的实体。
* **
* * ：检查实体的某个组件是否满足某种条件。
* ** ：一个组件的检查。具体格式详见[数据组件谓词](数据组件谓词.md)。
* * ：（）根据实体已经加载的时间，按照指定的周期，一个周期内只可能检查成功一次。
* * ：检查实体某些槽位内的物品。
* ** ：检查对应槽位范围内的物品。
* ***
* * ：检查实体脚下的位置。
* **
* * ：检查实体正要瞄准攻击的实体。
* **
* * ：匹配实体属于的[队伍](记分板#队伍.md)。
* * ：匹配的实体类型。可以为以<code>#</code>开头的实体类型[标签](Java版标签.md)、一个实体类型ID的字符串、或以多个实体类型ID组成的字符串列表。
* * ：实体子谓词，检查某些实体的特定属性。如果检查实体不是实体子谓词要求的实体，则检查直接失败。
* ** 见[实体子谓词](实体子谓词.md)。
* * ：检查此实体正在骑乘的实体。
* **
<section end="codec_entity_predicate"/>
</div>

# = 物品堆叠谓词 =

<div class="treeview">
*  <code>ItemPredicate::CODEC</code><section begin="codec_item_predicate"/>
* * ：检查物品的[物品堆叠组件](物品堆叠组件.md)。当物品的组件内容与检测内容完全相同时测试成功。
* ** ：一项组件及检测内容。
* * ：检查物品堆叠的数量。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：匹配的物品。可以为以<code>#</code>开头的物品标签、一个物品ID的字符串、或以多个物品ID组成的字符串列表。
* * ：检查物品的某个物品堆叠组件是否满足某种条件。
* ** ：一个组件的检查。具体格式详见[数据组件谓词](数据组件谓词.md)。
<section end="codec_item_predicate"/>
</div>

# = 位置信息谓词 =

<div class="treeview">
*  <code>LocationPredicate::CODEC</code><section begin="codec_location_predicate"/>
* * ：检查此位置是否在某[生物群系](生物群系.md)内。可以为以<code>#</code>开头的生物群系标签、一个生物群系ID的字符串、或以多个生物群系ID组成的字符串列表。
* * ：检查此位置的方块。
* **
* * ：检查此位置是否可以直接看见天空，即[天空光照等级](亮度#天空光照.md)是否为15。
* * ：检查此位置的维度。需为一个维度的命名空间ID。
* * ：检查此位置的[流体](流体.md)。
* ** ：匹配的流体。可以为以<code>#</code>开头的流体[标签](Java版标签.md)、一个流体ID的字符串、或以多个流体ID组成的字符串列表。
* ** ：匹配流体状态。
* *** ：匹配指定流体属性。可以为精确匹配，也可以为范围匹配。
* **** ：流体属性值的最小值。
* **** ：流体属性值的最大值。
* * ：检查可见光照的光照等级。使用<code>-{}-max(*内部天空光照*,*方块光照*)</code>计算。
* ** ：光照等级。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* * ：检查此位置的坐标。
* ** ：X坐标。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：Y坐标。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：Z坐标。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* * ：检查此位置是否位于一个[营火](营火.md)或[灵魂营火](灵魂营火.md)的上方，且高度不超过5格。
* * ：检查此位置是否在某[结构](结构.md)范围内。可以为以<code>#</code>开头的结构标签、一个结构ID的字符串、或以多个结构ID组成的字符串列表。
<section end="codec_location_predicate"/>
</div>

# = 数值界限范围 =

<div class="treeview">
*  <code>MinMaxBounds::createCodec</code><section begin="codec_min_max_bounds"/>
* * |min}}：数值的最小允许值。
* * |max}}：数值的最大允许值。
<section end="codec_min_max_bounds"/>
</div>

# = 生物状态效果谓词 =

<div class="treeview">
*  <code>MobEffectsPredicate::Codec</code><section begin="codec_mob_effects_predicate"/>
* * ：要检查的一项[状态效果](状态效果.md)。
* ** ：检查状态效果是否为信标添加。
* ** ：检查状态效果的倍率。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查状态效果的持续时间，单位为刻。匹配一个精确值，或者检测数值是否在范围之间。
* ***
* ** ：检查状态效果粒子是否可见。
<section end="codec_mob_effects_predicate"/>
</div>

# 数据组件谓词
# = 属性修饰符集合内容谓词 =

<div class="treeview">
*  <code>EntryPredicate::CODEC</code><section begin="codec_attribute_modifier_entry_predicate"/>
* * ：匹配修饰值，或者检测修饰值是否在范围之间。
* **
* * ：匹配的[属性](属性.md)。可以为以<code>#</code>开头的属性[标签](Java版标签.md)、一个属性ID的字符串、或以多个属性ID组成的字符串列表。
* * ：匹配属性修饰符的命名空间ID。
* * ：匹配属性修饰符操作方法。取值必须从中任选其一。
* * ：匹配属性修饰符生效的[装备槽位组](装备槽位组.md)。
<section end="codec_attribute_modifier_entry_predicate"/>
</div>

# = 集合谓词 =

<div class="treeview">
*  <code>CollectionPredicate::CODEC</code><section begin="codec_collection_predicate"/>
* * ：检查是否有符合特定谓词。要求每个谓词都有至少一个符合，一个不必符合所有谓词。

|=
* ** *集合内容谓词*
|compound=
* ** }}：一个谓词。
* *** |predicate}}
|
* ** }}：一个谓词。。
}}
* * ：检查的数量。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：统计并检查符合特定谓词的的数量。
* ** ：一个谓词及要求匹配的数量。
* *** ：匹配一个精确值，或者检测数值是否在范围之间。
* ****

|=
* *** *集合内容谓词*
|compound=
* *** |test}}：一个谓词。
* **** |predicate}}
|
* *** |test}}：一个谓词。。
}}
<section end="codec_collection_predicate"/>
</div>

# = 烟火谓词 =

<div class="treeview">
*  <code>FireworkPredicate::CODEC</code><section begin="codec_firework_predicate"/>
* * ：检测烟火是否有拖曳痕迹（使用[钻石](钻石.md)合成时）。
* * ：检测烟火是否出现闪烁效果（使用[荧石粉](荧石粉.md)合成时）。
* * ：检测烟火的爆裂形状是否为指定形状。可以为。
<section end="codec_firework_predicate"/>
</div>

# 实体子谓词
# = 闪电束谓词 =

<div class="treeview">
*  <code>LightningBoltPredicate::CODEC</code><section begin="codec_lightning_bolt_predicate"/>
* * ：检查被该闪电束点燃的方块数。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查被该闪电束击中的实体。
* **
<section end="codec_lightning_bolt_predicate"/>
</div>

# = 浮漂谓词 =

<div class="treeview">
*  <code>FishingHookPredicate::CODEC</code><section begin="codec_fishing_hook_predicate"/>
* * ：检查浮漂是否位于[开阔水域](钓鱼#垃圾与宝藏.md)。
<section end="codec_fishing_hook_predicate"/>
</div>

# = 玩家谓词 =

<div class="treeview">
*  <code>PlayerPredicate::CODEC</code><section begin="codec_player_predicate"/>
* * ：匹配玩家获得的[进度](进度.md)。
* ** ：可以为以直接检查此进度是否获得，也可以为格式检查此进度内部准则的达成情况。
* *** ：检查此项进度准则是否已达成。
* * ：检查玩家的[游戏模式](游戏模式.md)，当玩家当前的游戏模式在此列表中时测试成功。
* ** ：一个游戏模式。必须是<code>survival</code>（生存模式）、<code>adventure</code>（冒险模式）、<code>creative</code>（创造模式）或<code>spectator</code>（旁观模式）。
* * ：检查玩家的经验等级。匹配一个精确值，或者检测数值是否在范围之间。
* **
* * ：检查玩家正在观察的实体，需要其可见且在100个方块内。
* **
* * ：匹配玩家获得的[配方](配方.md)。
* ** ：检查玩家是否获得此配方。
* * ：匹配玩家的[统计信息](统计信息.md)。
* ** ：要检查的一项统计。统计类型与统计名称的取值及意义参见。
* *** ：统计类型。
* *** ：统计名称。
* *** ：检查此项统计的值。匹配一个精确值，或者检测数值是否在范围之间。
* ****
* * ：检查玩家是否按下相应的控制按键。
* ** ：。
* ** ：。
* ** ：。
* ** ：。
* ** ：。
* ** ：。
* ** ：。
* * ：检查玩家的[食物数据](饥饿#机制.md)。
* ** ：检查玩家的饥饿度等级。
* ***
* ** ：检查玩家的饱和度。
* ***
<section end="codec_player_predicate"/>
</div>

# = 史莱姆谓词 =

<div class="treeview">
*  <code>SlimePredicate::CODEC</code><section begin="codec_slime_predicate"/>
* * ：检查史莱姆或岩浆怪的[大小](史莱姆#实体数据.md)。匹配一个精确值，或者检测数值是否在范围之间。
* **
<section end="codec_slime_predicate"/>
</div>

# = 袭击者谓词 =

<div class="treeview">
*  <code>RaiderPredicate::CODEC</code><section begin="codec_raider_predicate"/>
* * ：（默认为<code>false</code>）检查袭击者是否正处于一场袭击中。
* * ：（默认为<code>false</code>）检查袭击者是否是[袭击队长](袭击队长.md)。
<section end="codec_raider_predicate"/>
</div>

# = 绵羊谓词 =

<div class="treeview">
*  <code>SheepPredicate::CODEC</code><section begin="codec_sheep_predicate"/>
* * ：检查绵羊是否已被修剪羊毛。
<section end="codec_sheep_predicate"/>
</div>

[Category:顶级数据值页面](Category:顶级数据值页面.md)
[Category:通过Nbt inherit加载的页面](Category:通过Nbt inherit加载的页面.md)