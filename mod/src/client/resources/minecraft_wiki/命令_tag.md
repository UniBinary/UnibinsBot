# 命令/tag

*页面ID: 39726* | *来源: Minecraft Wiki*

中与注册表有关的标签文件|Java版标签}}

管理单个[实体](实体.md)的[记分板标签](目标选择器#记分板标签.md)。一个实体拥有的标签数不能超过1024个。

# 语法
* **Java版**
   <code>tag <targets> add <name></code>
  : 为目标添加一个标签。
   <code>tag <targets> remove <name></code>
  : 移除目标的一个标签。
   <code>tag <targets> list</code>
  : 列出目标所拥有的所有标签。

* **基岩版**
   <code>tag <entity: target> add <name: string></code>
  : 为目标添加一个标签。
   <code>tag <entity: target> remove <name: string></code>
  : 移除目标的一个标签。
   <code>tag <entity: target> list</code>
  : 列出目标所拥有的所有标签。

# 参数

   指定要操作的实体目标。
   }}
   必须为一个[目标选择器](目标选择器.md)、一个玩家名，或者用一个来代表所有正被记分板跟踪的实体。

   指定要被添加或被移除的标签名称。


# 结果

}}

# 输出

# 示例
* 给执行者添加std标签：<code>/tag @s add std</code>
* 给所有手持[火焰弹](火焰弹.md)的玩家添加std标签：
* * ：<code>/tag @a[nbt={SelectedItem:{id:"minecraft:fire_charge"}}] add std</code>
* * ：<code>/tag @a[hasitem={item=fire_charge,location=slot.weapon.mainhand}] add std</code>
* 移除所有带有std标签的玩家的std标签：<code>/tag @a[tag=std] remove std</code>
* 列出所有处于旁观模式的玩家拥有的标签：<code>/tag @a[gamemode=spectator] list</code>或<code>/tag @a[m=spectator] list</code>

# 历史

|。}}
|
|。}}
}}

# 参见
*  - 管理记分板目标与玩家
*  - 管理队伍

# 导航

[de:Befehl/tag](de:Befehl/tag.md)
[en:Commands/tag](en:Commands/tag.md)
[ja:コマンド/tag](ja:コマンド/tag.md)
[pt:Comandos/tag](pt:Comandos/tag.md)
[ru:Команды консоли/tag](ru:Команды консоли/tag.md)