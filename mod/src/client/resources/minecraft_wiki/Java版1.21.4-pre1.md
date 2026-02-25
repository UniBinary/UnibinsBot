# Java版1.21.4-pre1

*页面ID: 128908* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.21.4-pre1**是[Java版1.21.4](Java版1.21.4.md)的首个预发布版，发布于2024年11月20日<ref></ref>，修复了一些漏洞。

# 更改
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 若刷怪蛋拥有物品堆叠组件<code>entity_data</code>且其中实体类型为[下落的方块](下落的方块.md)、[命令方块矿车](命令方块矿车.md)或[刷怪笼矿车](刷怪笼矿车.md)时，[权限等级](权限等级.md)为2及以上的玩家会在其物品[提示框](提示框.md)中看到警告信息。

# = 生物 =
* *[猪灵](猪灵.md)**
* 幼年猪灵不再受到<code>#piglin_preferred_weapons</code>物品标签的影响而拾取弩。

# = 游戏内容 =
* *[水下呼吸](水下呼吸（状态效果）.md)和[潮涌能量](潮涌能量.md)**
* 现在能够使生物的氧气值逐渐恢复，以匹配。
* * 此前只会使其氧气值保持不下降。

# = 常规 =
* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* Unifont已更新到16.0.01。

* *[物品模型映射](物品模型映射.md)**
* 加入了字段，默认为<code>true</code>。
* * 该字段控制玩家在快捷栏切换到此物品堆叠时是否应该渲染切换过渡动画。
* * 该字段仅接受新持有的物品的值。
* * 无法控制GUI中物品堆叠被捡起或数量改变时播放的弹出动画。
* 对<code>model</code>物品模型映射下的着色索引进行下列更改：
* * 加入了<code>team</code>着色索引，返回上下文实体所在的队伍颜色（若有）。附加字段如下：
<div class="treeview">
  :*  父标签
  :** ：<code>team</code>。
  :** ：当上下文实体不存在，实体不在任意队伍中，或实体所在队伍无颜色时使用的着色颜色。
  :*** ：R（红）颜色分量。
  :*** ：G（绿）颜色分量。
  :*** ：B（蓝）颜色分量。
</div>
* 对<code>special</code>物品模型映射下的硬编码渲染器进行下列更改：
* * 为硬编码渲染器<code>head</code>加入了字段以控制头颅（如龙首和猪灵头颅）的动画，默认为<code>0.0</code>。
* 对<code>condition</code>物品模型映射下的谓词进行下列更改：
* * 加入了<code>view_entity</code>布尔值属性。
* ** 上下文为本地玩家实体（即由客户端控制的实体）且此实体未观察时，返回<code>true</code>。
* ** 上下文为被观察的实体且此实体正在观察时，返回<code>true</code>。
* ** 上下文实体不存在时，返回<code>false</code>。
* 对<code>select</code>物品模型映射下的离散值属性进行下列更改：
* * 将离散值属性<code>holder_type</code>重命名为<code>context_entity_type</code>，以强调此实体类型仅在能产生正确读数的上下文环境中可用。
* * 加入了<code>context_dimension</code>离散值属性，返回上下文（如有）维度的命名空间ID（如<code>minecraft:overworld</code>）。
* 对<code>range_dispatch</code>物品模型映射下的数值属性进行下列更改：
* * 对<code>time</code>数值属性作出下列更改：
* ** 移除了字段。
* ** 加入了字段，表示时间类型，可选值包括<code>daytime</code>（当日时间）、<code>moon_phase</code>（月相）和<code>random</code>（随机值）。
* * 为数值属性<code>compass</code>的字段加入了离散值<code>none</code>，表示总是返回无效目标。
* 加入了<code>empty</code>物品模型映射，不会渲染任何模型。

# 修复
不能移除NBT<code>CustomName</code>。
|138100|不对唱片机的<code>RecordItem</code>标签生效。
|179815|命令不能移除拴在生物身上的拴绳。
|189612|用将游戏模式从生存模式切换到旁观模式时，玩家的呼吸不会重置。
|207605|{{cmd|data remove entity [-{}-已驯服的狼] Owner|link=none}}不能移除狼的主人。
|248264|不能移除NBT<code>ArmorItems</code>。
|265788|打开其他界面时，“”元素能被选中或保持选择状态，导致其不应显示的提示框仍然可见。
|;1.21.3的漏洞
|278257|氧气条动画会因获得状态效果而中断。
|;dev
|278134|键不能用于在点击“”元素后选择将举报的消息。
|278193|幼年猪灵在选择弩和金质物品时举棋不定。
|278390|打开的潜影贝不再触发绊线或压力板。
|;prev
|278290|在水下游泳或走路的同时物品不会使玩家减速。
|278300|嘎枝被闪电击中时会在视觉上显示着火。
|278302|收纳袋总是只能取出首个物品而忽略选择。
|278311|由嘎枝之心重新生成的嘎枝不在重载世界时持久存在。
|278312|由嘎枝之心生成的嘎枝再次能被命名。
|278387|玩家从下界回来后，嘎枝会重新生成。
}}</onlyinclude>

# 参考

# 导航

[de:1.21.4-pre1](de:1.21.4-pre1.md)
[en:Java Edition 1.21.4 Pre-Release 1](en:Java Edition 1.21.4 Pre-Release 1.md)
[es:Java Edition 1.21.4 Pre-Release 1](es:Java Edition 1.21.4 Pre-Release 1.md)
[fr:Édition Java 1.21.4 Pre-Release 1](fr:Édition Java 1.21.4 Pre-Release 1.md)
[ja:Java Edition 1.21.4 Pre-Release 1](ja:Java Edition 1.21.4 Pre-Release 1.md)
[pt:Edição Java 1.21.4 Pre-Release 1](pt:Edição Java 1.21.4 Pre-Release 1.md)
[ru:1.21.4 Pre-Release 1 (Java Edition)](ru:1.21.4 Pre-Release 1 (Java Edition).md)
[uk:1.21.4 Pre-Release 1 (Java Edition)](uk:1.21.4 Pre-Release 1 (Java Edition).md)