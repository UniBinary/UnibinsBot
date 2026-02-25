# 命令/give

*页面ID: 39786* | *来源: Minecraft Wiki*

给予玩家指定数量的物品。

# 用法
给予玩家指定数量的物品，若<code><targets></code>或<code>player: target</code>指定了多个目标，每个目标都会收到指定数量的物品。

将在目标位置生成指定的[物品实体](物品实体.md)。当目标物品栏有剩余空间或处于[创造模式](创造模式.md)时，该物品实体与实际给予的物品无关，无法被捡起且会在1[刻](刻.md)后消失；若目标物品栏已满，则此物品实体为物品栏无法容纳的部分，可以被立即捡起，且只有目标玩家能捡起此掉落物。

# 语法
* **Java版**
   <code>give <targets> <item> [<count>]</code>

* **基岩版**
   <code>give <player: target> <itemName: Item> [amount: int] [data: int] [components: json]</code>

# 参数



  指定给予的物品。


  指定给予的物品数量。必须在或间（含）。若未指定，默认为1。

：
  指定所给予物品的[数据值](基岩版数据值.md)。必须为介于0和32767之间的整数（含），但是当数据值对于指定的物品ID无效时，会被重置为0。若未指定，默认为0。

：
  指定所给予物品的[物品堆叠组件](基岩版物品堆叠组件.md)。


# 结果

# 输出

# 示例
* 给予执行者64个泥土：
* * <code>/give @s dirt 64</code>
* 给予所有玩家一瓶夜视药水：
* * ：<code>/give @a potion[minecraft:potion_contents={potion:"minecraft:night_vision"}]</code>
* * ：<code>/give @a potion 1 5</code>
* 给予自己一把即使在[冒险模式](冒险模式.md)下也可以破坏草方块的铁锹：
* * ：<code>/give @s iron_shovel[minecraft:can_break={blocks:"minecraft:grass_block"}] 1</code>
* * ：<code>/give @s iron_shovel 1 0 {"minecraft:can_destroy":{"blocks":["grass"]}}</code>
* 给予最近的玩家一把钻石剑，物品附加描述“Sword”：
* * <code>/give @p minecraft:diamond_sword[minecraft:lore=["Sword"]] 1</code>
* 给予自己一把带有[锋利](锋利.md)X的钻石剑：
* * <code>/give @s minecraft:diamond_sword[minecraft:enchantments={"minecraft:sharpness":10}]</code>
* 给予自己一块即使在冒险模式中也能放置在泥土上、破坏石英块的钻石块：
* * ：<code>/give @s minecraft:diamond_block[minecraft:can_place_on={blocks:"minecraft:dirt"},minecraft:can_break={blocks:"minecraft:quartz_block"}] 1</code>
* * ：<code><nowiki>/give @s diamond_block 1 0 {"minecraft:can_place_on":{"blocks":["dirt"]},"minecraft:can_destroy":{"blocks":["quartz_block"]}}</nowiki></code>
* 给予所有玩家一瓶带有[击退](击退.md)X效果的2级衰变药水：
* * <code>-{}-/give @a minecraft:potion[minecraft:potion_contents={custom_effects:[{id:"minecraft:wither", amplifier:1b, duration:420}], custom_color:5653821}, minecraft:custom_name={type:"text", text:"衰变药水", italic:false}, minecraft:enchantments={"minecraft:knockback":10}] 1</code>
* 给予自己一块即使在冒险模式下也可以放置在石头上的草方块：
* * ：<code>/give @s grass_block[can_place_on={blocks:"stone"}] 1</code>
* * ：<code>/give @s grass 1 0 {"minecraft:can_place_on":{"blocks":["stone"]}}</code>
* 给予自己一个在放置后会生成村庄的盔甲匠的战利品宝箱：
* * <code>/give @s chest[block_entity_data={id:"chest",LootTable:"chests/village/village_armorer"}] 1</code>或<code>/give @s chest[container_loot={loot_table:"chests/village/village_armorer"}] 1</code>
* 给予自己一把已消耗58点耐久度的木镐：
* * ：<code>/give @s wooden_pickaxe[damage=58] 1</code>
* * ：<code>/give @s wooden_pickaxe 1 58</code>
* 给予自己一把无法破坏的钻石剑：
* * <code>/give @s diamond_sword[unbreakable={}]</code>

* 给予自己一把无法破坏的钻石剑：
* * 1.13 – 1.20.4：<code><nowiki>/give @s minecraft:diamond_sword{Unbreakable:1b}</nowiki></code>
* 给予最近的玩家一把钻石剑，物品附加描述“Sword”：
* * 1.13 – 1.20.4：<code><nowiki>/give @p minecraft:diamond_sword{display:{Lore:['"Sword"']}} 1</nowiki></code>
* * 1.20.5 – 1.21.4：<code><nowiki>/give @p minecraft:diamond_sword[minecraft:lore=['"Sword"']] 1</nowiki></code>
* 给予所有玩家一瓶夜视药水：
* * 1.13 – 1.20.4：<code>/give @a potion{Potion:"minecraft:night_vision"}</code>
* 给予自己一把带有锋利X的钻石剑：
* * 1.13 – 1.20.4：<code>/give @s minecraft:diamond_sword{Enchantments:[{id:"minecraft:sharpness",lvl:10}]} 1</code>
* 给予自己一块即使在冒险模式中也能放置在泥土上、破坏石英块的钻石块：
* * 1.13 – 1.20.4：<code>/give @s minecraft:diamond_block{CanPlaceOn:["minecraft:dirt"],CanDestroy:["minecraft:quartz_block"]} 1</code>
* * 1.20.5 – 1.21.4：<code>/give @s minecraft:diamond_block[minecraft:can_place_on={predicates:[{blocks:"minecraft:dirt"}]},minecraft:can_break={predicates:[{blocks:"minecraft:quartz_block"}]}] 1</code>
* 给予自己一个在放置后会生成村庄的盔甲匠的战利品宝箱：
* * 1.13 – 1.20.4：<code>/give @s chest{BlockEntityTag:{LootTable:"chests/village/village_armorer"}} 1</code>
* 给予自己一把已消耗58点耐久度的木镐：
* * 1.7.2 – 1.12.2：<code>/give @s wooden_pickaxe 1 58</code>

# 历史

|。命令用于给予特定玩家的单个物品，并且只能使用数字ID。}}
|
|
|
|
|现在会把物品直接放入玩家的物品栏内，而不是扔到地上。}}
|现在可以接受[数据值](Java版数据值/扁平化前.md)作为其第四个参数。}}
|参数。}}
|
|
|
|
|{{HistoryLine||1.12|dev=17w16b|当<code>-{}-*目标*</code>指定为玩家自己时，实际上会使用<code>@s</code>选择器作为目标。}}
|
|
|{{HistoryLine||1.20.5|dev=24w09a|更改了语法，现在不再使用物品<code>-{}-*NBT标签*</code>，而是<code>-{}-*物品堆叠组件*</code>。}}
|
|命令。|用法与[Java版1.10](Java版1.10.md)中基本相同：不支持NBT标签，且目标是可选的。}}
}}

# 参见
*  — 在任意位置生成任何实体

# 导航

[de:Befehl/give](de:Befehl/give.md)
[en:Commands/give](en:Commands/give.md)
[es:Comandos/give](es:Comandos/give.md)
[ja:コマンド/give](ja:コマンド/give.md)
[pt:Comandos/give](pt:Comandos/give.md)
[ru:Команды консоли/give](ru:Команды консоли/give.md)
[uk:Команди консолі/give](uk:Команди консолі/give.md)