# 命令/gametest

*页面ID: 79377* | *来源: Minecraft Wiki*

中功能相似的命令|命令/test}}

管理和运行[游戏测试框架](游戏测试#基岩版.md)。

# 语法
   <code>gametest runthis</code>
  : 执行或重新执行15格半径内的测试结构。
   <code>gametest run <testName: string> <stopOnFailure: Boolean> <repeatCount: int> [rotationSteps: int]</code>
   <code>gametest run <testName: string> [rotationSteps: int]</code>
  : 执行一个特定的测试。
   <code>gametest runsetuntilfail [tag: string] [rotationSteps: int]</code>
  : 创建和执行所有测试，直到某个执行失败。
   <code>gametest runset [tag: string] [rotationSteps: int]</code>
  : 创建和执行所有测试。
   <code>gametest clearall</code>
  : 清除所有的测试。
   <code>gametest pos</code>
  : 在200格半径范围内寻找最近的测试结构。
   <code>gametest stopall</code>
  : 停止执行所有测试。
   <code>gametest create <testName: string> [width: int] [height: int] [depth: int]</code>
  : 创建测试。
   <code>gametest runthese</code>
  : 在200格半径范围内执行测试。

# 参数

   指定测试的名称。


   指定测试的执行次数。
   且必须大于0。



   指定测试的旋转角度。
   1为顺时针旋转90度；2为顺时针旋转180度；3为顺时针旋转270度。其他值不会使测试旋转。


   指定要执行的测试的名称。


   指定结构的X轴大小。默认为5。


   指定结构的Y轴大小。默认为5。


   指定结构的Z轴大小。默认为5。


# 结果

# 输出

# 历史

|。}}
|命令重命名为。}}
|命令的参数。}}
|不再属于[实验性玩法](实验性玩法.md)。}}
|语法。}}
}}

# 导航

[de:Befehl/gametest](de:Befehl/gametest.md)
[en:Commands/gametest](en:Commands/gametest.md)
[ja:コマンド/gametest](ja:コマンド/gametest.md)
[lzh:令/gametest](lzh:令/gametest.md)
[pt:Comandos/gametest](pt:Comandos/gametest.md)
[ru:Команды консоли/gametest](ru:Команды консоли/gametest.md)