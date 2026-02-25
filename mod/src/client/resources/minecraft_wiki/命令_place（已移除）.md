# 命令/place（已移除）

*页面ID: 57667* | *来源: Minecraft Wiki*

在指定方向上方块右键一次。

# 用法
此命令基本上与玩家在指定的物品栏槽位中选取方块并放置的动作相同。

然而这不会和门、拉杆和容器这类的方块有交互。

此外，若玩家指定了一些不可放置的物品，会出现以下行为：
* [铁桶](铁桶.md)：放置水/熔岩
* [锄](锄.md)：犁地
* [锹](锹.md)：制作草径
* [刷怪蛋](刷怪蛋.md)：生成生物
* [染料](染料.md)：染色
* [打火石](打火石.md)或[火焰弹](火焰弹.md)：生火
* [船](船.md)、[矿车](矿车.md)和[玻璃瓶](玻璃瓶.md)：放置或使用

# 语法
   <code>-{}-place <*slotNum：整数*> <*方向：字符串*></code>
   返回指定槽位上方块被成功放置的信息。

# 参数
<code>-{}-*slotNum：整数*</code>
   指定需要放置方块的槽位，编号为1-27。

<code>-{}-*方向：字符串*</code>
   指定智能体需要放置方块的方向。
   必须为以下之一：
  * <code>forward</code>——向前放置方块。
  * <code>back</code>——向后放置方块。
  * <code>left</code>——向左侧放置方块。
  * <code>right</code>——向右侧放置方块。
  * <code>up</code>——向顶部放置方块。
  * <code>down</code>——向底部放置方块。

# 结果

# 导航

[en:Commands/place (Education)](en:Commands/place (Education).md)
[pt:Comandos/place_(Education)](pt:Comandos/place_(Education).md)