# 编码格式/DataComponent

*页面ID: 147941* | *来源: Minecraft Wiki*

此条目记录了所有的数据组件。

本条目的所有结构名称均来自[游戏源代码](混淆映射表.md)的<samp>net.minecraft.core.component.DataComponents</samp>，各结构以结构名 - 值的方式书写。

各组件结构及其引用方式均遵守下列格式：

本页面部分内容合并自其他页面，见[注释](#注释.md)。

# 当前版本
# = additional_trade_cost =
<div class="treeview"><section begin="codec_additional_trade_cost_component"/>
* * ：村民收购物品的增加量。
<section end="codec_additional_trade_cost_component"/></div>

# = attack_range =
<div class="treeview"><section begin="codec_attack_range_component"/>
* * ：生物持有此物品时的攻击距离，会覆写玩家的[实体交互距离](属性/实体交互距离.md)属性。
* ** ：（，默认为0）攻击者到目标的最小有效距离。以攻击者眼睛位置、沿视角方向到被攻击者攻击判定箱的最小距离计算。
* ** ：（，默认为3）攻击者到目标的最大有效距离。以攻击者眼睛位置、沿视角方向到被攻击者攻击判定箱的最小距离计算。
* ** ：（，默认为0）创造模式玩家到目标的最小有效距离，计算方式同上。
* ** ：（，默认为5）创造模式玩家到目标的最大有效距离，计算方式同上。
* ** ：（，默认为0.3）决定攻击判定箱的大小。游戏将实体的碰撞箱向各个方向扩展此距离得到攻击判定箱。
* ** ：（，默认为1.0）对于非玩家生物，其使用的最小有效距离和最大有效距离的缩放乘数。
<section end="codec_attack_range_component"/></div>

# = attribute_modifiers =
<div class="treeview"><section begin="codec_attribute_modifiers_component"/>
* * ：物品为持有者提供的[属性修饰符](属性修饰符.md)。
* ** ：一个修饰符。
* *** ：计算中修饰符调整基础值的数值。
* *** ：属性修饰符在提示框的显示方式。
* **** ：显示类型，枚举值见下。
* **** 为时，显示此项计算后的属性修饰符值。此项也为默认值。}}
* **** 为时，不显示此项属性修饰符值。}}
* **** 为时，替换所显示的属性修饰符文本，附加字段如下：}}
* **** ：（[文本组件](文本组件.md)）替换后的文本。
* *** ：（命名空间ID）当前[属性修饰符](属性修饰符.md)的ID。
* *** ：定义修饰符对属性的基础值的[运算方法](属性#运算模式.md)。可以为<code>add_value</code>（Op0）、<code>add_multiplied_base</code>（Op1）、<code>add_multiplied_total</code>（Op2）。
* *** ：（默认为<code>any</code>）一个[装备槽位组](装备槽位组.md)，指定修饰符的有效槽位。
* *** ：（命名空间ID）一个[属性](属性.md)的ID，表示当前属性修饰符要修饰的属性。
<section end="codec_attribute_modifiers_component"/></div>

# = axolotl/variant =
<div class="treeview"><section begin="codec_axolotl_variant_component"/>
* * ：[美西螈](美西螈.md)的变种。取值只能为<code>lucy</code>（粉红色）、<code>wild</code>（棕色）、<code>gold</code>（金色）、<code>cyan</code>（青色）或<code>blue</code>（蓝色）。
<section end="codec_axolotl_variant_component"/></div>

# = banner_patterns =
<div class="treeview"><section begin="codec_banner_patterns_component"/>
* * ：旗帜图案的。
* ** ：一层图案。
* *** ：这一层图案的颜色。取值为[染料颜色](染料颜色.md)，即。
* *** ：这一层图案的样式。可以为旗帜图案的ID，也可以是旗帜图案的内联格式，见。
* ****
<section end="codec_banner_patterns_component"/></div>

# = base_color =
<div class="treeview"><section begin="codec_base_color_component"/>
* * ：[盾牌](盾牌.md)的基础颜色，同时影响盾牌的名称。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_base_color_component"/></div>

# = bees =
<div class="treeview"><section begin="codec_bees_component"/>
* * ：[蜂巢（方块）](蜂巢（方块）.md)和[蜂箱](蜂箱.md)的蜜蜂数据。
* ** ：一只蜜蜂的数据。
* *** ：蜜蜂的部分实体数据。如果采用字符串格式进行定义，则游戏会将字符串的内容视为[SNBT](SNBT.md)加载，游戏只保存为复合标签格式。
* **** 见[实体数据格式](实体数据格式.md)。下列标签不会被保存，也不会被加载：、、、、、、、、、、、、、、、、、、、、、、、、、。
* *** ：蜜蜂会在巢内滞留的最短时间。
* *** ：蜜蜂在巢内已滞留的时间。
<section end="codec_bees_component"/></div>

# = block_entity_data =
<div class="treeview"><section begin="codec_block_entity_data_component"/>
* * ：物品放置方块时将套用到方块实体的数据。如果采用字符串格式进行定义，则游戏会将字符串的内容视为[SNBT](SNBT.md)加载，游戏只保存为复合标签格式。
* ** ：（命名空间ID）方块实体。
* ** 若干与该方块对应的方块实体数据标签，见[方块实体数据格式](方块实体数据格式.md)。
<section end="codec_block_entity_data_component"/></div>

# = block_state =
<div class="treeview"><section begin="codec_block_state_component"/>
* * ：物品放置方块时将要设置的[方块状态](方块状态.md)。
* ** ：此项方块属性的值。
<section end="codec_block_state_component"/></div>

# = blocks_attacks =
<div class="treeview"><section begin="codec_blocks_attacks_component"/>
* * ：物品使用时的格挡行为。
* ** ：（，默认为<code>0</code>）成功阻挡攻击前需要按住右键的秒数。
* ** ：成功阻挡攻击时播放的声音事件。
* ***
* ** ：（命名空间ID）可以无视此物品的阻挡而造成实际伤害的伤害类型。应为一个带<code>#</code>前缀的标签ID，游戏会将此值解析为[伤害类型标签](Java版标签/伤害类型.md)，如果伤害类型标签不存在则可以阻挡任何伤害。
* ** ：控制可阻挡多少伤害。未指定时，可阻挡一切伤害。
* *** ：控制可挡下的伤害量和伤害类型。阻挡成功时，伤害减少<code>-{}-clamp(base + factor * *所受攻击伤害*, 0, *所受攻击伤害*)</code>。
* **** ：固定阻挡的伤害。
* **** ：应被阻挡的伤害比例。
* **** ：（，角度制，默认为<code>90</code>）在水平方向上，以当前玩家视角的水平分量向量为基准，如果受伤害方向与基准方向夹角小于此角度则伤害可被阻挡，否则不能阻挡。<br>任何无来源伤害均被视为需要<code>180</code>度才能阻挡。
* **** ：可阻挡的伤害类型。允许单个ID、列表或标签。未指定则表示对所有伤害有效。
* ** ：（，默认为<code>1</code>）被可停-{}-用阻挡的攻击击中时，物品冷却时长的乘数。为<code>0</code>时，此物品不能被攻击停用。
* ** ：此物品被攻击停用时播放的声音事件。
* ***
* ** ：控制攻击对物品造成的耐久损耗。未指定时，每次攻击损耗物品1点耐久。物品耐久最终损耗<code>-{}-floor(threshold, base + factor * *所受攻击伤害*)</code>。最终值可以为负数以使物品修复。
* *** ：损耗物品固定耐久度。
* *** ：所受攻击伤害的乘数。
* *** ：（）攻击对此物品造成的最低耐久度损耗。
<section end="codec_blocks_attacks_component"/></div>

# = break_sound =
<div class="treeview"><section begin="codec_break_sound_component"/>
* * ：物品耐久度耗尽时播放的声音事件。
* **
<section end="codec_break_sound_component"/></div>

# = bucket_entity_data =
<div class="treeview"><section begin="codec_bucket_entity_data_component"/>
* * ：生物桶对桶中生物的部分实体数据。如果采用字符串格式进行定义，则游戏会将字符串的内容视为[SNBT](SNBT.md)加载，游戏只保存为复合标签格式。
* ** ：表示桶中生物是否有发光的轮廓线。
* ** ：桶中生物的生命值。
* ** ：表示桶中生物是否能抵抗绝大多数伤害。
* ** ：表示桶中生物的AI是否被禁用。
* ** ：表示桶中生物是否不受重力影响。
* ** ：表示桶中生物是否不会发出任何声音。
* ** /2个额外标签：}}
* ** ：桶中蝌蚪的年龄。大于等于24000时，蝌蚪会长大成青蛙。
* ** ：表示蝌蚪的年龄是否不会随时间自然增长。
* ** /3个额外标签：}}
* ** ：桶中美西螈的年龄。生物为幼体时为负值；生物为成体时为正值或0，如果为正值则表示距离生物能再次繁衍的时间。
* ** ：表示美西螈的年龄是否不会随时间自然增长或减少。
* ** ：桶中美西螈[生物记忆](生物记忆.md)<code>has_hunting_cooldown</code>的过期倒计时。
<section end="codec_bucket_entity_data_component"/></div>

