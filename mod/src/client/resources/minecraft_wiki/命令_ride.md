# 命令/ride

*页面ID: 68222* | *来源: Minecraft Wiki*

用于使实体骑乘或停止骑乘其他实体。可使坐骑逐出其乘客，亦可召唤坐骑或乘客。

# 用法

该命令不能为玩家、、[拴绳结](拴绳结.md)、[闪电束](闪电束.md)、[浮漂](浮漂.md)和与[嘎枝之心](嘎枝之心.md)绑定的[嘎枝](嘎枝.md)添加乘客。

某些实体不允许其他实体对其进行骑乘，主要是靠数据驱动。可通过行为包文件中的组件来控制（参见[骑乘](骑乘.md)和[官方文档](https://learn.microsoft.com/minecraft/creator/reference/content/entityreference/examples/entitycomponents/minecraftcomponent_rideable)）。

# 语法
* **Java版**
   <code>ride <target> mount <vehicle></code>
  : 让指定的乘客骑乘指定的坐骑。

   <code>ride <target> dismount</code>
  : 让指定的乘客停止骑乘。

* **基岩版**
   <code>ride <riders: target> start_riding <ride: target> [teleportRules: TeleportRules] [howToFill: FillType]</code>
  : 让指定的乘客骑乘指定的坐骑。

   <code>ride <riders: target> stop_riding</code>
  : 让指定的乘客停止骑乘。

   <code>ride <rides: target> evict_riders</code>
  : 让指定的坐骑逐出它的乘客。

   <code>ride <rides: target> summon_rider <entityType: EntityType> [spawnEvent: string] [nameTag: string]</code>
  : 对于每个指定的坐骑，如果可被骑乘且没有满载，则在其所在的位置召唤一个实体，然后让它们骑乘到坐骑上。

   <code>ride <riders: target> summon_ride <entityType: EntityType> [rideRules: RideRules] [spawnEvent: string] [nameTag: string]</code>
  : 在每个指定的乘客的位置召唤一个实体，然后让乘客骑乘所召唤的实体。

# 参数
：
   指定乘客。


：
   指定坐骑。


：
   指定乘客。
   如果处于<code>start_riding</code>模式并且<code>teleportRules: TeleportRules</code>是<code>teleport_ride</code>时，应仅有一个实体。


：
   指定坐骑。
   应仅有一个实体。


：
   指定坐骑。


：
   指定将被传送的实体。
   必须是<code>teleport_ride</code>（传送坐骑至乘客）或<code>teleport_rider</code>（传送乘客至坐骑）。
   如果未指定，默认为<code>teleport_rider</code>。

：
   必须是<code>if_group_fits</code>或<code>until_full</code>。
  * <code>if_group_fits</code>只会在指定的所有<code><riders: target></code>都能一起骑上指定的坐骑时才会使它们骑乘。
  * <code>until_full</code>让指定的<code><riders: target></code>逐个尝试骑乘至指定的坐骑上，直到该坐骑满载。
  * 如果未指定，默认为<code>until_full</code>。

：
   指定召唤的实体。
   必须是一个实体类型的ID。
   只有特定实体类型允许被召唤。允许召唤的实体类型可见于命令的自动补全建议列表。指定列表外的实体类型会是命令无法解析。

：
   指定实体生成时执行的事件。应为一个[生成事件](生成事件.md)（行为包中的实体事件）的名称。

：
   指定实体生成时的名字。


：
   必须是<code>no_ride_change</code>， <code>reassign_rides</code>或 <code>skip_riders</code>。
  * <code>skip_riders</code>仅为没有在骑乘的<code><riders: target></code>召唤实体。
  * <code>no_ride_change</code>仅为没有骑乘且没有被骑乘的<code><riders: target></code>召唤实体。
  * <code>reassign_rides</code>使正在骑乘的<code><riders: target></code>停止骑乘，然后为所有<code><riders: target></code>召唤实体。
  * 如果未指定，默认为<code>reassign_rides</code>。

# 结果

# 输出

# 示例
* 将自己骑乘到猪上:
* * <code>/ride @s mount @e[limit=1,type=minecraft:pig]</code>
* 使自己骑到最近的箭上：
* * <code>/ride @s mount @n[type=arrow]</code>
* 在每个具有“A”[标签](记分板#标签.md)的玩家处生成一支箭：
* * <code>/ride @a[tag=A] summon_ride arrow</code>
* 在每个具有“A”[标签](记分板#标签.md)的玩家处生成一只[闪电苦力怕](闪电苦力怕.md)：
* * <code>/ride @a[tag=A] summon_ride creeper reassign_rides minecraft:become_charged</code>

# 历史

|。}}
|不再能使实体骑乘[拴绳结](拴绳结.md)、[闪电束](闪电束.md)和[浮漂](浮漂.md)。}}
|
|。}}
}}

# 导航

[de:Befehl/ride](de:Befehl/ride.md)
[en:Commands/ride](en:Commands/ride.md)
[ja:コマンド/ride](ja:コマンド/ride.md)
[pt:Comandos/ride](pt:Comandos/ride.md)
[ru:Команды консоли/ride](ru:Команды консоли/ride.md)