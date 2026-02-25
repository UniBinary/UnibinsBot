# 编码格式/Worldgen

*页面ID: 152678* | *来源: Minecraft Wiki*

此条目记录了各种常用于世界生成的数据结构。

本条目部分内容合并自其他页面，详见[本页面的链入页面](special:链入页面/编码格式/Worldgen.md)。

下列所有结构均需要与最新版本同步更新。

# 世界生成
# = 方块谓词 =

<div class="treeview">
*  <code>BlockPredicate::CODEC</code><section begin="codec_block_predicate"/>
* * ：方块谓词类型。取值可以为<code>true</code>（永远成功）、<code>not</code>（不满足某个方块谓词）、<code>all_of</code>（所有谓词成功时才成功）、<code>any_of</code>（任一谓词成功时即成功）、<code>has_sturdy_face</code>（方块的某个方向具有完整的[方块支撑表面](判定箱.md)）、<code>inside_world_bounds</code>（Y轴坐标在世界界限内）、<code>matching_block_tag</code>（匹配方块标签）、<code>matching_blocks</code>（匹配方块ID）、<code>matching_fluids</code>（匹配流体ID）、<code>replaceable</code>（方块是否为[可替代方块](可替代方块.md)）、<code>solid</code>（方块是否为[固体方块](固体方块.md)）、<code>would_survive</code>（方块是否可以放置在指定位置）或<code>unobstructed</code>（是否没有任何可碰撞的实体）。
* *
* *
* * ：方块谓词，此谓词测试成功时测试失败。
* **
* *
* * ：一个方块谓词列表，此列表所有测试成功时才测试成功。
* **
* ***
* *
* * ：一个方块谓词列表，此列表任一测试成功时即测试成功。
* **
* ***
* *
* * ：测试方块是否在此方块集合内。可以为方块ID、方块标签或一个方块ID的列表。
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* *
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* * ：测试方块是否属于此方块标签。应为不带<code>#</code>前缀的方块标签。
* *
* * ：测试流体是否在此流体集合内。可以为流体ID、流体标签或一个流体ID的列表。
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* *
* * ：要测试的方向。取值只能为<code>up</code>（上）、<code>down</code>（下）、<code>north</code>（北）、<code>south</code>（南）、<code>west</code>（西）或<code>east</code>（东）。
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* *
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* *
* * ：（默认为<code>[0, 0, 0]</code>）相对于当前方块的坐标，将测试该坐标上的方块。内部的三个整数依次对应X、Y、Z坐标，每个值的绝对值不允许超过16。
* * ：要放置的方块。注意：这只用于测试，例如指定树苗时若下方为石头则测试失败，为草方块则测试成功，游戏并不会真正放置方块。
* **
<section end="codec_block_predicate"/></div>

# = 方块状态提供器 =

