# 命令/time

*页面ID: 39829* | *来源: Minecraft Wiki*

控制或查询世界/[世界时钟](世界时钟.md)的[时间](时间.md)。

# 用法
在游戏正常运行时，内部的计时系统会自动累加[游戏刻](游戏刻.md)数，除非游戏的常规运行逻辑被暂停（例如，打开游戏菜单等界面或使用命令冻结游戏刻，或在维度区块未完成加载时）。
* **游戏时间（GameTime）**：世界存档累计正常运行的游戏刻数。
* **昼夜更替时间（DayTime）**：当游戏规则为<code>true</code>时，世界存档累计正常运行的游戏刻数。

命令中的参数：
* <code>gametime</code>等价于<code>GameTime</code>，不超过整型上限。
* <code>daytime</code>等于<code>DayTime&ensp;% 24000</code>，不超过整型上限。
* <code>day</code>等于<code>DayTime / 24000</code>，不超过整型上限。

<code>/time set ...</code>命令直接将游戏的昼夜更替时间设置为指定的数字。但如果使用参数，只会**增加**昼夜更替时间使其符合对应的当日时间。

例如：
  执行<code>/time set day</code>或<code>/time set 1000</code>命令，都会直接将内部的昼夜更替时间设置为1000，相对应的<code>day</code>被计算为0。
  执行<code>/time set 1000</code>命令也会将昼夜更替时间设为1000。但对于<code>/time set day</code>命令，例如如果当前昼夜更替时间为25001（1游戏日+1001游戏刻），执行后不会变为25000或1000，因为使用参数只能使昼夜更替时间增加，所以实际上会变为49000（2游戏日+1000游戏刻），因而游戏天数变为2。如果当前昼夜更替时间为25000（1游戏日+1000游戏刻），执行<code>/time set day</code>后，其保持25000不变。

# 语法
* ****
   <code>time add &lt;time></code>
  : 增加昼夜更替时间。影响所有维度，并立即强制将时间同步到所有客户端。
   <code>time query (daytime|gametime|day)</code>
  : 查询当前的时间，可以查询当日时间、游戏时间或游戏天数。
   <code>time set (day|night|noon|midnight)</code>
   <code>time set &lt;time></code>
  : 设置昼夜更替时间。影响所有维度，并立即强制将时间同步到所有客户端。

* ****
   <code>time of <clock> add &lt;time></code>
   <code>time add &lt;time></code>
  : 增加世界时钟的昼夜更替时间，并立即强制将时间同步到所有客户端。
   <code>time of <clock> pause</code>
   <code>time pause</code>
  : 暂停世界时钟。
   <code>time query gametime</code>
  : 查询整个世界经过的总[刻](刻.md)数。
   <code>time of <clock> query time</code>
   <code>time query time</code>
  : 查询世界时钟经过的总刻数。
   <code>time of <clock> query &lt;timeline> repetition</code>
   <code>time query &lt;timeline> repetition</code>
  : 查询使用此世界时钟的时间线所经过的周期数。
   <code>time of <clock> query &lt;timeline></code>
   <code>time query &lt;timeline></code>
  : 查询使用此世界时钟的时间线在本周期所经过的刻数。
   <code>time of <clock> resume</code>
   <code>time resume</code>
  : 取消暂停世界时钟。
   <code>time of <clock> set &lt;time></code>
   <code>time of <clock> set <timemarker></code>
   <code>time set &lt;time></code>
   <code>time set <timemarker></code>
  : 设置世界时钟的昼夜更替时间，并立即强制将时间同步到所有客户端。

* **基岩版**
   <code>time add <amount: int></code>
  : 增加昼夜更替时间。
   <code>time query <daytime|gametime|day></code>
  : 查询当前的时间，可以查询当日时间、游戏时间或游戏天数。
   <code>time set <amount: int></code>
   <code>time set &lt;time: TimeSpec></code>
  : 设置昼夜更替时间。

# 参数

   指定要增加或设置的时间。


gametimeday}}<!--
：gametimeday}}-->
   指定要查询的数据。必须为<code>daytime</code>、<code>gametime</code>或<code>day</code>。
  * <code>daytime</code> - 当日时间。
  * <code>gametime</code> - 游戏时间。
  * <code>day</code> - 游戏天数。

：nightnoonmidnight}}<br><!---->
：
   指定要设置的时间节点。
   必须为<code>day</code>、<code>night</code>、<code>noon</code>、<code>midnight</code>、。
  * <code>day</code> = 1,000
  * <code>night</code> = 13,000
  * <code>noon</code> = 6,000
  * <code>midnight</code> = 18,000
  * <code>sunrise</code> = 23,000
  * <code>sunset</code> = 12,000

：
   指定要操作的世界时钟。若未指定，则操作执行维度的默认世界时钟。


：
   指定要设置的时间标记。


：
   指定要查询的时间线。


# 结果

|fail|N/A}}
对于该世界时钟无效}}
且执行维度中没有默认的世界时钟}}

# 输出

<br>或世界时钟经过的总刻数}}

# 示例
   设置昼夜更替时间为1000：<code>time set 1000</code>或<code>time set day</code>或<code>time set 50s</code>

   将昼夜更替时间增加一天：<code>time add 24000</code>或<code>time add 1d</code>或<code>time add 1200s</code>

# 历史

|，现在可以使用<code>add</code>和<code>set</code>语法。}}
|
|现在可在单人游戏里使用。
|现在接受<code>day</code>（值为0）和<code>night</code>（值为12500）。}}
|的值现在是1000，并且的值现在是13000。}}
|，接受的参数是<code>daytime</code>和<code>gametime</code>。}}
|现在接受的值。}}
|加入了选项和。}}
|和，分别用于暂停和取消暂停世界时钟。
|现在基于世界时钟，并且可以指定世界时钟，而不再影响所有维度。
|和的返回值现在是世界时钟经过的总刻数，而不再是当前时间。}}

|
|。}}

|
|会直接设置昼夜更替时间，而不再通过增加来达到指定的当日时间。}}
}}

# 导航

[de:Befehl/time](de:Befehl/time.md)
[en:Commands/time](en:Commands/time.md)
[es:Comandos/time](es:Comandos/time.md)
[ja:コマンド/time](ja:コマンド/time.md)
[pt:Comandos/time](pt:Comandos/time.md)
[ru:Команды консоли/time](ru:Команды консоли/time.md)
[uk:Команди консолі/time](uk:Команди консолі/time.md)