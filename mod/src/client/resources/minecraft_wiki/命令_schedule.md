# 命令/schedule

*页面ID: 39858* | *来源: Minecraft Wiki*

计划执行函数。

# 用法
在经过指定的时间后执行一个[函数](Java版函数.md)或一个[函数标签](Java版标签/函数.md)中的所有函数。

在指定的区域全部被加载时执行一个[函数](基岩版函数.md)。

同一个函数或同一个函数标签不能有在同一个时间执行的两个计划。

使用<code>replace</code>模式，在一个函数或函数标签已有未执行的计划时，直接覆盖此计划。例如，如果计划5秒后执行一个函数，在五秒内要修改执行时间，可以使用<code>replace</code>模式设置新计划覆盖原计划。

计划的函数以服务端为执行者执行，执行位置为[世界出生点](世界出生点.md)。

# 语法
* **Java版**
   <code><nowiki>schedule function <function> <time> [append|replace]</nowiki></code>
  : 指定函数在<code><nowiki><time></nowiki></code>时间后运行。
   <code>schedule clear <function></code>
  : 将之前指定的函数从计划中移除。
* **基岩版**
   <code><nowiki>schedule delay add <function: filepath> <time: int> [replace|append]</nowiki></code>
   <code><nowiki>schedule delay add <function: filepath> <time: int>D [replace|append]</nowiki></code>
   <code><nowiki>schedule delay add <function: filepath> <time: int>S [replace|append]</nowiki></code>
   <code><nowiki>schedule delay add <function: filepath> <time: int>T [replace|append]</nowiki></code>
  : 将指定函数延时运行。
   <code>schedule on_area_loaded add <from: x y z> <to: x y z> <function: filepath></code>
   <code>schedule on_area_loaded add circle <center: x y z> <radius: int> <function: filepath></code>
   <code>schedule on_area_loaded add tickingarea <name: string> <function: filepath></code>
  : 当指定区域被加载后，执行所计划的函数。
   <code>schedule clear <function: filepath></code>
   <code>schedule on_area_loaded clear function <function: filepath></code>
   <code>schedule on_area_loaded clear tickingarea <name: string> [function: filepath]</code>
   <code>schedule delay clear <function: filepath></code>
  : 将之前指定的函数从计划中移除。

# 参数

   指定要计划运行的函数。


   指定等待的时间。为0时执行失败。


：（对于）
   指定要从计划中移除的函数。应为一个函数或函数标签的命名空间ID（都必须写明前缀<code>minecraft:</code>）。


：<code>append|replace</code><br>
：<code>replace|append</code>
   指定是否取代还在等待执行的函数或函数标签。
  * <code>append</code> —— 为此函数或函数标签添加新的计划。
  * <code>replace</code> —— （默认值）取代此函数或函数标签的现有计划。

：和
   指定用于定义矩形加载区域的两个对角坐标。

   小于-30,000,000或大于30,000,000的<code>x</code>和<code>z</code>坐标会被视为-30,000,000或30,000,000。

：
   指定用于定义圆形加载区域的圆心的坐标。

   小于-30,000,000或大于30,000,000的<code>x</code>和<code>z</code>坐标会被视为-30,000,000或30,000,000。

：
   指定圆形常加载区域的半径作为从中心到圆周的区块数。
   应为从0到2,147,483,647之间的整数。

：
   指定常加载区域的名称。当此常加载区域被添加时执行函数。
   必须为1个完整的单词（无空格）或1个被引号包围的字符串。

# 结果

# 输出

# 示例
* 在3秒后运行函数<code>foo:bar</code>：<code>schedule function foo:bar 3s</code>

* 在5天后运行标签<code>foo:bar</code>里的函数：<code>schedule function #foo:bar 5d</code>

* 在名称为<code>temp</code>的常加载区域被添加时运行函数<code>a</code>：<code>schedule on_area_loaded add tickingarea temp a</code>

# 历史

|。}}
|语法和可选的参数（默认为）。}}
|
|。}}
|
|
}}

# 导航

[de:Befehl/schedule](de:Befehl/schedule.md)
[en:Commands/schedule](en:Commands/schedule.md)
[es:Comandos/schedule](es:Comandos/schedule.md)
[ja:コマンド/schedule](ja:コマンド/schedule.md)
[pt:Comandos/schedule](pt:Comandos/schedule.md)
[ru:Команды консоли/schedule](ru:Команды консоли/schedule.md)