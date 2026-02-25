# Java版1.20.5-pre1

*页面ID: 118802* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.20.5-pre1**是[Java版1.20.5](Java版1.20.5.md)的首个预发布版，发布于2024年4月10日<ref></ref>，加入了4个新[进度](进度.md)，在内置实验性数据包中加入了1个新进度，更改了[试炼密室](试炼密室.md)的结构，并修复了一些漏洞。

# 新内容
# = 游戏内容 =
* *[进度](进度.md)**
* 加入了4个新进度。
* * [](进度#advancements-anchor-adventure.brush_armadillo.md)
* **
* * [](进度#advancements-anchor-husbandry.remove_wolf_armor.md)
* **
* * [](进度#advancements-anchor-husbandry.repair_wolf_armor.md)
* **
* * [](进度#advancements-anchor-husbandry.whole_pack.md)
* **

# = 常规 =
* *[语言](语言.md)**
* 加入了维奥沙语。

* *[自定义结构](自定义结构.md)**
* 为已配置的结构地物加入了新的地形调整方式<code>encapsulate</code>。
* * 结构每一部分周围的密度都会增加。
* * 适用于需要完全埋藏在地下的结构。

* *[战利品表函数](战利品表函数.md)**
* <code>modify_contents</code>：对容器类组件中的每个物品应用<code>modifier</code>中战利品表函数的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个[战利品表谓词](战利品表谓词.md)列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：目标组件，值可以为：。
  ** ：应用于目标组件中所有物品的战利品表函数。
</div>
  * 如果组件不存在，此函数不生效。
* <code>set_item</code>：不更改数量和组件即可替换物品堆叠类型的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：新物品ID。
</div>
* <code>filtered</code>：仅对符合物品谓词的物品应用<code>modifier</code>中战利品表函数的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：用于匹配物品的物品谓词。
  ** ：应用于物品的战利品表函数。
</div>
* <code>set_custom_model_data</code>：设置<code>custom_model_data</code>组件的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：一个整型数值提供器。
</div>

* *实体谓词**
* 在实体子谓词<code>equipment</code>中加入了<code>body</code>选项，以匹配实体铠甲槽中的物品。

* *[标签](Java版标签.md)**
* 加入了以下实体类型标签：
* * ：。
* ** 能被玩家击中且会随视角方向偏转的[弹射物](弹射物.md)。
* 加入了以下[魔咒](魔咒.md)标签：
* * ：。
* ** 控制在物品[提示框](提示框.md)中所显示魔咒的顺序。

# 更改
# = 方块 =
* *常规**
* 更改了在[刷怪笼](刷怪笼.md)方块实体数据<code>SpawnPotentials</code>中和[试炼刷怪笼](试炼刷怪笼.md)方块实体数据<code>spawn_potentials</code>中的可选字段<code>equipment_loot_table</code>。
* * 现在被重命名为<code>equipment</code>。
* *
<div class="treeview">
  :** ：一个用于生成装备的战利品表。
  :** ：（可选）为浮点型时，表示对所有槽位生效的掉落概率。为列表时，表示每个槽位装备的掉落概率列表。
  :*** ：一个装备槽位与指定掉落概率的键值对。
</div>
  :* 示例：<code>equipment: {loot_table: "minecraft:equipment/trial_chamber", slot_drop_chances: {"head": 0.0f, "chest": 0.25f, "legs": 1.0f, "feet": 0.25f}}</code>

# = 物品 =
* *[药水](药水.md)**
* 将不可合成的药水由品红色更改为蓝色。<ref></ref>
* 现在盘丝药水、渗浆药水和虫蚀药水只能由命令获取，酿造配方现在属于实验性内容。

# = 游戏内容 =
* *[状态效果](状态效果.md)**
* [盘丝](盘丝.md)
* * 现在生物死亡时会更稳定地生成2-3个[蜘蛛网](蜘蛛网.md)。
* ** 现在蜘蛛网可以替代具有标签的方块。
* ** 现在是否生成蜘蛛网受<code>mobGriefing</code>[游戏规则](游戏规则.md)影响。
* * 现在玩家也能受到穿过蜘蛛网的移速增益。
* ** 玩家和其他会被蜘蛛网减速的生物会以正常速度的50%而不是25%穿过蜘蛛网。
* [寄生](寄生.md)
* * 现在生成1-2个[蠹虫](蠹虫.md)的概率为10%而非5%。
* * 现在蠹虫生成在实体[边界箱](边界箱.md)中心，并会朝着受伤实体所面对的方向被抛出。
* [渗浆](渗浆.md)
* * 现在只会在实体周围5×5×5的区域生成[史莱姆](史莱姆.md)，直到达到[实体挤压上限](实体挤压上限.md)。
* [袭击之兆](袭击之兆.md)
* * 更改了图标。

* *[魔咒](魔咒.md)**
* 现在魔咒会按标签在[提示框](提示框.md)中排序。
* [风爆](风爆.md)魔咒不再能通过村民[交易](交易.md)、[战利品箱](战利品箱.md)和[钓鱼](钓鱼.md)获取。
* 风爆魔咒不再对非生物实体生效。
* 风爆魔咒不再在[剑](剑.md)、[镐](镐.md)、[斧](斧.md)、[锹](锹.md)、[锄](锄.md)、[三叉戟](三叉戟.md)和[重锤](重锤.md)以外的物品上生效。<ref></ref>

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>39</code>。

* *[战利品表函数](战利品表函数.md)**
* <code>set_contents</code>
* * 移除了未使用的字段。
* * 加入了必选字段，描述将加入物品的目标组件。
* ** 可选的值为，其中会忽略空堆叠。
* <code>set_custom_data</code>
* * 现在也接受SNBT字符串数据和不扁平标签。

* *[物品堆叠组件](物品堆叠组件.md)**
* 移除了组件中的项数上限。
* 现在若物品存在组件，则它的组件只能为1。
* * 现在尝试用命令获取同时存在这两种组件且大于1的物品时，会警告“Item cannot be damageable and stackable”（物品不能是既可受损也可堆叠的）。
* 移除了组件中的，并加入了字段作为替代。
* * 是所增加玩家[饱和度](饱和度.md)的精确值，而非所定义的<code>saturation = nutrition * saturation_modifier * 2</code>。

* *[粒子](粒子.md)**
* 现在，命令中的粒子选项，以及[区域效果云](区域效果云.md)中诸如<code>Particles</code>的字段的表示格式与中文件的[相应属性](自定义生物群系.md)一致（与生物群系环境粒子设置类似）。
* * 例如，命令变为了{{cmd|link=none|particle minecraft:dust{color:[1.0, 0.0, 0.0], scale:2.0} ...}}。
* * 没有额外选项的粒子（如<code>minecraft:villager</code>）的语法依旧不变。
* 对方块粒子（）选项做出了以下更改：
* * 将<code>value</code>字段重命名为<code>block_state</code>。
* ** 该<code>block_state</code>字段可接受一个普通方块ID，以表示某方块的默认[方块状态](方块状态.md)。
* *** 以下为旧格式到新格式的转换示例：
* *** <code>minecraft:block minecraft:redstone_lamp[lit=true]</code>变为<code>minecraft:block{block_state: {Name: "minecraft:redstone_lamp", Properties: {lit: "true"}}}</code>，<code>minecraft:block minecraft:diamond_block</code>变为<code>minecraft:block{block_state: "minecraft:diamond_block"}</code>。
* 对<code>minecraft:item</code>选项的更改：
* * 将<code>value</code>字段重命名为<code>item</code>。
* ** <code>item</code>字段可接受一个普通的物品ID，以表示某带有默认物品堆叠组件的物品堆叠。
* *** 如<code>minecraft:item minecraft:dirt</code>可转换为<code>minecraft:item{item: {id: "minecraft:dirt"}}</code>，<code>minecraft:item minecraft:dirt</code>可转换为<code>minecraft:item{item: "minecraft:dirt"}</code>。
* 对<code>dust_color_transition</code>选项的更改：
* * 将<code>fromColor</code>重命名为<code>from_color</code>。
* * 将<code>toColor</code>重命名为<code>to_color</code>。
* * 新旧格式转换示例：
* ** <code>dust_color_transition 1.0 0.0 0.0 0.5 0.0 1.0 0.5</code>变为<code>dust_color_transition{from_color: [1.0f, 0.0f, 0.0f], scale: 0.5f, to_color: [0.0f, 1.0f, 0.5f]}</code>
* 对<code>entity_effect</code>选项的更改：
* * 将<code>value</code>字段重命名为<code>color</code>。
* ** <code>color</code>现在也接受一个浮点数列表，以表示一个RGBA颜色。

* *[标签](Java版标签.md)**
* 移除了以下物品标签：
* *
* ** 与重合。

# 新内容（实验性）
# = 游戏内容 =
* *[进度](进度.md)**
* 加入了1个新进度。
* * [](进度#advancements-anchor-adventure.revaulting.md)
* **

# 更改（实验性）
# = 方块 =
* *[试炼刷怪笼](试炼刷怪笼.md)和[宝库](宝库.md)**
* 更改了纹理。

# = 物品 =
* *[重锤](重锤.md)**
* 现在可以打破[饰纹陶罐](饰纹陶罐.md)，使之掉落合成自身的物品。

# = 世界生成 =
* *[试炼密室](试炼密室.md)**
* 现在使用新的地形调整方式<code>encapsulate</code>，因此更常被地形掩埋。
* 加入了新的决斗室及其独有的附加结构。
* 移除了决斗室及其独有的附加结构。
* 加入了新的交叉口。
* 加入了新的发射器机关。
* * 放置于决斗室的墙面，取代了旧样式的发射器机关。
* * 放置于决斗室的地面。
* 为决斗室的附加结构添加了更多铜灯。
* 修复了柱廊中的各种拼图断连问题。

# = 游戏内容 =
* *[魔咒](魔咒.md)**
* 风爆魔咒不再能从[附魔台](附魔台.md)获取。
* 风爆魔咒现在需要使用重锤猛击才能生效。

* *[不祥试炼](不祥试炼.md)**
* 现在所生成生物携带的[装备](装备.md)可能附有[魔咒](魔咒.md)。
* * 盔甲魔咒包括[保护](保护.md)IV、[弹射物保护](弹射物保护.md)IV和[火焰保护](火焰保护.md)IV。
* * 武器魔咒包括[锋利](锋利.md)I、[击退](击退.md)I、[力量](力量（魔咒）.md)I和[冲击](冲击.md)I。
* 生物身上的装备不再在死亡时掉落。
* 现在玩家有50%概率被[不祥之物生成器](不祥之物生成器.md)选中。
* * 现在弹射物会更精准地生成在选中实体上方。

# = 常规 =
* *[标签](Java版标签.md)**
* 在实体类型标签中加入了。
* 在物品标签中加入了。
* 在魔咒标签的后加入了，在后加入了。

# 修复
。
|207353|如果攻击造成0伤害，则恶魂火球和风弹不能被近战反弹。
|263315|疣猪兽和僵尸疣猪兽的攻击目标不能被检测到。
|264456|被青蛙和美西螈选为目标的实体不能被检测到。
|265390|命令提供错误的输出。
|;1.20.4的漏洞
|268000|使用给予玩家一个头颅时，客户端崩溃。
|269496|在矿车或船中与旋风人战斗不会受到任何伤害。
|;dev
|267934|在发送<code>ClientboundTransferPacket</code>后断开连接只会踢出玩家。
|268346|在<code>generic.jump_strength</code>被设为0时跳跃会导致速度提升。
|268947|<code>minecraft:generic.gravity</code>属性增大时，不能稳定起飞。
|269191|旧的村民不能交易。
|269192|旋风人不受命令的影响。
|269266|由苦力怕爆炸生成的区域效果云粒子着色不正确。
|269320|含有超过100页的书升级后被截断。
|269357|涡流和旋风旗帜图案描述显示为原始翻译字符串。
|269366|重锤不像其他工具一样打破饰纹陶罐。
|269501|即使“”设置为“”，旁观模式快捷栏上方的文本也没有背景。
|269508|玩家被音波攻击后跳起或落地时保持垂直动量。
|269609|风弹可以伤害栖息于返回传送门顶端的末影龙，这与箭和三叉戟不同。
|269610|风弹能对生命值达到一半或更低的凋灵造成伤害。
|269680|将物品的<code>max_stack_size</code>更改至低于其当前堆叠数量后，游戏于尝试保存时崩溃。
|269707|酿造台槽位存在设定为64的最大堆叠数量。
|269765|如果使用重锤攻击一次后仍在摔落，则其伤害不会被重置。
|269933|<code>limit_count</code>物品修饰器能创造堆叠量溢出的物品。
|269947|使用重锤连点总共造成很高伤害。
|269948|<code>minecraft:event.mob_effect.raid_omen</code>音效事件字幕显示为原始翻译字符串。
|269949|“袭击之兆”效果新纹理基于Programmer Art中的唤魔者制作。
|269954|使用附魔风爆的重锤攻击非生物实体会将玩家向上推动，即使他（们）正在飞行。
|269955|在创造模式下飞行时，使用附魔风爆的重锤攻击末影龙将玩家向上推动，与攻击其他生物的行为不同。
|269959|加入世界时，控制台输出<code>Not a list</code>。
|269963|禁用实验性功能时，不祥之兆不会被移除。
|269974|带有盘丝状态效果的生物死亡时不能用蜘蛛网替代可被替换的方块。
|269976|风爆附魔书可由村民交易获取。
|269977|风爆魔咒可由附魔台获取。
|269980|风爆魔咒仅需普攻就能触发，而非需猛击。
|269993|使用附魔风爆的重锤攻击风弹造成非常高的上升动量。
|269999|不启用实验性功能时，盘丝、渗浆和虫蚀药水也能被获取。
|270001|粒子<code>minecraft:item minecraft:air</code>导致客户端崩溃。
|270004|给自己一个带有高于3级的风爆魔咒的物品，用它攻击某些实体会导致游戏崩溃。
|270005|下落一次可以使用重锤造成多次猛击。
|270048|宝库纹理不一致。
|270060|试炼刷怪笼的发光部分纹理不一致。
|270094|不启用实验性功能时，制箭师也会卖出新药箭。
|270099|即使禁用了<code>mobGriefing</code>，杀死一个带有盘丝效果的生物的行为也会放置蜘蛛网。
|270119|命令的内容槽不适用于射出的箭、三叉戟和火球。
|270125|风爆可由箱子和钓鱼战利品获取。
|270161|风爆魔咒在载具实体上明显更强。
|270201|在第三人称视角下，钓鱼竿渔线未处理<code>scale</code>属性。
|270236|区域效果云和滞留药水导致<code>potion_contents.custom_color</code>略微透明。
|;prev
|270412|在非实验性世界中，风弹物品造成崩溃。
|270475|容器组件<code>slot:-1</code>造成崩溃。
|270387|反弹恶魂火球时，风爆能将玩家向上发射。
}}</onlyinclude>

# 参考

# 导航

[de:1.20.5-pre1](de:1.20.5-pre1.md)
[en:Java Edition 1.20.5 Pre-Release 1](en:Java Edition 1.20.5 Pre-Release 1.md)
[es:Java Edition 1.20.5 Pre-Release 1](es:Java Edition 1.20.5 Pre-Release 1.md)
[fr:Version Java 1.20.5 Pre-Release 1](fr:Version Java 1.20.5 Pre-Release 1.md)
[ja:Java Edition 1.20.5 Pre-Release 1](ja:Java Edition 1.20.5 Pre-Release 1.md)
[lzh:爪哇版一點二〇點五之預一](lzh:爪哇版一點二〇點五之預一.md)
[pt:Edição Java 1.20.5 Pre-release 1](pt:Edição Java 1.20.5 Pre-release 1.md)
[ru:1.20.5 Pre-Release 1 (Java Edition)](ru:1.20.5 Pre-Release 1 (Java Edition).md)
[uk:1.20.5 Pre-Release 1 (Java Edition)](uk:1.20.5 Pre-Release 1 (Java Edition).md)