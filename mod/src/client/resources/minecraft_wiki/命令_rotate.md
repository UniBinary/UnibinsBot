# 命令/rotate

*页面ID: 126709* | *来源: Minecraft Wiki*

更改[实体](实体.md)的旋转角。

# 用法
<code>rotate <target> <rotation></code>用于直接设置实体的朝向，而<code>rotate ... facing ...</code>用于将一个朝向向量转换为实体的朝向。

为了确定朝向向量，游戏将先从命令上下文中获取[执行锚点](命令上下文#执行锚点.md)，并将该锚点应用到要执行旋转的目标实体上以确定朝向向量的起点，然后再根据命令指定的世界坐标或要面向的实体（带有锚点）以确定朝向向量的终点。向量转换为角度的计算过程类似于。

# 语法
   <code>rotate <target> <rotation></code>
  : 使实体旋转指定角度。
   <code>rotate <target> facing <facingLocation></code>
  : 使实体面向指定的世界坐标。
   <code>rotate <target> facing entity <facingEntity> [<facingAnchor>]</code>
  : 使实体面向指定的实体（可指定实体锚点）。

# 参数

   指定旋转的实体。


   指定旋转角度。


   指定被旋转实体所转向的世界位置坐标。


   指定被旋转实体所转向的实体。


   指定基准点位置，默认为。


# 结果

# 输出

# 示例
让执行者绕Y轴旋转10度：
<syntaxhighlight lang="mcfunction">
rotate @s ~10 ~
</syntaxhighlight>

让最近的1位玩家看向距离执行位置最近的1只绵羊：
<syntaxhighlight lang="mcfunction">
rotate @p facing entity @n[type=minecraft:sheep]
</syntaxhighlight>

将距离执行位置最近的1只绵羊的朝向赋给最近的1位玩家：
<syntaxhighlight lang="mcfunction">
execute rotated as @n[type=minecraft:sheep] run rotate @p ~ ~
</syntaxhighlight>

让最近的1位玩家背对距离其最近的嘎枝：
<syntaxhighlight lang="mcfunction">
execute as @p at @s facing entity @n[type=minecraft:creaking] feet run rotate @s facing ^ ^ ^-1
</syntaxhighlight>

# 历史

|命令。}}
|命令需要的权限等级为2，而不是0。<ref>命令需要的权限等级不为2|Fixed}}</ref>}}
}}

# 参考

# 导航

[de:Befehl/rotate](de:Befehl/rotate.md)
[en:Commands/rotate](en:Commands/rotate.md)
[ja:コマンド/rotate](ja:コマンド/rotate.md)
[pt:Comandos/rotate](pt:Comandos/rotate.md)
[ru:Команды консоли/rotate](ru:Команды консоли/rotate.md)