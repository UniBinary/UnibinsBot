# Classic世界格式

*页面ID: 43975* | *来源: Minecraft Wiki*

* *Classic世界格式（Classic Level Format）**是游戏存储Classic世界所用的格式。它使用[gzip](wzh:Gzip.md)压缩，并包含一个后跟序列化的Java对象的短标题。单人游戏地图的扩展名为“.mine”。Classic Creative服务器使用的地图名为“server_level.dat”。可以备份该文件以保存内容，这有助于保护构造免受[恶意破坏者](Tutorial:防止恶意破坏.md)或使用该文件进行[地图编辑](辅助程序与编辑器/地图工具#地图编辑工具.md)。

因为这个世界格式取决于Java序列化对象的方式，所以使用它的最简单方法是通过Classic服务器本身，<span class="plainlinks">[minecraft-server.jar](http://minecraft.net/servers.jsp)</span>。

# = 文件格式 =
解压缩后，文件格式如下：

# 访问字节数组
地图中最有趣的部分是方块数组。该数组中的每个字节定义了世界上相应位置的[方块类型](数据值.md)。通常有两个用于访问方块字节数组的选项：

你可以将压缩的.dat文件直接反序列化回Java内部的对象的实例，从而可以完全像Minecraft服务器那样访问Level对象的实例。这将允许你通过调用实例化的Level对象上的方法直接设置方块、维度、生成点和其他地图的方面。加载前不需要手动解压缩，因为Java可以动态压缩和解压缩gzip压缩文件。要将数据文件加载回类的实例，你需要类的类定义。这包含在minecraft-server.jar文件中。

其他人只需访问数据文件文件中的原始字节数组就可以读取和修改地图的数据。为此你将解压缩它，更改存储字节数组的字节，然后再次压缩它。由于你正在编辑它，因此必须保持第一个344（HEE中的14E）字节不变。接下来的256x256x64字节是存储字节数组的位置。此外，如果你知道要查找的位置，也可以通过这种方式更改生成位置坐标：从字节284开始有3个整数值，因此覆盖接下来的12个字节（3个整数）将允许你更改生成位置。

# 导航

[Category:服务器](Category:服务器.md)

[de:Spielstand-Speicherung/Classic Level Format](de:Spielstand-Speicherung/Classic Level Format.md)
[en:Java Edition Classic level format](en:Java Edition Classic level format.md)
[fr:Format de niveau de l'édition Java Classique](fr:Format de niveau de l'édition Java Classique.md)
[it:Formato livello Classic](it:Formato livello Classic.md)
[nl:Classic level formaat](nl:Classic level formaat.md)
[pt:Formato de nível da Edição Java Classic](pt:Formato de nível da Edição Java Classic.md)
[ru:Классический формат карт](ru:Классический формат карт.md)