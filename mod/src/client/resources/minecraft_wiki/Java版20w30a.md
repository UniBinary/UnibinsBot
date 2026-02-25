# Java版20w30a

*页面ID: 67073* | *来源: Minecraft Wiki*

<onlyinclude>

* *20w30a**是[Java版1.16.2](Java版1.16.2.md)的第4个，也是最后一个快照，发布于2020年7月22日<ref name="20w30a"></ref>，将[灯笼](灯笼.md)更改为可含水方块，更改了堡垒遗迹的宝藏生成机制，并修复了一些漏洞。

# 更改
# = 方块 =
* *[灯笼](灯笼.md)和[灵魂灯笼](灵魂灯笼.md)**
* 现在可以含水。

* *[告示牌](告示牌.md)**
* 现在，使用第三方工具重新编辑告示牌时，将使用现有告示牌文本初始化告示牌编辑屏幕。

# = 生物 =
* *[恼鬼](恼鬼.md)**
* 修改了无装备恼鬼的攻击动画。

# = 世界生成 =
* *[堡垒遗迹](堡垒遗迹.md)**
* 更改了箱子的战利品表。
* * 提高了战利品的总体价值。提高了稀有物品的权重，同时也增加了很多物品的数量。许多随机池的抽取次数也变多。
* * 移除了所有“空”的战利品项。
* * 大部分有耐久度的物品，其平均耐久度现在增加。
* * 向多个战利品表内加入了附魔的金斧、金胡萝卜和铁块。
* * 疣猪兽棚结构内的箱子现可能包含一把附魔的钻石镐。
* * 从宝箱中移除了铁粒。
* * 宝箱中未附魔的钻石盔甲现在不再有耐久度损失了。
* 堡垒遗迹内的宝箱现在更有可能生成在[镶金黑石](镶金黑石.md)上。

# = 命令格式 =
* ***
* 为尝试生成重复UUID的实体加入了一条错误提示：“UUID重复，无法召唤实体”。

