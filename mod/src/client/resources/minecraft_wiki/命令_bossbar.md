# 命令/bossbar

*页面ID: 39640* | *来源: Minecraft Wiki*

用于创建、修改或查询自定义[Boss栏](Boss栏.md)。

# 语法
  <code>bossbar add <id> <name></code>
  :创建新的自定义Boss栏（储存在[level.dat](level.dat.md)的<code>CustomBossEvents</code>中）。
  <code>bossbar get <id> (max|players|value|visible)</code>
  :显示指定设置项目的当前值，也可被储存。
  <code>bossbar list</code>
  :显示当前所有的自定义Boss栏。
  <code>bossbar remove <id></code>
  :移除一个自定义Boss栏。
  <code>bossbar set <id> (color|max|name|players|style|value|visible)</code>
  :<code>... color (blue|green|pink|purple|red|white|yellow)</code>
  ::设置文本默认颜色（可被[文本组件](文本组件.md)指定的颜色覆盖）和自定义Boss栏的颜色。刚创建时为<code>white</code>。
  :<code>... max <max></code>
  ::设置自定义Boss栏的最大值。刚创建时为<code>100</code>。
  :<code>... name <name></code>
  ::设置自定义Boss栏的名称。
  :<code>... players [<targets>]</code>
  ::修改可以看到此自定义Boss栏的玩家。刚创建时没有玩家可以看到。
  :<code>... style (notched_6|notched_10|notched_12|notched_20|progress)</code>
  ::设置自定义Boss栏在视觉上分成几段，分别为：6段、10段、12段、20段和连续。刚创建时为<code>progress</code>。
  :<code>... value <value></code>
  ::设置自定义Boss栏的当前值。刚创建时为<code>0</code>。
  :<code>... visible <visible></code>
  ::设置自定义Boss栏的可见性值。刚创建时为<code>true</code>。

# 参数

   指定一个Boss栏。


  : 指定Boss栏的名称。


  : 指定Boss栏的最大值。


  : 指定哪些玩家可以看见Boss栏。


  : 指定Boss栏的当前值。


  : 指定Boss栏的可见性。


# 结果

# 输出

# 示例
* 创建一个新的名称为“name”、ID为<code>foo:bar</code>的自定义Boss栏：<code>/bossbar add foo:bar "name"</code>
* 获取ID为<code>foo:bar</code>的自定义Boss栏现在是否可见：<code>/bossbar get foo:bar visible</code>
* 显示当前所有的自定义Boss栏：<code>/bossbar list</code>
* 将ID为<code>foo:bar</code>的自定义Boss栏改为可见：<code>/bossbar set foo:bar visible true</code>
* 移除ID为<code>foo:bar</code>的自定义Boss栏：<code>/bossbar remove foo:bar</code>

# 历史

|命令。}}
}}

# 导航

[de:Befehl/bossbar](de:Befehl/bossbar.md)
[en:Commands/bossbar](en:Commands/bossbar.md)
[es:Comandos/bossbar](es:Comandos/bossbar.md)
[ja:コマンド/bossbar](ja:コマンド/bossbar.md)
[pt:Comandos/bossbar](pt:Comandos/bossbar.md)
[ru:Команды консоли/bossbar](ru:Команды консоли/bossbar.md)
[uk:Команди консолі/bossbar](uk:Команди консолі/bossbar.md)