# Java版15w49b

*页面ID: 19048* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w49b**是[Java版1.9](Java版1.9.md)的第45个快照，发布于2015年12月3日<ref></ref>，加入了新的声音事件以及的一个新参数<code>query</code>，并修复了[15w49a](15w49a.md)中的漏洞和崩溃。

# 新内容
# = 命令格式 =
* ***
* 现在可使用参数<code>day</code>，它会发回游戏内的天数。

# = 常规 =
* *[声音](声音.md)事件**
* 加入了<code>entity.leashknot.break</code>。

# 更改
# = 方块 =
* *[蜘蛛网](蜘蛛网.md)**
* 移除了捕获掷出的弹射物的能力（在[15w49a](15w49a.md)中加入）。

* *[末地传送门方块](末地传送门方块.md)**
* 碰撞箱高度变为0.75格（之前为0.0625格）。

* *[西瓜](西瓜.md)**
* 西瓜和闪烁的西瓜片的朝向再次变得相反（[15w49a](15w49a.md)中它们的朝向相同）。

# = 非生物实体 =
* *掷出的[弹射物](弹射物.md)**
* 移除了被蜘蛛网捕获的能力（在[15w49a](15w49a.md)中加入）。
* 再次会与透明方块碰撞。

# = 常规 =
* *[声音](声音.md)**
* 移除声音事件<code>entity.hanging.place</code>和<code>entity.hanging.pop</code>。

# 修复
命令在昼夜更替后不会被重置。
|70263|当数量为0时，命令不能清除物品。
|77867|飞入主世界的末地传送门会导致玩家被卡在末地里。
|79823|使用命令时，资源包中的自定义声音不会相对于目标实体的位置播放。
|82184|骑马时，<code>stat.openInventory</code>统计值不增加。
|93182|进入了炼药锅的生物不能离开炼药锅。
|93478|末地传送门的传送的探测距离过大（传送门角落和底部都可以探测到）。
|;dev
|91050|盔甲架可以拥有药水效果。
|92633|使玩家血量降到0的物品会阻止玩家重生。
|;previous
|93592|用完堆叠的物品时，客户端崩溃。
|93597|移动整组物品时，会导致它们被复制，或者它们的数量会变为0。
|93601|在含有双台阶方块的世界中，会出现原因为<code>Exception ticking world</code>的崩溃。
|93630|在0,0处，落沙实体不可见，有渲染问题。
|93636|投掷物可以穿过玻璃、台阶以及其他不透明固体方块。
|93685|玩家与女巫之间有蜘蛛网时，女巫会将药水以物品的形式扔出。
|93717|不能通过键拿走副手上的物品。
}}</onlyinclude>

# 参考

# 导航

[de:15w49b](de:15w49b.md)
[en:Java Edition 15w49b](en:Java Edition 15w49b.md)
[es:Java Edition 15w49b](es:Java Edition 15w49b.md)
[fr:Édition Java 15w49b](fr:Édition Java 15w49b.md)
[ja:Java Edition 15w49b](ja:Java Edition 15w49b.md)
[pt:Edição Java 15w49b](pt:Edição Java 15w49b.md)
[ru:15w49b (Java Edition)](ru:15w49b (Java Edition).md)