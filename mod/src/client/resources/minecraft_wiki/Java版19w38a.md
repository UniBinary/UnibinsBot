# Java版19w38a

*页面ID: 47731* | *来源: Minecraft Wiki*

</ref>}}
<onlyinclude>

* *19w38a**是[Java版1.15](Java版1.15.md)的第5个快照，发布于2019年9月18日<ref name="19w38a"></ref>，更新了命令、、、实体选择器、谓词、实体谓词、定位谓词以及战利品表，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 现在可以将<code>storage</code>作为目标，使用通用的键值对存储。
* * 每个都可以通过独立的[命名空间ID](命名空间ID.md)区分。
* * 该在同一世界的所有[维度](维度.md)里共享。
* * 中的数据在重新加载中仍然存在。

* ***
* 加入了子命令。
* * 核算定义在[数据包](数据包.md)路径下<code>predicates</code>中的自定义[谓词](谓词.md)。
* 加入了子命令。
* * 将命令的执行结果存储至的[](命令存储.md)目标中。

* ***
* 加入了新的可选语法replace]}}。
* * 默认为。
* 加入了新的语法以移除已有的操作。
* * 返回已移除的操作数。
* 拓展了以便多次对相同函数进行操作。

* *实体选择器**
* 新的选择器参数<code>predicate</code>允许应用定义在[数据包](数据包.md)路径下<code>predicates</code>中的自定义谓词。

# = 常规 =
* *[谓词](谓词.md)**
* 加入了自定义谓词。
* * [战利品表](战利品表.md)的谓词部分现在可以被定义为<code>predicates</code>目录下单独的数据包资源。

* *实体谓词**
* 现在接受检查玩家属性的<code>player</code>字段。
* * 在实体不是[玩家](玩家.md)时失败。
* * 字段：
* ** <code>level</code> – 允许的玩家等级范围。
* ** <code>gamemode</code> – 与命令相同的值
* ** <code>stats</code> – 要匹配的统计信息列表。接受的字段：（例如）、（例如）和（整型的）。
* *** 例如，如果玩家使用钓鱼竿共2-10次，<code>{"stats":[{"type":"minecraft:used","stat":"minecraft:fishing_rod","value":{"min":2,"max":10}}]}</code>会成功，次数小于2或大于20则会导致失败。
* ** <code>recipes</code> – 合成配方ID表。一个布尔值表示玩家是否解锁此配方。
* ** <code>advancements</code> – 成就ID表。如果其值的类型为布尔类型，将执行成就完成情况的检查。如果值为对象，检查准则的完成度。
* 实体谓词现在允许使用<code>team</code>字段以匹配队名。

* *定位谓词**
* 现在接受<code>block</code>与<code>fluid</code>子谓词。
* * 字段：
* ** <code>block</code> – 精确匹配[方块](方块.md)ID。
* ** <code>fluid</code> – 精确匹配[流体](流体.md)ID。
* ** <code>tag</code> – 匹配方块/流体ID。
* ** <code>nbt</code> – 匹配方块NBT（仅方块）。
* ** <code>state</code> – 名称/值的属性映射。值可以是整型、布尔值、字符串或具有可选的最小和最大属性的对象。
* 现在可以接受<code>light</code>子predicate。
* * 对象拥有一个整型范围——<code>light</code>——用于匹配可见光（天空变暗和方块亮度的最大值）。

* *战利品表**
* 战利品表谓词现在能在独立文件定义并被实体选择器在<code>execute if</code>命令中使用。
* 在<code>location_check</code>条件中加入了新参数选项。
* * <code>offsetX</code>、<code>offsetY</code>、<code>offsetZ</code> – 位置的可选偏移量。
* 加入了<code>reference</code>。
* * 其导入数据包中<code>predicate</code>路径下定义的条件，通过name参数选择。
* 加入了<code>time_check</code>条件。
* * 检测一天的[时间](时间.md)。
* ** <code>value</code> – 可接受值的范围。
* ** <code>period</code> – 如果存在，则时间将模除以这个值（例如，如果将该值设置为24000，则该值将以天为周期运行）。

# 更改
# = 方块 =
* *常规**
* 方块的轮廓（十字准星对准的方块所显示的黑边）现在颜色更深了。

# = 命令格式 =
* ***
* 将游戏规则设置为后，现在也会免除[岩浆块](岩浆块.md)造成的伤害。

* ***
* 若不给定参数，则第一个参数现在的默认值为。

# = 常规 =
* *[调试屏幕](调试屏幕.md)**
* 不再显示第二行“区块更新（chunk updates）”的计数器。

# 修复
禁用火焰伤害不会避免岩浆块伤害。
}}</onlyinclude>

# 参考

# 导航

[cs:19w38a](cs:19w38a.md)
[de:19w38a](de:19w38a.md)
[en:Java Edition 19w38a](en:Java Edition 19w38a.md)
[es:Java Edition 19w38a](es:Java Edition 19w38a.md)
[fr:Édition Java 19w38a](fr:Édition Java 19w38a.md)
[it:Java Edition 19w38a](it:Java Edition 19w38a.md)
[ja:Java Edition 19w38a](ja:Java Edition 19w38a.md)
[pt:Edição Java 19w38a](pt:Edição Java 19w38a.md)
[ru:19w38a (Java Edition)](ru:19w38a (Java Edition).md)