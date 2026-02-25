# 命令/clone

*页面ID: 39642* | *来源: Minecraft Wiki*

在指定区域之间复制方块结构。

# 语法
* **Java版**
   <code>clone ... </code>
   <code>clone from <sourceDimension> ... </code>
  : <code>... <begin> <end> ...</code>
  :: <code>... <destination> ...</code>
  :: <code>... to <targetDimension> <destination> ...</code>
  ::: <code>... [replace|masked]</code>
  ::: <code>... (replace|masked) [force|move|normal]</code>
  ::: <code>... filtered <filter> [force|move|normal]</code>
  ::: <code>... strict ...</code>
  :::: <code>... [replace|masked]</code>
  :::: <code>... (replace|masked) [force|move|normal]</code>
  :::: <code>... filtered <filter> [force|move|normal]</code>

* **基岩版**
   <code>clone <begin: x y z> <end: x y z> <destination: x y z> [maskMode: MaskMode]</code>
   <code>clone <begin: x y z> <end: x y z> <destination: x y z> <maskMode: MaskMode> [cloneMode: CloneMode]</code>
   <code>clone <begin: x y z> <end: x y z> <destination: x y z> filtered <cloneMode: CloneMode> <tileName: Block> [blockStates: block states]</code>

# 参数
：和<br>
：和
   定义源区域的两组对角方块坐标。
   构成边角的方块在此方块的坐标正方向上延伸。因此，各轴上较小的坐标将会正好贴合区域边界，但较大的坐标将会超过边界1方块，源区域的体积则为(x<sub>大</sub> - x<sub>小</sub> + 1) × (y<sub>大</sub> - y<sub>小</sub> + 1) × (z<sub>大</sub> - z<sub>小</sub> + 1)。例如：<code>0 0 0 0 0 0</code>的体积为1方块，<code>0 0 0 1 1 1</code>与<code>1 1 1 0 0 0</code>都指定同一块8方块大小的区域。


   定义目标区域的西北方向较低（即在各轴上坐标值最小）的点的坐标，游戏会根据<code><begin></code>与<code><end></code>的坐标算出目标区域的范围。


：masked}}<br>
：
   指定是否过滤被复制方块。必须为下列之一：
  * <code>masked</code> — 仅复制非空气方块。会保持目的区域中原本会被替换为空气的方块不变。
  * <code>replace</code> — 复制所有方块，用源区域的方块覆盖目标区域中的*所有*方块。
   若未定义，默认为<code>replace</code>。

：
   使命令在放置方块时不触发自身及紧挨着的方块的方块更新和形状更新。

   使命令只复制指定方块，需要额外指定一个方块。

：movenormal}}<br>
：
   指定对源区域的操作。必须为下列之一：
  * <code>force</code> — 强制复制，即使源区域与目标区域有重叠。
  * <code>move</code> — 将源区域复制到目标区域，并将源区域替换为空气。在filtered遮罩模式下，只有被复制的方块才会被替换为空气。
  * <code>normal</code> — 不执行force与move。
   若未指定，默认为<code>normal</code>。

   指定在<code>filtered</code>模式下时要复制的方块ID


：
   指定复制区域的来源维度。


：
   指定复制区域的目的维度。


：
   指定复制时需要符合的方块状态。


# 结果

导致的计算误差，实际方块数量上限最大可为655361×2×2=2621444。</ref>或<br>的设定值}}

</ref>||N/A}}

<ref name="barrier"/>||fail}}

# 输出

# 示例
[thumb|模式类似于使用结构空位替换结构方块选区中的空气方块，复制后的目标区域（右）将会忽略这些方块](File:Clone Command Masked Mode Example.png.md)
* 以某位置为原点，形成XYZ轴长度分别为3格、5格、3格的源区域，复制到距离原点Z轴正方向4格的目标区域（如图，左侧两紫色方块决定源区域，右侧黄色方块决定目标区域位置）：
* 如图，复制左侧区域到右侧，使用模式以防止右侧树木的下的花和灯笼被替换为空气：
* 移动源区域到目标区域（使用除去源区域中的空气方块，即复制后清除源区域）：
* 根据当前执行位置，选择相应的下界源区域并复制到主世界目标区域：<syntaxhighlight lang="mcfunction">/execute in minecraft:the_nether run clone from minecraft:the_nether ~ ~ ~ ~ ~ ~ to minecraft:overworld ~ ~ ~</syntaxhighlight>

# 历史

|命令。}}
|选项。}}
|选项。}}
|的语法。}}
|游戏规则控制单次执行可更改的最大方块数。}}
|选项。}}
|
|命令。
|命令不能使用克隆模式。}}
|
|中对[方块状态](方块状态.md)的支持。}}
|
|命令可更改的最大方块数现在为655360。}}
|参数。}}
|参数现在为可选项。}}
}}

# 参见
*  — 用一类方块填充整个区域

# 参考

# 导航

[de:Befehl/clone](de:Befehl/clone.md)
[en:Commands/clone](en:Commands/clone.md)
[es:Comandos/clone](es:Comandos/clone.md)
[ja:コマンド/clone](ja:コマンド/clone.md)
[ko:명령어/clone](ko:명령어/clone.md)
[pt:Comandos/clone](pt:Comandos/clone.md)
[ru:Команды консоли/clone](ru:Команды консоли/clone.md)
[uk:Команди консолі/clone](uk:Команди консолі/clone.md)