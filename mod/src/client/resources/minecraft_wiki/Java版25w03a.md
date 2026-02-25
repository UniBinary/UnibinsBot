# Java版25w03a

*页面ID: 139191* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w03a**是[Java版1.21.5](Java版1.21.5.md)的第2个快照，发布于2025年1月15日<ref name="snaplog"></ref>，加入了通过[数据包](数据包.md)和[Mod](Mod.md)运行游戏测试系统的支持，加入了[物品模型](物品模型.md)匹配[物品堆叠组件](物品堆叠组件.md)内容的功能，实现了[鞍](鞍.md)的[装备](装备.md)化，并修复了一些漏洞。

# 新内容
# = 方块 =
* *[测试方块](测试方块.md)**
* 用于实现基于方块的测试的技术性方块。
* 物品[稀有度](稀有度.md)为“史诗”。
* 有4种模式：
* * 启动模式（<code>mode</code>为<code>start</code>）：在测试启动时产生一次红石脉冲。
* * （<code>mode</code>为<code>log</code>）：接收到红石信号时，将消息输出到日志文件。
* * 失败模式（<code>mode</code>为<code>fail</code>）：接收到红石信号时，使测试失败。
* * 接受模式（<code>mode</code>为<code>accept</code>）：接收到红石信号时，成功完成这条路径的测试。
* 运行基于方块的测试需要结构中至少存在一个启动模式和一个接受模式的方块。

* *[测试实例方块](测试实例方块.md)**
* 用于运行、控制世界中的测试的技术性方块。
* 物品稀有度为“史诗”。
* 此方块表示世界中的测试实例。
* 可以用于与所对应的测试交互，以保存测试结构、重置测试或运行测试。
* 测试启动后，每个测试位置都会发出一条[信标光柱](信标光柱.md)以表示测试状态。
* * 灰色 = 运行中
* * 红色 = 失败（必要测试）
* * 橙色 = 失败（可选测试）
* * 绿色 = 成功
* 如果测试失败，错误会显示在一本讲台的书和一个遮罩上。
* 使用运行或创建了一个测试也将放置一个测试实例方块来控制此测试。

# = 世界生成 =
* *[结构](结构.md)**
* 加入了空结构。

# = 游戏内容 =
* *[槽位](槽位.md)**
* 加入了<code>saddle</code>生物通用槽位。
* * 可装备于此槽位的物品由<code>equippable</code>物品堆叠组件控制。
* * 只有自然支持此槽位的生物能在装备对应物品时被[骑乘](骑乘.md)并在实体模型上渲染鞍。

