# Java版24w09a

*页面ID: 113900* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w09a**是[Java版1.20.5](Java版1.20.5.md)的第10个快照，发布于2024年2月28日<ref></ref>，加入了[狼铠](狼铠.md)和[沼骸](沼骸.md)的新特性，重新设计了[背景图](背景图.md)，弃用了物品的NBT标签，优化了物品堆叠，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[战利品表](战利品表.md)**
* 战利品表抽取项<code>loot_table</code>（从提供的嵌套战利品表返回所有物品）现在有以下语法：
* * <code>value</code>可以是：
* ** 一个命名空间ID，指对另一个战利品表的引用。
* ** 完整的战利品表，格式与独立文件的战利品表相同。
* 加入了函数<code>set_components</code>，用于在输入物品上添加或替换给定组件。
* * <code>conditions</code>，条件列表，默认为<code>[]</code>。
* ** 在应用函数之前要检查的条件。
* * <code>components</code>，组件ID到组件值的映射，格式因ID而异。
* ** 带有“!”前缀的组件将导致该组件被删除。
* 加入了函数<code>copy_components</code>，用于将组件从指定源复制到物品上。
* * 现在在原版数据包中使用它来代替函数。
* * <code>conditions</code>，条件列表，默认为<code>[]</code>。
* ** 在应用函数之前要检查的条件。
* * <code>source</code>，被提取组件的资源类型，当前必须为<code>block_entity</code>。
* * <code>components</code>，被复制的组件ID列表。

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
  :*; ：（默认为<code>{levels:{}}</code>）存储物品的魔咒及其等级。
  :** ：（允许多个项）。
  :*** ：（可选，默认为1，不小于0且不大于255）魔咒及其对应的等级。
  :** ：（默认为<code>true</code>）表示物品提示框中是否显示魔咒。用于替代标签的第1个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>enchantments={levels:{'minecraft:protection':2},show_in_tooltip:false}</code>。
<div class="treeview">
  :*; ：（附魔书默认为<code>{levels:{}}</code>）存储[附魔书](附魔书.md)上的魔咒及其等级，但魔咒的实际效果不会因为此组件的挂载而生效。
  :** ：（允许多个项）。
  :*** ：（可选，默认为1，不小于0且不大于255）魔咒及其对应的等级。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示魔咒。用于替代标签的第6个二进制位。
</div>
  :* 替代了附魔书标签。
  :; ：（JSON聊天组件字符串）覆盖物品原名称的自定义名称。
  :* 替代了标签。
  :* 示例：<code>-{}-custom_name='{"text": "此物品被重命名过了！", "color": "red"}'</code>。
<div class="treeview">
  :*; ：（默认为<code>[]</code>，最多包含64个项）物品提示框中附加的描述性信息列表。
  :** ：一个JSON聊天组件字符串，表示一行文本。
</div>
  :* 替代了标签。
  :* 示例：<code>-{}-lore=['{"text": "蛋糕是个谎言！"}']</code>。
