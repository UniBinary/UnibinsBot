# 辅助程序与编辑器/Tectonicus/Tectonicus配置格式

*页面ID: 16205* | *来源: Minecraft Wiki*

从命令行配置Tectonicus的最佳方法是使用配置文件。为获取最新信息，可查看此处的示例配置文件：http://code.google.com/p/tectonicus/source/browse/trunk/tectonicus/Docs/fullConfig.xml

Tectonicus配置文件以XML格式存储。若不熟悉XML，可查看这个基本教程：http://www.w3schools.com/xml/xml_syntax.asp

启动Tectonicus时，为让其读取配置文件，需传递“config=”参数。示例：

<pre>
java -jar Tectonicus.jar config=layerConfig.xml
</pre>

若你是新手，获取示例配置文件并修改世界文件夹和输出文件夹的路径会很容易。

记住，选项配置对大小写敏感！

# 预览
基本配置文件大致如下：

<pre>
<tectonicus version="2">

	<config>
		<!-- general config options go here -->
	</config>

	<rasteriser>
		<!-- rasteriser options go here -->
	</rasteriser>

	<map>
		<!-- map marker options go here -->
		<layer>
			<!-- options which control the appearance of the final rendered map go here -->
		</layer>
	</map>

	<tweeks>
		<!-- tweeks options go here -->
	</tweeks>

	<debug>
		<!-- debug options go here -->
	</debug>

	<!-- additional maps go here -->

</tectonicus>
</pre>

这些参数可按任意方式排列。仅“layer”和“map”可能出现多个，这些节点稍后会被覆盖。

# 示例配置文件
以下是创建一个地图的最小配置文件：

<pre>
<?xml version="1.0"?>
<tectonicus version="2">
	<config mode="cmd" outputDir="myoutputdirectory"/>

	<map name="mymapname" worldDir="/path/to/level.dat">
		<layer name="Day" lighting="day"/>
	</map>
</tectonicus>
</pre>

# 配置文件定义

# = Config 节点 =
以下是Config节点的示例：
<pre>
	<config mode = "cmd"
			worldDir = "D:\Minecraft\Tectonicus\level"
			outputDir = "D:\Minecraft\Tectonicus\Map Render"

			outputHtmlName = "Xoozo_Map.html"
			minecraftJar = "filepath to minecraft.jar"
			texturePack = "/Users/xxx/Texture pack.jar"

			numDownsampleThreads = "2"
			eraseOutputDir = "false"
			useCache = "true"
			cacheDir = "D:\Minecraft\Tectonicus\Map Render\cache"
			logFile = "D:\Minecraft\Tectonicus\Map Render\Log.txt"
	>
	</config>
</pre>

这用于控制需要更改的电脑基本设置。

# = Rasteriser 节点 =
以下是一个示例rasteriser节点：
<pre>
	<rasteriser type = "lwjgl"
				colourDepth = "32"
				alphaBits = "8"
				numSamples = "4"
				tileSize = "512"
		>
	</rasteriser>
</pre>
这些值用于在查看地图时配置显卡。

# = Map 节点 =
<pre>
<!-- Maps to process (must have at least one map) -->
	<map
		name=""
		worldDir="/Users/xxxx/AppData/Roaming/.minecraft/saves/My World" <!-- required -->
		dimension="terra / nether / ender"
		closestZoomSize="12"
		cameraAngle="45"
		cameraElevation="45 / 10 - 90"
		north="-z / +z / -x / +x" <!-- compass rose north direction -->
		compassRose="" <!-- custom image path -->>


        </map>
</pre>

# = Subset =
map节点里的一个子节点，会在地图上的特定位置，查看以该位置为中心、指定大小的圆形区域，而非整张地图。在测试Tectonicus选项以大幅减少查看时间时非常有用。其节点格式如下：

<pre>-{}-
<!-- Limit world rendering to a sub region. Optional, omit for the full world -->
<!-- Radius is in world units. Remove 'origin' to center around the spawn point -->
<subset>
	<CircularSubset origin="0, 0" radius="200" />  <!-- note atypical capital ‘C’ -->
</subset>
</pre>

# = Layer =
map节点里的一个子节点。控制最终出现的地图层数。以下是一个示例layer节点：

<pre>	<!-- A generated map layer -->
<layer  dimension = "terra"
	renderStyle = "normal"
	cameraAngle = "45"
	cameraElevation = "30"
	imageFormat = "png"
	imageCompressionLevel = "1.0"
	lighting = "day"

	singlePlayerName="YourPlayerNameHere"

	numZoomLevels = "8"
	closestZoomSize = "12"

	useDefaultBlocks="true"
	customBlocks="/Users/xxx/TectonicusTests/customBlocks.xml" >

	<!-- Markers to display on this layer -->
	<signs filter="special" initiallyVisible="true" />
	<players filter="all" playerFilterFile="/Users/xxx/TectonicusTests/players.txt" initiallyVisible="true" />
	<portals filter="all" initiallyVisible="true" />
	<spawn show="true" intiallyVisible="true" />
	<beds initiallyVisible="true" />
</layer>
</pre>

# == Markers ==
layers节点的一个子节点，这些选项控制最终渲染地图上要显示的标记。数据格式如下：

<pre>
<signs filter="special" initiallyVisible="true" />
<players filter="all" playerFilterFile="/Users/xxx/TectonicusTests/players.txt" initiallyVisible="true" />
<portals filter="all" initiallyVisible="true" />
<spawn show="true" intiallyVisible="true" />
<beds initiallyVisible="true" />
</pre>

# == Signs ==

# == Players ==

# == Portals ==

# == Spawn ==

# == Beds ==

# = Tweeks 节点 =
以下是一个示例tweeks节点：
<pre>
	<tweeks
		extractLwjglNatives = "true"
		forceLoadAwt = "false"
		force32BitNatives = "false"
		force64BitNatives = "false"
	>
	</tweeks>
</pre>

这些选项不建议更改，但在部分机器上可能运行异常。

# = Debug 节点 =
以下是一个示例debug节点：

<pre>
	<debug maxTiles = "-1"
	>
	</debug>
</pre>

这些调试选项不用于一般用途。

[Category:地图查看工具](Category:地图查看工具.md)

[en:Tutorial:Programs and editors/Tectonicus/TectonicusConfigFormat](en:Tutorial:Programs and editors/Tectonicus/TectonicusConfigFormat.md)