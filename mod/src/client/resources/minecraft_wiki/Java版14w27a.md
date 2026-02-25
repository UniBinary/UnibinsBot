# Java版14w27a

*页面ID: 33069* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w27a**是[Java版1.8](Java版1.8.md)的第32个快照，发布于2014年7月2日<ref></ref>，加入了兔子及其掉落物、兔肉煲、生/熟羊肉、跳跃药水和新的NBT标签，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 加入了兔子刷怪蛋。
* * 用于生成[兔子](兔子.md)。
* * 棕色底色并带棕色点。
* * 有概率同时生成3只兔子。

* *[兔子皮](兔子皮.md)**
* 能通过2×2的合成表排列方式来获得1个[皮革](皮革.md)。
* 由[兔子](兔子.md)掉落。

* *[生兔肉](生兔肉.md)**
* 回复。
* 能被烤制成[熟兔肉](熟兔肉.md)。
* 由[兔子](兔子.md)掉落。

* *[熟兔肉](熟兔肉.md)**
* 回复。

* *[兔子脚](兔子脚.md)**
* 用于酿造跳跃药水。
* 由[兔子](兔子.md)掉落。

* *[生羊肉](生羊肉.md)**
* 回复。
* 由[绵羊](绵羊.md)掉落。
* 能被烤制成[熟羊肉](熟羊肉.md)。

* *[熟羊肉](熟羊肉.md)**
* 回复。

* *[兔肉煲](兔肉煲.md)**
* 回复。
* 合成方法：有序放置1个[熟兔肉](熟兔肉.md)、1个[蘑菇](蘑菇.md)、1个[胡萝卜](胡萝卜.md)、1个[烤马铃薯](烤马铃薯.md)、和1个[碗](碗.md)。

* *[跳跃药水](跳跃药水.md)**
* 增强跳跃、有“I”和“II”级。
* 用[兔子脚](兔子脚.md)和[粗制的药水](粗制的药水.md)酿造。
* 药水效果粒子是亮绿色的。
* * 在此版本之前，颜色是淡紫色的。

# = 生物 =
* *[兔子](兔子.md)**
* 有8种皮肤，包括棕色、白色、棕白色、黑色、黑白斑点、金黄色、Toast和杀手兔。
* * 用[命名牌](命名牌.md)将一只[兔子](兔子.md)命名为“Toast”或用[刷怪蛋](刷怪蛋.md)生成一只名为“Toast”的兔子将会给这只兔子特殊的皮肤用于纪念玩家xyzen420的女朋友丢失的兔子“Toast”。<ref></ref>
* * [杀手兔](杀手兔.md)
* ** 有的概率生成；它是敌对生物，攻击力是在简单难度、在普通难度以及在困难难度。
* ** 参考自电影[*Monty Python and the Holy Grail*](Wikipedia:Monty Python and the Holy Grail.md)<ref>https://minecraft.net/en-us/article/who-framed-killer-rabbit</ref>
* ** 除了它的嘴巴有血红色外边其余部分都是纯白色。
* ** 它能被命令{{cmd|summon Rabbit ~ ~ ~ {RabbitType:99} }}直接生成。
* [兔子](兔子.md)能被[胡萝卜](胡萝卜.md)、[金胡萝卜](金胡萝卜.md)或[蒲公英](蒲公英.md)吸引和喂食。
* * [兔子](兔子.md)不能被喂食除非被吸引。
* [兔子](兔子.md)害怕玩家，会试图远离玩家除非它被吸引，类似于[豹猫](豹猫.md)。

# = 命令格式 =
* *[NBT](NBT.md)标签**
* 在[命令方块](命令方块.md)和[告示牌](告示牌.md)中加入了新的<code>{CommandStats:}</code>标签。
* * 当它成功运行时，它允许[命令方块](命令方块.md)和[告示牌](告示牌.md)增加[记分板](记分板.md)中特定的数值。
* ** 命令增加的数值基于、、、的数值。
* ** 例如，一个包含此标签的命令方块运行会影响物品的命令(例如：)将会基于命令给予的物品数量更新记分板数值。
* * 用法：<code>-{}-{CommandStats:{AffectedItemsName:"玩家名", AffectedItemsObjective:"目标", AffectedBlocksName:"玩家名", AffectedBlocksObjective:"目标", AffectedEntitiesName:"玩家名", AffectedEntitiesObjective:"目标", SuccessCountName:"玩家名", SuccessCountObjective:"目标"}}</code>

# 更改
# = 世界生成 =
* *[调试模式](调试模式.md)**
* 调整了世界生成。
* * 其他世界设置会被禁用。
* * 只有[旁观模式](旁观模式.md)可用。
* 现在包括所有方块状态而不仅仅是数据值。
* * 这包括了[红石粉](红石粉.md)、[火](火.md)、[绊线](绊线.md)、[楼梯](楼梯.md)等方块的所有可能的方块状态。
* 方块的安排与之前不同且更紧密，每个方块状态只出现一次。

* *[下界要塞](下界要塞.md)**
* 现在可以被“生成结构”设置影响。

# = 游戏内容 =
* *[粒子](粒子.md)**
* 更改了着陆时的粒子效果，看起来更分散。

# = 常规 =
* *[调试屏幕](调试屏幕.md)**
* 现在物品名称之后显示变种状态（例如：<code>minecraft:cauldron[level=1]</code>）。

* *[方块模型](方块模型.md)**
* 用实际的方块状态值代替方块状态名称，用逗号分隔。

# 修复
</onlyinclude>

# 参考

# 导航

[de:14w27a](de:14w27a.md)
[en:Java Edition 14w27a](en:Java Edition 14w27a.md)
[es:Java Edition 14w27a](es:Java Edition 14w27a.md)
[fr:Édition Java 14w27a](fr:Édition Java 14w27a.md)
[it:Java Edition 14w27a](it:Java Edition 14w27a.md)
[ja:Java Edition 14w27a](ja:Java Edition 14w27a.md)
[pt:Edição Java 14w27a](pt:Edição Java 14w27a.md)
[ru:14w27a (Java Edition)](ru:14w27a (Java Edition).md)