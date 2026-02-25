# Java版1.13/扁平化

*页面ID: 31902* | *来源: Minecraft Wiki*

[Java版1.13](Java版1.13.md)版本修改了许多方块和物品的数据值，亦添加并移除了一些方块状态。<ref>中的 https://bugs.mojang.com/secure/attachment/151784/the_flattening.txt </ref>这个过程也被称作“**扁平化（The Flattening）**”。

此页面当前的内容为[1.12.2](Java版1.12.2.md)和[1.13](Java版1.13.md)版本之间标识符的比较。

# 方块和物品ID
以任何方式更改了ID的[方块](方块.md)和[物品](物品.md)也会改变其[统计信息](统计信息.md)。

# 实体ID
以任何方式更改了ID的实体也会改变其统计信息。

# 生物群系ID

# [粒子](粒子.md)ID
粒子ID现在也拥有了像其他ID (在前面）一样的命名空间。

# 声音事件

# [方块状态](方块状态.md)

# [画](画.md)
画现在也拥有了像其他ID (在前面<code>minecraft:</code>)一样的命名空间。

# [名称](Java版数据值.md)

# [统计信息](统计信息.md)
* 现在改变为带命名空间的了。
* * "通用"标签的格式是<code>minecraft.custom:minecraft.something</code>而不是<code>stat.something</code>，其中"something"必须为小写且用下划线分隔开。
* * 开采方块的格式是<code>-{}-minecraft.mined:namespace.(方块id)</code>而不是<code>-{}-stat.mineBlock.(方块id)</code>。
* * 损坏物品的格式是<code>minecraft.broken:namespace.(物品id)</code>而不是<code>stat.breakItem.(物品id)</code>。
* * 丢弃物品的格式是<code>minecraft.dropped:namespace.(物品id)</code>而不是<code>stat.drop.(物品id)</code>。
* * 使用物品的格式是 <code>minecraft.used:namespace.(物品id)</code>而不是<code>stat.useItem.(物品id)</code>。
* * 击杀生物的格式是<code>-{}-minecraft.killed:namespace.(实体id)</code>而不是<code>-{}-stat.killEntity.(实体id)</code>。
* ** 对所有实体都可用了，而不是仅仅能用刷怪蛋生成的实体。
* * 被实体击杀的格式是<code>-{}-minecraft.killed_by:namespace.(实体id)</code>而不是<code>-{}-stat.entityKilledBy.(实体id)</code>。
* ** 对所有实体都可用了，而不是仅仅能用刷怪蛋生成的实体。
* 合并了方块和物品标签。

# [NBT数据](区块存储格式.md)
; [物品格式](物品格式.md)
* 移除了物品的数据根目录下的<code>Damage</code>数据。
* <code>Damage</code>数据被添加进了<code>tag</code>标签，只为工具的耐久度所使用。
* <code>map</code>整数数据被添加进了<code>tag</code>标签，只为[地图](地图.md)所使用。
* [盾牌](盾牌.md)的<code>Base</code>数据拥有了与习惯相反的颜色序列。
* [魔咒](魔咒.md)的<code>ench</code>数据被重命名为<code>Enchantments</code>数据。
* [魔咒](魔咒.md)ID中的<code>Enchantments</code>数据和<code>StoredEnchantments</code>数据现在使用字符串ID。

; [实体数据格式](实体数据格式.md)
* [狼](狼.md)的<code>CollarColor</code>数据拥有了与习惯相反的颜色序列。
* [末影人](末影人.md)的<code>carried</code>数据和<code>carriedData</code>数据合并成了<code>carriedBlockState</code>数据。<ref group="注" name="tag">这个标签拥有像<code>-{}-{Name:"<*方块ID*>",Properties:{state:"value"}}</code>这样的复合格式。</ref>
* [箭](箭.md)和[光灵箭](光灵箭.md)的<code>inTile</code>数据和<code>inData</code>数据合并成了<code>inBlockState</code>数据。<ref group="注" name="tag" />
* [矿车](矿车.md)的<code>DisplayTile</code>数据和<code>DisplayData</code>数据合并成了<code>DisplayState</code>数据。<ref group="注" name="tag" />
* [下落的方块](下落的方块.md)的<code>Block</code>数据和<code>Data</code>数据合并成了<code>BlockState</code>。<ref group="注" name="tag" />
* [区域效果云](区域效果云.md)的<code>ParticleParams1</code>数据和<code>ParticleParams2</code>数据被移除了，并且和Particle合并了（与命令中的格式一样）。

; [方块](区块存储格式.md)
* 移除了[花盆](花盆.md)的方块实体。
* 移除了[音符盒](音符盒.md)的方块实体。
* [移动的活塞](移动的活塞.md)的<code>BlockId</code>数据和<code>BlockData</code>数据合并成了<code>blockState</code>数据。<ref group="注" name="tag" />
* 移除了[旗帜](旗帜.md)的<code>Base</code>数据。
* 移除了[生物头颅](生物头颅.md)的<code>Rot</code>数据。
* [旗帜](旗帜.md)和[盾牌](盾牌.md)的<code>Color</code>数据和<code>Patterns</code>数据拥有了与习惯相反的颜色序列。
* 移除了[音符盒](音符盒.md)的<code>Record</code>数据。

# [命令](命令.md)
* 的<code><nowiki>[<data>]</nowiki></code>部分已被移除。<ref group="注" name="items">另见章节来了解其他数据值的变化和1.13里的[物品](Java版1.13.md)章节。</ref>
* 的<code><nowiki>[<data>]</nowiki></code>部分已和ID合并而且不再允许元数据。<ref group="注" name="blocks">另见1.13里的[物品](Java版1.13.md)章节。</ref>
* 已被修改为unless) block}}，其中的<code><nowiki>[<data>]</nowiki></code>部分已和ID合并而且不再允许元数据。<ref group="注" name="blocks"/>
* 的<code><nowiki>[<data>]</nowiki></code>和<code>[<replaceData>]</code>部分已和ID合并而且不再允许元数据。<ref group="注" name="blocks"/>
* 的<code><nowiki>[<data>]</nowiki></code>部分已被移除。<ref group="注" name="items"/>
* 的<code><nowiki>[<data>]</nowiki></code>部分已被移除。<ref group="注" name="items"/>
* 的<code><nowiki>[<data>]</nowiki></code>部分已和ID合并而且不再允许元数据。<ref group="注" name="blocks"/>
* 的<code>[<params>]</code>部分已与<code>name</code>合并，而且格式化为<code>block_id[states]</code>和<code>item_id</code>。