<div class="treeview">
  :*; ：控制冒险模式玩家可以用此物品破坏哪些方块。
  :** ：（可选）代替原来字符串的方块谓词列表。
  :*** ：可以为单个方块、方块列表或带哈希前缀（<code>#</code>）的方块标签。
  :*** ：（可选）可解析的方块实体NBT。
  :*** ：（可选）一个表示方块状态的映射表（map），映射键为方块状态的属性名，映射值为该方块状态对应的可用值。
  :** ：（可选）单个方块谓词，如<code>can_break={blocks:'minecraft:stone'}</code>。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示该物品可破坏的方块。用于替代标签的第4个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>can_break={predicates:{blocks:'minecraft:furnace',state:{facing:'north'}}</code>。
<div class="treeview">
  :*; ：控制冒险模式玩家可以把此物品放在哪些方块上。
  :** ：（可选）代替原来字符串的方块谓词列表。
  :*** ：可以为单个方块、方块列表或带哈希前缀（<code>#</code>）的方块标签。
  :*** ：（可选）可解析的方块实体NBT。
  :*** ：（可选）一个表示方块状态的映射表（map），映射键为方块状态的属性名，映射值为该方块状态对应的可用值。
  :** ：（可选）单个方块谓词，如<code>can_place_on={blocks:'minecraft:stone'}</code>。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示此物品能放在哪些方块上。用于替代标签的第5个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>can_place_on={predicates:{blocks:'minecraft:furnace',state:{facing:'north'}}</code>。
<div class="treeview">
  :*; ：表示应用于可染色物品（拥有物品标签<code>#dyeable</code>的物品）的颜色。
  :** ：RGB值。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示“已染色”。用于替代标签的第7个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>dyed_color={rgb:16711680}</code>。
<div class="treeview">
  :*; ：（默认值为该物品类型的属性，一般物品默认为<code>{modifiers:[]}</code>）控制在物品上应用的属性修饰符。
  :** ：属性修饰符列表。
  :*** ：一个属性修饰符ID，代替了。
  :*** ：只有当装备在指定的槽位时，修饰符才会生效。代替了。值可以为<code>any</code>（默认）、<code>hand</code>（新增，无论主手或副手）、<code>armor</code>（新增，任意盔甲槽）、<code>mainhand</code>、<code>offhand</code>、<code>head</code>、<code>chest</code>、<code>legs</code>和<code>feet</code>。
  :*** ：同一个id只能存在一个修饰符。代替了。
  :*** ：可读的属性文本，代替了。
  :*** ：计算中调整修饰符的数值，代替了。
  :*** ：定义修饰符对属性的基础值的[运算方法](属性#运算模式.md)。代替了。值可以为<code>add_value</code>（加法，曾为<code>0</code>）、<code>add_multiplied_base</code>（与基值相乘，曾为<code>1</code>）和<code>add_multiplied_total</code>（与总值相乘，曾为<code>2</code>）。
  :** ：（可选，默认为<code>true</code>）表示物品提示框中是否显示属性。用于替代标签的第2个二进制位。
</div>
  :* 替代了标签。
  :* 示例：<code>attribute_modifiers={modifiers:[{type:'minecraft:generic.scale',uuid:[1,2,3,4],name:'大！',amount:1.0,operation:'add_multiplied_base'}]}</code>。<ref>官网更新日志的示例少了一对大括号，参见</ref>
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
  :*; ：（地图默认为<code>{}</code>）包含地图上的图标列表，用于[探险家地图](探险家地图.md)。
  :** ：一个图标。
  :*** ：图标种类。值可以为<code>player</code>（曾为<code>0</code>）、<code>frame</code>（曾为<code>1</code>）、<code>red_marker</code>（曾为<code>2</code>）、<code>blue_marker</code>（曾为<code>3</code>）、<code>target_x</code>（曾为<code>4</code>）、<code>target_point</code>（曾为<code>5</code>）、<code>player_off_map</code>（曾为<code>6</code>）、<code>player_off_limits</code>（曾为<code>7</code>）、<code>mansion</code>（曾为<code>8</code>）、<code>monument</code>（曾为<code>9</code>）、<code>banner_white</code>（曾为<code>10</code>）、<code>banner_orange</code>（曾为<code>11</code>）、<code>banner_magenta</code>（曾为<code>12</code>）、<code>banner_light_blue</code>（曾为<code>13</code>）、<code>banner_yellow</code>（曾为<code>14</code>）、<code>banner_lime</code>（曾为<code>15</code>）、<code>banner_pink</code>（曾为<code>16</code>）、<code>banner_gray</code>（曾为<code>17</code>）、<code>banner_light_gray</code>（曾为<code>18</code>）、<code>banner_cyan</code>（曾为<code>19</code>）、<code>banner_purple</code>（曾为<code>20</code>）、<code>banner_blue</code>（曾为<code>21</code>）、<code>banner_brown</code>（曾为<code>22</code>）、<code>banner_green</code>（曾为<code>23</code>）、<code>banner_red</code>（曾为<code>24</code>）、<code>banner_black</code>（曾为<code>25</code>）、<code>red_x</code>（曾为<code>26</code>）、<code>village_desert</code>（曾为<code>27</code>）、<code>village_plains</code>（曾为<code>28</code>）、<code>village_savanna</code>（曾为<code>29</code>）、<code>village_snowy</code>（曾为<code>30</code>）、<code>village_taiga</code>（曾为<code>31</code>）、<code>jungle_temple</code>（曾为<code>32</code>）和<code>swamp_hut</code>（曾为<code>33</code>）。
  :*** ：世界坐标。
  :*** ：世界坐标。
  :*** ：以度为单位从北方顺时针旋转。代替了先前的。
</div>
  :* 示例：<code>map_decorations={'Some marker':{type:'target_x',x:123.0,z:-45.0,rotation:0.0f}}</code>。
  :; ：用于引用持有地图内容和地图标记的共享映射档案。
  :* 替代了标签。
  :* 示例：<code>map_id=1</code>。
  :; ：用于替换自定义物品模型。
  :* 示例：<code>custom_model_data=43</code>。
<div class="treeview">
  :*; ：（药水和药箭物品有默认值<code>{}</code>）控制药水、喷溅药水和滞留药水的效果以及附着于物品上的药水效果。
  :** ：（可选）药水ID，也指物品中的药水类型。拥有此组件的物品会继承药水的所有效果。
  :** ：（可选）RGB值，用于覆盖药水的视觉颜色。
  :** ：（可选，默认为<code>[]</code>）额外对物品附加的自定义状态效果列表，其显示可与现有药水种类不同。
</div>
  :* 替代了标签、和。
  :* 示例：<code>potion_contents={potion:'minecraft:invisibility',custom_color:16711680}</code>。
<div class="treeview">
  :*; ：（书与笔有默认值<code>{pages:[]}</code>）存储[书与笔](书与笔.md)的内容。
  :** ：页面列表，包含下列其中一种格式的信息。
  :*** ：一页的信息，最多100页。
  :**** ：（可选）已过滤的文本信息。在开启过滤时，此字符串优先级高于。
  :**** ：未过滤的文本信息。
  :*** ：一页的纯文本信息。
</div>
  :* 替代了标签和。
  :* 示例：<code>writable_book_content={pages:[{text:'你好，世界！'}]}</code>。
<div class="treeview">
  :*; ：存储[成书](成书.md)的内容和元数据。
  :** ：页面列表，包含下列其中一种格式的信息。
  :*** ：一页的信息，最多100页。
  :**** ：（可选）已过滤的JSON聊天组件或文本。在开启过滤时，此字符串优先级高于。
  :**** ：未过滤的JSON聊天组件或文本。
  :*** ：一页的纯文本信息。
  :** ：（和的格式一致）已过滤的标题。
  :** ：作者名。
  :** ：（不小于0，不大于2）成书被复制的次数，0为原作。
  :** ：本书中的聊天组件是否已解析。如果为<code>false</code>，将在打开这本书时解析。
</div>
  :* 替代了标签、、、、、和。
  :* 示例：<code>-{}-written_book_content={pages:[{text:'你好，世界！'}],title:{text:'一次愉快的阅读'},author:'Herobrine',generation:1,resolved:true}</code>。
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
  :*** ：（默认值为<code>160</code>）状态效果持续刻数。
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
  :*; ：存储指南针指向的目标磁石。
  :** ：<code>['x','y','z']</code>。
  :** ：维度ID。
  :** ：（默认为<code>true</code>）是否追踪目标磁石的方块状态。为<code>true</code>时，该组件会随目标位置的磁石被破坏而移除。
</div>
  :* 替代了标签、和。
  :* 示例：<code>lodestone_target={pos:[13,64,-43],dimension:'minecraft:the_nether'}</code>。
<div class="treeview">
  :*; ：存储[烟火之星](烟火之星.md)的爆炸效果。
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
  :** ：爆炸列表。
  :*** ：爆炸的形状。值可以为<code>small_ball</code>（曾为<code>0</code>）、<code>large_ball</code>（曾为<code>1</code>）、<code>star</code>（曾为<code>2</code>）、<code>creeper</code>（曾为<code>3</code>）和<code>burst</code>（曾为<code>4</code>）
  :*** ：（默认为<code>[]</code>）初始的粒子颜色列表，实际显示颜色从中随机选择。
  :**** ：一个RGB值。
  :*** ：（默认为<code>[]</code>）淡化时的粒子颜色列表，实际显示颜色从中随机选择。
  :**** ：一个RGB值。
  :*** ：（默认为<code>false</code>）是否有踪迹效果。
  :*** ：（默认为<code>false</code>）是否有闪烁效果。
  :** ：飞行时间，为该烟花火箭中[火药](火药.md)的数量。
</div>
  :* 替代了标签、。
  :* 示例：<code>{explosions:[],flight_duration:1}</code>。
<div class="treeview">
  :*; ：控制[玩家的头](玩家的头.md)显示的皮肤，此数据在放下物品后复制到“玩家的头”方块中。
  :** ：（长度不超过16）玩家名称。如果仅指定了，会解析为相应的玩家UUID和皮肤数据。
  :** ：（可选）玩家的UUID。
  :** ：（可选）档案列表。
  :*** ：游戏档案属性的名称。
  :*** ：游戏档案属性的数据，Base64编码的JSON数据。
  :*** ：（可选）游戏档案属性的签名。
</div>
  :* 替代了标签。
  :* 示例：<code>profile={name:'MHF_Sheep'}</code>。
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
  :*; ：（潜影盒默认为<code>[]</code>）表示[潜影盒](潜影盒.md)（物品形式）中的各个槽位。当潜影盒被放置时，将复制该组件中的数据。
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
  :; ：表示类容器方块的“锁”。只有玩家使用与之匹配的“钥匙”才能打开该容器，“钥匙”即为自定义名称与“锁”名称相同的物品。当容器方块被放置时将复制该组件中的数据。
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

* *[选项](选项.md)**
* 在“辅助功能设置”屏幕中加入了“菜单背景模糊程度”滚动条。

* *[标签](Java版标签.md)**
* 加入了伤害类型标签<code>#bypasses_wolf_armor</code>：。

# 更改
# = 物品 =
* *[狼铠](狼铠.md)**
* 现在可以像[皮革盔甲](皮革盔甲.md)一样染色。
* 现在具有64点耐久度，且会根据剩余耐久度呈现不同程度的开裂纹理。
* * 可以在[铁砧](铁砧.md)上使用[犰狳鳞甲](犰狳鳞甲.md)修复。
* 添加了用于染色的叠加纹理，并为实体模型添加了半透明的开裂纹理。
* 将物品纹理上移了2个像素，为耐久条腾出空间。

# = 生物 =
* *幼年[犰狳](犰狳.md)**
* 不再能被[刷子](刷子.md)刷扫。

* *[狼](狼.md)**
* 现在在装备狼铠时，所受伤害的[伤害类型](伤害类型.md)不具有伤害类型[标签](Java版标签.md)<code>#bypasses_wolf_armor</code>时不减少生命值，改为使狼铠减少与所受伤害值（向上取整）相等的耐久度。
* * 狼铠仍能为其提供护甲值。
* 现在狼的主人可以对坐下的狼[犰狳鳞甲](犰狳鳞甲.md)修复其装备的狼铠，但暂时只有主手对不在船或矿车中的狼使用时有效。<ref></ref><ref></ref><ref></ref>

# = 非生物实体 =
* *[箭](箭.md)**
* 不再存储附着的[状态效果](状态效果.md)，而是从其物品形式拥有的<code>item</code>中获取。
* * 现在药箭的状态效果在其生效期过后消失。

* *[区域效果云](区域效果云.md)**
* 现在使用<code>potion_contents</code>字段中的<code>minecraft:potion_contents</code>组件存储格式相同的[药水效果](药水效果.md)。

# = 游戏内容 =
* *[创造模式](创造模式.md)**
* 现在使用和[](选取方块.md)键选取一个有自定义名称的方块（如箱子）后，也会得到一个同名的对应物品。

* *[魔咒](魔咒.md)**
* 现在魔咒存储为键值对而不再是复合元素列表，因此不再能存储魔咒的顺序（通常是魔咒被添加到物品上的顺序）。
* * 物品被重新加载后，其魔咒会被按照魔咒ID重新排序。<ref></ref>
* 现在[](力量（魔咒）.md)、[冲击](冲击.md)、[火矢](火矢.md)和[无限](无限.md)会在[弩](弩.md)上产生效果。
* 现在[穿透](穿透.md)和[多重射击](多重射击.md)会在玩家的[弓](弓.md)上产生效果。

* *[交易](交易.md)**
* 村民交易的<code>ignoreTags</code>字段被移除，取而代之的是基于损伤值的组件谓词。
* * 现在只有指定<code>'minecraft:damage': 0</code>时村民才会收购无耐久损耗的物品。
* * 现在在默认不指定组件的情况下，村民可以收购任意物品。

* *[药水效果](药水效果.md)**
* 移除了<code>minecraft:empty</code>，现在仅在不指定<code>potion</code>数据时使用“不可合成的药水”效果。

# = 命令格式 =
* ***
* 重命名了以下修饰符<code>operation</code>值：
* * <code>add</code> → <code>add_value</code>
* * <code>multiply_base</code> → <code>add_multiplied_base</code>
* * <code>multiply</code> → <code>add_multiplied_total</code>

* ***
* 现在可以不指定玩家（如<code>@s</code>）和声音分类（如<code>neutral</code>）。

* *、、和**
* 更新了语法。
* * 现在可以在物品ID后使用方括号指定组件。
* ** 组件之间用逗号分隔。
* *** 如<code>netherite_hoe[damage=5,repair_cost=2]</code>。
* * 组件类型会自动补全。
* * 值不会自动补全，但会被验证。如果指定的组件不正确，命令将无法解析。
* ** 如<code>give @s wooden_pickaxe[damage=-34]</code>是无效的。
* * 旧NBT语法<code>{…}</code>现在用于设置或匹配<code>minecraft:custom_data</code>组件。
* ** 如<code>give @s stick{foo:'bar'}</code>等价于<code>give @s stick[custom_data={foo:'bar'}]</code>。
* ** 如果<code>[…]</code>和<code>{…}</code>均被指定，则<code>[…]</code>必须在<code>{…}</code>之前。
* * 使用<code>{…}</code>自定义数据语法将使用先存的NBT部分匹配行为。
* ** 这要求谓词中指定的所有标签都出现在目标项上，但可以忽略其他标签。
* ** 目标的列表必须包含谓词中指定的所有物品，但目标列表也可包含其他物品，这些物品的顺序不影响匹配。
* 中的物品谓词参数在匹配组件和自定义数据方面具有新的语义。
* * 每个指定的组件都必须出现在目标物品上，并且具有完全相等的解析值。
* * 如果没有指定，视为目标物品包含默认组件。

# = 常规 =
* *[背景图](背景图.md)**
* 移除了[泥土](泥土.md)背景。
* * 现在游戏外的界面以暗化、模糊化的[全景图](全景图.md)作为背景，且大多数原本直接显示于泥土背景上的文字现在使用黑色背景框。
* ** 不使用背景框的文本包括[世界加载屏幕](世界加载屏幕.md)的百分比文本，和跨维度传送时的提示文本。
* * 现在跨维度传送时全程显示玩家镜头。
* * 现在[胜利屏幕](胜利屏幕.md)以[末地传送门](末地传送门（方块）.md)和[末地折跃门](末地折跃门（方块）.md)的动画作为背景。
* 现在游戏内暂停菜单各界面统一以暗化、模糊化的玩家镜头作为背景，且暗化程度有所降低。
* * [命令方块](命令方块.md)、[结构方块](结构方块.md)、[拼图方块](拼图方块.md)、[告示牌](告示牌.md)和悬挂式告示牌的GUI背景因使用相同的背景图<ref></ref>而同样受此影响<ref></ref>，但其他方块、物品栏和书的GUI背景不受影响。
* 可以在“辅助功能设置”内调节模糊化背景的模糊强度。
* 可以通过启用Programmer Art资源包恢复泥土背景，但命令方块、结构方块、拼图方块、告示牌和悬挂式告示牌的GUI也会变成泥土背景。<ref></ref>

* *界面**
* 标题和按钮等屏幕元素在不同屏幕上的位置现在更加一致。
* 更新了Realms中的玩家和世界备份界面。
* 列表的顶部和底部现在有更清晰的边界。
* 在可用磁盘空间少于64MB时，加入单人游戏世界前会出现警告界面。
* 在单人游戏中，加载或保存区块出错时会在弹窗中呈现警告。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>33</code>。
* 附加于物品堆叠标签字段的非结构化NBT数据现在被结构化的“组件”取代。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>28</code>。
* 移除了纹理。
* 更新了纹理，分别被应用于列表的底部和顶部。
* 加入了纹理，分别被应用于屏幕的背景和列表的背景。
* 更新了精灵图：
* * 。
* 加入了精灵图：
* * 。
* 移除了Realms的纹理：
* * 。

* *[战利品表](战利品表.md)**
* 函数已分别重命名为。
* * 这些现在适用于目标物品的<code>custom_data</code>组件。
* 更新了<code>set_attributes</code>函数。
* * 修饰符<code>slot</code>现在支持值。
* * 修饰符<code>operation</code>的值现在被重命名：
* ** <code>addition</code> → <code>add_value</code>
* ** <code>multiply_base</code> → <code>add_multiplied_base</code>
* ** <code>multiply_total</code> → <code>add_multiplied_total</code>

* *[物品堆叠格式](物品堆叠组件#数据格式.md)**
* 使用显示高级提示框时，标签数变为组件数。
* 先前所有的和字段都被（命名空间ID）和取代。
* * <code>count</code>字段是可选的，默认为<code>1</code>，且为默认值时不会存储该字段。
* * [JSON](JSON.md)文件，如进度的<code>icon</code>字段与配方的<code>result</code>字段也受其影响。
* * 现在堆叠数量受该物品的最大堆叠数量限制。
* 移除了<code>tag</code>字段，世界升级后任何剩余内容终将移至<code>custom_data</code>组件中。
* 加入了<code>components</code>字段存储物品中的所有组件。
* * 等于其默认值的组件将不会被存储。
* 物品堆叠格式不再呈现空堆叠（空气或0数量物品）；相反，在支持该字段的地方应该省略该字段。

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

* *[标签](Java版标签.md)**
* 向物品标签加入了。

# 更改（实验性）
# = 方块 =
* *[宝库](宝库.md)**
* 再次更改了纹理，以进一步区别于[试炼刷怪笼](试炼刷怪笼.md)。
* 如果不存在<code>key_item</code>字段，则不能被解锁。

# = 生物 =
* *[沼骸](沼骸.md)**
* 更新了模型和纹理。
* 现在可对其剪刀剪下2个蘑菇（红色和棕色蘑菇均有可能）。

# = 非生物实体 =
* *[风弹](风弹（实体）.md)**
* 降低了爆炸威力的随机性。
* 现在总会在所在维度的最高建筑高度30格以上立即爆炸。
* 现在会正确计算摔落伤害。

# 修复
不使用<code>BlockEntityTag</code>。
|100016|单人世界选择屏幕在<code>light_dirt_background.png</code>或<code>options_background.png</code>透明时显示异常。
|109286|默认泥土页面背景没有正确对齐。
|117977|进度GUI缺少关闭按钮。
|118890|插在地上的药箭永不失效。
|121621|对潜影盒未能找到物品栏中被放置的和已挖掘的潜影盒。
|140565|带旗帜的灾厄巡逻队队长会掉落2种不可堆叠的不同旗帜。
|142372|+正在烹饪食物的营火会在烹饪期间更新NBT。
|143614|用+获取的带有<code>cooked</code>NBT的营火物品在手中/屏幕外剧烈摇晃。
|147710|在统计页面中，一些较长的生物名称被滚动条遮挡。
|148480|在砂轮里输入两本相同的附魔书只会输出一本书。
|151793|存在各种各样灾厄旗帜的堆叠问题。
|153879|灾厄巡逻队会忽略从另一版本存储在已保存的快捷栏中的灾厄旗帜。
|189211|从炼药锅中舀水的统计数据被屏幕底部的叠加层略微覆盖。
|189484|统计数据屏幕选项卡选择框未居中。
|195572|当抗火状态生效时，熔岩中的迷雾与基岩版相比更浓密。
|201722|命令无视堆叠限制。
|204947|+已放置的灾厄旗帜与不同。
|206854|多人游戏警告和聊天预览警告未居中。
|226775|熄灭蜡烛时显示不准确的字幕。
|234406|与Realms界面中的“”按钮交互时，泥土背景变动。
|234558|Realms“”界面没有标题。
|248076|特定类型的烟花火箭在被后不可堆叠到一起。
|251042|多人游戏第三方警告按钮在非英文语言中的位置不合适。
|251509|旗帜图案不能合理堆叠/旗帜被破坏后失去“<code>banner</code>”ID。
|260867|不能用鼠标选中包选择屏幕中的项目。
|262503|与<code>options_background.png</code>不匹配。
|263872|多人游戏目录中的“”元素不可被鼠标指针选中。
|263874|统计数据目录中的元素列表不可被鼠标指针选中。
|265661|某些特定的窗口大小会导致“实验性功能需求”数据包界面内泥土背景与返回按钮重叠。
|;1.20.4的漏洞
|267451|在1.20.4中用铁砧命名的物品不与在更早版本命名的物品堆叠。
|267500|UUID的前两个或后两个整数为0时，物品上的属性修饰符无效。
|267975|Realms中渲染的玩家列表比它的可见尺寸大。
|267976|Realms玩家列表中的滚动条不再能被鼠标指针拖动。
|268011|漏斗会泄漏上个被其吸取过物品实体的世界。
|268022|“实验性功能需求”菜单内的列表控件不能被鼠标指针选中。
|268236|社交屏幕的搜索栏不被默认选中。
|;dev
|267956|手持钻石锄或下界合金锄时，攻击指示器不显示。
|268345|更改“”的值会导致提示框闪烁。
|268350|风弹永不消失。
|268509|在24w06a中，“已保存的快捷栏”中的提示框消失了。
|;prev
|268580|雕纹书架模型在数据生成中不稳定。
|268710|风弹的摔落伤害减免不生效。
|268778|幼年犰狳被刷扫时不应掉落犰狳鳞甲。
}}</onlyinclude>

# 参考

# 导航

[de:24w09a](de:24w09a.md)
[en:Java Edition 24w09a](en:Java Edition 24w09a.md)
[es:Java Edition 24w09a](es:Java Edition 24w09a.md)
[fr:Version Java 24w09a](fr:Version Java 24w09a.md)
[ja:Java Edition 24w09a](ja:Java Edition 24w09a.md)
[lzh:二四週〇九甲](lzh:二四週〇九甲.md)
[pt:Edição Java 24w09a](pt:Edição Java 24w09a.md)
[ru:24w09a (Java Edition)](ru:24w09a (Java Edition).md)
[uk:24w09a (Java Edition)](uk:24w09a (Java Edition).md)