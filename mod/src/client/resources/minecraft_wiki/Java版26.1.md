# Java版26.1

*页面ID: 177942* | *来源: Minecraft Wiki*

* *26.1**是即将到来的一次小更新，发布时间待定。<ref></ref>加入了[金蒲公英](金蒲公英.md)，为一些幼年生物加入了新的纹理、模型和音效，加入了[命名牌](命名牌.md)的合成配方，修改了命令，并修复了一些漏洞。

此次Java版更新将首次采用新[版本格式](版本格式#正式版.md)，该格式宣布于2025年12月2日。<ref></ref>同时，此次更新也将彻底移除混淆。<ref></ref>从该版本起，启动游戏要求的最低Java版本为25。

# 新内容
# = 方块 =
* *[金蒲公英](金蒲公英.md)**
* 一种新的花，可用于阻止幼年[动物](动物.md)成长。
* * 对幼年动物时，将阻止其成长。
* ** 被阻止成长的幼年动物无法喂食其他物品。
* * 对已被阻止成长的幼年动物时，将使其重新开始成长。
* * 无法对幼年[僵尸马](僵尸马.md)和幼年[骷髅马](骷髅马.md)使用。
* * 使用时会在该生物周围释放绿色粒子。
* 使用1个[蒲公英](蒲公英.md)和8个[金粒](金粒.md)合成。

* 可用于合成[黄色染料](黄色染料.md)。
* 可用于合成[谜之炖菜](谜之炖菜.md)，给予玩家[饱和](饱和.md)效果。
* 可放入[花盆](花盆.md)中。

* *[音符盒](音符盒.md)**
* 加入了新的音色“小号”（Trumpet），对应的乐器方块为[铜块](铜块.md)、[雕纹铜块](雕纹铜块.md)、[切制铜块](切制铜块.md)、[切制铜楼梯](切制铜楼梯.md)、[切制铜台阶](切制铜台阶.md)及其氧化和涂蜡变种。
* * 音色会随着[氧化](氧化.md)程度的不同而改变。

* *[石头](石头.md)**
* 现在石头可在切石机中直接制作[圆石](圆石.md)及其不同形状的变种。

* *[深板岩](深板岩.md)**
* 现在深板岩可在切石机中直接制作[深板岩圆石](深板岩圆石.md)、[磨制深板岩](磨制深板岩.md)、[深板岩砖](深板岩砖.md)、[深板岩瓦](深板岩瓦.md)、[雕纹深板岩](雕纹深板岩.md)以及它们不同形状的变种。

# = 物品 =
* *[命名牌](命名牌.md)**
* 加入了合成配方，即用1張[紙](紙.md)和1個任意[金屬顆粒](矿物#金属颗粒.md)合成1个命名牌：


# = 生物 =
* *[猫](猫.md)、[猪](猪.md)、[牛](牛.md)和[鸡](鸡.md)**
* 加入了新的成年音效变种：
* * 猫
* **
* * 猪
* **
* **
* * 牛
* **
* * 鸡
* **
* 原先的音效变种被称为。
* 已有生物的音效变种会是所有变种中的随机一种。

# = 命令格式 =
* ***
* 新的命令，允许手臂摆动。
* 并非所有实体都支持摆动，命令可能会返回成功，但客户端只会在允许的情况下显示动画。
* 例如，这可以使玩家模型摆动手臂。
* 返回实体的数量。
* 语法：
* * <code>/swing [<targets>] [mainhand|offhand]</code>

* ***
* 加入了<code>entity</code>子命令，用于输出世界中实体的档案信息。
* * 语法：<code>/fetchprofile entity <entity></code>
* * 如果选中的实体没有档案（目前只有玩家和玩家模型有），命令会执行失败。
* * 档案会原样显示，不会额外进行解析。

# = 常规 =
* *[选项](选项.md)**
* 加入了“世界选项”选项，在先前“难度”选项的位置。
* * 包括“难度”选项和游戏规则屏幕。
* * 因此，现在可以通过暂停菜单进入游戏规则屏幕，而不仅仅是在创建新的世界时。
* * 游戏规则屏幕仅对管理员可用。

* *用户界面**
* 在游戏规则屏幕的顶栏加入了一个搜索框。
* * 可以根据描述和类型来搜索游戏规则。
* 加入了展示升级进度的屏幕，在升级世界时显示。
* 加入了游戏内的输入法候选栏，显示在当前编辑的文本上方。
* * 目前仅支持Windows和macOS。

* *[调试屏幕](调试屏幕.md)**
* 新增下列选项：
* * <code>looking_at_block_tags</code>
* * <code>looking_at_fluid_tags</code>
* * <code>looking_at_entity_tags</code>
* 新增了一个调试渲染，可以通过启用。
* * 和FPS图表以及网络图表互斥。
* * 右下角实时显示光照纹理。
* * 纹理的纵轴代表天空光照强度，从下到上0至15。
* * 纹理的横轴代表方块光照强度，从左到右0至15。
* * 每个像素的颜色代表将对应方块光照和天空光照下要应用到方块和实体的颜色。
* 加入了调试选项<code>detailed_memory</code>，用于显示已使用内存的详细信息。

* *[数据包](数据包.md)**
* 加入了、、和子文件夹。
* [猫](猫.md)、[猪](猪.md)、[牛](牛.md)和[鸡](鸡.md)的音效变种现在可由数据包定义。

* *[注册表](注册表.md)**
* 加入了可写注册表。

* *[村民交易定义格式](村民交易定义格式.md)**
* 现在村民和流浪商人的交易选项由数据包控制。
* * <code>villager_trade</code>文件夹下的每个文件都代表一个交易蓝图，村民和流浪商人使用它来生成实际交易。
* * 格式：
* ** <code>wants</code>：代表交易收购的物品类型和物品数量。
* *** <code>id</code>：物品ID。
* *** <code>count</code>：可选，物品的数量，默认为1。
* *** <code>components</code>：可选，物品的组件检查，默认为空。
* ** <code>additional_wants</code>：可选，村民收购的第二个物品，格式同上。
* ** <code>gives</code>：村民交易的物品，与现有的物品格式相同。
* ** <code>given_item_modifiers</code>：可选，对于出售物品的修饰，例如对魔咒或药水的修饰，而不是硬编码它们。
* *** 使用现有的物品修饰器格式。
* *** 如果最终物品堆叠为空，则此交易选项将被废弃。
* *** 不支持引用物品修饰器。
* *** 如果物品的<code>stored_enchantments</code>组件包含属于<code>#double_trade_price</code>标签的魔咒，则价格翻倍。
* ** <code>max_uses</code>：一个数值提供器，交易的最大交易次数，默认为4，如果数值过低则视为1。
* ** <code>reputation_discount</code>：一个数值提供器，交易的价格乘数，默认为0，如果数值过低则视为0。
* ** <code>xp</code>：一个数值提供器，交易完成后的村民获得的经验值，默认为1，如果数值过低则视为0。
* ** <code>merchant_predicate</code>：村民需要满足的条件，满足条件才可以出现这项交易。
* *** 与现有的战利品表谓词格式一致，不支持引用。
* ** <code>double_trade_price_enchantments</code>：一个魔咒ID、魔咒标签ID或魔咒ID列表，表示会使<code>minecraft:enchant_randomly</code>和<code>minecraft:enchant_with_levels</code>的消耗翻倍的魔咒，前提是<code>include_additional_cost_component</code>为<code>true</code>且物品的<code>stored_enchantments</code>组件包含此魔咒。
* * 这是一个示例，使用绿宝石交换一本附魔书，仅限沙漠村民：<syntaxhighlight lang="json>{
  "additional_wants": {
    "id": "minecraft:book"
  },
  "double_trade_price_enchantments": "#minecraft:double_trade_price",
  "given_item_modifiers": [
    {
      "function": "minecraft:enchant_randomly",
      "include_additional_cost_component": true,
      "only_compatible": false,
      "options": "#minecraft:trades/desert_common"
    },
    {
      "function": "minecraft:filtered",
      "item_filter": {
        "items": "minecraft:enchanted_book",
        "predicates": {
          "minecraft:stored_enchantments": [
            {}
          ]
        }
      },
      "on_fail": {
        "function": "minecraft:discard"
      }
    }
  ],
  "gives": {
    "count": 1,
    "id": "minecraft:enchanted_book"
  },
  "max_uses": 12.0,
  "merchant_predicate": {
    "condition": "minecraft:entity_properties",
    "entity": "this",
    "predicate": {
      "predicates": {
        "minecraft:villager/variant": "minecraft:desert"
      }
    }
  },
  "reputation_discount": 0.2,
  "wants": {
    "id": "minecraft:emerald"
  }
}</syntaxhighlight>

* *[交易集定义格式](交易集定义格式.md)**
* <code>trade_set</code>文件夹下的文件是村民提供的交易组合。
* * 目前交易集合的调用是硬编码的：<code><profession>/level_<level></code>用于村民，<code>wandering_trader/buying</code>、<code>wandering_trader/uncommon</code>和<code>wandering_trader/common</code>用于流浪商人。
* * 格式：
* ** <code>trades</code>：交易ID、交易ID的列表或交易标签，表示要抽取的交易。
* ** <code>amount</code>：一个数值提供器，此交易提供提供的交易选项数量。如果最终大于总的交易数量，则所有交易都只会出现一次，除非<code>allow_duplicates</code>为<code>true</code>。
* ** <code>allow_duplicates</code>：可选，是否允许出现相同的交易，默认为<code>false</code>。
* ** <code>random_sequence</code>：一个随机序列，决定抽取哪些交易。
* * 这是一个示例，提供<code>#minecraft:armorer/level_1</code>中的两笔交易，允许重复：<syntaxhighlight lang="json>{
  "amount": 2.0,
  "trades": "#minecraft:armorer/level_1",
  "random_sequence": "minecraft:trade_set/armorer/level_1",
  "allow_duplicates": true
}</syntaxhighlight>

