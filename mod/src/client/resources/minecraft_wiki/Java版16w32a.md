# Java版16w32a

*页面ID: 23842* | *来源: Minecraft Wiki*

<onlyinclude>

* *16w32a**是[Java版1.11](Java版1.11.md)的首个快照，发布于2016年8月10日<ref name="blogpost_16w32a"></ref>，重新加入了一些刷怪蛋（除了[猫](豹猫.md)）和新的闪烁标语，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 在[Java版1.10-pre2](Java版1.10-pre2.md)中移除的刷怪蛋被重新加入游戏，除了[猫](豹猫.md)刷怪蛋，包括：
* * [凋灵骷髅](凋灵骷髅.md)
* * [骡](骡.md)
* * [骷髅马](骷髅马.md)
* * [僵尸马](僵尸马.md)
* * [驴](驴.md)
* * [远古守卫者](远古守卫者.md)
* * [流浪者](流浪者.md)
* * [尸壳](尸壳.md)
* 加入了[僵尸村民](僵尸村民.md)的刷怪蛋。

# = 常规 =
* *[闪烁标语](闪烁标语.md)**
* “Javalicious edition”

* *[国际化](国际化.md)**
* 游戏内的更多字符串可用于国际化：
* * 世界选择的错误信息。
* * [自定义](自定义/Java版1.13前.md)（世界类型）的预设名称。
* * [旁观模式](旁观模式.md)特有的选项和信息。
* * 在[选项](选项.md)中的文本“chunks”和“fps”。
* * 在物品的工具提示中的文本“Color:”、“NBT: ”和“Durability: ”。
* * 快捷键的显示文本，以及和其他操作有关的文本。
* * 关于选择[资源包](资源包.md)的文本。

# 更改
# = 物品 =
* *[刷怪蛋](刷怪蛋.md)**
* 现在在创造模式物品栏中按名称排序。

* *堆叠**
* 以拖动方式放置物品时不再出现一叠0个物品。

# = 生物 =
* *[苦力怕](苦力怕.md)**
* 如果苦力怕身上有药水效果，它的爆炸会留下该药水的滞留效果。

* *[尸壳](尸壳.md)**
* 现在会试图避开水。

* *[雪傀儡](雪傀儡.md)**
* 现在会保存南瓜头是否被剪下（在此之前只是游戏中的视觉效果）。

* *[骷髅陷阱马](骷髅陷阱马.md)**
* 雷暴天气中的生成概率减至原来的。

# = 命令格式 =
* ***
* 现在会忽略特定物品的堆叠限制。<ref></ref>
* *[方块状态](方块状态.md)**
* 方块状态目前可以在、、和命令中使用
* * 例如：
* ** <code>/setblock ~ ~ ~ minecraft:stone variant=granite</code>可以替代<code>/setblock ~ ~ ~ minecraft:stone 1</code>
* ** <code>/setblock ~ ~ ~ wool color=blue</code>可以替代<code>/setblock ~ ~ ~ minecraft:wool 11</code>
* ** <code>/setblock ~ ~ ~ minecraft:planks variant=acacia</code>可以替代<code>/setblock ~ ~ ~ minecraft:planks 4</code>
* ** <code>/setblock ~ ~ ~ minecraft:birch_fence_gate facing=west,open=true</code>

# = 游戏内容 =
* *[消耗度](消耗度.md)**

* *[动作栏](动作栏.md)**
* 一些警告会在快捷栏上方出现，类似于“按下[按键]来脱离”：
* * “你只能在晚上睡觉”
* * “你现在不能休息，周围有怪物在游荡”
* * “这张床已被占用”
* * “建筑的高度限制是256格”
* * “无法打开：战利品尚未生成。”

# = 常规 =
* *[资源包](资源包.md)**
* 版本号更改为。
* * 版本的资源包需要所有文件名使用小写字母。

* *实体ID、方块ID与物品ID**
* 现在不再区分大小写。
* * 大写字母自动改为小写字母。

* *实体ID**
* 使用下划线分离单词, 取代大小写混合使用单词。
* 可选择使用<code>minecraft:</code>作前缀，正如方块与物品ID一样。然而它不适用于EntityTag和刷怪笼的生成命令。<ref></ref>
* 更改下列名称：

* 马的实体ID按各自类型分为<code>horse</code>、<code>donkey</code>、<code>mule</code>、<code>skeleton_horse</code>和<code>zombie_horse</code>。
* 骷髅的实体ID按各自类型分为<code>skeleton</code>、<code>stray</code>和<code>wither_skeleton</code>。
* 僵尸的实体ID按各自类型分为<code>zombie</code>、<code>zombie_villager</code>和<code>husk</code>。
* 守卫者的实体ID按各自类型分为<code>guardian</code>和<code>elder_guardian</code>。
* 未使用的存档ID<code>Mob</code>（[生物](生物（已移除实体）.md)）和 <code>Monster</code>（[怪物](怪物（已移除实体）.md)）被移除。

