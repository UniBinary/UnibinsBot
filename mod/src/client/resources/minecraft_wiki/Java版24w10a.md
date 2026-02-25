# Java版24w10a

*页面ID: 114105* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w10a**是[Java版1.20.5](Java版1.20.5.md)的第11个快照，发布于2024年3月6日<ref></ref>，加入了[狼](狼.md)的新变种和[物品堆叠组件](物品堆叠组件.md)的简化格式，更新了[物品栏](物品栏.md)槽位名称，让物品堆叠组件可在部分[配方](配方.md)中生效，并修复了一些漏洞。

# 新内容
# = 生物 =
* *[狼](狼.md)**
* 加入了狼的多个变种，生成的变种取决于其自然生成时所处的[生物群系](生物群系.md)，或是繁殖生成时其双亲所属的变种。
* * ，即使用先前纹理的狼，在[针叶林](针叶林.md)中以4只为一群生成。
* * ，在[森林](森林.md)中以4只为一群生成。
* * ，在[积雪针叶林](积雪针叶林.md)中以4只为一群生成。
* * ，在[原始松木针叶林](原始松木针叶林.md)中以2-4只为一群生成。
* * ，在[原始云杉针叶林](原始云杉针叶林.md)中以2-4只为一群生成。
* * ，在[稀疏丛林](稀疏丛林.md)中以2-4只为一群生成。
* * ，在[热带高原](热带高原.md)中以4-8只为一群生成。
* * ，在[疏林恶地](疏林恶地.md)中以4-8只为一群生成。
* * ，在[雪林](雪林.md)中罕见地生成一只。
* 在除以上的其他生物群系使用[刷怪蛋](刷怪蛋.md)及[命令](命令.md)生成的狼均为苍狼。

# = 常规 =
* *实体谓词**
* 加入了实体副谓词<code>slots</code>，用于比较任何实体的单个或多个槽位。
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
* * <code>player.cursor</code>：[创造模式物品栏](创造模式物品栏.md)外玩家的鼠标持有的物品。<ref></ref>
* * ：玩家物品栏中的合成栏。
* * <code><slot></code>参数不可使用以<code>*</code>为后缀的槽位区间。

# 更改
# = 方块 =
* *[砂轮](砂轮.md)**
* 现在不接受具有组件但没有魔咒的物品。
* * 如果上方物品允许存在耐久度，则可使用下方附魔的无法破坏物品为其修复，输出的物品不会继承组件；如果交换物品顺序，则既不可祛魔也不可修复；如果只存在附魔的无法破坏物品，则仅祛魔而保留组件。
* 现在不可同时为两本附魔书祛魔。

* *[玩家的头](玩家的头.md)**
* 现在于<code>custom_name</code>标签中储存物品名称。
* NBT标签被<code>profile</code>替代以与物品形式的组件格式统一。

# = 物品 =
* *常规**
* 现在物品数为1时<code>count</code>又会被储存了。
* * 如果该字段无效则默认为1。

# = 生物 =
* *[狼](狼.md)**
* 现在可以在[砂土](砂土.md)和[灰化土](灰化土.md)上生成。
* 现在会生成于[稀疏丛林](稀疏丛林.md)、[热带高原](热带高原.md)和[疏林恶地](疏林恶地.md)生物群系中。

# = 世界生成 =
* *[雪林](雪林.md)**
* 不再生成[鸡](鸡.md)、[猪](猪.md)、[牛](牛.md)和[绵羊](绵羊.md)。

# = 命令格式 =
* ***
* 条件子命令现在可用新类型<code>items</code>以比较物品或为物品计数。
* * <code><nowiki>execute if|unless items <source> <slots> <item_predicate></nowiki></code>
* ** <code><nowiki><source></nowiki></code>：用法与中相同。
* *** 示例：<code>block <x> <y> <z></code>或<code>entity <target></code>（可返回多个实体）。
* ** <code><slots></code>：可以为单个槽位（如<code>container.0</code>）或槽位区间（如<code>container.*</code>）
* ** <code><item_predicate></code>：用法与中的物品谓词相同。
* 如果单独使用，则会返回符合条件的物品堆中物品的总数。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>34</code>。
* 现在旗帜图案会从<code>-{}-data/<*命名空间*>/banner_pattern/<*id*></code>中加载到动态注册表中。
<div class="treeview">
  * ：根标签。
  ** ：（命名空间ID）用于解析纹理位置。示例：<code>custom:pattern</code>会被解析为<code>assets/custom/textures/entity/banner/pattern.png</code>和<code>assets/custom/textures/entity/shield/pattern.png</code>。
  ** ：一个翻译键前缀。示例：<code>block.minecraft.banner.custom.pattern</code>会被解析为<code>-{}-block.minecraft.banner.custom.pattern.<*所染颜色*></code>。
