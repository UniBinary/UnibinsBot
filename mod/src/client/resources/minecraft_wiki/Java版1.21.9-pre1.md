# Java版1.21.9-pre1

*页面ID: 166797* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.21.9-pre1**是[Java版1.21.9](Java版1.21.9.md)的首个预发布版，发布于2025年9月16日<ref></ref>，修复了一些漏洞。

# 新内容
# = 生物 =
* *[玩家模型](玩家模型.md)**
* 加入了如下字段：
<div class="treeview">
  *  父标签
  ** ：（默认为<code>standing</code>）玩家模型的姿势。可以为之一。
  ** ：（默认为<code>false</code>）玩家模型是否不能被移动。
  ** ：（默认为<code>false</code>）玩家模型不显示描述。
  ** ：（[文本组件](文本组件.md)，默认为“NPC”，即<code>entity.minecraft.mannequin.label</code>）在玩家的<code>below_score</code>记分板显示位置处显示的文本。
</div>

# = 常规 =
* *[玩家数据格式](玩家数据格式.md)**
* 在中加入了必选字段。

* *[数据组件](数据组件.md)**
* 向<code>profile</code>组件中加入了新的字段：
<div class="treeview">
  *  父标签
  ** ：（[命名空间ID](命名空间ID.md)）皮肤纹理，会解析为。例如<code>entity/player/wide/steve</code>会使用宽型Steve皮肤。
  ** ：（命名空间ID）披风纹理，解析行为同。
  ** ：（命名空间ID）鞘翅纹理，解析行为同。玩家模型穿着鞘翅时，如果此字段不存在或没有被覆写，将会使用披风的纹理；如果字段也不存在，将会使用默认的鞘翅纹理。
  ** ：可以为<code>wide</code>或<code>slim</code>。
</div>

* *[调试工具](调试工具.md)**
* 加入了<code>MC_DEBUG_DEV_COMMANDS</code>，以允许启用之前仅能在IDE环境下执行的、、、、和以及需要在专用服务器上才可启用的命令。
* 加入了<code>MC_DEBUG_VERBOSE_COMMAND_ERRORS</code>，以记录命令抛出的异常。

# 更改
# = 生物 =
* *[铜傀儡](铜傀儡.md)**
* 如果正在骑乘实体，其只会尝试打开邻近的箱子。

* *[玩家模型](玩家模型.md)**
* 现在刷怪蛋中的<code>profile</code>组件可以对玩家模型生效。
* 现在可以修改描述文本。
* 更改了数据格式。
* * 字段现在与<code>profile</code>数据组件具有相同的格式（即已扩展且允许覆写），且默认为<code>{}</code>（即均不存在的静态游戏档案）。

# = 命令格式 =
* ***
* 移除了可选参数，并以可选参数代替。
* * 现在可以在此设置玩家重生时面朝的垂直角度。
* 现在可以在主世界以外的[维度](维度.md)执行。

* ***
* 移除了可选参数，并以可选参数代替。
* * 现在可以在此设置玩家重生时面朝的垂直角度。

* ***
* 现在会输出可点击文本，点击之后可以生成带有相应档案的玩家模型。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[服务端管理协议](服务端管理协议.md)**
* 通知现在使用<code>minecraft:notification/</code>而不是<code>notification:</code>前缀。

* *[命令](命令.md)**
* 现在服务端命令会在出生点所在的维度执行，而不总是在主世界执行。

* *[数据组件](数据组件.md)**
* 更改了<code>minecraft:profile</code>组件。
* * 现在可以有额外的字段，可以替换用于渲染的多种值。
* * 如果省略了任何字段，将会使用已解析的组件的值，即便这是默认皮肤的。

* *[玩家数据格式](玩家数据格式.md)**
* 更改了：
* * <code>angle</code>被重命名为<code>yaw</code>，且现在是必选字段。
* * <code>dimension</code>现在是必选字段。

* *[战利品表函数](战利品表函数.md)**
* <code>minecraft:copy_name</code>的<code>source</code>字段现在接受新的值：
* * <code>direct_attacker</code>
* * <code>target_entity</code>
* * <code>interacting_entity</code>
* <code>minecraft:copy_components</code>的<code>source</code>字段现在接受新的值：
* * <code>this</code>
* * <code>attacker</code>
* * <code>direct_attacker</code>
* * <code>attacking_player</code>
* * <code>target_entity</code>
* * <code>interacting_entity</code>
* * <code>tool</code>

# 修复
有一些重命名的键指向文本值而非新键。
|302032|除非提供了ID或名称，否则静态游戏档案不再解析纹理数据。
|302089|在调试模式中、飞行生物开始寻路时，游戏崩溃。
|302092|将楼梯加入到<code>#bars</code>标签并将铁栏杆放置于楼梯旁时，游戏崩溃。
|302094|将方块加入<code>#copper_chests</code>并将其放置于真正的铜箱子旁时，游戏崩溃。
|302095|将方块加入<code>#lightning_rods</code>并在之上生成一道闪电后，游戏崩溃。
|302096|将方块加入<code>#wooden_shelves</code>，将其放置于木质展示架旁，然后游戏在展示架充能后崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:1.21.9-pre1](de:1.21.9-pre1.md)
[en:Java Edition 1.21.9 Pre-Release 1](en:Java Edition 1.21.9 Pre-Release 1.md)
[es:Java Edition 1.21.9 Pre-Release 1](es:Java Edition 1.21.9 Pre-Release 1.md)
[fr:Édition Java 1.21.9 Pre-Release 1](fr:Édition Java 1.21.9 Pre-Release 1.md)
[ja:Java Edition 1.21.9 Pre-Release 1](ja:Java Edition 1.21.9 Pre-Release 1.md)
[pt:Edição Java 1.21.9 Pre-Release 1](pt:Edição Java 1.21.9 Pre-Release 1.md)
[ru:1.21.9 Pre-Release 1 (Java Edition)](ru:1.21.9 Pre-Release 1 (Java Edition).md)
[uk:1.21.9 Pre-Release 1 (Java Edition)](uk:1.21.9 Pre-Release 1 (Java Edition).md)