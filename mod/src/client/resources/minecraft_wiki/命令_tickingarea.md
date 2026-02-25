# 命令/tickingarea

*页面ID: 39828* | *来源: Minecraft Wiki*

强制加载区块的命令|强制加载区块的命令|命令/forceload}}

添加、删除或列出[常加载区域](常加载区域.md)。同时最多可以定义10个常加载区域。

# 语法
   <code>tickingarea add <from: x y z> <to: x y z> [name: string] [preload: Boolean]</code>
  : 添加与矩形区域有重叠部分的所有区块组成的常加载区域。
   <code>tickingarea add circle <center: x y z> <radius: int> [name: string] [preload: Boolean]</code>
  : 添加与圆形区域有重叠部分的所有区块组成的常加载区域。
   <code>tickingarea remove <position: x y z></code>
   <code>tickingarea remove <name: string></code>
  : 删除常加载区域。如果指定了名称，则只会删除具有该名称的常加载区域。如果指定了位置，则删除包含这个坐标点的所有常加载区域。
   <code>tickingarea remove_all</code>
  : 删除本维度中所有已定义的常加载区域。
   <code>tickingarea preload <name: string> [preload: Boolean]</code>
   <code>tickingarea preload <position: x y z> [preload: Boolean]</code>
  : 设置或显示常加载区域是否预加载。如果指定了名称，则只会处理具有该名称的常加载区域。如果指定了位置，则处理包含这个坐标点的所有常加载区域。
   <code>-{}-tickingarea list [all-dimensions: AllDimensions]</code>
  : 显示当前维度中的常加载区域。如果指定了可选的所有维度参数，则列出已定义的所有常加载区域。注意，列表中显示的坐标在矩形的情况下被调整为区块的边界，在圆的情况下被调整为区块的中心。

# 参数
Y坐标在识别区块的时候实际上并不需要，因为区块跨越整个世界的垂直高度。但是必须在下面的参数中显示的地方输入Y坐标，它可以是任意值，但总是被储存为0。

或
  指定用于定义矩形常加载区域的两个对角坐标。


  指定用于定义圆形常加载区域的圆心的坐标。


  指定圆形常加载区域的半径作为从中心到圆周的区块数。它只能是从1到4的整数。


  指定常加载区域的可选名称。包含空格的值必须用英文双引号括起来。该名称会显示在常加载区域列表中，可用于删除特定区域或设置和查询特定区域是否预加载。


  指定要选择的常加载区域所包含的坐标。可用于删除特定区域或设置和查询特定区域是否预加载。


  指定常加载区域是否预加载，只能填写<code>false</code>或<code>true</code>。在<code>add</code>语法中若不填则默认为<code>false</code>，在<code>preload</code>语法中若不填则可以查询指定的常加载区域是否预加载。


  指定是否列出所有[维度](维度.md)中的常加载区域。只能填写<code>all-dimensions</code>，如不填则默认为仅显示本维度常加载区域。

# 结果

# 输出

# 示例
* 添加X=0，Z=0至X=63，Z=63的常加载区域：<code>tickingarea add 0 0 0 63 0 63</code>
* 添加以执行者位置为中心半径4个区块的非预加载常加载区域<code>Area1</code>：<code>tickingarea add circle ~ ~ ~ 4 Area1 false</code>
* 删除包含坐标X=0，Z=0的常加载区域：<code>tickingarea remove 0 0 0</code>
* 删除常加载区域<code>Area2</code>：<code>tickingarea remove Area2</code>
* 删除本维度中所有已定义的常加载区域：<code>tickingarea remove_all</code>
* 查询常加载区域<code>Area3</code>是否预加载：<code>tickingarea preload Area3</code>
* 列出本维度中的常加载区域：<code>tickingarea list</code>
* 列出所有维度中的常加载区域：<code>tickingarea list all-dimensions</code>

# 历史

|。}}
|
}}

# 导航

[de:Befehl/tickingarea](de:Befehl/tickingarea.md)
[en:Commands/tickingarea](en:Commands/tickingarea.md)
[es:Comandos/tickingarea](es:Comandos/tickingarea.md)
[ja:コマンド/tickingarea](ja:コマンド/tickingarea.md)
[pt:Comandos/tickingarea](pt:Comandos/tickingarea.md)
[ru:Команды консоли/tickingarea](ru:Команды консоли/tickingarea.md)