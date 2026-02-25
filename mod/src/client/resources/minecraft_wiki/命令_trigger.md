# 命令/trigger

*页面ID: 39835* | *来源: Minecraft Wiki*

修改命令执行者玩家在一个[准则](记分板#准则.md)为“触发器”的[记分项](记分板#记分项.md)上的分数。此命令使得非管理员玩家能够通过记分板激活管理员或地图制作者设计的系统，一般配合[文本组件](文本组件.md)使用。

# 语法
<code>trigger <objective></code>
   将执行者的分数增加1。
<code>trigger <objective> add <value></code>
   将执行者的分数增加指定的<code><value></code>数值。
<code>trigger <objective> set <value></code>
   将执行者的分数设置为指定的<code><value></code>数值。

# 参数

   指定一个已启用的、准则为“触发器”的记分项。


   指定要设为或要增加的数值。


# 结果

# 输出

# 示例
* 高频执行，设定触发型记分项并为所有玩家开启触发权限。
   <syntaxhighlight lang=mcfunction>
scoreboard objectives add trigger_test trigger
scoreboard players enable @a trigger_test
execute as @a if score @s trigger_test matches 1.. run tellraw @s "(>_<)"
execute as @a if score @s trigger_test matches 1.. run scoreboard players set @s trigger_test 0
</syntaxhighlight>
* 为最近的一位玩家输出一个可以点击的“按钮”（使用文本组件点击事件实现），点击后将触发型记分项的分数设定为1，玩家将在聊天栏看到信息。
   <syntaxhighlight lang=mcfunction>
tellraw @p {text:"123", click_event:{action:"run_command",command:"execute as @s run trigger trigger_test set 1"}}
</syntaxhighlight>

# 历史

|。}}
}}

# 导航

[de:Befehl/trigger](de:Befehl/trigger.md)
[en:Commands/trigger](en:Commands/trigger.md)
[es:Comandos/trigger](es:Comandos/trigger.md)
[ja:コマンド/trigger](ja:コマンド/trigger.md)
[pt:Comandos/trigger](pt:Comandos/trigger.md)
[ru:Команды консоли/trigger](ru:Команды консоли/trigger.md)