* *[世界时钟](世界时钟.md)**
* 世界时钟包含一个内部时间，每[游戏刻](游戏刻.md)都会增加。它们可以定义在[数据包](数据包.md)的<code>world_clock</code>注册表下（<code>data/<namespace>/world_clock/<id></code>）。
* 世界时钟可以暂停或恢复，其时间也可以用查询。
* 格式：空对象。

* *[时间线定义格式](时间线定义格式.md)**
* 加入了<code>clock</code>字段：世界时钟ID，指定此时间线用哪个世界时钟。
* * 必选，但为了与之前的行为匹配，可以使用<code>minecraft:overworld</code>。
* 新增了一个可选的<code>time_markers</code>字段，用以指定带命名空间的时间标记ID与数值或对象的映射。
* * 格式：
* ** 非负整数，此时间标记的游戏刻。
* ** 或对象格式：
* *** <code>ticks</code>：在0至<code>period_ticks</code>的整数，此时间标记的游戏刻。
* *** <code>show_in_commands</code>：此时间标记是否显示在命令提示中，默认为<code>false</code>。

* *时间标记**
* 时间标记为特定世界时钟的特定时间节点赋予特定名称。时间标记取代了之前用在中的预设名称，如<code>day</code>和<code>night</code>。
* 时间标记会在特定的世界时钟中存在，这意味着不同的时间标记可以被不同的时间线定义，但只有一个具有特定ID、代表特定世界时钟的时间标记。这也意味着两个世界时钟可以有相同的时间标记。
* 时间标记的内置用途
* * 部分时间标记被用于控制游戏行为，它们不会在命令中提示：
* ** <code>minecraft:wake_up_from_sleep</code>：玩家从睡眠中醒来的时间。
* ** <code>minecraft:roll_village_siege</code>：开始评估僵尸围城发生的时间。

