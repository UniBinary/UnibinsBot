# Java版18w03a

*页面ID: 33439* | *来源: Minecraft Wiki*

<onlyinclude>

* *18w03a**是[Java版1.13](Java版1.13.md)的第14个快照，发布于2018年1月17日<ref></ref>，更新了游戏内的翻译文件，并修复了一些漏洞。

# 新内容
# = 常规 =
* *翻译**
* 使用了Crowdin的新翻译。

# 更改
# = 生物 =
* *[马](马.md)**
* 再次更新了马的模型。

# = 命令格式 =
* *常规**
* 改善了命令的解析与数据包的载入。
* 改善了命令的执行。

* ***
* 加入了。
* ***
* 的<code>-{}-标签路径</code>现在也可以非数字标签使用。
* * 查询字串将回传该字串的字元数量作为命令的<code>result</code>。
* * 查询列表将回传该列表的元素数量作为命令的<code>result</code>。
* * 查询复合标签将回传该复合标签的标签数量作为命令的<code>result</code>。
* ***
* 加入了作为该命令的一个简写。
* * <code>指定位置</code>、<code>-{}-飞行速度</code>和<code>-{}-粒子数量</code>将预设为0。

# 修复
配置启动游戏时游戏崩溃。
|124072|命令的性能问题。
|;previous
|124113|末影龙Boss栏上显示的名字不正确。
|124115|命令的候选提示中会出现<code>minecraft:player</code>和<code>minecraft:fishing_bobber</code>。
|124116|执行命令时返回意外错误。
|124120|执行命令时返回意外错误。
|124122|格式的数据包不能被加载。
|124124|命令不能正常工作。
|124138|在带<code>facing</code>参数的命令中使用局部坐标（例如：<code>^ ^ ^5</code>）依旧需要指定实体。
|124150|与实体相关的服务器警告消息输出的是<code>TextComponent</code>或<code>TranslatableComponent</code>对象而不是实体名称。
|124179|翻译文本显示的是经UTF-8编码后的内容。
|124222|每次执行只包含<code>run</code>子命令的命令或时，其实体选择器都至少会选中一个实体。
|124256|<code>reducedDebugInfo</code>游戏规则需要重新登录才能生效。
|124286|以NBT作为数据的<code>show_entity</code>的悬停事件（Hover event）会导致游戏崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:18w03a](de:18w03a.md)
[en:Java Edition 18w03a](en:Java Edition 18w03a.md)
[es:Java Edition 18w03a](es:Java Edition 18w03a.md)
[fr:Édition Java 18w03a](fr:Édition Java 18w03a.md)
[ja:Java Edition 18w03a](ja:Java Edition 18w03a.md)
[nl:18w03a](nl:18w03a.md)
[pt:Edição Java 18w03a](pt:Edição Java 18w03a.md)
[ru:18w03a (Java Edition)](ru:18w03a (Java Edition).md)