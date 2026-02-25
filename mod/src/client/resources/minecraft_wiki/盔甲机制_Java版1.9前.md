# 盔甲机制/Java版1.9前

*页面ID: 23281* | *来源: Minecraft Wiki*

在[Java版1.9](Java版1.9.md)与[基岩版1.18.30.20](基岩版1.18.30.20.md)前，盔甲使用不同的公式来计算伤害减免值。以下是使用的计算公式。

# 护甲值机制
受到伤害时，首先使用护甲值减免伤害，每护甲值减少4%的伤害，时为80%。

# 保护魔咒机制
生物穿戴的物品的[魔咒](魔咒.md)是在护甲值后对抗伤害的第二层防护，这些魔咒包括[保护](保护.md)、[弹射物保护](弹射物保护.md)、[火焰保护](火焰保护.md)、[爆炸保护](爆炸保护.md)和[摔落缓冲](摔落缓冲.md)。被魔咒降低的伤害不会降低盔甲的耐久度。

每种保护魔咒都会保护一种特定的伤害，而减少的伤害取决于该魔咒个别的**魔咒保护系数（Enchantment Protection Factor，简称EPF）**。多个装备的保护魔咒提供的对伤害值的保护能力是叠加的。

EPF会根据魔咒与等级按照下列公式计算：

  <math>\text{EPF} = \left\lfloor \frac{ \left( 6 + \text{level}^2 \right) \times \text{TypeModifier}}{3} \right\rfloor</math>
其中<math>\lfloor\,\rfloor</math>是<code>floor()</code>（向下取整）运算。

下表列出了不同魔咒常见等级的EPF：

当穿着附有保护类魔咒盔甲的玩家或生物受到伤害时，所有适当魔咒的EPF会被加起来，上限为25，乘以50%到100%之间的随机数，向上取整，上限为20。之后每点有效EPF减少4%伤害（例如20有效EPF会减少80%伤害）。即下面的公式：

<math>
\begin{align}
effectiveEPF = \min\left\{ \lceil \min\left\{ totalEPF, 25 \right\} \times \text{rand}(50%, 100%) \rceil, 20 \right\}\\
decreasedDamage = damage \times effectiveEPF \times 4%
\end{align}
</math>

可以只用3个盔甲部件，就能使对应特定伤害的保护效果达到最高。例如两件爆炸保护IV的盔甲（每件11EPF）和一件保护III的盔甲（3EPF）会提供25EPF来防护爆炸。

保护魔咒作用在护甲值之后。例如，全套钻石盔甲拥有，能减少80%攻击伤害，如果每件盔甲都附有保护IV（每件5EPF），会将剩余的20%伤害减少40%至80%，共减少88%至96%伤害。

获得等级高于等级上限的保护魔咒仍然会正常生效。一件保护X的盔甲能够提供25EPF，面对几乎所有伤害都能减伤52%至80%。

如要计算一整套盔甲提供的平均额外保护，请使用以下方程：

  <math>\left[ 100 - (totalArmor \times 4)\right] \times totalEPF \times 4\% \times 0.0075</math>

[en:Armor/Old](en:Armor/Old.md)
[fr:Armure/Pré-1.9](fr:Armure/Pré-1.9.md)