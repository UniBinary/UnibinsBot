# 命令/place

*页面ID: 95979* | *来源: Minecraft Wiki*

已移除的用于控制[智能体](智能体.md)的命令|命令/place（已移除）|用于放置结构的命令|命令/structure}}

}}

以指定位置为生成原点，放置[已配置的地物](已配置的地物.md)、[结构地物](结构地物.md)、[结构模板](结构模板.md)或[结构池](结构池.md)。

# 语法
* **Java版**
   <code>place feature <feature> [<pos>]</code>
  : 放置[已配置的地物](已配置的地物.md)。
   <code>place jigsaw <pool> <target> <max_depth> [<position>]</code>
  : 放置[结构池](结构池.md)并展开至指定深度。
   <code>place structure <structure> [<pos>]</code>
  : 放置[结构地物](结构地物.md)。
   <code>place template <template> [<pos>] [<rotation>] [<mirror>] [<integrity>] [<seed>] [strict]</code>
  : 放置[结构模板](结构模板.md)。与[结构方块](结构方块.md)功能基本一致。
* **基岩版**
   <code>place feature <feature: features> [position: x y z]</code>
   <code>place featurerule <featurerule: featureRules> [position: x y z]</code>
  : 放置[地物](地物.md)。
   <code>place jigsaw <pool: filepath> <jigsawTarget: string> <maxDepth: int> [pos: x y z] [keepJigsaws: Boolean] [includeEntities: Boolean] [liquidSettings: LiquidSettings]</code>
  : 放置[结构池](结构池.md)并展开至指定深度。
   <code>place structure <structure: string> [pos: x y z] [ignoreStartHeight: Boolean] [keepJigsaws: Boolean] [includeEntities: Boolean] [liquidSettings: LiquidSettings]</code>
  : 放置[结构地物](结构地物.md)。

# 参数
：
   指定要放置的已配置地物。原版中的已配置地物参见[地物](地物.md)。



   指定要放置的结构地物。原版中的结构地物参见[生成结构](生成结构.md)。

  且只能为以下其中之一：
  *  — 古迹废墟
  *  — 试炼密室

   指定要放置的结构池。


   指定放置结构池时的结构中的起始[拼图方块](拼图方块.md)。



   指定要展开拼图方块的最大深度。


：
   指定要放置的结构模板（结构文件）。


：和<br>
：和
   指定放置时使用的生成原点。


：
   指定放置模板时应当旋转的角度，旋转方向以Y轴俯视角为基准。可用值如下：
  * <code>none</code>（默认值）：不旋转。
  * <code>clockwise_90</code>：顺时针旋转90°。
  * <code>180</code>：旋转180°。
  * <code>counterclockwise_90</code>：逆时针旋转90°。

：
   指定放置模板时应当采取的镜像方式。可用值如下：
  * <code>none</code>（默认值）：不镜像。
  * <code>front_back</code>：前后翻转。
  * <code>left_right</code>：左右翻转。

：
   指定被放置结构的完整度。默认值为1。


：
   指定要被用于结构随机不完整放置的种子。0代表随机种子。如不指定，则默认为0，即使用随机种子。


：
   使命令在放置方块时不触发自身及紧挨着的方块的方块更新和形状更新。

：
   指定地物。


：
   指定地物规则。


：
   指定放置结构时是否忽略起始高度，默认为<samp>false</samp>。


：
   指定被放置结构是否保留拼图方块，默认为<samp>false</samp>。


：
   指定被放置结构是否包含实体，默认为<code>false</code>。


：
   指定流体处理方式，默认为。
   必须为以下其中之一：
  *  — 允许[含水](含水.md)。
  *  — 忽略含水。


# 结果

</ref>|error}}

</ref>|执行失败或执行出错}}

# 输出

# 示例
* 以命令执行者当前坐标为原点，在合适的位置放置一处试炼密室：
* 以命令执行者当前坐标为原点，放置一项金合欢树地物：
* 以命令执行者当前坐标为原点，以远古城市中心为模板池抽取模板，并向外生成7层结构：
* 以命令执行者当前坐标为原点，放置一个<code>ancient_city/city_center/city_center_1</code>（顺时针旋转90°；左右翻转；50%完整度；种子随机）：

# 历史

|命令，用以替代。}}
|
|
|的最大值由7更改为20。<ref></ref>}}
|命令在放置前检测是否加载或在世界外。<ref></ref>}}
|命令加入了选项。}}
|
|命令。}}
|子命令。}}
|子命令加入了参数。}}
|子命令不再属于[实验性玩法](实验性玩法.md)。}}
|子命令不再属于[实验性玩法](实验性玩法.md)。}}
|子命令加入了参数。}}
}}

# 参考

# 导航

[de:Befehl/place](de:Befehl/place.md)
[en:Commands/place](en:Commands/place.md)
[es:Comandos/place](es:Comandos/place.md)
[ja:コマンド/place](ja:コマンド/place.md)
[pt:Comandos/place](pt:Comandos/place.md)
[ru:Команды консоли/place](ru:Команды консоли/place.md)