# Java版25w44a

*页面ID: 169444* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w44a**是[Java版1.21.11](Java版1.21.11.md)的第4个快照，发布于2025年10月28日<ref></ref>，加入了新生物[焦骸](焦骸.md)和[骆驼尸壳](骆驼尸壳.md)，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 加入了焦骸刷怪蛋和骆驼尸壳刷怪蛋。

# = 生物 =
* *[焦骸](焦骸.md)**
* 新的骷髅变种。
* 在沙漠生物群系中亮度为0的地方代替部分骷髅生成。
* 不会在阳光下燃烧。
* 会射出虚弱之箭。
* 和沼骸类似，射箭的频率比普通骷髅慢。
* 和尸壳类似，不会生成在洞穴中。

* *[骆驼尸壳](骆驼尸壳.md)**
* 新的亡灵生物。
* 在沙漠生物群系中亮度为0的地方生成。
* 不会在阳光下燃烧。
* 生成时，会有两个乘客：一个手持矛的尸壳和一个焦骸。
* 和尸壳类似，不会生成在洞穴中。
* 只有在乘客对玩家敌对时才会对玩家敌对。
* 会和其他敌对生物一样自然消失，但被玩家骑乘时不会。
* 可以用兔子脚吸引和喂食。
* 无法繁殖。
* 成年骆驼尸壳可装备[鞍](鞍.md)，装备后可以骑乘。
* 骑乘时，行为和普通骆驼一致。

# = 常规 =
* *[选项](选项.md)**
* 在视频设置中加入了各向异性过滤选项。
* * 提升了从远处或从特定角度观察方块时的视觉效果。
* * 默认值取决于设备配置，如果硬件不支持则不会显示这个选项。
* * 可以为“关”“2x”“4x”或“8x”。
* * 会显著影响使用的显卡内存，特别是使用高Mipmap级别时。

* *用户界面**
* 向[创建新的世界](创建新的世界.md)的“自定义单一生物群系”界面和语言选择界面添加了搜索框。

* *[统计信息](统计信息.md)**
* 加入了统计信息<code>minecraft:nautilus_one_cm</code>（骑鹦鹉螺移动距离）。

* *[环境属性](环境属性.md)**
* 新增ARGB颜色修饰符：
* * <code>override</code>
* ** 参数类型：ARGB颜色。
* * <code>add</code>：按通道的加法混合。
* ** 参数类型：RGB颜色。
* * <code>subtract</code>：按通道的减法混合。
* ** 参数类型：RGB颜色。
* * <code>multiply</code>：按通道的乘法混合。
* ** 参数类型：RGB颜色或ARGB颜色。
* ** 若指定，则A通道像其他颜色通道一样独立相乘。
* * <code>alpha_blend</code>：在图像编辑软件中可能出现的传统alpha混合。
* ** 参数类型：ARGB颜色。
* ** A通道为1时，表现为不混合的覆盖。
* 加入了下列环境属性：
* * <code>minecraft:visual/water_fog_start_distance</code>：水下迷雾开始产生影响的距离，以方块为单位。如果为负数，雾将以拥有密度开始，就像它从摄像机后面开始产生影响一样。
* ** 值类型：浮点数
* ** 默认值：-8.0
* ** 修饰符：浮点修饰符
* ** 可插值：是
* ** 在摄像机的位置解析
* * <code>minecraft:visual/fog_start_distance</code>：摄像机未在某些物质中时，迷雾开始产生影响的距离，以方块为单位。如果为负数，雾将以拥有密度开始，就像它从摄像机后面开始产生影响一样。注意：最终值会因为天气改变。
* ** 值类型：浮点数
* ** 默认值：0.0
* ** 修饰符：浮点修饰符
* ** 可插值：是
* ** 在摄像机的位置解析
* * <code>minecraft:visual/fog_end_distance</code>：摄像机未在某些物质中时，雾达到最大密度时与相机的距离，以方块为单位。
* ** 值类型：非负浮点数
* ** 默认值：1024.0
* ** 修饰符：浮点修饰符
* ** 可插值：是
* ** 在摄像机的位置解析
* * <code>minecraft:visual/sky_fog_end_distance</code>：摄像机未在某些物质中时，影响天空的雾达到最大密度时与相机的距离，以方块为单位。
* ** 值类型：非负浮点数
* ** 默认值：512.0
* ** 修饰符：浮点修饰符
* ** 可插值：是
* ** 在摄像机的位置解析
* * <code>minecraft:visual/cloud_fog_end_distance</code>：摄像机未在某些物质中时，影响云的雾达到最大密度时与相机的距离，以方块为单位。
* ** 值类型：非负浮点数
* ** 默认值：2048.0
* ** 修饰符：浮点修饰符
* ** 可插值：是
* ** 在摄像机的位置解析
* * <code>minecraft:visual/cloud_color</code>：云的颜色。如果完全透明，云将完全禁用，且快乐恶魂在云层高度时也不会恢复生命。
* ** 值类型：ARGB颜色
* ** 默认值：<code>#00000000</code>
* ** 修饰符：ARGB颜色修饰符
* ** 可插值：是
* ** 在摄像机的位置或快乐恶魂的位置解析

