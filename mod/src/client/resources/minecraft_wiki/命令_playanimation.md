# 命令/playanimation

*页面ID: 68223* | *来源: Minecraft Wiki*

在一个或多个实体上播放一次性[动画](动画.md)。

# 语法
  <code>playanimation <entity: target> <animation: string> [next_state: string] [blend_out_time: float] [stop_expression: string] [controller: string]</code>

# 参数

   指定目标。


   指定动画。
   由文件内<code>"minecraft:client_entity"."animations"</code>的参数定义。


   指定动画播放完毕后的状态。
   由文件内<code>-{}-"animation_controllers"."<*控制器名称*>"."states"</code>的参数定义。


   指定动画渐变的持续时间。


   指定动画播放终止的条件。
   应为[Molang表达式](基岩版Molang文档.md)。


   指定动画控制器。
   由文件内<code>"minecraft:client_entity"."render_controllers"</code>的参数定义。


# 结果

# 输出

# 示例
* <code>/playanimation @p animation.player.attack.rotations none 1 "v.attack_body_rot_y=180;"</code>
* * 将最近玩家的身体翻转180度。
* <code>/playanimation @p animation.armor_stand.riposte_pose</code>
* * 使最近的玩家开始盔甲架回刺反击动作的动画。

# 历史

|。}}
}}

# 导航

[de:Befehl/playanimation](de:Befehl/playanimation.md)
[en:Commands/playanimation](en:Commands/playanimation.md)
[ja:コマンド/playanimation](ja:コマンド/playanimation.md)
[pt:Comandos/playanimation](pt:Comandos/playanimation.md)
[ru:Команды консоли/playanimation](ru:Команды консоли/playanimation.md)