<div class="treeview">
*  <code>BlockStateProvider::CODEC</code><section begin="codec_block_state_provider"/>
* * ：方块状态提供器类型。必须是（直接提供方块状态）、（随机旋转轴向方块，如原木、铁链）、（在加权列表中随机选取）、（为整型的方块属性赋予随机值）、（根据噪声随机选取方块状态）、（双噪声方块状态提供器）或（噪声阈限方块状态提供器）。
* * ，附加参数如下：}}
* * ：要放置的方块状态。
* **
* * ，附加参数如下：}}
* * ：要放置的方块状态。游戏会给方块属性<code>axis</code>随机取值。
* **
* * ，附加参数如下：}}
* * ：（不能为空）可供选择的方块状态列表。
* ** ：一个选择。
* *** ：一个方块状态。
* ****
* *** ：该方块被选取的权重；更高的值将增加被选取的频率。
* * ，附加参数如下：}}
* * ：一项方块属性的名称。
* * ：方块属性的值。
* **
* * ：另一个方块状态提供器，用于指定方块状态的来源。
* **
* * ，附加的参数如下：}}
* * ：噪声的种子。
* * ：计算噪声值使用的[噪声](噪声.md)。只接受内联格式。
* ** ：主倍频。
* ** ：振幅列表。
* *** ：此倍频下的值。
* * ：（）噪声的水平缩放。
* * ：（不能为空）可选方块状态的列表。
* ** ：一个方块状态。
* ***
* * ，附加参数如下：}}
* * ：噪声的种子。
* * ：计算噪声值使用的噪声。只接受内联格式。
* ** ：主倍频。
* ** ：振幅列表。
* *** ：此倍频下的值。
* * ：（）噪声的水平缩放。
* * ：（）多样性，代表了在缓慢噪声选择后能留下候选的方块状态数量。
* **
* * ：缓慢噪声，用于随机选择方块状态。只接受内联格式。
* ** ：主倍频。
* ** ：振幅列表。
* *** ：此倍频下的值。
* * ：（）缓慢噪声的水平缩放。
* * ：（不能为空）可选方块状态的列表。
* ** ：一个方块状态。
* ***
* * ，附加参数如下：}}
* * ：噪声的种子。
* * ：计算噪声值使用的噪声。只接受内联格式。
* ** ：主倍频。
* ** ：振幅列表。
* *** ：此倍频下的值。
* * ：（）噪声的水平缩放。
* * ：（）默认方块状态噪声值的下限，如果噪声值低于此值将选择中的方块状态。
* * ：（）如果噪声值高于，将有将大小的概率选择中的方块状态。
* * ：默认方块状态。噪声值高于但根据概率没有选中时，将使用此方块状态。
* **
* * ：（不能为空）低噪声值可选方块状态列表。
* ** ：一个方块状态。
* ***
* * ：（不能为空）高噪声值可选方块状态列表。
* ** ：一个方块状态。
* ***
<section end="codec_block_state_provider"/></div>

# = 超平坦世界生成预设 =

<div class="treeview">
*  <code>FlatLevelGeneratorSettings::CODEC</code><section begin="codec_flat_level_generator_settings"/>
* * ：（可以为空）层设置。此列表中的元素将自上而下依次从世界底部向上生成。
* ** ：超平坦的一个层。
* *** ：这一层使用的方块。不存在时默认为空气。
* *** ：（）这一层的高度。
* * ：要生成的生物群系，不存在时默认为[平原](平原.md)。
* * ：（默认为<code>false</code>）是否生成湖泊。如果为<samp>true</samp>，则世界会生成[熔岩湖](熔岩湖.md)<code>lake_lava_underground</code>和<code>lake_lava_surface</code>。
* * ：（默认为<code>false</code>）是否生成生物群系的地物，永远不会生成<code>UNDERGROUND_STRUCTURES</code>和<code>SURFACE_STRUCTURES</code>阶段的已放置的地物。若生物群系是虚空且所有层都不是空气层，则什么地物也不会生成。
* * ：指定要生成哪些[结构集](结构集.md)，此项不存在时游戏会尝试生成所有结构集。可以为结构集的ID、多个结构集ID的数组或一个结构集标签。
<section end="codec_flat_level_generator_settings"/></div>

# = 高度提供器 =

<div class="treeview">
*  <code>HeightProvider::CODEC</code><section begin="codec_height_provider"/>
* *
* *
* *
* * ：高度提供器的类型。可以是<code>constant</code>（恒定高度）、<code>uniform</code>（均匀分布）、<code>biased_to_bottom</code>（偏向底部）、<code>very_biased_to_bottom</code>（更加偏向底部）、<code>trapezoid</code>（梯形分布）或<code>weighted_list</code>（加权列表）。
* *
* * ：作为恒定高度的垂直锚点。
* **
* *
* * ：作为最小高度的垂直锚点。
* **
* * ：作为最大高度的垂直锚点。
* **
* *
* * ：作为最小高度的垂直锚点。
* **
* * ：作为最大高度的垂直锚点。
* **
* * ：（默认为1）内部值。取值为大于等于1的整数。
* *
* * ：作为最小高度的垂直锚点。
* **
* * ：作为最大高度的垂直锚点。
* **
* * ：（默认为0）梯形分布的上底长度。
* *
* * ：（不能为空）一个加权随机池。
* ** ：随机池中的一项。
* *** ：高度提供器。
* ****
* *** ：该项的权重。
<section end="codec_height_provider"/></div>

# = 位置规则测试 =

