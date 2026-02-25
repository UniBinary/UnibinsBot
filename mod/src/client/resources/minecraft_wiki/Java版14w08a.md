# Java版14w08a

*页面ID: 33892* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w08a**是[Java版1.8](Java版1.8.md)的第13个快照，发布于2014年2月19日<ref></ref>，修复了一些漏洞。

# 更改
# = 方块 =
* *[活板门](活板门.md)**
* 原有的活板门被重命名为“木活板门”。

# = 命令格式 =
* ***
* 现在会将数值返回到运行命令的命令方块中。

# = 游戏内容 =
* *[超平坦](超平坦.md)世界**
* 超平坦预设现在使用新的方块ID格式。
* 层数格式里的方块ID/数字从<code>NumberxID</code>变为<code>Number*ID</code>。
* 预设版本号数字变为“3”。

# = 常规 =
* *玩家列表**
* 改进了生命值目标在列表中的展示。
* 如果空间不足，则会通过颜色（绿/黄/红）来表示不同程度的生命值。
* 额外的生命值将使图标挤在一起来适应空间。

# 修复
命令可以得到具有不完整NBT标签的物品，此物品可以导致游戏崩溃。
|32434|各种豹猫生成的问题。
|32867|染色粘土块下方有栅栏时，其表现的像木头一样。
|38014|当命令中的原方块处理方式被设置为替换时，被替换的容器中的物品仍然会掉落。
|40986|使用命令导致崩溃（<code>stat.entityKilledBy</code>）。
|46329|Realms的玩家数统计不再更新。
|47857|Realms里备份界面中的“否”按钮不工作。
|;dev
|44347|结构在不正确的群系里生成。
|44364|多人游戏中，箱子没有动画。
|44382|命令对告示牌不起作用。
|44651|选择器<code>@e</code>在命令方块界面中没有对应的描述。
|45114|超平坦世界自定义选项中仍然使用方块ID。
|45674|农民只种小麦。
|46457|玩家会在世界边界上被卡住。
|;previous
|48386|铁活板门显示的名称是<code>tile.ironTrapdoor.name</code>。
|48395|在水中游泳时，玩家不会被淹死。
|48399|命令不遵守<code>commandBlockOutput false</code>规则。
|48408|<code>Hopper: java.lang.NullPointerException: Handling packet</code>。
|48411|<code>java.lang.NullPointerException: Exception in server tick loop</code>。
|48414|玩家的名牌在背包界面中也会显示。
|48449|形式的命令不能正确更新比较器。
|48464|命令中对象参数不能使用键补全。
|48507|命令在命令中不工作。
|48509|没有办法隐藏OP或实体执行的命令的提示信息。
|48515|在水中移动时有光照错误。
|48955|洞穴蜘蛛在水下可以呼吸。
|49019|部分NBT数据匹配中断了对空容器的检查。
}}</onlyinclude>

# 参考

# 导航

[de:14w08a](de:14w08a.md)
[en:Java Edition 14w08a](en:Java Edition 14w08a.md)
[es:Java Edition 14w08a](es:Java Edition 14w08a.md)
[fr:Édition Java 14w08a](fr:Édition Java 14w08a.md)
[ja:Java Edition 14w08a](ja:Java Edition 14w08a.md)
[nl:14w08a](nl:14w08a.md)
[pt:Edição Java 14w08a](pt:Edição Java 14w08a.md)
[ru:14w08a (Java Edition)](ru:14w08a (Java Edition).md)
[uk:14w08a (Java Edition)](uk:14w08a (Java Edition).md)