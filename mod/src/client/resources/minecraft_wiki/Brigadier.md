# Brigadier

*页面ID: 43168* | *来源: Minecraft Wiki*

}}

</ref>|Nathan Adams Mojang avatar.png}}

* *Brigadier**（意为“-{准}-将”）是一个为[Java版](Java版.md)设计和开发的[命令](命令.md)读取执行库，<ref></ref>主要由[Dinnerbone](Dinnerbone.md)维护。<ref></ref>它是Mojang以开源许可放出的第一个Java版使用的库。<ref></ref>

# 用途
Brigadier可以用来读取和执行字符串命令。

# = 特性 =
* 命令节点可由变量或直接量分支定义。
* * [Java版中所有的命令](命令#命令列表及其概述.md)实际上均为根命令节点的直接量分支，而非实际执行的命令。<ref></ref>
* 命令来源可由命令上下文修改/复制。
* * 多个实体被[目标选择器](目标选择器.md)选定时，可以将命令来源也修改为多个。
* 命令解析时动态检查错误。<ref></ref>
* 枚举当前命令节点可能到达的所有命令。<ref></ref>
* 命令执行成功/失败时的结果即时处理。
* * 支持将命令结果存储至[方块](方块实体数据格式.md)、[实体](实体数据格式.md)的NBT数据或者[记分板](记分板.md)。
* 命令节点的递归重定向。
* * 会重定向到原版游戏命令调度器的根节点。

# 内容
# = 字符串读取器 =
Brigadier实现了解析器用于解析命令字串。

其通过游标（cursor）以逐字读取字符串。当游标值增加时，可看作游标向主字符串末尾方向移动。

其提供一系列方法方便游戏读取命令字串。并内建解析引号括起的字符串，支持反斜杠转义，及一些基础的数字、布尔值解析器。

# 历史
中提到Brigadier。}}
||Dinnerbone披露未来将有一个未混淆的叫“Brigadier”的命令读取库。}}
|
|
||Brigadier现以MIT许可开源。<ref>["Preparation for OSS :)" - Preparing for the open source software](https://github.com/Mojang/brigadier/pull/8#issue-217673918)  – Mojang/brigadier – GitHub</ref>}}
|</ref>}}
}}

# = 版本历史 =
<!-- Uncomment when dfu page is done
# See also
* [Data Fixer Upper](Data Fixer Upper.md): 另一个开源库，用于在不同数据版本之间更新[Java版](Java版.md)存档。
-->

# 参考

# 导航

[en:Brigadier](en:Brigadier.md)
[fr:Brigadier](fr:Brigadier.md)
[ja:Brigadier](ja:Brigadier.md)
[pt:Brigadier](pt:Brigadier.md)