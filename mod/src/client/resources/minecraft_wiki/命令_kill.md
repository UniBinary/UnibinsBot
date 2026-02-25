# 命令/kill

*页面ID: 39789* | *来源: Minecraft Wiki*

杀死[生物](生物.md)，清除[非生物实体](实体.md)。

# 用法
受影响的非生物实体会被直接移除。

受影响的生物会受到3.40282×10<sup>38</sup>（ × 1.70141×10<sup>38</sup>）的[伤害](伤害.md)，此伤害无视生物的所有伤害防护效果（[末影龙](末影龙.md)除外），生物不能因受到此伤害触发[不死图腾](不死图腾.md)。

被该伤害杀死的[末影龙](末影龙.md)会跳过死亡动画，立即结束末影龙战斗并开启返回传送门。

即使玩家是在[旁观模式](旁观模式.md)或下，也会受到这一伤害。而尝试使用该命令杀死创造模式下的玩家，只会提示“”，若选择器未找到其他目标则还会提示“”。

# 语法
* **Java版**
   <code>kill [<targets>]</code>

* **基岩版**
   <code>kill [target: target]</code>

# 参数

   指定要杀死/清除的目标实体。未指定时，目标为命令的执行者。


# 结果

# 输出

# 示例
* 杀死命令执行者：<code>kill</code>或<code>kill @s</code>
* 杀死名为“Steve”的玩家：<code>kill Steve</code>
* 清除所有物品实体：<code>kill @e[type=item]</code>
* 杀死执行者半径10个方块内的所有实体，包括自己：<code>kill @e[distance=..10]</code>或<code>kill @e[r=10]</code>
* 清除玩家以外的实体（物品实体、动物等）：<code>kill @e[type=!player]</code>
* 杀死所有敌对生物：<code>kill @e[family=monster]</code>

# 历史

|命令。}}
|
|现在可以在单人游戏中使用。
|命令的解析现在更加严格，不允许在命令名称之后附加字符（如或）。但参数仍然会被忽略，意味着仍然会杀死命令的执行者。
|现在使用虚空伤害而非常规伤害，这会忽略护甲。死亡消息现在是“<var>玩家</var>掉出了这个世界”而非“<var>玩家</var>死了”。
|现在会在执行时输出信息“哦！那看起来很疼”。}}
|命令造成的伤害从1000增加至3.40282×10。}}
|命令加入了<code>playerentity</code>参数。
|能被命令方块执行了。
|用“已清除<var>玩家</var>”替代了“哦！那看起来很疼”的信息。}}
|，命令现在直接清除非生物实体，不再对其造成3.40282×10伤害。}}
|
|
|现在使用独有的伤害类型和死亡消息，而非[虚空](虚空.md)的伤害类型和死亡消息。}}
|
|命令。}}
|
|可以杀死创造模式的玩家了。}}
|不再能杀死创造模式的玩家。}}
}}

# 导航

[de:Befehl/kill](de:Befehl/kill.md)
[en:Commands/kill](en:Commands/kill.md)
[es:Comandos/kill](es:Comandos/kill.md)
[it:Comandi/kill](it:Comandi/kill.md)
[ja:コマンド/kill](ja:コマンド/kill.md)
[ko:명령어/kill](ko:명령어/kill.md)
[pt:Comandos/kill](pt:Comandos/kill.md)
[ru:Команды консоли/kill](ru:Команды консоли/kill.md)
[uk:Команди консолі/kill](uk:Команди консолі/kill.md)