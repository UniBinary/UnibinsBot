# Java版25w05a

*页面ID: 144016* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w05a**是[Java版1.21.5](Java版1.21.5.md)的第4个快照，发布于2025年1月28日<ref></ref>，加入了[牛](牛.md)的新变种、[灌木丛](灌木丛.md)和[萤火虫灌木丛](萤火虫灌木丛.md)，丰富了[沙漠](沙漠.md)和[恶地](恶地.md)的环境音效，更改了信标的渲染距离，并修复了一些漏洞。

# 新内容
# = 方块 =
* *[萤火虫灌木丛](萤火虫灌木丛.md)**
* 会在[沼泽](沼泽.md)和[水源](水源.md)附近自然生成。
* 在[内部天空光照](内部天空光照.md)≤13时，每刻发光的萤火虫粒子有70%的概率会在萤火虫灌木丛附近生成。
* 对其[骨粉](骨粉.md)会生成另一个萤火虫灌木丛物品。
* 发出等级为2的[光照](光照.md)。
* 可用于[堆肥](堆肥.md)，有30%的概率使堆肥层数增加一层。
* 能放置于具有<code>#dirt</code>标签的方块或[耕地](耕地.md)上。

* *[灌木丛](灌木丛.md)**
* 一种新的装饰性方块。会在以下生物群系以斑块形式生成：
* *
* *
* *
* *
* *
* *
* *
* *
* *
* 可用于[堆肥](堆肥.md)，有30%的概率使堆肥层数增加一层。
* 对其[骨粉](骨粉.md)会在附近可生成位置生成新灌木丛。
* 能放置于具有<code>#dirt</code>标签的方块或耕地上。

# = 生物 =
* *[牛](牛.md)**
* 加入了牛的变种：热带牛和寒带牛。
* * 原本的牛即为温带牛变种。
* * 更新了温带牛的纹理和模型。
* ** 现在有鼻子了。
* ** 现在它的腿是镜像的。
* * 繁殖出的牛的变种从其父母的变种中随机选择。

# = 游戏内容 =
* *[粒子](粒子.md)**
* 加入了<code>firefly</code>粒子。

# = 常规 =
* *[数据包](数据包.md)**
* 加入了子文件夹，以按[牛变种定义格式](牛变种定义格式.md)添加牛变种。

* *[注册表](注册表.md)**
* 加入了<code>COW_VARIANT</code>可写注册表。

* *[物品堆叠组件](物品堆叠组件.md)**
* 加入了<code>cow/variant</code>组件，以设置牛的变种。
* 在<code>blocks_attacks</code>组件中：
* * 加入了可选的字段，为一个伤害类型标签。指定时，这些伤害类型将无视抵挡。
* * 向列表中的对象加入了新可选字段（，默认为<code>90</code>），表示能够有效阻挡攻击时玩家的朝向与到来的攻击之间的最大角度。

* *[标签](Java版标签.md)**
* 加入了方块标签：。
* * 会播放沙漠方块环境音效的方块。

# 更改
# = 方块 =
* *[信标](信标.md)**
* 信标及其光柱的渲染距离现在可以超过16个区块，直到客户端设置的渲染距离。
* * 相机离光柱越远，光柱将渲染得越厚，以使在远处也能发现光柱。
* * 信标光柱的最大渲染高度也从1024格提升到了2048格。

* *[沙子](沙子.md)、[红沙](红沙.md)和所有[陶瓦](陶瓦.md)**
* 现在当任意三个方向上八格外也存在上述方块时会发出[环境音效](环境音效.md)。
* * <code>block.sand.idle</code>会在所有生物群系中播放；在[沙漠](沙漠.md)和[恶地](恶地.md)中，还可能播放<code>block.sand.wind</code>。

* *[枯萎的灌木](枯萎的灌木.md)**
* 现在当下方两格均为沙子、红沙或陶瓦时会发出环境音效。

* *[细雪](细雪.md)**
* 穿着[皮革靴子](皮革靴子.md)摔落到其上的实体，如果摔落高度大于2.5格，则会穿过细雪而不被其接住。