<div class="treeview">
*  <code>PosRuleTest::CODEC</code><section begin="codec_pos_rule_test"/>
* * ：位置规则测试类型。取值可以为<code>always_true</code>（永远成功）、<code>linear_pos</code>（概率成功，取决于当前位置到结构起始点的三维[曼哈顿距离](曼哈顿距离.md)）或<code>axis_aligned_linear_pos</code>（概率成功，取决于当前位置到结构起始点的指定坐标轴上的距离）。
* *
* * : （默认为0.0）当方块距结构起始点的距离小于等于时测试成功的概率。小于0则视为0，大于1则视为1。
* * : （可选，默认为0.0）当方块距结构起始点的距离大于等于时测试成功的概率。若方块的距离在和之间，则概率由和经[线性插值](wzh:线性插值.md)而得，即概率为{{cd|-{}-( 距离 - min_dist ) / ( max_dist - min_dist ) * ( max_chance - min_chance ) + min_chance }}，得到的概率小于0则视为0，大于1则视为1。
* * ：（默认为0）达到最小概率时的距离。
* * ：（默认为0）达到最大概率时的距离。必须大于。
* * 为，附加的参数如下：}}
* * : （默认为<code>y</code>）要检查的方向，距离全部以正数计算。取值可以为<code>x</code>、<code>y</code>或<code>z</code>。
* * : （默认为0.0）当方块距结构起始点的距离小于等于时测试成功的概率。小于0则视为0，大于1则视为1。
* * : （可选，默认为0.0）当方块距结构起始点的距离大于等于时测试成功的概率。若方块的距离在和之间，则概率由和经[线性插值](wzh:线性插值.md)而得，即概率为{{cd|-{}-( 距离 - min_dist ) / ( max_dist - min_dist ) * ( max_chance - min_chance ) + min_chance }}，得到的概率小于0则视为0，大于1则视为1。
* * ：（默认为0）达到最小概率时的距离。
* * ：（默认为0）达到最大概率时的距离。必须大于。
<section end="codec_pos_rule_test"/></div>

# = 表面规则条件 =

<div class="treeview">
*  <code>SurfaceRules.ConditionSource::CODEC</code><section begin="codec_surface_rules_condition_source"/>
* * ：（命名空间ID）表面规则条件类型。
* *
* * 预处理地表高度等于由产生的地表高度插值后，向下偏移8格，再加上表层厚度后的值。
* *
* * ：（可以为空）一个生物群系ID的列表。
* *
* * 0处的噪声值位于指定闭区间内，附加参数如下：}}
* * ：（命名空间ID）要使用的[噪声](噪声.md)。
* * ：闭区间的下限。
* * ：闭区间的上限。
* *
* * ：指定不应满足的表面规则条件。
* **
* *
* *
* * ：指定的最大距离。
* * ：是否受表层厚度的影响。若是，条件成功的最大距离为加上表层厚度。
* * ：表示受表层厚度附加噪声影响的程度。条件成功的最大距离为加上<code>-{}-secondary_depth_range × 噪声值</code>格。可与表层厚度叠加。
* * ：取值只能为<code>floor</code>或<code>ceiling</code>。如果是<code>ceiling</code>，则检测的距离为此坐标与正下方最近的液体或空气方块的距离；如果是<code>floor</code>，则检测的距离为此坐标与正上方最近的空气方块之间的**非液体方块**的数量。
* * 、和当前Y轴高度决定。}}
* *
* * ：任意的命名空间ID，只用作随机数的种子。
* * ：等于或高于此Y坐标则永远失败。
* **
* * ：等于或低于此Y坐标则永远成功。位于两坐标之间的成功的概率为<code>(false_at_and_above - Y) / (false_at_and_above - true_at_and_below)</code>，以形成渐变效果。
* **
* *
* * ：相对于上方液面的最大相对高度，相对高度为方块底面高度减去液面高度。液面高度在应用表面规则阶段为液体方块的顶面高度，在雕刻器阶段为液体方块的底面高度。在应用表面规则阶段时只要方块的上方存在液体方块则此相对高度即小于-2。因此若设为大于-1的值，则只有当与上方最近空气方块之间没有液体时条件成功；若设为-1，在应用表面规则阶段时与大于-1的值效果一样，在雕刻器阶段时永远成功。
* * ：（）表示受表层厚度的影响程度，条件成功的最大相对高度为加上表层厚度乘上此值。
* * ：是否检测当前方块的相对于液体表面的距离加上“该Y平面与正上方空气方块之间的非液体方块的数量”而不是当前方块相对于液体表面的距离。<!--
--><br>例如Y=2处为空气，Y=1处为水，Y=0处为石头，在该石头处应用此条件，则该Y平面（此时为Y=0平面）与正上方空气方块（此时为Y=2的空气）之间的非液体方块的数量为1（即坐标为Y=0的这个石头）。游戏对这个石头测试的距离将是-1而不是-2。
* *
* * ：方块通过测试的最小Y坐标。
* **
* * ：（）表示受表层厚度的影响程度，条件成功的最小Y坐标为加上表层厚度乘上此值。
* * ：是否检测当前方块的Y坐标加上“该Y平面与正上方空气方块之间的非液体方块的数量”而不是当前方块的Y坐标。
<section end="codec_surface_rules_condition_source"/></div>

