# Java版24w12a

*页面ID: 114780* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w12a**是[Java版1.20.5](Java版1.20.5.md)的第13个快照，发布于2024年3月20日<ref></ref>，在内置实验性数据包中加入了[试炼密室地图](试炼密室地图.md)和7个新[进度](进度.md)，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了以下方块标签：
* *
* ** 合适挖掘工具**不**是对应品质工具的方块，结合了现有的标签。
* 加入了以下物品标签：
* * ：
* ** 肉类物品。未被游戏直接使用，但可能包含于其他标签中。
* *
* ** 可以用于喂食或引诱对应生物的物品。
* 加入了以下实体类型标签：
* * ：
* ** [亡灵杀手](亡灵杀手.md)魔咒会对其产生额外伤害的实体。

* *[进度触发器](进度触发器.md)**
* 加入了进度触发器<code>crafter_recipe_crafted</code>，当[合成器](合成器.md)将物品喷出时触发。
* * <code><player></code>，实体谓词，用于匹配附近玩家。
* * <code><recipe_id></code>，配方ID，用于匹配一个合成配方。
* * <code><ingredients></code>，匹配合成所用的配方成分列表，子项均为物品谓词。
* 加入了进度触发器<code>fall_after_explosion</code>，在玩家被[爆炸](爆炸.md)击飞后摔落时触发。
* * <code><player></code>，匹配正在摔落的玩家的实体谓词。
* * <code><start_position></code>，匹配玩家受到爆炸坐标的位置谓词。
* * <code><distance></code>，匹配玩家从<code>start_position</code>起摔落高度的距离谓词。
* * <code><cause></code>，匹配造成爆炸的实体谓词。

* *[战利品表](战利品表.md)**
* 加入了<code>storage</code>数值提供器。此提供器能获取命令存储中数据标签所提供的数值。
* * 如果选择的存储不存在、路径选择的标签不为数字或标签不存在，则返回<code>0</code>。
* * 格式：
* ** <code>storage</code>：命令存储的命名空间ID。
* ** <code>path</code>：NBT路径。

* *[战利品表函数](战利品表函数.md)**
* ; ：修改物品组件提示框的可见性的新函数，可设置等字段而不更改其他值。
<div class="treeview">
  ** ：支持的物品组件类型与布尔值的键值对。
  *** ：控制此组件是否在提示框中可见。受支持的组件包含：。
</div>
  * 示例：<code>{function:"toggle_tooltips","toggles":{"enchantments":false}}</code>将会隐藏魔咒提示框。

