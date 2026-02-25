# 命令/debug

*页面ID: 39687* | *来源: Minecraft Wiki*

开始或结束刻分析器或对[函数](Java版函数.md)进行调试。

# 语法
   <code>debug start</code>
  : 开始新的刻分析器会话。
   <code>debug stop</code>
  : 结束正在运行的刻分析器会话。
   <code>debug function <name></code>
  : 执行函数，并获取执行函数时的详细信息。注意此命令不能被或另一个调用或间接调用。

# 参数



# 结果

或之前的引起的}}

# 输出

# 文件结果
# = 函数调试 =
会产生一个txt文件，文件名为**debug-trace-yyyy-MM-dd_HH.mm.ss.txt**，位于目录下。

在此文件中：
* <code>[C] <*command*></code>表示<code><*command*></code>被执行。
* <code>[M] <*message*></code>表示命令返回了一条消息。
* <code>[E] <*message*></code>表示命令返回了一条失败的消息。
* <code>[R = <*num*>] <*command*></code>表示<code><*command*></code>返回了一个**[Brigadier](Brigadier.md)返回值**。
* <code>[C] <*command*> -> <*num*></code>表示<code><*command*></code>被执行并返回了一个**Brigadier返回值**.
* <code>[F] <*function*> size=<*num*></code>表示一个函数被调用。

对于大多数命令，其**Brigadier返回值**等于其可被<code>/execute store result</code>储存的<code>result</code>值。

但对于带有以下任意子命令的<code>/execute ...</code>，其每个分支都返回一个**Brigadier返回值**，如果该分支末尾的命令执行成功则为1，否则为0:
* <code>... if ...</code>（不在命令末尾）
* <code>... unless ...</code>（不在命令末尾）
* <code>... as <targets> ...</code>
* <code>... at <targets> ...</code>
* <code>... positioned as <targets> ...</code>
* <code>... rotated as <targets> ...</code>
* <code>... facing entity <targets> <anchor> ...</code>

<code>/return</code>、<code>/function</code>等命令没有**Brigadier返回值**。

# 历史

|命令。}}
|现在可以在单人游戏中运行。|加入了。}}
|。}}
|
|，用来在调试性能时获得更多细节信息。}}
|。}}
|并被和所替代。}}
|的<code>result</code>值变为指定函数中命令的总数。
|现在不可被调用。}}
|不可被调用。}}
}}

# 导航

[de:Befehl/debug](de:Befehl/debug.md)
[en:Commands/debug](en:Commands/debug.md)
[ja:コマンド/debug](ja:コマンド/debug.md)
[pt:Comandos/debug](pt:Comandos/debug.md)
[ru:Команды консоли/debug](ru:Команды консоли/debug.md)