# = 游戏内容 =
* *[进度](进度.md)**
* 现在可以修改空白进度页面描述下方的“:(”了（本地化键名为）。
* 将[进度](进度.md)“”的英文名“Bring Home the Beacon”中的“Beacon”的大小写修正为“beacon”。
* 将[进度](进度.md)“”的英文描述中的指南针“Compass”的大小写修正为“compass”。

* *[死亡消息](死亡消息.md)**
* 将被头颅击中的死亡从“<玩家名> was shot by a <实体名>'s skull”改为“<玩家名> was shot by a skull from <实体名>”。

* *[重生](重生.md)**
* 修改了[床](床.md)和[重生锚](重生锚.md)确定重生位置的机制。
* * 重生锚现在优先选择东南西北四个基本方向，而不是斜对角。
* * 床现在优先选择玩家进入床的一侧，其次是从床尾到床头一圈的空间。
* * 重生的玩家会朝向重生的方块。
* * 当可能时会避免将玩家放置到危险的方块上。

# = 常规 =
* *[数据包](数据包.md)**
* 修改了一部分GUI文本字符串。
* * 将“Errors in currently selected datapacks prevented world from loading.[换行] You can either try to load only with vanilla datapack (‘safe mode’) or go back to title screen and fix it manually.”改为“Errors in currently selected datapacks prevented **the** world from loading.[换行] You can either try to load **it with** only the vanilla data pack (‘safe mode’), or go back to **the** title screen and fix it manually.”。
* * 修正了一些语法。
* ** 将“This pack was made for a newer version of Minecraft and may  work correctly.”更改为“This pack was made for a newer version of Minecraft and may  work correctly.”（）。
* ** 将“Do you want to add following packs to Minecraft?”更改为“Do you want to add  following packs to Minecraft?”（）。

* *[文本翻译](Crowdin#翻译.md)**
* 将一些字符串变成大写。
* * 将“Back to title screen”更改为“Back to Title Screen”（）。
* * 将“Back to server list”更改为“Back to Server List”（）。
* * 将“Game paused”更改为“Game Paused”（）。
* * 将“Optimize world”更改为“Optimize World”（）。
* * 将“Now playing: <record>”更改为“Now Playing: <record>”（）。
* * 将“Continue without support”更改为“Continue without Support”（）。
* * 将“Take me back”更改为“Take me Back”（）。
* * 将“Spectate world”更改为“Spectate World”（）。
* * 将“Title screen”更改为“Title Screen”（）。
* * 将“You died!”更改为“You Died!”（）。
* * 将“Game over!”更改为“Game Over!”（）。
* * 将“Level requirement: <level>”更改为“Level Requirement: <level>”（）。
* * 将“Save mode - write to file”更改为“Save Mode - Write to File”（）。
* * 将“Load mode - load from file”更改为“Load mode - Load from File”（）。
* * 将“Data mode - game logic marker”更改为“Data mode - Game Logic Marker”（）。
* * 将“Corner mode - placement and size marker”更改为“Corner Mode - Placement and Size Marker”（）。
* * 将“Show invisible blocks:”更改为“Show Invisible Blocks:”（）。
* * 将“Show bounding box:”更改为“Show Bounding Box:”（）。
* * 将“Target pool:”更改为“Target Pool:”（）。
* * 将“Target name:”更改为“Target Name:”（）。
* * 将“Joint type:”更改为“Joint Type:”（）。
* * 将“Raiders remaining: <number>”更改为“Raiders Remaining: <number>”（）。
* * 将“Press <> to dismount”更改为“Press <> to Dismount”（）。
* * 将“When in main hand:”更改为“When in Main Hand:”（）。
* * 将“When in off hand:”更改为“When in Off Hand:”（）。
* * 将“When on feet:”更改为“When on Feet:”（）。
* * 将“When on legs:”更改为“When on Legs:”（）。
* * 将“When on body:”更改为“When on Body:”（）。
* * 将“When on head:”更改为“When on Head:”（）。
* * 将“World updates”更改为“World Updates”（）。
* 修正了一些字符串中的标点使用。
* * 将极佳图像品质的描述“*Fabulous!* graphics uses screen shaders for drawing weather, clouds and particles behind translucent blocks and water.[换行]This may severely impact performance for portable devices and 4K displays.”更改为“*Fabulous!* graphics uses screen shaders for drawing weather, clouds and particles behind translucent blocks and water.[换行]This may severely impact performance for portable devices and 4K displays.”。
* * 将高品质图像品质的描述“Fancy graphics balances performance and quality for the majority of machines.[换行]Weather, clouds and particles may not appear behind translucent blocks or water.”更改为“Fancy graphics balances performance and quality for the majority of machines.[换行]Weather, cloudsand particles may not appear behind translucent blocks or water.”。
* * 将“Multiplayer is disabled, please check your launcher settings.”更改为“Multiplayer is disabledlease check your launcher settings.”（）。
* * 将“Unable to switch gamemodeno permission”更改为“Unable to switch gamemodeno permission”（）。
* * 将“Unable to open game mode switcherno permission”更改为“Unable to open game mode switcherno permission”（）。
* * 将“Reload failedkeeping old data”更改为“Reload failedkeeping old data”（）。
* 将多人模式警告信息中的“Mojang”改为“Mojang Studios”。
* 将“流畅”图像品质描述中的“tree-leaves”改为“leaves”。

* *[配方书](配方书.md)**
* 将一些字符串变成大写。
* * 将“Right Click for more”更改为“Right Click for More”。
* * 将“Showing all”更改为“Showing All”。
* * 将“Showing craftable”更改为“Showing Craftable”。
* * 将“Showing smeltable”更改为“Showing Smeltable”。
* * 将“Showing blastable”更改为“Showing Blastable”。
* * 将“Showing smokable”更改为“Showing Smokable”。

* *[字幕](字幕.md)**
* 将一些英文字幕变成大写。
* * 将“Turtle shell thunks”更改为“Turtle Shell thunks”（）。

* *[标签](Java版标签.md)**
* 现在可以使用<code>"required": false</code>将标签内的每一项标记为可选。
* * 例如，<code>values: ["#minecraft:beds", "minecraft:stone"]</code>允许所有[床](床.md)和[石头](石头.md)拥有此标签。也可写成<code>values: [{id: "#minecraft:beds", "required": true}, {id: "minecraft:stone", "required": true}]</code>。将<code>"required"</code>设置为<code>false</code>将使任一项成为可选项。

# 修复
命令的参数<code>angle</code>不使用<code>rotation</code>解析器。
|195119|“经典平坦”超平坦预设中不再生成村庄。
|195582|在聊天栏中输入命令表示一个函数/物品/方块等（即输入需要<code>minecraft:something</code>的地方）时打两个冒号或在一个斜杠后打一个冒号会导致游戏崩溃（比如，或minecraft::|link=none}}）。
}}</onlyinclude>

# 参考

# 导航

[de:20w30a](de:20w30a.md)
[en:Java Edition 20w30a](en:Java Edition 20w30a.md)
[es:Java Edition 20w30a](es:Java Edition 20w30a.md)
[fr:Édition Java 20w30a](fr:Édition Java 20w30a.md)
[ja:Java Edition 20w30a](ja:Java Edition 20w30a.md)
[pt:Edição Java 20w30a](pt:Edição Java 20w30a.md)
[ru:20w30a (Java Edition)](ru:20w30a (Java Edition).md)
[uk:20w30a (Java Edition)](uk:20w30a (Java Edition).md)