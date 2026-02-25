# Java版1.10-pre1

*页面ID: 21618* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.10-pre1**是[Java版1.10](Java版1.10.md)的首个预发布版，发布于2016年6月2日<ref></ref>，加入了新的声音事件，新的命令以及新的NBT标签，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 使用方法: <code>/teleport <Entity> [x] [y] [z] [<y-rot> <x-rot>]</code>
* 例子：<code>/teleport @e[type=Cow] ~ ~ ~ 5 1</code>
* * 传送一个选择的实体到执行者或玩家的相对位置。

* *[NBT标签](NBT标签.md)**
* 新<code>ParticleParam1</code>和<code>ParticleParam2</code>标签。（是药水效果云实体的整数标签）
* * 这些在命令里的作用就像两个<code><params></code>的论证作用。
* * 例子：{{cmd|summon AreaEffectCloud ~ ~1 ~ {Duration:600,Radius:2.0f,Particle:"iconcrack",ParticleParam1:351,ParticleParam2:3} }}
* ** 生成一个伴随着第351号物品（[染料](染料.md)）的图标破裂的云，而且数据值是3（[可可豆](可可豆.md)）。
* * 例子：{{cmd|summon AreaEffectCloud ~ ~1 ~ {Duration:600,Radius:2.0f,Particle:"blockcrack",ParticleParam1:12289} }}
* ** 生成一个伴随着第1号物品（[石头](石头.md)）的方块破裂的云，而且数据值是3（[闪长岩](闪长岩.md)），使用公式1+(3×4096)。

# = 常规 =
* *[声音事件](Java版声音事件.md)**
* <code>entity.husk.ambient</code>
* <code>entity.husk.death</code>
* <code>entity.husk.hurt</code>
* <code>entity.husk.step</code>
* <code>entity.stray.ambient</code>
* <code>entity.stray.death</code>
* <code>entity.stray.hurt</code>
* <code>entity.stray.step</code>
* <code>entity.wither_skeleton.ambient</code>
* <code>entity.wither_skeleton.death</code>
* <code>entity.wither_skeleton.hurt</code>
* <code>entity.wither_skeleton.step</code>

# 更改
# = 方块 =
* *[结构空位](结构空位.md)**
* 移除了不能破坏的特性。
* 爆炸抗性减少到0（之前是18000003）。

* *[下界疣块](下界疣块.md)**
* 不再被[水](水.md)和[熔岩](熔岩.md)破坏了。

# = 物品 =
* *[怪物蛋](怪物蛋.md)**
* 现在使用实体的名称而不是实体的代码了。

# = 生物 =
; [北极熊](北极熊.md)
   成年北极熊着火后会跳到水里了。

* *[骷髅](骷髅.md)**
* 在副手上拿着[药箭](药箭.md)的骷髅就会射出那种属性的药箭。
* * 这会覆盖掉[流浪者](流浪者.md)原有的“发射迟缓之箭”的属性。
* * 在副手的箭不会消耗。
* 如果[区域难度](区域难度.md)是3或更高，燃烧的骷髅有50%概率射出燃烧的箭。

* *[村民](村民.md)**
* 现在会逃离[尸壳](尸壳.md)了。

* *[女巫](女巫.md)**
* 如果它们着火时没有任何药水效果或两秒前最近的一次伤害是火焰伤害，它们就会饮用抗火药水。

* *[僵尸](僵尸.md)**
* 自身燃烧时攻击目标被引燃的概率和时间被修改，现在取决于[区域难度](区域难度.md)。
* * 改变燃烧概率%：原先在简单30%，在普通60%，在困难90%。
* * 持续时间现在是秒：原先简单2秒，普通4秒，困难6秒。
* [尸壳](尸壳.md)的饥饿效果持续时间现在取决于[区域难度](区域难度.md)。
* * 持续时间现在是秒：原先简单7秒，普通14秒，困难21秒。

