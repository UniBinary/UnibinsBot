# Java版24w06a

*页面ID: 113224* | *来源: Minecraft Wiki*

<onlyinclude>

* *24w06a**是[Java版1.20.5](Java版1.20.5.md)的第8个快照，发布于2024年2月7日<ref></ref>，加入了“”语言选项，优化了[漏斗](漏斗.md)，丰富了[犰狳](犰狳.md)的蜷缩行为，在内置实验性数据包中加入了[物品形式的风弹](风弹（物品）.md)，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[属性](属性.md)**
* 加入了<code>generic.gravity</code>，用于控制实体的重力加速度，值域为-1~1。
* 加入了<code>generic.safe_fall_distance</code>，用于控制生物不受摔落伤害的最大高度，值域为-1024~1024。
* 加入了<code>generic.fall_damage_multiplier</code>，用于控制生物总摔落伤害的倍率，值域为0~100。
* 加入了<code>player.block_break_speed</code>，用于控制玩家破坏方块速度的倍率，值域为0~1024。

* *[选项](选项.md)**
* 在“语言”屏幕中加入了“字体设置”。
* * 将“”选项移入其中。
* * 加入了“”选项。
* ** 用于控制是否在默认字体中为CJK字符使用日本字形。
* ** 默认值基于系统语言环境设置。

* *[字体](字体.md)**
* 加入了字体变体过滤器。
* * 现在字形提供器可以基于特定的变体集来启用或禁用字体变体。
* * 过滤器在<code>filter</code>节中定义，可用于每个字形提供器。
* ** 只有当过滤器中的值与键中变体的实际值匹配时，才会包含该字形提供器。
* * 可用的变体目前是硬编码的，并由字体选项菜单控制。
* ** <code>uniform</code>，连接到“”选项。
* ** <code>jp</code>，连接到“”选项。

* *[标签](Java版标签.md)**
* 加入了下列方块标签：
* * ：。

* *其他**
* 加入了JFR（Java Flight Recorder）事件，用于对单区块的读取（<code>minecraft.ChunkRegionRead</code>）和写入（<code>minecraft.ChunkRegionWrite</code>）。

