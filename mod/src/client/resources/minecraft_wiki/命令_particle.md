# 命令/particle

*页面ID: 39800* | *来源: Minecraft Wiki*

在指定位置显示[粒子效果](粒子效果.md)。

不少原版粒子效果需要接收特定的上下文或变量才可正常显示，而命令无法向其传递上下文或变量，因此某些粒子效果在游戏中无法通过命令正常生成。而在ScriptAPI中则可以在调用时提供上下文。

# 语法
* **Java版**
   <code>particle <name> [<pos>]</code>
   <code>particle <name> <pos> <delta> <speed> <count> [force|normal] [<viewers>]</code>

* **基岩版**
   <code>particle <effect: string> [position: x y z]</code>

# 参数

   指定要生成的粒子的粒子类型。


   指定要显示粒子的位置。如果未指定，默认为命令的执行位置。



   指定创造的粒子的数量。0值有特殊作用，见下文。


   ——<br>
   ——
   和这两个参数决定粒子的生成位置以及要传给粒子的参数（见下表[粒子所接收的参数](#粒子所接收的参数.md)）。根据是否为0，这两个参数有不同的含义。
  * 若为0，则在处生成单个粒子，将中的三个值分别乘上后作为三个参数传入粒子。
  ** 根据下表，大部分接收参数的粒子都会将传入的三个参数视作速度分量，故设为0时，粒子一般表现为从<code><pos></code>坐标处以<code><delta></code>速度方向移动。
  * 若非0，则在随机位置生成指定数量的粒子，粒子在X、Y、Z方向上都服从正态分布。各方向上的正态分布以所指定的坐标为均值，意味着粒子更有可能在靠近的位置出现。各方向上的正态分布以为标准差（例如<code>1 1 1</code>表示在X、Y、Z轴上都是标准正态分布，意味着粒子约有99.7%的概率位于以为中心6×6×6的矩形区域内，<code>2 2 2</code>则意味着粒子约有99.7%的概率位于以为中心12×12×12的矩形区域内）。可以使用负数，但效果与正数相同（例如<code>-1 -1 -1</code>与<code>1 1 1</code>效果相同）。要传入粒子的参数为三个独立的随机值，这三个随机值也服从正态分布，其均值为0，标准差为。
   可以使用[相对坐标与局部坐标](坐标#命令.md)，将会被转换为绝对坐标后使用绝对坐标的值，因此一般无实际用途。
   若未指定，默认为<code>0 0 0</code>，默认为<code>0</code>。

   normal}}
   指定显示模式。可为<code>force</code>或<code>normal</code>。设置为<code>normal</code>将给32.0格以内的玩家显示粒子，若中的“”选项设为“”则可能不会显示（取决于粒子类型，有些粒子类型还会显示）。设置为<code>force</code>将给512.0格内的玩家显示粒子，并且即使玩家将“”选项设为“”也能够看到此粒子。默认为<code>normal</code>。


   限制能看到粒子效果的玩家。


# = 粒子所接收的参数 =

接收参数的大多数粒子类型都将参数用于改变初速度，粒子初速度的单位为m/tick（方块/游戏刻）。

注意，虽然可以使用参数指定初速度，但不同粒子类型有不同的阻力、重力，有的粒子类型还有碰撞检测，因此初速度相同的情况下，不同粒子类型的运动轨迹可能不一致。

# 结果

# 输出

# 示例
* 在向东10米处创造一个静止的巨型爆炸粒子：<code>particle explosion_emitter ~10 ~ ~ 0 0 0 0 0</code>
* 在向东5米处创造一个普通的龙息粒子：<code>particle minecraft:dragon_breath_fire ~5 ~ ~ </code>

# 历史

|命令。}}
|
|
|命令加入了<code>*player*</code>和<code>*params*</code>参数。}}
|
|作为该命令的一个简写。}}
|
|}}}}

|
|命令。}}
|命令。}}
|
|命令。}}
|在执行成功时不再输出0。
|命令的<code>position: x y z</code>现在可选。}}
}}

# 参考

# 导航

[de:Befehl/particle](de:Befehl/particle.md)
[en:Commands/particle](en:Commands/particle.md)
[es:Comandos/particle](es:Comandos/particle.md)
[ja:コマンド/particle](ja:コマンド/particle.md)
[ko:명령어/particle](ko:명령어/particle.md)
[pt:Comandos/particle](pt:Comandos/particle.md)
[ru:Команды консоли/particle](ru:Команды консоли/particle.md)
[uk:Команди консолі/particle](uk:Команди консолі/particle.md)