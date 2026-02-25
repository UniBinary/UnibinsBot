# 命令/random

*页面ID: 105135* | *来源: Minecraft Wiki*

roll) <range>}}）<br>2（仅其他语法）
}}

生成一个随机值，或控制存储的[随机序列](随机序列.md)。随机值呈均匀分布。

# 语法

   <code>random (value|roll) <range></code>
  : 输出一个随机数。此处没有设置随机序列，随机数将由世界的默认随机源产生。

   <code>random (value|roll) <range> <sequence></code>
  : 输出由指定随机序列产生的随机数。若指定的随机序列不存在，则使用存档中文件所设置的参数现场创建一个随机序列。

   <code>random reset *</code>
  : 移除世界中的所有随机序列。当被战利品表调用时，会使用存档中<samp>random_sequences.dat</samp>文件所设置的参数创建一个随机序列。

   <code>random reset * <seed> [<includeWorldSeed>]</code>
   <code>random reset * <seed> <includeWorldSeed> [<includeSequenceId>]</code>
  : 移除世界中的所有随机序列，并设置存档<samp>random_sequences.dat</samp>文件中的相应参数。如果未在世界中执行过<code>/random reset * ...</code>命令，则依次拥有默认值<code>0</code>、<code>true</code>、<code>true</code>。

   <code>random reset <sequence></code>
  : 使用存档<samp>random_sequences.dat</samp>文件所设置的参数移除并重新创建一个随机序列。如果指定的序列不存在，则现场创建1个随机序列。

   <code>random reset <sequence> [<seed>]</code>
   <code>random reset <sequence> <seed> [<includeWorldSeed>]</code>
   <code>random reset <sequence> <seed> <includeWorldSeed> [<includeSequenceId>]</code>
  : 使用命令所指定的参数移除并重新创建一个随机序列，且不改变存档<samp>random_sequences.dat</samp>文件中的相应参数。如果指定的序列不存在，则现场创建1个随机序列。

# 参数
roll}}
   在产生随机数值时，是否把结果通知给其他玩家。若为，结果将仅显示给执行玩家。若为，则结果对所有玩家可见。

   指定随机值的生成范围。其可能产生的数值个数必须在2到2147483646之间。如果上下-{}-界未被指定，则将分别假定为2147483647和-2147483648。随机数呈均匀分布。


   指定要使用或重置的[随机序列](随机序列.md)的[命名空间ID](命名空间ID.md)。对于roll...}}是可选的。对于，若为，则重置所有随机序列。如果指定的随机序列不存在，则将现场创建一个随机序列并执行命令。


   用于重置随机序列的种子，将作为盐值传入到随机序列的创建方法中。默认为<code>0</code>。


   当播种随机序列种子时，是否掺入世界种子，默认为<code>true</code>。若为，随机序列将会以同样的方式重置，与世界无关。


   当播种随机序列种子时，是否包含随机序列ID，默认为<code>true</code>。若设为，随机序列的重置结果将一致，与随机序列的ID无关。


# 结果

roll) ...|可能产生的数值个数小于2或大于2147483646时|fail}}

# 输出

roll) ... |执行成功|1|1|所抽取的随机值}}

# 示例
* 生成一个范围介于0到100的随机数，且结果仅显示给执行玩家：<code>/random value 0..100</code>
* 生成一个范围介于5到10的随机数，并将值存储到<code>player</code>的<code>score</code>记分项中：<code>/execute store result score player score run **random** value 5..10</code>
* 生成一个大于等于1000的随机数，且结果对所有玩家可见，并使用随机序列<code>minecraft:blocks/acacia_leaves</code>：<code>/random roll 1000.. minecraft:blocks/acacia_leaves</code>
* 重置所有随机序列：<code>/random reset *</code>
* 重置随机序列<code>minecraft:entities/creeper</code>，使用种子0，不考虑世界种子，考虑随机序列ID：<code>/random reset minecraft:entities/creeper 0 false true</code>

# 历史

|。}}
}}

# 导航

[de:Befehl/random](de:Befehl/random.md)
[en:Commands/random](en:Commands/random.md)
[ja:コマンド/random](ja:コマンド/random.md)
[pt:Comandos/random](pt:Comandos/random.md)
[ru:Команды консоли/random](ru:Команды консоли/random.md)