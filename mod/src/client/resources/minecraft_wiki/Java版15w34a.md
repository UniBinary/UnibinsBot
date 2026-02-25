# Java版15w34a

*页面ID: 17734* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w34a**是[Java版1.9](Java版1.9.md)的第10个快照，发布于2015年8月19日<ref></ref>，加入了新的NBT标签，并修复了一些漏洞。

# 新内容
# = 常规 =
* *NBT标签**
* 为[命令方块](命令方块.md)加入了<code>powered</code>和<code>conditional</code>byte标签。
* 给<code>FireballBase</code>添加<code>life</code>（整形）和 <code>power</code>（列表/双精度）标签。
* 为[刷怪笼](刷怪笼.md)在<code>SpawnData</code>标签加入了<code>id</code>string标签。
* 为[音符盒](音符盒.md)加入了<code>powered</code>byte标签。

# 更改
# = 方块 =
* *[命令方块](命令方块.md)**
* 16种新纹理 - 15个颜色变种， 1个纹理变种。
* 以前的命令方块电路依然可以工作。
* 3种模式：脉冲、循环、连锁 - 颜色基于模式改变。
* * 脉冲模式：在该方块从未充能到充能状态时触发一次命令。
* * 连锁模式：此命令方块激活时，当指向该命令方块的命令方块执行命令后才会触发命令。
* * 循环模式：激活后每一游戏刻都会触发一次命令。
* 有指向性了，放置模式与活塞一样。
* 选取方块功能在新命令方块上依旧有效。
* 动态纹理：方块中心的像素点。

# = 物品 =
* *[地图](地图.md)**
* 最新的地图会有更大更有用处的比例尺（1:4）
* 可以用[剪刀](剪刀.md)缩小地图比例尺
* * 缩小后的地图是原地图的右下角部分

# = 生物 =
* *[僵尸](僵尸.md)**
* 空闲时会放下双臂。

* *[巨人](巨人.md)**
* 不再渲染模型。
* 依然可以用命令召唤。

* *[潜影贝](潜影贝.md)**
* 再次能搭乘矿车了。

# = 游戏内容 =
* *战斗系统**
* 新的“攻击力度”战斗机制。
* * 攻击后出现一个进度条。
* ** 在进度条满之前造成的伤害将减少。
* ** 空手填充时间为0.25秒，[剑](剑.md)、[镐](镐.md)、[锹](锹.md)填充时间为0.8秒，[斧](斧.md)的填充时间为1.2秒。
* ** 可以显示在物品栏旁边（左右由主手决定），在准星下方，或者不显示。
* * 切换物品栏时会产生一个缓慢上升的冷却动画。
* 当剑、锹、镐、斧装备在主手时会产生延迟。

# = 常规 =
* *NBT标签**
* 刷怪笼不再使用<code>EntityId</code>标签。

* *优化**
* 优化了生物AI，寻路算法和方块刻。
* * 可见度为16时方块刻加快15%。

# 修复
并非最佳配置。

|;previous
|86137|生存模式下破坏生物头颅时游戏会崩溃。
|86138|对生物头颅和结构方块按下键会导致游戏崩溃。

}}</onlyinclude>

# 参考

# 导航

[de:15w34a](de:15w34a.md)
[en:Java Edition 15w34a](en:Java Edition 15w34a.md)
[es:Java Edition 15w34a](es:Java Edition 15w34a.md)
[fr:Édition Java 15w34a](fr:Édition Java 15w34a.md)
[it:Java Edition 15w34a](it:Java Edition 15w34a.md)
[ja:Java Edition 15w34a](ja:Java Edition 15w34a.md)
[pt:Edição Java 15w34a](pt:Edição Java 15w34a.md)
[ru:15w34a (Java Edition)](ru:15w34a (Java Edition).md)