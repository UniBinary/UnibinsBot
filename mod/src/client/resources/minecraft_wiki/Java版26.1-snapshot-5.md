# Java版26.1-snapshot-5

*页面ID: 184352* | *来源: Minecraft Wiki*

<onlyinclude>

* *26.1-snapshot-5**是[Java版26.1](Java版26.1.md)的第5个快照，发布于2026年1月27日<ref></ref>，加入了[金蒲公英](金蒲公英.md)以控制幼年生物是否成长，更改了更多幼年生物的模型，并修复了一些漏洞。

# 新内容
# = 方块 =
* *[金蒲公英](金蒲公英.md)**
* 一种新的花，可用于阻止幼年[动物](动物.md)成长。
* * 对幼年动物时，将阻止其成长。
* ** 被阻止成长的幼年动物无法喂食其他物品。
* * 对已被阻止成长的幼年动物时，将使其重新开始成长。
* * 无法对[蝌蚪](蝌蚪.md)、幼年[棕色哞菇](棕色哞菇.md)、幼年[疣猪兽](疣猪兽.md)使用。
* * 使用时会在该生物周围释放绿色粒子。
* 使用1个[蒲公英](蒲公英.md)和8个[金粒](金粒.md)合成。

* 可用于合成[黄色染料](黄色染料.md)。
* 可用于合成[谜之炖菜](谜之炖菜.md)，给予玩家[饱和](饱和.md)效果。
* 可放入[花盆](花盆.md)中。

# = 常规 =
* *用户界面**
* 现在游戏规则搜索栏可以根据描述和类型来搜索游戏规则。

* *[数据组件](数据组件.md)**
* 加入了<code>dye</code>组件。
* * 代表一种染料颜色。
* * 用于曾经需要匹配染料物品的各种场合，包括方块和生物互动。
* ** 注意：该组件的存在不意味着启用这些功能。该物品必须明确具有这些功能，例如添加到标签或作为配方材料。
* * 格式：<code>white</code>、<code>orange</code>、<code>magenta</code>、<code>light_blue</code>、<code>yellow</code>、<code>lime</code>、<code>pink</code>、<code>gray</code>、<code>light_gray</code>、<code>cyan</code>、<code>purple</code>、<code>blue</code>、<code>brown</code>、<code>green</code>、<code>red</code>或<code>black</code>其一。

* *[标签](Java版标签.md)**
* 加入了物品标签：
* * <code>#dyes</code>：辅助标签，包含原版游戏中的所有染料。
* * <code>#loom_dyes</code>：允许在织布机界面上设置图案颜色的物品。
* ** 织布机屏幕仍然需要物品堆叠具有<code>minecraft:dye</code>组件。
* * <code>#loom_patterns</code>：允许在织布机界面上解锁图案的物品。
* ** 织布机屏幕仍然需要物品堆叠具有<code>minecraft:provides_banner_patterns</code>组件。
* * <code>#cat_collar_dyes</code>：用于给猫的项圈染色的物品。
* ** 设置的颜色取自物品的<code>minecraft:dye</code>组件。
* * <code>#wolf_collar_dyes</code>：用于给狼的项圈染色的物品。
* ** 设置的颜色取自物品的<code>minecraft:dye</code>组件。
* * <code>#cauldron_can_remove_dye</code>：可以在装有水的炼药锅中使用以去除<code>minecraft:dyed_color</code>组件的物品。
* 加入了实体类型标签：
* * <code>#cannot_be_age_locked</code>：不可以被金蒲公英停止生长的可成长生物。

