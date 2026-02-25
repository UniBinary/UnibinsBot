# 制箭台/24w14potato

*页面ID: 147455* | *来源: Minecraft Wiki*

| block-hardness = 2.5
| block-blast-resistance = 2.5
| block-lava-flammable = 是
| block-suffocating = 是
| block-redstone-conductor = 是
| block-solid = 是
| block-replaceable = 否
| block-push-reaction = 不可推动，不可拉动
| block-instrument = 贝斯
| block-map-color =
| block-id-raw = fletching_table
| item-creative-tab =
| maxStack = 64
| renewable = 是
| item-id-raw = fletching_table
| nobe=1
}}

* *制箭台（Fletching Table）**是一种可以处理[毒树脂](毒树脂.md)并将其最终转化为[琥珀宝石](琥珀宝石.md)的方块。

# 生成
# = 自然生成 =
制箭台会生成在[村庄](村庄.md)的制箭师小屋中。

# 获取
# = 合成 =

# 破坏
挖掘制箭台的合适工具是斧。

制箭台被破坏后会掉落自身和内容物。

# 用途
[thumb|制箭台的GUI](File:Fletching Table GUI 24w14potato.png.md)
制箭台共有3个槽位：正上方的输入槽位、正下方的输出槽位和左侧的羽毛槽位。输入槽位只能放置指定的[毒树脂](毒树脂.md)。

玩家打开制箭台的GUI时，GUI上方的标题栏会逐渐拉开以显示完整标题。制箭台的GUI标题指示了输入信息，而输出信息视情况而定。
* 输入毒树脂的清晰度不小于<code>j</code>（Jewel，宝石）时，会显示输出为琥珀宝石，即：
* * Fletching <*清晰度*> Clarity, <*杂质*> Impurities into Amber Gem<br>（改造 清晰度：<*清晰度*>, 杂质：<*杂质*> 为 琥珀宝石）
* 不满足上述清晰度条件且此制箭台未处理过毒树脂时，会显示输出毒树脂的清晰度，即：
* * Fletching <*清晰度*> Clarity, <*杂质*> Impurities into <*清晰度*> Clarity, ¯\_(ツ)_/¯ Impurities<br>（改造 清晰度：<*清晰度*>, 杂质：<*杂质*> 为 清晰度：<*清晰度*>, 杂质：¯\_(ツ)_/¯）
* 处理过一次毒树脂后，会显示输出毒树脂的清晰度和杂质，即：
* * Fletching <*清晰度*> Clarity, <*杂质*> Impurities into <*清晰度*> Clarity, <*杂质*> Impurities<br>（改造 清晰度：<*清晰度*>, 杂质：<*杂质*> 为 清晰度：<*清晰度*>, 杂质：<*杂质*>）

# = 转化毒树脂 =
[300px|缩略图|在制箭台-{}-中提纯毒树脂，得到琥珀宝石](File:Fletching Process.gif.md)
制箭台被放置时，游戏会随机指定此制箭台的下列信息：输入毒树脂的杂质和清晰度、输出毒树脂的杂质以及单个毒树脂的处理时间。杂质从<code>a</code>至<code>p</code>之间选取，清晰度从<code>a</code>至<code>j</code>之间选取，处理时间从10至200之间选取。这些信息会保存到制箭台的方块实体数据中，即使玩家破坏后再重新放置也不会改变。

当玩家在羽毛槽位放置羽毛并在输入槽位放置要求的毒树脂时，游戏将开始转化毒树脂。每次转化都会将毒树脂的清晰度等级提高一级，当输入毒树脂的要求清晰度不低于<code>j</code>时，会输出琥珀宝石。由于自然情况下毒树脂的清晰度不会高于<code>j</code>且制箭台对输入毒树脂的清晰度要求不会高于<code>j</code>，因此毒树脂最终总能转化为琥珀宝石。

处理过程中，羽毛槽位的羽毛物品会在GUI中沿着“∞”形的轨迹飘动，每处理一个毒树脂便飘动一周，结束后羽毛槽位会生成一个新的羽毛物品，无需再次补充。

# = 更改职业 =
如果一个制箭台没有被[村民](村民.md)认领，则附近的任意一个失业村民有机会转变职业为制箭师。

# = 燃料 =
制箭台能用作[熔炉](熔炉.md)、[高炉](高炉.md)或[烟熏炉](烟熏炉.md)的燃料，每个制箭台能熔炼1.5个物品。

# = 红石比较器 =
[红石比较器](红石比较器.md)可检测制箭台的内容物占空比，3个槽位都会被统计。

# 音效

|source=方块
|description=破坏方块
|id=block.wood.break
|translationkey=subtitles.block.generic.break
}}

|source=方块
|description=挖掘方块
|id=block.wood.hit
|translationkey=subtitles.block.generic.hit}}

|source=方块
|description=放置方块
|id=block.wood.place
|translationkey=subtitles.block.generic.place}}

|source=[实体依赖](声音#实体依赖分类.md)
|description=在方块上行走
|id=block.wood.step
|translationkey=subtitles.block.generic.footsteps
|foot=1}}

# 数据值
# = ID =

# = 方块实体 =

制箭台拥有与其相关联的方块实体，以保存制箭台的附加数据。

# = 物品数据 =

制箭台使用数据组件来保存方块数据。

<div class="treeview">
* ：物品附加的[数据组件](数据组件.md)信息。
* *  数据组件
* ** ：（默认为<samp>false</samp>）制箭台是否已经输出过产物。
* ** ：单个字符，表示可接受的毒树脂的杂质。
* ** ：单个字符，表示输出的毒树脂的杂质。
* ** ：处理每个毒树脂所需的时间。
* ** ：单个字符，表示可接受的毒树脂的清晰度。
</div>

# 注释

# 导航

[Category:方块](Category:方块.md)
[Category:功能方块](Category:功能方块.md)