# Java版18w05a

*页面ID: 33481* | *来源: Minecraft Wiki*

<onlyinclude>

* *18w05a**是[Java版1.13](Java版1.13.md)的第16个快照，发布于2018年1月31日<ref></ref>，为命令加入了新的参数，加入了新的命令，更新了命令UI和翻译文件，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 可创建一个Boss栏。
* * <code>-{}-boss栏</code>用来指定Boss栏<code>namespace:name</code>，例：<code>foo:bar</code>。如果没有<code>namespace</code>则默认为<code>minecraft</code>。
* * <code>-{}-显示名称</code>是Boss栏的显示名称，只接受JSON语法。
* 可以更改Boss栏的名字。
* greenpinkpurpleredwhiteyellow)}}可用来更改Boss栏与该名称的颜色（修改文字颜色只限于当没有在文字格式中指定它的颜色时），默认为<code>white</code>。
* notched_12notched_20notched_6progress)}}能改变boss栏的样式，默认为<code>progress</code>。
* * 可以设为以下的样式：<code>notched_6</code>、<code>notched_10</code>、<code>notched_12</code>、<code>notched_20</code>或<code>progress</code>。
* * <code>notched</code>会设定boss栏在视觉上的分段数。
* * <code>progress</code>会设置为1段，也就是直长条。
* 会改变boss栏的当前值，默认为<code>0</code>。
* 会设置boss栏的最大值，默认为<code>100</code>。
* 会设定boss栏是否可见，默认为<code>true</code>。
* 会设定那些玩家可以看见boss栏，默认为无人可看见。
* 会把整个目标boss栏给移除。
* 会显示所有存在的boss栏。
* playersvaluevisible)}}会回传值作为命令的 <code>result</code>
* ***
* 新的子命令：success) bossbar <目标boss栏> (valuemax) <连锁子命令>}}。
* * 将会储存指定运行命令的<code>result</code>或<code>success</code>为boss栏的<code>value</code>当前值或<code>max</code>最大值设定。
* *常规**
* 为命令UI增加了基本的目标选择器。

# 更改
# = 常规 =
* *[Crowdin](Crowdin.md)**
* 更新了翻译。

# 修复
命令时，相对位置的基点是离开载具时落地的位置。
|57332|所有命令中的数字参数都是整型值。
|58556|破坏一个正在被活塞移动的方块时会产生缺失纹理的粒子。
|60117|玩家站在下半台阶上时，不能在此方块以上两格高处放置上半台阶。
|64919|玩家可以在站立于T形玻璃板、铁栏杆和栅栏的判定箱内时，透过它们放置方块。
|65774|摔落在头颅上时，粒子不显示。
|88674|生长在除沙子和红沙以外的方块上的仙人掌会掉落两个物品，而不是被破坏。
|89634|命令更倾向于把玩家分散到负坐标处。
|105591|用打火石或火焰弹点火而没点着火时，打火石的耐久或火焰弹会被消耗。
|120296|不能重载中的数据。
|;dev
|123460|数据包和资源包的文件在解析时的JSON解析异常没有被正确捕获。
|124048|在命令（或任意命令？）最后有空格时按键补全会发生错误。
|124056|和命令的成员/目标/多个目标的参数不能用键补全玩家名称。
|;previous
|124360|指定<code>scale</code>参数时，命令的回显使用了操作系统的区域设置。
|124379|数据包加载的函数不可靠。
|124384|触发器类型的记分项是默认被启用的。
|124499|缺失成功触发触发器的命令回显。
|124616|命令的建议以秒为单位，但实际是以分钟为单位。
}}</onlyinclude>

# 参考

# 导航

[de:18w05a](de:18w05a.md)
[en:Java Edition 18w05a](en:Java Edition 18w05a.md)
[es:Java Edition 18w05a](es:Java Edition 18w05a.md)
[fr:Édition Java 18w05a](fr:Édition Java 18w05a.md)
[hu:18w05a](hu:18w05a.md)
[ja:Java Edition 18w05a](ja:Java Edition 18w05a.md)
[nl:18w05a](nl:18w05a.md)
[pt:Edição Java 18w05a](pt:Edição Java 18w05a.md)
[ru:18w05a (Java Edition)](ru:18w05a (Java Edition).md)