* *[环境属性](环境属性.md)**
* <code>minecraft:visual/block_light_tint</code>
* * 方块光照的色调，方块光照颜色在低光照下为灰色，中等光照时会被此属性染色，高光时为白色。默认情况下，它呈现出火把的黄色调。明亮的颜色最适合这个属性，此时至少有一个通道是完全明亮的。该色调适用于屏幕上所有可见的光源，独立的光源无法有不同的色调。
* ** 值类型：RGB颜色
* ** 默认值：<code>#FFD88C</code>
* ** 修饰符：RGB颜色修饰符
* ** 可插值：是
* ** 解析位置：摄像机位置
* <code>minecraft:visual/ambient_light_color</code>
* * 环境光照的颜色和亮度，这种光照以0级别的光照等级应用到世界，在方块光照和天空光照之上。
* ** 值类型：RGB颜色
* ** 默认值：<code>#0A0A0A</code>代表主世界，<code>#302821</code>代表下界，<code>#3f473f</code>代表末地
* ** 修饰符：RGB颜色修饰符
* ** 可插值：是
* ** 解析位置：摄像机位置
* <code>minecraft:visual/night_vision_color</code>
* * 类似于环境光照颜色，当夜视效果激活时，R、G、B每个通道的使用<code>minecraft:visual/night_vision_color</code>和<code>minecraft:visual/ambient_light_color</code>的最大值作为最终颜色。夜视系统默认没有色调。
* ** 值类型：RGB颜色
* ** 默认值：<code>#999999</code>
* ** 修饰符：RGB颜色修饰符
* ** 可插值：是
* ** 解析位置：摄像机位置