# = 表面规则 =

<div class="treeview">
*  <code>SurfaceRules.RuleSource::CODEC</code><section begin="codec_surface_rules_rule_source"/>
* * ：（命名空间ID）表面规则类型。取值只能为<code>bandlands</code>（生成恶地陶瓦层）、<code>block</code>（生成指定方块）、<code>condition</code>（条件检查）或<code>sequence</code>（顺次应用）。
* *
* *
* * ：要放置的方块。
* **
* *
* * ：要判定的表面规则条件。
* **
* * ：条件通过后应用的表面规则。
* **
* *
* * ：（可以为空）一个表面规则的列表，将按列表顺序依次应用。每个方块只会应用列表中第一个成功的表面规则。
* ** ：一个表面规则。
* ***
<section end="codec_surface_rules_rule_source"/></div>

# = 规则测试 =

<div class="treeview">
*  <code>RuleTest::CODEC</code><section begin="codec_rule_test"/>
* * ：规则测试类型。取值可以为<code>always_true</code>（永远成功）、<code>block_match</code>（匹配方块ID）、<code>blockstate_match</code>（匹配方块状态）、<code>tag_match</code>（匹配方块标签）、<code>random_block_match</code>（匹配方块ID并概率成功）或<code>random_blockstate_match</code>（匹配方块状态并概率成功）。
* *
* * ：方块ID。
* *
* * ：方块状态。
* **
* *
* * ：方块标签。
* *
* * ：方块的ID。
* * ：若该方块匹配，则测试成功的概率。大于1则视为1，小于0则视为0。
* *
* * ：方块状态。
* **
* * ：若该方块状态匹配，则测试成功的概率。大于1则视为1，小于0则视为0。
<section end="codec_rule_test"/></div>

# = 垂直锚点 =

