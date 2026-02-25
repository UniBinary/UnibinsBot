# 命名空间ID

*页面ID: 43978* | *来源: Minecraft Wiki*

* *命名空间ID（Namespaced identifier）**，或译为**赋命名空间ID**、**（赋）命名空间标识符**，亦称**标识符（Identifier）**<ref>此名称来自25w45a后的Java版游戏源代码</ref>、**资源路径（Resource location）**<ref>[Minecraft Java Edition 1.13 changes](https://gist.github.com/Dinnerbone/7370a2846953eee2d8fc64514fb76de8#file-command_tree-json-L27) – GitHub Gist</ref>、**资源标识符（Resource identifier）**<ref></ref>或**（赋）命名空间字符串（Namespaced string）**<ref>[DataFixerUpper/NamespacedStringType.java at 8b5f82ab78b30ff5813b3a7f3906cd3f4f732acf · Mojang/DataFixerUpper](https://github.com/Mojang/DataFixerUpper/blob/8b5f82ab78b30ff5813b3a7f3906cd3f4f732acf/src/main/java/com/mojang/datafixers/types/constant/NamespacedStringType.java) – GitHub</ref>，是用来指明和识别游戏中特定对象而又能避免潜在的歧义和冲突的一种方式。
<!--
# 定义
命名空间ID在游戏内部定义为<samp>ResourceLocation</samp>，包含如下概念：
* 命名空间分隔符（Namespace Separator）：<code>:</code>
* 默认命名空间（Default Namespace）：<code>minecraft</code>
* Realms命名空间（Realms Namespace）：<code>realms</code>

对于每个命名空间ID实例，主要由以下两个概念组成：
* 命名空间（Namespace）：一个字符串变量。
* 路径（Path）：一个字符串变量。

每次实例化一个新的命名空间ID时，都会读入一个命名空间和路径，当且仅当命名空间和路径都通过验证后才会被成功读入，否则抛出<samp>ResourceLocationException</samp>。所抛出的异常，在静态方法<samp>tryBuild</samp>和<samp>tryParse</samp>中被捕获后将返回一个<samp>null</samp>命名空间ID。
-->

# 定义
命名空间ID主要由以下两部分组成：
* 命名空间（Namespace）：一个字符串，用于标识资源的唯一性。游戏的默认命名空间为<code>minecraft</code>，另外Realms也使用单独的命名空间<code>realms</code>。
* 路径（Path）：一个字符串。在数据包中，一般也反应了该资源的文件路径。有时也仅作为一种标识名。

在转换为字符串形式时，命名空间和路径之间使用<code>:</code>作为分隔符。关于命名空间ID的合法字符以及转换方式，可参见后文。

# 介绍
命名空间ID可使用纯文本字符串表示，用以引用游戏中的[方块](方块.md)、[物品](物品.md)、[实体](实体.md)类型、[配方](配方.md)、[函数](函数.md)、[进度](进度.md)、[标签](Java版标签.md)等对象。特别地，方块状态不使用命名空间ID。

有效的命名空间ID字符串格式为<code>-{}-<*命名空间*>:<*名称*></code>，其中只能使用合法字符。

# = 合法字符 =
# == Java版 ==
命名空间和名称只能包含以下字符：

* <code>0123456789</code> 数字
* <code>abcdefghijklmnopqrstuvwxyz</code> 小写字母
* <code>_</code> 下划线
* <code>-</code> 连字符号
* <code>.</code> 英文句号

以下字符在命名空间中是非法的，但在名称中可以接受：
* <code>/</code> 斜杠
* * 用于划分目录。

命名空间和名称的最好命名方法是小写单词加下划线（<code>snake_case</code>）。

# == 基岩版 ==
ID的命名空间和名称可以包含任何符号，斜杠“<code>/</code>”和冒号“<code>:</code>”除外。

以下字符在命名空间中是非法的，但在战利品表和函数的名称中是可接受的。
* <code>/</code> 斜杠
* * 用于划分目录。

命名空间和名称的最好命名方法是小写单词加下划线（<code>snake_case</code>）。

# = 命名空间ID转换为字符串 =
在生成NBT对象时，若读取到的实体/方块的属性值为命名空间ID类型，则必须转换为符合NBT格式规范的字符串类型。

将命名空间和名称使用<code>:</code>进行连接，即可得到字符串形式的命名空间ID。

例子：

# = 字符串转换为命名空间ID =
命名空间ID总能顺利转换为字符串，而从字符串转换为命名空间ID需要满足一些限制条件，否则转换失败。

限制条件：
* 字符串最多只能有一个<code>:</code>（冒号）。
* 字符串的命名空间和名称部分必须符合[合法字符](#合法字符.md)的限制。
* 如果有<code>:</code>，<code>:</code>前面不能有<code>/</code>或<code>.</code>。

若存在<code>:</code>，其前半部分将作为命名空间，后半部分为名称。

在[Java版](Java版.md)或[基岩版](基岩版.md)的某些地方，若不存在<code>:</code>，<code>minecraft</code>将被作为命名空间，整个转换前的字符串则是名称。

例子：

# 使用
以下对象可以使用命名空间ID来作为标识符：

# = Java版 =
# == 注册表内容 ==

所有使用注册表的对象均使用命名空间ID作为标识符。这既包括各种绝大多数硬编码的游戏元素，也包括绝大多数[数据包](数据包.md)内的元素。

# == 非注册表内容 ==
* *数据包内容**
* [函数](Java版函数.md)
* [结构模板](结构模板.md)
* [标签](Java版标签.md)

* *[资源包](资源包.md)内容**
* [装备模型](装备模型.md)
* [字体](字体.md)
* [烘焙模型](烘焙模型.md)
* [方块状态映射](方块状态映射.md)
* [物品模型映射](物品模型映射.md)
* [声音](声音.md)
* [声音事件引用名](Java版声音事件.md)<!--声音事件是固有注册表不可修改-->
* [着色器](着色器.md)（包含包含着色器和核心着色器）
* 后处理管线
* [纹理](纹理.md)
* [路径点样式](路径点样式.md)

* *其他可修改内容**
* [Boss栏](Boss栏.md)
* [命令存储](命令存储.md)
* [属性修饰符](属性修饰符.md)
* [随机序列](随机序列.md)
* 自定义点击事件标识符
* 后处理管线渲染目标
* [秒表时间](秒表时间存储格式.md)
* [时间标记](时间标记.md)

# = 基岩版 =

* *游戏内置：**
* 原版的方块、物品、实体、状态效果、维度、生物群系、地物等
* 命令的物品组件
* 附加包文件中方块、实体等使用的组件
* 附加包的JSON模式
* GameTest脚本启用的组件

# == 附加包内容 ==
* *行为包内容**
* 方块
* 实体
* 物品
* 生物生成规则
* 生物群系
* 地物
* 地物规则
* 功能域
* 配方
* 结构
* GameTest
* NPC对话场景

* *资源包内容**
* 附着物
* 相机视角
* 粒子效果
* 迷雾设置

# = 实际文件路径 =

命名空间ID指定的对象可能是[资源包](资源包.md)和[数据包](数据包.md)里的文件。

通常，[资源包](资源包.md)和[数据包](数据包.md)中文件的路径是<code>-{}-<*包类型*>/<*命名空间*>/<*对象类型*>/<*名称*>.<*后缀名*></code>，就有相应的形如 <code>-{}-<*命名空间*>:<*名称*></code> 的命名空间ID。所有的<code>/</code>（可能在{{cd|-{}-<*对象类型*>}}或{{cd|-{}-<*名称*>}}中）都是用来划分文件目录的。

<div class="collapsible collapsed collapsetoggle-inline">
对象的类型与<code>-{}-<*包类型*></code>、<code>-{}-<*对象类型*></code>和<code>-{}-<*后缀名*></code>变量的相互转换

<div class="collapsible-content">

</div></div>

注意：资源包中的某些元素不一定依靠具有命名空间ID的对象（如GUI纹理）。

在知道实际文件路径后，就可以通过它知道命名空间ID。同样的，在知道命名空间ID指定的对象的类型后，就可以通过它找到实际文件路径。

<div class="collapsible collapsed collapsetoggle-inline">
一些例子
<div class="collapsible-content">

</div></div>

# 命名空间
的同时一个mod（或地图，或其他）也加入了时来区分它们两个。当你要为某个东西命名时，例如一个战利品表，你还需要指定这个东西所属的命名空间。如果你不指定命名空间，我们默认它是。这意味着和是一回事。|[Dinnerbone](Dinnerbone.md)|命名空间<ref></ref>|Nathan Adams Mojang avatar.png}}

