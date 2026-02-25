# 命令/camerashake

*页面ID: 70297* | *来源: Minecraft Wiki*

对玩家视野施以一定强度和时间的摇晃效果（若玩家在无障碍设置中禁用了视角摇晃，则不会看到此效果）。

# 语法
   <code>camerashake add <player: target> [intensity: float] [seconds: float] [shakeType: CameraShakeType]</code>
  : 给玩家添加视野摇晃效果。
   <code>camerashake stop [player: target]</code>
  : 停止视野摇晃。

# 参数


   指定要施以视野摇晃效果的玩家。如果未指定，默认为命令执行者。

   必须是0到4以内的数（包含0和4）。
   指定视野摇晃的强度。


   指定视野摇晃的时长。以秒为单位。

   必须为<code>positional</code>（坐标摇晃）或<code>rotational</code>（角度摇晃）。
   指定视野摇晃方向的种类。

# 结果

小于0或大于4||fail}}

# 输出

# 示例
对最近的玩家施以5秒强度为0.25的坐标视野摇晃。
* <code>/camerashake add @p 0.25 5 positional</code>

对最近的玩家施以5秒强度为0.25的角度视野摇晃。
* <code>/camerashake add @p 0.25 5 rotational</code>

<gallery>
File:Minecraft Bedrock Positional Camerashake.gif|坐标视野摇晃的示例
File:Minecraft Bedrock Rotational Camerashake.gif|角度视野摇晃的示例
</gallery>

# 历史

|命令。}}
|
|
}}

# 导航

[de:Befehl/camerashake](de:Befehl/camerashake.md)
[en:Commands/camerashake](en:Commands/camerashake.md)
[es:Comandos/camerashake](es:Comandos/camerashake.md)
[ja:コマンド/camerashake](ja:コマンド/camerashake.md)
[pt:Comandos/camerashake](pt:Comandos/camerashake.md)
[ru:Команды консоли/camerashake](ru:Команды консоли/camerashake.md)