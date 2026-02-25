# Java版26.1-snapshot-6

*页面ID: 184866* | *来源: Minecraft Wiki*

<onlyinclude>

* *26.1-snapshot-6**是[Java版26.1](Java版26.1.md)的第6个快照，发布于2026年2月3日<ref></ref>，更改了更多幼年生物的模型，对存档格式进行了重大更改，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了方块标签：
* * <code>#mud</code>：泥巴和沾泥的红树根
* * <code>#moss_blocks</code>：苔藓块和苍白苔藓块
* * <code>#grass_blocks</code>：草方块、菌丝体和灰化土
* * <code>#substrate_overworld</code>：<code>#dirt</code>、<code>#mud</code>、<code>#moss_blocks</code>和<code>#grass_blocks</code>
* ** 用于集合世界生成条件，取代了先前的<code>#dirt</code>标签。
* * <code>#beneath_tree_podzol_replaceable</code>
* ** 定义树木下方可被灰化土替代的方块。
* * <code>#beneath_bamboo_podzol_replaceable</code>
* ** 定义[竹子地物](竹子（地物）.md)下方可被灰化土替代的方块。
* * <code>#cannot_replace_below_tree_trunk</code>：<code>#dirt</code>、<code>#mud</code>、<code>#moss_blocks</code>和灰化土
* * <code>#forest_rock_can_place_on</code>
* ** 定义哪些方块之上可放置[生苔的巨石](生苔的巨石.md)。
* * <code>#huge_brown_mushroom_can_place_on</code>
* ** 定义哪些方块之上可放置[巨型棕色蘑菇](巨型棕色蘑菇.md)。
* * <code>#huge_red_mushroom_can_place_on</code>
* ** 定义哪些方块之上可放置巨型红色蘑菇。
* * <code>#ice_spike_replaceable</code>
* ** 定义[冰刺](冰刺.md)可替换哪些方块。
* 加入了物品标签：
* * <code>#mud</code>
* ** 与方块标签对应。
* * <code>#moss_blocks</code>
* ** 与方块标签对应。
* * <code>#grass_blocks</code>
* ** 与方块标签对应。

# 更改
# = 方块 =
* *[金蒲公英](金蒲公英.md)**
* 现在可以对[蝌蚪](蝌蚪.md)使用。
* 不再可以对已驯服的幼年骷髅马和僵尸马使用。

# = 生物 =
* *[蜜蜂](蜜蜂.md)、[狐狸](狐狸.md)、[山羊](山羊.md)、[骆驼](骆驼.md)、[犰狳](犰狳.md)、[北极熊](北极熊.md)、[羊驼](羊驼.md)和[商駝](商駝.md)**
* 更改了幼年个体的纹理和模型。
* 幼年骆驼身上的[鞍](鞍.md)现在不再渲染。

* *[美西螈](美西螈.md)**
* 为幼年美西螈加入了装死的动画。

* *[骆驼尸壳](骆驼尸壳.md)**
* 移除了未使用的幼年个体。

* *[鸡](鸡.md)**
* 将幼年鸡的翅膀回退为单层纹理。

# = 游戏内容 =
* *用户界面**
* 需要升级存档格式的世界现在会显示“”而不是“”，且世界升级前“”和“”按钮会被禁用。
* 加入了展示升级进度的屏幕，会在升级世界时显示。
* 在此版本中升级世界时将强制进行备份。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>99.0</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>80.0</code>。

* *[存档格式](Java版存档格式.md)**
* 所有的维度现在存储在维度子文件夹中。
* * 主世界的数据现在移动到。
* ** 这包括区块、实体和兴趣点文件夹，以及位于中的相关文件。
* * 下界的数据从移动到。
* * 末地的数据从移动到。
* * 根目录的文件夹现在只用于存储和维度无关的数据，而不是和主世界的数据共享。
* 玩家存储移动到子目录中。
* *  →
* *  →
* *  →
* 世界指定资源包（）移动到子目录中。
* 数据存储的数据文件夹现在带命名空间了。
* * 这意味着所有的此类数据现在会存储在文件夹下的命名空间子文件夹下。
* ** 所有原版游戏的文件都按此规则移动。
* ** 例如： → 。
* * 命令存储现在使用命名空间子文件夹而不是命名空间后缀。
* ** 例如： → 。
* * 被重命名为。
* * 地图数据现在存储在子文件夹中。
* ** 地图索引文件被重命名为数字。
* *** 例如： → 。
* ** 被重命名为。
* * 没有特例了。
* ** 末地现在也使用。
* * 结构方块存储的结构从移动到。

