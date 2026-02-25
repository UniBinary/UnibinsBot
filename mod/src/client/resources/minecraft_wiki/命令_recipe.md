# 命令/recipe

*页面ID: 39803* | *来源: Minecraft Wiki*

给予或剥夺（解锁或锁定）玩家的[配方](配方.md)。

# 语法
* **Java版**
   <code>recipe give <targets> *</code>
  : 为玩家给予（解锁）所有配方。
   <code>recipe take <targets> *</code>
  : 剥夺（锁定）玩家的所有配方。
   <code>recipe give <targets> <recipe></code>
  : 为玩家给予（解锁）指定配方。
   <code>recipe take <targets> <recipe></code>
  : 剥夺（锁定）玩家的指定配方。

* **基岩版**
   <code>recipe give <player: target> *</code>
   <code>recipe give <player: target> "*"</code>
  : 为玩家给予（解锁）所有配方。
   <code>recipe take <player: target> *</code>
   <code>recipe take <player: target> "*"</code>
  : 剥夺（锁定）玩家的所有配方。
   <code>recipe give <player: target> <recipe: string></code>
  : 为玩家给予（解锁）指定配方。
   <code>recipe take <player: target> <recipe: string></code>
  : 剥夺（锁定）玩家的指定配方。

# 参数

   指定要给予或剥夺配方的玩家。



   指定要给予或剥夺的配方。
   必须为一个配方的ID，命名空间不可省略（如果有）或添加（如果没有），参见[此官方文档](https://learn.microsoft.com/en-us/minecraft/creator/commands/commands/recipe?view=minecraft-bedrock-stable#values)。

# 结果

|未能给予/剥夺配方（所有配方已经拥有/都未拥有）|fail|succeed}}

# 输出

# 示例
* 随机剥夺一名玩家全部的配方：<code>/recipe take @r *</code>
* 给予所有玩家铁剑的合成配方：<code>/recipe give @a minecraft:iron_sword</code>

# 历史

|命令。}}
|
|命令。}}
|的语法顺序以匹配。}}
|不再属于[实验性玩法](实验性玩法.md)。}}
|更改为。}}
}}

# 参见
* [知识之书](知识之书.md)
*  – 玩家是否只能用已解锁的配方来合成物品。

# 导航

[de:Befehl/recipe](de:Befehl/recipe.md)
[en:Commands/recipe](en:Commands/recipe.md)
[es:Comandos/recipe](es:Comandos/recipe.md)
[ja:コマンド/recipe](ja:コマンド/recipe.md)
[pt:Comandos/recipe](pt:Comandos/recipe.md)
[ru:Команды консоли/recipe](ru:Команды консоли/recipe.md)