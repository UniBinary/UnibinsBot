# 命令/agent

*页面ID: 40120* | *来源: Minecraft Wiki*

<br>1
}}

用于控制[智能体](智能体.md)。仅允许被玩家所连接的WebSocket、开发者控制台、脚本或[NPC](NPC.md)执行，命令方块和玩家无法执行该命令。

若执行命令时不存在智能体，均会在执行者处生成后再执行，除外。

# 语法
   <code>agent attack <direction: AgentDirection></code>
  : 使智能体向指定方向攻击。
   <code>agent collect <item: Item></code>
  : 使智能体收集自身周围一格内的一种物品。
   <code>agent collect all</code>
  : 使智能体收集自身周围一格内的所有物品。
   <code>agent create</code>
  : 在执行者处生成智能体。
   <code>agent destroy <direction: AgentDirection></code>
  : 使智能体摧毁指定方向的方块或物品。
   <code>agent detect <direction: AgentDirection></code>
  : 使智能体检测指定方向是否存在可碰撞方块。
   <code>agent detectredstone <direction: AgentDirection></code>
  : 使智能体检测指定方向的红石信号。
   <code>agent drop <slotNum: int> <quantity: int> <direction: AgentDirection></code>
  : 使智能体按指定数量丢弃指定槽位编号的物品到指定方向。数量小于0时全部丢弃。
   <code>agent dropall <direction: AgentDirection></code>
  : 使智能体将所有槽位的物品丢弃到指定方向一格内的地面。
   <code>agent getitemcount <slotNum: int></code>
  : 使智能体返回指定槽位的物品数量（即该槽位耗尽前的可用数量）。
   <code>agent getitemdetail <slotNum: int></code>
  : 使智能体返回指定槽位的物品名称。
   <code>agent getitemspace <slotNum: int></code>
  : 使智能体返回指定槽位的剩余空间（即该槽位填满前可容纳的物品数量）。
   <code>agent getposition</code>
  : 使智能体获取自身在世界中的坐标位置。
   <code>agent inspect <direction: AgentDirection></code>
  : 使智能体返回指定方向的方块名称。
   <code>agent inspectdata <direction: AgentDirection></code>
  : 使智能体返回指定方向方块的数据值。
   <code>agent interact <direction: AgentDirection></code>
  : 使智能体与指定方向的方块交互。
   <code>agent move <direction: AgentDirection></code>
  : 使智能体向指定方向移动。
   <code>agent place <slotNum: int> <direction: AgentDirection></code>
  : 使智能体在指定方向放置方块。
   <code>agent setitem <slotNum: int> <item: Item> <count: int> <aux: int></code>
  : 设置智能体指定槽位的物品。数量小于一个时，则设置一个；大于一组时，则设置一组。
   <code>agent till <direction: AgentDirection></code>
  : 使智能体在指定方向耕种草地。
   <code>agent tp <destination: x y z> facing <lookAtPosition: x y z></code>
   <code>agent tp [destination: x y z] [y-rot: float]</code>
  : 将智能体传送到指定坐标位置，并使其旋转角度与指定的一致。
   <code>agent transfer <slotNum: int> <quantity: int> <dstSlotNum: int></code>
  : 将指定数量的物品从智能体库存的一个槽位转移到另一个槽位。
   <code>agent turn <direction: AgentTurnDirection></code>
  : 使智能体按指定方向旋转90度。

# 参数

   指定方向，必须为以下其中之一：
  *  — 后
  *  — 下
  *  — 前
  *  — 左
  *  — 右
  *  — 上

   指定旋转方向，必须为以下其中之一：
  *  — 左
  *  — 右

   指定要改变的智能体物品栏槽位。有效值为1和27之间（含）的整数。


   指定要给予或收集到物品栏槽位内的物品。


和
   指定被丢出、给予或移动的物品数量。


   指定参与命令的物品的数据值。


   指定要被传送到的坐标。


   指定传送后智能体的水平旋转角度。


   指定传送后智能体朝向的位置。


   指定目标物品栏槽位。有效值为1和27之间（含）的整数。


# 结果

或小于0||fail}}
或等于0}}
小于等于0或大于64}}

# 输出

# 示例
* 创建智能体：<code>/agent create</code>
* 将自己的智能体传送至(0, -60, 0)：<code>/agent tp 0 -60 0</code>

# 历史

|。}}
|
|。}}
}}

# 参见
* [智能体](智能体.md)

# 导航

[en:Commands/agent](en:Commands/agent.md)
[ja:コマンド/agent](ja:コマンド/agent.md)
[pt:Comandos/agent](pt:Comandos/agent.md)