命名空间起到了对资源的隔离作用。它可防止潜在的内容冲突或无意中覆盖了相同名称的对象。

例如，通过修改<code>zombie.json</code>战利品表来改变僵尸的战利品：假设此时没有命名空间存在，那么所有资源都将直接存储于数据包根目录下。此时管理与原版有差异的资源将相当困难——若新增一个<code>zombie.json</code>僵尸战利品表，则必定会完全覆盖掉原版数据包中的僵尸战利品表。使用命名空间，可以有效增加一个不同的<code>zombie.json</code>僵尸战利品表，且数据包作者和游戏都能够很轻松地识别。例如，原版僵尸战利品表位于<code>minecraft</code>命名空间内，而新增的僵尸战利品表位于<code>my_test</code>命名空间内，则这两个僵尸战利品表将被明确地识别为<code>minecraft:zombie</code>和<code>my_test:zombie</code>。

# = <code>minecraft</code>命名空间 =
游戏本身使用<code>minecraft</code>命名空间。当没有指定命名空间时，将默认为<code>minecraft</code>。只有当项目需要覆盖或修改现有的“minecraft”数据或将内容加入到原版标签时，才应该使用<code>minecraft</code>命名空间。比如在<code>minecraft:load</code>[函数标签](Java版标签/函数.md)中加入[函数](函数.md)。