# = 世界生成 =
* *[甘蔗斑块](随机斑块.md)**
* 不再在[深暗之域](深暗之域.md)、[溶洞](溶洞.md)、[雪林](雪林.md)和[积雪山坡](积雪山坡.md)中自然生成。

# = 命令格式 =
* *[文本组件](文本组件.md)**
* 现在、和中的文本组件会以<code>@s</code>为执行者[解析](文本组件#组件解析.md)。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[袭击存储格式](袭击存储格式.md)**
* 重命名以下字段：
* * <code>Raids</code>→<code>raids</code>
* * <code>Tick</code>→<code>tick</code>
* * <code>NextAvailableID</code>→<code>next_id</code>
* * <code>Id</code>→<code>id</code>
* * <code>Started</code>→<code>started</code>
* * <code>Active</code>→<code>active</code>
* * <code>TicksActive</code>→<code>ticks_active</code>
* * <code>BadOmenLevel</code>→<code>raid_omen_level</code>
* * <code>GroupsSpawned</code>→<code>groups_spawned</code>
* * <code>PreRaidTicks</code>→<code>cooldown_ticks</code>
* * <code>PostRaidTicks</code>→<code>post_raid_ticks</code>
* * <code>HeroesOfTheVillage</code>→<code>heroes_of_the_village</code>
* * <code>TotalHealth</code>→<code>total_health</code>
* * <code>NumGroups</code>→<code>group_count</code>
* * <code>Status</code>→<code>status</code>
* 将袭击中心坐标、、合并为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 将温带猪纹理重命名为。
* 将温带牛纹理重命名为，并更改了纹理尺寸。
* 更改了红色和棕色哞菇的纹理尺寸。

* *[配方](配方.md)**
* 类型转化配方现在不再在输入与输出物品具有相同ID但不完全相同时不生效。

* *[标签](Java版标签.md)**
* 将伤害类型标签命名回了。

# 修复
</code>选择。
|165711|末影之眼碰撞箱总延迟到动画后。
|279390|幼年僵尸猪灵的-{}-头盔穿模。
|;1.21.4的漏洞
|279857|召唤的猪灵不会拾取金质物品。
|;dev
|279257|如果结果物品与输入物品具有相同ID，则<code>crafting_transmute</code>配方没有输出。
|279280|<code>windswept_hills</code>同时处于热带和寒带变种家畜生物群系标签中。
|279315|热带猪不在风袭热带草原上生成。
|279353|<code>minecraft:fall_damage_multiplier</code>属性不在骑乘某些可骑乘生物时生效。
|279497|大小达到最大整型长度的结构预览轮廓损坏。
|279531|游戏测试入口点不产生未能生成结构的报告。
|279534|展示实体使用插值时长值表示传送时长。
|279543|条件敌对生物在某些情况下受击不会反击攻击它的玩家。
|279556|命令不能选择某些命令可以选择的实体。
|279577|基于方块的结构中仅限存在1组测试方块。
|;prev
|279684|盾牌抵挡动画不再在抵挡攻击时播放。
|279685|盾牌抵挡攻击不再损耗耐久。
|279688|开始用鞘翅飞行会取消疾跑。
|279692|乐器组件导致游戏崩溃。
|279693|生成的滞留药水被渲染为喷溅药水。
|279697|羊驼显示不可交互的鞍槽位。
|279698|<code>provides_banner_pattern</code>组件不接受<code>#</code>前缀。
|279760|在<code>provides_trim_material</code>组件中输入内联定义导致游戏崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:25w05a](de:25w05a.md)
[en:Java Edition 25w05a](en:Java Edition 25w05a.md)
[es:Java Edition 25w05a](es:Java Edition 25w05a.md)
[fr:Édition Java 25w05a](fr:Édition Java 25w05a.md)
[ja:Java Edition 25w05a](ja:Java Edition 25w05a.md)
[ko:Java Edition 25w05a](ko:Java Edition 25w05a.md)
[pt:Edição Java 25w05a](pt:Edição Java 25w05a.md)
[ru:25w05a (Java Edition)](ru:25w05a (Java Edition).md)
[uk:25w05a (Java Edition)](uk:25w05a (Java Edition).md)