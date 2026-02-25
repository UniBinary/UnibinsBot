# 编码格式/BlockEntity

*页面ID: 143899* | *来源: Minecraft Wiki*

此条目记录了各种方块实体中的共通标签。

本条目部分内容合并自其他页面，详见[本页面的链入页面](special:链入页面/编码格式/BlockEntity.md)。

下列结构需要与最新版本同步更新：

下列特定版本中出现的NBT结构：

# 当前版本
# = 熔炉共通标签 =

<div class="treeview">
*  <code>AbstractFurnaceBlockEntity::loadAdditional</code> & <code>AbstractFurnaceBlockEntity::saveAdditional</code><section begin="codec_abstract_furnace"/>
* * ：烧炼物已被烧炼的时间。当该值等于时，本次烧炼完成，此值重置为0。若为0，此值每游戏刻减少2。若此值大于，则无法完成烧炼。
* * ：烧炼物完成烧炼所需时间。
* * ：当前内物品的列表，超出槽位范围的物品无效。槽位0存放烧炼物数据；槽位1存放燃料数据；槽位2存放烧炼成品数据。
* ** ：物品数据。
* ***
* * ：当前使用的燃料剩余的燃烧时间。
* * ：应燃烧的总时长。
* * ：从最后一次玩家取出成品到现在已烧炼的配方数，用于计算经验值。
* ** ：此配方烧炼完成的次数。
<section end="codec_abstract_furnace"/>
</div>

# = 容器方块实体共通标签 =

<div class="treeview">
*  <code>BaseContainerBlockEntity::loadAdditional</code> & <code>BaseContainerBlockEntity::saveAdditional</code><section begin="codec_base_container"/>
* * ：（[文本组件](文本组件.md)）当前的名称，会取代默认名称出现在的界面中。
* * ：如果存在，只能用符合该物品谓词的物品打开。
* **
<section end="codec_base_container"/>
</div>

# = 刷怪笼共通标签 =

<div class="treeview">
*  <code>BaseSpawner::load</code> & <code>BaseSpawner::save</code><section begin="codec_base_spawner"/>
* * ：距离下次生成的时间。如果此值为-1，则玩家接近时此值会重置为一个随机的生成延迟；如果此值不大于0，则玩家接近时立刻生成。
* * ：（默认为6）生成实体的范围内具有与刷怪笼生成实体类型相同的实体的最大数量。如果附近符合条件的实体数量超过此值则刷怪笼不再生成实体。
* * ：（默认为，与一起设置时生效）随机生成延迟的上限。
* * ：（默认为）随机生成延迟的下限。
* * ：（默认为16，与一起设置时生效）玩家激活刷怪笼所需的距离。每游戏刻刷怪笼都会检查当前世界的所有玩家，确定是否有玩家进入该范围。若为负数则无视玩家距离激活。
* * ：（默认为4，与一起设置时生效）每次尝试生成实体的数量。
* * ：下一次生成实体的数据。在决定生成一次实体后，此项数据会从中随机挑选一项作为自身的数据，并覆盖之前的数据。
* **
* * ：一个包含可能生成的实体的列表。如该标签不存在，但存在，游戏会在刷怪笼下次尝试生成实体时生成此列表，列表中仅有一个从得到的项目。
* ** ：一次可能的生成。在试炼刷怪笼进行一次尝试生成**后**，游戏将会随机从中选择一项用于下次生成。
* *** ：一项生成项，与结构相同。
* ****
* *** ：（）相对其他生成项的选中此生成项的权重。
* * ：（默认为4）生成实体的范围，采用切比雪夫距离，越靠近刷怪笼生成在此位置的概率越大。
<section end="codec_base_spawner"/>
</div>

# = 方块实体共通标签 =

<div class="treeview">
*  <code>BlockEntity::loadWithComponents/loadCustomOnly/loadStatic</code> & <code>BlockEntity::saveWithFullMetadata/saveWithId/saveCustomOnly</code><section begin="codec_block_entity"/>
* * ：当前方块实体的X坐标。
* * ：当前方块实体的Y坐标。
* * ：当前方块实体的Z坐标。
* * ：|<code></code>|（命名空间ID）方块实体的类型。}}
* * ：方块实体的[数据组件](数据组件.md)信息。当使用此方块实体对应的物品放置此方块实体时，物品额外持有的且不会被继承序列化处理的数据组件会被复制存储入此标签内。
* ** ：一项数据组件和其对应的数据。
<section end="codec_block_entity"/>
</div>

# = 战利品容器方块实体共通标签 =

<div class="treeview">
*  <code><T extends RandomizableContainerBlockEntity> T::loadAdditional</code> & <code><T extends RandomizableContainerBlockEntity> T::saveAdditional</code><section begin="codec_randomizable_container"/>
* * ：（当不存在时存在且有效）当前内物品的列表，超出槽位范围的物品无效。如果战利品未生成，则此项不存在。
* ** ：一个物品。
* ***
* * ：决定第一次被打开时，生成战利品所用的[战利品表](战利品表.md)的[命名空间ID](命名空间ID.md)。此项将在战利品生成之后被删除。
* * ：（当存在时有效）生成战利品使用的种子，0或不输入将使用[随机序列](随机序列.md)。此项将在战利品生成之后被删除。
<section end="codec_randomizable_container"/>
</div>

