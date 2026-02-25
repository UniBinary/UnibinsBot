# Java版21w39a

*页面ID: 89933* | *来源: Minecraft Wiki*

<onlyinclude>

* *21w39a**是[Java版1.18](Java版1.18.md)的第3个快照，发布于2021年9月29日<ref></ref>，加入了4个新[进度](进度.md)，并进行了一些特性调整。

该版本支持打开由旧版本创建的存档（实验性快照除外），但用于1.18正式版的存档升级技术仍不完善。已探索的区块暂时采用旧世界高度，且新旧区块间有明显的边界。

# 新内容
# = 游戏内容 =
* *[进度](进度.md)**
* 加入了4个新进度。
<!--
版本页面的内容属于“历史内容”，进度描述请勿使用模板。
要修改进度名称，请到和中进行。
在Crowdin approved前，请不要汉化尚未approved的进度名称和描述。每个中文变体都是如此。
繁简/地区转换请用。
-->
* * [](进度#advancements-anchor-adventure.fall_from_world_height.md)
* **
* * [](进度#advancements-anchor-nether.ride_strider_in_overworld_lava.md)
* **
* * [](进度#advancements-anchor-adventure.play_jukebox_in_meadows.md)
* **
* * [](进度#advancements-anchor-adventure.trade_at_world_height.md)
* **
* 加入了2个进度触发器：
* * 加入了<code>fall_from_height</code>进度触发器，在玩家坠落后着地时触发。有以下可用条件：
* ** <code>player</code>对应触发这个触发器的玩家。
* ** <code>start_position</code>作为玩家坠落前所在位置的谓词。
* ** <code>distance</code>作为<code>start_position</code>与玩家间距离的谓词。
* * 加入了<code>ride_entity_in_lava</code>进度触发器，会于玩家在[熔岩](熔岩.md)中骑乘实体的游戏刻触发。有以下可用条件：
* ** <code>player</code>对应触发这个触发器的玩家。
* ** <code>start_position</code>作为开始骑乘时（即处于熔岩中的第一个游戏刻）所在位置的谓词。
* ** <code>distance</code>作为<code>start_position</code>与玩家间距离的谓词。

# = 常规 =
* *[物品修饰器](物品修饰器.md)**
* 加入了<code>set_potion</code>物品函数，用于赋予任意物品<code>potion</code>标签。具有以下参数：
* * <code>id</code>：即药水ID。

# 更改
# = 物品 =
* *[药水](药水.md)**
* 水肺药水现在能在[埋藏的宝藏](埋藏的宝藏.md)的箱子中找到，以同步。

# = 生物 =
* *[溺尸](溺尸.md)**
* 现在可以生成于[溶洞](溶洞.md)的[含水层](含水层.md)中。

* *[僵尸](僵尸.md)**
* 不再生成于溶洞中。

# = 世界生成 =
* *[尖峭山峰](尖峭山峰.md)、[冰封山峰](冰封山峰.md)和[裸岩山峰](裸岩山峰.md)**
* 提高了小山的陡峭程度。

* *[草甸](草甸.md)**
* 现在自然生成于此处的树木总会带有[蜂巢](蜂巢（方块）.md)。

# = 游戏内容 =
* *[进度](进度.md)**
* 将进度“[](进度#advancements-anchor-adventure.walk_on_powder_snow_with_leather_boots.md)”的上游进度从“[](进度#advancements-anchor-adventure.root.md)”改为“[](进度#advancements-anchor-adventure.sleep_in_bed.md)”。
* 对<code>nether_travel</code>进度触发器进行了微调：
* * 将条件<code>entered</code>重命名为<code>start_position</code>。
* * 移除了条件<code>exited</code>，因为它实际与<code>player.location</code>相同。

# = 常规 =
* *[区块存储格式](区块存储格式.md)**
* 区块的<code>Level.Sections[].BlockStates</code>和<code>Level.Sections[].Palette</code>移动到了<code>Level.Sections[].block_states</code>的一个容器结构中。
* 区块的<code>Level.Biomes</code>现在被视为palette，位于<code>Level.Sections[].biomes</code>的一个类似的小容器结构中。
* 区块的<code>Level.CarvingMasks[]</code>的数据类型从<code>byte[]</code>变为<code>long[]</code>。

* *inventory.png**
* 现在包含一个新的图标，应用于物品栏中状态效果的紧凑式显示。

* *[选项](选项.md)**
* 将亮度选项的默认值调整为50。

* *[资源包](资源包.md)**
* 将版本提高到8。

* *[服务器](服务器.md)**
* 现在提供的服务端文件是一个纯粹的打包文件，目的是为了解决Java模块的一些问题。
* * 各独立库文件不再被整合<ref group="注">类似于C语言的静态编译方式。</ref>进服务端内核中，而是被打包进服务端的<samp>META-INF/libraries</samp>文件夹中（类似客户端<samp>.minecraft/libraries</samp>文件夹）。
* * 服务端内核被放置于服务端文件中<samp>META-INF/versions.list</samp>文件所定义的位置，一般为<samp>META-INF/versions/*版本名*/server-*版本名*.jar</samp>。
* * 执行服务端文件时，其内部的<samp>META-INF/libraries</samp>和<samp>META-INF/versions</samp>两个文件夹会被原样到当前工作目录中。
* ** 可使用<code>bundlerRepoDir</code>属性指定的目标目录。
* ** 可使用<code>bundlerMainClass</code>属性指定运行服务器之外的其他主（例如<code>java -DbundlerMainClass=net.minecraft.data.Main -jar server.jar --reports</code>）。或手动服务端文件，并修改<code>META-INF/classpath-joined</code>的内容以指定<code>classpath</code>。

* *[状态效果](状态效果.md)**
* 重新设计了状态效果在[物品栏](物品栏.md)界面的显示方式。
* * 配方书打开时也会显示。
* * 显示位置从左侧变为右侧。
* * 当物品栏中能看到状态效果列表时，游戏视角下的状态列表将不再显示，以降低卡顿。
* * 现在状态效果有两种显示模式：经典式和紧凑式。游戏会根据屏幕情况在两种模式间自动切换。
* ** 经典式是先前版本采用的样式，状态效果上下依次排列。
* ** 紧凑式用小图标显示状态效果，适用于屏幕空间不足的情形。

# 修复
</onlyinclude>

# 注释

# 参考

# 导航

[de:21w39a](de:21w39a.md)
[en:Java Edition 21w39a](en:Java Edition 21w39a.md)
[es:Java Edition 21w39a](es:Java Edition 21w39a.md)
[fr:Édition Java 21w39a](fr:Édition Java 21w39a.md)
[it:Java Edition 21w39a](it:Java Edition 21w39a.md)
[ja:Java Edition 21w39a](ja:Java Edition 21w39a.md)
[ko:Java Edition 21w39a](ko:Java Edition 21w39a.md)
[pt:Edição Java 21w39a](pt:Edição Java 21w39a.md)
[ru:21w39a (Java Edition)](ru:21w39a (Java Edition).md)
[th:รุ่น Java 21w39a](th:รุ่น Java 21w39a.md)