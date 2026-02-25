# Java版1.9.1

*页面ID: 20515* | *来源: Minecraft Wiki*

* *1.9.1**是的一次次要更新，发布于2016年3月30日<ref></ref>，加入了鞘翅的音效以及盔甲的属性，并修复了连接错误和一些其他漏洞<ref></ref><ref></ref>。由于该版本在多人游戏上有一个灾难性的漏洞，1.9.2在1.9.1发布的当天发布。此版本不兼容1.9的服务端。

# 新内容
# = 物品 =
* *[鞘翅](鞘翅.md)**
* 加入了使用[鞘翅](鞘翅.md)飞行时的音效。
* * 声音事件<code>item.elytra.flying</code>。

* *[盔甲](盔甲.md)**
* 加入了盔甲属性：盔甲韧性<code>generic.armorToughness</code>，计算公式为：
* * <math>totalDamage=damage\times(1-\frac{max(\frac{defensePoints}{5},defensePoints-\frac{damage}{2+\frac{toughness}{4}})}{25})</math>
* ** 其中，<math>totalDamage</math>为总伤害值；<math>damage</math>为伤害值；<math>defensePoints</math>为护甲值；<math>toughness</math>为盔甲韧性。
* * 增加盔甲韧性意味着被强力攻击时更少的护甲值会被忽视。
* * 钻石甲有两点盔甲韧性，其他的盔甲均为0点盔甲韧性。一整套钻石甲会给予8点盔甲韧性。

# 更改
# = 方块 =
* *[发射器](发射器.md)**
* 把每游戏刻执行事件的次数限制从1000提高到了65536。
* [丛林神庙](丛林神庙.md)里装着弓箭的发射器现在也以战利品表的形式工作。

* *[漏斗](漏斗.md)**
* [漏斗](漏斗.md)现在可以从上方被遮挡的箱子里取出东西。

# = 物品 =
* *[盾牌](盾牌.md)**
* 护盾在受到较弱攻击（以下伤害）时不会受到损坏。

# = 生物 =
* *常规**
* 改进了AI。

* *[骷髅](骷髅.md)**
* [骷髅](骷髅.md)在简单和普通难度射击速度没有那么快了。

# = 非生物实体 =
* *[运输矿车](运输矿车.md)和[漏斗矿车](漏斗矿车.md)**
* 物品栏名称和物品对应。

# = 命令格式 =
* *[目标选择器](目标选择器.md)**
* 实体[选择器](命令.md) <code>c</code> (数量) 现在使用真正的坐标计算, 不再基于整数坐标<ref></ref>。

# = 游戏内容 =
* *战斗**
* [攻击指示器](伤害.md)（指针）现在默认开启以重置为默认值）。}}。
* 如果武器没有打中的话不再会进入冷却时间。

# = 常规 =
* *[战利品表](战利品表.md)**
* 现在也可以在[发射器](发射器.md)和[投掷器](投掷器.md)上工作。

* *会话ID**
* 会话ID不再由游戏显示到日志信息和启动器<ref>，但已正确写入日志文件。|wai}}</ref>。

# 修复
命令不起效果。
|95352|空间目标参数<code>c</code>、<code>dx</code>、<code>dy</code>和<code>dz</code>的行为异常且不一致。
|;1.9的漏洞
|90257|命令方块链可能需要1刻以上的时间来完全执行。
|93074|无法为“召唤的箭头”分配记分板值（太多的箭与光灵键导致命令执行失败）。
|96219|可以使用活塞复制方块（幽灵方块）。
|96927|选择器中的<code>C</code>指向的是不准确的实体位置。
|98327|鞘翅纹理有透明度问题。
|98461|一些语言（至少有弗里斯兰语、塔罗萨语、利普里安语、逻辑语和LOLCAT语）无法被选择，<code>Eesti (Eesti)</code>被显示为<code>Inglise (US)</code>。
|98587|有时命令方块的逻辑会随意地失败。
|99060|鞘翅有发光效果时，一直显示为黑色。
|99697|漏斗矿车和运输矿车名字有误，被写作<code>container.minecart</code>。
|;dev
|99396|缺少玩家的攻击动画。
|;otherissuescount=3
}}
* *其他修复**
* 修复了游戏引擎尝试错误地随机生成不存在的生物的漏洞<ref name="fixref1">"Paper patch 0078" – https://github.com/starlis/Paper/blob/b2dd99e74e91fbe5f7c28fe29faa58b7162c1aa6/Spigot-Server-Patches/0078-Optimize-Navigation-Listener.patch</ref><ref name="fixref2"></ref>。
* 修复了寻路代码导致崩溃的漏洞（并发修改异常）<ref name="fixref2"/>。
* 修复了另一个寻路代码导致崩溃的漏洞（空指针异常）<ref name="fixref2"/>。

# 注释

# 参考

# 导航

[de:1.9.1](de:1.9.1.md)
[en:Java Edition 1.9.1](en:Java Edition 1.9.1.md)
[es:Java Edition 1.9.1](es:Java Edition 1.9.1.md)
[fr:Édition Java 1.9.1](fr:Édition Java 1.9.1.md)
[ja:Java Edition 1.9.1](ja:Java Edition 1.9.1.md)
[pl:1.9.1](pl:1.9.1.md)
[pt:Edição Java 1.9.1](pt:Edição Java 1.9.1.md)
[ru:1.9.1 (Java Edition)](ru:1.9.1 (Java Edition).md)