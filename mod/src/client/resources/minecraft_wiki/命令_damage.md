# 命令/damage

*页面ID: 92005* | *来源: Minecraft Wiki*

对指定实体造成指定类型的伤害。

# 语法
* **Java版**
   <code>damage <target> <amount> [<damageType>] [at <location>]</code>
   <code>damage <target> <amount> [<damageType>] [by <entity>] [from <source>]</code>

* **基岩版**
   <code>damage <target: target> <amount: int> <cause: DamageCause> entity <damager: target></code>
   <code>damage <target: target> <amount: int> [cause: DamageCause]</code>

# 参数

   指定要被伤害的目标实体。


   指定要造成的伤害值。


   指定伤害的成因，即要造成的[伤害类型](伤害类型.md)，默认为或，其会影响的游戏内容如[死亡消息](死亡消息.md)。

   所有伤害类型参见[官方附加包文档](https://learn.microsoft.com/en-us/minecraft/creator/reference/content/vanillalistingsreference/addonentitydamagesources)。
：
   指定伤害来源的位置。


   指定伤害的直接来源，这会影响伤害造成的击退方向。可用于指定[弹射物](弹射物.md)或[被激活的TNT](被激活的TNT.md)为伤害的直接来源，同时指定其发射者为伤害的实际来源。

：
   指定伤害的实际来源，视为由该生物造成此伤害并增加相关[统计](统计.md)，导致生物反击或声望下降，且造成死亡时为击杀者。没有指定时，<code><entity></code>参数指定的实体视为实际来源。


# 结果

# 输出

# 示例
* 让一个名称为<code>dummy</code>的村民对一只铁傀儡造成的伤害：
* * iron_golem, limit1] 1 generic by @e[typevillager, limit1, name"dummy"]}}
* * iron_golem, c1] 1 entity_attack entity @e[typevillager, c1, name"dummy"]|long=1}}

# 历史

|。}}
|
|。}}
}}

# 导航

[de:Befehl/damage](de:Befehl/damage.md)
[en:Commands/damage](en:Commands/damage.md)
[es:Comandos/damage](es:Comandos/damage.md)
[ja:コマンド/damage](ja:コマンド/damage.md)
[ko:명령어/damage](ko:명령어/damage.md)
[pt:Comandos/damage](pt:Comandos/damage.md)
[ru:Команды консоли/damage](ru:Команды консоли/damage.md)