# = bundle_contents =
<div class="treeview"><section begin="codec_bundle_contents_component"/>
* * ：[收纳袋](收纳袋.md)的内部物品栏。
* ** ：一个物品。后加入的物品在列表前方，先加入的物品在列表后方。
* ***
* ** ：一个物品。后加入的物品在列表前方，先加入的物品在列表后方。
* ***
<section end="codec_bundle_contents_component"/></div>

# = can_break =
<div class="treeview"><section begin="codec_can_break_component"/>
* * ：检查被破坏的方块是否满足指定的方块谓词，作为列表时内部元素与此标签作为复合标签时相同。
* **
<section end="codec_can_break_component"/></div>

# = can_place_on =
<div class="treeview"><section begin="codec_can_place_on_component"/>
* * ：检查被交互的方块是否满足指定的方块谓词，作为列表时内部元素与此标签作为复合标签时相同。
* **
<section end="codec_can_place_on_component"/></div>

# = cat/collar =
<div class="treeview"><section begin="codec_cat_collar_component"/>
* * ：猫的项圈颜色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_cat_collar_component"/></div>

# = cat/sound_variant =
<div class="treeview"><section begin="codec_cat_sound_variant_component"/>
* * ：（命名空间ID）猫的音效变种。
<section end="codec_cat_sound_variant_component"/></div>

# = cat/variant =
<div class="treeview"><section begin="codec_cat_variant_component"/>
* * ：（命名空间ID）[猫](猫.md)的变种。
<section end="codec_cat_variant_component"/></div>

# = charged_projectiles =
<div class="treeview"><section begin="codec_charged_projectiles_component"/>
* * ：[弩](弩.md)的内部物品栏，表示弩的装填物。
* ** ：一个物品。
* ***
* ** ：一个物品。
* ***
<section end="codec_charged_projectiles_component"/></div>

# = chicken/sound_variant =
<div class="treeview"><section begin="codec_chicken_sound_variant_component"/>
* * ：（命名空间ID）鸡的音效变种。
<section end="codec_chicken_sound_variant_component"/></div>

# = chicken/variant =
<div class="treeview"><section begin="codec_chicken_variant_component"/>
* * ：（命名空间ID）[鸡](鸡.md)的变种。
<section end="codec_chicken_variant_component"/></div>

# = consumable =
<div class="treeview"><section begin="codec_consumable_component"/>
* * ：物品的消耗使用行为。
* ** ：（默认为<code>eat</code>）物品使用时的动画。可以为<code>none</code>（无动作）、<code>eat</code>（吃）、<code>drink</code>（饮用）、<code>block</code>（格挡）、<code>bow</code>（拉弓）、<code>brush</code>（清刷）、<code>crossbow</code>（弩上弦）、<code>spear</code>（矛蓄力）、<code>trident</code>（三叉戟投掷）、<code>spyglass</code>（看望远镜）、<code>toot_horn</code>（吹山羊角）和<code>bundle</code>（使用收纳袋）。
* ** ：（，默认为1.6）物品使用的时间，单位为秒。当此值为0时，物品立刻使用，不会像拉弓等操作需要等待时间。
* ** ：（默认为<code>true</code>）物品在使用时是否产生物品破碎粒子。
* ** ：当物品被使用后产生的效果列表。
* *** ：一项消耗使用效果。
* **** ：消耗使用效果类型。
* **** 为<code>apply_effects</code>，则对使用此物品的生物添加状态效果：}}
* **** ：物品使用后添加的状态效果。
* ***** ：一项状态效果。
* ******
* **** ：（，默认为1）食用后施加此状态效果的概率。
* **** 为<code>clear_all_effects</code>，则对使用此物品的生物移除所有状态效果。}}
* **** 为<code>play_sound</code>，则播放指定的声音：}}
* **** ：要播放的声音。
* *****
* **** 为<code>remove_effects</code>，则对使用此物品的生物移除指定状态效果：}}
* **** ：物品使用后要移除的状态效果。可以为以<code>#</code>开头的[状态效果](状态效果.md)标签、一个状态效果ID、或以多个状态效果ID组成的列表。
* **** 为<code>teleport_randomly</code>，则对使用此物品的生物进行随机传送：}}
* **** ：（，默认为16）随机传送的半径，以传送前的位置作为原点。
* ** ：（默认为<code>entity.generic.eat</code>）使用物品时产生的声音。
* ***
<section end="codec_consumable_component"/></div>

# = container =
<div class="treeview"><section begin="codec_container_component"/>
* * ：方块物品的内部物品栏。
* ** ：一个槽位上的物品堆叠数据。
* *** ：此槽位的物品堆叠数据。
* ****
* *** ：此槽位的物品堆叠数据。
* ****
* *** ：（）物品堆叠所在的槽位。
<section end="codec_container_component"/></div>

# = container_loot =
<div class="treeview"><section begin="codec_container_loot_component"/>
* * ：战利品容器方块的战利品表数据。
* ** ：（命名空间ID）生成战利品使用的[战利品表](战利品表.md)。
* ** ：（默认为0）生成战利品使用的种子，0或不输入将使用[随机序列](随机序列.md)。
<section end="codec_container_loot_component"/></div>

