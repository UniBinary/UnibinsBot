# Java版1.14.3 - Combat Test

*页面ID: 44832* | *来源: Minecraft Wiki*

}}<onlyinclude>

* *1.14.3 - Combat Test**是未来的战斗改版的首个公开的实验性版本，发布于2019年6月26日<ref></ref>，虽然它是未来版本的测试版，但这个战斗实验版是[Java版1.14.3-pre4](Java版1.14.3-pre4.md)的分支<ref group="注">1.14.3 - Combat Test是在1.14.3-pre4发布后的第一天和1.14.3正式发布前四天编写的。</ref>。此版本只发布在[Reddit](wzh:Reddit.md)上，因此其并不出现在[启动器](启动器.md)版本列表或[Minecraft.net](Minecraft.net.md)的文章中。

# 新内容
# = 游戏内容 =
* *[属性](属性.md)**
* [攻击距离](属性/攻击距离.md)
* * ID为<samp>generic.attackReach</samp>。
* * 计算值代表玩家的攻击距离。
* * 只对[玩家](玩家.md)有效。
* * 默认值：<samp>3.0</samp>；最小值：<samp>0.0</samp>；最大值：<samp>6.0</samp>。
* * [剑](剑.md)、[锄](锄.md)和[三叉戟](三叉戟.md)现在会以操作<samp>0</samp>和UUID<samp>26cb07a3-209d-4110-8e10-1010243614c8</samp>修改<samp>generic.attackReach</samp>。

# 更改
# = [物品](物品.md) =
* *[斧](斧.md)**
* 所有斧的[攻击速度](属性/攻击速度.md)都增加至2点。
* 所有斧的伤害值都比同种类的剑高。
* 攻击范围仍为3格。

* *[锄](锄.md)**
* 更改了大部分锄的攻击速度。
* * 木质：2
* * 石质：2.5
* * 钻石质及金质：3.5
* 更改了所有锄的默认伤害。
* * 木质、石质及金质：
* * 铁质及钻石质：
* 增加攻击范围至4格。

* *[镐](镐.md)**
* 所有镐的攻击速度都增加至2.5点。
* 所有镐的伤害值都增加。
* 攻击范围仍为3格。

* *[盾牌](盾牌.md)**
* 暴击会无视盾牌的防御。
* 移除盾牌的0.25秒的转换手持物品的延迟。
* 当玩家把盾牌装备于副手且正在，盾牌会自动防御。
* 盾牌不再会把挡下的攻击者击退。

* *[锹](锹.md)**
* 所有锹的攻击速度都增加至2点。
* 所有锹的伤害值都降低。
* 攻击范围仍为3格。

* *[剑](剑.md)**
* 所有剑的攻击速度都增加至3点。
* 所有剑的伤害值都增加。
* 攻击范围增加至3.5格。

* *[三叉戟](三叉戟.md)**
* 攻击速度增加至2点。
* 默认伤害值由减至。
* 攻击范围增加至4格。

# = 游戏内容 =
* *[战斗](Tutorial:战斗.md)**
* 玩家现在只可在武器完全[冷却](伤害.md)时攻击。
* 不同武器及物品现在有不同的攻击范围。
* * 剑有3.5个方块的攻击范围。
* * 锄及三叉戟有4个方块的攻击范围。
* * 其他物品只有3个方块的攻击范围。
* 攻击冷却现在可以达到200%。
* * 剑的攻击动作完全结束后可以令攻击冷却达到200%。
* * 攻击冷却达到200%后可以[暴击](伤害.md)及进行横扫攻击。
* * 冲刺时，攻击冷却达到200%可以造成更强的击退效果。
* 较短冷却时间的武器会令被击者有较短的无敌时间。
* 现在按住时，攻击冷却每达到100%就会自动进行一次攻击。
* 现在可以穿过不完整方块（例如[草](草.md)）来攻击生物。

* *[平视显示器](平视显示器.md)**
* 更改了攻击指示器的运作方式。
* * 使用十字准星模式时：
* ** 冷却进度现在除了会在武器冷却达到100%前显示，还会在冷却达到200%时的瞬间再显示一次。
* ** 冷却时间达到200%时，进度条下会显示“+”。
* * 使用快捷栏模式时：
* ** 冷却进度只在武器冷却达到100%前显示。

* *横扫攻击**
* 进行横扫攻击现在需要[横扫之刃](横扫之刃.md)魔咒。
* 只有在冷却时间达到200%时才能够进行横扫攻击。
* 现在就算没有击中实体也会进行横扫攻击了。</onlyinclude>

# 注释

# 参考

# 导航

[cs:Java Edice 1.14.3 - Combat Test](cs:Java Edice 1.14.3 - Combat Test.md)
[de:1.14.3 - Combat Test](de:1.14.3 - Combat Test.md)
[en:Java Edition 1.14.3 - Combat Test](en:Java Edition 1.14.3 - Combat Test.md)
[es:Java Edition 1.14.3 - Combat Test](es:Java Edition 1.14.3 - Combat Test.md)
[fr:Édition Java 1.14.3 - Test de combat](fr:Édition Java 1.14.3 - Test de combat.md)
[ja:Java Edition 1.14.3 - Combat Test](ja:Java Edition 1.14.3 - Combat Test.md)
[ko:Java Edition 1.14.3 - 전투 테스트](ko:Java Edition 1.14.3 - 전투 테스트.md)
[pt:Edição Java 1.14.3 - Combat Test](pt:Edição Java 1.14.3 - Combat Test.md)
[ru:1.14.3 - Combat Test (Java Edition)](ru:1.14.3 - Combat Test (Java Edition).md)
[th:รุ่น Java 1.14.3 - Combat Test](th:รุ่น Java 1.14.3 - Combat Test.md)
[uk:1.14.3 - Combat Test (Java Edition)](uk:1.14.3 - Combat Test (Java Edition).md)