# = 自定义命名空间 =
不同的项目或内容创作（例如[数据包](数据包.md)、[资源包](资源包.md)、[mod](mod.md)等），命名空间应该是不同的。仅当需要覆盖其他项目，或是追加标签的时候，才使用与其他项目相同的命名空间。

为了防止潜在的冲突，命名空间应该尽可能的特殊。
* 避免使用[一堆字母的组合](wikipedia:Alphabet soup (linguistics).md)。例如，一个名为“nuclear craft”的项目不应该使用命名空间<code>nc</code>，因为太简单了。
* 避免使用过于模糊的词语。<code>battle_royale</code>也不能提供便于查找的信息，不过<code>*player_name*_battle_royale</code>会更好些。
这些不当的命名空间都会减少项目的适应程度，并在将多个项目加入到游戏时给调试带来困难。

# = 其他内置的命名空间 =
虽然本地化键名并不使用命名空间ID，但游戏的默认[资源包](资源包.md)声明了命名空间来储存面向[Realms](Realms.md)的[语言文件](资源包#语言.md)（位于{{cd|assets/realms/lang/<*语言代-{}-码*>.json}}），而命名空间储存与游戏相关的语言文件。Realm的jar文件本身也在命名空间中声明了它的语言文件及各种纹理。

在命令参数类型中，还有一个命名空间存在于brigadier中。<ref>[Minecraft Java Edition 1.13 changes](https://gist.github.com/Dinnerbone/7370a2846953eee2d8fc64514fb76de8#file-command_tree-json-L41) – GitHub Gist</ref>

# 历史

|前缀。}}
|
|
|
|
|
|
|
|
|
|
|
|前缀，以支持通过[附加包](附加包.md)加入自定义物品。}}
}}

# 参见
* [Java版数据值](Java版数据值.md)
* [资源包](资源包.md)
* [数据包](数据包.md)

# 参考

# 导航

[de:Namensraum](de:Namensraum.md)
[en:Identifier](en:Identifier.md)
[es:Ubicación de recurso](es:Ubicación de recurso.md)
[fr:Identifiant](fr:Identifiant.md)
[ja:識別子](ja:識別子.md)
[ko:식별자](ko:식별자.md)
[pt:Localização de recurso](pt:Localização de recurso.md)
[ru:Пространство имён идентификаторов](ru:Пространство имён идентификаторов.md)
[uk:Простір імен ідентифікаторів](uk:Простір імен ідентифікаторів.md)