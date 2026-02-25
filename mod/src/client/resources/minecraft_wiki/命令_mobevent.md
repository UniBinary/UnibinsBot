# 命令/mobevent

*页面ID: 40940* | *来源: Minecraft Wiki*

控制或查询允许运行的生物事件。

# 语法
   <code>mobevent <event: MobEvent> [value: Boolean]</code>

# 参数

   指定要控制或查询的事件。可以是以下之一：
  *<code>minecraft:ender_dragon_event</code> 用于初次进入末地时生成[末影龙](末影龙.md)。
  *<code>minecraft:pillager_patrols_event</code> 用于生成[灾厄巡逻队](灾厄巡逻队.md)。
  * <code>minecraft:wandering_trader_event</code> 用于生成[流浪商人](流浪商人.md)。
  * <code>events_enabled</code> 用于事件子系统。禁用此选项时，不会发生任何事件；启用此选项时，只会发生启用的事件。

   如果指定，则<code>true</code>启用事件，<code>false</code>禁用事件。如果忽略，则显示当前启用状态。


# 结果

# 输出

# 示例
* 禁用所有事件：<code>mobevent events_enabled false</code>
* 允许生成流浪商人（在启用事件子系统时）：<code>mobevent minecraft:wandering_trader_event true</code>
* 查询灾厄巡逻队生成的状态：<code>mobevent minecraft:pillager_patrols_event</code>

# 历史

|。}}
|
}}

# 导航

[de:Befehl/mobevent](de:Befehl/mobevent.md)
[en:Commands/mobevent](en:Commands/mobevent.md)
[ja:コマンド/mobevent](ja:コマンド/mobevent.md)
[pt:Comandos/mobevent](pt:Comandos/mobevent.md)
[ru:Команды консоли/mobevent](ru:Команды консоли/mobevent.md)