* *[槽位源](槽位源.md)**
* 加入了槽位源，允许数据包指定任何槽位位置。
* * 格式如下：
* ** <code>type</code>：槽位源类型
* ** 剩余字段与槽位源相关。
* <code>minecraft:empty</code>
* * 不选择任何槽位。
* <code>minecraft:group</code>
* * 将多个槽位源合并到一个，生成的可选择结果包含所有提供的槽位源。
* ** 如果槽位源的槽位重复，则重复此槽位。
* ** 例如：<code>[a, b] + [c, a]</code> -> <code>[a, b, c, a]</code>
* * 格式：
* ** <code>terms</code>：槽位源的。
* * 可以作为槽位源的内联格式。
* <code>minecraft:slot_range</code>
* * 从实体或方块实体的槽位范围里选择槽位。
* * 镜像参数<code>from</code>的行为。
* * 格式：
* ** <code>source</code>：作为来源的实体或方块实体，从战利品上下文获取。
* *** 取值可以为<code>block_entity</code>、<code>this</code>、<code>attacking_entity</code>、<code>last_damage_player</code>、<code>direct_attacker</code>、<code>target_entity</code>或<code>interacting_entity</code>。
* ** <code>slots</code>：槽位范围，格式为<code>-{}-<*槽位类型*></code>或<code>-{}-<*槽位类型*>.<*槽位编号*></code>，例如<code>armor.chest</code>和<code>container.*</code>。
* <code>minecraft:contents</code>
* * 从一个或多个物品栏组件中选择所有非空槽位。
* ** 如果这些组件没有任何物品，则可选择结果为空。
* * 物品栏组件的物品位置来源于另一个槽位源。
* ** 如果物品来源于多个组件，则可选择结果将合并，类似于<code>minecraft:group</code>。
* ** 例如：<code>Bundle [a, b] + Shulker Box [c, d]</code> -> <code>[a, b, c, d]</code>
* * 格式：
* ** <code>component</code>：物品栏组件。
* *** 取值可以为<code>minecraft:bundle_contents</code>、<code>minecraft:charged_projectiles</code>或<code>minecraft:container</code>。
* ** <code>slot_source</code>：槽位源，包含目标物品的槽位。
* <code>minecraft:filtered</code>
* * 对目标槽位进行过滤，排除所有测试失败的槽位。
* * 格式：
* ** <code>item_filter</code>：测试每个槽位的物品谓词。
* ** <code>slot_source</code>：要进行过滤的槽位源。
* <code>minecraft:limit_slots</code>
* * 限制槽位的数量，生成的可选择结果最多包含这些数量个槽位。
* ** 任何在限制数量之外的槽位都将被排除，按提供顺序排列。
* ** 例如：<code>[a, b, c, d]</code> -> <code>[a, b, c]</code>，如果限制数量为3。
* * 对目标槽位进行过滤，排除所有测试失败的槽位。
* * 格式：
* ** <code>limit</code>：可选择结果的最大槽位数量。
* ** <code>slot_source</code>：要进行过滤的槽位源。
* 以下为示例槽位源，从实体的快捷栏和盔甲栏选择每个包含超过16个物品堆叠的槽位：<syntaxhighlight lang="json">
{
    "type": "minecraft:filtered",
    "item_filter": {
        "count": {
            "min": 16
        }
    },
    "slot_source": [
        {
            "type": "minecraft:slot_range",
            "source": "this",
            "slots": "hotbar.*"
        },
        {
            "type": "minecraft:slot_range",
            "source": "this",
            "slots": "armor.*"
        }
    ]
}</syntaxhighlight>

