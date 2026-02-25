# 命令/teammsg

*页面ID: 39846* | *来源: Minecraft Wiki*

|oplevel=0
}}

给命令的执行者实体所在的[队伍](队伍.md)全体成员发送消息。

# 语法
   <code>-{}-teammsg <message></code>
   <code>-{}-tm <message></code>

# 参数

   指定要显示的信息。

   目标选择器只有在[权限等级](权限等级.md)不低于2时才会被替换为选中的实体的名称。

# 结果

# 输出

# 示例
* 创建一个队伍，并让执行者加入，然后将所有可搜索到的实体名称发送给队伍中的所有实体（信息样式采用[聊天类型](聊天类型.md)）：
   <syntaxhighlight lang=mcfunction>
team add test
team join test @s
teammsg @e
</syntaxhighlight>

# 历史

|。}}
|命令发出的聊天信息现在会被签署。}}
}}

# 导航

[de:Befehl/teammsg](de:Befehl/teammsg.md)
[en:Commands/teammsg](en:Commands/teammsg.md)
[fr:Commandes#teammsg](fr:Commandes#teammsg.md)
[ja:コマンド/teammsg](ja:コマンド/teammsg.md)
[pt:Comandos/teammsg](pt:Comandos/teammsg.md)
[ru:Команды консоли/teammsg](ru:Команды консоли/teammsg.md)