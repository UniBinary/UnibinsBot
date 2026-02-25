# Java版1.9.1-pre1

*页面ID: 20510* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.9.1-pre1**是[Java版1.9.1](Java版1.9.1.md)的首个预发布版，发布于2016年3月9日<ref></ref><ref></ref>。

# 新内容
# = 物品 =
* *[鞘翅](鞘翅.md)**
* 加入了[鞘翅](鞘翅.md)的音效。
* * 声音代码为<code>item.elytra.flying</code>。

* *[盔甲](盔甲.md)**
* 加入了盔甲属性：盔甲韧性<code>generic.armorToughness</code>，计算公式为：
* * <math>totalDamage=damage\times(1-\frac{max(\frac{defensePoints}{5},defensePoints-\frac{damage}{2+\frac{toughness}{4}})}{25})</math>
* ** 其中，<math>totalDamage</math>为总伤害值；<math>damage</math>为伤害值；<math>defensePoints</math>为护甲值；<math>toughness</math>为盔甲韧性。
* * 钻石甲有两点盔甲韧性，其他的盔甲均为0点盔甲韧性。一整套钻石甲会给予8点盔甲韧性。
* 在中加入了新选项：<code>enableWeakAttacks</code>。
* * 若设置为，武器冷却低于75%时客户端会忽略攻击尝试。

# 更改
# = 方块 =
* *[发射器](发射器.md)**
* 把每游戏刻执行事件的次数限制从1000提高到了65536。

* *[漏斗](漏斗.md)**
* [漏斗](漏斗.md)现在可以从上方被遮挡的箱子里取出东西。

# = 生物 =
* *常规**
* 改进了AI。

# = 命令格式 =
* *[目标选择器](目标选择器.md)**
* 实体[选择器](命令.md)<code>c</code>（数量）现在使用真正的坐标计算，不再基于整数坐标。<ref></ref>

# = 游戏内容 =
* *战斗**
* 如果武器没有打中的话不再会进入冷却时间。

# = 常规 =
* *[战利品表](战利品表.md)**
* 现在也可以在[发射器](发射器.md)和[投掷器](投掷器.md)上工作。
* * [丛林神庙](丛林神庙.md)里装着弓箭的发射器现在也以战利品表的形式工作。

* ***
* 不再由游戏设置到个人信息和启动器。<ref>，但已正确写入日志文件。|wai}}</ref>

# 修复
命令不起效果。
|95352|空间目标参数<code>c</code>、<code>dx</code>、<code>dy</code>和<code>dz</code>的行为异常且不一致。
|;1.9的漏洞
|90257|命令方块链可能需要1刻以上的时间来完全执行。
|96219|可以使用活塞复制方块（幽灵方块）。
|96927|选择器中的<code>C</code>指向的是不准确的实体位置。
|98327|鞘翅纹理有透明度问题。
|otherissuescount=1
}}
* *其他修复**
* 修复了游戏引擎尝试错误地随机生成不存在的生物的漏洞。<ref name="fixref1">"Paper patch 0078" – https://github.com/starlis/Paper/blob/b2dd99e74e91fbe5f7c28fe29faa58b7162c1aa6/Spigot-Server-Patches/0078-Optimize-Navigation-Listener.patch</ref><ref name="fixref2">http://mojang.com/2016/03/minecraft-191-pre-release-1/</ref></onlyinclude>

# 你知道吗
* 此版本曾经在[启动器](启动器.md)中移除，但在2018年9月重新加入。

# 参考

# 导航

[de:1.9.1-pre1](de:1.9.1-pre1.md)
[en:Java Edition 1.9.1-pre1](en:Java Edition 1.9.1-pre1.md)
[es:Java Edition 1.9.1-pre1](es:Java Edition 1.9.1-pre1.md)
[fr:Édition Java 1.9.1-pre1](fr:Édition Java 1.9.1-pre1.md)
[ja:Java Edition 1.9.1-pre1](ja:Java Edition 1.9.1-pre1.md)
[pt:Edição Java 1.9.1-pre1](pt:Edição Java 1.9.1-pre1.md)
[ru:1.9.1-pre1 (Java Edition)](ru:1.9.1-pre1 (Java Edition).md)