* *[战利品表](战利品表.md)**
* 加入了战利品抽取项<code>minecraft:slots</code>。
* * 将从所选槽位中的物品提供给战利品表。
* * 格式：
* ** <code>slot_source</code>：描述物品所在位置的槽位源。
* ** 所有单一抽取项字段。
* 移除了战利品抽取项<code>dynamic</code>的接受值<code>contents</code>。
* * 它提供潜影盒内容物的行为由于<code>slots</code>抽取项的加入而变得多余，现在可以使用槽位源<code>slot_range</code>进行复制。

* *[标签](Java版标签.md)**
* 加入了物品标签<code>#camel_husk_food</code>，控制骆驼尸壳可以食用的物品。
* 加入了实体类型标签<code>#can_float_while_ridden</code>，控制生物被骑乘时是否可在水上漂浮游泳而非下沉。

* *性能**
* 在OSX上增加了对KQueue的支持，以提高网络连接性能。

# 更改
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 更改了僵尸马刷怪蛋的纹理，以匹配僵尸马的新纹理。

# = 生物 =
* *[鹦鹉](鹦鹉.md)**
* 现在可以模仿僵尸鹦鹉螺、僵尸马、焦骸和骆驼尸壳的声音。

* *[鹦鹉螺](鹦鹉螺.md)和[僵尸鹦鹉螺](僵尸鹦鹉螺.md)**
* 现在会在被任何生物激怒时攻击该生物，而不仅仅是玩家。

* *[马](马.md)、[骡](骡.md)、[驴](驴.md)和[骆驼](骆驼.md)**
* 现在被玩家在水里骑乘时不再会下沉。

* *[蝙蝠](蝙蝠.md)**
* 现在在每年的10月20日至11月3日期间，不再会更频繁地生成，也不再会在亮度等级大于3、小于等于6的地方生成。

* *[尸壳](尸壳.md)**
* 现在骑乘在骆驼尸壳上的尸壳被杀死时会掉落0-1个[兔子脚](兔子脚.md)。

# = 非生物实体 =
* *[箭类弹射物](箭类弹射物.md)**
* 回退了25w41a的更改。<ref></ref>

# = 游戏内容 =
* *[魔咒](魔咒.md)**
* 现在[突进](突进.md)总是额外消耗1点耐久度。
* 减少了突进消耗的饥饿值和饱和度。
* * 现在I级消耗，II级消耗，III级消耗。

