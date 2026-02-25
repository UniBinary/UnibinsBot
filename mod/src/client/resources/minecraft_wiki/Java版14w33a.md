# Java版14w33a

*页面ID: 32431* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w33a**是[Java版1.8](Java版1.8.md)的第46个快照，发布于2014年8月13日<ref></ref>，加入了新的NBT标签，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* *[NBT格式](NBT格式.md)**
* <code>SelectedItem</code>
* * 包含当前在玩家手中持有的物品的物品数据。
* * 用于缩短测试玩家是否持有一个特定的物品的过程。
* ** 以前的方法需要在命令方块中使用9个命令，现在只需要1个命令。

# 更改
# = 方块 =
* *[门](门.md)**
* 普通木门重命名为“橡木门”。
* 其他门纹理的缩略图被更改以匹配现有的门。
* 在[14w32d](14w32d.md)中加入的新门纹理在物品栏中不再是三维的。

* *[石台阶](石台阶.md)**
* 平滑石台阶不再能用[花岗岩](花岗岩.md)、[闪长岩](闪长岩.md)、[安山岩](安山岩.md)或其他变种合成。

# = 生物 =
* *[铁傀儡](铁傀儡.md)**
* 现在主动攻击[苦力怕](苦力怕.md)。
* 现在可以被骷髅、僵尸、蜘蛛、洞穴蜘蛛、史莱姆和岩浆怪主动攻击。

* *[雪傀儡](雪傀儡.md)**
* 现在主动攻击苦力怕。

# = 命令格式 =
* *常规**
* 键自动补全坐标参数会补全玩家看着的那个方块的坐标。

# = 常规 =
* *[闪烁标语](闪烁标语.md)**
* “This is good for [realms](realms.md).”更改为“This is good for Realms.”

# 修复
命令中的<code>player</code>参数不能使用键自动补全。
|31344|使用命令时会将参数自动补全为<code>Mob</code>和<code>Monster</code>,即使它们不是有效的实体名称。
|51856|火把可以跨台阶放置。
|66347|床发出错误的声音。
|67168|在某些Intel显卡系统上将各向异性过滤设置为大于0会使某些纹理显得模糊。
|;dev
|57714|可以在火把上放置其他火把。
|58740|可以在透明方块、技术性方块以及台阶上放置火把。
|61245|倒置的楼梯有与一般楼梯一样的碰撞箱/一般楼梯的碰撞箱有错误。
|63319|被闪电苦力怕炸出来的头不遵循有关掉落物的游戏规则。
|64626|传送不顺畅。
|65162|使用命令放置的画的Y轴坐标不正确。
|65522|普通砂石台阶的提示框不正确。
|65523|如果在信标光束的颜色更新时将染色玻璃放在信标上，则光束将是白色，而非玻璃的颜色。
|65546|信标光照错误。
|65790|在两格高植物上放置方块，会使得植物被破坏。
|65909|物品展示框中的头颅太小。
|65994|方块模型中的多边形面不使用指定纹理。
|;previous
|66163|对新木门使用选取键，得到的是老木门。
|66166|破坏新木门会得到老木门。
|66169|原先的木门现在仍然被叫做“木门”而不是“橡木门”。
|66227|创造模式中，玩家飞在盔甲架上面时，不能把盔甲架上的头盔取下来。
|66246|小盔甲架上的头颅有偏移。
|66350|在创建调试世界之前选择极限模式会产生一个“极限调试世界”。
|66413|小兔子的名牌在它的下方。
|66503|对已放置钻石剑的盔甲架的另一侧手臂使用钻石剑点击，会在盔甲架前方放置一个悬空的钻石剑。
|66504|对开的丛林木门中的左侧木门的下半部分显示的是门扇的纹理。
|66532|命令中，无论当前输入的是什么参数，使用键补全的都是玩家的名字。
|66543|栅栏门可以被锁定，不可以通过压力板激活。
|66674|生成一个带<code>{Block:"leaves"}</code>标签的<code>FallingSand</code>实体导致客户端崩溃。
|66685|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property ben{namehalf, clazzclass auz, values[upper, lower]} as it does not exist in bdw{blockminec</code>。
|66687|<code>Hopper: java.lang.NullPointerException: Rendering entity in world</code>。
|66722|<code>Hopper: java.lang.ClassCastException: ayv cannot be cast to azh</code>。
|66742|初始文本大小写错误。
|66791|铁傀儡不攻击苦力怕。
|66816|多人游戏中使用{{cmd|give @p skull 1 3 {SkullOwner:<playername>} |link=none}}命令导致游戏崩溃。
|66819|<code>Hopper: java.util.ConcurrentModificationException</code>。
|66822|<code>Hopper: java.lang.NullPointerException: Batching chunks</code>。
|66824|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property ben{nameshape, clazzclass ate, values[north_south, east_west, ascending_east, ascending_wes</code>。
|66835|命令中的坐标不工作。
|66862|生成落沙实体时，如果使用红石线的方块ID，会导致游戏崩溃。
|66915|只有平滑石应该制成石台阶。
}}</onlyinclude>

# 参考

# 导航

[de:14w33a](de:14w33a.md)
[el:14w33a](el:14w33a.md)
[en:Java Edition 14w33a](en:Java Edition 14w33a.md)
[es:Java Edition 14w33a](es:Java Edition 14w33a.md)
[fr:Version Java 14w33a](fr:Version Java 14w33a.md)
[ja:Java Edition 14w33a](ja:Java Edition 14w33a.md)
[pt:Edição Java 14w33a](pt:Edição Java 14w33a.md)
[ru:14w33a (Java Edition)](ru:14w33a (Java Edition).md)