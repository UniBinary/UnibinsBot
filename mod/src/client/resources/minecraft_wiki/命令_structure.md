# 命令/structure

*页面ID: 68224* | *来源: Minecraft Wiki*

用于在不使用[结构方块](结构方块.md)的情况下保存或加载结构。

# 语法
   <code>structure save <name: string> <from: x y z> <to: x y z> [saveMode: StructureSaveMode]</code>
   <code>structure save <name: string> <from: x y z> <to: x y z> [includeEntities: Boolean] [saveMode: StructureSaveMode] [includeBlocks: Boolean]</code>
  : 保存一个结构。
   <code>structure load <name: string> <to: x y z> [rotation: Rotation] [mirror: Mirror] [includeEntities: Boolean] [includeBlocks: Boolean] [waterlogged: Boolean] [integrity: float] [seed: string]</code>
   <code>structure load <name: string> <to: x y z> [rotation: Rotation] [mirror: Mirror] [animationMode: StructureAnimationMode] [animationSeconds: float] [includeEntities: Boolean] [includeBlocks: Boolean] [waterlogged: Boolean] [integrity: float] [seed: string]</code>
  : 加载一个结构。
   <code>structure delete <name: string></code>
  : 删除某个储存的结构文件。

# 参数

   指定结构名称。格式应为<code>name</code>或<code>namespace:name</code>。如果未指定命名空间，则默认为<code>mystructure:</code>。

和（保存结构用法）
   定义源区域的两组对角方块坐标。可以使用相对坐标和局部坐标来指定命令执行地的相对距离。

（加载结构用法）
   定义目标区域的西北方向较低（即在各轴上坐标值最小）的点的坐标。


   指定结构的存储位置。必须为以下其中之一：
  * <code>memory</code> - 保存在内存中（默认）
  * <code>disk</code> - 保存至磁盘

   指定是否加载（或保存）结构中的实体，默认为<code>false</code>。


   指定加载（或保存）时是否包括方块，默认为<code>true</code>。


   指定结构旋转的角度。必须为以下其中之一：
  * <code>0_degrees</code> - 不旋转（默认）
  * <code>90_degrees</code> - 按顺时针旋转90度
  * <code>180_degrees</code> - 按顺时针旋转180度
  * <code>270_degrees</code>- 按顺时针旋转270度

   指定结构的镜像模式。必须为以下其中之一：
  * <code>none</code> - 无（默认）
  * <code>x</code> - 沿x轴翻转
  * <code>z</code> - 沿z轴翻转
  * <code>xz</code> - 沿x及z轴翻转

   指定生成结构使用的动画。必须为<code>block_by_block</code>或<code>layer_by_layer</code>。

   指定动画的时长。


   指定结构的完整性（每个方块被加载的概率），根据种子进行加载。
   且应在0到100之间（含）。

   指定种子。如果未指定，则为一个随机值。


   指定生成的含水结构是否正确含水，默认为<code>false</code>。


# 结果

# 输出

# 历史

|。}}
|
|现在可以删除已保存结构列表。}}
|
}}

# 导航

[de:Befehl/structure](de:Befehl/structure.md)
[en:Commands/structure](en:Commands/structure.md)
[es:Comandos/structure](es:Comandos/structure.md)
[ja:コマンド/structure](ja:コマンド/structure.md)
[pt:Comandos/structure](pt:Comandos/structure.md)
[ru:Команды консоли/structure](ru:Команды консоли/structure.md)