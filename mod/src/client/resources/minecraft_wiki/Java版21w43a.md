# Java版21w43a

*页面ID: 90453* | *来源: Minecraft Wiki*

<onlyinclude>

* *21w43a**是[Java版1.18](Java版1.18.md)的第7个快照，发布于2021年10月27日<ref></ref>，优化了升级存档时新旧地形的融合，同时对地形生成做了一些调整和修复。

# 新内容
# = 世界生成 =
* *旧世界升级**
* 在旧区块周围生成新区块时，地形会根据旧区块进行调整，更好地贴合旧区块。
* 现在旧区块中Y=0到Y=4处的基岩层会由[深板岩](深板岩.md)替代。
* 若Y=0处为基岩，则其下方会以深板岩填充。
* * 洞穴不会在此生成，但[紫晶洞](紫晶洞.md)和熔岩湖可能会生成。
* 新的基岩层位于Y=-64处。
* 在此快照中升级存档的过程中对区块进行的更改是永久性的。
* 此功能尚未开发完毕，可能会持续改进。

# = 常规 =
* *[标签](Java版标签.md)**
* 加入了<code>big_dripleaf_placeable</code>方块标签。
* * 包含[耕地](耕地.md)、<code>dirt</code>方块标签和<code>small_dripleaf_placeable</code>方块标签。
* * [大型垂滴叶](大型垂滴叶.md)能被放置在拥有此标签的方块上方。

# 更改
# = 方块 =
* *[大型垂滴叶](大型垂滴叶.md)**
* 现在只能放置在[黏土](黏土.md)、[砂土](砂土.md)、[泥土](泥土.md)、[耕地](耕地.md)、[草方块](草方块.md)、[苔藓块](苔藓块.md)、[菌丝体](菌丝体.md)、[灰化土](灰化土.md)和[缠根泥土](缠根泥土.md)上。

# = 世界生成 =
* *[含水层](含水层.md)**
* 降低了含水层水位高度发生变化的频率，因此大片水位相同的区域更加常见了。
* 略微减少了[熔岩](熔岩.md)含水层的数量。

* *[洞穴](洞穴.md)**
* 减少了[河流](河流.md)和[海洋](海洋.md)岸边充水的洞穴生成的数量。

* *[海洋](海洋.md)**
* 移除了[暖水深海](暖水深海.md)。
* * [暖水海洋](暖水海洋.md)现在会在深水区生成。

* *[种子](种子（世界生成）.md)**
* 再次被完全更改，新生成的世界不与之前快照的一致。<ref></ref>

# = 常规 =
* *[区块存储格式](区块存储格式.md)**
* 移除了区块中的<code>Level</code>，并将其内部的内容移出。
* * <code>Level.Entities</code>移至<code>entities</code>。
* * <code>Level.TileEntities</code>移至<code>block_entities</code>。
* * <code>Level.TileTicks</code>和<code>Level.ToBeTicked</code>移至<code>block_ticks</code>。
* * <code>Level.LiquidTicks</code>和<code>Level.LiquidsToBeTicked</code>移至<code>fluid_ticks</code>。
* * <code>Level.Sections</code>移至<code>sections</code>。
* * <code>Level.Structures</code>移至<code>structures</code>。
* * <code>Level.Structures.Starts</code>移至<code>structures.starts</code>。
* * <code>Level.Sections[].block_states</code>移至<code>sections[].block_states</code>。
* * <code>Level.Sections[].biomes</code>移至<code>sections[].biomes</code>。
* 加入了<code>yPos</code> ，以记录区块内子区块Y轴位置的最小值。
* 加入了<code>below_zero_retrogen</code>，以支持Y=0以下的地形生成。
* 加入了<code>blending_data</code>，包含了支持新区块与旧区块间地形生成混合算法的数据。

* *[选项](选项.md)**
* 将视频设置里的“”重命名为“”。三个选项各自新增了一条鼠标时的注释，并被重命名：
* * “” → “全阻塞”；
* * “” → “半阻塞”；
* * “无” → “”。

* *[刻](刻.md)**
* 更改了方块计划刻和液体计划刻的内部细节，以使存档保存得更快。

# 修复
命令克隆正处于激活状态的压力板或按钮会使其永久保持被按下的状态。
|131930|暖水深海中不生成珊瑚和海泡菜。
|156616|恶地地层不正确生成。
|217379|暖水深海中不生成河豚。
|224205|用命令克隆倾斜值不为<code>none</code>的大型垂滴叶会使其永久保持倾斜的状态。
|228745|大型垂滴叶不能被放置在耕地上。
|238073|装饰器独立于世界种子。
|;dev
|236615|选项的英文大小写不正确。
|236624|暖水深海没有被计入进度“”的达成条件中。
|236970|Y160及以上处，恶地地层会被橙色陶瓦覆盖。
|238939|石头会在下界生成。
}}</onlyinclude>

# 参考

# 导航

[de:21w43a](de:21w43a.md)
[en:Java Edition 21w43a](en:Java Edition 21w43a.md)
[es:Java Edition 21w43a](es:Java Edition 21w43a.md)
[fr:Édition Java 21w43a](fr:Édition Java 21w43a.md)
[it:Java Edition 21w43a](it:Java Edition 21w43a.md)
[ja:Java Edition 21w43a](ja:Java Edition 21w43a.md)
[pt:Edição Java 21w43a](pt:Edição Java 21w43a.md)
[ru:21w43a (Java Edition)](ru:21w43a (Java Edition).md)
[th:รุ่น Java 21w43a](th:รุ่น Java 21w43a.md)