# = cow/sound_variant =
<div class="treeview"><section begin="codec_cow_sound_variant_component"/>
* * ：（命名空间ID）牛的音效变种。
<section end="codec_cow_sound_variant_component"/></div>

# = cow/variant =
<div class="treeview"><section begin="codec_cow_variant_component"/>
* * ：（命名空间ID）[牛](牛.md)的变种。
<section end="codec_cow_variant_component"/></div>

# = creative_slot_lock =
<div class="treeview"><section begin="codec_creative_slot_lock_component"/>
* * ：空标签，此组件存在时此物品若在创造模式物品栏内则玩家无法与其交互。
<section end="codec_creative_slot_lock_component"/></div>

# = custom_data =
<div class="treeview"><section begin="codec_custom_data_component"/>
* * ：自定义的数据。如果采用字符串格式进行定义，则游戏会将字符串的内容视为[SNBT](SNBT.md)加载，游戏只保存为复合标签格式。
* ** ：一个可以为任意类型的自定义标签。
<section end="codec_custom_data_component"/></div>

# = custom_model_data =
<div class="treeview"><section begin="codec_custom_model_data_component"/>
* * ：自定义物品模型数据。
* ** ：定义物品模型映射中的[着色](物品模型映射#model.md)列表。
* *** ：一个颜色。可以直接使用整数定义颜色，也可以使用RGB三个分量定义颜色，游戏只保存为整数形式。
* ****
* ** ：定义<code>[condition](物品模型映射#condition.md)</code>物品模型映射类型的布尔值列表。
* *** ：一个布尔值。
* ** ：定义<code>[range_dispatch](物品模型映射#range_dispatch.md)</code>物品模型映射类型的浮点数列表。
* *** ：一个浮点数。
* ** ：定义<code>[select](物品模型映射#select.md)</code>物品模型映射类型的字符串列表。
* *** ：一个字符串。
<section end="codec_custom_model_data_component"/></div>

# = custom_name =
<div class="treeview"><section begin="codec_custom_name_component"/>
* * ：（[文本组件](文本组件.md)）自定义名称。
<section end="codec_custom_name_component"/></div>

# = damage =
<div class="treeview"><section begin="codec_damage_component"/>
* * ：（）物品的损坏值。
<section end="codec_damage_component"/></div>

# = damage_resistant =
<div class="treeview"><section begin="codec_damage_resistant_component"/>
* * ：物品免疫的伤害类型。
* ** ：（命名空间ID）物品免疫的伤害。应为一个带<code>#</code>前缀的标签ID，游戏会将此值解析为[伤害类型标签](Java版标签/伤害类型.md)，如果伤害类型标签不存在则物品不会免疫任何伤害。
<section end="codec_damage_resistant_component"/></div>

# = damage_type =
<div class="treeview"><section begin="codec_damage_type_component"/>
* * ：（命名空间ID）使用此物品攻击时造成的伤害类型。
<section end="codec_damage_type_component"/></div>

# = death_protection =
<div class="treeview"><section begin="codec_death_protection_component"/>
* * ：持有者将要死亡时阻止生物死亡后的效果。
* ** ：（默认为空）触发此物品后产生的效果。
* *** ：一项效果。
* **** ：消耗使用效果类型。
* **** 为<code>apply_effects</code>，则对使用此物品的生物添加状态效果：}}
* **** ：物品使用后添加的状态效果。
* ***** ：一项状态效果。
* ******
* **** ：（，默认为1）食用后施加此状态效果的概率。
* **** 为<code>clear_all_effects</code>，则对使用此物品的生物移除所有状态效果。}}
* **** 为<code>play_sound</code>，则播放指定的声音：}}
* **** ：要播放的声音。
* *****
* **** 为<code>remove_effects</code>，则对使用此物品的生物移除指定状态效果：}}
* **** ：物品使用后要移除的状态效果。可以为以<code>#</code>开头的[状态效果](状态效果.md)标签、一个状态效果ID、或以多个状态效果ID组成的列表。
* **** 为<code>teleport_randomly</code>，则对使用此物品的生物进行随机传送：}}
* **** ：（，默认为16）随机传送的半径，以传送前的位置作为原点。
<section end="codec_death_protection_component"/></div>

# = debug_stick_state =
<div class="treeview"><section begin="codec_debug_stick_state_component"/>
* * ：[调试棒](调试棒.md)的调试数据。
* ** ：一个方块和此方块将要修改的方块属性的键值对。
<section end="codec_debug_stick_state_component"/></div>

# = dye =
<div class="treeview"><section begin="codec_dye_component"/>
* * ：物品的[染料颜色](染料颜色.md)数据。取值为。
<section end="codec_dye_component"/></div>

# = dyed_color =
<div class="treeview"><section begin="codec_dyed_color_component"/>
* * ：物品的颜色。只使用后24位，每个颜色通道占用8位，按RGB依次存储。
* **
<section end="codec_dyed_color_component"/></div>

# = enchantable =
<div class="treeview"><section begin="codec_enchantable_component"/>
* *
* ** ：（）物品的[附魔能力](附魔能力.md)。
<section end="codec_enchantable_component"/></div>

# = enchantment_glint_override =
<div class="treeview"><section begin="codec_enchantment_glint_override_component"/>
* * ：是否显示[光效](光效.md)。
<section end="codec_enchantment_glint_override_component"/></div>

# = enchantments =
<div class="treeview"><section begin="codec_enchantments_component"/>
* * ：物品的魔咒数据。
* ** ：（）一个[魔咒](魔咒.md)和对应魔咒的等级。
<section end="codec_enchantments_component"/></div>

# = entity_data =
<div class="treeview"><section begin="codec_entity_data_component"/>
* * ：物品放出实体时套用到实体上的数据。如果采用字符串格式进行定义，则游戏会将字符串的内容视为[SNBT](SNBT.md)加载，游戏只保存为复合标签格式。
* ** ：（命名空间ID）实体类型。
* ** 若干与该实体对应的实体数据标签，见[实体数据格式](实体数据格式.md)。
<section end="codec_entity_data_component"/></div>

# = equippable =
<div class="treeview"><section begin="codec_equippable_component"/>
* * ：物品被穿戴的行为。
* ** ：（默认为全部生物）可以穿戴此物品的生物。可以为以<code>#</code>开头的实体类型标签、一个实体类型ID、或以多个实体类型ID组成的字符串列表。
* ** ：（命名空间ID）物品被穿戴时的[装备模型](装备模型.md)。此值不存在时，若装备在头部则根据物品模型渲染物品，否则什么也不会渲染。
* ** ：（命名空间ID）当此项存在且物品被玩家穿戴时，玩家第一人称视角将渲染指定的纹理遮罩。此遮罩可以使用多个设置此标签的物品互相叠加，每个物品指定的遮罩都会被渲染，且渲染顺序按照主手、副手、头盔、胸甲、护腿、靴子、身体、鞍的顺序依次叠加渲染。当遮罩纹理渲染时，遮罩纹理被视为**独立纹理**，即无法作为动态纹理或GUI纹理渲染，但可以指定纹理过滤方式。
* ** ：（默认为<code>false</code>）满足未被骑乘等其他条件时，玩家是否可以对装备此物品的生物进行修剪来卸下此物品。
* ** ：（默认为<code>true</code>）生物在受到会影响损害盔甲的伤害时此物品是否会受损而减少耐久。
* ** ：（默认为<code>false</code>）对生物使用此物品时，是否可以让被交互的生物在允许的空槽位上穿戴此物品。
* ** ：（默认为<code>item.armor.equip_generic</code>，默认可装备鞍的生物的鞍除外）物品被穿戴时的声音。
* ***
* ** ：（默认为<code>true</code>）是否可以使用[发射器](发射器.md)使生物穿戴此物品。如果物品本身有特殊的发射器行为则此项无效。
* ** ：（默认为<code>item.shears.snip</code>）被玩家使用剪刀卸下此物品时播放的声音。
* ***
* ** ：物品可被穿戴的[装备槽位](装备槽位.md)。
* ** ：（默认为<code>true</code>）物品是否可以直接穿戴。
<section end="codec_equippable_component"/></div>