* *[配方](配方.md)**
* 加入了<code>minecraft:crafting_dye</code>配方类型。
* * 替代了<code>minecraft:crafting_special_armordye</code>。
* ** 输出：
* *** 此类型的配方会先将与<code>target</code>原料匹配的物品的<code>minecraft:dyed_color</code>组件值和与<code>dye</code>原料匹配的<code>minecraft:dye</code>组件值混合。
* *** 结果将由与<code>target</code>匹配的物品转化至<code>result</code>物品堆叠来构建，并设置新的<code>minecraft:dyed_color</code>组件。
* * 格式：
* ** <code>category</code>：配方书的分类，可以为<code>building</code>、<code>redstone</code>、<code>equipment</code>或<code>misc</code>之一，默认为<code>misc</code>。
* ** <code>group</code>：配方书的分组，默认为空字符串。
* ** <code>show_notification</code>：可选布尔值，配方解锁时是否显示弹窗，默认为<code>true</code>。
* ** <code>target</code>：原料，曾被硬编码为<code>#dyable</code>标签。
* ** <code>dye</code>：原料，曾被硬编码为染料物品。
* *** 此物品必须具有<code>minecraft:dye</code>组件。
* ** <code>result</code>：结果物品堆叠，曾经始终是与<code>target</code>匹配的物品副本。
* 加入了<code>minecraft:crafting_imbue</code>配方类型。
* * 替代了<code>minecraft:crafting_special_tippedarrow</code>。
* * 匹配一个单一物品<code>source</code>原料，并被8个<code>material</code>原料环绕。
* ** 输出：
* *** 此类型的配方会复制与<code>source</code>匹配的物品的<code>minecraft:potion_contents</code>组件到输出物品上。
* * 格式：
* ** <code>category</code>：配方书的分类，可以为<code>building</code>、<code>redstone</code>、<code>equipment</code>或<code>misc</code>之一，默认为<code>misc</code>。
* ** <code>group</code>：配方书的分组，默认为空字符串。
* ** <code>show_notification</code>：可选布尔值，配方解锁时是否显示弹窗，默认为<code>true</code>。
* ** <code>source</code>：原料，曾被硬编码为<code>minecraft:lingering_potion</code>。
* ** <code>material</code>：原料，曾被硬编码为<code>minecraft:arrow</code>。
* ** <code>result</code>：结果物品堆叠，曾被硬编码为8个<code>minecraft:tipped_arrow</code>。

* *[声音事件](Java版声音事件.md)**
* 加入了幼年鸡的新音效：
* * <code>entity.baby_chicken.ambient</code>
* * <code>entity.baby_chicken.hurt</code>
* * <code>entity.baby_chicken.death</code>
* 加入了金蒲公英的音效：
* * <code>item.golden_dandelion.use</code>
* * <code>item.golden_dandelion.unuse</code>

* *方块纹理**
* 新增了下列纹理：
* *

