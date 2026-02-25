# 命令/testforblocks

*页面ID: 39827* | *来源: Minecraft Wiki*

测试两个区域中的方块是否相同。返回匹配方块的总数量（<code>all</code>模式下所有方块的数量，或<code>masked</code>模式下的源区域非空气方块的数量）。

# 语法
   <code>testforblocks <begin: x y z> <end: x y z> <destination: x y z> [masked|all]</code>

# 参数
   <code>begin: x y z</code>与<code>end: x y z</code>
  : 指定作为样式基准的区域（源区域）的两个对角方块。*x1*、*z1*、*x2*及*z2*必须在[-30,000,000和30,000,000](世界边界.md)之间（含，不输入逗号），且*y1*及*y2*必须在-64和319之间（含）。可以使用波浪号来指定基于命令执行位置的[相对坐标](相对坐标.md)或使用脱字符来指定基于命令执行者的位置和角度的[局部坐标](局部坐标.md)。源区域中的方块数量不能超过786,432个。

   <code>destination: x y z</code>
  : 指定待检查区域（目标区域）的下西北角（具有最小坐标值的边角）。*x*和*z*必须在[-30,000,000和30,000,000](世界边界.md)之间（含，不输入逗号），且*y*必须在-64和319之间（含）。可以使用波浪号来指定基于命令执行位置的[相对坐标](相对坐标.md)。源区域和目标区域可以重叠。

   <code>masked|all</code>（可选）
  : 指定测试模式。必须为下列其中之一：
  :* <code>all</code> — 两个区域的所有方块必须完全相同。
  :* <code>masked</code> — 源区域的[空气](空气.md)方块可匹配目标区域的任意方块。
  : 若未指定，默认为<code>all</code>。

# 结果

# 输出

# 示例
* 检测(36,64,68)至(37,68,70)处是否与坐标(36,64,72)至(37,68,74)处完全相同：
* 检测(36,64,68)至(37,68,70)处的非空气方块是否与坐标(36,64,72)至(37,68,74)处相同：

# 历史

|。}}
|，并加入取代其功能。}}

|
|。}}
}}
<!-- 请留两空行以分隔段落 -->

# 导航

[de:Befehl/testforblocks](de:Befehl/testforblocks.md)
[en:Commands/testforblocks](en:Commands/testforblocks.md)
[es:Comandos/testforblocks](es:Comandos/testforblocks.md)
[ja:コマンド/testforblocks](ja:コマンド/testforblocks.md)
[pt:Comandos/testforblocks](pt:Comandos/testforblocks.md)
[ru:Команды консоли/testforblocks](ru:Команды консоли/testforblocks.md)