# 命令/spawnpoint

*页面ID: 39814* | *来源: Minecraft Wiki*

为特定玩家设置出生点。

# 语法
* **Java版**
   <code>spawnpoint [<targets>] [<pos>] [<rotation>]</code>

* **基岩版**
   <code>spawnpoint [player: target] [spawnPos: x y z]</code>

# 参数

   指定被更改出生点的玩家。如果没有指定，默认为命令执行者。


   指定玩家新的出生点的坐标。若没有指定，默认为或。
   <code><*x*></code>或<code><*z*></code>应在[-30000000, 30000000)区间内，<code><*y*></code>应在[-20000000, 20000000)区间内。
   大于30,000,000和小于-30,000,000的<code><*x*></code>和<code><*z*></code>值会分别被设置为30,000,000和-30,000,000，大于319和小于-64的<code><*y*></code>值会被分别设置为319和-64。



：
   指定玩家重生时的旋转角，默认为。


# 结果

# 输出

# 示例
* 设置所有玩家的出生点为<code>0 -60 0</code>：<code>/spawnpoint @a 0 -60 0</code>
* 设置自己的出生点为<code>0 -60 0</code>并面朝北方：<code>/spawnpoint @s 0 -60 0 180 0</code>

# 历史

|。}}
|
|
|现在不允许<*x*>或<*z*>超出[-30000000, 30000000)或<*y*>超出[-20000000, 20000000)。<ref></ref>}}
|
|
|。}}
|
|
|
}}

# 参见
*
*

# 参考

# 导航

[de:Befehl/spawnpoint](de:Befehl/spawnpoint.md)
[en:Commands/spawnpoint](en:Commands/spawnpoint.md)
[es:Comandos/spawnpoint](es:Comandos/spawnpoint.md)
[ja:コマンド/spawnpoint](ja:コマンド/spawnpoint.md)
[pt:Comandos/spawnpoint](pt:Comandos/spawnpoint.md)
[ru:Команды консоли/spawnpoint](ru:Команды консоли/spawnpoint.md)
[uk:Команди консолі/spawnpoint](uk:Команди консолі/spawnpoint.md)