# 更改
# = 生物 =
* *[海豚](海豚.md)、[鱿鱼](鱿鱼.md)、[发光鱿鱼](发光鱿鱼.md)、[海龟](海龟.md)、[美西螈](美西螈.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了幼年鱿鱼、幼年发光鱿鱼和幼年美西螈的[边界箱](边界箱.md)以匹配其新模型。

* *[鸡](鸡.md)**
* 修正了幼年热带鸡的侧面纹理。

* *[兔子](兔子.md)**
* 修正了幼年棕色兔子的腿部纹理。

# = 游戏内容 =
* *[进度](进度.md)**
* “[](进度#advancements-anchor-nether.distract_piglin.md)”现在也可以通过丢出[金蒲公英](金蒲公英.md)获取。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>98.0</code>。

* *[物品修饰器](物品修饰器.md)**
* <code>set_random_dyes</code>：
* * 不再只对属于物品标签<code>#dyeable</code>的物品工作。

* *[环境属性](环境属性.md)**
* 将环境属性<code>gameplay/turtle_egg_hatch_chance</code>的默认值更改为0.002。

* *[文本组件](文本组件.md)**
* 从文本组件<code>nbt</code>解析的标签，若设置为<code>interpret: false</code>，现在会经过语法渲染<!--pretty-printed-->，而不是单一扁平的<code>text</code>组件。

* *[配方](配方.md)**
* 移除了<code>minecraft:crafting_special_mapcloning</code>配方类型，其功能被整合到<code>minecraft:crafting_transmute</code>。
* 现在<code>show_notification</code>字段可以在所有配方上工作了，此前只在<code>crafting_shaped</code>上工作：
* * <code>minecraft:crafting_shapeless</code>
* * <code>minecraft:crafting_shaped</code>
* * <code>minecraft:crafting_transmute</code>
* * <code>minecraft:smelting</code>
* * <code>minecraft:blasting</code>
* * <code>minecraft:smoking</code>
* * <code>minecraft:campfire_cooking</code>
* * <code>minecraft:stonecutting</code>
* * <code>minecraft:smithing_transform</code>
* * <code>minecraft:smithing_trim</code>
* 移除了下列没有配方书的配方的<code>group</code>字段：
* * <code>minecraft:stonecutting</code>
* * <code>minecraft:smithing_transform</code>
* * <code>minecraft:smithing_trim</code>
* 更改了<code>minecraft:crafting_transmute</code>配方类型。
* * 此类型的配方现在可以接受与<code>material</code>匹配的多个物品。
* * 附加字段：
* ** <code>material_count</code>：整数范围，<code>material</code>字段匹配的物品数量。
* *** 必须为<code>[1, 8]</code>的子区间。
* *** 默认为<code>[1, 1]</code>。
* ** <code>add_material_count_to_result</code>：布尔值，默认为<code>false</code>。
* *** 为<code>true</code>时，被原料<code>material</code>匹配上的物品数量会增加到结果物品的数量上。
* 更改了<code>minecraft:crafting_special_bannerduplicate</code>配方类型。
* * 现在可以限制原料。
* * 现在可以指定输出。
* * 此配方依旧只作用于旗帜物品。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>banner</code>：可用于来源和结果物品的原料，曾被硬编码为旗帜物品。
* ** <code>result</code>：结果物品堆叠，曾被硬编码为不带有空图案的旗帜物品。
* * 输出：
* ** 此配方会搜寻第一个与<code>banner</code>匹配的旗帜物品，并将其视为源旗帜。
* ** 结果将由源旗帜转化至<code>result</code>物品堆叠来构建。
* ** 源旗帜依旧会留在合成方格内。
* 更改了<code>crafting_special_bookcloning</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>source</code>：作为来源书的原料。
* *** 为了整个配方进行匹配，此物品必须具有<code>minecraft:written_book_content</code>组件。
* ** <code>material</code>：将要被复制的原料，曾被硬编码为<code>#book_cloning_target</code>标签。
* ** <code>allowed_generations</code>：整数范围，被<code>material</code>匹配的原料的<code>minecraft:written_book_content</code>组件中<code>generation</code>的允许值。
* *** 必须是<code>[0, 2]</code>的子区间。
* *** 默认为<code>[0, 1]</code>，即允许原稿和副本，但不允许副本的副本。
* ** <code>result</code>：结果物品堆叠，曾经总是<code>source</code>原料的副本。
* * 输出：
* ** 此类型的配方会先获取与<code>source</code>匹配的物品的<code>minecraft:written_book_content</code>组件。
* ** <code>minecraft:written_book_content</code>组件的<code>generation</code>字段会增加1。
* ** 结果将由与<code>source</code>匹配的物品转化至<code>result</code>物品堆叠来构建，并设置新的<code>written_book_content</code>组件。
* ** 与<code>material</code>匹配的物品数量会增加到结果物品堆叠上。
* ** 与<code>source</code>匹配的物品会留在合成方格中。
* 更改了<code>minecraft:crafting_decorated_pot</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>back</code>、<code>left</code>、<code>right</code>、<code>front</code>：原料，曾被硬编码为<code>#decorated_pot_ingredients</code>标签。
* ** <code>result</code>：结果物品堆叠，曾被硬编码为1个<code>minecraft:decorated_pot</code>。
* * 其他功能保持不变。例如，与原料匹配的物品会将给结果物品加上内容对应的<code>minecraft:pot_decorations</code>组件。
* 更改了<code>minecraft:crafting_special_firework_rocket</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>shell</code>：原料，曾被硬编码为<code>minecraft:paper</code>。
* ** <code>fuel</code>：原料，曾被硬编码为<code>minecraft:gunpowder</code>。
* ** <code>star</code>：原料，曾被硬编码为<code>minecraft:firework_star</code>。
* ** <code>result</code>：结果物品堆叠，曾被硬编码为3个<code>minecraft:firework_rocket</code>。
* * 输出：
* ** 必须精确存在一个与<code>shell</code>原料匹配的物品。
* ** 与<code>fuel</code>匹配的物品堆叠数量会控制<code>flight_duration</code>字段。
* ** <code>explosions</code>字段复制自<code>star</code>原料的<code>minecraft:firework_explosion</code>组件（如果有的话）。
* 更改了<code>minecraft:crafting_special_firework_star_fade</code>配方类型。
* * 现在可以配置原料。
* * 移除了未使用的<code>category</code>字段。
* * 此配方现在使用<code>minecraft:dye</code>组件，而不是在染料物品中硬编码颜色。
* * 附加字段：
* ** <code>target</code>：原料，曾被硬编码为<code>minecraft:firework_star</code>。
* ** <code>dye</code>：原料，曾被硬编码为染料物品。
* *** 为了整个配方进行匹配，此物品必须具有<code>minecraft:dye</code>组件。
* ** <code>result</code>：结果物品堆叠，曾经总是被<code>target</code>匹配的物品副本。
* * 输出：
* ** 此配方会找到被<code>target</code>匹配的原料物品的<code>minecraft:firework_explosion</code>组件的当前值。
* ** <code>firework_explosion</code>的<code>fade_colors</code>字符会被设置为被<code>dye</code>匹配上的物品的颜色。
* ** 结果将由与<code>target</code>匹配的物品转化至<code>result</code>物品堆叠来构建，并设置新的<code>minecraft:firework_explosion</code>组件。
* 更改了<code>minecraft:crafting_special_firework_star</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>trail</code>：原料，曾被硬编码为<code>minecraft:diamond</code>。
* ** <code>twinkle</code>：原料，曾被硬编码为<code>minecraft:glowstone_dust</code>。
* ** <code>fuel</code>：原料，曾被硬编码为<code>minecraft:gunpowder</code>。
* ** <code>dye</code>：原料，曾被硬编码为染料物品。
* *** 为了整个配方进行匹配，此物品必须具有<code>minecraft:dye</code>组件。
* ** <code>shapes</code>：一组形状与材料的映射。
* *** 允许的键值与<code>minecraft:firework_explosion</code>组件的<code>shape</code>字段相同。
* *** <code>small_ball</code>
* *** <code>large_ball</code>，曾被硬编码为<code>minecraft:fire_charge</code>。
* *** <code>burst</code>，曾被硬编码为<code>minecraft:feather</code>。
* *** <code>star</code>，曾被硬编码为<code>minecraft:gold_nugget</code>。
* *** <code>creeper</code>，曾被硬编码为生物头颅。
* ** <code>result</code>：结果物品堆叠，曾被硬编码为3个<code>minecraft:firework_star</code>。
* * 此配方现在使用<code>minecraft:dye</code>组件，而不是在染料物品中硬编码颜色。
* * 输出：
* ** 必须精确存在一个与<code>fuel</code>原料匹配的物品。
* ** 结果会基于<code>result</code>字段，其<code>minecraft:firework_explosion</code>组件的内容将由下列值决定：
* *** 被<code>dye</code>匹配的原料的<code>minecraft:dye</code>组件会添加到<code>colors</code>字段。
* *** 如果存在一个物品被<code>trial</code>匹配，则<code>has_trail</code>字段被设置为<code>true</code>。
* *** 如果存在一个物品被<code>twinkle</code>匹配，则<code>has_twinkle</code>字段被设置为<code>true</code>。
* *** <code>shape</code>字段由<code>shape</code>字段匹配的原料决定，不存在时为<code>small_ball</code>。
* 更改了<code>minecraft:crafting_special_mapextending</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>map</code>：原料，曾被硬编码为具有<code>minecraft:map_id</code>的<code>minecraft:filled_map</code>物品。
* *** 为了整个配方进行匹配，此物品必须具有<code>minecraft:map_id</code>组件。
* ** <code>material</code>：原料，曾被硬编码为<code>minecraft:paper</code>。
* ** <code>result</code>：结果物品堆叠，曾经总是与<code>map</code>原料匹配的物品副本。
* * 输出：
* ** 此配方会先找到与<code>map</code>原料匹配的物品的<code>minecraft:map_id</code>组件。
* ** 结果物品将原料物品转化来构建。
* ** <code>minecraft:map_post_processing</code>组件将设置在结果物品上。
* ** 源物品会保留在合成方格中。
* 更改了<code>minecraft:crafting_special_shielddecoration</code>配方类型。
* * 现在可配置原料和输出。
* * 移除了未使用的<code>category</code>字段。
* * 附加字段：
* ** <code>banner</code>：原料，曾被硬编码为旗帜物品。
* *** 只会于旗帜物品匹配。
* ** <code>target</code>：原料，曾被硬编码为<code>minecraft:shield</code>。
* *** 为了整个配方进行匹配，此物品的<code>minecraft:banner_patterns</code>组件必须要么为空，要么不存在。
* ** <code>result</code>：结果物品堆叠，曾经总是与<code>target</code>匹配的物品副本。
* * 功能保持不变。例如该配方将对与<code>target</code>匹配的物品进行如下更改：
* * 输出：
* ** 结果将由与<code>target</code>匹配的物品转化至<code>result</code>物品堆叠来构建，然后：
* *** 复制与<code>banner</code>匹配的物品的<code>minecraft:banner_pattern</code>组件。
* *** 根据与<code>banner</code>匹配的旗帜类型来设置<code>minecraft:base_color</code>组件。

* *[配方书](配方书.md)**
* 重命名了下列切石机配方，关联的进度一并被重命名：
* * <code>minecraft:chiseled_stone_bricks_stone_from_stonecutting</code>被重命名为<code>minecraft:chiseled_stone_bricks_from_stone_stonecutting</code>。
* * <code>minecraft:end_stone_brick_slab_from_end_stone_brick_stonecutting</code>被重命名为<code>minecraft:end_stone_brick_slab_from_end_stone_bricks_stonecutting</code>。
* * <code>minecraft:end_stone_brick_stairs_from_end_stone_brick_stonecutting</code>被重命名为<code>minecraft:end_stone_brick_stairs_from_end_stone_bricks_stonecutting</code>。
* * <code>minecraft:end_stone_brick_wall_from_end_stone_brick_stonecutting</code>被重命名为<code>minecraft:end_stone_brick_wall_from_end_stone_bricks_stonecutting</code>。
* * <code>minecraft:mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting</code>被重命名为<code>minecraft:mossy_stone_brick_slab_from_mossy_stone_bricks_stonecutting</code>。
* * <code>minecraft:mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting</code>被重命名为<code>minecraft:mossy_stone_brick_stairs_from_mossy_stone_bricks_stonecutting</code>。
* * <code>minecraft:mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting</code>被重命名为<code>minecraft:mossy_stone_brick_wall_from_mossy_stone_bricks_stonecutting</code>。
* * <code>minecraft:prismarine_brick_slab_from_prismarine_stonecutting</code>被重命名为<code>minecraft:prismarine_brick_slab_from_prismarine_bricks_stonecutting</code>。
* * <code>minecraft:prismarine_brick_stairs_from_prismarine_stonecutting</code>被重命名为<code>minecraft:prismarine_brick_stairs_from_prismarine_bricks_stonecutting</code>。
* * <code>minecraft:quartz_slab_from_stonecutting</code>被重命名为<code>minecraft:quartz_slab_from_quartz_block_stonecutting</code>。
* * <code>minecraft:stone_brick_walls_from_stone_stonecutting</code>被重命名为<code>minecraft:stone_brick_wall_from_stone_stonecutting</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>79.0</code>。
* 由发光鱿鱼、避雷针、方块的涂蜡、上蜡和刮削发出的粒子现在渲染不透明，因为它们实际上从未使用过半透明渲染。
* 移除了，改为使用精灵图。

* *[标签](Java版标签.md)**
* 移除了物品标签<code>#dyeable</code>。
* 向方块标签中加入了金蒲公英盆栽。
* 向方块标签、物品标签、村民交易标签中加入了金蒲公英。

# 修复
只适用于有序配方。
|305388|蜜蜂一直保持被激怒的状态。
|305888|在下界或末地的海龟蛋不再孵化。
|;dev
|305145|具有发光等级元素的物品在GUI中不可见。
|305457|调试叠加层中，指向的液体始终显示为“empty”。
|305692|在连接到了专用服务器的客户端上，世界选项菜单不能正常显示或更新。
|305693|烧炼配方不会将正确数量的物品添加到输出中。
|305698|一些函数因“components not bound yet”加载失败。
|305732|专用服务器管理员可能会在使用世界选项屏幕时意外使得所有怪物消失。
|;prev
|305847|幼年马的隐藏式字幕未翻译。
|305850|“”禁用时，半透明的粒子后面的半透明方块和液体不可见。
|305886|未使用的声音事件。
}}</onlyinclude>

# 影片
由[slicedlime](slicedlime.md)製作的影片：

# 参考

# 导航

[de:26.1-snapshot-5](de:26.1-snapshot-5.md)
[en:Java Edition 26.1 Snapshot 5](en:Java Edition 26.1 Snapshot 5.md)
[es:Java Edition 26.1 Snapshot 5](es:Java Edition 26.1 Snapshot 5.md)
[fr:Édition Java 26.1 Snapshot 5](fr:Édition Java 26.1 Snapshot 5.md)
[it:Java Edition 26.1 Snapshot 5](it:Java Edition 26.1 Snapshot 5.md)
[ja:Java Edition 26.1 Snapshot 5](ja:Java Edition 26.1 Snapshot 5.md)
[lzh:爪哇版二六點一之快照五](lzh:爪哇版二六點一之快照五.md)
[pt:Edição Java 26.1 Snapshot 5](pt:Edição Java 26.1 Snapshot 5.md)
[ru:26.1 Snapshot 5 (Java Edition)](ru:26.1 Snapshot 5 (Java Edition).md)
[uk:26.1 Snapshot 5 (Java Edition)](uk:26.1 Snapshot 5 (Java Edition).md)