</div>

* *[提示框](提示框.md)**
* 鼠标悬停于元素外时，按钮提示框不再显示。

* *[配方](配方.md)**
* 现在可以指定物品组件。
* * 的物品堆现在接受。
* * 类型配方的字段现在改为无数量的物品堆叠格式，即必须指定且可指定数据。

* *[标签](Java版标签.md)**
* 在方块标签中加入了。

* *[物品堆叠组件](物品堆叠组件.md)**
* 不再需要字段。
* 现在某些组件支持用于代替的简单定义：
* * 现在也可以定义为来表示玩家名称。示例：<code>profile="jeb_"</code>。
* * 现在也可以定义为。示例：<code>dyed_color=16711680</code>。
* * 现在可以直接定义为。示例：<code>attribute_modifiers=[{type:'generic.scale',uuid:[1,2,3,4],name:'大！',amount:1.0,operation:'add_multiplied_base'}]</code>。
* * 现在可以定义为单一药水ID。示例：<code>potion_contents="invisibility"</code>。
* * 和现在可以定义为包含[魔咒](魔咒.md)ID和等级的内联键值对。示例：<code>enchantments={sharpness:1}</code>。
* * 这些定义仅为简化替代，它们总是以完整形式存储。
* 现在组件适用于所有的[容器](容器.md)而不只有[潜影盒](潜影盒.md)。
* 将组件重命名为。
* * 和现在被移入（可选）。
* * 不存在时，指南针会旋转。
* 和的项数最大值现在被提升到256。
* 具有和组件的物品现在可以正常堆叠了，此前仅能堆叠1个物品。

# 更改（实验性）
# = 方块 =
* *[宝库](宝库.md)**
* 再次更改了未激活状态的宝库的纹理。

# 修复
命令时粒子效果出现。
|268834|宝库的纹理不一致。
|268842|在保存有物品形式的的世界时崩溃。
|268845|在创造模式下，带有<code>can_break</code>或<code>can_place_on</code>组件的物品总在更改物品栏时更新。
|268850|切换快捷栏中物品时属性修饰符的效果未更新。
|268851|弩不发出射箭音效。
|268853|不能加载任何变种的。
|268856|加载带有单个无效物品的潜影盒或收纳袋会使其所有组件失效。
|268864|具有重复物品堆叠组件的物品修饰符会阻止（重新）加载整个数据包而不是在加载数据包时忽略此物品修饰符。
|268879|损坏高损伤值的物品导致游戏崩溃。
|268897|带有数量为1的物品堆的实体不能被目标选择器选中。
|268904|谜之炖菜不给予状态效果。
|268921|卸载世界后，箭失去粒子。
|268971|破坏磁石指针绑定的磁石后，磁石指针停止工作。
|269005|来源于24w07a的玩家的头有时导致游戏崩溃，有时数据转化异常。
|269062|右键单击删除过<code>bundle_contents</code>组件的收纳袋后，该组件还原。
|269066|物品修饰符不能删除<code>custom_name</code>。
|269091|具有失效字段的<code>AttributeModifiers</code>NBT未正确地升级为组件。
}}</onlyinclude>

# 参考

# 导航

[de:24w10a](de:24w10a.md)
[en:Java Edition 24w10a](en:Java Edition 24w10a.md)
[es:Java Edition 24w10a](es:Java Edition 24w10a.md)
[fr:Édition Java 24w10a](fr:Édition Java 24w10a.md)
[ja:Java Edition 24w10a](ja:Java Edition 24w10a.md)
[lzh:二四週一〇甲](lzh:二四週一〇甲.md)
[pt:Edição Java 24w10a](pt:Edição Java 24w10a.md)
[ru:24w10a (Java Edition)](ru:24w10a (Java Edition).md)
[uk:24w10a (Java Edition)](uk:24w10a (Java Edition).md)