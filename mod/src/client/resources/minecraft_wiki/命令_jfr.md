# 命令/jfr

*页面ID: 89493* | *来源: Minecraft Wiki*

使用[Java Flight Recorder](https://openjdk.java.net/jeps/328)分析数据和某些自定义事件。

# 用法
分析包含以下几种自定义事件：
* <code>minecraft.ServerTickTime</code>：采样事件，反映服务器平均TPS。
* <code>minecraft.ChunkGeneration</code>：生成单个区块阶段所需的时间。
* <code>minecraft.PacketReceived</code>或<code>minecraft.PacketSent</code>：网络流量。
* <code>minecraft.NetworkSummaryEvent</code>：网络数据包的数量等信息。
* <code>minecraft.WorldLoadFinishedEvent</code>：初始化世界加载耗费的时间。
* <code>minecraft.ChunkRegionRead</code>和<code>minecraft.ChunkRegionWrite</code>：区块文件的写入和读取。
* <code>minecraft.StructureGeneration</code>：结构生成。
* <code>minecraft.ClientFps</code>：客户端FPS。

分析的结果摘要会以JSON格式写入日志以及<samp>debug</samp>文件夹中。

此外，以<samp>.jfr</samp>格式保存的记录文件会保存于<samp>debug</samp>文件夹中，可使用如[JMC](https://github.com/openjdk/jmc)及其他支持此格式的工具做进一步分析。

# 语法
<code>jfr start</code>
   开始JFR分析。

<code>jfr stop</code>
   结束JFR分析。

# 结果

# 输出

# 历史

|。}}
|
|
}}

# 导航

[de:Befehl/jfr](de:Befehl/jfr.md)
[en:Commands/jfr](en:Commands/jfr.md)
[es:Comandos/jfr](es:Comandos/jfr.md)
[ja:コマンド/jfr](ja:コマンド/jfr.md)
[lzh:令/jfr](lzh:令/jfr.md)
[pt:Comandos/jfr](pt:Comandos/jfr.md)