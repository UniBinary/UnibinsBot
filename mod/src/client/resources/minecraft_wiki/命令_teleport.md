# 命令/teleport

*页面ID: 39820* | *来源: Minecraft Wiki*

|oplevel=2\1
|becheat=1
}}

传送实体（玩家、生物等）到指定的地点，并修改其旋转角度。

不像大多数只能影响已经生成的区块的命令，可以将实体传送到尚未生成的区块中，传送前游戏会生成目标位置所在区块。

若一个骑乘着[矿车](矿车.md)、[船](船.md)或其他[生物](生物.md)的生物被传送，则骑乘者会从其载具上脱离，并被单独传送至目标位置，而原有的载具会留在原地，不受影响。反之，若一个正被生物骑乘的矿车、船或生物被传送，骑乘在载具上的生物会跟随载具一同被传送至目标，并保持骑乘状态。

# 语法
* **Java版**
   <code>teleport <destination></code>
   <code>teleport <targets> <destination></code>
  : 将执行者或指定的实体传送到另一个实体所在的位置，并使其旋转角度与该实体一致。
   <code>teleport <location></code>
  : 将执行者传送到指定的坐标，并使其旋转角度与命令执行角度一致。
   <code>teleport <targets> <location></code>
  : 将指定的实体传送到一个确定的坐标位置，但不会修改其旋转角度。
   <code>teleport <targets> <location> <rotation></code>
   <code>teleport <targets> <location> facing <facingLocation></code>
   <code>teleport <targets> <location> facing entity <facingEntity> [<facingAnchor>]</code>
  : 将指定的实体传送到一个确定的坐标位置，并使其旋转角度与指定的一致。

* **基岩版**
   <code>teleport <destination: target></code>
   <code>teleport <victim: target> <destination: target> [checkForBlocks: Boolean]</code>
  : 将执行者或指定的实体传送到另一个实体所在的位置，并使其水平旋转角度与该实体一致，视角水平（垂直旋转角度为零）。
   <code>teleport <destination: x y z> [checkForBlocks: Boolean]</code>
   <code>teleport <victim: target> <destination: x y z> [checkForBlocks: Boolean]</code>
  : 将指定的实体传送到一个确定的坐标位置，但不会修改其旋转角度。
   <code>teleport <destination: x y z> [yRot: value] [xRot: value] [checkForBlocks: Boolean]</code>
   <code>teleport <destination: x y z> facing <lookAtPosition: x y z> [checkForBlocks: Boolean]</code>
   <code>teleport <destination: x y z> facing <lookAtEntity: target> [checkForBlocks: Boolean]</code>
   <code>teleport <victim: target> <destination: x y z> [yRot: value] [xRot: value] [checkForBlocks: Boolean]</code>
   <code>teleport <victim: target> <destination: x y z> facing <lookAtPosition: x y z> [checkForBlocks: Boolean]</code>
   <code>teleport <victim: target> <destination: x y z> facing <lookAtEntity: target> [checkForBlocks: Boolean]</code>
  : 将指定的实体传送到一个确定的坐标位置，并使其旋转角度与指定的一致。

# 参数

   指定要被传送的实体。如果未指定，默认为命令执行者。


   指定要被传送到的坐标。


   指定要被传送到的实体。


：<br>
：、
   指定实体传送后的旋转角度。


   指定实体传送后朝向的坐标。


   指定实体传送后朝向的实体。


：
   指定实体传送后应朝向实体的眼睛还是足部。如果未指定，默认为眼睛。总是朝向眼睛。


：

   如果为<code>true</code>，只当目的地不会被方块碰撞箱阻挡时，传送才会生效。如果为<code>false</code>或未指定，则不进行该检查，直接进行传送。

# 结果

# 输出

# 示例
* 将执行实体传送到Alice：<syntaxhighlight lang="mcfunction" inline>teleport Alice</syntaxhighlight>
* 将所有玩家传送到命令执行实体：<syntaxhighlight lang="mcfunction" inline>teleport @a @s</syntaxhighlight>
* 将执行实体传送到的位置，且高于其现在所在位置三格方块：<syntaxhighlight lang="mcfunction" inline>teleport 100 ~3 100</syntaxhighlight>
* 使最近玩家向右转向10度，但不改变他的位置：<syntaxhighlight lang="mcfunction" inline>execute as @p at @s run teleport @s ~ ~ ~ ~10 ~</syntaxhighlight>
* 通过命令，还可以将实体传送到指定的维度中（如[主世界](主世界.md)、[下界](下界.md)和[末地](末地.md)）。
* * 将执行实体传送到下界中坐标与其目前所在主世界坐标相同的位置（X和Z坐标将自动除以8）：
* **<syntaxhighlight lang="mcfunction" inline>execute in minecraft:the_nether run teleport ~ ~ ~</syntaxhighlight>
* **<syntaxhighlight lang="mcfunction" inline>execute in nether run teleport ~ ~ ~</syntaxhighlight>
* * 将所有玩家传送到末地中的位置：
* ** <syntaxhighlight lang="mcfunction" inline>execute as @a in minecraft:the_end run teleport 84 57 79</syntaxhighlight>
* **<syntaxhighlight lang="mcfunction" inline>execute as @a in the_end run teleport 84 57 79</syntaxhighlight>
* * 将Alice传送到主世界中的位置：
* ** <syntaxhighlight lang="mcfunction" inline>execute as Alice in minecraft:overworld run teleport 251 64 -160</syntaxhighlight>
* ** <syntaxhighlight lang="mcfunction" inline>execute as Alice in overworld run teleport 251 64 -160</syntaxhighlight>

# 历史

|命令。}}
|
|
|
|，其与相似，但中一定要指定将被传送的实体，而“传送至其他玩家”的用法是不可用的，并且相对坐标的使用是相对于命令的执行位置而言，而不是相对于目标而言。}}
|现在用法与没有任何区别，作为的别名。}}
|
|的语法，并且命令现在能将实体传送至其他维度中。}}
|现在当目的地坐标的<*x*>或<*z*>超出[-30000000, 30000000)或<*y*>超出(-20000000, 20000000]时不会进行传送。}}

|
|。}}
|
|
|能指定的坐标最大值从∞被缩减为30,000,000。
|试图传送到大于最大坐标的位置不再输出一个错误信息。}}
|
|命令能将实体传送至其他维度中。}}
|命令将实体传送至其他维度的特性不再属于[实验性玩法](实验性玩法.md)。}}
|命令的旋转角度现在相对于命令执行者，而不是目标。}}
|命令传送执行者至指定实体时的参数。}}
}}

# 导航

[de:Befehl/teleport](de:Befehl/teleport.md)
[en:Commands/teleport](en:Commands/teleport.md)
[es:Comandos/tp](es:Comandos/tp.md)
[ja:コマンド/teleport](ja:コマンド/teleport.md)
[pt:Comandos/teleport](pt:Comandos/teleport.md)
[ru:Команды консоли/teleport](ru:Команды консоли/teleport.md)