# = 命令格式 =
* ***
* 用于创建和运行测试的命令。
* 注意：游戏测试的设计为运行于标准[超平坦](超平坦.md)世界。每次测试运行时，其周围的区域都会被石头代替，且测试会被屏障盒包裹。
* 语法如下：
* * <code>test clear*</code>：清除与所选的测试关联的结构和方块。
* ** <code>test clearall [<radius>]</code>
* ** <code>test clearthat</code>
* ** <code>test clearthese</code>
* * <code>test create</code>：在当前位置创建一个指定测试的测试设置，为指定大小的测试结构做准备。
* ** <code>test create <test> [<width>] [<height> <depth>]</code>
* * <code>test locate</code>：在已加载区块中寻找测试的位置。
* ** <code>test locate <selector></code>
* * <code>test reset*</code>：为所选的测试重置测试结构，移除周围的所有[屏障](屏障.md)并重新放置结构。
* ** <code>test resetclosest</code>
* ** <code>test reseetthese</code>
* ** <code>test resetthat</code>
* * <code>test pos</code>：显示测试中指向方块的局部坐标。如果指定了变量名，则在由单击此命令返回消息中的坐标获得的代码片段中使用该变量名。
* ** <code>test pos [<variable>]</code>
* * <code>test run*</code>：运行一个或多个测试。先加载每个测试的给定结构，再运行相关测试。如果一次运行多个测试，则它们会被放置于网格中并行运行，但有一定限制。如果超出限制，则测试按轮依次运行。
* ** <code>test run <selector> [<numberOfTimes>] [<untilFailed>] [<rotationSteps>] [<testsPerRow>]</code>
* ** <code>test runclosest [<numberOfTimes>] [<untilFailed>]</code>
* ** <code>test runfailed [<numberOfTimes>] [<untilFailed>] [<rotationSteps>] [<testsPerRow>]</code>
* ** <code>test runmultiple <selector> [<amount>]</code>
* ** <code>test runthat [<numberOfTimes>] [<untilFailed>]</code>
* ** <code>test runthese [<numberOfTimes>] [<untilFailed>]</code>
* * <code>test stop</code>：停止所有测试。由测试触发的游戏事件可能仍会继续。
* * <code>test verify <tests></code>：通过运行同一测试的多个实例来验证一个或多个测试。
* 参数：
* * <code>radius</code>：需要清除的测试的范围。
* * <code>test</code>：测试的命名空间ID。
* * <code>selector</code>：支持通配符（）的测试ID选择器。未提供命名空间时，默认使用<code>minecraft:</code>。
* ** 示例：
* *** <code>*:*</code> - 匹配所有ID。
* *** <code>*</code> - 匹配<code>minecraft</code>命名空间下的全部ID。
* *** <code>custom:folder/*_test_?</code> - 匹配<code>custom</code>命名空间下文件夹中为<code>-{}-<*任意前缀*>_test_<*单字符后缀*></code>的ID。
* * <code>width</code>：（默认为<code>5</code>）测试结构的宽度。
* * <code>height</code>：（默认使用<code>width</code>的值）测试结构的高度。
* * <code>depth</code>：（默认使用<code>width</code>的值）测试结构的深度。
* * <code>variable</code>：复制代码段中使用的变量名。
* * <code>numberOfTimes</code>：（默认为<code>1</code>）重复每个测试的次数。
* * <code>untilFailed</code>：（布尔值，默认为<code>false</code>）测试是否应该在一次迭代失败后立即停止。
* * <code>rotationSteps</code>：（默认为<code>0</code>）测试的额外90度旋转步数。
* * <code>testsPerRow</code>：（默认为<code>8</code>）网格布局中每行放置的测试数量。

# = 常规 =
* *[数据包](数据包.md)**
* 在数据包中加入了和文件夹。
* 数据包现在可以用于配置测试实例与测试环境定义。

* *[注册表](注册表.md)**
* 加入了固有注册表。
* 加入了可写注册表。

* *[物品堆叠组件](物品堆叠组件.md)**
* 加入了一系列用于配置实体的变种、外观或其他方面的组件。
* * 当[刷怪蛋](刷怪蛋.md)、[生物桶](生物桶.md)、[画](画.md)和[物品展示框](物品展示框.md)等物品具有这些组件时，组件将对其生成的实体生效。
* * 对实体使用键获取刷怪蛋时，获取的刷怪蛋不会储存这些组件。
* * 新组件如下：
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：可以为之一。
* ** ：16种染料颜色之一。
* ** ：16种染料颜色之一。
* ** ：16种染料颜色之一。
* ** ：16种染料颜色之一。
* ** ：16种染料颜色之一。
* ** ：16种染料颜色之一。
* ** ：需为取自<code>cat_variant</code>注册表的命名空间ID。
* ** ：需为取自<code>frog_variant</code>注册表的命名空间ID。
* ** ：需为取自<code>painting_variant</code>注册表的命名空间ID。
* ** ：需为取自<code>pig_variant</code>注册表的命名空间ID。
* ** ：需为取自<code>wolf_variant</code>注册表的命名空间ID。
* * 创造模式物品栏中的生物桶和画现在使用新变种而非<code>minecraft:entity_data</code>组件。
* * 热带鱼桶和画物品的自定义提示框文本现在基于新组件而非。

* *[实体谓词](实体谓词.md)**
* 在实体谓词中加入了新字段。
* * 存在时，谓词会匹配实体组件的内容（类似于匹配物品堆叠的物品谓词的字段<code>components</code>）。
* * 格式：组件类型键与组件匹配值的映射。

* *[装备模型](装备模型.md)**
* 加入了预设模型层。

* *[物品模型](物品模型.md)**
* 加入了枚举属性<code>component</code>，用于返回物品的组件值（如有）。
* * 附加字段如下：
* ** ：[物品堆叠组件](物品堆叠组件.md)类型的命名空间ID。
* * 可能的值取决于物品堆叠组件类型。例如类型设置为<code>minecraft:wolf/collar</code>时，枚举值列表会接受染料颜色（如<code>lime</code>）。

* *[服务端核心文件](服务端核心文件.md)**
* 在中加入了<code>net.minecraft.gametest.Main</code>入口点，用于自动启动运行全部可用测试项目的服务端。
* * 选项如下：
* ** ：显示用法信息。
* ** {{cd|-{}---packs <*路径*>}}：设置世界中启用的数据包路径（可以为包含文件的文件夹或<code>.zip</code>格式的压缩包）。
* ** {{cd|-{}---report <*路径*>}}：将类似于JUnit的XML报告导出到给定路径。
* ** {{cd|-{}---tests <*选择*>}}：指定根据选择表达式（与命名空间测试实例ID匹配的通配符表达式）运行的测试内容。如果此项省略或指定空ID，则运行所有测试项。
* ** {{cd|-{}---universe <*路径*>}}：（默认为<code>gametestserver</code>）设置服务端世界存放路径。会替换已有的文件夹。
* ** {{cd|-{}---verify <*布尔值*>}}：（默认为<code>false</code>）启用测试验证。启用时，对每个90度旋转步骤运行以<code>test</code>或<code>testNamespace</code>指定的测试100次。
* * 用法示例：<code>java -DbundlerMainClass"net.minecraft.gametest.Main" -jar server.jar --packs mytestpacks</code>

* *[测试实例定义格式](测试实例定义格式.md)**
* 游戏测试实例是定义运行测试的小型资产，可以在数据包注册表<code>test_instance</code>中定义。
* 测试类型分为2种：内置函数测试和基于方块的测试。
* * 内置函数测试依赖内置函数来运行测试并指示成功或失败。
* * 基于方块的测试使用测试结构中的[测试方块](测试方块.md)来运行测试并指示成功或失败。
* 游戏内置一个永远成功的测试实例<code>minecraft:always_pass</code>。
* 格式如下：
<div class="treeview">
  *  父标签
  ** <ref>尽管更新日志中称需要<code>environment</code>，但实际上应为<code>batch</code>，见</ref>：作为测试一部分的测试环境的命名空间ID。
  ** ：用于测试的结构的命名空间ID。
  ** ：测试的类型。需为之一。
  ** ：（）允许测试通过而不超时的最大刻数。
  ** ：（默认为<code>0</code>，）放置测试结构后、测试启动前需要等待的刻数。
  ** ：（默认为<code>1</code>，）尝试运行此测试的次数。
  ** ：（默认为<code>1</code>，）此测试必须成功的次数。
  ** ：（默认为<code>true</code>）对要通过的完整测试套件而言，这个测试是否必须通过。
  ** ：（默认为<code>false</code>）此测试是否不包含于自动测试运行组中。
  ** ：（默认为<code>false</code>）此测试是否需要天空。为<code>false</code>时，测试结构被屏障完全包裹；为<code>true</code>时，屏障盒顶部敞开。
  ** ：（默认为<code>none</code>）对测试结构应用的旋转角度。可以为之一。
  ** 为<code>function</code>时，附加以下字段：}}
  ** ：要运行的测试函数的命名空间ID。目前内置的测试函数只有<code>minecraft:always_pass</code>。
</div>

* *[测试环境定义格式](测试环境定义格式.md)**
* 游戏测试环境是对测试进行分组并为其提供正确的运行前提条件的一种方法，可以在数据包注册表<code>test_environment</code>中定义。
* 游戏内置一个空测试环境<code>minecraft:default</code>。
* 格式如下：
<div class="treeview">
  *  父标签
  ** ：测试环境的类型。需为之一。
  ** 为<code>all_of</code>时，附加以下字段：}}
  ** ：子定义设置列表，其中的定义均会应用。
  ** 为<code>function</code>时，附加以下字段：}}
  ** ：用于安装的mcfunction文件的命名空间ID。
  ** ：用于卸载的mcfunction文件的命名空间ID。
  ** 为<code>game_rules</code>时，附加以下字段：}}
  ** ：布尔型游戏规则的设置列表。
  *** ：一个游戏规则与一个设置值。
  **** ：要设置的规则的精确ID。测试环境完成后，此规则会被重置为默认值。
  **** ：规则的设置值。
  ** ：整型游戏规则的设置列表。
  *** ：一个游戏规则与一个设置值。
  **** ：要设置的规则的精确ID。测试环境完成后，此规则会被重置为默认值。
  **** ：规则的设置值。
  ** 为<code>raining</code><ref name="weather">尽管更新日志中声称为<code>weather</code>，但实际上只接受<code>raining</code>，见</ref>时，附加以下字段：}}
  ** ：要设置的天气。需为之一。
  ** 为<code>time_of_day</code>时，附加以下字段：}}
  ** ：（）要设置的当日时间，单位为刻。
</div>

* *游戏测试框架**
* 现在可以通过修改游戏代码的方式在<code>TEST_FUNCTION</code>注册表中添加测试函数，以使用比基于方块的测试方式更通用的游戏测试框架。

* *[标签](Java版标签.md)**
* 加入了实体标签<code>#can_equip_saddle</code>：。
* * 可以装备[鞍](鞍.md)的实体。该标签仅用于鞍的物品默认组件，不控制其实际功能。

# 更改
# = 方块 =
* *[枯叶堆](枯叶堆.md)**
* 现在能对[堆肥桶](堆肥桶.md)以堆肥，有30%的概率增加一层堆肥层。

* *[蘑菇方块](蘑菇方块.md)**
* 现在可以在生成时替换枯叶堆。

* *[粉红色花簇](粉红色花簇.md)**
* 回退了上个版本中的更改。现在对其使用骨粉时又会增加花的数量。

* *[野花簇](野花簇.md)**
* 现在对其使用骨粉时会先增加花的数量，待花的数量达到4后再掉落野花簇。

* *[方块更新](方块更新.md)**
* 上个快照一些未正常产生余留更新的破坏行为现在会正常更新了。

# = 生物 =
* *[可骑乘生物](骑乘.md)**
* 现在装备于其身上的[鞍](鞍.md)在掉落时能保留诸如自定义名称之类的物品属性。

* *非玩家生物数据**
* 字段现已合并为字段。
* * 格式为每个盔甲槽位与物品堆叠的映射。
* * 有效的盔甲槽位包括：。
* * 此字段不存在时，实体将无盔甲。

* *实体数据**
* 现在改为。

# = 世界生成 =
* *[返回传送门](返回传送门.md)**
* 尝试放置返回传送门方块时，现在会使被替换的方块掉落。

* *[地物数据格式](地物数据格式.md)**
* <code>place_on_ground</code>树木装饰器放置方块时，不再允许方块替换<code>#replaceable_by_trees</code>方块标签内的方块。
* * 现在<code>place_on_ground</code>树木装饰器尝试放置方块的位置比之前低1格，导致[森林](森林.md)和[疏林恶地](疏林恶地.md)生物群系不再自然生成枯叶堆。<ref></ref>

# = 游戏内容 =
* *[槽位](槽位.md)**
* 移除了<code>horse.saddle</code>鞍槽位。

* *[摔落](摔落.md)**
* 存储时和部分计算中的摔落高度现在使用双精度浮点数而非单精度浮点数。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[文本组件](文本组件.md)**
* 对悬停事件的<code>show_text</code>行为进行下列更改：
* * <code>text</code>字段已重命名为<code>value</code>。

* *[物品堆叠组件](物品堆叠组件.md)**
* 将组件的字段更名为。
* 组件现有以下更改：
* * 字段现可设置为<code>saddle</code>，表示鞍槽位。
* * 现在，拥有该组件的物品可以被穿戴在任何满足的生物的<code>body</code>槽位中。
* * 加入了可选字段，默认为<code>false</code>，控制玩家是否可给生物穿戴该物品。
* ** 如为<code>true</code>，对该组件允许的生物该物品时，如相应槽位没有其他物品，即可为生物穿戴该物品。

* *[实体子谓词](实体子谓词.md)**
* 移除了变种实体子谓词。
* * 其效果已被<code>components</code>谓词与变种实体组件的组合取代。
* 字段已从实体子谓词<code>sheep</code>中移除。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 更改了<code>pig_saddle</code>纹理的尺寸。
* 与鞍相关的纹理现在被移动或拆分到了{{filepath|-{}-textures/entity/equipment/*<实体>*_saddle/saddle.png}}，以便[装备模型](装备模型.md)调用。
* * 这些纹理路径中的现在已分别改为。

* *[标签](Java版标签.md)**
* 在<code>#replaceable_by_mushrooms</code>方块标签中加入了<code>leaf_litter</code>。

# 修复
）中存在未使用的调色像素。
|272790|末地返回传送门中的潜影盒和其他方块未在传送门改变状态时作为物品掉落。
|274258|所有马的纹理都包含一个未使用的箱包纹理。
|279340|幼年北极熊太小了。
|;1.21.4的漏洞
|278673|的相对于实体原始角度的X轴旋转角度限制于±90。
|;prev
|279206|枯叶堆不能用于堆肥。
|279208|玩家不再能在按住横向移动键时开始疾跑。
|279211|潜影盒被以某些方法破坏时，能在被保留的同时掉落其中内容物，以复制物品。
|279213|蘑菇方块不能替换枯叶堆。
|279221|枯叶堆在世界生成时会替换掉树叶。
|279224|在草甸使用骨粉不会生成野花簇。
|279226|任意数量的经验球都以最小值渲染。
|279233|被破坏的潜影盒掉落其中内容物。
|279234|<code>minecraft:entity.generic.extinguish_fire</code>音效未在实体身上的火被熄灭时播放。
|279238|死于由被烈焰人火球点燃的TNT矿车不算作被烈焰人击杀。
|279239|被激活的TNT的动量不稳定。
|279245|大多数敌对生物在合适条件下都不生成。
|279248|熔岩的碰撞箱过高。
|279273|或不会在只改变方块实体数据时更新客户端渲染。
|279281|从2格方块上跳下来会产生摔落伤害。
|279282|生成主人UUID不为玩家的鹦鹉会导致崩溃。<!--
|279285|经验球突然高速冲向地面。Reopened and Summary Changed-->
|279301|从22.00001格高而非23格高摔落的玩家死亡。
|279313|某些情况下，物品实体的动量不稳定。
|279314|弹射物在空中飞行时会轻微抽搐。
|279316|浮漂的动量不稳定。
|279318|物品在熔岩中燃烧时偶尔不播放燃烧音效。
|279326|亮起的侦测器不再在被活塞移动时发出方块更新。
|279339|斜坡铁轨的更新顺序异常。
|279345|粉红色花簇和野花簇不再能用骨粉催生。
|279357|玩家能在潜行时从边缘摔下。<!--
|279434|同时处于细雪和火中产生大量灭火噪音。Reopened-->
|279459|和其他填充方块的命令不能正常更新方块实体。
}}</onlyinclude>

# 参考

# 导航

[de:25w03a](de:25w03a.md)
[en:Java Edition 25w03a](en:Java Edition 25w03a.md)
[es:Java Edition 25w03a](es:Java Edition 25w03a.md)
[fr:Édition Java 25w03a](fr:Édition Java 25w03a.md)
[ja:Java Edition 25w03a](ja:Java Edition 25w03a.md)
[lzh:二五週〇三甲](lzh:二五週〇三甲.md)
[pt:Edição Java 25w03a](pt:Edição Java 25w03a.md)
[ru:25w03a (Java Edition)](ru:25w03a (Java Edition).md)
[uk:25w03a (Java Edition)](uk:25w03a (Java Edition).md)