# [进度](进度.md)
* 移除了<code>icon</code>的<code>data</code>数据。
* 移除了<code>item</code>条件中的<code>data</code>数据。

# [战利品表](战利品表.md)
* 移除了<code>set_data</code>函数。

# 游戏资源
* [模型](模型.md)
* * 重命名成新的ID。
* [方块状态](方块状态.md)文件
* * 重命名成新的ID。
* * 无方块状态的方块现在使用空的字符串<code>""</code>而不是<code>"normal"</code>。
* * 物品展示框现在拥有<code>"map=false"</code>而不是<code>"normal"</code>和<code>"map=true"</code>而不是<code>"map"</code>。
* * 模型引用时不再从<code>models/block/</code>文件夹中引用，而是从<code>models/</code>中。
* [纹理](纹理.md)
* * 重命名成新的ID。
* * 将<code>blocks</code>文件夹重命名成<code>block</code>。
* * 将<code>items</code>文件夹重命名成<code>item</code>。
* [配方](配方.md)
* * 重命名成新的ID。
* [进度](进度.md)
* * 配方进度重命名成新的ID。
* [语言](语言.md)文件
* * 方块本地化键名的格式是<code>block.namespace.block_id</code>而不是<code>tile.something.name</code>（其中"something"可以是任意的名字，比如[荧石](荧石.md)的"lightgem"；例如<code>"tile.lightgem.name": "Glowstone"</code>已经被<code>"block.minecraft.glowstone": "Glowstone"</code>所替代）
* * 物品本地化键名的格式是<code>item.namespace.item_id</code>而不是<code>item.something.name</code>（其中"something"可以是任意的名字，比如[荧石粉](荧石粉.md)的"yellowDust"；例如<code>"item.yellowDust.name": "Glowstone Dust"</code>已经被<code>"item.minecraft.glowstone_dust": "Glowstone Dust"</code>所替代）
* * 实体本地化键名的格式是<code>entity.namespace.entity_id</code>而不是<code>entity.something.name</code>（其中"something"可以是任意的名字，比如[矿车](矿车.md)的"MinecartRideable"；例如<code>"entity.MinecartRideable.name": "Minecart"</code>已经被<code>"entity.minecraft.minecart": "Minecart"</code>所替代）
* * 魔咒本地化键名的格式是<code>enchantment.namespace.enchantment_id</code>而不是<code>enchantment.something</code>（其中"something"可以是任意的名字，比如[水下速掘](水下速掘.md)的"waterWorker"；例如<code>"enchant.waterWorker": "Aqua Affinity"</code>已经被<code>"enchantment.minecraft.aqua_affinity": "Aqua Affinity"</code>所替代）
* * 状态效果本地化键名的格式是<code>effect.namespace.effect_id</code>而不是<code>effect.something</code>（其中"something"可以是任意的名字，比如[挖掘疲劳](状态效果.md)的"digSlowDown"；例如<code>"effect.digSlowDown": "Mining Fatigue"</code>已经被<code>"effect.minecraft.mining_fatigue": "Mining Fatigue"</code>所替代）
* * 通用统计本地化键名的格式是<code>stat.namespace.statistic_id</code>而不是<code>stat.statisticId</code>（其中"statisticId"可以是任意的统计名称，比如游玩时间的"playOneMinte"；例如<code>"stat.playOneMinute": "Time Played"</code>已经被<code>"stat.minecraft.play_one_minute": "Time Played"</code>所替代）
* * 统计信息本地化键名的格式是<code>stat_type.namespace.statistic_type</code>而不是<code>stat.statisticType</code>（其中"statisticType"可以是任意的统计种类，比如击杀生物的"entityKills"；例如<code>"stat.entityKills": "You killed %s %s"</code>已经被<code>"stat_type.minecraft.killed": "You killed %s %s"</code>所替代）

# 历史

|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
}}

# 参考

[cs:1.13/Zploštění](cs:1.13/Zploštění.md)
[de:Versionen/Vollversion 1.13/Metadaten-Entfernung](de:Versionen/Vollversion 1.13/Metadaten-Entfernung.md)
[en:Java Edition Flattening](en:Java Edition Flattening.md)
[es:Java Edition 1.13/Reestructuración](es:Java Edition 1.13/Reestructuración.md)
[fr:Édition Java 1.13/Aplanissement](fr:Édition Java 1.13/Aplanissement.md)
[ja:Java Edition 1.13/平坦化](ja:Java Edition 1.13/平坦化.md)
[ko:Java Edition 1.13/평탄화](ko:Java Edition 1.13/평탄화.md)
[pt:Nivelamento da Edição Java](pt:Nivelamento da Edição Java.md)