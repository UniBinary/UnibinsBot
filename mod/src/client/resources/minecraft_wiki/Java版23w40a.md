# Java版23w40a

*页面ID: 106226* | *来源: Minecraft Wiki*

<onlyinclude>

* *23w40a**是[Java版1.20.3](Java版1.20.3.md)的首个快照，发布于2023年10月4日<ref></ref>，改进了盾牌，更改了聊天组件序列化，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了下列伤害类型标签：
* * ：。
* ** 拥有该标签的伤害类型能一击破坏盔甲架。
* 加入了下列实体类型标签：
* * ：。
* ** 拥有该标签的生物不会溺水。
* * ：.
* * ：。

# 更改
# = 方块 =
* *[饰纹陶罐](饰纹陶罐.md)**
* 现在当方块状态<code>cracked</code>为<code>true</code>时，无论用何种方式破坏，饰纹陶罐都会碎裂。

# = 物品 =
* *[盾牌](盾牌.md)**
* 现在玩家使用盾牌格挡时，持盾的手臂将在第三人称视角下跟随玩家的视角转动。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>19</code>。

* *[文本组件格式](文本组件格式.md)**
* 纯文本聊天组件（只有文本内容，无并列的组件，无格式）现在总会被序列化成字符串，而非<code>-{}-{"text": "*字符串*"}</code>。
* 聊天组件现在会在通过网络发送时序列化。
* 聊天组件现在允许有可选的<code>type</code>值（包括），以提升解析与错误检查的速度。
* <code>id</code>字段若采用<code>show_entity</code> <code>hoverEvent</code>格式，可接受4个整型值所构成的数组形式的UUID。
* <code>translate</code>组件内的数值与布尔型参数不再被转换成字符串。
* 不再支持下列JSON文本表达式：
* * <code>null</code>
* * <code>[]</code>
* 若下列类型字段中出现错误，现在将不再被静默忽略：
* * <code>color</code>
* * <code>clickEvent</code>
* * <code>hoverEvent</code>
* * <code>hoverEvent[action=show_entity].contents.name</code>
* * <code>hoverEvent[action=show_item].contents.tag</code>

* *[标签](Java版标签.md)**
* 向实体类型标签中加入了。

# 修复
</onlyinclude>

# 参考

# 导航

[de:23w40a](de:23w40a.md)
[en:Java Edition 23w40a](en:Java Edition 23w40a.md)
[es:Java Edition 23w40a](es:Java Edition 23w40a.md)
[fr:Édition Java 23w40a](fr:Édition Java 23w40a.md)
[ja:Java Edition 23w40a](ja:Java Edition 23w40a.md)
[lzh:二三週四〇甲](lzh:二三週四〇甲.md)
[pt:Edição Java 23w40a](pt:Edição Java 23w40a.md)
[ru:23w40a (Java Edition)](ru:23w40a (Java Edition).md)
[uk:23w40a (Java Edition)](uk:23w40a (Java Edition).md)