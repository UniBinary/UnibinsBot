# Java版24w14a

*页面ID: 116831* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w14a**是[Java版1.20.5](Java版1.20.5.md)的第15个，也是最后一个快照，发布于2024年4月3日<ref></ref>，启动游戏所需Java版本从17提升至21、所需操作系统从32位提升至64位，并修复了一些漏洞。

# 更改
# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>38</code>。

* *[战利品表函数](战利品表函数.md)**
* <code>set_attributes</code>函数：
* * 加入了<code>replace</code>字段，默认为<code>true</code>。
* ** <code>false</code>时，属性会附加。

* *[物品堆叠组件](物品堆叠组件.md)**
* 物品堆叠组件：
* * 未过滤的JSON文本原始信息<code>text</code>被重命名为<code>raw</code>以避免歧义。
* 物品堆叠组件：
* * 现在指定<code>id</code>而不指定<code>name</code>时，可由UUID直接解析[玩家](玩家.md)档案数据。

* *[options.txt](options.txt.md)**
* 移除了<code>skipRealms32bitWarning</code>。

* *[闪烁标语](闪烁标语.md)**
* 将“Java 16 + 1 = 17!”闪烁标语改为“Java 16 + 1 + 4 = 21!”。

* *Java版本**
* 现在启动游戏要求的最低Java版本为21，且需要64位操作系统。
* 现在使用的Java发行版为[Microsoft](wzh:微软.md)构建的OpenJDK 21.0.2。

# 更改（实验性）
# = 方块 =
* *[沉重核心](沉重核心.md)**
* 现在其合适挖掘工具是[镐](镐.md)。

# = 生物 =
* *[旋风人](旋风人.md)**
* 现在不再反弹由[风弹](风弹.md)物品产生的风弹。

* *[盔甲架](盔甲架.md)**
* 带有[盘丝](盘丝.md)状态效果的盔甲架死亡后不再生成[蜘蛛网](蜘蛛网.md)。<ref></ref>

# = 常规 =
* *[标签](Java版标签.md)**
* 向方块标签中加入了。

# 修复
”屏幕使用背景模糊。
|269482|战利品表函数<code>set_attributes</code>不再能被默认属性修饰符替换。
|269503|使用获取山羊角时，其默认乐器丢失。
|269553|带有空魔咒NBT标签的物品不能如预期升级。
|269596|现存物品的<code>EntityTag</code>未能升级至<code>entity_data</code>组件。
|269644|将最大堆叠数量超过64的物品放入收纳袋时，游戏崩溃。
|269677|可过滤的<code>text</code>字段与文本组件冲突。
|269684|命令接受的堆叠大小最大值被限制于64。
|269700|的物品数被默认堆叠大小限制。
|269716|无法在配方书中使用+单击合成最多可制作的物品。
|;prev
|269960|+键不能正常复制容器数据。
|269983|当<code>id</code>存在时，不会计算玩家的头数据。
|269991|龙息粒子看起来异常。
|270002|区域效果云产生预期粒子的同时还产生白色旋涡粒子。
|270061|+键不能正常复制试炼刷怪笼数据。
|270162|尝试升级1.12.2及更低版本的世界时游戏崩溃。
|270187|命令方块的NBT不能在第二次保存前复制。
}}</onlyinclude>

# 参考

# 导航

[de:24w14a](de:24w14a.md)
[en:Java Edition 24w14a](en:Java Edition 24w14a.md)
[es:Java Edition 24w14a](es:Java Edition 24w14a.md)
[fr:Édition Java 24w14a](fr:Édition Java 24w14a.md)
[ja:Java Edition 24w14a](ja:Java Edition 24w14a.md)
[lzh:二四週一四甲](lzh:二四週一四甲.md)
[pt:Edição Java 24w14a](pt:Edição Java 24w14a.md)
[ru:24w14a (Java Edition)](ru:24w14a (Java Edition).md)
[uk:24w14a (Java Edition)](uk:24w14a (Java Edition).md)