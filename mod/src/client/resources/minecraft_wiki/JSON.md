# JSON

*页面ID: 30001* | *来源: Minecraft Wiki*

* *[JavaScript对象表示法](wzh:JSON.md)（JSON，JavaScript Object Notation）**是一种轻量级数据交换格式。<ref>https://www.json.org/json-zh.html</ref>

Minecraft使用JSON来储存以下数据：

* 在[成书](成书.md)、[告示牌](告示牌.md)、自定义名称以及和命令里的[文本](文本组件格式.md)。
* 描述Java版中[资源包](资源包.md)和[数据包](数据包.md)的<code>pack.mcmeta</code>文件。
* 描述基岩版[附加包](附加包.md)的<code>manifest.json</code>。
* 在资源包里定义[模型](模型.md)、[声音事件](声音事件.md)和的文件。
* 在行为包中定义[实体行为](基岩版实体文档.md)的文件。
* [进度](进度.md)和[统计](统计.md)（例如<code>.minecraft/saves/*/data/stats/*.json</code>）。
* 用于[启动器](启动器.md)的[档案数据](launcher profiles.json.md)（例如<code>.minecraft/[launcher profiles.json](launcher profiles.json.md)</code>）。
* 关于已下载的[版本](版本.md)的信息（例如<code>-{}-.minecraft/versions/<版本>/[<游戏版本>.json](client.json.md)</code>）。
* 在数据包中定义[进度](进度.md)、[战利品表](战利品表.md)、[标签](Java版标签.md)、[配方](配方.md)、[维度](维度.md)、[维度类型](维度类型.md)、[谓词](谓词.md)等内容的文件。

# JSON语句规范
本条目主要描述Minecraft中的JSON语句规范，可能与JSON的原始标准定义有所区别。虽然JSON可以写在一行内，但是一般为了可读性会加入缩进和换行。

对于具体细节，参考ECMA的JSON标准<ref>https://ecma-international.org/wp-content/uploads/ECMA-404_2nd_edition_december_2017.pdf</ref>。

# = JSON文本 =
JSON文本是一组符合JSON数据值语法的，由万国码（Unicode）代码点组成的符号序列。这些符号包括六类结构化符号、字符串、数字值以及三类字面量符号。

六类结构化符号：
* ：左方括号。
* ：左花括号。
* ：右方括号。
* {{cd|<nowiki>}</nowiki>}}：右花括号。
* ：冒号。
* ：逗号。

三类字面量符号：
* 。
* 。
* 。

其中，未在Minecraft的数据包标准文件中使用。

# = JSON数据值 =
JSON数据值类型可以为：（object）、（array）、（string）、（number）或（boolean）。

# == 对象 ==
一个对象，以左右花括号作为首尾，包含0个或若干个键值对。每个键都为一个字符串，其后都使用一个冒号与值相连接。多个不同的键值对间以逗号分隔。对象中所有键值对都由一个键名唯一确定，不能出现同名键。键值对中的值也可以是任意的JSON数据值类型。

<syntaxhighlight lang="json" line="1">
{
    "Bob": {
        "ID": 1234,
        "lastName": "Ramsay"
    },
    "Alice": {
        "ID": 2345,
        "lastName": "Berg"
    }
}
</syntaxhighlight>

# == 数组 ==
一个数组，以左右方括号作为首尾，包含0个或若干个以逗号隔开的数据值。与NBT中的不同，JSON数组中的数据值可以为不同的数据类型。

<syntaxhighlight lang="json">
["Bob", "Alice", "Carlos", "Eve"]
</syntaxhighlight>

# == 字符串 ==
每个字符串都被一对双引号所括，其中包含任意字符的组合。某些特殊字符需要通过反斜杠<code>\</code>进行转义。

*
*
*

# == 数字 ==
连续输入键盘上的任意数字即可得到一个数值。数值可以加入小数点以表示小数，也可以使用<code>e</code>表示指数。

*
*
*  (=3×10<sup>6</sup>)

# == 布尔 ==
布尔值只能为<code>true</code>或<code>false</code>。

<syntaxhighlight lang="json" line="1">
{
    "Steve": {
        "isAlive": true
    },
    "Alex": {
        "isAlive": false
    }
}
</syntaxhighlight>

# 序列化
* *序列化（Serialization）**也即**串行化**，是一种将内存程序转换为方便网络传输和数据存储的方法。在Minecraft中，许多与数据包有关的内容都可以被序列化为JSON格式。所以JSON也是一种用来表示游戏内程序对象的一种文本格式。

在数据包被加载时，游戏会尝试将数据包内的JSON文件**反序列化（Deserialization）**以尝试在内存中还原出一个相应的程序对象。对于JSON所描述的各种JSON数据，基本都要再经过游戏程序本身进行验证——多余的JSON对象可能会被直接丢弃，且会对原JSON数值的范围进行重新计算。在一些严格的验证条件下，这可能导致一些非法的JSON值在数据包加载期间使游戏抛出异常，从而阻断数据包的正常加载。另外，由于要还原出一个完整的程序对象，必须使用JSON给出所有“必要”的对象属性值，否则也会导致加载异常。

# 参考

# 导航

[Category:开发](Category:开发.md)

[de:JSON](de:JSON.md)
[en:JSON](en:JSON.md)
[es:JSON](es:JSON.md)
[fr:JSON](fr:JSON.md)
[ja:JSON](ja:JSON.md)
[lzh:JSON](lzh:JSON.md)
[pt:JSON](pt:JSON.md)
[ru:Команды консоли#JSON-текст](ru:Команды консоли#JSON-текст.md)
[th:JSON](th:JSON.md)
[uk:JSON](uk:JSON.md)