* *[物品堆叠组件](物品堆叠组件.md)**
* ; ：（[食物](食物.md)隐含与其类型对应的默认值）控制物品是否可以作为食物被食用。
<div class="treeview">
  ** ：（不小于<code>0</code>）食用该物品后增加的[饥饿值](饥饿值.md)。
  ** ：食用物品后增加的饱和度的修饰符（即[营养价值](食物#营养价值.md)）。如果此值为*s*，为*n*，则食用物品后增加<math>2sn</math>[饱和度](饱和度.md)。
  ** ：（可选，默认为<code>false</code>）此物品能否无视当前饥饿值而食用。
  ** ：（可选，默认为<code>1.6</code>）食用该物品消耗的秒数。
  ** ：（可选，默认为<code>[]</code>）该物品被食用后施加的[状态效果](状态效果.md)列表。
  *** ：一项状态效果，与组件中的中的复合标签格式相同。
  *** ：（可选，不大于1且不小于0，默认为<code>1</code>）施加此状态效果的概率。
</div>
  * 示例：<code>food={nutrition:4,saturation_modifier:0.1}</code>。
* ; ：（大于<code>0</code>且小于<code>100</code>；各物品所隐含的默认值通常为<code>64</code>）控制物品的最大堆叠数。
* * 示例：<code>max_stack_size=4</code>。
* ; ：（大于<code>0</code>，可损伤物品隐含对应默认值）控制物品可受的最大损伤值。
* * 示例：<code>max_damage=123</code>。
* * 如果此组件不存在，则物品不能被损伤。
* ; ：（空对象，[下界合金](下界合金.md)等抗火物品隐含默认值）控制物品是否不会在火焰中燃烧。
* * 示例：<code>fire_resistant={}</code>。
* ; ：（大多数物品默认为<code>common</code>，[金苹果](金苹果.md)等特殊物品隐含对应的默认值）[稀有度](稀有度.md)，控制物品名称的颜色。
* * 枚举值可以为：
* ** <code>common</code>（常见）：白色，附魔后为青色。
* ** <code>uncommon</code>（少见）：黄色，附魔后为青色。
* ** <code>rare</code>（稀有）：青色，附魔后为亮紫色。
* ** <code>epic</code>（史诗）：亮紫色。
* * 示例：<code>rarity=rare</code>。
* ; ：（原版[工具](工具.md)隐含与其[品质](品质.md)和类型对应的默认值）控制物品的工具性。
<div class="treeview">
  ** ：规则列表。
  *** ：一项规则。
  **** ：可交互的单一方块、带哈希前缀（<code>#</code>）的方块标签或方块列表。
  **** ：（可选）覆盖对可交互方块的[挖掘](挖掘.md)速度。
  **** ：（可选）覆盖此物品是否为破坏此类方块的合适工具。如果为<code>true</code>此工具将最效率地破坏对应方块且允许它（们）掉落。
  *** ：（默认为<code>1.0</code>）如果没有规则匹配时用以覆盖的挖掘速度。
  *** ：（可选，大于等于<code>0</code>）此工具每破坏一个此类方块所消耗的[耐久度](耐久度.md)。
</div>
  * 示例：<code>tool={rules:[{blocks:"#mineable/pickaxe",speed:4.0,correct_for_drops:true}]}</code>
* ; ：（空对象）控制是否隐藏物品包括物品名称在内的整个提示框。
* * 在[创造模式](创造模式.md)中仍然可见且可被搜索。

# 更改
# = 命令格式 =
* ***
* 使用命令生成<code>entity_effect</code>粒子时需要使用颜色参数。
* 格式：<code><nowiki>particle entity_effect <r> <g> <b> <a></nowiki></code>
* * 接受4个从<code>0.0</code>到<code>1.0</code>的浮点数，代表RGBA值。

* *和**
* 现在也接受内联战利品定义。

* ***
* 现在也接受内联战利品定义。
* 的SNBT值现在具有与匹配的JSON文件相同的结构，但它仍是硬编码的。
* * 示例：<code>execute if predicate {condition:weather_check, raining:true}</code>。

* *物品谓词参数**
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
* * 因此<code>stick{a:2}</code>现在变成了<code>stick[custom_data~{a:2}]</code>。

* *[谓词](谓词.md)**
* 物品子谓词：
* * <code>minecraft:custom_data</code>现在既接受写做字符串的现有SNBT数据，也接受不扁平的标签。
* ** 因此<code>*[custom_data~{a:1}]</code>等价于<code>*[custom_data~"{a:1}"]</code>。
* 实体子谓词：
* * 加入了实体子谓词<code>wolf</code>以匹配狼的变种字段。
* ** <code>variant</code>：狼的变种，可以是单一项目、项目列表或标签。
* *
* ** <code>variant</code>字段现在接受单一项目、项目列表或标签。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>36</code>。
* 从物品数据中删除了冗余的自定义数据部分（<code>{…}</code>），因为它已被<code>[custom_data={…}]</code>完全取代。
* 更改了<code>wolf_variant</code>的格式。
* * 将字段<code>texture</code>重命名为<code>wild_texture</code>。
* * 不再需要<code>textures/</code>前缀和<code>.png</code>后缀。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>30</code>。
* 将地图装饰图标从以前的<code>map_icons.png</code>中分离为从<code>textures/map/decorations/</code>目录中加载的图集。
* 加入了<code>trial_chambers</code>地图装饰图标。
* 可以使用[Slicer](https://github.com/Mojang/slicer/releases/tag/v1.1.4)自动工具来升级资源包。

* *[标签](Java版标签.md)**
* 将物品标签重命名为。

* *[战利品表函数](战利品表函数.md)**
* <code>set_lore</code>函数：
* * 移除了<code>replace</code>字段。
* * 加入了<code>mode</code>，与中的同名字段格式相同。
* <code>set_written_book_pages</code>函数：
* * <code>pages</code>现在是一个JSON对象而不再是一个JSON文本。
* 函数列表中不再支持嵌套列表。

# 新内容（实验性）
# = 物品 =
* *[探险家地图](探险家地图.md)**
* 加入了试炼密室地图。
* * 可与老手级[制图师](制图师.md)村民[交易](交易.md)获得。
* * 用于指向最近的[试炼密室](试炼密室.md)。

# = 游戏内容 =
* *[进度](进度.md)**
* 加入了7个新进度。
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

# 更改（实验性）
# = 方块 =
* *[沉重核心](沉重核心.md)**
* 现在可以[含水](含水.md)。
* 现在不会被[水流](水流.md)和[熔岩](熔岩.md)流破坏，但仍会被熔岩源破坏。
* 现在可以被[活塞](活塞.md)推拉。
* [地图基色](地图基色.md)由黑色更改为银色（<code>METAL</code>）。
* 硬度由30降低到10，爆炸抗性由30提高到1200。

# = 物品 =
* *[重锤](重锤.md)**
* 加入了摔落距离超过5格时的新攻击音效。
* 现在不再是[蜘蛛网](蜘蛛网.md)的合适挖掘工具，也不再能加速挖掘方块。
* 现在其合成配方是有序的。

# = 世界生成 =
* *[试炼密室](试炼密室.md)**
* 降低了生成次数。
* 将两个试炼密室之间的最小距离由8区块更改为12区块，平均距离由32区块更改为34区块。

# 修复
时，在聊天框的单击或悬停事件不生效。
|269083|物品栏中的状态效果背景纹理将半透明像素渲染为不透明像素。
|269085|经验条和蓄力条将半透明像素渲染为不透明像素。
|;dev
|267933|创造模式物品栏中找不到精准采集和时运附魔书。
|267943|专属于铁砧的魔咒可从附魔台获取。
|268068|在某些分辨率下，Realm“重置世界”菜单中的部分文本可能相交。
|268171|在Minecraft中，某些GUI纹理不再透明。
|268311|节肢杀手魔咒使用的是<code>#arthropods</code>标签而不是<code>#sensitive_to_bane_of_arthropods</code>。
|268312|穿刺魔咒使用的是<code>#aquatic</code>标签而不是<code>#sensitive_to_impaling</code>。
|268343|风弹被击飞后，飞行路线不自然地卡顿。
|268510|具有<code>Unbreakable:1b</code>标签的物品不再能附上耐久魔咒。
|268556|风弹穿过碰撞箱不完整的方块而非发生碰撞。
|269169|狼的变种不在进度准则中。
|269268|组件对锻造台配方不生效。
|269280|滚动条存在时，不兼容的资源包或数据包的右侧无法正确渲染。
|269299|“实验性内容”菜单中的红色文本不可被叙述，也不能被选中。
|269336|<code>set_enchantments</code>物品修饰器倍率大于255时崩溃。
|;prev
|269354|<code>minecraft:item.mace.smash_air</code>声音事件的字幕显示为原始翻译字符串。
|269356|即使沉重核心的方块状态表示其有方向，但它的方向不能被改变。
|269361|风弹反弹的行为很奇怪。
|269373|不工作。
|269393|风弹击中实体时游戏崩溃。
|269401|<code>minecraft:set_written_book_pages</code>物品修饰器与不一致。
|269403|重锤挖掘任意方块的速度比徒手快。
|269409|不可执行。
|269419|沉重核心不含水。
|269422|细雪上的地毯不再抵消摔落伤害。
|269452|使用<code>mode</code>为<code>replace_section</code>且带有非常大的<code>size</code>值的物品修饰器时崩溃。
|269457|<code>set_lore</code>物品修饰器超过256个项时崩溃。
|269513|重锤能破坏蜘蛛网。
}}</onlyinclude>

# 参考

# 导航

[de:24w12a](de:24w12a.md)
[en:Java Edition 24w12a](en:Java Edition 24w12a.md)
[es:Java Edition 24w12a](es:Java Edition 24w12a.md)
[fr:Édition Java 24w12a](fr:Édition Java 24w12a.md)
[ja:Java Edition 24w12a](ja:Java Edition 24w12a.md)
[lzh:二四週一二甲](lzh:二四週一二甲.md)
[pt:Edição Java 24w12a](pt:Edição Java 24w12a.md)
[ru:24w12a (Java Edition)](ru:24w12a (Java Edition).md)
[uk:24w12a (Java Edition)](uk:24w12a (Java Edition).md)