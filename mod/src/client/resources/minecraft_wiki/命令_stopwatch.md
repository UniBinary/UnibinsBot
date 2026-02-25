# 命令/stopwatch

*页面ID: 168318* | *来源: Minecraft Wiki*

可创建一个新的秒表并查询其记录的现实时间，不受影响。相关存储格式参见。

# 语法
   <code>stopwatch create <id></code>
  : 创建新的秒表。
   <code>stopwatch query <id> [<scale>]</code>
  : 查询指定的秒表的时间，以秒为单位（精确到小数点后3位）。如果给定<code><scale></code>参数，则将时间值乘以<code><scale></code>向下取整后返回。
   <code>stopwatch restart <id></code>
  : 重置指定的秒表的时间。
   <code>stopwatch remove <id></code>
  : 移除指定的秒表。

# 参数

   指定秒表的ID。


   <code>/stopwatch query ...</code>的返回值乘数，默认为1。


# 结果

# 输出

# 你知道吗
* 该命令之所以被添加，是为了取代之前版本中使用来测量现实时间流逝的方法。

# 历史

|。}}
|{{HistoryLine|||dev=25w42a|修改了<code><id></code>参数的位置，先前格式为<code>-{}-/stopwatch <id> <*操作*></code>而不是<code>-{}-/stopwatch <*操作*> <id></code>。
|向<code>query</code>子命令添加了可选参数<code>scale</code>，为返回值的乘数。
|<code>query</code>子命令现在返回秒表的时间乘以乘数，先前只返回<code>1</code>。}}
}}

# 导航

[de:Befehl/stopwatch](de:Befehl/stopwatch.md)
[en:Commands/stopwatch](en:Commands/stopwatch.md)
[ja:コマンド/stopwatch](ja:コマンド/stopwatch.md)
[pt:Comandos/stopwatch](pt:Comandos/stopwatch.md)