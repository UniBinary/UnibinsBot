# 命令/stopsound

*页面ID: 39817* | *来源: Minecraft Wiki*

停止[声音事件](声音事件.md)播放。

# 语法
* **Java版**
   <code>stopsound <targets> * <sound></code>
  : 停止指定的声音（省略类别）。
   <code>-{}-stopsound <targets> [<*类别*>] [<sound>]</code>
  : 停止所有（指定类别）的声音。

* **基岩版**
   <code>stopsound <player: target> [sound: string]</code>

# 参数

   指定声音的接收者。


   {{cd|-{}-<*类别*>}}
   指定要停止的声音所属的类别，对应于游戏选项中“音乐和声音”设置的分类。
   必须为以下之一：<code>master</code>、<code>music</code>、<code>record</code>、<code>weather</code>、<code>block</code>、<code>hostile</code>、<code>neutral</code>、<code>player</code>、<code>ambient</code>、<code>voice</code>、<code>ui</code>。

   指定要停止的声音。若未指定，则停止所有声音。
   应为一个声音事件（例如，<code>entity.pig.ambient</code>）。
   应为一个声音事件（例如，<code>mob.pig.say</code>）。

# 结果

# 输出

# 示例
* 对所有玩家停止播放下雨声：
* * ：<code>stopsound @a * weather.rain</code>
* * ：<code>stopsound @a ambient.weather.rain</code>
* * 该命令在雨天执行时会暂时消除雨声。
* 停止所有玩家的所有声音：<code>stopsound @a</code>

# 历史

|。}}
|
|。}}
}}

# 参见
*  — 播放一段声音。

# 导航

[de:Befehl/stopsound](de:Befehl/stopsound.md)
[en:Commands/stopsound](en:Commands/stopsound.md)
[es:Comandos/stopsound](es:Comandos/stopsound.md)
[ja:コマンド/stopsound](ja:コマンド/stopsound.md)
[pt:Comandos/stopsound](pt:Comandos/stopsound.md)
[ru:Команды консоли/stopsound](ru:Команды консоли/stopsound.md)
[uk:Команди консолі/stopsound](uk:Команди консолі/stopsound.md)