# 更改
# = 方块 =
* *[漏斗](漏斗.md)**
* 现在其上方有[碰撞箱](判定箱#碰撞箱.md)完整的方块时，不再尝试吸取[物品实体](物品实体.md)。

* *常规**
* 方块位置现在存储为一个由3个整数组成的数组（<code>[I;*x*,*y*,*z*]</code>），而不是一个包含X、Y、Z的复合元素（<code>{X:*x*,Y:*y*,Z:*z*}</code>）。
* [蜂巢](蜂巢（方块）.md)的NBT标签<code>FlowerPos</code>重命名为<code>flower_pos</code>。
* [末地折跃门（方块）](末地折跃门（方块）.md)的NBT标签<code>ExitPortal</code>重命名为<code>exit_portal</code>。

# = 生物 =
* *[犰狳](犰狳.md)**
* 现在只能生成于未染色、红色、橙色、黄色、棕色、白色和淡灰色陶瓦上，而非所有种类的陶瓦。
* 现在蜷缩时会隐藏自己的头和脚，期间会探出头窥视以检查蜷缩条件是否满足。
* * 如果满足，犰狳左右张望后再次缩进壳内；如果不满足，犰狳立即起身。
* 现在拥有新的动画和音效。

* *[狼](狼.md)**
* 驯服的狼生命值由改为。
* 喂食恢复的生命值翻倍。
* 受到不来自箭或玩家的伤害时，伤害不再被调整为<code>-{}-(修正前伤害 + 1) / 2</code>。

* *常规**
* [蜜蜂](蜜蜂.md)的NBT标签<code>FlowerPos</code>和<code>HivePos</code>分别重命名为<code>flower_pos</code>和<code>hive_pos</code>。
* [袭击](袭击.md)生物的NBT标签<code>PatrolTarget</code>重命名为<code>patrol_target</code>。
* [流浪商人](流浪商人.md)的NBT标签<code>WanderTarget</code>重命名为<code>wander_target</code>。
* 可被[拴绳](拴绳.md)拴住的实体的NBT标签<code>Leash</code>重命名为<code>leash</code>。

# = 非生物实体 =
* *[漏斗矿车](漏斗矿车.md)**
* 现在其上方有[碰撞箱](判定箱#碰撞箱.md)完整的方块时，不再尝试吸取[物品实体](物品实体.md)。<ref></ref>

* *常规**
* [末地水晶](末地水晶.md)的NBT标签<code>BeamTarget</code>重命名为<code>beam_target</code>。

# = 游戏内容 =
* *[状态效果](状态效果.md)**
* 现在放大倍率再次被限制在0到255之间。
* * 跳跃提升、飘浮和挖掘疲劳放大倍率超过127的行为已被新的属性所取代。

# = 常规 =
* *[属性](属性.md)**
* 将属性<code>horse.jump_strength</code>重命名为<code>generic.jump_strength</code>，现在对所有实体生效。
* * 控制了一次跳跃的基本冲量。计算优先于跳跃提升或方块属性。

* *[标签](Java版标签.md)**
* 将方块标签中的值替换为。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>31</code>。
* 现在函数中命令的最大长度（包括展开）不能超过2,000,000个字符。
* 通过重用部分原版数据包，减少了登录期间服务器发送的数据量。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>26</code>。

# 新内容（实验性）
# = 物品 =
* *[风弹](风弹（物品）.md)**
* [旋风人](旋风人.md)被玩家或驯服的狼杀死时掉落4-6个，不受[抢夺](抢夺.md)魔咒影响<ref></ref>。
* 可由[玩家](玩家.md)和[发射器](发射器.md)发射。
* * 玩家发射的风弹比[旋风人](旋风人.md)发射的多10%击退<ref></ref>，但影响范围更小。
* * 玩家被自己发射的风弹击中时会重置摔落伤害，且摔落伤害只会从碰撞点以下开始累积。
* 每次使用后有0.5秒的冷却时间。

# = 常规 =
* *[标签](Java版标签.md)**
* 加入了以下方块标签：
* * ：。

# 更改（实验性）
# = 方块 =
* *[宝库](宝库.md)**
* 更改了纹理。

# = 非生物实体 =
* *[风弹](风弹（实体）.md)**
* 旋风人发射的风弹的ID由重命名为。

# = 常规 =
* *[标签](Java版标签.md)**
* 向实体类型标签加入了。

# 修复
静默失效。
|;dev
|267512|无懈可击的恶魂会被反弹的火球杀死。
|267917|幼年犰狳被喂食蜘蛛眼时无进食音效。
|267940|犰狳鳞甲掉落计时器不被储存进数据。
|268065|无AI的犰狳被攻击也会蜷缩。
|268091|音乐“Shuniji”“Dragon Fish”和“Axolotl”不再在播放。
|268096|单人游戏客户端丢失同步的生物群系标签。
|268179|对空气右键会使手上的马铠和狼铠消失。
|268189|<code>block.vault.fall</code>使用占位符音效。
}}</onlyinclude>

# 参考

# 导航

[de:24w06a](de:24w06a.md)
[en:Java Edition 24w06a](en:Java Edition 24w06a.md)
[es:Java Edition 24w06a](es:Java Edition 24w06a.md)
[fr:Édition Java 24w06a](fr:Édition Java 24w06a.md)
[ja:Java Edition 24w06a](ja:Java Edition 24w06a.md)
[pt:Edição Java 24w06a](pt:Edição Java 24w06a.md)
[ru:24w06a (Java Edition)](ru:24w06a (Java Edition).md)
[uk:24w06a (Java Edition)](uk:24w06a (Java Edition).md)