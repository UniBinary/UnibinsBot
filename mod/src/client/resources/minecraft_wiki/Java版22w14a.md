# Java版22w14a

*页面ID: 94601* | *来源: Minecraft Wiki*

<onlyinclude>

* *22w14a**是[Java版1.19](Java版1.19.md)的第4个快照，发布于2022年4月6日<ref></ref>，加入了[红树](红树.md)、[红树林沼泽](红树林沼泽.md)生物群系、[回响碎片](回响碎片.md)和[追溯指针](追溯指针.md)2种物品，以及[黏土](黏土.md)新的可再生途径，并修复了主要与[远古城市](远古城市.md)和[监守者](监守者.md)相关的一些漏洞。

# 新内容
# = 物品 =
* *[回响碎片](回响碎片.md)**
* 仅生成于[远古城市](远古城市.md)的战利品箱中。
* 可用于合成追溯指针。

* *[追溯指针](追溯指针.md)**
* 指南针的新变种，会指向玩家上次死亡的位置。
* 指针会在玩家没有死亡位置或者位置在其他维度中时无规则旋转。
* 可使用指南针和8个回响碎片合成。

# = 世界生成 =
* *[红树林沼泽](红树林沼泽.md)**
* 沼泽的新变种，生成在更加温暖潮湿的区域，水体呈浅青色，水面上会生成[睡莲](睡莲.md)，通常靠近[丛林](丛林.md)和[沙漠](沙漠.md)。
* 含有[红树](红树.md)，一种新的[树木](树木.md)。
* * 形状独特，根须发达，树木的底部是可达13格高的[红树根](红树根.md)，[红树原木](红树原木.md)、[红树树叶](红树树叶.md)在红树根之上生长。
* * 树叶侧面垂挂着茂密的[藤蔓](藤蔓.md)，一些树叶下悬挂着成熟的[红树胎生苗](红树胎生苗.md)。
* * 可能生成[蜂巢](蜂巢（方块）.md)。
* * 由[红树胎生苗](红树胎生苗.md)生长而成。
* 自然生成白色[青蛙](青蛙.md)和[史莱姆](史莱姆.md)，但不生成绵羊、牛、猪或鸡。
* 不会生成[沼泽小屋](沼泽小屋.md)。
* 地表被单层[泥巴](泥巴.md)覆盖，偶尔会生成[草方块](草方块.md)斑簇和[枯萎的灌木](枯萎的灌木.md)。

