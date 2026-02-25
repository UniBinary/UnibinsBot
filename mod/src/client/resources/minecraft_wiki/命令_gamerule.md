# 命令/gamerule

*页面ID: 39785* | *来源: Minecraft Wiki*

}}

设置或查询[游戏规则](游戏规则.md)。

# 语法
* **Java版**
   <code>-{}-gamerule <*规则名称*> [<value>]</code>
参数在Java版中区分大小写。

* **基岩版**
   <code>gamerule</code>
   <code>gamerule <rule: BoolGameRule> [value: Boolean]</code>
   <code>gamerule <rule: IntGameRule> [value: int]</code>
参数在基岩版中输入时不区分大小写。

# 参数

：{{argument|-{}-*规则名称*}}<br>
：或
   指定要设置或查询的游戏规则。只有某些预设的游戏规则会影响游戏玩法（见[预设游戏规则](游戏规则#游戏规则列表.md)）。

：<br>
：或
   指定将游戏规则设置的值。

# 结果

# 输出

# 示例
* 禁止玩家互相攻击：<code>gamerule pvp false</code>

# = Java版 =
* 停止昼夜更替：<code>gamerule advance_time false</code>
* 停止自然恢复生命值：<code>gamerule natural_health_regeneration false</code>
* 禁止破坏性生物行为（如苦力怕、恶魂等生物炸毁方块）：<code>gamerule mob_griefing false</code>
* 在玩家死亡时保留物品栏：<code>gamerule keep_inventory true</code>
* 禁止TNT爆炸：<code>gamerule tnt_explodes false</code>
* 屏蔽命令方块执行成功后在控制台显示的文本内容：<code>gamerule command_block_output false</code>
* 设置一格内最大实体堆叠数量为100：<code>gamerule max_entity_cramming 100</code>
* 设置玩家重生半径为25格：<code>gamerule respawn_radius 25</code>
* 禁用聊天框命令反馈：<code>gamerule send_command_feedback false</code>

# = 基岩版 =
* 停止昼夜更替：<code>gamerule doDaylightCycle false</code>
* 停止自然恢复生命值：<code>gamerule naturalRegeneration false</code>
* 禁止破坏性生物行为（如苦力怕、恶魂等生物炸毁方块）：<code>gamerule mobGriefing false</code>
* 在玩家死亡时保留物品栏：<code>gamerule keepInventory true</code>
* 禁止TNT爆炸：<code>gamerule tntExplodes false</code>
* 屏蔽命令方块执行成功后在控制台显示的文本内容：<code>gamerule commandBlockOutput false</code>
* 设置玩家重生半径为25格：<code>gamerule spawnRadius 25</code>
* 禁用聊天框命令反馈：<code>gamerule sendCommandFeedback false</code>

# 历史

|。}}
|
|
|{{HistoryLine||1.21.11|dev=pre1|<code>-{}-<*规则名称*></code>现在默认命名空间为<code>minecraft</code>，此前不支持命名空间。}}
|
|。}}
|
|
|
}}

# 导航

[de:Befehl/gamerule](de:Befehl/gamerule.md)
[en:Commands/gamerule](en:Commands/gamerule.md)
[es:Comandos/gamerule](es:Comandos/gamerule.md)
[ja:コマンド/gamerule](ja:コマンド/gamerule.md)
[ko:명령어/gamerule](ko:명령어/gamerule.md)
[pl:Polecenia/gamerule](pl:Polecenia/gamerule.md)
[pt:Comandos/gamerule](pt:Comandos/gamerule.md)
[ru:Команды консоли/gamerule](ru:Команды консоли/gamerule.md)
[uk:Команди консолі/gamerule](uk:Команди консолі/gamerule.md)