# Java版17w49a

*页面ID: 33276* | *来源: Minecraft Wiki*

<onlyinclude>

* *17w49a**是[Java版1.13](Java版1.13.md)的第9个快照，发布于2017年12月6日<ref></ref>，加入了标签，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* *[标签](Java版标签.md)**
* 物品和方块可以用一个ID联结。
* * 方块标签可以用于检测世界内的方块。
* * 物品标签可以用于检测物品栏物品。
* 标签创建于[数据包](数据包.md)的或。
* * 例如：
* * 这会创建名为<code>-{}-(命名空间):foo</code>的方块标签。
* * 此json文件包括所有要联结起来的方块的列表。
* 有两种默认的标签，都能对应物品与方块形式： <code>minecraft:wool</code>对应所有羊毛，<code>minecraft:planks</code>对应所有木板方块。

# 更改
# = 游戏内容 =
* *配方**
* 配方现在能指定标签而不仅是单个物品。

# 修复
键会选中创造模式物品栏中的搜索框或配方书，并输入字符。
|121648|设置中的难度设置没有被翻译，且全部被小写。
|121665|按键“无”显示为<code>key.keyboard.-1</code>。
|121705|打开GUI并移动鼠标时，指针偏离鼠标的实际位置。
|121709|用于排序统计菜单的可点击区域不在正确的位置上。
|121718|玩家不能选择旁观者菜单。
|121808|单个实体的命令参数验证在某些错误消息中表示的是玩家。<!-- Command argument validation for single entity says player in some error messages. -->
|121873|信标GUI的暗色背景缺失。
|122148|不显示方块、物品、生物、GUI和其他纹理，且不播放声音。
|122173|由于<code>:</code>，无法创建统计的记分板项。
|122295|专用服务器的备份文件夹会被创建在服务器文件夹外。
|122309|命令无法键补全函数名称。
|122314|在以前版本中创建的地图现在都是一样的。
|122355|破坏旗帜时崩溃：<code>java.lang.ClassCastException: arw cannot be cast to aru.</code>
|122383|先前存在的箱子不可见且重叠。
|122395|自定义玩家头颅被称为<code>block.minecraft.player_headnamed</code>。
|122410|在补全列表内，键不能反方向选择。
|122521|损坏的铁砧总朝向北方。
|122536|战利品表中的<code>set_nbt</code>函数不会把NBT合并到物品上。
|122558|带血量条件的记分板不再使用红心表示数值。
|122573|由地毯和黏性活塞导致的崩溃问题。
|122584|统计中，格式字符串的顺序不正确。
|122666|<code>options.txt</code>中<code>lang:en_US</code>一行中的大写部分会阻止资源被加载。
|;previous
|122618|配方不能用键补全。
|122624|按键不再能在可能的命令值中循环选择。
|122639|不能在冰上放置睡莲。
|122643|雪、地毯和阳光探测器会剔除相邻的上半台阶。
|122644|数据包不能替换原版配方。
|122646|玻璃板顶部和底部的剔除面不工作。
|122650|玩家头颅不受升级路径影响，被重命名至<code>block.minecraft.player_headnamed</code>+头部纹理不显示，只在放置时显示。<!-- Player heads aren't affected by upgrade paths, renamed to "block.minecraft.player_headnamed" + head texture does not show, only when placed. -->
|122718|“视频设置”菜单中，泥土边界对设置的侵占过多。
|122907|巨大的图形复制自定义配方漏洞。<!-- An enormous graphical duplicating custom recipe bug. -->
|122944|命令不能更新显示名称。
}}</onlyinclude>

# 参考

# 导航

[de:17w49a](de:17w49a.md)
[en:Java Edition 17w49a](en:Java Edition 17w49a.md)
[es:Java Edition 17w49a](es:Java Edition 17w49a.md)
[fr:Édition Java 17w49a](fr:Édition Java 17w49a.md)
[ja:Java Edition 17w49a](ja:Java Edition 17w49a.md)
[nl:17w49a](nl:17w49a.md)
[pt:Edição Java 17w49a](pt:Edição Java 17w49a.md)
[ru:17w49a (Java Edition)](ru:17w49a (Java Edition).md)