* *[NBT标签](NBT标签.md)**
* 对于所有马，<code>HasReproduced</code>、<code>Type</code>和<code>Saddle</code>被移除。
* <code>ChestedHorse</code>和<code>Items</code>标签现在只会附加于<code>mule</code>和<code>donkey</code>。
* <code>SkeletonTrap</code>和<code>SkeletonTrapTime</code>标签现在只会附加于<code>skeleton_horse</code>。
* 从<code>guardian</code>和<code>elder_guardian</code>移除<code>Elder</code>标签。
* <code>ZombieType</code>标签从所有类型的僵尸中移除。
* <code>ConversionTime</code>和<code>Profession</code>标签现仅适用于<code>zombie_villager</code>。
* <code>SkeletonType</code>标签从所有类型的骷髅中移除。
* <code>Pumpkin</code>字节标签加入<code>snowman</code>。

* *[战利品表](战利品表.md)**
* 驴、骡、尸壳和僵尸村民现在会从它们各自的战利品表中抽取物品，而不是从马和僵尸的战利品表中抽取。

# 修复
+鼠标左键的方式取回缩放后的地图，则该地图不会被正确缩放。
|679|从下界返回主世界后，指南针会指向错误的方向。
|1555|若物品栏已满，则使用+鼠标左键取回合成的成品时该物品会消失。
|2153|鸡颈部的纹理不显示。
|8293|发射器生成的生物的Y轴偏移量不正确。
|11834|生成带有无效ID的物品时服务器控制台窗口中会被信息“Item entity # has no item?!”刷屏。
|14640|乘船或矿车时玩家的饥饿条不会显示。
|26690|阳光下的凋灵骷髅的着火效果会不断闪烁。
|46341|部分游戏文本并未被翻译且在Crowdin上不可用。
|83185|副手中的钓鱼竿在出竿后，其浮漂会消失。
|83571|自定义名称Boss生物的Boss栏名称仍显示为“凋灵”或“末影龙”。
|85320|地图中末地石砖、紫珀块、紫颂植株、骨块和结构方块的颜色显示不正确。
|87034|粒子效果为“最少”时无法看见药水云粒子。
|88096|对栅栏或墙使用刷怪蛋会使生成的生物卡在其内部。
|89064|当游戏规则<code>doMobSpawning</code>或<code>spawn-monsters</code>为时，骷髅陷阱马被闪电击中后仍会生成骷髅骑士。
|90191|盔甲架、蠹虫和末影螨乘船时会不停地旋转。
|91728|瞬间治疗和瞬间伤害药箭并未正确生效。
|93619|创造模式中发射药箭会减少其数量。
|93648|剪去南瓜头的雪傀儡在世界重载后又会重新戴上南瓜头。
|94978|发射器在前两个游戏刻内发射的弹射物不会击中生物。
|95922|破坏矿车后的掉落物的名称显示为其本地化键名。
|96954|乘坐在乘客位上的生物在区块重新渲染后会脱离所骑乘的实体。
|97916|物品在因方块挤压而弹开时的动能过大。
|101441|弓的耐久度为0 / 384时会显示在副手上。
|102047|对生物变种按键会获得其原变种的刷怪蛋。
|103043|凋灵骷髅、流浪者、远古守卫者和僵尸猪人的实体名称不正确。
|105560|区块边界处的漏斗在重载世界后会停止传输物品。
|105787|结构空位有未使用的模型文件。
}}
* *其他修复**
* 手持无效物品时，游戏更稳定了。<ref name= blogpost_16w32a />
* * 降低了复制漏洞出现的概率。</onlyinclude>

# 参考

# 导航

[de:16w32a](de:16w32a.md)
[en:Java Edition 16w32a](en:Java Edition 16w32a.md)
[es:Java Edition 16w32a](es:Java Edition 16w32a.md)
[fr:Édition Java 16w32a](fr:Édition Java 16w32a.md)
[it:Java Edition 16w32a](it:Java Edition 16w32a.md)
[ja:Java Edition 16w32a](ja:Java Edition 16w32a.md)
[nl:16w32a](nl:16w32a.md)
[pt:Edição Java 16w32a](pt:Edição Java 16w32a.md)
[ru:16w32a (Java Edition)](ru:16w32a (Java Edition).md)