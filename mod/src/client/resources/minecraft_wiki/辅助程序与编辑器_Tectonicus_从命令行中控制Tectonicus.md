# 辅助程序与编辑器/Tectonicus/从命令行中控制Tectonicus

*页面ID: 16253* | *来源: Minecraft Wiki*

虽然[Tectonicus](Tectonicus.md)可以用命令行代替XML文件进行控制，但这种方法功能有限，且不被官方支持。

从命令行运行以下命令：

<pre>java -jar Tectonicus_v1.0.jar</pre>

（记得将版本号改成你下载文件的版本号。）这会显示所有可用选项。

如果Java未在环境变量中设置，就需要用java.exe的完整路径运行Tectonicus：

<pre>"C:\Program Files\Java\jre6\bin\java.exe" -jar Tectonicus_v1.0.jar</pre>

在64位系统上运行时，使用force64BitNatives=true可避免内存溢出错误：

<pre>"C:\Program Files (x86)\Java\jre6\bin\java.exe" -jar Tectonicus_v1.0.jar force64BitNatives=true</pre>

要映射一个玩家世界，需输入：

<pre>java -jar Tectonicus_v1.0.jar worldDir=1 outputDir=C:/MyMap</pre>

这会映射单人游戏世界1，并输出到C:/MyMap。改变数字可映射不同的单人游戏世界。

要映射多人游戏世界，需将worldDir定位到你的世界文件夹（包含level.dat的那个），如下所示：

<pre>java -jar Tectonicus_v1.19.jar worldDir=C:/MinecraftMultiplayer/world</pre>

查看[教程](Tectonicus#教程.md)可获取特殊命令和附加命令。

# 命令行参数
在2.00版本中，命令行参数已被弃用，取而代之的是[XML配置文件](辅助程序与编辑器/Tectonicus/Tectonicus配置格式.md)。2.00及之后版本仍支持命令行方式，但唯一建议使用的参数是“config=”，用于指定配置文件的路径。

[Category:地图查看工具](Category:地图查看工具.md)

[en:Tutorials/Programs and editors/Tectonicus/Controlling Tectonicus from the command line](en:Tutorials/Programs and editors/Tectonicus/Controlling Tectonicus from the command line.md)