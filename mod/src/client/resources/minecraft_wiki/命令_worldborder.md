# 命令/worldborder

*页面ID: 39838* | *来源: Minecraft Wiki*

此命令用于控制[世界边界](世界边界.md)。

# 语法
   <code>worldborder add <distance> [&lt;time&gt;]</code>
  : 将当前的世界边界边长同时加上指定的距离。可指定世界边界从旧边界过渡到新边界所持续的时间，若未指定则世界边界大小的变化会瞬间完成。
   <code>worldborder center <pos></code>
  : 将世界边界的中心设置为水平坐标<code><pos></code>处。边界中心的初始值为（0, 0）。
   <code>worldborder damage amount <damagePerBlock></code>
  : 指定世界边界外伤害大小，设置玩家在世界边界缓冲区外超出每方格每秒所受到的伤害量。玩家在世界边界伤害缓冲区外时，每秒受到的伤害为距缓冲区的距离乘<code><damagePerBlock></code>。其初始值为0.2。
   <code>worldborder damage buffer <distance></code>
  : 设置玩家越过世界边界后仍不受伤害的安全缓冲距离。玩家在世界边界外时，距离世界边界超过此距离才会受到伤害。边界缓冲区的初始值为5格。
   <code>worldborder get</code>
  : 获取世界边界的当前边长。可以使用储存其值。
   <code>worldborder set <distance> [&lt;time&gt;]</code>
  : 设置世界边界的边长大小。可指定世界边界从旧边界过渡到新边界所持续的时间，若未指定则世界边界大小的变化会瞬间完成。
  <code>worldborder warning distance <distance></code>
  : 设置世界边界接近警告的距离。当玩家在边界内与世界边界的距离小于警告距离时，将玩家的屏幕染红作为警告。其初始值为5格。若玩家的图像品质设为“流畅”，则屏幕不会泛红。
   <code>worldborder warning time &lt;time&gt;</code>
  : 设置世界边界接近警告的时间。当正在收缩的世界边界预计在指定时间内达到玩家所在位置时，将玩家的屏幕染红作为警告。其初始值为15秒。若玩家的图像品质设为“流畅”，则屏幕不会泛红。

# 参数
（仅<code>add</code>模式）
   指定世界边界边长要增加的方块数。


（仅<code>add</code>和<code>set</code>模式）
   指定世界边界从原边长变化至新边长所需的过渡时间。若未指定，默认为0。


   指定世界中心的水平坐标。
   并且其X和Z应在±29999984之间（含）。

   指定玩家在越过世界边界外缓冲区后每远离一格每秒受到的伤害。例如，如果<code><damagePerBlock></code>是0.1，则处于缓冲区5方格外的玩家每秒会受到0.5点伤害（伤害少于半颗心可能不会改变生命条的视觉效果，但仍会累积）。初始值为0.2。


（仅<code>damage buffer</code>模式）
   指定玩家超出后受到伤害前的缓冲区方格数。初始值为5.0。


（仅<code>set</code>模式）
   指定新的世界边界的边长。


（仅<code>warning distance</code>模式）
   指定在世界边界内向玩家显示边界接近警告时玩家与世界边界的距离。初始值为5。


（仅<code>warning time</code>模式）
   当正在收缩的世界边界预计在指定时间内达到玩家所在位置时提前显示警告。初始值为15秒。


# 结果

# 输出

}}

}}
}}

}}
}}

# 示例
* 将警告距离设定为10的9次方（若图像品质允许渲染屏幕红色效果，则在默认边界宽度下，玩家屏幕将一直带有红色警告效果）：
   <syntaxhighlight lang=mcfunction>
worldborder warning distance 1000000000
</syntaxhighlight>

* 以最近一位玩家脚部坐标为执行位置，设定世界边界中心，并改变世界边界宽度为16：
   <syntaxhighlight lang=mcfunction>
execute as @p at @s run worldborder center ~ ~
worldborder set 16
</syntaxhighlight>

# 历史

|。}}
|和。}}
|。}}
|。}}
|</ref>
|允许的最大边长从60,000,000变为59,999,968。}}
|</ref>}}
|只控制执行维度的世界边界，此前控制所有维度的世界边界。}}
|和以[刻](刻.md)为单位，而不再是秒。
|将和的时间参数名称由<code>time</code>改为<code>ticks</code>。}}
|、和的时间参数类型现在是[time](参数类型#time.md)。
|将和的时间参数名称由<code>ticks</code>改为<code>time</code>。}}
}}

# 参考

# 导航

[de:Befehl/worldborder](de:Befehl/worldborder.md)
[en:Commands/worldborder](en:Commands/worldborder.md)
[es:Comandos/worldborder](es:Comandos/worldborder.md)
[ja:コマンド/worldborder](ja:コマンド/worldborder.md)
[pt:Comandos/worldborder](pt:Comandos/worldborder.md)
[ru:Команды консоли/worldborder](ru:Команды консоли/worldborder.md)