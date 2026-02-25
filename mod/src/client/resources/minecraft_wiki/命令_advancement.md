# 命令/advancement

*页面ID: 39638* | *来源: Minecraft Wiki*

给予或移除玩家的[进度](进度.md)或某一进度的一项[准则](进度定义格式#准则.md)（Criterion）。

# 语法
   <code>advancement (grant|revoke) <targets> everything</code>
  : 授予（grant）或移除（revoke）玩家的全部已载入进度。
   <code>advancement (grant|revoke) <targets> only <advancement> [<criterion>]</code>
  : 授予或移除玩家指定的进度或进度的一项准则。
   <code>advancement (grant|revoke) <targets> from <advancement></code>
  : 授予或移除玩家指定进度及其下游的全部进度。
  : 进度的遍历顺序是<code>-{}-指定进度 > 下游进度 > 下游进度的下游进度 > ……</code>，以[DFS](wzh:深度优先搜索.md)遍历（即优先列举节点的子节点，而后才列举节点的兄弟节点）。
   <code>advancement (grant|revoke) <targets> through <advancement></code>
  : 授予或移除玩家指定进度及其全部上游和下游进度。
  : 进度的遍历顺序是<code>until</code>和<code>from</code>的结合，首先进行<code>until</code>，然后进行<code>from</code>，即<code>-{}-上游进度 > 上游进度的上游进度 > …… > 根进度 > 指定进度 > 下游进度 > 下游进度的下游进度 > ……</code>。
   <code>advancement (grant|revoke) <targets> until <advancement></code>
  : 授予或移除玩家指定进度及其全部上游进度。
  : 进度的遍历顺序是<code>-{}-上游进度 > 上游进度的上游进度 > …… > 根进度 > 指定进度</code>。

<gallery>
Advancement Command Schematic Diagram.png|黄色为<code>only</code>的影响范围，绿色为<code>through</code>的影响范围，蓝色为<code>from</code>的影响范围，红色为<code>until</code>的影响范围
</gallery>

# 参数

   指定一个或多个玩家。


   指定要给予或移除的[进度](进度.md)识别符。


   指定要授予或移除的[进度准则](进度定义格式#准则.md)。
   若未指定，授予或移除整个进度。
   若指定，只授予或移除进度中指定的这条准则，而不是整个进度。


# 结果

对不可用}}

# 输出

# 示例
* 授予自己“”进度：<code>advancement grant @s only minecraft:story/shiny_gear</code>
* 授予所有玩家所有进度：<code>advancement grant @a everything</code>

# 历史

|命令。}}
|的用法，以应对实体选择器的修改。}}
|不再抛出未处理的异常。}}
}}

# 参见
* [游戏规则/show_advancement_messages](游戏规则/show_advancement_messages.md)
* [进度](进度.md)

# 导航

[de:Befehl/advancement](de:Befehl/advancement.md)
[en:Commands/advancement](en:Commands/advancement.md)
[es:Comandos/advancement](es:Comandos/advancement.md)
[ja:コマンド/advancement](ja:コマンド/advancement.md)
[lzh:令/advancement](lzh:令/advancement.md)
[nl:Opdrachten/advancement](nl:Opdrachten/advancement.md)
[pt:Comandos/advancement](pt:Comandos/advancement.md)
[ru:Команды консоли/advancement](ru:Команды консоли/advancement.md)
[uk:Команди консолі/advancement](uk:Команди консолі/advancement.md)