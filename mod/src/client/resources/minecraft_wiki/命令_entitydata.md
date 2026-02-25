# 命令/entitydata

*页面ID: 39923* | *来源: Minecraft Wiki*

修改[实体](实体.md)的NBT标签。

# 语法
   <code>-{}-/entitydata <*实体*> <*NBT标签*></code>

# 参数
<code>-{}-*实体*</code>
   指定要修改数据的实体。必须是[目标选择器](目标选择器.md)或[UUID](UUID.md)，且不能为玩家。

<code>-{}-*NBT标签*</code>
   对于目标实体，指定要添加、覆盖的[NBT标签](NBT标签.md)元素（NBT标签不能被移除，字符串不能被设定为空值）。必须是复合型[NBT标签](NBT标签.md)（例如<code>{CustomName:"ming"}</code>）。

# 结果

# 输出

# 示例
* 阻止所有现有僵尸捡起战利品：<code>/entitydata @e[type=zombie] {CanPickUpLoot:0b}</code>
* 给身边的物品（实体）添加无法破坏的物品标签：<code><nowiki>/entitydata @e[type=item,r=5] {Item:{tag:{Unbreakable:1b}}}</nowiki></code>

# 历史

|。}}
|
|。}}
}}

# 导航

[de:Befehl/entitydata](de:Befehl/entitydata.md)
[en:Commands/entitydata](en:Commands/entitydata.md)
[es:Comandos/entitydata](es:Comandos/entitydata.md)
[ja:コマンド/entitydata](ja:コマンド/entitydata.md)
[pt:Comandos/entitydata](pt:Comandos/entitydata.md)
[ru:Команды консоли/entitydata](ru:Команды консоли/entitydata.md)