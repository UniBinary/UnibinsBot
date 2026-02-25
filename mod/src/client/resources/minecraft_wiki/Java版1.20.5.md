# Java版1.20.5

*页面ID: 110465* | *来源: Minecraft Wiki*

</ref>}}

* *1.20.5**是**[犰甲狼兵](犰甲狼兵.md)**的首个正式版，也是的一次小更新，发布于2024年4月23日<ref></ref>，加入了[犰狳](犰狳.md)、[犰狳鳞甲](犰狳鳞甲.md)、[狼铠](狼铠.md)、[狼](狼.md)的变种、4个[进度](进度.md)、命令和新的[战利品表函数](战利品表函数.md)，改进了狼的生命值相关机制与检测、更改实体[物品栏](物品栏.md)的命令，重新设计了[背景图](背景图.md)，用[物品堆叠组件](物品堆叠组件.md)代替了物品的NBT数据，使[配方](配方.md)支持物品堆叠组件，在内置实验性数据包中加入了更多[1.21](Java版1.21.md)的内容，并修复了一些漏洞。此版本不兼容1.20到1.20.4的服务端。

# 新内容
# = 物品 =
* *[犰狳鳞甲](犰狳鳞甲.md)**
* 由[犰狳](犰狳.md)自然掉落或[刷子](刷子.md)刷扫成年犰狳掉落，可用于合成和修复狼铠。

* *[刷怪蛋](刷怪蛋.md)**
* 加入了[犰狳](犰狳.md)刷怪蛋。

* *[狼铠](狼铠.md)**
* 对已驯服的成年[狼](狼.md)狼铠可为其穿戴，[剪刀](剪刀.md)可卸下狼铠。
* * 仅可由狼的主人为其装备和卸下。
* 可以像[皮革盔甲](皮革盔甲.md)一样染色。
* 可为狼提供点护甲值，也能以自身耐久度为狼抵挡不具有伤害类型标签的伤害。
* 具有64点耐久度，且会根据剩余耐久度呈现不同程度的开裂纹理。
* * 狼的主人可以对坐下的狼[犰狳鳞甲](犰狳鳞甲.md)修复其装备的狼铠。
* * 可以在[铁砧](铁砧.md)上用犰狳鳞甲修复狼铠。

# = 生物 =
* *[犰狳](犰狳.md)**
* [Minecraft Live 2023](Minecraft Live 2023.md)生物投票的获胜生物，属于友好生物。
* 自然生成于[热带草原](热带草原.md)及其变种、[恶地](恶地.md)及其变种生物群系。
* 有生命值。
* 可以使用[蜘蛛眼](蜘蛛眼.md)来繁殖或加速成长。
* 被玩家或驯服的[狼](狼.md)杀死后会掉落。
* * 幼年犰狳死亡时不会掉落任何物品和经验。
* 每隔5-10分钟掉落一个犰狳鳞甲。
* 使用[刷子](刷子.md)刷扫成年犰狳则会立即掉落一个犰狳鳞甲，同时消耗刷子16点耐久度。
* 在满足以下条件时，犰狳会蜷缩成方块状：
* * 3秒内受到下列惊吓之一
* ** 受到来自生物的伤害
* ** 半径7格内有[亡灵生物](亡灵生物.md)、正在疾跑的[玩家](玩家.md)、[骑乘](骑乘.md)在实体上的玩家或是5秒内攻击过它的生物
* * 未受到来自非生物的伤害
* * 未与[水](水.md)接触
* * 未被[拴绳](拴绳.md)拴着
* 犰狳蜷缩时不会移动、进食或被食物吸引，并且此时受到的伤害会被调整为<code>-{}-(修正前伤害 - 1) / 2</code>。
* 犰狳蜷缩时会隐藏自己的头和脚，期间会探出头窥视以检查蜷缩条件是否满足。
* * 如果满足，犰狳左右张望后再次缩进壳内；如果不满足，犰狳立即起身。

* *[狼](狼.md)**
* 加入了狼的多个变种，生成的变种取决于其自然生成时所处的[生物群系](生物群系.md)，或是[繁殖](繁殖.md)生成时其双亲所属的变种。
* * ，即使用先前纹理的狼，在[针叶林](针叶林.md)中以4只为一群生成。
* * ，在[森林](森林.md)中以4只为一群生成。
* * ，在[积雪针叶林](积雪针叶林.md)中以4只为一群生成。
* * ，在[原始松木针叶林](原始松木针叶林.md)中以2-4只为一群生成。
* * ，在[原始云杉针叶林](原始云杉针叶林.md)中以2-4只为一群生成。
* * ，在[稀疏丛林](稀疏丛林.md)中以2-4只为一群生成，或在[丛林](丛林.md)和[竹林](竹林.md)中被刷怪蛋或所召唤。
* * ，在[热带高原](热带高原.md)中以4-8只为一群生成，或在[热带草原](热带草原.md)和[风袭热带草原](风袭热带草原.md)中被刷怪蛋或所召唤。
* * ，在[疏林恶地](疏林恶地.md)中以4-8只为一群生成，或在[恶地](恶地.md)和[风蚀恶地](风蚀恶地.md)中被刷怪蛋或所召唤。
* * ，在[雪林](雪林.md)中罕见地生成一只。
* 在除以上的其他生物群系使用[刷怪蛋](刷怪蛋.md)及[命令](命令.md)生成的狼均为。

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

