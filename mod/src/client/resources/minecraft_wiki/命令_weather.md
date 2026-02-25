# 命令/weather

*页面ID: 39836* | *来源: Minecraft Wiki*

更改游戏中的[天气](天气.md)。也可用于显示当前天气。

# 语法
* **Java版**
   <code>weather (clear|rain|thunder) [<duration>]</code>

* **基岩版**
   <code>weather <nowiki><clear|rain|thunder></nowiki> [duration: int]</code>
   <code>weather query</code>

# 参数
rainthunder}}
  * <code>clear</code> - 将天气设为晴天，且晴天结束后将变为雷暴雨。
  * <code>rain</code> - 将天气设为雨天（寒冷的生物群系会下雪），且结束后变为晴天。
  * <code>thunder</code> - 将天气设为雷暴雨（寒冷的生物群系会下雷暴雪），且结束后变为晴天。

   指定天气的持续时间。
   若未指定，则为随机取值，取值范围与指定的天气种类有关：
  * <code>clear</code> - 12000到180000之间（含），即10分钟到150分钟之间（含）。
  * <code>rain</code> - 12000到24000之间（含），即10分钟到20分钟之间（含）。
  * <code>thunder</code> - 3600到15600之间（含），即3分钟到13分钟之间（含）。
   指定的时间以游戏刻为单位。若为0或未指定，天气时长将6000到18000之间（含）随机取值，即5分钟到15分钟之间（含）。
   且应在0到1000000之间（含）。

# 结果

# 输出

# 示例
   将天气改为晴天，持续一个Minecraft日（20分钟）：
   将天气改为下雨，且让其自行结束：

# 历史

|。}}
|参数未指定，天气变化的持续时间会与游戏的常规天气周期相匹配。
|将参数的默认单位由秒改为游戏刻。
|现在支持参数值后加后缀表示单位。}}
|
|
|。}}
|
|
}}

# 导航

[de:Befehl/weather](de:Befehl/weather.md)
[en:Commands/weather](en:Commands/weather.md)
[es:Comandos/weather](es:Comandos/weather.md)
[ja:コマンド/weather](ja:コマンド/weather.md)
[lzh:令/weather](lzh:令/weather.md)
[pt:Comandos/weather](pt:Comandos/weather.md)
[ru:Команды консоли/weather](ru:Команды консоли/weather.md)
[uk:Команди консолі/weather](uk:Команди консолі/weather.md)