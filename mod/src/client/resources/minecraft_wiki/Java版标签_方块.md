# Java版标签/方块

*页面ID: 159190* | *来源: Minecraft Wiki*

中的方块标签|基岩版标签/方块}}
* *方块标签（Block Tags）**是[方块](方块.md)的组合。

# 使用
方块标签被用于[进度](进度.md)和[世界生成](世界生成.md)等文件，也用于命令测试方块。只要方块在标签中则测试成功。

游戏定义了一系列方块标签，有些是同类方块的简单分组。部分标签被游戏内部用于特殊用途，如生物生成、世界生成和方块行为等。

# 标签列表

# = acacia_logs =
* 用于。

# = air =
* 用于[冰霜行者](冰霜行者.md)魔咒检测水上方的空气。

# = all_hanging_signs =
* 用于。

# = all_signs =

# = ancient_city_replaceable =
* 用于决定[远古城市](远古城市.md)在生成时能取代哪些方块。

# = animals_spawnable_on =
* 用于动物的[生成](生成#周期生成.md)判断。

# = anvil =
* 用来决定哪些方块能够用来打开[铁砧](铁砧.md)的GUI界面
* 对其他方块无效，但是将默认元素移出该标签会使得GUI在消失之前快速闪烁。
* 用来决定其下落方块形式是否伤害实体，用于死亡消息。
* 用来判断一个方块是否会在使用或落地时“破坏”。
* 在标签里添加其他可以自然掉落的方块不会使它们受影响，除非使用命令召唤。例如，添加<code>sand</code>后不会使自然落下的落沙伤害实体，但是通过命令生成的落沙会对实体有伤害。
* 用于从掉落中的方块实体中读取NBT，以把没有设置<code>HurtEntities</code>NBT标签的掉落的方块实体的<code>hurtEntities</code>设置为<code>true</code>。
* 用来决定方块是否有机会被通过铁砧GUI破损。

# = armadillo_spawnable_on =
* [犰狳](犰狳.md)可以在这些方块上自然生成。

# = axolotls_spawnable_on =
* 用于[美西螈](美西螈.md)生成判断。

# = azalea_grows_on =
* 用于决定[杜鹃树](杜鹃树.md)可以在哪些方块上自然生成。
* 用于决定[杜鹃树](杜鹃树.md)在自然生成时其下方1格的[缠根泥土](缠根泥土.md)能取代哪些方块。

# = azalea_root_replaceable =
* 用于决定[杜鹃树](杜鹃树.md)在自然生成时，下方大量团簇状的[缠根泥土](缠根泥土.md)和[垂根](垂根.md)能取代哪些方块。

# = badlands_terracotta =
* 用于决定犰狳可以在哪些陶瓦上自然生成。

# = bamboo_blocks =

# = bamboo_plantable_on =

* 用于检查能否种植[竹子](竹子.md)。

# = banners =
* 用于检测用地图点击该方块是否应该在地图上标记该点。将其他方块加入此标签会导致用地图点击时产生使用动画，但不会添加标记。
* 用于。

# = bars =
* 包含所有栏杆。

# = base_stone_nether =
* 持有该标签的方块在生成时可以被[远古残骸](远古残骸.md)替代。

# = base_stone_overworld =
* 用于决定作为地下矿石生成时，泥土、沙砾、花岗岩、闪长岩、安山岩、凝灰岩、黏土能取代哪些方块。
* 用于决定“滴水石簇”能取代哪些方块。
* 用于“滴水石簇”的生成。
* 用于和。

# = bats_spawnable_on =
* 用于决定[蝙蝠](蝙蝠.md)可以在哪些方块上自然生成。

# = beacon_base_blocks =
* 拥有此标签的方块在[信标](信标.md)下方放置时能激活信标。

# = beds =
* 用于确定猫是否会在上面坐下或躺下。
* 用于检测村民的兴趣点。
* 用于决定可以睡在哪些方块中。
* 用于确定幼年村民可以跳到哪些方块上。
* 向该标签添加不分前后两部分的方块可能会导致游戏崩溃。

# = bee_attractive =
* 蜜蜂会尝试在这些方块上授粉。

# = bee_growables =
* 当[蜜蜂](蜜蜂.md)对这些植株进行授粉时，它们会生长一个阶段。
* 从该标签中删除方块没有效果。

# = beehives =
* 确定当蜜蜂带有花粉时可以为哪些方块填充蜂蜜。
* 该标签中的方块可以用带有玻璃瓶或剪刀的发射器清除蜂蜜。
* 用于进度文件husbandry/safely_harvest_honey.json。

# = beneath_bamboo_podzol_replaceable =

* 定义适用于竹子下方可被灰化土替代的方块。

# = beneath_tree_podzol_replaceable =

* 定义适用于树木下方可被灰化土替代的方块。

# = big_dripleaf_placeable =

* 决定[大型垂滴叶](大型垂滴叶.md)可以放置在哪些方块上。

# = birch_logs =
* 用于。

# = blocks_wind_charge_explosions =
* 能够阻挡[风弹](风弹.md)爆炸的方块。

# = buttons =

# = camel_sand_step_sound_blocks =
* 当[骆驼](骆驼.md)在拥有此标签的方块上行走时，播放[骆驼在沙子上方行走](骆驼#音效.md)音效。

# = camels_spawnable_on =
* 指定哪些方块可以生成骆驼。

# = campfires =
* [蜜蜂](蜜蜂.md)、[鹦鹉](鹦鹉.md)和[海龟](海龟.md)将此标记的方块视为造成火焰伤害并相应地进行路径查找。
* 营火使用这个标签来确定它们是否被点燃。
* 打火石用这个标签来确定它是否能点燃营火。给此标签添加方块无效果。
* 属于该标签的方块若具有[方块状态](方块状态.md)，则当被喷溅水瓶击中时，其值将被设为false。

# = candle_cakes =
* 拥有这个标签的方块会被视为插上蜡烛的蛋糕并能被点燃，除非它们的方块状态被设定为false。

# = candles =
* 拥有这个标签的方块会被视为蜡烛并能够点燃，如果有这两个方块状态且都是false。

# = cannot_replace_below_tree_trunk =

# = cannot_support_kelp =

* [海带](海带.md)无法放置在这些方块上。

# = cannot_support_seagrass =

* [海草](海草.md)或[高海草](高海草.md)无法放置在这些方块上。

# = cannot_support_snow_layer =

* [雪](雪.md)无法放置在这些方块上。

# = can_glide_through =
* 可以攀爬且不打断滑翔的方块。

# = cauldrons =
* 这个标签被用于确认寻路过程。

# = cave_vines =
* 用于。

# = ceiling_hanging_signs =
* 用于。

# = chains =
* 包含所有锁链。

# = cherry_logs =
* 用于。

# = climbable =
* 用于生物寻路。
* 该标签用于确定哪些方块可以攀爬。
* * 向该标签添加其他的方块时，为了使生物能够攀爬，这个方块碰撞箱必须足够小，以使生物碰撞箱的中心可以位于这一方块。
* * 这意味着不能从侧面攀登箱子等方块，而可以从顶部攀登。
* * 如果删除了脚手架，则生物将无法平滑地爬升，但仍可以跳上并潜下。

# = coal_ores =

# = combination_step_sound_blocks =
* 此处定义的方块的行走音效是否与其下方方块的行走音效合并。

# = completes_find_tree_tutorial =
* 拥有这个标签的方块可用于完成“找到一棵树”教学提示。

# = concrete_powder =

# = convertable_to_mud =
* 对拥有此标签的方块[水瓶](水瓶.md)时可以将其转化为[泥巴](泥巴.md)。

# = copper =
* 包含所有铜块。

# = copper_chests =
* 包含所有铜箱子。

# = copper_golem_statues =
* 包含所有铜傀儡像。

# = copper_ores =

# = coral_blocks =
* 用于生成珊瑚礁。
* 对单个海泡菜使用骨粉，如果海泡菜位于这些方块上方，会生长出更多的海泡菜。

# = coral_plants =
* 用于。

# = corals =
* 用于生成[珊瑚礁](珊瑚礁.md)。

# = crimson_stems =
* 用于。

# = crops =
* 用于。

# = crystal_sound_blocks =
* 拥有这个标签的方块在被踩中时会播放水晶的音效。

# = dampens_vibrations =
* 实体不会在拥有这个标签的方块上发出振动。

# = dark_oak_logs =
* 用于。

# = deepslate_ore_replaceables =
* 用于决定在世界生成时能被深层[矿石](矿石.md)替换的方块，浅层变种见。

# = diamond_ores =

# = dirt =
* 用于。

# = does_not_block_hoppers =
* 用来决定哪些碰撞箱完整的方块不会阻挡[漏斗](漏斗.md)捕捉物品实体。

# = doors =
* 实体寻路过程中不会尝试跳跃上拥有这个标签的方块。
* 生成[僵尸村庄](僵尸村庄.md)时拥有此标签的方块有概率被转换为空气。

# = dragon_immune =
* 用来决定哪些方块不能被[末影龙](末影龙.md)摧毁。

# = dragon_transparent =

# = dripstone_replaceable_blocks =

# = dry_vegetation_may_place_on =

# = edible_for_sheep =
* 用来决定哪些方块可被[绵羊](绵羊.md)吃掉。

# = emerald_ores =

# = enables_bubble_column_drag_down =

* 流体在这些方块上方生成[气泡柱](气泡柱.md)涡流。

# = enables_bubble_column_push_up =

* 流体在这些方块上方生成[气泡柱](气泡柱.md)涌流。

# = enchantment_power_provider =
* 可以增加附魔台最大附魔等级的方块。

# = enchantment_power_transmitter =
* 不会阻断附魔台附魔等级增益的方块。

# = enderman_holdable =
* 用来决定哪些方块可以被[末影人](末影人.md)拾起。

# = fall_damage_resetting =
* 用来决定除液体外哪些方块可以重置摔落伤害。

# = features_cannot_replace =

# = fence_gates =

# = fences =
* 生物将这个标签中的所有方块视为栅栏，并据此进行寻路。
* 可以将拴绳连接到此标签中的方块上。
* 拴绳结实体使用此标签来检测它是否应该断开。

# = fire =
* 当检测到有效的未激活下界传送门时，将忽略此标签中的方块，并将在激活后将其删除。
* 生物将这个标签中的所有方块视作火并据此寻路。
* 此标签中的方块不会阻挡沙子等方块掉落。
* 能够扑灭火焰的药水会移除此标签中的方块。
* 用于。

# = flower_pots =

# = flowers =

# = forest_rock_can_place_on =

* 定义哪些方块之上可放置<code>forest_rock</code>地物。

# = foxes_spawnable_on =
* 用于狐狸的生成判定。

# = frog_prefer_jump_to =

# = frogs_spawnable_on =
* 用于青蛙的生成判定。

# = geode_invalid_blocks =

# = goats_spawnable_on =

# = gold_ores =

# = grass_blocks =

# = grows_crops =

* <!-- CropBlock, StemBlock -->小麦植株、胡萝卜、马铃薯、甜菜根、火把花植株、瓶子草植株、南瓜茎、西瓜茎可以在这些方块上生长。

# = guarded_by_piglins =
* [猪灵](猪灵.md)将与开启或摧毁拥有这个标签的方块的玩家敌对。

# = happy_ghast_avoids =
* [恶魂](恶魂.md)和[快乐恶魂](快乐恶魂.md)会倾向于远离这些方块。

# = hoglin_repellents =
* [疣猪兽](疣猪兽.md)会远离这些方块。

# = huge_brown_mushroom_can_place_on =

* 定义哪些方块之上可放置<code>huge_brown_mushroom</code>地物。

# = huge_red_mushroom_can_place_on =

* 定义哪些方块之上可放置<code>huge_red_mushroom</code>地物。

# = ice =
* 海底废墟不会在这些方块上生成。

# = ice_spike_replaceable =

* 定义冰刺可替换哪些方块。

# = impermeable =
* 这个标签下的方块的上方有液体时不会展示水滴/熔岩粒子效果。

# = incorrect_for_copper_tool =
* 标记为该标签的方块被铜质工具挖掘后不会掉落。

# = incorrect_for_diamond_tool =
* 标记为该标签的方块被钻石质工具挖掘后不会掉落。

# = incorrect_for_gold_tool =
* 标记为该标签的方块被金质工具挖掘后不会掉落。

# = incorrect_for_iron_tool =
* 标记为该标签的方块被铁质工具挖掘后不会掉落。

# = incorrect_for_netherite_tool =
* 标记为该标签的方块被下界合金质工具挖掘后不会掉落。

# = incorrect_for_stone_tool =
* 标记为该标签的方块被石质工具挖掘后不会掉落。

# = incorrect_for_wooden_tool =
* 标记为该标签的方块被木质工具挖掘后不会掉落。

# = infiniburn_end =
* 在末地中，火会在使用该标签的方块上无限燃烧。

# = infiniburn_nether =
* 在下界中，火会在使用该标签的方块上无限燃烧。

# = infiniburn_overworld =
* 在主世界中，火会在使用该标签的方块上无限燃烧。

# = inside_step_sound_blocks =
* 拥有这个标签的方块在被踩中时会播放在雪地行走的音效。

# = invalid_spawn_inside =
* 这个位置上的方块和它上方的方块带有此标签，则不会被选为[重生位置](生成#个人出生点.md)。

# = iron_ores =

# = jungle_logs =
* 可可豆可以放置其上。

# = lanterns =
* 包含所有灯笼。

# = lightning_rods =
* 包含所有避雷针。

# = lapis_ores =

# = lava_pool_stone_cannot_replace =

# = leaves =
* 此标签中的方块不会阻碍许多结构的生成，如奖励箱、树和巨型蘑菇。
* 用于确定某些方块是否可以放置其上。
* 此标签中的方块使用剑摧毁时速度是正常情况下的1.5倍。
* 此标签中的方块使用剪刀破坏的速度是正常情况下的15倍，并增加其使用统计。
* 该标签中的方块将剪刀识别为正确的工具。

# = logs =
* 用于[鹦鹉](鹦鹉.md)AI在方块上栖息时对方块的要求之一。
* 如果该标签的方块周围有树叶，树叶方块会将其<code>distance</code>方块状态设为与其最近的距离。

# = logs_that_burn =

# = lush_ground_replaceable =

# = maintains_farmland =
* 不会使耕地退化为泥土的方块。

# = mangrove_logs =

# = mangrove_logs_can_grow_through =
* 红树生成时，[红树原木](红树原木.md)可以穿过的方块。

# = mangrove_roots_can_grow_through =
* 红树生成时，[红树根](红树根.md)可以穿过的方块。

# = mineable/axe =
* 此标签内的方块用斧挖掘更快。

# = mineable/hoe =
* 此标签内的方块用锄挖掘更快。

# = mineable/pickaxe =
* 此标签内的方块用镐挖掘更快。

# = mineable/shovel =
* 此标签内的方块用锹挖掘更快。

# = mob_interactable_doors =
* 此标签内的方块可作为[门](门.md)被生物交互。

# = mooshrooms_spawnable_on =
* 用于哞菇的生成判断。

# = moss_blocks =

# = moss_replaceable =
* 可以被骨粉复制的[苔藓块](苔藓块.md)替换的方块。

# = mud =

# = mushroom_grow_block =

* 决定方块即使在光照条件较强的环境下也能种植蘑菇和使巨型蘑菇生长。

# = needs_diamond_tool =
* 标签中的方块需要钻石质以上的工具破坏才可能掉落物品。

# = needs_iron_tool =
* 标签中的方块需要铁质以上的工具破坏才可能掉落物品。

# = needs_stone_tool =
* 标签中的方块需要石质以上的工具破坏才可能掉落物品。

# = nether_carver_replaceables =
* 拥有此标签的方块可以被下界地形雕刻器切掉。

# = nylium =

# = oak_logs =

# = occludes_vibration_signals =
* 阻挡[振动](幽匿感测体#振动检测.md)的传播

# = overrides_mushroom_light_requirement =

* 蘑菇不能在不属于上述标签且光照等于大于13的位置存活。

# = overworld_carver_replaceables =
* 拥有此标签的方块可以被主世界地形雕刻器切掉。

# = overworld_natural_logs =

# = pale_oak_logs =

# = parrots_spawnable_on =
* 用于[鹦鹉](鹦鹉.md)生成判定。

# = piglin_repellents =
* [猪灵](猪灵.md)会远离这些方块。

# = planks =

# = polar_bears_spawnable_on_alternate =
* 用于[北极熊](北极熊.md)生成判定。

# = portals =
* 当骑着一个实体的实体从其上脱离时，它将不会落在这些方块中以防止不需要的传送，而是会脱离在被骑乘的实体的位置。

# = pressure_plates =

# = prevent_mob_spawning_inside =
* 生物不能在这些方块里生成。

# = rabbits_spawnable_on =
* 用于[兔子](兔子.md)的生成判定。

# = rails =
* 检测是否与铁轨相连。
* 矿车是否可在此方块上行驶。
* 检测是否可以放置矿车。
* 向此标签添加其他方块会导致游戏崩溃。
* TNT矿车位于这些方块内时，不会破坏所在位置的方块和下方的方块。

# = redstone_ores =

# = replaceable =

# = replaceable_by_mushrooms =
* 蘑菇被放置或生长时可替换的方块。

# = replaceable_by_trees =
* 可被长成的树木替换的方块。

# = sand =
* 用于确定海龟蛋是否能在该方块上孵化。

# = saplings =
* 树生长时可以替代此标签的方块。

# = sculk_replaceable =
* 用于确定幽匿催发体在蔓延时会将何种方块转化为幽匿块。

# = sculk_replaceable_world_gen =
* 用于确定在世界生成阶段哪些方块会被幽匿斑簇替换。

# = shulker_boxes =
* 栅栏、墙和玻璃板不会连接到这些方块。

# = signs =
* 流水不会破坏这些方块。

# = slabs =

# = small_dripleaf_placeable =

* 小型垂滴叶可以放置在这些方块上，即使小型垂滴叶放置的位置没有水。

# = small_flowers =
* 蜜蜂会尝试采集这些方块的花粉。

# = smelts_to_glass =
* 这些方块可以被烧炼成玻璃。

# = snaps_goat_horn =
* 山羊冲撞到这些方块会掉落山羊角。

# = sniffer_diggable_block =
* 嗅探兽可以从这些方块中找到种子。

# = sniffer_egg_hatch_boost =
* 这些方块可以加速嗅探兽蛋的孵化。

# = snow =

# = snow_layer_can_survive_on =

* 雪可以出现在这些方块上。

# = snow_layer_cannot_survive_on =

* 雪不能出现在这些方块上。

# = soul_fire_base_blocks =
* 灵魂火会在这些方块上燃烧。

# = soul_speed_blocks =
* 穿着附有[灵魂疾行](灵魂疾行.md)魔咒的靴子在这些方块上的行走速度会得到提高。

# = spruce_logs =

# = stairs =

# = standing_signs =

# = stone_bricks =

# = stone_buttons =

# = stone_ore_replaceables =
* 用于决定在世界生成时能被[矿石](矿石.md)替换的方块，深层变种见。

# = stone_pressure_plates =

# = strider_warm_blocks =
* [炽足兽](炽足兽.md)若不在此标签的方块当中，就会打寒颤。

# = substrate_overworld =

* 用于集合世界生成条件。

# = support_override_cactus_flower =

* [仙人掌花](仙人掌花.md)可以放置并存活在这些方块上，即使方块上表面不完整。

# = support_override_snow_layer =

* [雪](雪.md)可以放置并存活在这些方块上，即使方块上表面不完整。

# = supports_azalea =

* [杜鹃花丛](杜鹃花丛.md)、[盛开的杜鹃花丛](盛开的杜鹃花丛.md)可以放置并存活在这些方块上。

# = supports_bamboo =

* [竹子](竹子.md)、[竹笋](竹笋.md)可以放置并存活在这些方块上。

# = supports_big_dripleaf =

* [大型垂滴叶](大型垂滴叶.md)可以放置并存活在这些方块上。

# = supports_cactus =

* [仙人掌](仙人掌.md)可以放置并存活在这些方块上。

# = supports_chorus_flower =

* [紫颂花](紫颂花.md)可以放置并存活在这些方块上。

# = supports_chorus_plant =

* [紫颂植株](紫颂植株.md)可以放置并存活在这些方块上。
* [歌萊樹](歌萊樹.md)会在这些方块上生成。

# = supports_cocoa =

* [可可果](可可果.md)可以放置并存活在这些方块上。

# = supports_crimson_fungus =

* [绯红菌](绯红菌.md)可以放置并存活在这些方块上。

# = supports_crimson_roots =

* [绯红菌索](绯红菌索.md)可以放置并存活在这些方块上。

# = supports_crops =

* <!-- CropBlock -->小麦植株、胡萝卜、马铃薯、甜菜根、火把花植株、瓶子草植株可以放置并存活在这些方块上。

# = supports_dry_vegetation =

* <!-- DryVegetationBlock -->矮枯草丛、高枯草丛可以放置并存活在这些方块上。

# = supports_frogspawn =

* [青蛙卵](青蛙卵.md)可以放置并存活在这些方块上。

# = supports_hanging_mangrove_propagule =

* [红树胎生苗](红树胎生苗.md)可以在这些方块下存活。不能手动放置。

# = supports_lily_pad =

* [睡莲](睡莲.md)可以放置并存活在这些方块上。

# = supports_mangrove_propagule =

* [红树胎生苗](红树胎生苗.md)可以放置并存活在这些方块上。

# = supports_melon_stem =

* [西瓜茎](西瓜茎.md)可以放置并存活在这些方块上。

# = supports_melon_stem_fruit =

* [西瓜茎](西瓜茎.md)能在这些方块上方生成[西瓜](西瓜.md)。

# = supports_nether_sprouts =

* [下界苗](下界苗.md)可以放置并存活在这些方块上。

# = supports_nether_wart =

* [下界疣](下界疣.md)可以放置并存活在这些方块上。

# = supports_pumpkin_stem =

* [南瓜茎](南瓜茎.md)可以放置并存活在这些方块上。

# = supports_pumpkin_stem_fruit =

* [南瓜茎](南瓜茎.md)能在这些方块上方生成[南瓜](南瓜.md)。

# = supports_small_dripleaf =

* [小型垂滴叶](小型垂滴叶.md)可以放置并存活在这些方块上。

# = supports_stem_crops =

* 西瓜茎或南瓜茎可以放置并存活在这些方块上。

# = supports_stem_fruit =

# = supports_sugar_cane =

* [甘蔗](甘蔗.md)可以放置并存活在这些方块上。

# = supports_sugar_cane_adjacently =

* [甘蔗](甘蔗.md)可以放置并存活在这些方块毗邻方块上。

# = supports_vegetation =

* <!-- VegetationBlock -->灌木丛、矮草丛、高草丛、蕨、大型蕨、瓶子草、向日葵、丁香、玫瑰丛、牡丹、眼眸花、萤火虫灌木丛、粉红色花簇、野花簇、蒲公英、火把花、虞美人、兰花、绒球葱、红色郁金香、橙色郁金香、白色郁金香、粉红色郁金香、滨菊、矢车菊、甜浆果丛、橡树树苗、白桦树苗、云杉树苗、丛林树苗、金合欢树苗、深色橡树树苗、樱花树苗、苍白橡树树苗可以放置并存活在这些方块上。

# = supports_warped_fungus =

* [诡异菌](诡异菌.md)可以放置并存活在这些方块上。

# = supports_warped_roots =

* [诡异菌索](诡异菌索.md)可以放置并存活在这些方块上。

# = supports_wither_rose =

* [凋灵玫瑰](凋灵玫瑰.md)可以放置并存活在这些方块上。

# = sword_efficient =
* 可被剑更快地破坏的方块。
* 对[蜘蛛网](蜘蛛网.md)、[竹子](竹子.md)和[竹笋](竹笋.md)的挖掘加速不受此标签影响。

# = sword_instantly_mines =
* 可被剑瞬间破坏的方块。

# = terracotta =

# = trail_ruins_replaceable =
* 可疑的沙砾可以替换[古迹废墟](古迹废墟.md)中的这些方块生成。

# = trapdoors =
* 当寻路时，生物把这个标签中的所有方块都视为活板门。

# = triggers_ambient_desert_dry_vegetation_block_sounds =
* 指定哪些方块可以触发沙漠环境音效。

# = triggers_ambient_dried_ghast_block_sounds =
* 在沙子和红沙的环境音效判定中有效的方块。

# = triggers_ambient_desert_sand_block_sounds =
* 在失水恶魂的环境音效判定中有效的方块。

# = underwater_bonemeals =
* 当在暖洋生物群系中在水下使用骨粉时，该标签中的方块将取代水源方块（在5个水平块和2个垂直块内）。
* 如果该标记中的方块是自定义的，则该行为将应用于任何生物群系中的水源方块。这些方块在默认情况下不会含水。

# = unstable_bottom_center =

# = valid_spawn =
* 用于确定位置是否是玩家的有效出生位置。

# = vibration_resonators =
* 可以产生共振的方块。

# = wall_corals =
* 用于生成珊瑚礁。

# = wall_hanging_signs =
* 用于。

# = wall_post_override =
* 插在墙上，墙会出现柱子。

# = wall_signs =

# = walls =
* 当寻路时，生物把这个标签中的方块视为栅栏。
* 栅栏门紧挨着这些方块时，方块状态的值为。

# = warped_stems =

# = wart_blocks =
* 疣猪兽不能生成在这些方块上。

# = wither_immune =
* 用来确定哪些方块凋灵不能破坏。

# = wither_summon_base_blocks =
* 可以用来搭建凋灵的方块。

# = wolves_spawnable_on =
* 用于狼的生成判定。

# = wooden_buttons =
* 用于。

# = wooden_doors =
* 用于标签。 村民用它来检测门。

# = wooden_fences =

# = wooden_pressure_plates =

# = wooden_slabs =

# = wooden_stairs =

# = wooden_shelves =
* 包含所有木质展示架。

# = wooden_trapdoors =

# = wool =
* 此标签的方块可以被使用[剪刀](剪刀.md)以5倍的速度破坏，并增加剪刀的使用统计。
* 放在该标签的方块上的[音符盒](音符盒.md)会发出吉他音效。
* * 如果导致音符盒播放不同乐器音效的方块加入此标签，则这些方块会导致音符盒播放吉他。
* 用于。

# = wool_carpets =

# 已移除的标签
# = azalea_log_replaceable =

添加于：[21w05a](21w05a.md)。移除于：[21w10a](21w10a.md)。

# = dirt_like =

添加于：[18w43a](18w43a.md)。移除于：[19w41a](19w41a.md)。

# = fire_aspect_lightable =
* 能被带火焰附加魔咒的物品攻击点燃的方块。

添加于：[24w19a](24w19a.md)。移除于：[Java版1.21-pre1](Java版1.21-pre1.md)。

# = lush_plants_replaceable =
* 被替代。

添加于：[21w05a](21w05a.md)。移除于：[21w16a](21w16a.md)。

# = non_flammable_wood =
在物品标签中仍存在与此同名的标签。

添加于：[20w13a](20w13a.md)。移除于：[22w44a](22w44a.md)。

# = replaceable_plants =
* 被替代。

添加于：[Java版1.18-pre5](Java版1.18-pre5.md)。移除于：[23w14a](23w14a.md)。

# = stripped_logs =

添加于：[22w42a](22w42a.md)。移除于：[22w46a](22w46a.md)。

# = tall_flowers =

添加于：[19w34a](19w34a.md)。移除于：[24w45a](24w45a.md)。

# = water_hacked =

添加于：[18w07a](18w07a.md)。移除于：[18w10c](18w10c.md)。

# = waterlogged =

添加于：[18w07b](18w07b.md)。移除于：[18w10c](18w10c.md)。

# 历史

|。}}
|。}}
|。
|原版里加入了石质按钮。
|原版里加入了铁门。}}
|。}}
|。}}
|。}}
|。
|加入了。}}
|。
|加入了。}}
|。
|原版里加入了[箱子](箱子.md)。}}
|。
|里加入了珊瑚。}}
|。}}
|。}}
|。}}
|。}}
|。
|修改了。}}
|。}}
|。}}
|。}}
|。}}
|。}}
|。
|里加入了诡异木和绯红木。
|现在使用对应的标签。}}
|。
|里移除了[下界岩](下界岩.md)，并加入了[下界菌](下界菌.md)，[菌索](菌索.md)和[菌岩](菌岩.md)。}}
|。
|里加入了花盆里的绯红菌、诡异菌、绯红菌索和诡异菌索。}}
|。
|菌柄的中加入了绯红菌核、诡异菌核和它们的去皮变种。}}
|。
|里加入了缠怨藤和它的植物形式。
|里加入了哭泣的黑曜石。
|里加入了诡异菌盆栽。}}
|。
|不再要求[镐](镐.md)的品质了。}}
|。
|里加入了重生锚。
|现在使用。}}
|里加入了下界传送门和重生锚。}}
|。
|里加入了磨制黑石。
|里加入了黑石、磨制黑石与磨制黑石砖。
|里加入了灵魂营火。
|现在使用并移除了灯笼和灵魂灯笼。}}
|。
|现在使用。}}
|。}}
|里移除了凋灵玫瑰。}}
|里移除了甜浆果丛。}}
|。
|现在用于确定海龟蛋是否能在该方块上孵化。}}
|。}}
|。}}
|。}}
|。
|里加入了装有细雪的炼药锅。}}
|被重命名为。}}
|。}}
|。
|里加入了杜鹃树叶和盛开的杜鹃树叶。}}
|及里加入了阴沉石。
|里加入了阴沉石的各类变种。}}
|。
|里加入了凝灰岩并将阴沉石更改为深板岩。
|里加入了深层金矿石。
|里加入了深板岩圆石的各类变种并将阴沉石的各类变种更改为深板岩。}}
|。
|里移除了苔藓块、、草丛、高草丛、覆地苔藓、小型垂滴叶、大型垂滴叶、大型垂滴叶茎和藤蔓。
|移除了。}}
|里移除了凝灰岩并将其加入里。
|里加入了洞穴藤蔓及其植物形式。
|里加入了遮光玻璃。}}
|。
|更改了，并将加入了该标签。
|将切制铜台阶、楼梯及其非氧化变种分别加入。
|里加入了杜鹃花丛和盛开的杜鹃花丛。}}
|里加入了切制铜台阶和楼梯的氧化变种。}}
|。
|移除了。
|里加入了沙子和沙砾，并将其中的标签替换为标签。
|标签里加入了草方块、菌丝体、苔藓块。
|从一些已经包含的标签中移除了重复出现的方块。}}
|。}}
|里加入了粗金块。}}
|。
|里加入了洞穴藤蔓。
|里移除了苔藓块。
|里加入了杜鹃花丛和盛开的杜鹃花丛。}}
|。
|里加入了洞穴藤蔓植株。}}
|。}}
|重命名为。}}
|。}}
|。}}
|。
|从里移除了细雪。
|里加入了雪块和细雪。}}
|中移除了泥土。}}
|中移除了，并加入了。}}
|。}}
|。
|加入了。
|向中加入了泥巴。
|向中加入了红树胎生苗。
|向中加入了幽匿脉络。
|向中加入了红树根。
|向中加入了幽匿块、幽匿催发体、幽匿脉络和幽匿尖啸体。
|向中加入了泥砖、泥砖楼梯、泥砖台阶和泥坯。
|向中加入了沾泥的红树根和泥巴。
|向中加入了[光源方块](光源方块.md)。
|向中分别加入了。
|将红树类、泥砖类方块分别加入其所属组别的方块签内。
|重命名为。}}
|加入了红树树叶。}}
|。
|加入了。
|将重命名为。
|向中加入了强化深板岩。}}
|、、。
|移除了，其中全部内容合并至中。}}
|。
|向中加入了泥巴和沾泥的红树根。
|向中加入了覆地苔藓和藤蔓。
|向中加入了覆地苔藓、藤蔓、红树胎生苗和雪。
|从中移除了泥巴。}}
|。}}
|。
|向中加入了磨制深板岩。}}
|。}}
|中加入了。}}
|中移除了覆地苔藓。}}
|。}}
|。
|向中加入了竹栅栏。
|向中加入了、竹马赛克和雕纹书架。
|向中加入了竹板。
|向中加入了竹告示牌。
|向中加入了墙上的竹告示牌。
|向中加入了竹按钮。
|向中加入了竹门。
|向中加入了竹栅栏。
|向中加入了竹压力板。
|向中加入了竹台阶和竹马赛克台阶。
|向中加入了竹楼梯和竹马赛克楼梯。
|向中加入了竹活板门。}}
|中加入了竹马赛克台阶和竹马赛克楼梯。
|从中移除了竹马赛克台阶。
|从中移除了竹马赛克楼梯。}}
|。
|向中加入了绯红菌索、发光地衣、睡莲、覆地苔藓、下界苗、小型紫晶芽、诡异菌索和。}}
|。
|向中加入了。}}
|。
|移除了。}}
|中加入了。}}
|。
|向中加入了樱花木按钮。
|向中加入了樱花木门。
|向中加入了樱花木栅栏门。
|向中加入了樱花木栅栏。
|向中加入了悬挂式樱花木告示牌。
|向中加入了樱花树叶。
|向中加入了樱花树叶和粉红色花簇。
|向中加入了樱花原木。
|向中加入了。
|向中加入了樱花木板。
|向中加入了樱花木压力板。
|向中加入了樱花树苗。
|向中加入了樱花木告示牌。
|向中加入了樱花木台阶。
|向中加入了樱花木楼梯。
|向中加入了樱花木活板门。
|向中加入了墙上的悬挂式樱花木告示牌。
|向中加入了墙上的樱花木告示牌。
|向中加入了粉红色花簇。
|向中加入了可疑的沙子。}}
|中加入了火把花植株。
|向中加入了火把花。}}
|。}}
|中的改为。}}
|。
|从中移除了覆地苔藓、雪、下界苗、诡异菌索、绯红菌索和。
|向中加入了校频幽匿感测体。}}
|中加入了瓶子草植株。
|向中加入了火把花盆栽。
|向中加入了瓶子草。}}
|。
|移除了，并由替代。
|向加入了可疑的沙砾。
|向中加入了可疑的沙子。
|从中移除了，并加入了沙子和红沙。}}
|。
|从中移除了石头按钮和磨制黑石按钮，并加入了新加入的标签。
|从中移除了石头按钮，并加入了新加入的标签。
|从中移除了沙子、泥土和砂土。}}
|中移除了南瓜和西瓜。}}
|中移除了向日葵、丁香、玫瑰丛和牡丹。}}
|中加入了竹马赛克台阶。
|向中加入了竹马赛克楼梯。}}
|。
|将所有种类的混凝土粉末从移至新加入的中，并将加入到中。}}
|中加入了紫颂花和孢子花。}}
|。}}
|加入了。}}
|。}}
|。
|将中的值替换为。}}
|。}}
|中加入了。}}
|。}}
|目录更改为。
|加入了。}}
|。}}
|。}}
|。
|从中移除了铜门及其变种。}}
|。}}
|。}}
|中加入了。
|现在包含而不是。}}
|不再属于[实验性内容](实验性内容.md)。}}
|。
|移除了。}}
|。}}
|和均添加到和中。}}
|。}}
|。
|将重命名为。}}
|。}}
|中加入更多值。}}
|中加入更多值。}}
|。
|将重命名为。}}
|。}}
|。}}
|。}}
|加入了。}}
|。
|重命名以下标签：
* <code>#dry_vegetation_may_place_on</code> → <code>#supports_dry_vegetation</code>
* <code>#bamboo_plantable_on</code> → <code>#supports_bamboo</code>
* <code>#small_dripleaf_placeable</code> → <code>#supports_small_dripleaf</code>
* <code>#big_dripleaf_placeable</code> → <code>#supports_big_dripleaf</code>
* <code>#mushroom_grow_block</code> → <code>#overrides_mushroom_light_requirement</code>
* <code>#snow_layer_can_survive_on</code> → <code>#support_override_snow_layer</code>
* <code>#snow_layer_cannot_survive_on</code> → <code>#cannot_support_snow_layer</code>}}
|。}}
|。
|拆分了，现在仅包含泥土、砂土和缠根泥土。}}
}}

# 导航

[Category:数据包](Category:数据包.md)

[en:Block tag (Java Edition)](en:Block tag (Java Edition).md)
[fr:Tag de bloc (Édition Java)](fr:Tag de bloc (Édition Java).md)
[uk:Теґ блоків (Java Edition)](uk:Теґ блоків (Java Edition).md)