* *[猫音效变种定义格式](猫音效变种定义格式.md)**
* 猫的音效变种可通过{{filepath|-{}-data/<*命名空间*>/cat_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年猫使用的音效。
  *** ：猫空闲音效的命名空间ID，或直接定义一个[声音事件](Java版声音事件.md)。
  *** ：猫驯服前空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫威慑幻翼音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫进食音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫求食音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫呼噜声音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫驯服后空闲音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年猫使用的音效。
  *** 格式同。
</div>

* *[鸡音效变种定义格式](鸡音效变种定义格式.md)**
* 鸡的音效变种可通过{{filepath|-{}-data/<*命名空间*>/chicken_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年鸡使用的音效。
  *** ：鸡空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡行走音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年鸡使用的音效。
  *** 格式同。
</div>

* *[猪音效变种定义格式](猪音效变种定义格式.md)**
* 猪的音效变种可通过{{filepath|-{}-data/<*命名空间*>/pig_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年猪使用的音效。
  *** ：猪空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪行走音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年猪使用的音效。
  *** 格式同。
</div>

* *[牛音效变种定义格式](牛音效变种定义格式.md)**
* 牛的音效变种可通过{{filepath|-{}-data/<*命名空间*>/cow_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：牛空闲音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛受伤音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛死亡音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛行走音效的命名空间ID，或直接定义一个声音事件。
</div>

* *[数据组件](数据组件.md)**
* 加入了<code>additional_trade_cost</code>组件。
* * 用于修改村民收购物品<code>gives</code>的数量的临时组件，交易生成后会立刻被移除。
* * 格式：整型。
* 加入了<code>dye</code>组件。
* * 代表一种染料颜色。
* * 用于曾经需要匹配染料物品的各种场合，包括方块和生物互动。
* ** 注意：该组件的存在不意味着启用这些功能。该物品必须明确具有这些功能，例如添加到标签或作为配方材料。
* * 格式：<code>white</code>、<code>orange</code>、<code>magenta</code>、<code>light_blue</code>、<code>yellow</code>、<code>lime</code>、<code>pink</code>、<code>gray</code>、<code>light_gray</code>、<code>cyan</code>、<code>purple</code>、<code>blue</code>、<code>brown</code>、<code>green</code>、<code>red</code>或<code>black</code>其一。

* *[战利品上下文](战利品上下文.md)**
* 加入了<code>villager_trade</code>。
* * <code>this_entity</code>：生成交易的实体。
* * <code>origin</code>：此实体脚部的位置。

* *[物品修饰器](物品修饰器.md)**
* 加入了<code>minecraft:set_random_dyes</code>。
* * 如果物品在<code>#dyeable</code>标签中，则设置物品的<code>minecraft:dyed_color</code>数据组件。
* ** <code>conditions</code>：应用修饰器的条件。
* ** <code>number_of_dyes</code>：一个数值提供器，应用于该物品的染料数量。
* *** 共16种染料，可能会被重复染色。
* 加入了<code>minecraft:set_random_potion</code>。
* * 设置物品的<code>minecraft:potion_contents</code>数据组件。
* ** <code>conditions</code>：应用修饰器的条件。
* ** <code>options</code>：可选的药水，可以是药水效果ID、药水效果标签或药水效果标签。默认来自<code>potions</code>注册表。
* 向<code>minecraft:enchant_with_levels</code>新增下列字段：
* * <code>include_additional_cost_component</code>：可选布尔值，表示是否根据魔咒的花费为物品增加<code>minecraft:additional_trade_cost</code>组件。
* ** 默认为<code>false</code>。
* ** 组件的值由<code>levels</code>数值提供器确定，并在数值上与确定附魔所用的等级相同。
* 向<code>minecraft:enchant_randomly</code>新增下列字段：
* * <code>include_additional_cost_component</code>：可选布尔值，表示是否根据魔咒的花费为物品增加<code>minecraft:additional_trade_cost</code>组件。
* ** 默认为<code>false</code>。
* ** 组件的值由魔咒的等级<code>level</code>确定，计算公式为<code>2 + random(0, 5 + level * 10) + 3 * level</code>。

* *[实体谓词](实体谓词.md)**
* 向玩家子谓词增加下列字段：
* * <code>food</code>：食物谓词。
* ** <code>level</code>：整数或整数范围，检查饥饿度等级。
* ** <code>saturation</code>：浮点数或浮点数范围，检查饱和度等级。

* *数值提供器**
* 加入了<code>minecraft:sum</code>。
* * 返回多个数值提供器的和。
* * 格式：<code>summands</code>，一个数值提供器的列表。

* *[标签](Java版标签.md)**
* 加入了方块标签：
* * ：
* ** 无法支撑[海带](海带.md)的方块。
* * ：
* ** 无法支撑[海草](海草.md)和[高海草](高海草.md)的方块。
* * ：
* ** 能生成[涡流气泡柱](涡流气泡柱.md)的方块。
* * ：
* ** 能生成[涌流气泡柱](涌流气泡柱.md)的方块。
* * ：
* ** 上方种植的[小麦植株](小麦植株.md)、[胡萝卜](胡萝卜.md)、[马铃薯](马铃薯.md)、[甜菜根](甜菜根.md)、[火把花植株](火把花植株.md)、[瓶子草植株](瓶子草植株.md)、[南瓜茎](南瓜茎.md)、[西瓜茎](西瓜茎.md)能够生长的方块。
* * ：
* ** 能支撑[仙人掌花](仙人掌花.md)、无视上表面完整性的方块。
* * ：
* ** 能支撑所有生长阶段的小麦植株、胡萝卜、马铃薯、甜菜根、火把花植株及瓶子草植株的方块。
* * ：
* * ：
* ** 能支撑[西瓜茎](西瓜茎.md)的方块。
* * ：
* ** 能支撑[南瓜茎](南瓜茎.md)的方块。
* * ：
* ** 能支撑[灌木丛](灌木丛.md)、[萤火虫灌木丛](萤火虫灌木丛.md)、[甜浆果丛](甜浆果丛.md)、[矮草丛](矮草丛.md)、[高草丛](高草丛.md)、[蕨](蕨.md)、[大型蕨](大型蕨.md)、[花](花.md)（[凋灵玫瑰](凋灵玫瑰.md)除外）、[粉红色花簇](粉红色花簇.md)、[野花簇](野花簇.md)、[树苗](树苗.md)的方块。
* * ：
* ** 能支撑[杜鹃花丛](杜鹃花丛.md)和[盛开的杜鹃花丛](盛开的杜鹃花丛.md)的方块。
* * ：
* ** 能支撑[仙人掌](仙人掌.md)的方块。
* * ：
* ** 能支撑[紫颂花](紫颂花.md)的方块。
* * ：
* ** 能支撑[紫颂植株](紫颂植株.md)的方块。
* * ：
* ** 能支撑[可可果](可可果.md)的方块。
* * ：
* ** 能支撑[诡异菌](诡异菌.md)的方块。
* * ：
* ** 能支撑[绯红菌](绯红菌.md)的方块。
* * ：
* ** 能支撑[诡异菌索](诡异菌索.md)的方块。
* * ：
* ** 能支撑[绯红菌索](绯红菌索.md)的方块。
* * ：默认为空
* ** 能支撑[青蛙卵](青蛙卵.md)的方块。
* * ：
* ** 能支撑[红树胎生苗](红树胎生苗.md)的方块。
* * ：
* ** 能支撑悬挂的红树胎生苗的方块。
* * ：
* ** 能支撑[睡莲](睡莲.md)的方块。
* * ：
* ** 能支撑[下界苗](下界苗.md)的方块。
* * ：
* ** 能支撑[下界疣](下界疣.md)的方块。
* * ：
* ** 能支撑[甘蔗](甘蔗.md)的方块。
* * ：
* ** 能与甘蔗下方方块毗邻的方块。
* * ：
* ** 能支撑[凋灵玫瑰](凋灵玫瑰.md)的方块。
* * ：
* * ：
* ** [南瓜茎](南瓜茎.md)能在这些方块上方生成[南瓜](南瓜.md)。
* * ：
* ** [西瓜茎](西瓜茎.md)能在这些方块上方生成[西瓜](西瓜.md)。
* * <code>#mud</code>：泥巴和沾泥的红树根
* * <code>#moss_blocks</code>：苔藓块和苍白苔藓块
* * <code>#grass_blocks</code>：草方块、菌丝体和灰化土
* * <code>#substrate_overworld</code>：<code>#dirt</code>、<code>#mud</code>、<code>#moss_blocks</code>和<code>#grass_blocks</code>
* ** 用于集合世界生成条件。
* * <code>#beneath_tree_podzol_replaceable</code>
* ** 定义适用于树木下方可被灰化土替代的方块。
* * <code>#beneath_bamboo_podzol_replaceable</code>
* ** 定义适用于竹子下方可被灰化土替代的方块。
* * <code>#cannot_replace_below_tree_trunk</code>：<code>#dirt</code>、<code>#mud</code>、<code>#moss_blocks</code>和灰化土
* * <code>#forest_rock_can_place_on</code>
* ** 定义哪些方块之上可放置<code>forest_rock</code>地物。
* * <code>#huge_brown_mushroom_can_place_on</code>
* ** 定义哪些方块之上可放置<code>huge_brown_mushroom</code>地物。
* * <code>#huge_red_mushroom_can_place_on</code>
* ** 定义哪些方块之上可放置<code>huge_red_mushroom</code>地物。
* * <code>#ice_spike_replaceable</code>
* ** 定义冰刺可替换哪些方块。
* 加入了流体标签：
* * ：
* ** 能被[气泡柱](气泡柱.md)占据的流体。
* * ：
* ** 能支撑[青蛙卵](青蛙卵.md)的流体。
* * ：
* ** 能支撑[睡莲](睡莲.md)的流体。
* * ：
* ** [甘蔗](甘蔗.md)下方方块需要毗邻的流体。
* 加入了控制村民交易集合的标签。
* * 村民根据职业和等级由<code>#<profession>/level_<level></code>控制，最高5级。
* ** 铁匠由<code>#common_smith/level_<level></code>控制，代表盔甲匠、武器匠和工具匠的通用交易，最高5级。
* * 流浪商人由<code>#wandering_trader/buying</code>、<code>#wandering_trader/uncommon</code>和<code>#wandering_trader/common</code>控制。
* 加入了药水效果标签：
* * <code>#tradeable</code>：可以被制箭师村民售卖的药箭。
* 加入了物品标签：
* * ：包含[铜粒](铜粒.md)、[铁粒](铁粒.md)和[金粒](金粒.md)。
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
* * <code>#mud</code>
* ** 与方块标签对应。
* * <code>#moss_blocks</code>
* ** 与方块标签对应。
* * <code>#grass_blocks</code>
* ** 与方块标签对应。
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

# 更改
# = 方块 =
* *[铜箱子](铜箱子.md)**
* 圣诞节期间不再使用圣诞节礼物纹理。

* *[去皮云杉原木](去皮云杉原木.md)**
* 更改了顶面纹理以匹配。

* *[炼药锅](炼药锅.md)**
* 现在装有的[水](水.md)是透明的。

# = 生物 =
* *[驴](驴.md)、[骡](骡.md)、[海龜](海龜.md)、[蜜蜂](蜜蜂.md)、[狐狸](狐狸.md)、[山羊](山羊.md)、[犰狳](犰狳.md)、[北极熊](北极熊.md)、[羊驼](羊驼.md)、[商駝](商駝.md)、[熊猫](熊猫.md)、[疣猪兽](疣猪兽.md)、[僵尸疣猪兽](僵尸疣猪兽.md)、[炽足兽](炽足兽.md)和[嗅探兽](嗅探兽.md)**
* 更改了幼年个体的纹理和模型。

* *[牛](牛.md)、[绵羊](绵羊.md)、[豹猫](豹猫.md)、[哞菇](哞菇.md)、[魷魚](魷魚.md)、[螢光魷魚](螢光魷魚.md)、[殭屍](殭屍.md)、[屍殼](屍殼.md)、[沉屍](沉屍.md)、[豬布林](豬布林.md)、[殭屍化豬布林](殭屍化豬布林.md)、[村民](村民.md)和[殭屍村民](殭屍村民.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了以上幼年生物的[边界箱](边界箱.md)以匹配其新模型。

* *[猫](猫.md)、[鸡](鸡.md)和[马](马.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了以上幼年生物的[边界箱](边界箱.md)以匹配其新模型。
* 为幼年个体加入了单独的音效。

* *[狼](狼.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了幼年个体的[边界箱](边界箱.md)以匹配其新模型。
* 为幼年个体加入了单独的音效。
* 幼年狼身上的[狼铠](狼铠.md)现在不再渲染。

* *[猪](猪.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了幼年个体的[边界箱](边界箱.md)以匹配其新模型。
* 为幼年个体加入了单独的音效。
* 幼年猪身上的[鞍](鞍.md)现在不再渲染。

* *[兔子](兔子.md)**
* 更改了纹理和模型。
* * 调整了边界箱以匹配其新模型。
* 现在拥有了新动画。

* *[美西螈](美西螈.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了幼年个体的[边界箱](边界箱.md)以匹配其新模型。
* 为幼年美西螈加入了装死的动画。

* *[骆驼](骆驼.md)**
* 更改了幼年个体的纹理和模型。
* 幼年骆驼身上的[鞍](鞍.md)现在不再渲染。

* *[海豚](海豚.md)**
* 更改了幼年个体的纹理和模型。
* 现在会跟随骑乘[鹦鹉螺](鹦鹉螺.md)的玩家，以匹配。

* *[僵尸马](僵尸马.md)**
* 更改了幼年个体的纹理和模型。
* 调整了幼年个体的邊界箱以匹配其新模型。
* 受伤后不再会进入惊慌状态。
* 现在幼年僵尸马可以通过刷怪蛋或命令生成。
* 幼年個體現在不再會成長為成年個體。

* *[骷髏马](骷髏马.md)**
* 更改了幼年个体的纹理和模型。
* 调整了幼年个体的边界箱以匹配其新模型。
* 幼年個體現在不再會成長為成年個體。

* *[僵尸](僵尸.md)**
* 现在“领头”僵尸在生成时的生命值等于其生命值上限。
* 现在增援僵尸不再试图攻击创造模式下的玩家。

* *[駱駝屍殼](駱駝屍殼.md)**
* 移除了未使用的幼年個體。

# = 游戏内容 =
* *[交易](交易.md)**
* 村民交易的刷新现在依赖于随机序列。

* *[进度](进度.md)**
* “[](进度#advancements-anchor-nether.distract_piglin.md)”现在也可以通过丢出[金蒲公英](金蒲公英.md)获取。

* *用户界面**
* 需要升级存档格式的世界现在会显示而不是，且世界升级前“”和“”按钮会被禁用。
* 在此版本中升级世界时将强制进行备份。
* 全屏时不再使用独占模式。

* *[选取方块](选取方块.md)**
* 现在对玩家或玩家模型使用和组合键时会显示对此实体执行相同的结果。

# = 命令格式 =
* ***
* 现在基于世界时钟。
* * 世界时钟可选择性地指定为命令的输入，如<code>/time of <clock> ...</code>。
* * 如果未指定世界时钟（像之前一样的<code>time ...</code>），则使用本维度默认的世界时钟。
* <code>set</code>和<code>add</code>子命令的返回值（<code>/execute store ...</code>）现在是世界时钟经过的总刻数，而不是当前时间。
* * 语法：
* ** <code>time [of <clock>] set &lt;time></code>：设置世界时钟经过的总刻数。
* ** <code>time [of <clock>] set <timemarker></code>：将当前的世界时钟快进到下一时间标记。
* *** 对于世界时钟<code>minecraft:overworld</code>，可用的时间标记是。
* ** <code>time [of <clock>] add &lt;time></code>：将当前的世界时钟加上刻数，可以为正数或负数。
* ** <code>time [of <clock>] pause</code>：暂停当前世界时钟。
* ** <code>time [of <clock>] resume</code>：继续暂停的世界时钟。
* ** <code>time [of <clock>] query &lt;timeline></code>：显示并返回当前时间线在本周期内经过的刻数。
* ** <code>time [of <clock>] query &lt;timeline> repetitions</code>：显示并返回当前时间线经过的周期数。
* ** <code>time [of <clock>] query time</code>：显示并返回当前世界时钟经过的总刻数。
* ** <code>time query gametime</code>：与之前一样，世界中经过的总刻数，不受更改的影响。

# = 常规 =
* *Java版本**
* 现在启动游戏要求的最低Java版本为25。
* 现在使用的Java发行版为[Microsoft](wzh:微软.md)构建的OpenJDK 25。

* *[LWJGL](https://www.lwjgl.org/)**
* 将LWJGL从版本3.3.3更新到了3.4.1。

* *默认JVM选项**
* 游戏现在初始分配2GB内存。
* 游戏现在默认分配4GB内存。
* 在兼容的设备上，使用的垃圾回收器由G1GC变更为ZGC。

* *Lightmap算法**
* 重写了算法。
* 新算法预计和之前相同，但：
* * 它更简单、更直接，修复了之前的许多问题，详见下方修复部分。
* * 凋零战斗的黑暗效果和世界变暗效果现在在所有维度中都以相同的方式工作。
* * 夜视效果现在只会影响环境光照，而不是对颜色值进行缩放。
* ** 这意味着完全黑暗的区域不再比有方块光照或天空光照照亮的地方更明亮。
* * 算法的其他方面，如方块漫反射颜色、环境光照颜色和夜视效果颜色，现在由环境属性控制。

* *[调试屏幕](调试屏幕.md)**
* <code>looking_at_block</code>和<code>looking_at_fluid</code>不再显示标签，标签显示转移到其他调试选项中。
* 重命名以下调试选项：
* * <code>looking_at_block</code> -> <code>looking_at_block_state</code>
* * <code>looking_at_fluid</code> -> <code>looking_at_fluid_state</code>
* 从<code>local_difficulty</code>项拆分出了<code>day_count</code>项，显示玩家在世界内度过的游戏日。

* *[闪烁标语](闪烁标语.md)**
* 将“Java 16 + 1 + 4 = 21!”更改为“Java 16 + 1 + 4 * 2 = 25!”。

* *[聊天](聊天.md)**
* 现在可以随时打开聊天屏幕，即使聊天被聊天设置所限制。
* * 发送、接收信息以及发送命令仍会被聊天设置所限制。
* * 若在限制聊天的情况下打开聊天屏幕，聊天框顶部和输入框上方会显示关于限制的提示信息。
* ** 点击聊天框顶部的提示信息会打开一个屏幕，以提醒玩家更改聊天设置以及目前能在聊天屏幕做什么。
* 现在即使玩家或服务端的聊天被限制，客户端在聊天框做出的记录（如截图）也会显示。
* 现在更改聊天设置后，聊天框中的所有受限制的信息都会被隐藏。
* 在本地服务器上聊天信息的处理方式现在在聊天设置上与专用服务器上更为一致。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>99.2</code>。
* 猪灵和村民的物品栏可以使用<code>mob.inventory.*</code>访问。
* * 因此，移除了<code>villager.*</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>81.1</code>。
* 移除了Programmer Art资源包中的兔子纹理。
* 绊线的纹理现在由alpha cutout渲染，而不再是透明的。
* 由发光鱿鱼、避雷针、方块的涂蜡、上蜡和刮削发出的粒子现在渲染不透明，因为它们实际上从未使用过半透明渲染。
* 移除了，改为使用精灵图。

* *[标签](Java版标签.md)**
* 更改了以下标签的名称以保持一致性：
* * <code>#dry_vegetation_may_place_on</code> → <code>#supports_dry_vegetation</code>
* ** 同时其中的值被替换为。
* * <code>#bamboo_plantable_on</code> → <code>#supports_bamboo</code>
* * <code>#small_dripleaf_placeable</code> → <code>#supports_small_dripleaf</code>
* * <code>#big_dripleaf_placeable</code> → <code>#supports_big_dripleaf</code>
* * <code>#mushroom_grow_block</code> → <code>#overrides_mushroom_light_requirement</code>
* * <code>#snow_layer_can_survive_on</code> → <code>#support_override_snow_layer</code>
* * <code>#snow_layer_cannot_survive_on</code> → <code>#cannot_support_snow_layer</code>
* 移除了物品标签<code>#dyeable</code>。
* 向方块标签中加入了金蒲公英盆栽。
* 向方块标签、物品标签、村民交易标签中加入了金蒲公英。
* 拆分了方块标签<code>#dirt</code>，现在仅包含泥土、砂土和缠根泥土。

* *[实体数据格式](实体数据格式.md)**
* 将玩家独有标签<code>current_explosion_impact_pos</code>和<code>current_impulse_context_reset_grace_time</code>添加到了所有的生物上。
* 移除了玩家数据的<code>ignore_fall_damage_from_current_explosion</code>。

* *[狼音效变种定义格式](狼音效变种定义格式.md)**
* 将所有字段移动到<code>adult_sounds</code>内，并加入了<code>baby_sounds</code>表示幼年狼的音效。

* *[鸡变种定义格式](鸡变种定义格式.md)、[猪变种定义格式](猪变种定义格式.md)、[牛变种定义格式](牛变种定义格式.md)和[猫变种定义格式](猫变种定义格式.md)**
* 加入了<code>baby_asset_id</code>以指定幼年生物的纹理。

* *[狼变种定义格式](狼变种定义格式.md)**
* 加入了<code>baby_assets</code>以指定幼年狼的纹理。

* *[魔咒定义格式](魔咒定义格式.md)**
* <code>post_piercing_attack</code>组件默认不再检查玩家的饥饿度等级。

* *[测试环境定义格式](测试环境定义格式.md)**
* 将<code>time_of_day</code>替换为<code>clock_time</code>。
* * 新增必选字段<code>clock</code>：一个世界时钟的ID，此世界时钟将被设置为对应时间。

* *[谓词](谓词.md)**
* <code>time_check</code>：
* * 新增字段<code>clock</code>：一个世界时钟的ID，指定对哪个世界时钟进行检查。

* *[维度类型](维度类型.md)**
* 增加了下列字段：
* * <code>default_clock</code>：可选的世界时钟ID。
* ** 指定用于的默认世界时钟。
* *** 如果不存在，那么将需要明确的世界时钟参数。
* ** 同时指定了要应用时间标记<code>minecraft:wake_up_from_sleep</code>和<code>minecraft:roll_village_siege</code>的世界时钟。
* *** 如果不存在，则这些时间标记将在本维度内永远不会生效。
* 加入了<code>has_ender_dragon_fight</code>：布尔值，控制此维度是否有末影龙战斗。

* *[物品修饰器](物品修饰器.md)**
* <code>set_random_dyes</code>：
* * 不再只对属于物品标签<code>#dyeable</code>的物品工作。

* *[环境属性](环境属性.md)**
* 将环境属性<code>gameplay/turtle_egg_hatch_chance</code>的默认值更改为0.002。

* *[文本组件](文本组件.md)**
* 从文本组件<code>nbt</code>解析的标签，若设置为<code>interpret: false</code>，现在会经过语法渲染<!--pretty-printed-->，而不是单一扁平的<code>text</code>组件。
* <code>selector</code>类型：
* * <code>selector</code>指定的选择器后不再接受尾随数据。
* <code>nbt</code>类型：
* * <code>interpret</code>为<code>false</code>时，文本组件进行排版印刷，而不是展开为单一扁平的<code>text</code>组件。
* * <code>nbt</code>和<code>block</code>的内容解析失败时不再静默忽略。
* * <code>entity</code>指定的选择器后不再接受尾随数据。
* * 加入了新的可选选项<code>plain</code>，用于移除精美印刷的文本的样式。
* ** <code>plain</code>和<code>interpret</code>不能同时启用。

* *[配方](配方.md)**
* <code>result</code>字段现在在所有配方类型中更加一致。
* * 它现在可以使用简写格式，如<code>"minecraft:foo"</code>相当于<code>{"id":"minecraft:foo", "count": 1}</code>。
* * 对于配方类型，现在也可以接受<code>count</code>字段。
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

* *[方块模型](方块模型.md)**
* 所有方块模型现在均可支持镂空或半透明（部分像素透明）纹理。
* * 四边形被划分至镂空渲染通道还是半透明渲染通道，取决于其指定精灵图的纹理内容。
* ** 含有半透明（部分像素透明）像素的精灵图将被分配至“半透明”通道。
* ** 含有完全透明像素的精灵图将被分配至“镂空”通道。
* ** 其余所有精灵图均分配至“实心”通道。
* 更新了<code>textures</code>纹理映射的格式：
* * 非字符串类型的条目现在将被拒绝，不再会被解析为字符串。
* * 除了此前已有的内联精灵图ID形式外，条目现在还可以通过包含以下字段的来定义：
* ** <code>sprite</code> - 精灵图ID
* ** <code>force_translucent</code> - 可选布尔值，若设为<code>true</code>，则使用此纹理的所有几何体将被强制划入“半透明”通道。
* *** 该选项对例如使用<code>mean</code>均值mipmap策略但不含半透明像素的方块很有用。
* *** 默认值：<code>false</code>

* *实体纹理**
<ul>
<li>重命名了下列纹理：

</li>
<li>移动了下列纹理：

</li>
</ul>

* *[着色器](着色器.md)与后处理管线**
* <code>lightmap.fsh</code>被大幅修改。
* * Uniform<code>LightmapInfo</code>现在拥有两个新字段：
* ** <code>BlockLightTint</code>
* ** <code>NightVisionColor</code>
* * 移除了<code>AmbientLightFactor</code>，其值现在会预先乘进<code>AmbientColor</code>。
* * 将<code>DarkenWorldFactor</code>重命名为<code>BossOverlayWorldDarkeningFactor</code>。
* UI中的物品和文字渲染现在使用独立的1x1白色lightmap纹理，因此lightmap着色器不再需要保持15，15的纯白色。
* 着色器<code>core/rendertype_item_entity_translucent_cull</code>被移除，由<code>core/entity</code>取代。
* 着色器<code>core/rendertype_entity_alpha</code>和<code>core/rendertype_entity_decal</code>被移除，改为<code>core/entity</code>实现的<code>DISSOLVE</code>标志。<!--原文语序很怪-->
* UI和世界中的物品渲染现在由<code>core/entity</code>拆分到新着色器<code>core/item</code>。
* <code>block.vsh</code>与<code>terrain.vsh</code>顶点着色器现在不再接收<code>Normal</code>法线顶点属性。

* *其他更改**
* 如果服务器磁盘空间不足，服务器管理员会看到弹窗。
* 更改了区块几何数据在GPU内存中的存储方式及其渲染逻辑的内部实现。

# 更改（实验性）
以下内容仅在创建世界时启用“”内置数据包后才会出现。

# = 常规 =
* *[标签](Java版标签.md)**
* 移除了下列标签：
* * <code>trades/desert_special</code>
* * <code>trades/jungle_special</code>
* * <code>trades/plains_special</code>
* * <code>trades/savanna_special</code>
* * <code>trades/snow_special</code>
* * <code>trades/swamp_special</code>
* * <code>trades/taiga_special</code>

* *[魔咒提供器](魔咒提供器.md)**
* 移除了所有实验性的魔咒提供器。

# 修复
文件夹中。
|304217|突进魔咒的额外饥饿度要求会被作用于包含<code>post_piercing_attack</code>组件的自定义魔咒。
|304599|海豚不会像在基岩版中那样在玩家骑乘鹦鹉螺时跟随玩家。
|304631|当“各向异性过滤”选项被设置为<code>8x</code>时，使用奇数尺寸的透明与半透明纹理的方块会在远距离变得透明。
|304725|使用默认的僵尸村民刷怪蛋生成的僵尸村民总是平原变种。
|304991|在旁观模式下，尝试打开尚未生成战利品的容器时会播放<code>block.chest.locked</code>音效。
|305012|游戏规则<code>universal_anger</code>的描述中仍然使用游戏规则<code>forgive_dead_players</code>的旧ID。
|302734|僵尸马反复进入并离开水直到被烧死。
|304361|僵尸鹦鹉螺的头的尾部有较大空隙。
|304705|调试屏幕叠加层<code>entity_render_stats</code>项的E值没有正常运作。
|304761|抬起时间较长的矛的冲锋动画旋转时间太长。
|305040|繁殖生成的鹦鹉螺会自然消失。
|297536|调试屏幕上的十字准星存在深度冲突。
|299992|手动将某些组件设置为默认值时，给予物品或对物品进行测试会出现异常行为。
|305292|铜箱子使用圣诞节礼物纹理。
|131745|沉船有时会在区块边界两侧生成不同的木板变种。
|298136|信标外层光柱现在总是在方块实体后面渲染。
|302635|通过被活塞推动的半透明方块观察时，半透明方块在固体方块前面渲染。
|305699|成群的猪灵不会尝试捕猎疣猪兽。
|102774|可以只用2个末地水晶重生末影龙。
|163978|生物可以在移动的方块上生成。
|260148|只适用于有序配方。
|305388|蜜蜂一直保持被激怒的状态。
|305888|在下界或末地的海龟蛋不再孵化。
|134573|游戏在备份世界时卡住。
|259032|对较小的负数输出正数结果。
|264187|光照限制设置为不包含15的区间的刷怪笼不会在夜晚露天生成生物。
|273228|使用自定义世界生成数据包生成水湖时，游戏崩溃。
|303403|悬挂式告示牌方块展示实体渲染成黑色，且在其他方块和生物前面渲染。
|305580|幼年的僵尸马、骷髅马和骆驼尸壳可以生长为成年的，和其他幼年亡灵生物不同。
|306123|狼在和平难度下仍然尝试攻击玩家。
|13187|炼药锅中的水不透明。
|257362|破坏青蛙卵产生的粒子是透明的。
|263488|粉红色花簇的物品纹理有一个位置错误的透明像素。
|299730|使用TTF字体时转储纹理会导致游戏崩溃。
|305580|幼年僵尸马和幼年骷髅马会生长为成年变种，和其他幼年亡灵生物不一致。
|98631|第一人称视角下，盾牌的高度因使用主手或副手持盾而不同。
|99647|记分板显示位置对非玩家实体无效。
|129886|尝试在以下放置方块不会产生错误信息。
|178713|可以对位于建筑高度限制的特定植物使用骨粉，但是其不会生长。
|184432|在植物无法向上或向下生长而超出建筑高度限制时对其使用骨粉不会产生警告。
|184433|对位于建筑高度限制的矮草丛、蕨、下界菌使用骨粉时，不会产生警告，且植物的较高部分被截断。
|254785|对上面有方块的2&times;2像素大小的竹子使用骨粉会消耗骨粉。
|264155|骨粉对洞穴空气或虚空空气下方的草方块不起作用。
}}

# 参考

# 导航

[de:26.1](de:26.1.md)
[en:Java Edition 26.1](en:Java Edition 26.1.md)
[es:Java Edition 26.1](es:Java Edition 26.1.md)
[fr:Édition Java 26.1](fr:Édition Java 26.1.md)
[it:Java Edition 26.1](it:Java Edition 26.1.md)
[ja:Java Edition 26.1](ja:Java Edition 26.1.md)
[lzh:爪哇版二六點一](lzh:爪哇版二六點一.md)
[pl:Java Edition 26.1](pl:Java Edition 26.1.md)
[pt:Edição Java 26.1](pt:Edição Java 26.1.md)
[ru:26.1 (Java Edition)](ru:26.1 (Java Edition).md)