<div class="treeview">
*  <code>VerticalAnchor::CODEC</code><section begin="codec_vertical_anchor"/>
* * ：（三选一，）绝对高度，也即调试屏幕中的Y坐标值。
* * ：（三选一，）相对高度，从世界底部开始向上计算。世界底部高度是[区块生成器](维度定义格式#区块生成器.md)定义的允许生成地形的最低高度，而不是维度可以存在方块的最低高度。
* * ：（三选一，）相对高度，从世界顶部开始向下计算。值越高则高度越低。同样使用区块生成器的高度计算世界顶部高度。
<section end="codec_vertical_anchor"/></div>

# 数值提供器
# = 浮点提供器 =

<div class="treeview">
*  <code>FloatProvider::CODEC</code><section begin="codec_float_provider"/>
* * ：浮点提供器类型。取值可以为<code>constant</code>（固定值）、<code>uniform</code>（均匀分布）、<code>clamped_normal</code>（正态分布）或<code>trapezoid</code>（梯形分布）。
* *
* * ：固定值。
* *
* * ：最小值。
* * ：最大值（不包含）。必须大于。
* *
* * ：正态分布的平均数。
* * ：正态分布的离差。
* * ：最小值，如果计算结果小于此值则使用此值。
* * ：最大值，如果计算结果大于此值则使用此值。必须大于。
* *
* * ：最小值。
* * ：最大值。
* * ：梯形分布中均匀分布部分的范围，必须小于等于最大值与最小值之差。
<section end="codec_float_provider"/></div>

# = 整数提供器 =

<div class="treeview">
*  <code>IntProvider::CODEC</code><section begin="codec_int_provider"/>
* * ：整数提供器类型。取值可以为<code>constant</code>（固定值）、<code>uniform</code>（均匀分布）、<code>biased_to_bottom</code>（偏向最小值分布）、<code>clamped</code>（钳制输入值）、<code>clamped_normal</code>（正态分布）或<code>weighted_list</code>（加权列表）。
* *
* * ：固定值。
* *
* * ：最小值。
* * ：最大值。不能小于。
* *
* * ：最小值，如果计算结果小于此值则使用此值。
* * ：最大值，如果计算结果大于此值则使用此值。不能小于。
* * ：整数的来源。
* **
* *
* * ：最小值，如果计算结果小于此值则使用此值。
* * ：最大值，如果计算结果大于此值则使用此值。
* * ：正态分布的平均数。
* * ：正态分布的离差。
* *
* * ：加权提供器列表。
* **
* *** ：该提供器被选取的权重，越高的值被选取的概率越高。
* *** ：一个整数。
* ****
<section end="codec_int_provider"/></div>

# 其他
# = 方块状态 =

<div class="treeview">
*  <code>BlockState::CODEC</code><section begin="codec_block_state"/>
* * ：[方块](方块.md)的命名空间ID。
* * ：组成此[方块状态](方块状态.md)的方块属性。只有本方块具有的方块属性才有实际效果，而未指定的方块属性使用默认值。
* ** ：此项方块属性的值。
<section end="codec_block_state"/></div>

# = 整数范围 =

<div class="treeview">
*  <code>InclusiveRange::codec</code> & <code>InclusiveRange::INT</code><section begin="codec_int_inclusive_range"/>
* * ，则精确匹配。}}
* * ，则规定了[下限,上限]（含）。下限不得大于上限。}}
* * ：闭区间下限。
* * ：闭区间上限。
* * ：}}
* * ：匹配下限（含）。
* * ：匹配上限（含）。
<section end="codec_int_inclusive_range"/></div>

# = 生物群系参数 =

<div class="treeview">
*  <code>Climate.ParameterPoint::CODEC</code><section begin="codec_climate_parameter_point"/>
* * ：温度<!-- 英文原页面不需要对这个键进行简单解释，中文需要。-->。注意：这些值只用于世界生成，与生物群系的温度等同名参数无关联。
* ** ，则直接指定某个值，取值在-2至2之间。}}
* ** ，则指定一个区间：}}
* ** ：（）最小值。
* ** ：（）最大值。
* ** ，则指定一个范围，且游戏不会以此形式保存存档数据：}}
* ** ：（）最小值。
* ** ：（）最大值。必须大于等于。
* * ：湿度，格式与<code>temperature</code>相同。
* * ：大陆性，格式与<code>temperature</code>相同。在原版主世界，低大陆性对应于海洋地形，高大陆性对应于内陆地形。
* * ：侵蚀度，格式与<code>temperature</code>相同。在原版主世界，高侵蚀度对应平坦地形。
* * ：怪异度，格式与<code>temperature</code>相同。在原版主世界，用于生物群系崎岖程度。
* * ：深度，格式与<code>temperature</code>相同。在原版主世界，只有此参数会随垂直位置改变：在XZ坐标不变的情况下，Y轴坐标越高，该值越高。
* * ：（）偏移。类似于其他参数，但是偏移在任何地方都是0，因此若其他参数都相等，游戏更倾向选择偏移更小的值。
<section end="codec_climate_parameter_point"/></div>

# = 位置源 =

<div class="treeview">
*  <code>PositionSource::CODEC</code><section begin="codec_position_source"/>
* * ：位置源类型。取值只能为<code>block</code>或<code>entity</code>。
* *
* * ：方块坐标。
* *
* * ：[UUID](UUID.md)，将获取此UUID的实体坐标。
* * ：（默认为0.0）相对于实体脚部坐标的Y轴偏移。
<section end="codec_position_source"/></div>

[Category:顶级数据值页面](Category:顶级数据值页面.md)
[Category:通过Nbt inherit加载的页面](Category:通过Nbt inherit加载的页面.md)