# = 世界生成 =
* *[村庄](村庄.md)**
* 现在楼梯下生成的是草方块，而不是草径。
* 热带草原和针叶林的村庄现在会使用适当材料的木[栅栏](栅栏.md)。
* 圆石现在生成在井的周围，而不是沙砾。
* 草径现在只会替换[草方块](草方块.md)和在[空气](空气.md)上的[水](水.md)、[熔岩](熔岩.md)、[沙子](沙子.md)、[砂岩](砂岩.md)和[红砂岩](红砂岩.md)。其他的方块都会被忽略，低高度的方块（低于海平面）会考虑替换。
* * 这会允许树在正确的草径下生成。
* * 这会移除弥合桥的沟壑的能力。
* 僵尸村民生成在僵尸村庄后不再被清除（它们有<code>PersistenceRequired</code>的标志设置）。

# = 常规 =
* *[命令](命令.md)**
* 的行为回到[16w20a](16w20a.md)及之前的版本。
* * 新的行为由代替。

* *[粒子](粒子.md)**
* <code>fallingdust</code>粒子现在会与方块碰撞了。

* *路径寻找**
* 生物现在会避开在其路径上的[岩浆块](岩浆块.md)了。

* *[生成](生成.md)**
* 大多数生物现在不会生成在岩浆块上了。

# 你知道吗
* 从[第一个快照](16w20a.md)发布到1.10-pre1发布只用了15天时间，和之前的几次更新对比起来很反常。

# 修复
文件会导致空指针异常。
|102575|崩溃日志中的CPU是<code>bcw$7@<memory address></code>。
|;dev
|102048|<code>fallingdust</code>粒子不会与其下方的方块碰撞。
|102049|女巫站在岩浆块上时不喝抗火药水。
|102050|某些生物变种的刷怪蛋的名称（英文）被称为“Spawn<code>entity.X.name</code>”。
|102051|不能在地狱疣块上放置任何方块。
|102070|地狱疣块不会着火。
|102081|生物氧气值太低。
|102096|村庄中生成的某些楼梯下方的方块是草径而不是泥土。
|102119|北极熊追赶玩家时会陷到地里。
|102135|结构方块允许空名称。
|102146|不能把<code>/</code>或<code>:</code>字符输入结构方块中。
|102159|沙砾围绕着村庄水井生成，而不是草径。
|102178|结构方块的轮廓线在旁观模式下不可见。
|102203|结构方块不旋转头颅。
|102207|在执行含<code>@e[type...]</code>和<code>@e[name...]</code>的命令的同一刻时使用钓鱼竿会导致游戏崩溃。
|102270|村庄道路在树下不正确的生成。
|102372|热带草原和针叶林村庄中栅栏使用的是橡木栅栏而不是金合欢木栅栏和云杉木栅栏。
|102378|使用结构方块对告示牌、旗帜、末地烛以及铁砧进行镜像的结果不正确。
|102401|鞘翅飞行过程中使用命令导致飞行被中断。
|102455|生物寻路AI不把地狱疣块视作障碍，也不能在其顶端寻路。
|102460|僵尸村庄中没有僵尸村民。
|102530|<code>AreaEffectCloud</code>（错误）<code>fallingsand</code>粒子命令不显示<code>mobSpell</code>的默认粒子。
|102557|被结构方块加载后的物品展示框的放置位置不对。
|102598|在命令中使用相对坐标传送实体，传送到的位置是相对于玩家的。
|;previous
|102607|白天村民不会远离僵尸。
|102614|可以把无效字符粘贴进结构方块。
|102679|村民被尸壳攻击时不会躲开。
|102740|在命令方块矿车中使用含相对坐标的传送命令传送玩家时，它的表现就像16w21b之前的一样。
}}</onlyinclude>

# 参考

# 导航

[de:1.10-pre1](de:1.10-pre1.md)
[en:Java Edition 1.10-pre1](en:Java Edition 1.10-pre1.md)
[es:Java Edition 1.10-pre1](es:Java Edition 1.10-pre1.md)
[fr:Édition Java 1.10-pre1](fr:Édition Java 1.10-pre1.md)
[ja:Java Edition 1.10-pre1](ja:Java Edition 1.10-pre1.md)
[nl:1.10-pre1](nl:1.10-pre1.md)
[pt:Edição Java 1.10-pre1](pt:Edição Java 1.10-pre1.md)
[ru:1.10-pre1 (Java Edition)](ru:1.10-pre1 (Java Edition).md)