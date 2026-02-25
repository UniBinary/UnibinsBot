# Java版Combat Test 6

*页面ID: 67836* | *来源: Minecraft Wiki*

}}<onlyinclude>

* *Combat Test 6**是未来的战斗改版的第6个公开的实验性版本，发布于2020年8月7日<ref></ref>，虽然它是未来版本的测试版，但这个战斗实验版是[Java版1.16.2-pre3](Java版1.16.2-pre3.md)的分支。此版本只发布在[Reddit](wzh:Reddit.md)上，因此其并不出现在[启动器](启动器.md)版本列表或[Minecraft.net](Minecraft.net.md)的文章中。

# 更改
# = 物品 =
* *[斧](斧.md)**
* 从[附魔台](附魔台.md)中移除了其他武器附魔，但仍能够通过[铁砧](铁砧.md)来附魔。

* *[弓](弓.md)**
* 现在精准度会随着拉弓时间的延长而逐渐降低。
* * 第一人称模式下拉弓时手会颤抖，且抖动幅度会随着拉弓时间的延长而逐渐变大。
* 箭的射击精度现在默认为100%。

# = 非生物实体 =
* *弹射物**
* 弹射物的弹射初速度现在会与玩家的运动速度叠加（惯性），但只会在玩家瞄准的方向上叠加；当玩家与瞄准的方向相反时，弹射物的弹射初速度也不会减少。

# = 游戏内容 =
* *[战斗](Tutorial:战斗.md)**
* 判定箱小于0.9的实体（如[兔子](兔子.md)和[蝙蝠](蝙蝠.md)等）现在已被扩大到该值。
* 将基础攻击范围由2.5升至3，并移除了延时攻击的额外攻击范围。
* 现在无论使用何种武器，未击中生物时的冷却时间总是为。
* 移除了[Combat Test 5](Java版Combat Test 5.md)中的“容错时间”（Coyote Time）。

* *[饥饿](饥饿.md)**
* 将玩家的进食时间恢复到。
* 现在玩家在进食时受到伤害（仅指受到近战和远程伤害）会使进食中断。
* 将玩家自然恢复生命值的间隔由降至。
* 现在自然恢复生命值消耗饥饿值的速度降低了50%。
* 恢复了玩家只能在饥饿值大于时疾跑的特性。

* *[魔咒](魔咒.md)**
* 将[劈裂](劈裂.md)的英文名从“Chopping”改为“Cleaving”。
* 将[横扫之刃](横扫之刃.md)魔咒每级造成的伤害分别削弱到武器基础伤害的25/33/37.5%（原为50/67/75%）。

* *[平视显示器](平视显示器.md)**
* 彻底移除了攻击指示器，因为不再有任何机制使用它了。

* *[盾牌](盾牌.md)**
* 盾牌现在只能抵挡最多近战攻击伤害，但仍能抵挡100%的弹射物伤害。
* 攻击后盾牌冷却时间更短。

* *[武器](武器.md)**
* 剑进行横扫攻击现在无需[横扫之刃](横扫之刃.md)魔咒。
* [横扫之刃](横扫之刃.md)魔咒现在对斧的攻击同样有效。

# 修复
* *上个开发版本的漏洞**
* 修复了击退计算-{}-机制。
* 修复了物品的耐久值在客户端的单字节溢出（off-by-one）漏洞。
* 修复了玩家偶尔重生后无法攻击和互动的漏洞。

# 注释
</onlyinclude>

# 参考

# 导航

[de:Combat Test 6](de:Combat Test 6.md)
[en:Java Edition Combat Test 6](en:Java Edition Combat Test 6.md)
[es:Java Edition Combat Test 6](es:Java Edition Combat Test 6.md)
[fr:Édition Java Test de combat 6](fr:Édition Java Test de combat 6.md)
[ja:Java Edition Combat Test 6](ja:Java Edition Combat Test 6.md)
[pt:Edição Java Combat Test 6](pt:Edição Java Combat Test 6.md)
[ru:Combat Test 6 (Java Edition)](ru:Combat Test 6 (Java Edition).md)
[th:รุ่น Java Combat Test 6](th:รุ่น Java Combat Test 6.md)