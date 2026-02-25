# 命令/datapack

*页面ID: 39686* | *来源: Minecraft Wiki*

中）
|others=不在[命令方块](命令方块.md)上执行（在中）
}}

管理[数据包](数据包.md)。

注意，功能开关（Feature Flag）只有在创建新的世界时才可以使用数据包开关。若某开关未打开，则需要此功能开关的数据包无法使用该命令启用。

原版数据包的<samp>datapacks</samp>目录下的子数据包若在创建世界时启用，不能使用该命令禁用。

# 语法
   <code>datapack create <id> <description></code>
  : 创建空数据包。创建的数据包默认为禁用状态。
   <code>datapack disable <name></code>
  : 禁用指定数据包。
   <code>datapack enable <name></code>
  : 启用指定数据包。
   <code>datapack enable <name> (first|last)</code>
  : 启用指定数据包，并将它置于所有数据包之前（即优先级最低）或之后（即优先级最高）。
   <code>datapack enable <name> (before|after) <existing></code>
  : 启用指定数据包，并将它置于指定数据包之前（即优先级低于之）或之后（即优先级高于之）。
   <code>datapack list [available|enabled]</code>
  : 列出所有数据包，或仅列出可用/已启用的数据包。将鼠标悬停于数据包名上将显示它们于<code>pack.mcmeta</code>中的描述。

# 参数

   指定要创建的数据包的名称。


   指定要创建的数据包内[](数据包#pack.mcmeta.md)中的值。


   指定数据包名称。


   指定一个已经存在并启用的数据包名称。


# 结果

# 输出

# 示例
* 列出所有数据包：
* 禁用原版数据包，使数据包重新加载：
* 启用原版数据包，使数据包重新加载：

# 历史

|命令。}}
|
|
|子命令。}}
}}

# 导航

[de:Befehl/datapack](de:Befehl/datapack.md)
[en:Commands/datapack](en:Commands/datapack.md)
[es:Comandos/datapack](es:Comandos/datapack.md)
[ja:コマンド/datapack](ja:コマンド/datapack.md)
[pt:Comandos/datapack](pt:Comandos/datapack.md)
[ru:Команды консоли/datapack](ru:Команды консоли/datapack.md)
[th:คำสั่ง/datapack](th:คำสั่ง/datapack.md)