# = firework_explosion =
<div class="treeview"><section begin="codec_firework_explosion_component"/>
* * ：[烟火之星](烟火之星.md)的数据。
* ** ：（默认为空数组）表示爆裂时的粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。如果颜色没有对应的染料颜色，游戏将在[提示框](提示框.md)中显示为“自定义”，但爆裂时会产生正确的颜色。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。不存在或数组为空时被视为黑色。
* ** ：（默认为空数组）表示爆裂后的淡化粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。
* ** ：（默认为<code>false</code>）表示烟火是否有拖曳痕迹（使用[钻石](钻石.md)合成时）。
* ** ：（默认为<code>false</code>）表示烟火是否出现闪烁效果（使用[荧石粉](荧石粉.md)合成时）。
* ** ：爆裂时的形态。可以为<code>small_ball</code>（小型球状）、<code>large_ball</code>（大型球状）、<code>star</code>（星形）、<code>creeper</code>（苦力怕状）、<code>burst</code>（喷发状）。
<section end="codec_firework_explosion_component"/></div>

# = fireworks =
<div class="treeview"><section begin="codec_fireworks_component"/>
* * ：[烟花火箭](烟花火箭.md)的数据。
* ** ：（无符号8位整数，默认为0）烟花火箭的飞行的时间，单位为“火药”（即表现为和在工作台上合成烟花火箭时所用的火药数相等）。
* ** ：（最多256个元素）烟花火箭对应的烟火之星的数据，控制烟花火箭飞行结束时产生的爆裂烟花渲染。
* *** ：一个烟火之星的数据。
* **** ：（默认为空数组）表示爆裂时的粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。如果颜色没有对应的染料颜色，游戏将在[提示框](提示框.md)中显示为“自定义”，但爆裂时会产生正确的颜色。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。不存在或数组为空时被视为黑色。
* **** ：（默认为空数组）表示爆裂后的淡化粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。
* **** ：（默认为<code>false</code>）表示烟火是否有拖曳痕迹（使用[钻石](钻石.md)合成时）。
* **** ：（默认为<code>false</code>）表示烟火是否出现闪烁效果（使用[荧石粉](荧石粉.md)合成时）。
* **** ：爆裂时的形态。可以为<code>small_ball</code>（小型球状）、<code>large_ball</code>（大型球状）、<code>star</code>（星形）、<code>creeper</code>（苦力怕状）、<code>burst</code>（喷发状）。
<section end="codec_fireworks_component"/></div>

# = food =
<div class="treeview"><section begin="codec_food_component"/>
* * ：物品的食物属性。
* ** ：（默认为<code>false</code>）表示物品是否可以无视当前饥饿值食用。
* ** ：（）食用物品时增加的饥饿值。
* ** ：食用物品时增加的饱和度。
<section end="codec_food_component"/></div>

# = fox/variant =
<div class="treeview"><section begin="codec_fox_variant_component"/>
* * ：[狐狸](狐狸.md)的变种。取值只能为<code>red</code>（红色）、<code>snow</code>（白色）。
<section end="codec_fox_variant_component"/></div>

# = frog/variant =
<div class="treeview"><section begin="codec_frog_variant_component"/>
* * ：（命名空间ID）[青蛙](青蛙.md)的变种。
<section end="codec_frog_variant_component"/></div>

# = glider =
<div class="treeview"><section begin="codec_glider_component"/>
* * ：空标签，此组件存在时若被生物装备则可以[滑翔](滑翔.md)，且滑翔时此物品每1秒消耗1耐久度。
<section end="codec_glider_component"/></div>

# = horse/variant =
<div class="treeview"><section begin="codec_horse_variant_component"/>
* * ：[马](马.md)的基础毛色。取值只能为<code>white</code>（白色）、<code>creamy</code>（奶油色）、<code>chestnut</code>（栗色）、<code>brown</code>（褐色）、<code>black</code>（黑色）、<code>gray</code>（灰色）或<code>dark_brown</code>（深褐色）。
<section end="codec_horse_variant_component"/></div>

# = instrument =
<div class="treeview"><section begin="codec_instrument_component"/>
* * ：玩家吹奏[山羊角](山羊角.md)时使用的[山羊角乐器](山羊角乐器.md)。命名空间ID或内联定义均可。
* ** ：（[文本组件](文本组件.md)）乐器的名称。
* ** ：吹奏时播放的声音。
* ***
* ** ：（）吹奏声音能传播的最远距离。
* ** ：（）吹奏时间，影响物品冷却速度。
<section end="codec_instrument_component"/></div>

# = intangible_projectile =
<div class="treeview"><section begin="codec_intangible_projectile_component"/>
* * ：空标签，此组件存在时若作为箭射出，则射出后只能被创造模式玩家捡起。
<section end="codec_intangible_projectile_component"/></div>

# = item_model =
<div class="treeview"><section begin="codec_item_model_component"/>
* * ：（[命名空间ID](命名空间ID.md)）为当前物品绑定一个[物品模型映射](物品模型映射.md)。
<section end="codec_item_model_component"/></div>

# = item_name =
<div class="treeview"><section begin="codec_item_name_component"/>
* * ：（[文本组件](文本组件.md)）物品的默认名称。
<section end="codec_item_name_component"/></div>

# = jukebox_playable =
<div class="treeview"><section begin="codec_jukebox_playable_component"/>
* * ：（命名空间ID）[唱片机曲目](唱片机曲目.md)。此组件存在时物品可插进唱片机中播放。
<section end="codec_jukebox_playable_component"/></div>

