# 命令/function

*页面ID: 39783* | *来源: Minecraft Wiki*

运行[函数](函数.md)。

# 用法
运行1个[函数](Java版函数.md)或者[数据包](数据包.md)内1个[函数标签](Java版标签/函数.md)的所有函数。运行[行为包](行为包.md)内的1个[函数](基岩版函数.md)。

函数中的[命令上下文](命令上下文.md)参数（如执行者、执行位置、执行朝向等）直接继承所在的命令上下文。

（或）的行为不同于直接调用命令。如果运行了多个函数，整个执行会在任意函数首次执行后停止。如果直接调用运行多个函数，所有的函数都会执行，且返回值会累加起来后作为该命令的<code>result</code>输出值。

# 语法
* **Java版**:
   <code>function <name></code>
  : 运行一个函数或一个函数标签中的函数。
   <code>function <name> <arguments></code>
   <code>function <name> with (block <sourcePos>|entity <source>|storage <source>) [<path>]</code>
  : 运行一个函数或一个函数标签中的函数，并使用一个NBT复合标签提供用于[宏](Java版函数#宏.md)的参数。

* **基岩版**
   <code>function <name: filepath></code>
  : 运行一个函数。

# 参数

   指定要执行的函数或函数标签。


：
   包含所有变量和对应值的[NBT](NBT.md)复合标签。


：
   指定要使用其NBT数据的[方块实体](方块实体.md)的坐标。


：（仅模式）
   指定要使用其NBT数据的实体。


：（仅模式）
   指定要使用其NBT数据的[命令存储](命令存储.md)。


：
   指定要使用的NBT标签的[NBT路径](NBT路径.md)。路径所表示的标签应为单个复合标签。


# 结果

</ref>|fail|fail}}

}}

命令被执行|Void}}
命令返回的成败标志为“失败”|fail}}
命令被执行|Void}}

# 输出
对于：

命令后会终止整个执行过程）}}

其他情况下：

：

# 示例
* Java版中：
* * 运行<code>data/custom/functions/example/test.mcfunction</code>处的函数：
* * 运行所有<code>data/custom/tags/functions/example/test.json</code>标签下的函数：
* * 执行某个宏函数时传入参数a=42，b="example"：<code>/function custom:example/test {a: 42, b: "example"}</code>
* * 执行某个宏函数时传入来自命令存储<code>custom:storage</code>的参数：<code>/function custom:example/test with custom:storage</code>

# 历史

|。}}
|命令加入了条件语句<code>[ifunless] [*selector*]</code>}}
|
|现在接受数据包的标签作为其参数。
|因unless)}}的存在而移除了unless]}}条件语句。}}
|现在允许传递NBT作为参数。}}
|不再输出执行命令的个数，以适应新的命令。}}
|命令由执行，现在整个命令会在任意一个函数首次执行命令后结束执行。
|使用执行命令时，命令执行一次后就会返回。例如：会总在首个分支返回。}}
|命令执行带有命令的函数时，输出的<code>success</code>值为1的问题。<ref></ref><ref></ref>}}
|
|。}}
}}

# 参考

# 导航

[de:Befehl/function](de:Befehl/function.md)
[en:Commands/function](en:Commands/function.md)
[es:Comandos/function](es:Comandos/function.md)
[ja:コマンド/function](ja:コマンド/function.md)
[ko:명령어/function](ko:명령어/function.md)
[pt:Comandos/function](pt:Comandos/function.md)
[ru:Команды консоли/function](ru:Команды консоли/function.md)
[uk:Команди консолі/function](uk:Команди консолі/function.md)