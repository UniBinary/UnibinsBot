# Java版标签/实体类型

*页面ID: 159746* | *来源: Minecraft Wiki*

* *实体类型标签（Entity Type Tags）**是[实体](实体.md)类型的组合。

# 使用
实体类型标签可以被[实体谓词](实体谓词.md)和[目标选择器](目标选择器.md)等调用以测试实体类型。只要实体类型在此标签内，测试就会成功。实体类型标签也控制了一些与特定实体相关的游戏行为，参考以下每个标签的介绍。

# 当前版本

# = accepts_iron_golem_gift =
* 会将[铁傀儡](铁傀儡.md)的赠礼戴到头上的实体。

# = aquatic =
* 被视为[水生生物](水生生物.md)的实体。

# = arrows =
* 用于进度。

# = arthropod =
* 被视为[节肢生物](节肢生物.md)的实体。

# = axolotl_always_hostiles =
* [美西螈](美西螈.md)总是对这些实体保持敌对。

# = axolotl_hunt_targets =
* 美西螈会在有冷却时间的情况下“猎杀”这些实体。

# = beehive_inhabitors =
* 这些实体可以进入[蜂箱](蜂箱.md)。

# = boat =
* 用于进度。

# = burn_in_daylight =
* 会在阳光下着火的实体。

# = can_breathe_under_water =
* 拥有该标签的生物不会溺水。

# = can_equip_harness =
* 可装备[挽具](挽具.md)的实体。

# = can_equip_saddle =
* 可装备[鞍](鞍.md)的实体。

# = can_float_while_ridden =
* 控制生物被[骑乘](骑乘.md)时是否可在水上漂浮游泳而非下沉。

# = can_turn_in_boats =
* 拥有该标签的生物能在[船](船.md)中改变方向。

# = can_wear_horse_armor =
* 拥有该标签的生物会在其马类实体[物品栏](物品栏.md)中显示马铠槽位。

# = can_wear_nautilus_armor =
* 可装备[鹦鹉螺铠](鹦鹉螺铠.md)的实体。

# = candidate_for_iron_golem_gift =
* 会被[铁傀儡](铁傀儡.md)赠予[虞美人](虞美人.md)的实体。

# = cannot_be_age_locked =

* 不可以被[金蒲公英](金蒲公英.md)停止生长的可成长生物。

# = cannot_be_pushed_onto_boats =
* 不会被推进船的实体。

# = deflects_projectiles =
* 拥有该标签的生物能反射[弹射物](弹射物.md)。

# = dismounts_underwater =
* 这些实体会在进入水中时强制其乘客离开。

# = fall_damage_immune =
* 这些实体不会受到[摔落伤害](摔落伤害.md)。

# = followable_friendly_mobs =
* 会被[小恶魂](小恶魂.md)跟随的非幼年实体。

# = freeze_hurts_extra_types =
* 拥有这个标签的实体在[细雪](细雪.md)中会受到额外伤害。

# = freeze_immune_entity_types =
* 拥有这个标签的实体免疫冰冻伤害。

# = frog_food =
* [青蛙](青蛙.md)会捕食这些实体，只有是生物的实体才有效。

# = ignores_poison_and_regen =
* 免疫[中毒](中毒.md)和[生命恢复](生命恢复.md)效果的实体。

# = illager =
* 被视为[灾厄村民](灾厄村民.md)的实体。

# = illager_friends =
* 被灾厄村民视为盟友的实体（不包括在其他队伍中的）。

# = immune_to_infested =
* 免疫[寄生](寄生.md)状态效果的实体。

# = immune_to_oozing =
* 免疫[渗浆](渗浆.md)状态效果的实体。

# = impact_projectiles =
* 用来决定哪些实体可以破坏紫颂花和饰纹陶罐。
* 实体可以从这个标签中移除，若添加其他实体，则只有[标靶](标靶.md)可以响应的实体才有效。