# = kinetic_weapon =
<div class="treeview"><section begin="codec_kinetic_weapon_component"/>
* * ：设置物品的冲锋攻击。
* ** ：（，默认为0）武器生效前的时间，单位为游戏刻。
* ** ：（默认为0）动画期间脱离手的距离。
* ** ：（默认为1）攻击轴相对速度的最终伤害倍率。此处及下文的“攻击轴速度”定义为：上个游戏刻的位移向量（对于玩家）或速度改变量（对于非生物实体，等于）对攻击者视角向量的投影，是一个向量；“攻击轴相对速度”即攻击者攻击轴速度与被攻击者攻击轴速度之差，如果此差值小于0则游戏认为是0。
* ** ：使用此武器时播放的声音。
* ***
* ** ：此武器攻击到生物时播放的声音。
* ***
* ** ：将目标强制脱离骑乘的条件。
* *** ：不再检查条件的时间，单位为刻，从开始计算。
* *** ：（默认为0）攻击者的最低攻击轴速度。对于非玩家实体，实际最小速度为规定值的20%。
* *** ：（默认为0）最小攻击轴相对速度。对于非玩家实体，实际最小速度为规定值的20%。
* ** ：将目标击退的条件。
* *** 格式同。
* ** ：对目标造成伤害的条件。
* *** 格式同。
* ** ：（，默认为10）攻击的冷却时间，在此时间内无法与任何实体交互。
<section end="codec_kinetic_weapon_component"/></div>

# = llama/variant =
<div class="treeview"><section begin="codec_llama_variant_component"/>
* * ：[羊驼](羊驼.md)的变种。取值只能为<code>creamy</code>（沙褐色）、<code>white</code>（奶油色）、<code>brown</code>（棕色）或<code>gray</code>（灰色）。[行商羊驼](行商羊驼.md)也使用此组件。
<section end="codec_llama_variant_component"/></div>

# = lock =
<div class="treeview"><section begin="codec_lock_component"/>
* * ：容器方块的上锁数据。
* **
<section end="codec_lock_component"/></div>

# = lodestone_tracker =
<div class="treeview"><section begin="codec_lodestone_tracker_component"/>
* * ：若指南针拥有此组件，则指南针将变为[磁石指针](磁石指针.md)。
* ** ：磁石指针指向的位置。
* *** ：磁石指针指向位置的所在维度。
* *** ：磁石指针指向的坐标。内部的三个整数分别代表了位置的XYZ坐标值。
* ** ：（默认为<code>true</code>）表示磁石指针是否追踪绑定的磁石。为<samp>false</samp>时，当磁石被破坏后此组件不会被移除，磁石指针仍然指向对应位置。
<section end="codec_lodestone_tracker_component"/></div>

# = lore =
<div class="treeview"><section begin="codec_lore_component"/>
* * ：物品的自定义描述信息，共计不允许超过256行。
* ** ：（[文本组件](文本组件.md)）一行描述信息。
<section end="codec_lore_component"/></div>

# = map_color =
<div class="treeview"><section begin="codec_map_color_component"/>
* * ：（默认为4603950）物品栏内地图纹理上的颜色，在二进制形式下，只使用后24位，每个颜色通道占用8位，按RGB依次存储。
<section end="codec_map_color_component"/></div>

