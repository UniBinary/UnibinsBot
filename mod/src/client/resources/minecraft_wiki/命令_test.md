# 命令/test

*页面ID: 139196* | *来源: Minecraft Wiki*

中功能相似的命令|命令/gametest}}

管理和运行[游戏测试](游戏测试.md)。

# 语法
   <code>test (clearall [<radius>]|clearthat|clearthese)</code>
  : 清除测试的结构和方块。
   <code>test create <id> [<width>] [<height> <depth>]</code>
  : 创建测试。
   <code>test locate <tests></code>
  : 在已加载区块中寻找测试的位置。
   <code>test pos [<nowiki><var></nowiki>]</code>
  : 在半径250格内寻找并显示准星所指方向10格内第一个方块处对于测试的局部坐标。
   <code>test (resetclosest|resetthat|reseetthese)</code>
  : 重置测试结构。
   <code>test run <tests> [<numberOfTimes>] [<untilFailed>] [<rotationSteps>] [<testsPerRow>]</code>
   <code>test (runclosest|runthat|runthese) [<numberOfTimes>] [<untilFailed>]</code>
   <code>test runmultiple <tests> [<amount>]</code>
  : 运行一个或多个测试。
   <code>test runfailed [<numberOfTimes>] [<untilFailed>] [<rotationSteps>] [<testsPerRow>]</code>
   <code>test runfailed [<onlyRequiredTests>] [<numberOfTimes>]</code>
  : 运行已失败的测试。
   <code>test stop</code>
  : 停止所有测试。
   <code>test verify <tests></code>
  : 验证测试。
   <code>test (export <test>|exportclosest|exportthat|exportthese)</code>
  : 导出测试结构。仅在[IDE](wzh:集成开发环境.md)中可用。

# 参数

   对指定半径内的所有测试进行清除。

   分别对半径15格内最近的测试进行重置、运行和导出。

   分别对准星所指处的测试进行清除、重置、运行和导出。

   分别对半径250格内所有的测试进行清除、重置、运行和导出。

   指定清除的半径。默认为250。


   指定测试的ID。


   指定测试结构的宽度。默认为5。


   指定测试结构的高度。默认为的值。


   指定测试结构的深度。默认为的值。


   指定测试的ID。


   指定复制代码段中使用的变量名。默认为。


   指定每个测试在不同批次内的重复次数。默认为1。


   指定测试是否应该在一次迭代失败后立即停止。默认为。


   指定测试的额外90度旋转步数。默认为0。


   指定在网格布局中每行放置的测试数量。默认为8。


   指定每个测试在同一批次内的重复次数。默认为1。


   指定是否仅需必要测试。默认为。


   指定测试的ID。


# 结果

大于48}}

</ref>}}

# 输出

<!--
  MC-300831 -->

# 历史

|命令，仅在[IDE](wzh:集成开发环境.md)中可用。}}
|命令在游戏内可用。}}
|
}}

# 画廊
<gallery>
File:Command test pos effect.png|的执行效果
</gallery>

# 参考

# 导航

[de:Befehl/test](de:Befehl/test.md)
[en:Commands/test](en:Commands/test.md)
[ja:コマンド/test](ja:コマンド/test.md)
[pt:Comandos/test](pt:Comandos/test.md)
[ru:Команды консоли/test](ru:Команды консоли/test.md)