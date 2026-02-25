# Java版标签/函数

*页面ID: 159745* | *来源: Minecraft Wiki*

* *函数标签（Function Tags）**是[函数](Java版函数.md)的组合。

# 使用

函数标签可以在命令中使用，所有在该标签中指定的函数都会按照它们第一次出现的顺序执行。即使一个函数在标签以及子标签中被多次引用，它也只会被执行一次。

游戏内部定义了两个标签，在<code>#tick</code>标签中标记的函数将会在每游戏刻的开始时执行，在<code>#load</code>标签中标记的函数将会在服务器加载及重载后的第1游戏刻开始时执行1次。

原版数据包中不存在任何使用了函数标签的文件，但允许在原版命名空间<code>minecraft</code>中使用这些函数标签来驱动其他函数。

# 当前版本
# = load =
该标签中的函数仅在服务端启动后的第一刻执行一次。

# = tick =
该标签中的函数在世界中每一刻开始的时候都会执行一次。

# 历史

|。}}
|。}}
|
|</ref>}}
|目录重命名为。}}
}}

# 参考

# 导航

[Category:数据包](Category:数据包.md)

[en:Function tag (Java Edition)](en:Function tag (Java Edition).md)
[fr:Tag de fonction (Édition Java)](fr:Tag de fonction (Édition Java).md)
[uk:Теґ функцій (Java Edition)](uk:Теґ функцій (Java Edition).md)