# = inverted_healing_and_harm =
* [瞬间治疗](瞬间治疗.md)和[瞬间伤害](瞬间伤害.md)会对其产生相反效果的实体。

# = nautilus_hostiles =
* 未驯服的[鹦鹉螺](鹦鹉螺.md)和[僵尸鹦鹉螺](僵尸鹦鹉螺.md)默认敌对的实体。

# = no_anger_from_wind_charge =
* 不会被[风弹](风弹（实体）.md)激怒的实体。

# = non_controlling_rider =
* 不能控制载具移动的实体。

# = not_scary_for_pufferfish =
* 不会使[河豚](河豚.md)膨胀的实体。

# = powder_snow_walkable_mobs =
* 拥有这个标签的实体可以在[细雪](细雪.md)顶部行走。

# = raiders =
* 决定敲钟时哪些实体获得[发光](发光.md)效果。
* 此标签中的实体在骑乘[劫掠兽](劫掠兽.md)时不会覆盖劫掠兽的AI。
* 用于进度。

# = redirectable_projectile =
* 能被玩家攻击和弹射物击中且会随玩家视角或弹射物方向偏转的弹射物实体。

# = sensitive_to_bane_of_arthropods =
* [节肢杀手](节肢杀手.md)魔咒会对其产生额外伤害的实体。

# = sensitive_to_impaling =
* [穿刺](穿刺.md)魔咒会对其产生额外伤害的实体。

# = sensitive_to_smite =
* [亡灵杀手](亡灵杀手.md)魔咒会对其产生额外伤害的实体。

# = skeletons =
* 苦力怕在被这些实体杀死时掉落[音乐唱片](音乐唱片.md)。

# = undead =
* 拥有这个标签的实体属于[亡灵生物](亡灵生物.md)。

# = wither_friends =
* 不被[凋灵](凋灵.md)视为目标，也不会对凋灵造成伤害的实体。

# = zombies =
* 拥有这个标签的实体属于[僵尸](僵尸.md)类生物。

# 已移除的标签
# = axolotl_tempted_hostiles =
* 已被标签取代。

添加于：[20w51a](20w51a.md)。移除于：[21w13a](21w13a.md)。

# = deflects_arrows =
* 已被标签取代。

添加于：[23w45a](23w45a.md)。移除于：[24w03a](24w03a.md)。

# = deflects_tridents =
* 已被标签取代。

添加于：[23w45a](23w45a.md)。移除于：[24w03a](24w03a.md)。

# 历史

|。}}
|。}}
|。}}
|。}}
|。}}
|。}}
|里加入了发光鱿鱼。}}
|里加入了狐狸。}}
|。
|将替换为。}}
|中加入了蝌蚪。}}
|。}}
|。}}
|。}}
|。}}
|。
|向中加入了骷髅马。}}
|和。}}
|和。}}
|合并为。}}
|。}}
|加入了。}}
|。}}
|。}}
|。}}
|，取而代之的是也表示可被弹射物偏转的弹射物。}}
|”[实验性内容](实验性内容.md)中的所有标签变更移入游戏中。 }}
|目录重命名为。}}
|。}}
|。}}
|。}}
|。}}
|中移除了。}}
|。}}
|。
|向中加入了焦骸。
|向中加入了僵尸鹦鹉螺、僵尸马和骆驼尸壳。
|向中加入了鹦鹉螺、僵尸鹦鹉螺、僵尸马和骆驼尸壳。}}
|。}}
|中移除了骆驼尸壳和疣猪兽。}}
}}

# 导航

[Category:数据包](Category:数据包.md)

[en:Entity type tag (Java Edition)](en:Entity type tag (Java Edition).md)
[fr:Tag de type d'entité (Édition Java)](fr:Tag de type d'entité (Édition Java).md)
[uk:Теґ типів сутности (Java Edition)](uk:Теґ типів сутности (Java Edition).md)