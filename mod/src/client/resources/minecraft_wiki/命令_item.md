# 命令/item

*页面ID: 72240* | *来源: Minecraft Wiki*

的实体|物品（实体）|存在于[物品栏](物品栏.md)中的物品|物品}}

修改[方块](方块.md)（[箱子](箱子.md)、[熔炉](熔炉.md)等）或[实体](实体.md)（玩家等实体）物品栏内的[物品](物品.md)。

# 语法
   <code>**item modify** (block <pos>|entity <targets>) <slot> <modifier></code>
  : 对指定槽位的物品施加指定的[物品修饰器](物品修饰器.md)。
   <code>**item replace** (block <pos>|entity <targets>) <slot> **with** <item> [<count>]</code>
  : 将指定槽位的物品替换为指定的物品。
   <code>**item replace** (block <pos>|entity <targets>) <slot> **from** (block <sourcePos>|entity <sourceTarget>) <sourceSlot> [<modifier>]</code>
  : 将源槽位的物品复制到目标槽位，可以同时施加指定的[物品修饰器](物品修饰器.md)。

* *语法的其他表示方式：**




# 参数

   指定要改变的方块的位置。


   指定一个或多个要改变的实体。


   指定要改变的[槽位](槽位.md)。有效值取决于要改变的方块或实体。


   指定使用的[物品修饰器](物品修饰器.md)。


   指定被放置于方块或实体的物品栏槽位内的物品。


   指定被放置的物品的数量。


   指定要复制其中物品的方块的位置。


   指定要复制其中物品的单个实体。


   指定要复制其中物品的[槽位](槽位.md)。有效值取决于要改变的方块或实体。


# 结果

# 输出

# 示例
* 将上方2格处的一个小型箱子右下角槽位内的物品替换成4棵云杉树苗：
* * <code>/item replace block ~ ~2 ~ container.26 with minecraft:spruce_sapling 4</code>
* 将最近玩家的快捷栏最右槽位内的物品替换成4棵云杉树苗：
* * <code>/item replace entity @p hotbar.8 with minecraft:spruce_sapling 4</code>
* 定义一个内联物品修饰器，尝试将执行者主手上的可以放进熔炉烧制的物品替换为其烧制之后的物品（比如生猪排将替换为熟猪排）：
* * <code>/item modify entity @s weapon.mainhand {function:"furnace_smelt"}</code>
* 定义一个内联物品修饰器，尝试移除玩家头盔栏内物品上的绑定诅咒和消失诅咒魔咒：
* * <code>/item modify entity @s armor.head {function:"set_enchantments", enchantments:{"binding_curse":0, "vanishing_curse":0}, add:false}</code>

# 历史

|命令。}}
|可以在[物品展示框](物品展示框.md)上使用。}}
|。}}
|
|{{HistoryLine||1.20.5|dev=24w09a|[item_stack参数类型](参数类型#item_stack.md)更改了语法，现在不再使用物品<code>-{}-*NBT标签*</code>，而是<code>-{}-*物品堆叠组件*</code>。}}
|
|
|命令应用物品修饰器后，物品数量如果超过其最大堆叠数量，则只会返回最大堆叠数量的物品。}}
}}

# 参见
*  - 通过修改NBT来替换一个容器或实体物品栏中的物品。
*  - 直接给予玩家物品，但不指定具体的槽位或覆盖原有物品。

# 导航

[de:Befehl/item](de:Befehl/item.md)
[en:Commands/item](en:Commands/item.md)
[es:Comandos/item](es:Comandos/item.md)
[ja:コマンド/item](ja:コマンド/item.md)
[pt:Comandos/item](pt:Comandos/item.md)
[ru:Команды консоли/item](ru:Команды консоли/item.md)