* *[存档基础数据存储格式](存档基础数据存储格式.md)**
* 标签被取代，以引用玩家数据文件。
* 与难度相关的设置移动到标签中。
* * 被重命名为。
* * 现在使用字符串而不是整型。
* ** 允许值：
* *** <code>peaceful</code>
* *** <code>easy</code>
* *** <code>normal</code>
* *** <code>hard</code>
* * 被重命名为。
* 末影龙战斗数据被移出到文件夹中。
* * 它现在位于。
* * 末影龙战斗现在也可以在其他维度启动，参见下方的维度类型章节。
* * 数据更改：
* ** 被重命名为。
* ** 被重命名为。
* ** 被重命名为。
* ** 被替换为。
* *** 允许值：
* **** <code>start</code>
* **** <code>preparing_to_summon_pillars</code>
* **** <code>summoning_pillars</code>
* **** <code>summoning_dragon</code>
* **** <code>end</code>
* ** 被重命名为。
* ** 被重命名为。
* ** 被重命名为。
* ** 加入了，表示自重生阶段开始后已经经过的时间。
* ** 加入了：一个UUID的列表，表示触发重生的末地水晶。
* 流浪商人数据被移出到文件夹中。
* * 它现在位于。
* * 数据更改：
* ** 移除了。
* ** 被重命名为。
* ** 被重命名为。
* <code>CustomBossEvents</code>被移出到文件夹中。
* * 它现在位于。
* 与天气相关的数据被移出到文件夹中。
* * 它现在位于。
* * 数据更改：
* ** 被重命名为。
* ** 被重命名为rain_time。
* ** 被重命名为。
* 被移出到文件夹中。
* * 它现在位于。
* * 数据更改：
* ** 被重命名为。
* ** 被重命名为。
* ** 被重命名为。
* *** 被重命名为。
* *** 被重命名为。
* 被移出到文件夹中。
* * 它现在位于。
* 被移出到文件夹中。
* * 它现在位于。
* * 数据更改：
* ** 被重命名为。
* 被移出到文件夹中。
* * 它现在位于。

* *[已配置的地物](已配置的地物.md)**
* 基于测试的方块状态提供器的<code>fallback</code>字段现在可选且可以为空。
* * 在这种情况下如果调用了空的<code>fallback</code>，则地物将不放置任何东西。
* * 此前只有<code>disk</code>地物类型的<code>state_provider</code>使用了基于测试的方块状态提供器。
* <code>forest_rock</code>地物类型被重命名为<code>block_blob</code>。
* <code>block_blob</code>地物类型的配置现在支持下列参数：
* * <code>state</code>：岩石的组成方块。
* * <code>can_place_on</code>：方块谓词，定义岩石的方块可放置在哪里。
* <code>ice_spike</code>地物类型被重命名为<code>spike</code>。
* <code>spike</code>地物类型的配置现在支持下列参数：
* * <code>state</code>：冰刺的组成方块。
* * <code>can_place_on</code>：方块谓词，定义冰刺的方块可放置在哪里。
* * <code>can_replace</code>：方块谓词，定义冰刺的方块可替换的方块。
* <code>huge_red_mushroom</code>和<code>huge_brown_mushroom</code>地物类型的配置现在有了一个新参数：
* * <code>can_place_on</code>：方块谓词，定义巨型蘑菇可放置在哪里。
* <code>alter_ground</code>树木装饰器的<code>provider</code>现在是基于测试的方块状态提供器。
* <code>tree</code>地物类型的配置将<code>force_dirt</code>和<code>dirt_provider</code>替换为单一的基于测试的方块状态提供器<code>below_trunk_provider</code>。
* * 格式：
* ** <code>fallback</code>：可选的方块状态提供器。
* ** <code>rules</code>：一个规则的列表。
* *** <code>if_true</code>：方块谓词，检查要放置方块前的方块坐标。
* *** <code>then</code>：一个方块状态提供器。
* * 默认值：<syntaxhighlight lang="json">
"below_trunk_provider": {
    "rules": [
        {
            "if_true": {
                "type": "minecraft:not",
                "predicate": {
                    "type": "minecraft:matching_block_tag",
                    "tag": "minecraft:cannot_replace_below_tree_trunk"
                }
            },
            "then": {
                "type": "minecraft:simple_state_provider",
                "state": {
                    "Name": "minecraft:dirt"
                }
            }
        }
    ]
}</syntaxhighlight>
* * 此前使用过<code>force_dirt</code>的树木现在都具有<code>below_trunk_provider</code>，且始终是泥土。