# = 生成数据 =

<div class="treeview">
*  <code>SpawnData::CODEC</code><section begin="codec_spawn_data"/>
* * ：自定义生成条件，若指定则覆盖默认生成规则。
* ** ：（）方块光照限制。复合标签形式只用于加载，游戏只保存为整数（上下限相同时）或列表（上下限不同且不为[0,15]时）形式。
* ***
* ** ：（）天空光照限制，格式与方块光照限制相同。
* ***
* * ：要生成的实体。
* ** 见[实体数据格式](实体数据格式.md)。
* * ：设置生成生物的装备及掉率。
* ** ：（命名空间ID）战利品表，将获得的物品装备到生成的生物上。
* ** ：（默认全部槽位为0.085）设置生物死亡时指定槽位物品的掉落概率。使用形式时代表所有槽位按照此概率掉落。
* *** ：（）此槽位的掉落概率。
<section end="codec_spawn_data"/></div>

# = 振动监听器 =

<div class="treeview">
*  <code>Data::CODEC</code><section begin="codec_vibration_listener"/>
* * ：振动监听器正在监听的[游戏事件](游戏事件.md)。当没有能使此振动监听器触发的游戏事件时，此项不存在。
* ** ：（）振动监听器与振动源的距离。
* ** ：触发振动监听器的游戏事件的[命名空间ID](命名空间ID.md)。
* ** ：振动源的位置。
* *** ：X坐标。
* *** ：Y坐标。
* *** ：Z坐标。
* ** ：如果产生振动的实体是弹射物，此项保存投掷此弹射物的实体的[UUID](UUID.md)。
* ** ：产生振动的实体的UUID。
* * ：（，默认为0）振动到达前的时间。
* * ：振动选择器的数据。
* ** ：振动发生时的游戏时间，如果没有振动可供选择则为-1。
* ** ：候选的游戏事件，与上文的标签结构相同。
<section end="codec_vibration_listener"/>
</div>

# 特定版本
# = 方块实体共通标签（20w14∞） =

<div class="treeview">
*  <code>BlockEntity::load/loadStatic</code> & <code>BlockEntity::save/saveMetadata</code><section begin="codec_block_entity_20w14infinite"/>
* * ：当前方块实体的X坐标。
* * ：当前方块实体的Y坐标。
* * ：当前方块实体的Z坐标。
* * ：|<code></code>|（命名空间ID）方块实体的类型。}}
<section end="codec_block_entity_20w14infinite"/>
</div>

# = 方块实体共通标签（23w13a_or_b） =

<div class="treeview">
*  <code>BlockEntity::loadStatic</code> & <code>BlockEntity::saveWithFullMetadata/saveWithId</code><section begin="codec_block_entity_23w13a_or_b"/>
* * ：当前方块实体的X坐标。
* * ：当前方块实体的Y坐标。
* * ：当前方块实体的Z坐标。
* * ：|<code></code>|（命名空间ID）方块实体的类型。}}
<section end="codec_block_entity_23w13a_or_b"/>
</div>

# = 方块实体共通标签（24w14potato） =

<div class="treeview">
*  <code>BlockEntity::loadStatic</code> & <code>BlockEntity::saveWithFullMetadata/saveWithId/saveCustomOnly</code><section begin="codec_block_entity_24w14potato"/>
* * ：当前方块实体的X坐标。
* * ：当前方块实体的Y坐标。
* * ：当前方块实体的Z坐标。
* * ：|<code></code>|（命名空间ID）方块实体的类型。}}
* * ：方块实体的[数据组件](数据组件.md)信息。当使用此方块实体对应的物品放置此方块实体时，物品额外持有的且不会被继承序列化处理的数据组件会被复制存储入此标签内。
* ** ：一项数据组件和其对应的数据。
<section end="codec_block_entity_24w14potato"/>
</div>

# = 方块实体共通标签（25w14craftmine） =

<div class="treeview">
*  <code>BlockEntity::loadWithComponents/loadCustomOnly/loadStatic</code> & <code>BlockEntity::saveWithFullMetadata/saveWithId/saveCustomOnly</code><section begin="codec_block_entity_25w14craftmine"/>
* * ：当前方块实体的X坐标。
* * ：当前方块实体的Y坐标。
* * ：当前方块实体的Z坐标。
* * ：|<code></code>|（命名空间ID）方块实体的类型。}}
* * ：方块实体的[数据组件](数据组件.md)信息。当使用此方块实体对应的物品放置此方块实体时，物品额外持有的且不会被继承序列化处理的数据组件会被复制存储入此标签内。
* ** ：一项数据组件和其对应的数据。
<section end="codec_block_entity_25w14craftmine"/>
</div>

[Category:顶级数据值页面](Category:顶级数据值页面.md)
[Category:通过Nbt inherit加载的页面](Category:通过Nbt inherit加载的页面.md)