# = 游戏内容 =
* *[进度](进度.md)**
* 加入了2个新进度。
<!--
版本页面的内容属于“历史内容”，进度描述请勿使用模板。
要修改进度名称，请到和中进行。
在Crowdin approved前，请不要汉化尚未approved的进度名称和描述。每个中文变体都是如此。
繁简/地区转换请用。
-->
* * [](进度#advancements-anchor-husbandry.allay_deliver_item_to_player.md)
* **
* * [](进度#advancements-anchor-husbandry.allay_deliver_cake_to_note_block.md)
* **
* 加入了<code>item_delivered_to_player</code>进度触发器，会在[悦灵](悦灵.md)给予玩家物品时触发。有以下可用条件：
* * <code>player</code>：执行此触发器的玩家
* 加入了<code>allay_drop_item_on_block</code>进度触发器，会在悦灵往方块上投掷物品时触发。有以下可用条件：
* * <code>player</code>：执行此触发器的玩家
* * <code>location</code>：悦灵投掷的物品着落的方块的谓词
* * <code>item</code>：悦灵投掷的物品的谓词

# = 常规 =
* *[玩家数据格式](玩家数据格式.md)**
* 加入了<code>LastDeathLocation</code>新字段，此字段包含<code>dimension</code>（字符型，维度ID），<code>pos</code>（整型数组，为玩家死亡时坐标的3个整数值）2个字段。

* *[标签](Java版标签.md)**
* 加入了以下[方块标签](Java版标签/方块.md)：
* * ：。
* * ：。
* * ：。
* 加入了以下[物品标签](Java版标签/物品.md)：
* * ：。
* 加入了以下[实体类型](Java版标签/实体类型.md)：
* * ：。
* 加入了以下[游戏事件标签](Java版标签/游戏事件.md)：
* * ：
* 加入了以下[猫变种标签](Java版标签/猫变种.md)（新类型）：
* * ：。
* * ：。

# 更改
# = 方块 =
* *[枯萎的灌木](枯萎的灌木.md)**
* 现在可以放在泥巴上面。

* *[红树胎生苗](红树胎生苗.md)**
* 现在会长成红树，而非之前的橡树。

* *[泥巴](泥巴.md)**
* 现在将泥巴放在下方挂有[滴水石锥](滴水石锥.md)的方块上一段时间后，其会转化为[黏土](黏土.md)。

# = 生物 =
* *[青蛙](青蛙.md)**
* 改为捕食时对猎物造成10点的基础攻击伤害，而非之前直接清除实体的方式。

* *[监守者](监守者.md)**
* 现在所有与监守者发生接触的生物都会将其激怒，不再限于玩家。
* 不再在[水](水.md)中生成。
* 寻路时可穿过[熔岩](熔岩.md)。
* 增大了其阴影尺寸。

# = 世界生成 =
* *[远古城市](远古城市.md)**
* 移除了<code>small_portal_statue</code>、<code>intact_horizontal_wall_stairs_upward</code>、<code>top_piece</code>、<code>bottom_piece</code>及其变种结构，因为它们与现有结构重复。
* 修改了一些结构。
* * 略微更改了<code>city_center_2</code>箱子周围的方块，使在此处产生的振动总会被下方的[幽匿感测体](幽匿感测体.md)检测到。
* * 为<code>bottom_1</code>的其中一个[红石灯](红石灯.md)补上了幽匿感测体。
* * 将<code>ice_box_1</code>的蓝色和淡蓝色[地毯](地毯.md)替换为灰色地毯，且其中的[活板门](活板门.md)默认不再处于打开状态。
* * <code>entrance_path_5</code>现在可以自然生成。
* 修改了箱子中的战利品：
* * 现在每个箱子都有一轮额外的战利品，可能的选项包括1-3个回声碎片。
* * 将<code>city_center_2</code>中的[金胡萝卜](金胡萝卜.md)替换为[金苹果](金苹果.md)。

# = 游戏内容 =
* *[进度](进度.md)**
* 进度“”现在还需要玩家到访红树林沼泽生物群系。
* 从进度触发器中移除了<code>location</code>字段，因为其处理方式与<code>player.location</code>完全相同。

# = 常规 =
* *[实体数据格式](实体数据格式.md)**
* 将[猫](猫.md)的实体数据格式中的<code>CatType</code>字段更改为<code>variant</code>字段。
* * 新字段支持字符串类型的值（命名空间ID），而非原先的数值类型的值（例如：<code>5</code>现在改为<code>minecraft:calico</code>）。
* [青蛙](青蛙.md)的实体数据格式中的相应字段也有与上述内容相类似的变更。

* *[战利品表](战利品表.md)**
* 向[史莱姆](史莱姆.md)与[岩浆怪](岩浆怪.md)战利品表中加入了与其大小相关的特殊战利品表，由数据驱动，并使用新的子谓词类型。
* 青蛙捕食出的掉落物现在由被捕食生物的战利品表控制，取代了之前硬编码物品类型的方式。

* *[战利品表谓词](战利品表谓词.md)**
* <code>type_specific</code>字段替代了字段。
* <code>type_specific</code>具有字段<code>type</code>，内容与已移除的字段相同（即或<code>cat</code>中的一种）。
* 例如：
  * 更改前：
  ::<syntaxhighlight lang="json">
 "lightning_bolt": {
   "blocks_set_on_fire": 0
 }
</syntaxhighlight>
  * 更改后：
  ::<syntaxhighlight lang="json">
  "type_specific": {
    "type": "lightning",
    "blocks_set_on_fire": 0
  }
</syntaxhighlight>
* <code>catType</code>现在被置于对象之中，与新格式相匹配。现在使用的是猫的种类名称，而不是以前使用的纹理名称。
  * 更改前：
  ::<syntaxhighlight lang="json">
"catType": "minecraft:textures/entity/cat/british_shorthair.png"
</syntaxhighlight>
  * 更改后：
  ::<syntaxhighlight lang="json">
 "type_specific": {
    "type": "cat",
    "variant": "minecraft:british"
 }
</syntaxhighlight>
* 在<code>type_specific</code>中加入了以下新选项：
* * <code>frog</code>，其中有<code>variant</code>字段，与青蛙的几种变体（或<code>minecraft:cold</code>）相匹配。
* * <code>slime</code>适用于史莱姆和岩浆怪，其中有<code>size</code>字段与史莱姆的大小相匹配（最小为1）。

* *[标签](Java版标签.md)**
* 向生物群系标签中加入了红树林沼泽。
* 移除了方块标签，其中全部内容合并至方块标签中。
* 将游戏事件标签重命名为，并移除了其中的，向其中加入了。

# 修复
</onlyinclude>

# 参考

# 导航

[de:22w14a](de:22w14a.md)
[en:Java Edition 22w14a](en:Java Edition 22w14a.md)
[es:Java Edition 22w14a](es:Java Edition 22w14a.md)
[fr:Édition Java 22w14a](fr:Édition Java 22w14a.md)
[ja:Java Edition 22w14a](ja:Java Edition 22w14a.md)
[pt:Edição Java 22w14a](pt:Edição Java 22w14a.md)
[ru:22w14a (Java Edition)](ru:22w14a (Java Edition).md)
[th:รุ่น Java 22w14a](th:รุ่น Java 22w14a.md)