* *[维度类型](维度类型.md)**
* 加入了<code>has_ender_dragon_fight</code>：布尔值，控制此维度是否有末影龙战斗。

* *[标签](Java版标签.md)**
* 拆分了方块标签和物品标签<code>#dirt</code>，现在仅包含[泥土](泥土.md)、[砂土](砂土.md)和[缠根泥土](缠根泥土.md)。
* * 因而向先前包含的方块标签中补充了。
* * 将方块标签中的枚举值替换为其所属方块标签。
* * 将方块标签中的值替换为。
* 向方块标签中加入了和[移动的活塞](移动的活塞.md)。
* 向实体类型标签中加入了[僵尸马](僵尸马.md)、[骷髅马](骷髅马.md)和[村民](村民.md)。

* *[着色器](着色器.md)和后处理管线**
* 着色器<code>core/rendertype_item_entity_translucent_cull</code>被移除，由<code>core/entity</code>取代。
* 着色器<code>core/rendertype_entity_alpha</code>和<code>core/rendertype_entity_decal</code>被移除，改为<code>core/entity</code>实现的<code>DISSOLVE</code>标志。<!--原文语序很怪-->
* UI和世界中的物品渲染现在由<code>core/entity</code>拆分到新着色器<code>core/item</code>。

# 修复
对极小的负数输出正数结果。
|264187|光照限制设置为不包含15的区间的刷怪笼不会在夜晚露天生成生物。
|273228|使用自定义世界生成数据包生成水湖时，游戏崩溃。
|303403|悬挂式告示牌方块展示实体渲染成黑色，且在其他方块和生物前面渲染。
|305580|幼年的僵尸马、骷髅马和骆驼尸壳可以生长为成年的，和其他幼年亡灵生物不同。
|306123|狼在和平难度下仍然尝试攻击玩家。
|;dev
|305598|音效（愤怒变种的幼年狼音效）突然结束。
|305813|加载天数很大的存档时，游戏因为整数溢出而崩溃。
|305887|幼年马的进食音效的音调明显太低。
|305923|气泡柱会使得与其重合的含水方块消失。
|;prev
|305988|金蒲公英不能喂给蝌蚪。
|306022|金蒲公英对驯服的幼年骷髅马和僵尸马有效。
|306035|“”进度不再被授予。
|306057|将幼年美西螈装进桶中时，NBT标签不会被保存。
}}</onlyinclude>

# 影片
由[slicedlime](slicedlime.md)製作的影片：

# 参考

# 导航

[en:Java Edition 26.1 Snapshot 6](en:Java Edition 26.1 Snapshot 6.md)
[es:Java Edition 26.1 Snapshot 6](es:Java Edition 26.1 Snapshot 6.md)
[fr:Édition Java 26.1 Snapshot 6](fr:Édition Java 26.1 Snapshot 6.md)
[ja:Java Edition 26.1 Snapshot 6](ja:Java Edition 26.1 Snapshot 6.md)
[lzh:爪哇版二六點一之快照六](lzh:爪哇版二六點一之快照六.md)
[pt:Edição Java 26.1 Snapshot 6](pt:Edição Java 26.1 Snapshot 6.md)
[ru:26.1 Snapshot 6 (Java Edition)](ru:26.1 Snapshot 6 (Java Edition).md)
[uk:26.1 Snapshot 6 (Java Edition)](uk:26.1 Snapshot 6 (Java Edition).md)