# = map_decorations =
<div class="treeview"><section begin="codec_map_decorations_component"/>
* * ：地图图标数据。
* ** ：一个图标的信息。
* *** ：图标的旋转角度，按顺时针角度计。游戏并不能真正显示所有角度，每经过22.5°，在地图上才会有区别。与图标纹理中的外观相比，旋转角度为0所显示的图标上下颠倒。
* *** ：（命名空间ID）此图标显示的[地图图标类型](地图#地图图标.md)。
* *** ：图标在世界上所在的X坐标。如果超出地图所展示的范围且图标类型不是玩家，则图标无法添加到地图中。如果图标类型是玩家，位置超出显示范围但地图可以无限追踪玩家，那么图标类型会被修改为<code>player_off_limits</code>，且位置会显示在对应边；如果距离显示范围较近，则图标类型会被修改为<code>player_off_map</code>，且位置会显示在对应边；如果距离显示范围很远，则移除此图标。
* *** ：图标在世界上所在的Z坐标。如果超出地图所展示的范围且图标类型不是玩家，则图标无法添加到地图中。如果图标类型是玩家，位置超出显示范围但地图可以无限追踪玩家，那么图标类型会被修改为<code>player_off_limits</code>，且位置会显示在对应边；如果距离显示范围较近，则图标类型会被修改为<code>player_off_map</code>，且位置会显示在对应边；如果距离显示范围很远，则移除此图标。
<section end="codec_map_decorations_component"/></div>

# = map_id =
<div class="treeview"><section begin="codec_map_id_component"/>
* * ：地图编号。
<section end="codec_map_id_component"/></div>

# = map_post_processing =
<div class="treeview"><section begin="codec_map_post_processing_component"/>
* * ：为0时使<code>map_id</code>组件额外增加“”行；为1时使<code>map_id</code>组件使用“+1”而不是显示地图比例缩放信息。
<section end="codec_map_post_processing_component"/></div>

# = max_damage =
<div class="treeview"><section begin="codec_max_damage_component"/>
* * ：（）物品的最大耐久度。
<section end="codec_max_damage_component"/></div>

# = max_stack_size =
<div class="treeview"><section begin="codec_max_stack_size_component"/>
* * ：（）物品的最大堆叠数量。如果此组件不存在，则游戏默认为1。
<section end="codec_max_stack_size_component"/></div>

# = minimum_attack_charge =
<div class="treeview"><section begin="codec_minimum_attack_charge_component"/>
* * ：（）玩家使用此物品进行近战攻击或穿刺攻击所需要[攻击冷却完成度](近战攻击#攻击冷却.md)的最小值。若添加了该组件，并且值大于0，则会影响[魔咒效果组件](魔咒效果组件.md)的触发间隔。
<section end="codec_minimum_attack_charge_component"/></div>

# = mooshroom/variant =
<div class="treeview"><section begin="codec_mooshroom_variant_component"/>
* * ：[哞菇](哞菇.md)的变种。取值只能为<code>red</code>（红色）或<code>brown</code>（棕色）。
<section end="codec_mooshroom_variant_component"/></div>

# = note_block_sound =
<div class="treeview"><section begin="codec_note_block_sound_component"/>
* * ：[玩家的头](玩家的头.md)被放置在音符盒上时播放的声音。应为一个来自资源包内定义的声音事件。
<section end="codec_note_block_sound_component"/></div>

# = ominous_bottle_amplifier =
<div class="treeview"><section begin="codec_ominous_bottle_amplifier_component"/>
* * ：（）玩家使用物品后获得的[不祥之兆](不祥之兆.md)状态效果倍率。
<section end="codec_ominous_bottle_amplifier_component"/></div>

# = painting/variant =
<div class="treeview"><section begin="codec_painting_variant_component"/>
* * ：（命名空间ID）[画](画.md)的变种。
<section end="codec_painting_variant_component"/></div>

# = parrot/variant =
<div class="treeview"><section begin="codec_parrot_variant_component"/>
* * ：[鹦鹉](鹦鹉.md)的变种。取值只能为<code>red_blue</code>（红色）、<code>blue</code>（蓝色）、<code>green</code>（绿色）、<code>yellow_blue</code>（青色）或<code>gray</code>（灰色）。
<section end="codec_parrot_variant_component"/></div>

# = piercing_weapon =
<div class="treeview"><section begin="codec_piercing_weapon_component"/>
* * ：设置物品的戳刺攻击，跳过玩家对方块的点击和持续破坏行为。该组件也是触发[魔咒效果组件](魔咒效果组件.md)的条件之一。
* ** ：使用此武器时播放的声音。
* ***
* ** ：此武器攻击到生物时播放的声音。
* ***
* ** ：（默认为<code>true</code>）攻击是否造成击退。
* ** ：（默认为<code>false</code>）攻击是否将目标强制脱离骑乘。
<section end="codec_piercing_weapon_component"/></div>

# = pig/sound_variant =
<div class="treeview"><section begin="codec_pig_sound_variant_component"/>
* * ：（命名空间ID）猪的音效变种。
<section end="codec_pig_sound_variant_component"/></div>

# = pig/variant =
<div class="treeview"><section begin="codec_pig_variant_component"/>
* * ：（命名空间ID）[猪](猪.md)的变种。
<section end="codec_pig_variant_component"/></div>

# = pot_decorations =
<div class="treeview"><section begin="codec_pot_decorations_component"/>
* * ：[饰纹陶罐](饰纹陶罐.md)的陶片数据。此应仅有四个元素，依次代表饰纹陶罐背面、左面、右面和前面的物品。默认每个面均为红砖。
* ** ：（命名空间ID）饰纹陶罐这一个面的陶片物品。
<section end="codec_pot_decorations_component"/></div>

# = potion_contents =
<div class="treeview"><section begin="codec_potion_contents_component"/>
* * ：物品的药水和自定义状态效果数据。如果设置此组件为字符串，则等价于只设置复合标签形式中的，游戏在保存时只会保存为复合标签形式。
* ** ：物品渲染中，药水部分使用的颜色。只使用后24位，每个颜色通道占用8位，按RGB依次存储。
* ** ：当前物品所含有的自定义[状态效果](状态效果.md)。
* *** ：一项状态效果。
* ****
* ** ：覆盖物品的默认名称，游戏将以<code>-{}-<*药水物品名称翻译键*>.effect.<*此值*></code>翻译键作为物品的名称，对于原版的药水物品而言就是<code>-{}-item.minecraft.<*药水物品类型*>.effect.<*此值*></code>。
* ** ：（命名空间ID）[药水效果](药水效果.md)，也会影响物品的名称和纹理。
<section end="codec_potion_contents_component"/></div>

# = potion_duration_scale =
<div class="treeview"><section begin="codec_potion_duration_scale_component"/>
* * ：（）控制<code>potion_contents</code>组件存储的状态效果时长缩放倍率。此组件不存在时默认为1。
<section end="codec_potion_duration_scale_component"/></div>

# = profile =
<div class="treeview"><section begin="codec_profile_component"/>
* * ：玩家档案数据。
* **
<section end="codec_profile_component"/></div>

# = provides_banner_patterns =
<div class="treeview"><section begin="codec_provides_banner_patterns_component"/>
* * ：（命名空间ID）控制物品能否放进[织布机](织布机.md)的旗帜图案槽位，以及可以制作的图案。应为一个带<code>#</code>前缀的标签ID，游戏会将此值解析为[旗帜图案标签](Java版标签/旗帜图案.md)，如果旗帜图案标签不存在则织布机不会显示任何配方。
<section end="codec_provides_banner_patterns_component"/></div>

# = provides_trim_material =
<div class="treeview"><section begin="codec_provides_trim_material_component"/>
* * ：控制物品在锻造台上使用盔甲纹饰配方时为输出物品提供的盔甲纹饰材料。命名空间ID或内联定义均可。
* ** ：一个字符串，实际盔甲纹饰纹理的后缀。
* ** ：（[文本组件](文本组件.md)）盔甲纹饰材料的名称。
* ** ：对于指定的[装备模型](装备模型.md)，使用指定纹理覆盖而不使用。
* *** ：一个字符串，实际盔甲纹饰纹理的后缀。
<section end="codec_provides_trim_material_component"/></div>

# = rabbit/variant =
<div class="treeview"><section begin="codec_rabbit_variant_component"/>
* * ：[兔子](兔子.md)的变种。取值只能为<code>brown</code>（褐色）、<code>white</code>（白色）、<code>black</code>（黑色）、<code>white_splotched</code>（黑白相间）、<code>gold</code>（金色）、<code>salt</code>（胡椒盐色）或<code>evil</code>（杀手兔）。
<section end="codec_rabbit_variant_component"/></div>

# = rarity =
<div class="treeview"><section begin="codec_rarity_component"/>
* * ：物品的基础[稀有度](稀有度.md)。可以为<code>common</code>（常见）、<code>uncommon</code>（少见）、<code>rare</code>（稀有）、<code>epic</code>（史诗）。
<section end="codec_rarity_component"/></div>

# = recipes =
<div class="treeview"><section begin="codec_recipes_component"/>
* * ：[知识之书](知识之书.md)保存的配方数据。
* ** ：（命名空间ID）一个配方ID。
<section end="codec_recipes_component"/></div>

# = repair_cost =
<div class="treeview"><section begin="codec_repair_cost_component"/>
* * ：（）物品在[铁砧](铁砧.md)上修理、合并或重命名时在基础经验等级消耗之上额外增加的累积惩罚。
<section end="codec_repair_cost_component"/></div>

# = repairable =
<div class="treeview"><section begin="codec_repairable_component"/>
* * ：物品被铁砧进行原材料修复的有效物品。不论此值为何，物品永远可以被合并物品修复。
* ** ：可用于修复的物品。可以为一个<code>#</code>开头的物品标签、一个物品ID、或一个物品ID的列表。
<section end="codec_repairable_component"/></div>

# = salmon/size =
<div class="treeview"><section begin="codec_salmon_size_component"/>
* * ：鲑鱼的体型尺寸。取值只能为<code>small</code>（小型）、<code>medium</code>（中型）或<code>large</code>（大型）。
<section end="codec_salmon_size_component"/></div>

# = sheep/color =
<div class="treeview"><section begin="codec_sheep_color_component"/>
* * ：绵羊的毛色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_sheep_color_component"/></div>

# = shulker/color =
<div class="treeview"><section begin="codec_shulker_color_component"/>
* * ：潜影贝的外壳颜色，如果此组件不存在，则潜影贝使用默认的颜色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_shulker_color_component"/></div>

# = stored_enchantments =
<div class="treeview"><section begin="codec_stored_enchantments_component"/>
* * ：[附魔书](附魔书.md)保存的魔咒。
* ** ：（）一个[魔咒](魔咒.md)和对应魔咒的等级。
<section end="codec_stored_enchantments_component"/></div>

# = suspicious_stew_effects =
<div class="treeview"><section begin="codec_suspicious_stew_effects_component"/>
* * ：[谜之炖菜](谜之炖菜.md)的状态效果信息。
* ** ：一项状态效果信息。
* *** ：（默认为160）状态效果的时长，单位为[刻](刻.md)。
* *** ：（命名空间ID）状态效果。
<section end="codec_suspicious_stew_effects_component"/></div>

# = swing_animation =
<div class="treeview"><section begin="codec_swing_animation_component"/>
* * ：使用此物品攻击时的动画。
* ** ：（默认为<code>whack</code>）摇摆动画类型。取值只能为<code>none</code>（轻微左右摇摆，第一人称下仅为物品上下略微移动）、<code>whack</code>（向前猛击，剑的默认攻击动画）、<code>stab</code>（矛戳刺攻击，被部分生物持有时还会有独特的手部动画）。
* ** ：（默认为6）动画播放的周期。
<section end="codec_swing_animation_component"/></div>

# = tool =
<div class="treeview"><section begin="codec_tool_component"/>
* * ：物品的挖掘工具属性。
* ** ：（默认为<code>true</code>）[创造模式](创造模式.md)玩家能否使用此物品破坏方块。
* ** ：（，默认为1）破坏硬度非0的方块时物品损失的耐久度。
* ** ：（，默认为1）挖掘方块时的速度。
* ** ：物品与对应可以挖掘的方块的映射列表。
* *** ：一项物品与方块列表的挖掘配置数据。
* **** ：此配置指定的有效方块。可以为一个<code>#</code>开头的方块标签、一个方块ID、或一个方块ID的列表。
* **** ：此物品是否是所有上方指定方块的合适挖掘工具。
* **** ：覆盖所有上方指定方块的使用此物品挖掘时的挖掘速度。
<section end="codec_tool_component"/></div>

# = tooltip_display =
<div class="treeview"><section begin="codec_tooltip_display_component"/>
* * ：物品提示框的显示数据。
* ** ：（默认为<code>false</code>）物品提示框是否总是隐藏。
* ** ：（默认为空列表）一个物品组件ID列表，列表内的所有组件提供的提示框文本都会被隐藏。如果组件不提供提示框文本，则对其没有效果。
* *** ：（命名空间ID）一个物品组件。
<section end="codec_tooltip_display_component"/></div>

# = tooltip_style =
<div class="treeview"><section begin="codec_tooltip_style_component"/>
* * ：（命名空间ID）物品提示框外观。提示框外观分为两部分：背景由<code>-{}-<*命名空间*>:tooltip/<*路径*>_background</code>精灵图渲染，边框由<code>-{}-<*命名空间*>:tooltip/<*路径*>_frame</code>精灵图渲染。这两个精灵图都属于[GUI纹理](纹理#GUI纹理.md)，默认会被解析为{{filepath|-{}-assets/<*命名空间*>/textures/gui/sprites/tooltip/<*路径*>_background.png}}和{{filepath|-{}-assets/<*命名空间*>/textures/gui/sprites/tooltip/<*路径*>_frame.png}}。
<section end="codec_tooltip_style_component"/></div>

# = trim =
<div class="treeview"><section begin="codec_trim_component"/>
* * ：物品的[盔甲纹饰](盔甲纹饰.md)信息。
* ** ：此盔甲纹饰的材料，命名空间ID或内联定义均可。
* *** ：一个字符串，实际盔甲纹饰纹理的后缀。
* *** ：（[文本组件](文本组件.md)）盔甲纹饰材料的名称。
* *** ：对于指定的[装备模型](装备模型.md)，使用指定纹理覆盖而不使用。
* **** ：一个字符串，实际盔甲纹饰纹理的后缀。
* ** ：此盔甲纹饰的图案，命名空间ID或内联定义均可。
* *** ：（命名空间ID）用于推断盔甲纹饰纹理的位置。
* *** ：（默认为<code>false</code>）是否使用贴花模式渲染盔甲纹饰（仅在非透明区域显示）。
* *** ：（[文本组件](文本组件.md)）盔甲纹饰图案的名称。
<section end="codec_trim_component"/></div>

# = tropical_fish/base_color =
<div class="treeview"><section begin="codec_tropical_fish_base_color_component"/>
* * ：热带鱼的基础颜色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_tropical_fish_base_color_component"/></div>

# = tropical_fish/pattern =
<div class="treeview"><section begin="codec_tropical_fish_pattern_component"/>
* * ：热带鱼的花纹类型。取值只能为<code>kob</code>（）、<code>sunstreak</code>（）、<code>snooper</code>（）、<code>dasher</code>（）、<code>brinely</code>（）、<code>spotty</code>（）、<code>flopper</code>（）、<code>stripey</code>（）、<code>glitter</code>（）、<code>blockfish</code>（）、<code>betty</code>（）或<code>clayfish</code>（）。
<section end="codec_tropical_fish_pattern_component"/></div>

# = tropical_fish/pattern_color =
<div class="treeview"><section begin="codec_tropical_fish_pattern_color_component"/>
* * ：热带鱼的花纹颜色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_tropical_fish_pattern_color_component"/></div>

# = unbreakable =
<div class="treeview"><section begin="codec_unbreakable_component"/>
* * ：空标签，此组件存在时物品无法破坏，不存在耐久度。
<section end="codec_unbreakable_component"/></div>

# = use_cooldown =
<div class="treeview"><section begin="codec_use_cooldown_component"/>
* * ：设置物品的使用冷却行为。冷却时间会作用在一个“冷却组”上。
* ** ：（命名空间ID）设置物品冷却组。同冷却组的物品会同时受到同一个物品冷却影响，在冷却时间内所有同冷却组的物品都无法使用。如果此值不存在，游戏将以物品的命名空间ID作为冷却组ID使用。
* ** ：（）物品使用后的冷却时间，单位为秒。
<section end="codec_use_cooldown_component"/></div>

# = use_effects =
<div class="treeview"><section begin="codec_use_effects_component"/>
* * ：设置物品被使用时的部分行为。
* ** ：（默认为<code>false</code>）玩家在使用此物品时是否可以疾跑。
* ** ：（默认为<code>true</code>）生物使用此物品时是否会发出<code>item_interact_finish</code>和<code>item_interact_start</code>[游戏事件](游戏事件.md)。此值为<code>false</code>或者此组件不存在时使用此物品不会发出这两个游戏事件。
* ** ：（，默认为0.2）玩家使用此物品时的速度倍率。
<section end="codec_use_effects_component"/></div>

# = use_remainder =
<div class="treeview"><section begin="codec_use_remainder_component"/>
* * ：控制物品在消耗使用且物品数量减少后游戏返还的物品。如果玩家物品栏在欲返还物品时已满，则掉落成为物品实体。
* **
* * ：控制物品在消耗使用且物品数量减少后游戏返还的物品。如果玩家物品栏在欲返还物品时已满，则掉落成为物品实体。
* **
<section end="codec_use_remainder_component"/></div>

# = villager/variant =
<div class="treeview"><section begin="codec_villager_variant_component"/>
* * ：（命名空间ID）[村民](村民.md)类型，取值可以为<code>desert</code>（沙漠）、<code>jungle</code>（丛林）、<code>plains</code>（默认）、<code>savanna</code>（热带草原）、<code>snow</code>（雪原）、<code>swamp</code>（沼泽）和<code>taiga</code>（针叶林）。
<section end="codec_villager_variant_component"/></div>

# = weapon =
<div class="treeview"><section begin="codec_weapon_component"/>
* * ：设置物品的武器数据。此组件存在时物品使用次数统计信息会在用此物品攻击时增加。
* ** ：（，默认为0）攻击成功停用目标盾牌的秒数。
* ** ：（，默认为1）每次攻击对此物品造成的损伤值，即损耗的耐久度。
<section end="codec_weapon_component"/></div>

# = wolf/collar =
<div class="treeview"><section begin="codec_wolf_collar_component"/>
* * ：狼的项圈颜色。取值为[染料颜色](染料颜色.md)，即。
<section end="codec_wolf_collar_component"/></div>

# = wolf/sound_variant =
<div class="treeview"><section begin="codec_wolf_sound_variant_component"/>
* * ：（命名空间ID）狼的音效变种。
<section end="codec_wolf_sound_variant_component"/></div>

# = wolf/variant =
<div class="treeview"><section begin="codec_wolf_variant_component"/>
* * ：（命名空间ID）[狼](狼.md)的变种。
<section end="codec_wolf_variant_component"/></div>

# = writable_book_content =
<div class="treeview"><section begin="codec_writable_book_content_component"/>
* * ：[书与笔](书与笔.md)的数据。
* ** ：（最多100个元素）书与笔内存储的页信息，必须为以下格式之一。
* *** ：（长度不超过1024）书与笔内一页的文本信息。如果开启过滤，则代表文本信息与原信息一致。
* *** ：书与笔内一页的信息。
* **** ：（长度不超过1024）已过滤的文本信息。在开启过滤时，此字符串的优先级高于原始文本。被开启过滤的玩家更新时会删除原始文本并将此过滤文本作为原始文本，而被未开启过滤的玩家更新时会被移除。
* **** ：（长度不超过1024）未过滤的文本原始信息。
<section end="codec_writable_book_content_component"/></div>

# = written_book_content =
<div class="treeview"><section begin="codec_written_book_content_component"/>
* * ：[成书](成书.md)的数据。
* ** ：成书的作者。
* ** ：（默认为<code>0</code>）决定成书的复制程度。可以为<code>0</code>（），<code>1</code>（），<code>2</code>（），<code>3</code>（）。
* ** ：成书内存储的页信息，必须使用以下格式之一。
* *** ：（[文本组件](文本组件.md)）成书内一页的信息。如果开启过滤，则代表过滤后文本信息与原信息一致。
* *** ：成书页内信息的另一种格式。如果采用复合标签定义文本组件，则只要存在<code>raw</code>字段就会以此格式解析。
* **** ：（文本组件）已过滤的文本信息。在开启过滤时，此文本的优先级高于原始文本。被开启过滤的玩家更新时会删除原始文本并将此过滤文本作为原始文本，而被未开启过滤的玩家更新时会被移除。
* **** ：（文本组件）未过滤的原始信息。
* ** ：（默认为<code>false</code>）表示这本成书是否已经被解析，决定是否在打开成书时进行成书内文本的解析。
* ** ：（长度不超过32）成书的标题信息。为格式时，如果开启过滤，则代表此标题过滤后与原标题一致。
* *** ：（长度不超过32）已过滤的标题信息。在开启过滤时，此字符串优先级高于。
* *** ：（长度不超过32）未过滤的标题原始信息。
<section end="codec_written_book_content_component"/></div>

# = zombie_nautilus/variant =
<div class="treeview"><section begin="codec_zombie_nautilus_variant_component"/>
* * ：（命名空间ID）[僵尸鹦鹉螺](僵尸鹦鹉螺.md)的变种。
<section end="codec_zombie_nautilus_variant_component"/></div>

# 已移除的组件
# = fire_resistant =
<div class="treeview"><section begin="codec_fire_resistant_component"/>
* * ：空标签，此组件存在时物品不受火焰伤害影响。
<section end="codec_fire_resistant_component"/></div>

# = hide_additional_tooltip =
<div class="treeview"><section begin="codec_hide_additional_tooltip_component"/>
* * ：空标签，此组件存在时提示框不会显示附加信息。
<section end="codec_hide_additional_tooltip_component"/></div>

# = hide_tooltip =
<div class="treeview"><section begin="codec_hide_tooltip_component"/>
* * ：空标签，此组件存在时不会渲染提示框。
<section end="codec_hide_tooltip_component"/></div>

# 注释
本条目的合并来源条目如下：
* [数据组件](数据组件.md)

* [物品堆叠组件/attribute modifiers](物品堆叠组件/attribute modifiers.md)
* [物品堆叠组件/banner patterns](物品堆叠组件/banner patterns.md)
* [物品堆叠组件/bees](物品堆叠组件/bees.md)
* [物品堆叠组件/block entity data](物品堆叠组件/block entity data.md)
* [物品堆叠组件/block state](物品堆叠组件/block state.md)
* [物品堆叠组件/blocks attacks](物品堆叠组件/blocks attacks.md)
* [物品堆叠组件/bucket entity data](物品堆叠组件/bucket entity data.md)
* [物品堆叠组件/bundle contents](物品堆叠组件/bundle contents.md)
* [物品堆叠组件/can place on](物品堆叠组件/can place on.md)
* [物品堆叠组件/charged projectiles](物品堆叠组件/charged projectiles.md)
* [物品堆叠组件/consumable](物品堆叠组件/consumable.md)
* [物品堆叠组件/container](物品堆叠组件/container.md)
* [物品堆叠组件/container loot](物品堆叠组件/container loot.md)
* [物品堆叠组件/custom data](物品堆叠组件/custom data.md)
* [物品堆叠组件/damage resistant](物品堆叠组件/damage resistant.md)
* [物品堆叠组件/death protection](物品堆叠组件/death protection.md)
* [物品堆叠组件/debug stick state](物品堆叠组件/debug stick state.md)
* [物品堆叠组件/dyed color](物品堆叠组件/dyed color.md)
* [物品堆叠组件/enchantments](物品堆叠组件/enchantments.md)
* [物品堆叠组件/entity data](物品堆叠组件/entity data.md)
* [物品堆叠组件/equippable](物品堆叠组件/equippable.md)
* [物品堆叠组件/firework explosion](物品堆叠组件/firework explosion.md)
* [物品堆叠组件/fireworks](物品堆叠组件/fireworks.md)
* [物品堆叠组件/food](物品堆叠组件/food.md)
* [物品堆叠组件/instrument](物品堆叠组件/instrument.md)
* [物品堆叠组件/jukebox playable](物品堆叠组件/jukebox playable.md)
* [物品堆叠组件/lodestone tracker](物品堆叠组件/lodestone tracker.md)
* [物品堆叠组件/lore](物品堆叠组件/lore.md)
* [物品堆叠组件/map decorations](物品堆叠组件/map decorations.md)
* [物品堆叠组件/pot decorations](物品堆叠组件/pot decorations.md)
* [物品堆叠组件/potion contents](物品堆叠组件/potion contents.md)
* [物品堆叠组件/profile](物品堆叠组件/profile.md)
* [物品堆叠组件/recipes](物品堆叠组件/recipes.md)
* [物品堆叠组件/suspicious stew effects](物品堆叠组件/suspicious stew effects.md)
* [物品堆叠组件/tool](物品堆叠组件/tool.md)
* [物品堆叠组件/trim](物品堆叠组件/trim.md)
* [物品堆叠组件/unbreakable](物品堆叠组件/unbreakable.md)
* [物品堆叠组件/use cooldown](物品堆叠组件/use cooldown.md)
* [物品堆叠组件/writable book content](物品堆叠组件/writable book content.md)
* [物品堆叠组件/written book content](物品堆叠组件/written book content.md)

[Category:顶级数据值页面](Category:顶级数据值页面.md)