* *[进度](进度.md)**
* “[](进度#advancements-anchor-adventure.kill_a_mob.md)”“[](进度#advancements-anchor-adventure.throw_trident.md)”“[](进度#advancements-anchor-adventure.shoot_arrow.md)”和“[](进度#advancements-anchor-adventure.kill_mob_near_sculk_catalyst.md)”现在也可以通过击杀焦骸或骆驼尸壳来获取。
* “[](进度#advancements-anchor-adventure.kill_all_mobs.md)”现在还需要击杀焦骸和骆驼尸壳。

* *[迷雾](迷雾.md)**
* 下界迷雾不再随渲染距离变化，现在始终在10至96格方块之间渲染。

* *其他更改**
* 区块的渲染现在可以有淡入效果，而不是突然出现。淡入时间可以通过视频设置调整。

# = 命令格式 =
* ***
* 设置距离的参数<code>time</code>现在也可以设置为秒或游戏日，只需要添加<code>s</code>或<code>d</code>后缀。
* 设置警告时间的参数<code>time</code>现在单位默认为游戏刻，但也可以设置为秒或游戏日，只需要添加<code>s</code>或<code>d</code>后缀。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *[服务端管理协议](服务端管理协议.md)**
* 将服务端管理协议版本号更改为<code>2.0.0</code>。
* 在<code>typed_game_rule</code>和<code>untyped_game_rule</code>模式中，<code>value</code>字段现在接收字符串而不是整型或布尔值。
* * 同样，它现在使用资源路径作为键名。

* *[游戏规则](游戏规则.md)**
* 游戏规则现在已经移到注册表。这意味着所有驼峰式命名的游戏规则ID均已重命名为资源路径的下划线式的ID。
* 下列游戏规则被进一步重命名：
* * <code>announceAdvancements</code> -> <code>minecraft:show_advancement_messages</code>
* * <code>commandBlocksEnabled</code> -> <code>minecraft:command_blocks_work</code>
* * <code>command_modification_block_limit</code> -> <code>minecraft:max_block_modifications</code>
* * <code>disableElytraMovementCheck</code> -> <code>minecraft:elytra_movement_check</code>
* ** 在使用资源路径时此游戏规则的值的意义与之前相反。
* * <code>disablePlayerMovementCheck</code> -> <code>minecraft:player_movement_check</code>
* ** 在使用资源路径时此游戏规则的值的意义与之前相反。
* * <code>disableRaids</code> -> <code>minecraft:raids</code>
* ** 在使用资源路径时此游戏规则的值的意义与之前相反。
* * <code>doDaylightCycle</code> -> <code>minecraft:advance_time</code>
* * <code>doEntityDrops</code> -> <code>minecraft:entity_drops</code>
* * <code>doImmediateRespawn</code> -> <code>minecraft:immediate_respawn</code>
* * <code>doInsomnia</code> -> <code>minecraft:spawn_phantoms</code>
* * <code>doLimitedCrafting</code> -> <code>minecraft:limited_crafting</code>
* * <code>doMobLoot</code> -> <code>minecraft:mob_drops</code>
* * <code>doMobSpawning</code> -> <code>minecraft:spawn_mobs</code>
* * <code>doPatrolSpawning</code> -> <code>minecraft:spawn_patrols</code>
* * <code>doTileDrops</code> -> <code>minecraft:block_drops</code>
* * <code>doTraderSpawning</code> -> <code>minecraft:spawn_wandering_traders</code>
* * <code>doVinesSpread</code> -> <code>minecraft:spread_vines</code>
* * <code>doWardenSpawning</code> -> <code>minecraft:spawn_wardens</code>
* * <code>doWeatherCycle</code> -> <code>minecraft:advance_weather</code>
* * <code>maxCommandChainLength</code> -> <code>minecraft:max_command_sequence_length</code>
* * <code>maxCommandForkCount</code> -> <code>minecraft:max_command_forks</code>
* * <code>naturalRegeneration</code> -> <code>minecraft:natural_health_regeneration</code>
* * <code>snowAccumulationHeight</code> -> <code>minecraft:max_snow_accumulation_height</code>
* * <code>spawnRadius</code> -> <code>minecraft:respawn_radius</code>
* * <code>spawnerBlocksEnabled</code> -> <code>minecraft:spawner_blocks_work</code>
* 部分游戏规则之前没有值域限制，现在它们的值域如下：
* * <code>minecraft:max_block_modifications</code>：最小值：1
* * <code>minecraft:max_command_forks</code>：最小值：1
* * <code>minecraft:max_command_sequence_length</code>：最小值：0
* * <code>minecraft:max_entity_cramming</code>：最小值：1
* * <code>minecraft:max_snow_accumulation_height</code>：最小值：0；最大值：8
* * <code>minecraft:players_nether_portal_creative_delay</code>：最小值：0
* * <code>minecraft:players_nether_portal_default_delay</code>：最小值：0
* * <code>minecraft:players_sleeping_percentage</code>：最小值：0
* * <code>minecraft:random_tick_speed</code>：最小值：0
* * <code>minecraft:respawn_radius</code>：最小值：0
* 加入了游戏规则<code>fire_spread_radius_around_player</code>。
* * 控制玩家周围可以传播火的方块的最大距离。
* * 替代了游戏规则<code>doFireTick</code>和<code>allowFireTicksAwayFromPlayer</code>，且它们已经被移除。
* * 设置为0时将禁用火的传播。
* * 设置为-1时火的传播无视周围是否有玩家。
* * 值域：最小值：-1。

* *[测试环境定义格式](测试环境定义格式.md)**
* 测试环境定义<code>game_rules</code>的<code>bool_rule</code>和<code>int_rule</code>字段已被<code>rules</code>取代。
* * 新字段是一个<游戏规则资源路径> - <游戏规则值>的映射，值是布尔值还是整型取决于游戏规则值类型。

* *[环境属性](环境属性.md)**
* 重命名<code>minecraft:visual/water_fog_radius</code>为<code>minecraft:visual/water_fog_end_distance</code>。
* 移除了<code>minecraft:visual/extra_fog</code>。
* 重命名<code>minecraft:visual/cloud_opacity</code>为<code>minecraft:visual/cloud_color</code>。

* *[生物群系定义格式](生物群系定义格式.md)**
* 生物群系环境效果的下列字段现在接受字符串<code>#RRGGBB</code>和浮点数数组<code>[red, green, blue]</code>格式的颜色：
* * <code>water_color</code>
* * <code>foliage_color</code>
* * <code>dry_foliage_color</code>
* * <code>grass_color</code>

* *[标签](Java版标签.md)**
* 实体类型标签：
* * 向<code>#skeletons</code>中加入了焦骸。
* * 向<code>#zombies</code>中加入了僵尸鹦鹉螺、僵尸马和骆驼尸壳。
* * 向<code>#can_equip_saddle</code>中加入了鹦鹉螺、僵尸鹦鹉螺、僵尸马和骆驼尸壳。

* *[声音事件](Java版声音事件.md)**
* 移除了<code>item.underwater_saddle.equip</code>。

* *[着色器](着色器.md)和后处理管线**
* <code>block.vsh/fsh</code>复制<code>terrain.vsh/fsh</code>并临时处理方块，例如实体持有的方块。
* 加入了uniform<code>ChunkSection</code>，被<code>terrain.vsh</code>使用，替代了<code>DynamicTransforms</code>。
* <code>Globals</code>uniform现在拥有了摄像机坐标。
* 引入了新的着色器来处理依赖于GPU的精灵动画。
* * 加入了<code>animate_sprite*</code>核心着色器，使用新的uniform<code>SpriteAnimationInfo</code>。
* 精灵图动画
* * 纹理图集中的精灵图现在由GPU处理动画，此前由CPU每刻处理。
* * 对于常规的基于帧的动画，使用<code>animate_sprite.vsh</code>和<code>animate_sprite_blit.fsh</code>进行渲染。
* * 对于带插值的动画，使用<code>animate_sprite.vsh</code>和<code>animate_sprite_interpolate.fsh</code>进行渲染。
* * Uniform缓冲对象<code>SpriteAnimationInfo</code>现在包含更大的纹理图集中的精灵图应该被渲染何处的信息。

* *[选项](选项.md)**
* 视频设置中的“界面”栏被重命名为“偏好设置”。

* *[LWJGL](https://www.lwjgl.org/)**
* 回退了上个版本的更改。

# 修复
键不能按顺序选中资源包或数据包菜单中的元素。
|302325|在调试选项屏幕中使用调试组合键切换调试渲染器时，对应的选项没有更新。
|302338|在菜单中按时，“”按钮不会更新。
|302362|在主菜单中点击“单人游戏”或“多人游戏”后立即点击一个世界或服务器，会在没有点击游玩按钮的情况下进入此世界或服务器。
|302482|存在滚动条时，资源包和数据包的名称会溢出选择框。
|;dev
|302678|箭和三叉戟在玩家和生物上会卡住。
|303072|带有值大于等于1的标签的三叉戟击中生物或玩家时，游戏崩溃。
|303168|给鹦鹉螺装备鞍会使用字幕。
|303255|设为时，鹦鹉螺不能造成伤害。
|;prev
|303429|猪灵和疣猪兽在下界颤抖。
|303432|无法识别中文输入。
|303434|无法识别日文输入。
|303439|在第三人称视角下，从特定角度观察手持物品会出现奇怪的错误。
|303455|在Wayland上打开GUI或菜单时，光标不再居中。
|303460|在Wayland上，光标不会显示成系统设置的那样。
|303461|在Wayland上，游戏显示Wayland应用的默认图标而不是Minecraft的图标。
|303478|无法在使用了Nvidia显卡的Linux系统上启动25w43a。
|303485|游戏不再能保存自定义维度的区块。
|303504|以锐角角度观察时，下界苗的纹理仍会变大。
|303520|以锐角角度观察时，甜浆果丛的纹理仍会变大。
|303506|在Wayland上，组合键还会额外输入普通字母。
|303541|在Wayland上，游戏无法启动。
|303651|旋转的物品实体有时会产生视觉错误。
}}</onlyinclude>

# 参考

# 导航

[de:25w44a](de:25w44a.md)
[en:Java Edition 25w44a](en:Java Edition 25w44a.md)
[es:Java Edition 25w44a](es:Java Edition 25w44a.md)
[fr:Édition Java 25w44a](fr:Édition Java 25w44a.md)
[ja:Java Edition 25w44a](ja:Java Edition 25w44a.md)
[lzh:二五週四四甲](lzh:二五週四四甲.md)
[nl:25w44a](nl:25w44a.md)
[pt:Edição Java 25w44a](pt:Edição Java 25w44a.md)
[ru:25w44a (Java Edition)](ru:25w44a (Java Edition).md)