* *[魔咒](魔咒.md)**
* 加入了[致密](致密.md)魔咒。
* * 仅可通过命令获取对应[附魔书](附魔书.md)和带有此魔咒的物品。
* * 最大等级为V。
* 加入了[破甲](破甲.md)魔咒。
* * 仅可通过命令获取对应附魔书和带有此魔咒的物品。
* * 最大等级为IV。
* 加入了[风爆](风爆.md)魔咒。
* * 仅可通过命令获取对应附魔书和带有此魔咒的物品。
* * 最大等级为III。
* * 附有此魔咒的[剑](剑.md)、[镐](镐.md)、[斧](斧.md)、[锹](锹.md)、[锄](锄.md)和[三叉戟](三叉戟.md)击中生物后会产生[风爆](爆炸#风爆.md)，将攻击者向上弹起。
* ** 尽管此魔咒会在这些物品上生效，但它们不是此魔咒的适用物品。
* 这些魔咒不可由附魔。

* *[状态效果](状态效果.md)**
* 加入了[蓄风](蓄风.md)效果。
* * 拥有此效果的实体完全死亡后<ref name="MC-269951"></ref><ref name="MC-269956"></ref>会产生[风爆](爆炸#风爆.md)。
* 加入了[盘丝](盘丝.md)效果。
* * 拥有此效果的实体完全死亡后<ref name="MC-269951"/><ref name="MC-269956"/>会生成2-3个[蜘蛛网](蜘蛛网.md)。
* ** 蜘蛛网可以替代具有标签的方块生成。
* ** 是否生成蜘蛛网受<code>mobGriefing</code>[游戏规则](游戏规则.md)影响。
* * 拥有此效果且会被蜘蛛网减速的实体能以50%速度穿过蜘蛛网。
* 加入了[渗浆](渗浆.md)效果。
* * 拥有此效果的实体完全死亡后<ref name="MC-269951"/><ref name="MC-269956"/>会在周围5×5×5的区域生成两个中型[史莱姆](史莱姆.md)，直到达到[实体挤压上限](实体挤压上限.md)。
* 加入了[寄生](寄生.md)效果。
* * 拥有此效果的实体在受到伤害时有10%的概率在实体[边界箱](边界箱.md)中心生成1-2个[蠹虫](蠹虫.md)，并将它们按实体面朝方向抛出。
* 加入了[袭击之兆](袭击之兆.md)效果。
* * 拥有此效果的玩家会被不祥的<code>raid_omen</code>粒子包围。
* 加入了[试炼之兆](试炼之兆.md)效果。
* * 拥有此效果的玩家会被不祥的<code>trial_omen</code>粒子包围。
* 这些状态效果不可由给予。

* *[粒子](粒子.md)**
* 加入了粒子。

* *[音效](音效.md)**
* 加入了音效事件。

# = 命令格式 =
* ***
* 仅存在于专用服务器中，用于将玩家转移到另一个服务器。
* 语法：
* 参数：
* * ：字符串，要连接到的服务器的主机名。
* * ：整数，要连接到的服务器的端口编号，若省略则为。
* * ：要转移的玩家，若省略则为。

# = 常规 =
* *[属性](属性.md)**
* 加入了，用于控制生物的尺寸。
* 加入了，用于限制玩家可以与方块交互的最大距离。
* 加入了，用于限制玩家可以与实体交互的最大距离。
* 加入了，用于限制生物不跳跃就能走上的最大高度和玩家潜行时不会走下方块的最小高度差。
* 加入了，用于控制生物的重力加速度，值域为-1~1。
* 加入了，用于控制生物不受摔落伤害的最大高度，值域为-1024~1024。
* 加入了，用于控制生物总摔落伤害的倍率，值域为0~100。
* 加入了，用于控制玩家破坏方块速度的倍率，值域为0~1024。

* *[游戏规则](游戏规则.md)**
* 加入了<code>spawnChunkRadius</code>游戏规则，用于控制出生点区块的大小。
* * 默认值为<code>2</code>，取值为<code>0</code>至<code>32</code>。
* ** 设置为<code>0</code>表示完全禁用出生点区块，设置为<code>10</code>可以与之前版本的出生点区块大小保持一致。

* *协议**
* 加入了转移。
* * 自定义服务器现在可以请求客户端使用转移连接到另一个服务器。
* * 客户端转移时，将使用新的转移意图（ID<code>3</code>）连接到目标服务器，且可以使用新标志跳过身份验证。
* * 默认情况下，[服务器](服务器.md)不会接受转移，并会断开与客户端的连接，但可以通过将配置文件<code>server.properties</code>中的<code>accepts-transfers</code>设置为<code>true</code>来启用此功能。
* * 转移过程中维持资源包。
* 加入了Cookie。
* * Cookie允许自定义服务器在客户端请求和存储数据。在登录、配置和游戏阶段可能请求Cookie，但只有在配置和游戏阶段可以存储数据。
* * Cookie只会在玩家在线时被服务器持续传输。
* * 每个Cookie大小可达5KiB。
* * 这允许服务器将诸如身份验证或自定义游戏数据之类的信息传递给新服务器。

* *<samp>[server.properties](server.properties.md)</samp>**
* 加入了<code>accepts-transfers</code>，默认为<code>false</code>，用于设置服务端是否接受转移数据包作为登录请求。
* 加入了<code>region-file-compression</code>专用服务器启动配置参数，用于更改压缩算法，但不会自动重新压缩世界。
* * 若更改此参数，新区块或更新的区块使用新的压缩算法，而旧区块仍使用旧压缩算法。
* * 有三个枚举值：
* ** <code>deflate</code>，使用旧算法的默认值。
* ** <code>lz4</code>，使用LZ4算法，减少压缩和解压缩使用CPU的时间，但占用更多磁盘空间。
* ** <code>none</code>，不压缩数据。尽管CPU占用量较少，这会消耗更多的空间，并且需要大量的时间进行读写。与文件系统配合压缩存档文件更有意义。
* 加入了<code>recreateRegionFiles</code>专用服务器启动配置参数。
* * 这将使用与<code>forceUpgrade</code>类似的优化世界方案，创建新的碎片化的区域文件，但会重写所有区块。
* * 在更改<code>region-file-compression</code>服务器参数后将以新格式重新压缩所有区域文件。

* *[区域文件](区域文件.md)**
* 为第三方服务器添加了保留压缩ID，用于自定义压缩实现方式。
* * 压缩ID<code>127</code>现在可以用于自定义区域文件压缩实现。
* * 使用版本ID时，必须后接带有命名空间的字符串，表示所使用的自定义算法。

* *[数据包](数据包.md)**
* 加入了子文件夹<code>banner_pattern</code>和<code>wolf_variant</code>。

* *[标签](Java版标签.md)**
* 加入了以下方块标签：
* * ：。
* ** [犰狳](犰狳.md)可以在这些方块上生成。
* * ：。
* ** 犰狳可以在这些陶瓦上生成。
* * ：。
* ** 不会阻止[漏斗](漏斗.md)检测物品实体的方块。
* *
* ** 适合破坏工具**不**是对应[品质](品质.md)工具的方块，结合了现有的标签。
* 加入了以下物品标签：
* * ：。
* ** 属于胸部[盔甲](盔甲.md)（[胸甲](胸甲.md)）的物品。
* * ：。
* ** 属于脚部盔甲（[靴子](靴子.md)）的物品。
* * ：。
* ** 属于头部盔甲（[头盔](头盔.md)）的物品。
* * ：。
* ** 属于腿部盔甲（[护腿](护腿.md)）的物品。
* * ：。
* ** 属于[生物头颅](生物头颅.md)的物品。
* * ：。
* ** 可以附上适用于盔甲的[魔咒](魔咒.md)的物品。
* * ：。
* ** 可以附上适用于[弓](弓.md)的魔咒的物品。
* * ：。
* ** 可以附上适用于胸甲的魔咒的物品。
* * ：。
* ** 可以附上适用于[弩](弩.md)的魔咒的物品。
* * ：。
* ** 可以附上影响[耐久度](耐久度.md)的魔咒的物品。
* * ：。
* ** 可以附上可装备（Equippable）魔咒的物品。<!-- Curse of Binding -->
* * ：。
* ** 可以附上适用于[钓鱼竿](钓鱼竿.md)的魔咒的物品。
* * ：。
* ** 可以附上适用于靴子的魔咒的物品。
* * ：。
* ** 可以附上适用于头盔的魔咒的物品。
* * ：。
* ** 可以附上适用于护腿的魔咒的物品。
* * ：。
* ** 可以附上影响挖掘速度的魔咒的物品。<!-- Efficiency -->
* * ：。
* ** 可以附上影响挖掘[掉落物](掉落物.md)的魔咒的物品。<!-- Silk Touch -->
* * ：。
* ** 可以附上适用于[剑](剑.md)的魔咒的物品。
* * ：。
* ** 可以附上适用于[三叉戟](三叉戟.md)的魔咒的物品。
* * ：。
* ** 可以附上可使[物品](物品.md)消失的魔咒的物品。<!-- Curse of Vanishing -->
* * ：。
* ** 可以附上适用于武器的魔咒的物品。
* * ：。
* ** 可以附上[火焰附加](火焰附加.md)魔咒的物品。
* * ：。
* ** 可以附上[锋利](锋利.md)魔咒的物品。
* * ：。
* ** 可以被染色的防具。
* * ：
* ** 肉类物品。未被游戏直接使用，但可能包含于其他标签中。
* *
* ** 可以用于喂食或引诱对应生物的物品。
* 加入了以下实体类型标签：
* * ：。
* ** 被视为[水生生物](水生生物.md)的实体。
* * ：。
* ** 被视为[节肢生物](节肢生物.md)的实体。
* * ：。
* ** 免疫[中毒](中毒.md)和[生命恢复](生命恢复.md)效果的实体。
* * ：。
* ** 被视为[灾厄村民](灾厄村民.md)的实体。
* * ：。
* ** 被灾厄村民视为盟友的实体（不包括在其他队伍中的）。
* * ：。
* ** [瞬间治疗](瞬间治疗.md)和[瞬间伤害](瞬间伤害.md)会对其产生相反效果的实体。
* * ：。
* ** 不会使[河豚](河豚.md)膨胀的实体。
* * ：。
* ** [节肢杀手](节肢杀手.md)魔咒会对其产生额外伤害的实体。
* * ：。
* ** [穿刺](穿刺.md)魔咒会对其产生额外伤害的实体。
* * ：
* ** [亡灵杀手](亡灵杀手.md)魔咒会对其产生额外伤害的实体。
* * ：。
* ** 不被[凋灵](凋灵.md)视为目标，也不会对凋灵造成伤害的实体。
* * ：。
* ** 能被玩家攻击和[弹射物](弹射物.md)击中且会随玩家视角方向或弹射物方向偏转的弹射物实体。
* 加入了以下伤害类型标签：
* * ：。
* ** 不被狼铠抵消的伤害类型。
* * ：。
* ** 由玩家造成的攻击伤害类型。
* 加入了以下[魔咒](魔咒.md)标签：
* * ：。
* ** 控制在物品[提示框](提示框.md)中所显示魔咒的顺序。

* *[进度触发器](进度触发器.md)**
* 加入了进度触发器<code>crafter_recipe_crafted</code>，当[合成器](合成器.md)将物品喷出时触发。
* * <code><player></code>，实体谓词，用于匹配附近玩家。
* * <code><recipe_id></code>，配方ID，用于匹配一个合成配方。
* * <code><ingredients></code>，匹配合成所用的配方成分列表，子项均为物品谓词。
* 加入了进度触发器<code>fall_after_explosion</code>，在玩家被[爆炸](爆炸.md)或风弹爆裂击飞后摔落时触发。
* *<code><player></code>，匹配正在摔落的玩家的实体谓词。
* *<code><start_position></code>，匹配玩家受到爆炸坐标的位置谓词。
* *<code><distance></code>，匹配玩家从<code>start_position</code>起摔落高度的距离谓词。
* *<code><cause></code>，匹配造成爆炸的实体谓词。

* *[选项](选项.md)**
* 在“辅助功能设置”屏幕中加入了“菜单背景模糊程度”滚动条。
* 在“语言”屏幕中加入了“字体设置”。
* * 将“”选项移入其中。
* * 加入了“”选项。
* ** 用于控制是否在默认字体中为CJK字符使用日本字形。
* ** 默认值基于系统语言环境设置。

* *[语言](语言.md)**
* 加入了Viossa。

* *[字体](字体.md)**
* 加入了字体变体过滤器。
* * 现在字形提供器可以基于特定的变体集来启用或禁用字体变体。
* * 过滤器在<code>filter</code>节中定义，可用于每个字形提供器。
* ** 只有当过滤器中的值与键中变体的实际值匹配时，才会包含该字形提供器。
* * 可用的变体目前是硬编码的，并由字体选项菜单控制。
* ** <code>uniform</code>，连接到“”选项。
* ** <code>jp</code>，连接到“”选项。

* *[结构地物的地形调整方式](自定义结构#已配置的结构地物.md)**
* 加入了<code>encapsulate</code>。
* * 结构周围每一部分的密度都会增加。
* * 用于需要完全埋藏在地下的理想结构。

* *[战利品表](战利品表.md)**
* 战利品表抽取项<code>loot_table</code>（从提供的嵌套战利品表返回所有物品）现在有以下语法：
* * <code>value</code>可以是：
* ** 一个命名空间ID，指对另一个战利品表的引用。
* ** 完整的战利品表，格式与独立文件的战利品表相同。
* 加入了<code>storage</code>数值提供器。此提供器能获取命令存储中数据标签所提供的数值。
* * 如果选择的存储不存在、路径选择的标签不为数字或标签不存在，则返回<code>0</code>。
* * 格式：
* ** <code>storage</code>：命令存储的命名空间ID。
* ** <code>path</code>：NBT路径。

* *[战利品上下文参数集类型](战利品上下文#参数集.md)**
* 加入了<code>equipment</code>类型。
* * 需要的参数：
* ** <code>this_entity</code>：将获得装备的生物。
* ** <code>origin</code>：生物的位置。

* *[战利品表函数](战利品表函数.md)**
* ; <code>set_components</code>：用于在输入物品上添加或替换给定组件的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个[战利品表谓词](战利品表谓词.md)列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：所添加或替换的组件列表。
  ***  ：一个物品堆叠组件ID到组件值的映射，格式因ID而异。带有“!”前缀的组件将导致该组件被删除。
</div>
  * 现在在原版数据包中使用它来代替函数。
* ; <code>copy_components</code>：用于将组件从指定源复制到物品组件中的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：（可选）可从源复制的数据组件列表。省略时包含所有存在的组件。
  ***  ：一个物品堆叠组件ID。
  ** ：（可选）禁用复制的数据组件列表。省略时为空。
  ***  ：一个物品堆叠组件ID。
  ** ：被提取组件的资源类型，当前必须为<code>block_entity</code>。
</div>
  * 现在在原版数据包中使用它来代替函数。
* ; <code>set_fireworks</code>：设置<code>minecraft:fireworks</code>组件详细内容的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：（可选，不小于0且不大于255）火药的数量，用于衡量飞行时长。如果忽略此值，则物品飞行时长不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>0</code>。
  ** ：（可选）爆裂数据。
  *** ：<code>firework_explosion</code>数据的列表，与<code>minecraft:fireworks</code>组件中的<code>explosion</code>格式相同。
  *** ：决定爆裂列表数据的模式的枚举值。
  ***; 若为，则用此物品修饰器定义的爆裂列表替换整个爆裂列表数据，没有附加标签。
  ***; 若为，则用此物品修饰器定义的爆裂列表替换爆裂列表中的一个区间内元素的数据，并带有下列附加标签：
  *** ：（可选，不小于0）替换列表的起始下标。如果被省略，则为<code>0</code>。
  *** ：（可选，不小于0）替代列表的长度。如果被省略，则使用列表的长度。
  ***; 若为，则将此物品修饰器定义的爆裂列表附加到原烟花火箭爆裂列表后，没有附加标签。
  ***; 若为，则将此物品修饰器定义的爆裂列表插入到原爆裂列表内，并带有下列附加标签：
  *** ：（可选，不小于0）列表的插入位置下标。如果被省略，则为<code>0</code>（即在第一个爆裂数据前）。
</div>
* ; <code>set_firework_explosion</code>：设置<code>minecraft:firework_explosion</code>组件详细内容的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：（可选）爆炸形状。如果忽略此值，则原来的形状不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>small_ball</code>。
  ** ：（可选，RGB值）替代目标爆炸数据的初始粒子颜色的数组。如果忽略此值，则原来的颜色不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>[]</code>。
  ** ：（可选，RGB值）替代目标爆炸数据的淡出粒子颜色的数组。如果忽略此值，则原来的颜色不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>[]</code>。
  ** ：（可选）设置爆炸是否带有拖尾。如果忽略此值，则原来的<code>has_trail</code>不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>false</code>。
  ** ：（可选）设置爆炸是否闪烁。如果忽略此值，则原来的<code>has_twinkle</code>不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>false</code>。
</div>
* ; <code>set_book_cover</code>：覆盖<code>minecraft:written_book_content</code>组件详细内容的新函数，不会更改[成书](成书.md)的任何一页。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：（可选，可过滤文本）设置成书的标题，与<code>minecraft:written_book_content</code>组件中的<code>title</code>格式相同。如果忽略此值，则原标题不改变；如果应用此物品修饰器前对应组件不存在，则使用空字符串。
  ** ：（可选）设置成书的作者。如果忽略此值，则原标题不改变；如果应用此物品修饰器前对应组件不存在，则使用空字符串。
  ** ：（可选，不小于0且不大于3）设置成书的复制次数。如果忽略此值，则原值不改变；如果应用此物品修饰器前对应组件不存在，则使用<code>0</code>。
</div>
* ; <code>set_writable_book_pages</code>：设置<code>minecraft:writable_book_content</code>组件页面的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：页面列表，与<code>minecraft:writable_book_content</code>组件中的<code>pages</code>格式相同。
  ** ：决定[书与笔](书与笔.md)页面数据的模式的枚举值。
  **; 若为，则用此物品修饰器定义的页面列表替换整个书页列表数据，没有附加标签。
  **; 若为，则用此物品修饰器定义的页面列表替换书页列表中的一个区间内元素的数据，并带有下列附加标签：
  ** ：（可选，不小于0）替换列表的起始下标。如果被省略，则为<code>0</code>。
  ** ：（可选，不小于0）替代列表的长度。如果被省略，则使用列表的长度。
  **; 若为，则将此物品修饰器定义的书页列表附加到原书与笔书页列表后，没有附加标签。
  **; 若为，则将此物品修饰器定义的书页列表插入到原书与笔书页列表内，并带有下列附加标签：
  ** ：（可选，不小于0）列表的插入位置下标。如果被省略，则为<code>0</code>（即在第一页前）。
</div>
* ; <code>set_written_book_pages</code>：设置<code>minecraft:written_book_content</code>组件页面的新函数，不会更改封面数据。这些页面文本组件将在玩家下次打开成书时解析。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：书页列表，必须为可过滤的[文本组件格式](文本组件格式.md)。
  ** ：决定成书书页数据的模式的枚举值。
  **; 若为，则用此物品修饰器定义的书页列表替换整个书页列表数据，没有附加标签。
  **; 若为，则用此物品修饰器定义的书页列表替换书页列表中的一个区间内元素的数据，并带有下列附加标签：
  ** ：（可选，不小于0）替换列表的起始下标。如果被省略，则为<code>0</code>。
  ** ：（可选，不小于0）替代列表的长度。如果被省略，则使用列表的长度。
  **; 若为，则将此物品修饰器定义的书页列表附加到原成书书页列表后，没有附加标签。
  **; 若为，则将此物品修饰器定义的书页列表插入到原成书书页列表内，并带有下列附加标签：
  ** ：（可选，不小于0）列表的插入位置下标。如果被省略，则为<code>0</code>（即在第一页前）。
</div>
* ; <code>toggle_tooltips</code>：修改物品组件提示框的可见性的新函数，可设置等字段而不更改其他值。
<div class="treeview">
  ** ：支持的物品组件类型与布尔值的键值对。
  *** ：控制此组件是否在提示框中可见。受支持的组件包含：。
</div>
  * 示例：<code>{function:"toggle_tooltips","toggles":{"enchantments":false}}</code>将会隐藏魔咒提示框。
* ; <code>set_ominous_bottle_amplifier</code>：新函数，用于将目标物品的<code>ominous_bottle_amplifier</code>组件设置为数值提供器提供的值。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：一个[数值提供器](战利品表/数值提供器.md)。用于生成<code>ominous_bottle_amplifier</code>组件。
</div>
* ; <code>set_name</code>
* * 加入了可选字段来指定设置哪种名称。
* ** <code>custom_name</code>：（默认）设置<code>custom_name</code>组件。
* ** <code>item_name</code>：设置<code>item_name</code>组件。
* ; <code>modify_contents</code>：对容器类组件中的每个物品应用<code>modifier</code>中函数的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：目标组件，值可以为：。
  ** ：应用于目标组件中所有物品的战利品表函数。
</div>
  * 如果组件不存在，此函数不生效。
* ; <code>set_item</code>：不更改数量和组件即可替换物品堆叠类型的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：新物品ID。
</div>
* ; <code>filtered</code>：仅对符合物品谓词的物品应用<code>modifier</code>中函数的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：用于匹配物品的物品谓词。
  ** ：应用于物品的战利品表函数。
</div>
* ; <code>set_custom_model_data</code>：设置<code>custom_model_data</code>组件的新函数。
<div class="treeview">
  ** ：（默认为<code>[]</code>）一个战利品表谓词列表。当其中的条件全部符合时才会应用此物品修饰器。
  ** ：一个整型数值提供器。
</div>

* *实体谓词**
* 加入了实体子谓词<code>slots</code>，用于比较任何实体的单个或多个槽位。
* * 比较时，槽位区间中的任意槽位符合条件即视为整项通过。
* * 格式：槽位名称与物品谓词的键值对。
* * 示例：
  : <syntaxhighlight lang="json">{
    "condition": "minecraft:entity_properties",
    "entity": "this",
    "predicate": {
        "slots": {
            "container.*": {
                "items": "dirt"
            }
        }
    }
}</syntaxhighlight>
* 在实体子谓词<code>equipment</code>中加入了<code>body</code>选项，以匹配实体身体盔甲槽中的物品。
* 为匹配<code>raidersFields</code>字段，加入了实体子谓词<code>raider</code>。
* * <code>has_raid</code>——匹配袭击者是否处于正在进行的袭击中。
* * <code>is_captain</code>——匹配袭击者是否为袭击队长。

* *[物品栏](物品栏.md)**
* 加入了下列新的槽位名称：
* * <code>container.*</code>：包含<code>container.0</code>到<code>container.53</code>。
* * <code>hotbar.*</code>：包含<code>hotbar.0</code>到<code>hotbar.8</code>。
* * <code>inventory.*</code>：包含<code>inventory.0</code>到<code>inventory.26</code>。
* * <code>enderchest.*</code>：包含<code>enderchest.0</code>到<code>enderchest.26</code>。
* * <code>villager.*</code>：包含<code>villager.0</code>到<code>villager.7</code>。
* * <code>horse.*</code>：包含<code>horse.0</code>到<code>horse.14</code>。
* * <code>weapon.*</code>：包含。
* * <code>armor.*</code>：包含。
* * <code>player.cursor</code>：玩家鼠标持有的物品。在[创造模式物品栏](创造模式物品栏.md)中，此槽位不会被读取。
* * ：玩家物品栏中的合成栏。
* 除非另有说明，现有的命令仍仅支持单个槽位。

* *[物品堆叠组件](物品堆叠组件.md)**
* 物品堆相关的非结构化NBT数据（）被结构化的“组件”（）取代。
* * 这些数据将在物品被加载时进行解析和验证。
* * 这将提升在某些应用场景下的程序性能（如[盔甲纹饰](盔甲纹饰.md)的渲染），常见于物品被频繁地比较或请求和解析数据时。
* * 可将自定义物品数据存储在<code>minecraft:custom_data</code>组件中。
* 物品类型（比如，<code>minecraft:stick</code>）控制物品所拥有的默认组件，个别物品堆可以进行覆盖。
* 在数据包中，序列化物品格式和物品格式变得更加一致，以支持物品堆叠组件。
* 当高级提示框开启时（），将显示物品的组件数量而非其NBT标签数量。
* 在<code>reports</code>目录内的<code>items.json</code>文件中加入了物品默认组件的值。
* 在<code>blocks.json</code>报告中加入了方块定义，但尚未使用。
* 可以使用组件的简化形式，但它们在物品数据中总是以完整形式存储。
* 加入了以下物品堆叠组件（均省略命名空间<code>minecraft:</code>）：
<div class="treeview">
  :*; ：可用于存储物品的自定义数据。
  :** ：一个包含任意字段的对象。
</div>
  :* 在等命令中，可在物品名后使用<code>{…}</code>来表示，与之前表示物品的语法一致。
  :* 在命令的谓词判断中（比如），将与当前被判断物品的<code>custom_data</code>进行匹配，仅当其中的所有数据都相同时才返回“成功”，否则返回“失败”。
  :* 升级世界时，旧的物品标签中的任何非游戏数据都会移动到该组件中。
  :* 示例：<code>custom_data={some:'data'}</code>。
  :; ：（不小于0）物品损耗的耐久度。对于可损坏的物品，此值默认为0。若移除此组件，物品将变得不可损坏。
  :* 替代了标签。
  :* 示例：<code>damage=12</code>。
  :; ：（默认为0，不小于0）在铁砧中修改物品后所消耗的额外经验。
  :* 替代了标签。
  :* 示例：<code>repair_cost=12</code>。
<div class="treeview">
  :*; ：若挂载该组件，则物品将不会消耗耐久度。
  :** ：（默认为<code>true</code>）若为<code>true</code>，则在物品提示框中将显示“无法破坏”文本。替代了标签的第3个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>unbreakable={}</code>、<code>unbreakable={show_in_tooltip:false}</code>。
<div class="treeview">
  :*; ：（默认为<code>{levels:{}}</code>）存储物品的魔咒及其等级。可为等同于的简化形式。
  :** ：（允许多个项）。
  :*** ：（可选，默认为1，不小于0且不大于255）物品的一个魔咒及其等级。
  :** ：（默认为<code>true</code>）表示物品提示框中是否显示魔咒。用于替代标签的第1个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>enchantments={levels:{'minecraft:protection':2},show_in_tooltip:false}</code>或<code>enchantments={sharpness:1}</code>。
<div class="treeview">
  :*; ：（附魔书默认为<code>{levels:{}}</code>）存储[附魔书](附魔书.md)上的魔咒及其等级，但魔咒的实际效果不会因为此组件的挂载而生效。可为等同于的简化形式。
  :** ：（允许多个项）。
  :*** ：（可选，默认为1，不小于0且不大于255）物品的一个魔咒及其等级。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示魔咒。用于替代标签的第6个二进制位。
</div>
  :* 替代了附魔书标签。
  :; ：（JSON聊天组件字符串）覆盖物品原名称的自定义名称。
  :* 替代了标签。
  :* 示例：<code>-{}-custom_name='{"text": "此物品被重命名过了！", "color": "red"}'</code>。
<div class="treeview">
  :*; ：（默认为<code>[]</code>，最多包含256个项）物品提示框中附加的描述性信息列表。
  :** ：一个JSON聊天组件字符串，表示一行文本。
</div>
  :* 替代了标签。
  :* 示例：<code>-{}-lore=['{"text": "蛋糕是个谎言！"}']</code>。
<div class="treeview">
  :*; ：控制冒险模式玩家可以用此物品破坏哪些方块。
  :** ：（可选）代替原来字符串的方块谓词列表。
  :*** ：一个方块谓词。
  :**** ：可以为单个方块、方块列表或带哈希前缀（<code>#</code>）的方块标签。
  :**** ：（可选）可解析的方块实体NBT。
  :**** ：（可选）一个表示方块状态的映射表（map），映射键为方块状态的属性名，映射值为该方块状态对应的可用值。
  :** ：（可选）单个方块谓词，如<code>can_break={blocks:'minecraft:stone'}</code>。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示该物品可破坏的方块。用于替代标签的第4个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>can_break={predicates:{blocks:'minecraft:furnace',state:{facing:'north'}}</code>。
<div class="treeview">
  :*; ：控制冒险模式玩家可以把此物品放在哪些方块上。
  :** ：（可选）代替原来字符串的方块谓词列表。
  :*** ：一个方块谓词。
  :**** ：可以为单个方块、方块列表或带哈希前缀（<code>#</code>）的方块标签。
  :**** ：（可选）可解析的方块实体NBT。
  :**** ：（可选）一个表示方块状态的映射表（map），映射键为方块状态的属性名，映射值为该方块状态对应的可用值。
  :** ：（可选）单个方块谓词，如<code>can_place_on={blocks:'minecraft:stone'}</code>。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示该物品可破坏的方块。用于替代标签的第5个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>can_place_on={predicates:{blocks:'minecraft:furnace',state:{facing:'north'}}</code>。
<div class="treeview">
  :*; ：表示应用于可染色物品（拥有物品标签<code>#dyeable</code>的物品）的颜色。若使用，则等同于。
  :** ：RGB值。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示“已染色”。用于替代标签的第7个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>dyed_color={rgb:16711680}</code>或<code>dyed_color=16711680</code>。
<div class="treeview">
  :*; ：（默认值为该物品类型的属性，一般物品默认为<code>{modifiers:[]}</code>）控制在物品上应用的属性修饰符。若使用，等同于。
  :** ：属性修饰符列表。
  :*** ：一个属性修饰符。
  :**** ：一个属性修饰符ID，代替了。
  :**** ：只有当装备在指定的槽位时，修饰符才会生效。代替了。值可以为<code>any</code>（默认）、<code>hand</code>（新增，无论主手或副手）、<code>armor</code>（新增，任意盔甲槽）、<code>body</code>（新增，用于马铠和狼铠）、<code>mainhand</code>、<code>offhand</code>、<code>head</code>、<code>chest</code>、<code>legs</code>和<code>feet</code>。
  :**** ：同一个id只能存在一个修饰符。代替了。
  :**** ：可读的属性文本，代替了。
  :**** ：计算中调整修饰符的数值，代替了。
  :**** ：定义修饰符对属性的基础值的[运算方法](属性#运算模式.md)。代替了。值可以为<code>add_value</code>（加法，曾为<code>0</code>）、<code>add_multiplied_base</code>（与基值相乘，曾为<code>1</code>）和<code>add_multiplied_total</code>（与总值相乘，曾为<code>2</code>）。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示属性。用于替代标签的第2个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>attribute_modifiers={modifiers:[{type:'minecraft:generic.scale',uuid:[1,2,3,4],name:'大！',amount:1.0,operation:'add_multiplied_base'}]}</code>或<code>attribute_modifiers=[{type:'generic.scale',uuid:[1,2,3,4],name:'大！',amount:1.0,operation:'add_multiplied_base'}]</code>。
<div class="treeview">
  :*; ：包含所有装入弩中的弹射物。如果不存在，则弩未蓄力。
  :** ：一个物品堆。现在不再限制弩中的物品堆数。
</div>
  :* 替代了标签和。
  :* 示例：<code>charged_projectiles=[{id:'minecraft:arrow'}]</code>。
  :; ：一个空组件，用于标记发射时不显示在弓弩且将只能被创造模式玩家捡起的弹射物物品。这个物品应被弩的组件包含。
  :* 示例：<code>intangible_projectile={}</code>。
  :; ：（收纳袋默认为<code>[]</code>）存储[收纳袋](收纳袋.md)中的物品。如果被移除，则收纳袋不能收纳物品。
  :* 替代了标签。
  :; ：（地图的默认值为<code>4603950</code>）表示[地图](地图.md)物品上装饰物的色调。为RGB值，如<code>map_color=16711680</code>。
  :* 替代了标签。
<div class="treeview">
  :*; ：（地图默认为<code>{}</code>）包含地图上的[图标](地图#地图图标.md)列表，用于[探险家地图](探险家地图.md)。
  :** ：一个地图图标。
  :*** ：地图图标种类。值可以为<code>player</code>（曾为<code>0</code>）、<code>frame</code>（曾为<code>1</code>）、<code>red_marker</code>（曾为<code>2</code>）、<code>blue_marker</code>（曾为<code>3</code>）、<code>target_x</code>（曾为<code>4</code>）、<code>target_point</code>（曾为<code>5</code>）、<code>player_off_map</code>（曾为<code>6</code>）、<code>player_off_limits</code>（曾为<code>7</code>）、<code>mansion</code>（曾为<code>8</code>）、<code>monument</code>（曾为<code>9</code>）、<code>banner_white</code>（曾为<code>10</code>）、<code>banner_orange</code>（曾为<code>11</code>）、<code>banner_magenta</code>（曾为<code>12</code>）、<code>banner_light_blue</code>（曾为<code>13</code>）、<code>banner_yellow</code>（曾为<code>14</code>）、<code>banner_lime</code>（曾为<code>15</code>）、<code>banner_pink</code>（曾为<code>16</code>）、<code>banner_gray</code>（曾为<code>17</code>）、<code>banner_light_gray</code>（曾为<code>18</code>）、<code>banner_cyan</code>（曾为<code>19</code>）、<code>banner_purple</code>（曾为<code>20</code>）、<code>banner_blue</code>（曾为<code>21</code>）、<code>banner_brown</code>（曾为<code>22</code>）、<code>banner_green</code>（曾为<code>23</code>）、<code>banner_red</code>（曾为<code>24</code>）、<code>banner_black</code>（曾为<code>25</code>）、<code>red_x</code>（曾为<code>26</code>）、<code>village_desert</code>（曾为<code>27</code>）、<code>village_plains</code>（曾为<code>28</code>）、<code>village_savanna</code>（曾为<code>29</code>）、<code>village_snowy</code>（曾为<code>30</code>）、<code>village_taiga</code>（曾为<code>31</code>）、<code>jungle_temple</code>（曾为<code>32</code>）、<code>swamp_hut</code>（曾为<code>33</code>）和<code>trial_chambers</code>。
  :*** ：世界坐标。
  :*** ：世界坐标。
  :*** ：以度为单位从北方顺时针旋转。代替了先前的。
</div>
  :* 示例：<code>map_decorations={'Some marker':{type:'target_x',x:123.0,z:-45.0,rotation:0.0f}}</code>。
  :; ：用于引用持有地图内容和图标的共享映射档案。
  :* 替代了标签。
  :* 示例：<code>map_id=1</code>。
  :; ：用于替换自定义物品模型。
  :* 示例：<code>custom_model_data=43</code>。
<div class="treeview">
  :*; ：（药水和药箭物品有默认值<code>{}</code>）控制药水、喷溅药水和滞留药水的效果以及附着于物品上的药水效果。若使用，则等同于。
  :** ：（可选）[药水效果](药水效果.md)，影响物品的名称，在不存在时决定状态效果。
  :** ：（可选）物品渲染中，药水部分使用的颜色。只使用后24位，每个颜色通道占用8位，按RGB依次存储。
  :** ：（可选，默认为<code>[]</code>）额外对物品附加的自定义状态效果列表，其显示可与现有药水种类不同。
  :*** ：一项状态效果。
  :****
</div>
  :* 替代了标签、和。
  :* 示例：<code>potion_contents={potion:'minecraft:invisibility',custom_color:16711680}</code>或<code>potion_contents="invisibility"</code>。
<div class="treeview">
  :*; ：（书与笔有默认值<code>{pages:[]}</code>）存储[书与笔](书与笔.md)的内容。
  :** ：（可选，最多100个元素）书与笔内存储的页信息，必须为以下格式之一。
  :*** ：（长度不超过1024）书与笔内一页的文本信息。如果开启过滤，则代表文本信息与原信息一致。
  :*** ：书与笔内一页的信息。
  :**** ：（可能不存在，长度不超过1024）已过滤的文本信息。在开启过滤时，此字符串优先级高于。
  :**** ：（长度不超过1024）未过滤的文本原始信息。
</div>
  :* 替代了标签和。
  :* 示例：<code>writable_book_contents={pages:[{raw:'你好，世界！'}]}</code>。
<div class="treeview">
  :*; ：存储[成书](成书.md)的内容和元数据。
  :** ：（可选）成书内存储的页信息，文本必须使用以下格式之一。
  :*** ：成书内一页的JSON文本信息。如果开启过滤，则代表过滤后文本信息与原信息一致。
  :*** ：成书内一页的信息。
  :**** ：（可能不存在）已过滤的JSON文本信息。在开启过滤时，此字符串优先级高于。
  :**** ：未过滤的JSON文本原始信息。
  :** ：（长度不超过32）成书的标题信息。为时，如果开启过滤，则代表此标题过滤后与原标题一致。
  :*** ：（可能不存在，长度不超过32）已过滤的标题信息。在开启过滤时，此字符串优先级高于。
  :*** ：（长度不超过32）未过滤的标题原始信息。
  :** ：作者名。
  :** ：（不小于0，不大于2，默认为<code>0</code>（原作））成书被复制的次数。可以为<code>0</code>（），<code>1</code>（），<code>2</code>（），<code>3</code>（）。
  :** ：本书中的聊天组件是否已解析。如果为<code>false</code>，将在打开这本书时解析。
</div>
  :* 替代了标签、、、、、和。
  :* 示例：<code>-{}-written_book_contents={pages:[{raw:'你好，世界！'}],title:{raw:'一次愉快的阅读'},author:'Herobrine',generation:1,resolved:true}</code>。
<div class="treeview">
  :*; ：存储物品的纹饰。
  :** ：图案ID或内联的图案。
  :** ：材料ID或内联的材料。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示纹饰信息。用于替代标签的第8个二进制位。
</div>
  :* 替代了相同格式的标签。
  :* 此组件的存在不再受物品标签<code>#trimmable_armor</code>的限制。
  :* 示例：<code>trim={pattern:'minecraft:silence',material:'minecraft:redstone'}</code>。
<div class="treeview">
  :*; ：（谜之炖菜默认为<code>[]</code>）控制食用[谜之炖菜](谜之炖菜.md)获得的状态效果。
  :** ：一个状态效果。
  :*** ：状态效果ID。
  :*** ：（默认值为）状态效果持续刻数。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示纹饰信息。用于替代标签的第8个二进制位。
</div>
  :* 替代了相同格式的标签。
  :* 示例：<code>suspicious_stew_effects=[{id:'minecraft:poison'}]</code>。
  :; ：空组件，表示禁用物品提示框中附加的物品类型信息。
  :* 替代了标签的第6个二进制位。
  :* 示例：<code>hide_additional_tooltip={}</code>。
<div class="treeview">
  :*; ：（调试棒默认为<code>{}</code>）存储[调试棒](调试棒.md)使用的选定方块状态档案。
  :** ：一个对应的方块状态档案。
</div>
  :* 替代了标签。
  :* 示例：<code>debug_stick_state={'minecraft:turtle_egg':'eggs','minecraft:furnace':'facing'}</code>。
<div class="treeview">
  :*; ：存储非结构化的NBT数据以便在使用生成实体的物品时应用于实体，如[刷怪蛋](刷怪蛋.md)或[盔甲架](盔甲架.md)。
  :** ：（必填）一个实体ID。
  :** 其他在生成实体时与其数据合并的实体标签。
</div>
  :* 替代了标签。
  :* 示例：<code>entity_data={id:'minecraft:pig',Health:1.0f}</code>。
<div class="treeview">
  :*; ：（桶装生物物品默认为<code>{}</code>）存储非结构化的NBT数据以便在将实体从桶中放出时应用于实体。
  :**
  :**
  :**
  :**
  :**
  :**
  :**
  :**
  :**
  :**
</div>
  :* 替代了标签、、、、、、、、和。
  :* 示例：<code>bucket_entity_data={NoAI:1,Age:43}</code>。
  :; ：[山羊角](山羊角.md)使用的乐器ID。
  :* 替代了相同格式的标签。
  :* 示例：<code>instrument='minecraft:ponder_goat_horn'</code>。
  :; ：（知识之书默认为<code>[]</code>）使用[知识之书](知识之书.md)后应获得的配方ID列表。
  :* 替代了相同格式的标签。
  :* 示例：<code>recipes=['minecraft:acacia_boat','minecraft:anvil']</code>。
<div class="treeview">
  :*; ：存储指南针指向的绑定磁石。
  :** :（可选）一个绑定磁石。如果不存在，则指南针旋转。
  :*** ：<code>-{}-绑定磁石的['x','y','z']</code>。
  :*** ：绑定磁石所在的维度ID。
  :** ：（默认为<code>true</code>）是否追踪绑定磁石的方块状态。为<code>true</code>时，该组件会随目标位置的磁石被破坏而移除。
</div>
  :* 替代了标签、和。
  :* 示例：<code>lodestone_tracker={pos:[13,64,-43],dimension:'minecraft:the_nether'}</code>。
<div class="treeview">
  :*; ：（可选，最多包含256个元素）存储[烟火之星](烟火之星.md)的爆炸效果。
  :** ：爆炸的形状。值可以为<code>small_ball</code>（曾为<code>0</code>）、<code>large_ball</code>（曾为<code>1</code>）、<code>star</code>（曾为<code>2</code>）、<code>creeper</code>（曾为<code>3</code>）和<code>burst</code>（曾为<code>4</code>）
  :** ：（默认为<code>[]</code>）初始的粒子颜色列表，实际显示颜色从中随机选择。
  :*** 一个RGB值
  :** ：（默认为<code>[]</code>）淡化时的粒子颜色列表，实际显示颜色从中随机选择。
  :*** 一个RGB值
  :** ：（默认为<code>false</code>）是否有踪迹效果。
  :** ：（默认为<code>false</code>）是否有闪烁效果。
</div>
  :* 替代了标签、、、和。
  :* 示例：<code>firework_explosion={shape:'large_ball',colors:[16711680],has_trail:true}</code>。
<div class="treeview">
  :*; ：存储[烟花火箭](烟花火箭.md)的所有爆炸效果和飞行时间。
  :** ：（可选，最多包含256个元素）爆炸列表。
  :*** ：一个烟火之星的数据。
  :**** ：爆炸的形状。值可以为<code>small_ball</code>（曾为<code>0</code>）、<code>large_ball</code>（曾为<code>1</code>）、<code>star</code>（曾为<code>2</code>）、<code>creeper</code>（曾为<code>3</code>）和<code>burst</code>（曾为<code>4</code>）
  :**** ：（默认为<code>[]</code>）初始的粒子颜色列表，实际显示颜色从中随机选择。
  :***** ：一个RGB值。
  :**** ：（默认为<code>[]</code>）淡化时的粒子颜色列表，实际显示颜色从中随机选择。
  :***** ：一个RGB值。
  :**** ：（默认为<code>false</code>）是否有踪迹效果。
  :**** ：（默认为<code>false</code>）是否有闪烁效果。
  :** ：（可选，无符号8位整数，默认为0）飞行时间，为该烟花火箭中[火药](火药.md)的数量。
</div>
  :* 替代了标签、。
  :* 示例：<code>{explosions:[],flight_duration:1}</code>。
<div class="treeview">
  :*; ：控制[玩家的头](玩家的头.md)显示的皮肤，此数据在放下物品后复制到“玩家的头”方块中。若使用，则等同于。
  :** ：（可选，长度不超过16，不能有空格或特殊字符<ref></ref>）玩家名称。如果仅指定了，会解析为相应的玩家UUID和皮肤数据。
  :** ：（可选）玩家的UUID。如果仅指定了，会解析为相应的玩家名称和皮肤数据。
  :** ：（可选）档案列表。
  :***; 如果使用形式，则游戏档案属性数据可以具有签名，且内部标签如下：
  :*** ：一项游戏档案属性。
  :**** ：游戏档案属性的名称。
  :**** ：游戏档案属性的数据，是使用Base64编码的JSON数据。
  :**** ：（可能不存在）游戏档案属性的签名。
  :***; 如果使用形式，则游戏档案属性数据不具有签名，且内部标签如下：
  :*** ：游戏档案属性，可以保存多个不同数据但具有相同属性名称的游戏档案属性。
  :**** ：游戏档案属性的数据，是使用Base64编码的JSON数据。
</div>
  :* 替代了标签。
  :* 示例：<code>profile={name:'MHF_Sheep'}</code>或<code>profile="jeb_"</code>。
  :; ：音效事件ID。控制玩家的头放置在[音符盒](音符盒.md)上时音符盒播放的音效，此数据在放下物品后复制到“玩家的头”方块中。
  :* 替代了标签。
  :; ：存储旗帜和盾的基础颜色。值可以为<code>white</code>（曾为<code>0</code>）、<code>orange</code>（曾为<code>1</code>）、<code>magenta</code>（曾为<code>2</code>）、<code>light_blue</code>（曾为<code>3</code>）、<code>yellow</code>（曾为<code>4</code>）、<code>lime</code>（曾为<code>5</code>）、<code>pink</code>（曾为<code>6</code>）、<code>gray</code>（曾为<code>7</code>）、<code>light_gray</code>（曾为<code>8</code>）、<code>cyan</code>（曾为<code>9</code>）、<code>purple</code>（曾为<code>10</code>）、<code>blue</code>（曾为<code>11</code>）、<code>brown</code>（曾为<code>12</code>）、<code>green</code>（曾为<code>13</code>）、<code>red</code>（曾为<code>14</code>）和<code>black</code>（曾为<code>15</code>）
  :* 替代了标签。
<div class="treeview">
  :*; ：（旗帜和盾默认为<code>[]</code>）列表，存储对旗帜和盾生效的图案，放置时数据复制到旗帜方块中。
  :** ：一个旗帜图案。
  :*** ：图案的注册ID。
  :*** ：图案的染料颜色。
</div>
  :* 替代了标签。
  :* 示例：<code>banner_patterns=[{pattern:'minecraft:stripe_top',color:'red'}]</code>。
<div class="treeview">
  :*; ：（饰纹陶罐默认为<code>['minecraft:brick','minecraft:brick','minecraft:brick','minecraft:brick']</code>）存储[饰纹陶罐](饰纹陶罐.md)每侧的陶片，放置时复制到方块数据中。
  :**
</div>
  :* 替代了相同格式的标签。
  :* 示例：<code>['arms_up_pottery_sherd','angler_pottery_sherd','danger_pottery_sherd','shelter_pottery_sherd']</code>。
<div class="treeview">
  :*; ：（容器默认为<code>[]</code>）表示[容器](容器.md)（物品形式）中的各个槽位。当容器被放置时，将复制该组件中的数据。
  :** ：（不小于0，不大于255）容器中的槽位。
  :** ：一个物品堆。
</div>
  :* 替代了标签。
  :* 示例：<code>container=[{slot:7,item:{id:'diamond_pickaxe',components:{'minecraft:unbreakable':{}}}}]</code>。
<div class="treeview">
  :*; ：（蜂巢和蜂箱默认为<code>[]</code>）用于控制[蜂巢](蜂巢（方块）.md)或[蜂箱](蜂箱.md)中的[蜜蜂](蜜蜂.md)数据。当[蜂巢](蜂巢（方块）.md)或[蜂箱](蜂箱.md)被放置时，将复制该组件的数据。
  :** ：一个蜜蜂实体。
  :*** ：该实体的数据。
  :**** ：实体的命名空间ID。
  :***; 其余的标签将在蜜蜂生成时被合并到其数据中。
  :***
  :***
</div>
  :* 替代了标签。
  :* 示例：<code>bees=[{entity_data:{id='minecraft:bee'},ticks_in_hive:3,min_ticks_in_hive:10}]</code>。
  :; ：表示类容器方块和信标的“锁”。只有玩家使用与之匹配的“钥匙”才能打开该容器，“钥匙”即为自定义名称与“锁”名称相同的物品。当容器方块或信标被放置时将复制该组件中的数据。
  :* 替代了标签。
  :* 示例：<code>lock='hunter2'</code>。
<div class="treeview">
  :*; ：存储处于未解析状态的战利品表和类容器方块的种子。放置容器方块时，该组件中的数据将被复制到方块数据中。
  :** ：战利品表ID。
  :** ：（可选）伪随机种子，将参与到战利品表的解析过程中。若未设定此值或此值为0，则将在战利品表被计算时随机选取一个种子。
</div>
  :* 替代了标签和。
  :* 示例：<code>container_loot={loot_table:'minecraft:chests/buried_treasure',seed:123}</code>。
<div class="treeview">
  :*; ：存储应用于方块实体的非结构化NBT数据，放置诸如箱子和熔炉方块时将加载该组件的数据。方块实体数据被移动到专用的物品组件中时会被删除。当方块被放置时，其任何附加字段都将被合并到该组件中。
  :** ：（必填）方块实体类型。
  :** 其他在放置方块实体时与其数据合并的方块实体标签。
</div>
  :* 如果玩家是管理员，则此标签仅对[命令方块](命令方块.md)、[讲台](讲台.md)、[告示牌](告示牌.md)和[刷怪笼](刷怪笼.md)生效。
  :* 替代了先前具有相同行为的标签。
  :* 示例：<code>block_entity_data={id:'minecraft:chest',Items:[{Slot:1,item:'minecraft:diamond'}]}</code>。
  :; ：控制方块被放置时要应用的方块状态。
  :* 格式：一个键值对映射表，映射键为方块状态的属性名，映射值为该属性的允许值。
  :* 替代了标签。
  :* 示例：<code>block_state={eggs:'10'}</code>。
  :; ：为物品覆上附魔光效。之前可通过在中添加无效的魔咒标签以使得物品像是被添加了附魔光效。
  :* 若为<code>true</code>，没有附魔光效的物品将获得光效并开始闪烁（不论是否来自魔咒或物品的内在属性）。
  :* 若为<code>false</code>，有附魔光效的物品将不显示光效也不闪烁。
  :* 示例：<code>enchantment_glint_override=true</code>。
  *; ：（[食物](食物.md)隐含与其类型对应的默认值）控制物品是否可以作为食物吃掉。
<div class="treeview">
  :** ：（不小于<code>0</code>）食用该物品后增加的[饥饿值](饥饿值.md)。
  :** ：食用物品后增加的[饱和度](饱和度.md)的精确值。
  :** ：（可选，默认为<code>false</code>）此物品能否无视当前饥饿值而食用。
  :** ：（可选，默认为<code>1.6</code>）食用该物品消耗的秒数。
  :** ：（可选，默认为<code>[]</code>）该物品被食用后施加的[状态效果](状态效果.md)列表。
  :*** ：一项状态效果，与组件中的中的复合标签格式相同。
  :*** ：（可选，不大于1且不小于0，默认为<code>1</code>）施加此状态效果的概率。
</div>
  :* 示例：<code>food={nutrition:4,saturation_modifier:0.8}</code>。
  *; ：（大于<code>0</code>且小于<code>100</code>；各物品所隐含的默认值通常为<code>64</code>）控制物品的最大堆叠数。
  ** 与冲突。
  ** 示例：<code>max_stack_size=4</code>。
  *; ：（大于<code>0</code>，可损伤物品隐含对应默认值）控制物品可受的最大损伤值。
  ** 与冲突。
  ** 示例：<code>max_damage=123</code>。
  ** 如果此组件不存在，则物品不能被损伤。
  *; ：（空对象，[下界合金](下界合金.md)等抗火物品隐含默认值）控制物品是否不会在火焰中燃烧。
  ** 示例：<code>fire_resistant={}</code>。
  *; ：（大多数物品默认为<code>common</code>，[金苹果](金苹果.md)等特殊物品隐含对应的默认值）[稀有度](稀有度.md)，控制物品名称的颜色。
  ** 枚举值可以为：
  *** <code>common</code>（常见）：白色，附魔后为青色。
  *** <code>uncommon</code>（少见）：黄色，附魔后为青色。
  *** <code>rare</code>（稀有）：青色，附魔后为亮紫色。
  *** <code>epic</code>（史诗）：亮紫色。
  ** 示例：<code>rarity=rare</code>。
  *; ：（原版[工具](工具.md)隐含与其[品质](品质.md)和类型对应的默认值）控制物品的工具性。
<div class="treeview">
  :** ：规则列表。
  :*** ：一项规则。
  :**** ：可交互的单一方块、带哈希前缀（<code>#</code>）的方块标签或方块列表。
  :**** ：（可选）覆盖对可交互方块的[挖掘](挖掘.md)速度。
  :**** ：（可选）覆盖此物品是否为破坏此类方块的合适工具。如果为<code>true</code>此工具将最效率地破坏对应方块且允许它（们）掉落。
  :*** ：（默认为<code>1.0</code>）如果没有规则匹配时用以覆盖的挖掘速度。
  :*** ：（可选，大于等于<code>0</code>）此工具每破坏一个此类方块所消耗的[耐久度](耐久度.md)。
</div>
  :* 示例：<code>tool={rules:[{blocks:"#mineable/pickaxe",speed:4.0,correct_for_drops:true}]}</code>
  *; ：（空对象）控制是否隐藏物品包括物品名称在内的整个提示框。
  ** 在[创造模式](创造模式.md)中仍然可见且可被搜索。
  *; ：使用[文本组件格式](文本组件格式.md)覆盖物品的默认名称，格式与相同。
  ** 不同在于：
  *** 不会被[铁砧](铁砧.md)修改或移除。
  *** 不会显示为斜体。
  *** 在某些地方（如旗帜[标记](标记.md)、[物品展示框](物品展示框.md)中物品名称）不显示名称标签。
  *; ：（不小于0，不大于4）控制[不祥之瓶](不祥之瓶.md)的[不祥之兆](不祥之兆.md)状态效果放大倍率。
  ** 示例：<code>ominous_bottle_amplifier=3</code>。

* *其他**
* 加入了JFR（Java Flight Recorder）事件，用于对单区块的读取（<code>minecraft.ChunkRegionRead</code>）和写入（<code>minecraft.ChunkRegionWrite</code>）。

# 更改
# = 方块 =
* *[漏斗](漏斗.md)**
* 现在在其上方有[蜂巢](蜂巢（方块）.md)或[蜂箱](蜂箱.md)以外的[碰撞箱](判定箱#碰撞箱.md)完整的方块时，不再尝试吸取[物品实体](物品实体.md)。

* *[砂轮](砂轮.md)**
* 现在不接受具有组件但没有魔咒的物品。
* * 如果上方物品允许存在耐久度，则可使用下方附魔的无法破坏物品为其修复，输出的物品不会继承组件；如果交换物品顺序，则既不可祛魔也不可修复；如果只存在附魔的无法破坏物品，则仅祛魔而保留组件。
* 现在不可同时为两本附魔书祛魔。

* *[玩家的头](玩家的头.md)**
* 现在于<code>custom_name</code>标签中存储物品名称。
* NBT标签被<code>profile</code>替代以与物品形式的组件格式统一。

* *[蜘蛛网](蜘蛛网.md)**
* 加入了独有音效，不再使用[石头](石头.md)的音效。

* *[刷怪笼](刷怪笼.md)**
* 在<code>SpawnPotentials</code>生成数据中加入了可选的字段，用于将指定战利品表内的物品随机选取装备到生成的生物身上。
* *
<div class="treeview">
  :** ：一个用于生成装备的战利品表。
  :** ：（可选）为浮点型时，表示对所有槽位生效的掉落概率。为列表时，表示每个槽位装备的掉落概率列表。
  :*** ：一个装备槽位与指定掉落概率的键值对。
</div>
  :* 示例：<code>equipment: {loot_table: "minecraft:equipment/trial_chamber", slot_drop_chances: {"head": 0.0f, "chest": 0.25f, "legs": 1.0f, "feet": 0.25f}}</code>。

* *常规**
* 方块位置现在存储为一个由3个整数组成的数组（<code>[I;*x*,*y*,*z*]</code>），而不是一个包含X、Y、Z的复合元素（<code>{X:*x*,Y:*y*,Z:*z*}</code>）。
* [蜂巢](蜂巢（方块）.md)的NBT标签<code>FlowerPos</code>重命名为<code>flower_pos</code>。
* [末地折跃门（方块）](末地折跃门（方块）.md)的NBT标签<code>ExitPortal</code>重命名为<code>exit_portal</code>。

# = 物品 =
* *[鳞甲](鳞甲.md)**
* 被重命名为“海龟鳞甲”（Turtle Scute）。

* *[马铠](马铠.md)**
* 现在物品[提示框](提示框.md)中包含[护甲值](护甲值.md)及[盔甲韧性](盔甲韧性.md)信息。

* *[灾厄旗帜](灾厄旗帜.md)**
* 现在默认名称存储于<code>item_name</code>组件中。
* 现在带有<code>hide_additional_tooltip</code>组件。

* *[探险家地图](探险家地图.md)**
* 现在默认名称存储于<code>item_name</code>组件中。

* *[药水](药水.md)**
* 加入了蓄风药水。
* * 只能通过[命令](命令.md)获取。
* * 可制作对应的[喷溅药水](喷溅药水.md)、[滞留药水](滞留药水.md)和[药箭](药箭.md)。
* * 给予[蓄风](蓄风.md)效果。
* 加入了盘丝药水。
* * 只能通过命令获取。
* * 可制作对应的喷溅药水、滞留药水和药箭。
* * 给予[盘丝](盘丝.md)效果。
* 加入了渗浆药水。
* * 只能通过命令获取。
* * 可制作对应的喷溅药水、滞留药水和药箭。
* * 给予[渗浆](渗浆.md)效果。
* 加入了虫蚀药水。
* * 只能通过命令获取。
* * 可制作对应的喷溅药水、滞留药水和药箭。
* * 给予[寄生](寄生.md)效果。

# = 生物 =
* *[盔甲架](盔甲架.md)**
* 不再会被[羊驼唾沫](羊驼唾沫.md)和[潜影弹](潜影弹.md)摧毁。

* *[蜜蜂](蜜蜂.md)和[鹦鹉](鹦鹉.md)**
* 优化了飞行AI，现在上下飞行幅度不会太大。

* *[蜘蛛](蜘蛛.md)和[洞穴蜘蛛](洞穴蜘蛛.md)**
* 现在会远离未蜷缩的犰狳。

* *[狼](狼.md)**
* 现在可以在[砂土](砂土.md)和[灰化土](灰化土.md)上生成。
* 现在[狼](狼.md)会生成于[稀疏丛林](稀疏丛林.md)、[热带高原](热带高原.md)和[疏林恶地](疏林恶地.md)生物群系中。
* 更改了狼身上的项圈的纹理。
* 驯服的狼生命值由改为。
* 喂食恢复的生命值翻倍。
* 所受来源非箭或玩家的伤害不再被调整为<code>-{}-(修正前伤害 + 1) / 2</code>。
* 不再会攻击盔甲架。

* *常规**
* 对已有<code>HandItems</code>和<code>ArmorItems</code>NBT标签的所有实体新增了<code>body_armor_item</code>和<code>body_armor_drop_chance</code>参数，处理效果与<code>HandItems</code>和<code>ArmorItems</code>相同。
* 马的<code>ArmorItem</code>、羊驼的<code>DecorItem</code>和狼的<code>armor</code>现改为使用<code>body_armor_item</code>和<code>body_armor_drop_chance</code>参数。
* 移除了<code>horse.armor</code>槽位参数，以适用于所有生物的<code>armor.body</code>槽位参数替代。
* [蜜蜂](蜜蜂.md)的NBT标签<code>FlowerPos</code>和<code>HivePos</code>分别重命名为<code>flower_pos</code>和<code>hive_pos</code>。
* [袭击](袭击.md)生物的NBT标签<code>PatrolTarget</code>重命名为<code>patrol_target</code>。
* [流浪商人](流浪商人.md)的NBT标签<code>WanderTarget</code>重命名为<code>wander_target</code>。
* 可被[拴绳](拴绳.md)拴住的实体的NBT标签<code>Leash</code>重命名为<code>leash</code>。

# = 非生物实体 =
* *[羊驼唾沫](羊驼唾沫.md)**
* 现在使用新的[伤害类型](伤害类型.md)，而不是。

* *[末地水晶](末地水晶.md)**
* NBT标签<code>BeamTarget</code>重命名为<code>beam_target</code>。

* *[箭](箭.md)**
* 不再存储附着的[状态效果](状态效果.md)，而是从在<code>item</code>中存储的物品形式获取。
* * 现在药箭的状态效果在其生效期过后消失。

* *[区域效果云](区域效果云.md)**
* 现在使用<code>potion_contents</code>字段中的<code>minecraft:potion_contents</code>组件存储格式相同的[药水效果](药水效果.md)。

# = 世界生成 =
* *[雪林](雪林.md)**
* 不再生成[鸡](鸡.md)、[猪](猪.md)、[牛](牛.md)和[绵羊](绵羊.md)，现在生成于雪林的友好生物仅有[兔子](兔子.md)、[狐狸](狐狸.md)和[狼](狼.md)。

# = 游戏内容 =
* *[创造模式](创造模式.md)**
* 现在使用和[](选取方块.md)键选取一个有自定义名称的方块（如箱子）后，也会得到一个同名的对应物品。

* *[附魔](附魔（物品修饰）.md)**
* 现在[斧](斧.md)可以通过附魔获得[锋利](锋利.md)、[亡灵杀手](亡灵杀手.md)、[节肢杀手](节肢杀手.md)。

* *[魔咒](魔咒.md)**
* 现在魔咒存储为键值对而不再是复合元素列表，因此不再能存储魔咒的顺序（通常是魔咒被添加到物品上的顺序）。
* * 物品被重新加载后，其魔咒会被按照标签重新排序。<ref></ref>
* 现在[](力量（魔咒）.md)、[冲击](冲击.md)、[火矢](火矢.md)和[无限](无限.md)会在[弩](弩.md)上产生效果。
* 现在[穿透](穿透.md)和[多重射击](多重射击.md)会在玩家的[弓](弓.md)上产生效果。
* 更改了[效率](效率.md)、[火焰附加](火焰附加.md)、[时运](时运.md)、[击退](击退.md)、[抢夺](抢夺.md)、[海之眷顾](海之眷顾.md)、[饵钓](饵钓.md)、[精准采集](精准采集.md)、[引雷](引雷.md)和[耐久](耐久.md)魔咒的修正附魔等级范围。<ref>[24w13a的修正附魔等级范围具体更改](Special:Diff/847331/883993.md)</ref>

* *[交易](交易.md)**
* 村民交易的<code>ignoreTags</code>字段被移除，取而代之的是基于损伤值的组件谓词。
* * 现在只有指定<code>'minecraft:damage': 0</code>时村民才会收购无耐久损耗的物品。
* * 现在在默认不指定组件的情况下，村民可以收购任意物品。

* *[药水效果](药水效果.md)**
* 移除了<code>minecraft:empty</code>，现在仅在不指定<code>potion</code>数据时使用“不可合成的药水”效果。
* 带有跳跃药水效果物品的物品提示框中现在会显示此药水效果对属性修饰符的影响。
* 将不可合成的药水效果由品红色更改为蓝色。<ref></ref>

* *[状态效果](状态效果.md)**
* 跳跃提升、飘浮和挖掘疲劳放大倍率超过127的行为已被新的属性所取代。
* 状态效果粒子不再混合为一种颜色，现在多个状态效果的粒子会分别渲染。
* 降低了实体发出状态效果粒子的频率。

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

# = 命令格式 =
* ***
* 重命名了以下修饰符<code>operation</code>值：
* * <code>add</code> → <code>add_value</code>
* * <code>multiply_base</code> → <code>add_multiplied_base</code>
* * <code>multiply</code> → <code>add_multiplied_total</code>

* ***
* 条件子命令现在可用新类型<code>items</code>以比较物品或为物品计数。
* * <code><nowiki>execute if|unless items <source> <slots> <item_predicate></nowiki></code>
* ** <code><nowiki><source></nowiki></code>：用法与中相同。
* *** 示例：<code>block <x> <y> <z></code>或<code>entity <target></code>（可返回多个实体）。
* ** <code><slots></code>：可以为单个槽位（如<code>container.0</code>）或槽位区间（如<code>container.*</code>）
* ** <code><item_predicate></code>：用法与中的物品谓词相同。
* * 如果单独使用，则会返回符合条件的物品堆中物品的总数。
* 现在接受内联战利品定义。
* 的SNBT值现在具有与匹配的JSON文件相同的结构，但它仍是硬编码的。
* * 示例：<code>execute if predicate {condition:weather_check, raining:true}</code>。

* *、、和**
* 更新了语法。
* * 现在可以在物品ID后使用方括号指定组件。
* ** 组件之间用逗号分隔。
* *** 如<code>netherite_hoe[damage=5,repair_cost=2]</code>。
* * 组件类型会自动补全。
* * 值不会自动补全，但会被验证。如果指定的组件不正确，命令将无法解析。
* ** 如<code>give @s wooden_pickaxe[damage=-34]</code>是无效的。
* * 移除了旧NBT语法<code>{…}</code>，它现在被<code>minecraft:custom_data</code>组件取代。
* * 使用<code>minecraft:custom_data</code>自定义数据语法将使用先存的NBT部分匹配行为。
* ** 这要求谓词中指定的所有标签都出现在目标项上，但可以忽略其他标签。
* ** 目标的列表必须包含谓词中指定的所有物品，但目标列表也可包含其他物品，这些物品的顺序不影响匹配。
* 中的物品谓词参数在匹配组件和自定义数据方面具有新的语义。
* * 每个指定的组件都必须出现在目标物品上，并且具有完全相等的解析值。
* * 如果没有指定，视为目标物品包含默认组件。
* 和现在接受内联战利品定义。

* ***
* 使用命令生成<code>entity_effect</code>粒子时需要使用颜色参数。
* 格式：<code><nowiki>particle entity_effect <r> <g> <b> <a></nowiki></code>
* * 接受4个从<code>0.0</code>到<code>1.0</code>的浮点数，代表RGBA值。

* ***
* 将参数的最大值由7更改为20。

* ***
* 现在可以不指定玩家（如<code>@s</code>）和声音分类（如<code>neutral</code>）。

* ***
* 现在执行环境为自定义维度也可以生效。

* *实体[谓词](谓词.md)**
* 删除了实体子谓词<code>any</code>。
* 为[物品展示框](物品展示框.md)、[物品展示实体](物品展示实体.md)等仅有单个槽位的实体加入了槽位名称<code>contents</code>。
* 现在实体数据<code>item</code>被<code>contents</code>包含。
* 加入了实体子谓词<code>wolf</code>以匹配狼的变种字段。
* * <code>variant</code>：狼的变种，可以是单一项目、项目列表或标签。
* 实体子谓词：
* * <code>variant</code>字段现在接受单一项目、项目列表或标签。

* *物品谓词**
* 现在指定组件的物品谓词属性被移动到<code>predicates</code>字段中。
* 现在部分物品谓词字段被移入可选字段<code>predicates</code>中，它们的格式与物品堆叠组件相似。
* * 这为未来添加谓词提供便利，且让子谓词与其匹配的组件更相似。
* * 将以下谓词移动为子谓词：
* ** <code>enchantments</code> → <code>minecraft:enchantments</code>
* ** <code>stored_enchantments</code> → <code>minecraft:stored_enchantments</code>
* ** <code>potions</code> → <code>minecraft:potion_contents</code>
* ** <code>custom_data</code> → <code>minecraft:custom_data</code>
* * <code>durability</code>被扩展为谓词<code>minecraft:damage</code>。
* ** 现在会对拥有<code>minecraft:damage</code>组件的任意物品生效；如果物品没有<code>minecraft:damage</code>组件，它将永不匹配。
* ** 现在不再能检测物品是否含有组件，而需获取该组件的值。
* ** 格式：
<div class="treeview">
  ::*
  ::** ：（可选）组件的精确值。
  ::** ：（可选）耐久的精确值，为最大损伤值减的值。
</div>
  * 谓词现在需要物品具有匹配的组件。
  ** 具有默认值的组件可能总是符合条件。
  * 示例：
  : <syntaxhighlight lang="json">{
	"item": {
		"predicates": {
			"minecraft:enchantments": [
				{
					"enchantment": "minecraft:silk_touch",
					"levels": {
						"min": 1
					}
				}
			]
		}
	}
}</syntaxhighlight>
* <code>minecraft:custom_data</code>现在既接受写做字符串的现有SNBT数据，也接受不扁平的标签。
* * 因此<code>*[custom_data~{a:1}]</code>等价于<code>*[custom_data~"{a:1}"]</code>。
* 扩展了用于<code>/execute if|unless items</code>和的物品谓词语法。
* * 现在的语法为：<code><type> [comma-separated list of <test>]</code>。
* ** <code><type></code>可以为物品ID、带有<code>#</code>前缀的物品标签或<code>*</code>以表示任意物品。
* ** <code><test></code>现在有以下3种形式：
* *** <code><component_id>=<value></code>：匹配组件的精确值（与先前的格式相同）。<code><value></code>表示[SNBT格式](SNBT格式.md)的组件值。
* *** <code><component_id></code>：检测组件是否存在。
* *** <code><predicate_id>~<value></code>：检测物品子谓词。
* **** <code><value></code>表示SNBT格式的物品子谓词，除此以外与用于进度和战利品表的JSON文件格式相同。
* **** 示例：<code>*[damage~{durability:{min:3}}]</code>用于匹配剩余至少可用3次的任意堆叠。
* * <code>minecraft:count</code>可用于匹配堆叠数量。
* ** <code>count=<positive int></code>仅当堆叠数等于赋予值时满足。
* ** <code>count~<int range></code>仅当堆叠数在指定范围间时满足。
* *** 例如<code>*[count~{max:2}]</code>将会匹配堆叠数<=2的任意堆叠。
* ** 仅为<code>count</code>时总是满足。
* * 所有<code><test></code>项都可通过<code>!</code>前缀来反选。
* ** 例如<code>*[!count=1]</code>将会匹配数量非1的任意堆叠。
* * <code><test></code>项还可通过<code>|</code>检测多个替代选项。
* ** 例如<code>*[!damage|damage=0]</code>将会寻找没有<code>damage</code>组件**或**此组件值为<code>0</code>的物品。
* 移除了<code>{}</code>语法，它们已被<code>custom_data</code>谓词代替。
* * 因此<code>stick{a:2}</code>现在变为<code>stick[custom_data~{a:2}]</code>。

# = 常规 =
* *[属性](属性.md)**
* 将属性<code>horse.jump_strength</code>重命名为<code>generic.jump_strength</code>，现在对所有实体生效。
* * 控制了一次跳跃的基本冲量。计算优先于跳跃提升或方块属性。

* *[进度触发器](进度触发器.md)**
* 加入了触发器<code>default_block_use</code>，当玩家与方块进行默认交互时触发，例如打开一扇门。
* 加入了触发器<code>any_block_use</code>，当玩家与方块进行任何交互时触发，例如对着方块物品或进行默认交互。

* *[创建新的世界](创建新的世界.md)**
* 将“”选项重命名为“允许命令”。

* *[选择世界菜单](选择世界菜单.md)**
* 将世界描述“作弊”重命名为“命令”。
* 优化世界更改：
* * 现在优化单人游戏世界和运行<code>forceUpgrade</code>的专用服务器也会升级<code>entities</code>和<code>poi</code>目录下的世界内容。

* *[背景图](背景图.md)**
* 移除了[泥土](泥土.md)背景。
* * 现在游戏外的界面以暗化、模糊化的[全景图](全景图.md)作为背景，且大多数原本直接显示于泥土背景上的文字现在使用黑色背景框。
* ** 不使用背景框的文本包括[世界加载屏幕](世界加载屏幕.md)的百分比文本，和跨维度传送时的提示文本。
* * 现在[胜利屏幕](胜利屏幕.md)以[末地传送门](末地传送门（方块）.md)和[末地折跃门](末地折跃门（方块）.md)的动画作为背景。
* 现在游戏内暂停菜单各界面统一以暗化、模糊化的玩家镜头作为背景，且暗化程度有所降低。
* * 方块、物品栏和书的GUI背景不受影响。
* 可以在“辅助功能设置”内调节模糊化背景的模糊强度。
* 可以通过启用Programmer Art资源包恢复泥土背景。
* 现在进入世界加载地形时，会显示全景图。
* 现在从[下界](下界.md)跨越维度或前往下界时，会显示[下界传送门](下界传送门（方块）.md)纹理动画。
* 现在从[末地](末地.md)跨越维度或前往末地时，会显示[末地传送门](末地传送门（方块）.md)纹理动画。
* * 从下界前往末地或从末地前往下界总会显示下界传送门纹理动画。<ref></ref>

* *[闪烁标语](闪烁标语.md)**
* 将“Java 16 + 1 = 17!”闪烁标语改为“Java 16 + 1 + 4 = 21!”。

* *界面**
* 标题和按钮等屏幕元素在不同屏幕上的位置现在更加一致。
* 更新了Realms中的玩家和世界备份界面。
* 列表的顶部和底部现在有更清晰的边界。
* 在可用磁盘空间少于64MB时，加入单人游戏世界前会出现警告界面。
* 在单人游戏中，加载或保存区块出错时会在弹窗中呈现警告。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>41</code>。
* 现在函数中命令的最大长度（包括宏展开）不能超过2,000,000个字符。
* 通过重用部分原版数据包，减少了登录期间服务器发送的数据量。
* 附加于物品堆叠标签字段的非结构化NBT数据现在被结构化的“组件”取代。
* 现在旗帜图案会从<code>-{}-data/<*命名空间*>/banner_pattern/<*id*></code>中加载到动态注册表中。
<div class="treeview">
  * ：根标签。
  ** ：（命名空间ID）用于解析纹理位置。示例：<code>custom:pattern</code>会被解析为<code>assets/custom/textures/entity/banner/pattern.png</code>和<code>assets/custom/textures/entity/shield/pattern.png</code>。
  ** ：一个翻译键前缀。示例：<code>block.minecraft.banner.custom.pattern</code>会被解析为<code>-{}-block.minecraft.banner.custom.pattern.<*所染颜色*></code>。
</div>
* 非默认组件将在物品作为[方块实体](方块实体.md)放置后被存储在<code>components</code>字段中。
* * 当前不保留从组件默认值中移除的组件。
* * 有些组件（如<code>custom_name</code>）仍然由继承序列化处理，因此它们可能不被保留。
* * 如果要将不被自动存储的组件在掉落时恢复，需要在战利品表中添加<code>copy_components</code>函数。
* 用于<code>worldgen</code>定义的整数和浮点数提供器不再包装在<code>type</code>旁的额外<code>value</code>字段中。
* * 例如<code>{"type":"minecraft:uniform","value":{"min_inclusive":0.0,"max_inclusive":1.0}}</code>现在变成了<code>{"type":"minecraft:uniform","min_inclusive":0.0,"max_inclusive":1.0}</code>。

* *[战利品表](战利品表.md)**
* 为熊猫打喷嚏加入了战利品表<code>gameplay/panda_sneeze</code>。

* *[战利品表函数](战利品表函数.md)**
* 函数已分别重命名为。
* * 这些现在适用于目标物品的<code>custom_data</code>组件。
* * <code>set_custom_data</code>中，现在接受SNBT字符串数据和不扁平标签。
* 更新了<code>set_attributes</code>函数。
* * 修饰符<code>slot</code>现在支持值。
* * 修饰符<code>operation</code>的值现在被重命名：
* ** <code>addition</code> → <code>add_value</code>
* ** <code>multiply_base</code> → <code>add_multiplied_base</code>
* ** <code>multiply_total</code> → <code>add_multiplied_total</code>
* * 加入了<code>replace</code>字段，默认为<code>true</code>。
* ** <code>false</code>时，属性会附加。
* <code>set_lore</code>函数：
* * 移除了<code>replace</code>字段。
* * 加入了<code>mode</code>，与中的同名字段格式相同。
* <code>set_written_book_pages</code>函数：
* * <code>pages</code>现在是一个JSON对象而不再是一个JSON文本。
* <code>set_contents</code>
* * 移除了未使用的字段。
* * 加入了必选字段，描述将加入物品的目标组件。
* ** 可选的值为，其中会忽略空堆叠。

* *[配方](配方.md)**
* 现在可以指定物品组件。
* * 的物品堆现在接受。
* * 类型配方的字段现在改为无数量的物品堆叠格式，即必须指定且可指定数据。

* *[函数](Java版函数.md)**
* 函数列表中不再支持嵌套列表。

* *[调试屏幕](调试屏幕.md)**
* 改进了帧生成时间图表。
* * 图表底部的深红色部分显示服务器运行主逻辑的时间，相当于旧图表中的显示值。
* * 浅棕色部分显示用于执行计划任务的时间。
* * 紫色部分显示为每刻执行其他所有代码所花费的时间。
* * 顶部浅绿色（受延迟影响可能显示为黄色或红色）部分显示到下一刻的空闲时间。
* * 显示的<code>min</code>（最小）、<code>avg</code>（平均）和<code>max</code>（最大）聚合值的计算基于前三部分值。
* * 现在允许服务器管理员查看专用服务器的TPS调试图表。

* *[菜单屏幕](菜单屏幕.md)**
* 现在使用或方向键导航进入或退出任意菜单时都会设置默认焦点。

* *[提示框](提示框.md)**
* 鼠标悬停于元素外时，按钮提示框不再显示。

* *[选取方块](选取方块.md)**
* 现在所选取方块的物品提示框中不再显示<code>(+NBT)</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>32</code>。
* 调整了<code>ttf</code>字体提供器的转换功能，使其具有更合理的默认值。
* * <code>shift</code>不再被双重应用，而以直接在游戏UI中显示一些像素替代。
* * 现在字体的字身框与游戏UI的像素大小所匹配，而不再匹配字体的升降部（字面框）之间的距离。
* * 现在字体基线的位置与默认字体一致（低于顶线<code>7</code>像素）。
* 移除了<code>IViewRotMat</code>uniform，实体的<code>Position</code>属性现在位于（相对于摄影机的）世界空间中。
* 灯光方向uniforms不再与视图矩阵预先相乘。
* 移除了纹理。
* 更新了纹理，分别被应用于列表的底部和顶部。
* 加入了纹理，分别被应用于屏幕的背景和列表的背景。
* 更新了精灵图：
* * 。
* 加入了精灵图：
* * 。
* 移除了Realms的纹理：
* * 。
* 加入了纹理来区分[暂停菜单](暂停菜单.md)和[主菜单](主菜单.md)。
* 加入了纹理，渲染于[创建新的世界](创建新的世界.md)选项卡按钮后侧。
* 加入了纹理，渲染于[胜利屏幕](胜利屏幕.md)后侧。
* 现在可以使用[Slicer](https://github.com/Mojang/slicer/releases/tag/v1.1.5)自动工具来升级资源包。
* 地图装饰图标已经从以前的<code>map_icons.png</code>中分离为从<code>textures/map/decorations/</code>目录中加载的图集。
* 加入了<code>trial_chambers</code>地图装饰图标。
* 加入了的状态效果图标纹理。

* *[出生点区块](出生点区块.md)**
* 出生点区块的大小从10（19×19强加载区块）更改为2（3×3强加载区块），以降低内存使用和CPU负荷，减少加载时间。

* *[横扫之刃](横扫之刃.md)**
* ID由<code>sweeping</code>改为<code>sweeping_edge</code>。

* *[标签](Java版标签.md)**
* 将物品标签的值替换为。
* 在方块标签中加入了。
* 将物品标签重命名为。
* 移除了物品标签，因为它与重合。

* *[着色器](着色器.md)**
* 移除了核心着色器定义中未使用的属性数组。
* 移除了未使用的着色器。
* 将仅用于云的着色器替换为。
* 将<code>blur</code>后处理着色器重命名为<code>box_blur</code>。
* 加入了后处理过程可选字段。
* * 为<code>true</code>时，此过程的纹理采样模式由最近邻采样切换到线性插值。
* 加入了后处理着色器。

* *谓词格式**
* 更新了物品谓词格式：
* * 移除了字段。
* * <code>items</code>字段现在支持单一的项、带哈希前缀（<code>#</code>）的物品标签或物品列表。
* * <code>potion</code>被重命名为<code>potions</code>，且现在支持单一的项、带哈希前缀（<code>#</code>）的药水效果标签或药水效果列表。
* * <code>nbt</code>谓词被重命名为<code>custom_data</code>，现在其与组件<code>minecraft:custom_data</code>相匹配。
* * 加入了用于精确匹配组件的新可选字段<code>components</code>。
* ** 被指定的所有组件必须与目标物品上存在的对应组件完全相等，但额外组件会被忽略。
* ** 如果未指定组件，其默认值将假定存在于目标物品上。
* ** 因组件ID而异，格式为组件ID到组件值的映射。
* 更新了方块谓词格式：
* * 移除了字段。
* * <code>blocks</code>字段现在支持单一的项、带哈希前缀（<code>#</code>）的方块标签或方块列表。
* 更新了流体谓词格式：
* * 移除了字段。
* * 现在由<code>fluid</code>字段重命名为<code>fluids</code>，且支持单一的项、带哈希前缀（<code>#</code>）的流体标签或流体列表。
* 更新了实体谓词格式：
* * <code>type</code>字段现在支持单一的项、带哈希前缀（<code>#</code>）的实体类型标签或实体类型列表。
* 更新了定位谓词格式：
* * 现在由<code>biome</code>字段重命名为<code>biomes</code>，且支持单一的项、带哈希前缀（<code>#</code>）的生物群系标签或生物群系列表。
* * 现在由<code>structure</code>字段重命名为<code>structures</code>，且支持单一的项、带哈希前缀（<code>#</code>）的结构标签或结构列表。

* *[聊天](聊天.md)**
* 客户端聊天状态（屏幕上的消息和聊天输入历史记录）现在在进入和退出配置阶段时由客户端保存。
* 消息签名链处理保持不变——进入配置阶段会开始新的会话。
* 如果客户端配置了消息延迟，则等待的消息将在离开世界之前立即发送。
* 服务器可以在配置阶段通过发送<code>reset_chat</code>数据包来清除聊天状态。

* *协议**
* <code>minecraft:chat_command_signed</code>数据包已从<code>minecraft:chat_command</code>中分离。
* * 不接受任何签名参数的命令将使用未签名的数据包，并且将不会传递任意“last seen”的聊天更新。
* 从服务器发送的数据包中的无效数据现在将导致游戏客户端断开连接。

* *其他**
* 当[实体](实体.md)离开或进入[末地](末地.md)时，其到达的区域将保持加载状态<code>15</code>秒，以与[下界传送门](下界传送门.md)的行为相匹配。
* 现在生成[探险家地图](探险家地图.md)、使用命令等方式定位结构所需时间减少。
* 物品或实体中存储的[药水效果](药水效果.md)不再编码默认值。
* 现在启动游戏要求的最低Java版本为21，且需要64位操作系统。
* 现在使用的Java发行版为[Microsoft](wzh:微软.md)构建的OpenJDK 21.0.3。

# 新内容（实验性）
# = 方块 =
* *[沉重核心](沉重核心.md)**
* 一种[碰撞箱](碰撞箱.md)不完整且[含水](含水.md)的方块。
* 可从[试炼密室](试炼密室.md)的[宝库](宝库.md)或柱廊入口密室的奖励箱获得。
* 具有金属音效。
* [硬度](硬度.md)为10，[爆炸抗性](爆炸抗性.md)为1200，合适挖掘工具为[镐](镐.md)，被非创造模式玩家破坏时总会掉落。
* 可被[活塞](活塞.md)推拉。
* 会被[熔岩](熔岩.md)源破坏，但不会被[水流](水流.md)和熔岩流破坏。
* 用于合成[重锤](重锤.md)。

* *[宝库](宝库.md)**
* 生成在[试炼密室](试炼密室.md)的入口、廊尾和决斗室结构中。
* 一种锁着战利品的方块，需要[试炼钥匙](试炼钥匙.md)或[不祥试炼钥匙](不祥试炼钥匙.md)解锁才会喷出奖励。
* * 方块内部有循环展示其战利品表的[物品实体](物品实体.md)，但喷出的物品随机。
* * 其战利品表分为<code>reward_common</code>（普通）<code>reward_rare</code>（稀有）、<code>reward_unique</code>（独有）、<code>reward_ominous_common</code>（不祥普通）<code>reward_ominous_rare</code>（不祥稀有）和<code>reward_ominous_unique</code>（不祥独有）。
* ** 每次解锁时从对应普通战利品表抽取1-3次，另有80%的概率从稀有战利品表抽取1次（20%概率从普通战利品表抽取1次），另有25%的概率从独有战利品表抽取1次（75%概率不抽取）。
* 世界中的每名玩家都有一次解锁某一个宝库的机会。
* * 附近4格内有任一玩家未解锁过该宝库时，其锁孔打开，并产生橙色或蓝色粒子。
* * 若附近4-5格内的玩家都解锁过该宝库，其锁孔闭合，无法对应的试炼钥匙。
* [硬度](硬度.md)为50，没有合适挖掘工具，无法被常规的爆炸破坏。

# = 物品 =
* *[旋风棒](旋风棒.md)**
* 由[旋风人](旋风人.md)掉落。
* 可以合成为4个[风弹](风弹（物品）.md)，也可以与沉重核心合成重锤。

* *[重锤](重锤.md)**
* 一种重型武器。
* 使用1个[沉重核心](沉重核心.md)和1个旋风棒合成。
* 与[剑](剑.md)和[三叉戟](三叉戟.md)一样，创造模式下主手持重锤的玩家不能破坏方块。
* 可以打破饰纹陶罐。
* 击中生物前，玩家<ref></ref>的摔落高度越大，造成的伤害越高。
* * 如果摔落高度大于5格且成功击中目标，则会抵消累积的摔落伤害，重置累积的摔落高度，产生猛击粒子，并会击退目标周围的其他实体。
* 具有250点[耐久度](耐久度.md)，可以在[铁砧](铁砧.md)上使用旋风棒修复。
* 适用以下魔咒：
* * [经验修补](经验修补.md)、[耐久](耐久.md)、[亡灵杀手](亡灵杀手.md)、[节肢杀手](节肢杀手.md)、[火焰附加](火焰附加.md)、[消失诅咒](消失诅咒.md)、[致密](致密.md)、[破甲](破甲.md)和[风爆](风爆.md)。

* *[旗帜图案](旗帜图案.md)**
* 加入了涡流和旋风2种旗帜图案。
* * 可从试炼密室的宝库获得。

* *[锻造模板](锻造模板.md)**
* 加入了镶铆和涡流2种盔甲纹饰锻造模板。
* * 可从试炼密室的宝库获得。
* * 镶铆盔甲纹饰锻造模板可使用[铜块](铜块.md)复制。
* * 涡流盔甲纹饰锻造模板可使用[旋风棒](旋风棒.md)复制。

* *[陶片](陶片.md)**
* 加入了涡流、旋风和刮削3种纹样陶片。
* * 试炼密室中会生成带有这些纹样的饰纹陶罐。

* *[探险家地图](探险家地图.md)**
* 加入了[试炼密室](试炼密室.md)探险家地图。
* * 可通过与老手级[制图师](制图师.md)村民[交易](交易.md)获得。
* * 用于指向最近的试炼密室。

* *[风弹](风弹（物品）.md)**
* 由[旋风棒](旋风棒.md)合成。
* 可由[玩家](玩家.md)和[发射器](发射器.md)发射。
* * 玩家发射的风弹比[旋风人](旋风人.md)发射的多10%击退，但影响范围更小。
* * 玩家被自己发射的风弹击中时会重置摔落伤害，且摔落伤害只会从该玩家上一次受到[风爆](爆炸#风爆.md)的高度以下开始累积。
* 每次使用后有0.5秒的冷却时间。

* *[刷怪蛋](刷怪蛋.md)**
* 加入了[沼骸](沼骸.md)刷怪蛋。

* *[不祥之瓶](不祥之瓶.md)**
* 可由[宝库](宝库.md)和[不祥宝库](不祥宝库.md)喷出，也会在[袭击](袭击.md)外<ref></ref>击杀[袭击队长](袭击队长.md)时掉落。
* 后，瓶子会碎裂，并给予玩家1小时40分钟的[不祥之兆](不祥之兆.md)状态效果。
* 每个不祥之兆效果倍率各有一个物品变种，总共有5种不祥之瓶。
* 最大堆叠数量为64。

* *[不祥试炼钥匙](不祥试炼钥匙.md)**
* [试炼钥匙](试炼钥匙.md)的变种，仅作为不祥试炼刷怪笼的奖励获得。
* 用于解锁不祥宝库。

# = 生物 =
* *[沼骸](沼骸.md)**
* [骷髅](骷髅.md)的新变种。
* * 拥有生命值，少于骷髅的。
* * 攻击间隔是3.5秒，长于骷髅的2秒。
* * 发射[剧毒之箭](剧毒之箭.md)而非普通箭。
* 被玩家或驯服的狼杀死时，有概率掉落1支剧毒之箭。
* 身上有蘑菇，玩家可以[剪刀](剪刀.md)剪下2个蘑菇（红色和棕色蘑菇均有可能）。
* 自然生成于[沼泽](沼泽.md)和[红树林沼泽](红树林沼泽.md)生物群系，也会代替先前的带剧毒之箭的骷髅生成于[试炼密室](试炼密室.md)的部分[试炼刷怪笼](试炼刷怪笼.md)。

# = 非生物实体 =
* *[不祥之物生成器](不祥之物生成器.md)**
* 由激活的不祥试炼刷怪笼周期性生成于附近生物的上方，用于向下投掷[弹射物](弹射物.md)。
* 所显示的物品会不停旋转，同时从周围聚集<code>ominous_spawning</code>粒子直到对应弹射物生成。

# = 游戏内容 =
* *[进度](进度.md)**
* 加入了8个新进度。
* * [](进度#advancements-anchor-adventure.minecraft_trials_edition.md)
* **
* * [](进度#advancements-anchor-adventure.under_lock_and_key.md)
* **
* * [](进度#advancements-anchor-adventure.blowback.md)
* **
* * [](进度#advancements-anchor-adventure.who_needs_rockets.md)
* **
* * [](进度#advancements-anchor-adventure.crafters_crafting_crafters.md)
* **
* * [](进度#advancements-anchor-adventure.lighten_up.md)
* **
* * [](进度#advancements-anchor-adventure.overoverkill.md)
* **
* * [](进度#advancements-anchor-adventure.revaulting.md)
* **

* *[不祥事件](不祥事件.md)**
* 包括[袭击](袭击.md)和不祥试炼的新设计。
* 更改了不祥之兆状态效果的图标和音效。
* 拥有不祥之兆效果的玩家进入村庄后不再直接触发袭击：
* * 不祥之兆会转变为同倍率持续30秒的袭击之兆，这允许玩家在这段时间内饮用[奶桶](奶桶.md)来阻止袭击。
* * 袭击之兆结束时会在玩家获得此效果的位置开始袭击。
* 在袭击外击败[袭击队长](袭击队长.md)不再给予玩家不祥之兆。

# = 常规 =
* *[标签](Java版标签.md)**
* 加入了下列实体类型标签：
* * ：。
* ** 不会被风弹激怒的实体。
* * ：。
* ** 免疫寄生状态效果的实体。
* * ：。
* ** 免疫渗浆状态效果的实体。
* 加入了下列方块标签：
* * ：。
* ** 当被风弹击中时不受爆炸影响的方块。
* 加入了下列物品标签：
* * ：
* ** 可以附上适用于重锤的魔咒的物品。
* 加入了下列旗帜图案标签：
* * ：。
* * ：。

# 更改（实验性）
# = 方块 =
* *[合成器](合成器.md)**
* 更改了模型UV映射，现在顶面纹理不再反转。

* *[试炼刷怪笼](试炼刷怪笼.md)**
* 为了更频繁地提供保障战斗安全的更高质量的食物而调整了战利品表，现在拥有与位于[试炼密室](试炼密室.md)内自然生成时相同的两个默认战利品表。
* 现在每个额外的玩家只会增加0.5的生物数量，而不是2。
* 现在幼年[僵尸](僵尸.md)基本只会一组生成2个。
* 现在只会在玩家处于检测范围内时激活。
* 在<code>spawn_potentials</code>生成数据中加入了可选的字段，用于将指定战利品表内的物品随机选取装备到生成的生物身上。
* * 格式与刷怪笼数据中的同名标签相同。
* 加入了<code>ominous</code>方块状态。
* * 纹理有别于普通试炼刷怪笼，且激活时会发出灵魂火粒子而非普通火焰粒子。
* * 当普通试炼刷怪笼检测到玩家带有[试炼之兆](试炼之兆.md)状态效果，且满足以下条件之一时，它将变成不祥试炼刷怪笼：
* ** 它不在冷却中。
* ** 它在冷却中，但上一次激活时没有变为不祥试炼刷怪笼。
* *** 使普通试炼刷怪笼变成不祥试炼刷怪笼会跳过冷却时间、重置挑战并清除此前由它产生的所有在场生物。
* * 挑战完成且冷却结束后，不祥试炼刷怪笼会变回普通试炼刷怪笼。
* * 生成的怪物如果能穿装备，则有概率装备带有魔咒的武器和[盔甲](盔甲.md)。
* ** 这些盔甲是锁链质、铁质或钻石质的，锻有铜质的涡流或镶铆[盔甲纹饰](盔甲纹饰.md)。
* ** 盔甲魔咒包括[保护](保护.md)IV、[弹射物保护](弹射物保护.md)IV和[火焰保护](火焰保护.md)IV。
* ** 武器魔咒包括[锋利](锋利.md)I、[击退](击退.md)I、[力量](力量（魔咒）.md)I和[冲击](冲击.md)I。
* ** 这些装备不会在死亡时掉落。
* * 会定期在附近生物或玩家（50%概率）的头顶生成[弹射物](弹射物.md)。
* ** 可能为1瓶滞留药水（[蓄风](蓄风.md)I、[盘丝](盘丝.md)I、[渗浆](渗浆.md)I、[寄生](寄生.md)I、[力量](力量（状态效果）.md)I、[迅捷](迅捷.md)I或[缓降](缓降.md)I）、1支[药箭](药箭.md)（[剧毒](剧毒.md)I或[緩速](緩速.md)IV）、1支[箭](箭.md)、1-3个[小火球](小火球.md)、1-3个[风弹](风弹.md)或1-3个[附魔之瓶](附魔之瓶.md)。
* ** 弹射物种类是随机的，但邻近的刷怪笼总会选择同种弹射物。
* * 挑战完成后，它会弹出与普通试炼刷怪笼不同的战利品。
* ** 弹出[不祥试炼钥匙](不祥试炼钥匙.md)的概率是30%而非50%。

# = 物品 =
* *[试炼钥匙](试炼钥匙.md)**
* 更改了纹理。
* 现在可用于解锁宝库。

* *[药水](药水.md)**
* 蓄风药水可用[粗制的药水](粗制的药水.md)和[旋风棒](旋风棒.md)酿造。
* 盘丝药水可用粗制的药水和[蜘蛛网](蜘蛛网.md)酿造。
* 渗浆药水可用粗制的药水和[黏液块](黏液块.md)酿造。
* 虫蚀药水可用粗制的药水和[石头](石头.md)酿造。
* 以上药水及其喷溅型药水、滞留型药水和药箭可在[创造模式物品栏](创造模式物品栏.md)中找到。

# = 生物 =
* *[旋风人](旋风人.md)**
* 加入了空闲时旋转、跳跃前蓄力和反射弹射物的音效。
* 调整了已有的音效。
* 更改了杆的底面纹理，使之更契合相邻纹理的颜色。
* 现在会反弹除风弹以外的所有[弹射物](弹射物.md)，并且反弹的弹射物会朝发射者的方向重新射出。
* 现在被玩家或驯服的狼杀死后会掉落1-2个[旋风棒](旋风棒.md)和，而不是只掉落。
* 现在会主动攻击[铁傀儡](铁傀儡.md)。
* 现在受到非玩家生物攻击后会尝试反击，但不会反击[骷髅](骷髅.md)、[流浪者](流浪者.md)、[僵尸](僵尸.md)、[尸壳](尸壳.md)、[蜘蛛](蜘蛛.md)、[洞穴蜘蛛](洞穴蜘蛛.md)和[史莱姆](史莱姆.md)。
* 现在骷髅、流浪者、僵尸、尸壳、蜘蛛、洞穴蜘蛛和史莱姆被其[风弹](风弹（实体）.md)伤害后不会尝试反击。
* 现在会避免跳到危险的方块上或空中。

# = 非生物实体 =
* *[风弹](风弹（实体）.md)**
* 更改了模型、纹理和动画。
* 旋风人发射的风弹的ID由重命名为。
* 现在使用新的[伤害类型](伤害类型.md)，而不是。
* 现在可以穿过[碰撞箱](碰撞箱.md)不完整的方块。
* 降低了爆炸威力的随机性。
* 现在总会在所在维度的最高建筑高度30格以上立即爆炸。
* 现在会正确计算摔落伤害。
* 现在不会与[末地水晶](末地水晶.md)碰撞。

# = 世界生成 =
* *[试炼密室](试炼密室.md)**
* 加入了决斗室，同时移除了。
* 加入了柱廊，柱廊不再无尽地生成。
* 更改了交叉口和柱廊的布局。
* 移除了结构中的[箱子](箱子.md)，并加入了[宝库](宝库.md)。
* 将结构中的底座方块由涂蜡的铜块和涂蜡的雕纹铜块更改为磨制安山岩和雕纹凝灰岩砖。
* 现在会生成[涂蜡的斑驳铜灯](涂蜡的斑驳铜灯.md)、[涂蜡的锈蚀铜灯](涂蜡的锈蚀铜灯.md)和[涂蜡的氧化铜灯](涂蜡的氧化铜灯.md)，而不是[斑驳的铜灯](斑驳的铜灯.md)、[锈蚀的铜灯](锈蚀的铜灯.md)和[氧化的铜灯](氧化的铜灯.md)。
* 现在其中的[饰纹陶罐](饰纹陶罐.md)会按结构池中的<code>decor.json</code>随机附有涡流、旋风或刮削纹样陶片。
* 现在柱廊的[试炼刷怪笼](试炼刷怪笼.md)生成得更频繁。
* 降低了试炼密室的生成次数。
* 将两个试炼密室之间的平均距离由8区块更改为12区块，最小距离由32区块更改为34区块。
* 现在会更常见地被地形掩埋。
* 为各种决斗室加入了[发射器](发射器.md)陷阱。

# = 游戏内容 =
* *[交易](交易.md)**
* 现在针叶林盔甲匠收购的盔甲无视耐久度。

* *[进度](进度.md)**
* 现在可通过击杀沼骸达成“”进度。
* 将沼骸加入到“”进度的达成要求中。

* *[魔咒](魔咒.md)**
* [致密](致密.md)：
* * 属于常见魔咒，可通过[附魔台](附魔台.md)、交易和战利品中的[附魔书](附魔书.md)获取。
* * 附有此魔咒的[重锤](重锤.md)每摔落一格时造成的伤害会增加。
* ** 每魔咒等级增加。
* [破甲](破甲.md):
* * 属于稀有魔咒，可通过附魔台、交易和战利品中的附魔书获取。
* * 附有此魔咒的重锤可降低目标的[盔甲效果](盔甲机制#伤害减免.md)。
* ** 每魔咒等级使盔甲效果降低15%。
* [风爆](风爆.md)：
* * 属于独有魔咒，除命令外，只能通过不祥宝库获取。
* * 附有此魔咒的重锤需要用猛击击中目标才能将攻击者弹起，且允许玩家不断猛击。
* 以上魔咒均可用进行[附魔](附魔（物品修饰）.md)。

* *[状态效果](状态效果.md)**
* [渗浆](渗浆.md)：
* * 史莱姆免疫此状态效果。
* [寄生](寄生.md)：
* * 蠹虫免疫此状态效果。
* [袭击之兆](袭击之兆.md)：
* * 玩家进入村庄时，其身上的[不祥之兆](不祥之兆.md)效果会变成同倍率的袭击之兆，持续30秒。
* * 此效果结束时，袭击将于玩家获得此效果的位置开始。
* [试炼之兆](试炼之兆.md)：
* * 玩家在普通试炼刷怪笼探测范围内时，其身上的不祥之兆效果就会变成试炼之兆。
* ** 持续时间为15分钟×不祥之兆的放大倍率。
* [蓄风](蓄风.md)、[盘丝](盘丝.md)、渗浆、寄生、袭击之兆和试炼之兆均可用获取。

# = 常规 =
* *[标签](Java版标签.md)**
* 将实体类型标签合并为。
* 在方块标签中加入了。
* 在实体类型标签中加入了。
* 在实体类型标签中加入了。
* 在物品标签中加入了。
* 在物品标签中加入了。
* 在物品标签中加入了。
* 在实体类型标签中加入了。
* 在物品标签中加入了。
* 在魔咒标签的后加入了，在后加入了。

# 修复
异常颠倒。
|72151|雪傀儡投掷的雪球对狼会造成伤害，而不是击退。
|94413|破坏、放置蜘蛛网和在蜘蛛网上行走时播放石头音效。
|100016|单人世界选择屏幕在或透明时显示异常。
|118857|状态效果的以整型存储，但在NBT中以字节型读写。
|118890|插在地上的药箭永不失效。
|123804|探险家地图和灾厄旗帜的名称会在物品展示框中显示，写作斜体，且可用铁砧移除。
|130244|在模式下打开聊天屏幕时无法查看历史聊天消息。
|140397|将两个附魔的无法破坏的物品放入砂轮，会输出两个堆叠的物品。
|140565|带旗帜的灾厄巡逻队队长会掉落2种不可堆叠的不同旗帜。
|148057|在前哨站生成的灾厄旗帜显示图案列表。
|148480|在砂轮里输入两本相同的附魔书只会输出一本书。
|153329|在重载世界前，被拴住的铁傀儡寻路异常。
|153643|调试屏幕渲染在快捷栏物品下层。
|155857|命令不会影响灾厄村民和女巫的AI。
|157133|使用砂轮能将诅咒附魔书堆叠。
|165435|当站在2×2岩浆块气泡柱中间时创造模式玩家不能飞行。
|165948|蜜蜂会被引诱到危险的方块处。
|166361|当使用键盘而非鼠标更改选项时，GUI尺寸不会明显更新。
|167324|多个UI按钮同时高亮。
|167375|幼年海龟字幕文本的语法不正确。
|168407|蜜蜂会被灯笼困住。
|170000|以第一人称视角环顾四周，手上或持有物品的亮度会发生剧烈变化。
|171981|燃料燃烧时间映射在每次物品被放入熔炉时都会重新创建，而不会被缓存。
|172047|狼试图攻击盔甲架。
|173303|重载世界时，被拴住的宠物会传送到玩家身边。
|173672|屏幕标题文本渲染在玩家列表中玩家名称上层。
|174496|玩家的头被放置后丢失名称。
|178410|旗帜作为方块被放置时不储存<code>HideFlags</code>标签。
|184066|重生锚不会产生环境音效。
|184622|离开传送门或通过传送门前往另一维度时播放的声音没有使用其对应的字幕，尽管该字符串存在于中。
|185379|幼年北极熊的字幕没有明确提及其来自幼年北极熊。
|186626|在自定义维度中无效。
|187267|屏幕标题文本渲染在侧边栏上层。
|187372|调试屏幕中FPS限制与垂直同步或图像等级间没有空格。
|187616|不死图腾使用后1秒渲染过暗。
|187746|“编辑游戏规则”屏幕中的游戏规则按钮即使被遮盖，也会被高亮。
|188497|生成时不能设定。
|189211|从炼药锅中舀水的统计数据被屏幕底部的叠加层略微覆盖。
|189484|统计数据屏幕选项卡选择框未居中。
|193202|当NBT数据加载后，会重置驯服的狼的生命值。
|193460|侧边栏和调试屏幕文本分层不一致。
|193511|屏幕标题文本渲染在复述功能文本上层。
|193515|Boss栏文本渲染在复述功能文本上层。
|193517|Boss栏文本渲染在侧边栏上层。
|193521|Boss栏文本渲染在调试屏幕文本上层。
|193524|Boss栏文本的删除线与下划线渲染在玩家列表上层。
|193656|旗帜方向导致其破坏纹理位移或反复水平翻转。
|193753|重生锚使用了与传送门一样的环境音效字幕。
|194948|、物品展示框和拴绳被破坏时的字幕与方块被破坏时的字幕不一致。
|195572|与基岩版相比，当抗火状态生效时，从熔岩中冒出的雾更密集。
|198787|方法使用了低效的Stream API。
|198963|聊天文本渲染在玩家列表中玩家名称上层。
|199973|沾水的狼与上个版本相比渲染得更暗了。
|200947|<code>map_icons.png</code>纹理文件中有大量未使用的空白。
|200987|Boss栏的标题会破坏HUD的不透明度。
|207353|如果攻击造成0伤害，则恶魂火球和风弹不能被近战反射。
|208528|喂食已驯服的幼年狼、猫会切换其站起/坐下状态。
|217084|玩家的头的NBT<code>ExtraType</code>在不使用<code>DataFixerUpper</code>升级路径时不再被存储。
|219899|对缠根泥土使用骨粉时，产生的粒子在方块上方，而垂根是在下方生长的。
|219967|当接收到无效ID的数据包时，会发生<code>IndexOutOfBoundsException</code>而不是“Bad packet ID”消息。
|221754|为狼解开拴绳后，它不再攻击。
|225170|在某些情况下正常矩阵缩放损坏。
|226775|熄灭蜡烛时显示不准确的字幕。
|228486|在macOS上不能使用切换窗口。
|229680|若开着箱子、陷阱箱、末影箱、木桶GUI时走远，这些方块会停止工作。
|229919|蜜蜂不能识别下方有营火、上方有方块的蜂箱或蜂巢。
|232489|从花盆中取出植物时无视物品栏。
|232560|为已驯服的狼解开栅栏上的拴绳后，它的速度降低。
|234406|与Realms界面中的“”按钮交互时，泥土背景变动。
|234558|Realms“”界面没有标题。
|234889|显示在HUD的状态效果图标会与Boss栏重叠。
|238242|物品栏状态效果图标右上角有多余的黑色像素。
|239084|物品拾取动画比实际的物品模型更暗。
|248076|特定类型的烟花火箭在被后不可堆叠到一起。
|248961|当玩家装备上头盔时，进度准则的计算有误。
|249136|尝试定位埋藏的宝藏或是打开/破坏内含地图的箱子时，会出现卡顿或造成服务端延迟。
|249335|对红树树叶使用骨粉时，产生的粒子在方块中心而非下方。
|251027|头盔不会将下落的铁砧或钟乳石造成的伤害减少。
|251042|多人游戏第三方警告按钮在非英文语言中的位置不合适。
|251303|屏幕中的Boss栏多于1个时，它们的透明度失效了。
|251509|旗帜图案不能合理堆叠/旗帜被破坏后失去“<code>banner</code>”ID。
|252409|调试屏幕的内存统计中存在多余的空格。
|259142|朝下的木桶在漏斗上方时，漏斗仍会拾取物品。
|259355|由于有时不检查位置是已加载还是在世界外，游戏崩溃了。
|259587|负数耐久值导致物品耐久条渲染错误。
|260099|嗅探兽在嗅探时的鼻子阴影发生变化。
|260889|玩家可以在放置距离外的方块上使用水桶和熔岩桶。
|260921|使用键盘在统计页面导航时，数据总是最后被选中的。
|261577|使用望远镜且站在下界传送门内时，下界传送门的叠加层将完全不透明。
|261596|工作台的“搜索”键盘快捷键无法使用。
|261846|日文使用中文的字体。
|262503|与<code>options_background.png</code>不匹配。
|263256|聊天栏渲染在玩家列表上层，这会挡住一部分信息。
|263315|疣猪兽和僵尸疣猪兽的攻击目标不会被检测到。
|263641|Boss栏文本不再显示在状态效果图标后面。
|263872|多人游戏目录中的“”元素不可被鼠标指针选中。
|263874|统计数据目录中的元素列表不可被鼠标指针选中。
|264456|被青蛙和美西螈选为目标的实体不会被检测到。
|264597|调试屏幕的下划线渲染在字幕上层。
|264637|文本着色器资源包导致字幕闪烁。
|264684|太长的宏静默失效。
|264821|实体所穿盔甲上的雾出现得太早。
|265273|使用键在创建世界屏幕的标签页列表中导航时，未通过突出显示或渲染边界来示明聚焦状态。
|265390|命令提供错误的输出。
|265520|切换连接协议有时会产生错误。
|265541|即使文件不存在，游戏也不会读取。
|265585|含水屏障不会漫射天空光照。
|265661|某些特定的窗口大小会导致“实验性功能需求”数据包界面内泥土背景与返回按钮重叠。
|265669|快捷栏文本渲染在字幕背景上层，但在字幕文本下层。
|265709|（仅限服务器）GUI中超过第32行的切石机输出终止。
|265741|含水屏障不在地图上显示。
|265749|按钮文本或字段的值改变时，提示框会闪烁。
|266135|缓存的宏命令在执行时无视权限等级，可导致命令被越权执行。
|266136|宏函数执行时无视服务器设置，包括在该项设定为低于默认值的情况。
|266334|潜影弹会破坏盔甲架。
|266389|对洞穴藤蔓使用骨粉时，产生的粒子过少。
|266589|创造模式下按下使用键交换盔甲会同时改变其耐久值。
|266628|鼠标轮询率过高会导致卡顿。
|266960|Boss栏文本渲染在玩家列表背景上层，但在玩家图标下层。
|266990|拥有相同标签值，但标签数据不同的地图可导致玩家标记消失。
|266997|破坏正在播放闭合动画的潜影盒时，天空光照不更新。
|267433|光标持有相同物品时使用双击不会转移物品。
|;1.20.3的漏洞
|265835|使用望远镜时，屏幕边缘的冻结效果将完全不透明。
|266032|尝试在合成器中复制“”成书时行为不正确。
|266055|开关铜门或铜活板门时，手持斧，会获得“”进度；手持蜜脾，会获得“”进度。
|266144|铜门没有物品标签。
|266145|铜活板门不属于物品标签。
|266308|铜灯有未使用的“关闭”音效。
|266430|在不完整方块上的旋风人会产生更下方方块的粒子效果。
|266432|试炼密室内处于斑驳、锈蚀、氧化状态的铜灯没有被涂蜡。
|266449|旋风人不攻击或反击视野中的生物。
|266467|风弹在空中飞行不流畅。
|266469|被攻击时，旋风人有时会停止寻路、跳跃或发射风弹。
|266532|旋风人会被某些弹射物击中。
|266533|旋风人使用的AI在开阔地形中有严重缺陷。
|266570|风弹无法穿过方块轮廓箱。
|266577|试炼密室中一些试炼刷怪笼生成的生物可以被自然清除。
|266680|旋风人在具有发光效果时，发光轮廓没有包含眼睛与眉毛。
|266685|与实际模型大小相比，旋风人的实体阴影过大。
|266688|旋风人模型上发光的眼睛对资源包不友好。
|266707|试炼刷怪笼不受其规则影响。
|266738|字幕的字符串具有误导性，且与其他字符串不一致。
|266879|透过旋风人的眼睛和眉毛能够观察到云、实体判定框、方块边界框（特别是有特殊渲染的）和附魔光效。
|266909|旋风人停止移动时不会平缓地过渡到空闲状态。
|266999|旁观模式下玩家依然能看到合成器的按钮提示框。
|267044|刻状态字符串中词语用法不一致。
|267045|部分与刻有关的字符串缺少冠词，表述不清。
|267086|通过冻结游戏后，指南针无法正确指示出生点位置。
|267104|旋风人的杆的底面纹理不正确，与相邻颜色不契合。
|267133|旋风人周围没有陆地且与玩家处于同一高度时不会攻击或移动。
|267149|合成器顶面的UV纹理映射是反转的。
|267193|在聊天中执行带有的函数返回成功而非失败。
|267352|中不存在<code>Player</code>标签时，单人世界不加载。
|267465|1.20.3中的上传错误：<code>Cannot invoke "ctt.c()" because "this.b" is null</code>。
|267868|原版资源包未在首次启动时完全启用。
|269472|当<code>table_bonus</code>战利品表条件具有空概率列表时，游戏崩溃。
|;1.20.4的漏洞
|267194|分支里的在执行无返回值的函数时存在不一致的行为。
|267732|命令的参数仍为7。
|267747|启用时，在聊天框的单击或悬停事件不生效。
|267866|熊猫掉落黏液球依赖于硬编码。
|267451|在1.20.4中用铁砧命名的物品不与在更早版本命名的物品堆叠。
|267500|UUID的前两个或后两个整数为0时，物品上的属性修饰符无效。
|267975|Realms中渲染的玩家列表比它的可见尺寸大。
|267976|Realms玩家列表中的滚动条不再能被鼠标指针拖动。
|268000|使用给予玩家一个头颅时，客户端崩溃。
|268011|漏斗会泄漏上个被其吸取过物品实体的世界。
|268022|“实验性功能需求”菜单内的列表控件不能被鼠标指针选中。
|268110|删除世界中止于文件目录报错。
|268236|社交屏幕的搜索栏不被默认选中。
|268355|会使已加载区块过期。
|268597|玩家发射或反射的风弹击中旋风人时会被困于其中，直到旋风人移动。
|268624|“”文本渲染于暂停菜单背景底部而非其顶部。
|269083|物品栏中的状态效果背景纹理将半透明像素渲染为不透明像素。
|269085|经验条和蓄力条将半透明像素渲染为不透明像素。
|269279|Realms玩家界面内的“普通玩家”按钮英文大小写错误。
|269496|在矿车或船中与旋风人战斗不会受到任何伤害。
}}

# 你知道吗
* 因为（当前被标记为“不予修复”），原计划在“”[实验性内容](实验性内容.md)中加入的致密、破甲和风爆魔咒及蓄风、盘丝、渗浆、寄生、袭击之兆和试炼之兆状态效果也可在未启用此实验性内容的世界中通过[物品堆叠组件](物品堆叠组件.md)获取。

# 参考

# 导航

[de:1.20.5](de:1.20.5.md)
[en:Java Edition 1.20.5](en:Java Edition 1.20.5.md)
[es:Java Edition 1.20.5](es:Java Edition 1.20.5.md)
[fr:Version Java 1.20.5](fr:Version Java 1.20.5.md)
[ja:Java Edition 1.20.5](ja:Java Edition 1.20.5.md)
[pt:Edição Java 1.20.5](pt:Edição Java 1.20.5.md)
[ru:1.20.5 (Java Edition)](ru:1.20.5 (Java Edition).md)
[uk:1.20.5 (Java Edition)](uk:1.20.5 (Java Edition).md)