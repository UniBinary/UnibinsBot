# 命令/attribute

*页面ID: 60679* | *来源: Minecraft Wiki*

用于更改或读取[属性](属性.md)。

# 语法
   <code>attribute <target> <attribute> get [<scale>]</code>
  : 返回指定属性的总值。
   <code>attribute <target> <attribute> base get [<scale>]</code>
  : 返回指定属性的基值。
   <code>attribute <target> <attribute> base reset</code>
  : 重置指定属性的基值为默认值。
   <code>attribute <target> <attribute> base set <value></code>
  : 用给定值覆盖指定属性的基值。
   <code>attribute <target> <attribute> modifier add <id> <value> (add_value|add_multiplied_total|add_multiplied_base)</code>
  : 如果已不存在具有相同命名空间ID的修饰符，则添加具有指定属性的属性修饰符。
  <code>attribute <target> <attribute> modifier remove <id></code>
  :删除具有指定命名空间ID的属性修饰符。
  <code>attribute <target> <attribute> modifier value get <id> [<scale>]</code>
  :返回具有指定命名空间ID的修饰符的值。

# 参数

   应用[属性](属性.md)的实体。注意只有[生物](生物.md)才有属性。


   指定[属性](属性.md)的[命名空间ID](命名空间ID.md)。


  用于<code>-{}-/[execute](命令/execute#存储子命令.md) store result</code>命令，将获取的值与该值相乘的数字后再储存（小数会被截断取整）。


  指定[修饰符](属性#修饰符.md)的[命名空间ID](命名空间ID.md)。

   只要多个属性修饰符的ID互不相同，该参数并不影响最终指令的结果。

   指定要使用的值。


<code>add_value|add_multiplied_total|add_multiplied_base</code>
   <code>add_value</code> — 累加值
   <code>add_multiplied_total</code> — 累加总值乘积
   <code>add_multiplied_base</code> — 累加基值乘积

# 结果

# 输出

），小数会被截断取整)}}
），小数会被截断取整)}}
），小数会被截断取整)}}

# 示例
将自己的基础护甲值设定为5：
* <code>/attribute @s minecraft:armor base set 5</code>

将所有玩家的最大生命值设置为1（经典极限生存）：
* <code>/execute as @a run attribute @s minecraft:max_health base set 1</code>

为最近一个玩家的[重力](属性/重力.md)属性添加命名空间ID为的“反重力”属性修饰符。
* <code>/attribute @p minecraft:gravity modifier add test:antigravity -0.16 add_value</code>

移除最近一个玩家的“反重力”属性修饰符。
* <code>/attribute @p minecraft:gravity modifier remove test:antigravity</code>

将最近一个玩家的重力属性基值重置为默认值。
* <code>/attribute @p minecraft:gravity base reset</code>

# 历史

|。}}
|改为。}}
|
|
|
}}

# 导航

[de:Befehl/attribute](de:Befehl/attribute.md)
[en:Commands/attribute](en:Commands/attribute.md)
[es:Comandos/attribute](es:Comandos/attribute.md)
[ja:コマンド/attribute](ja:コマンド/attribute.md)
[pt:Comandos/attribute](pt:Comandos/attribute.md)