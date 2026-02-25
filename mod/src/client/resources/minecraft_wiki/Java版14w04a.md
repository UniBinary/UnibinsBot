# Java版14w04a

*页面ID: 33785* | *来源: Minecraft Wiki*

（）
   [服务端](https://vault.omniarchive.uk/archive/java/server-release/1.8/pre/14w04a-1526.jar)（）
; 重新上传
   （）
|parent=1.8
|prevparent=1.7.10
|prev=14w03b
|next=14w04b
|nextparent=1.8.1
}}<onlyinclude>

* *14w04a**是[Java版1.8](Java版1.8.md)的第6个快照，发布于2014年1月23日<ref></ref>，加入了命令，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 在指定区域内生成[粒子](粒子.md)。
* * 可以在[实体](实体.md)的相对位置生成。
* 用法：
* * 示例：
* * 粒子列表：<code>hugeexplosion</code>、<code>largeexplode</code>、<code>fireworksSpark</code>、<code>bubble</code>、<code>suspended</code>、<code>depthsuspend</code>、<code>townaura</code>、<code>crit</code>、<code>magicCrit</code>、<code>smoke</code>、<code>mobSpell</code>、<code>mobSpellAmbient</code>、<code>spell</code>、<code>instantSpell</code>、<code>witchMagic</code>、<code>note</code>、<code>portal</code>、<code>enchantmenttable</code>、<code>explode</code>、<code>flame</code>、<code>lava</code>、<code>footstep</code>、<code>splash</code>、<code>wake</code>、<code>largesmoke</code>、<code>cloud</code>、<code>reddust</code>、<code>snowballpoof</code>、<code>dripWater</code>、<code>dripLava</code>、<code>snowshovel</code>、<code>slime</code>、<code>heart</code>、<code>angryVillager</code>、<code>happyVillager</code>、<code>iconcrack_(ID)_(DATA)</code>、<code>blockcrack_(ID)_(DATA)</code>和<code>blockdust_(ID)_(DATA)</code>。

# 更改
# = 方块 =
* *[铁砧](铁砧.md)**
* 之前的工作成本增加从线性（每修复1次）变为指数（每次修复2次+1）。
* 用“牺牲”的方式修复现在花费2个等级而不是1个等级。

* *[按钮](按钮.md)**
* 现在可放置在天花板/地板上。

* *[苔石](苔石.md)**
* 现在可以使用[圆石](圆石.md)和[藤蔓](藤蔓.md)合成。

* *[熔炉](熔炉.md)**
* 当[燃料](烧炼#燃料效率.md)耗尽时，[熔炼](熔炼.md)过程将以正常速度的两倍反转。

* *[枯萎的灌木](枯萎的灌木.md)**
* 现在是可燃的。

# = 生物 =
* *[铁傀儡](铁傀儡.md)**
* 现在又会在死亡时掉落[铁锭](铁锭.md)了。
* 现在可以使用[发射器](发射器.md)来放置[南瓜](南瓜.md)来生成。

* *[雪傀儡](雪傀儡.md)**
* 现在可以使用发射器来放置南瓜来生成。

* *[凋灵](凋灵.md)**
* 现在可以使用发射器来放置[凋灵骷髅头颅](凋灵骷髅头颅.md)来生成。

* *[村民](村民.md)**
* 村民现在会收割、收集和补种[小麦](小麦.md)、[马铃薯](马铃薯.md)和[胡萝卜](胡萝卜.md)。
* * 村民不会拥有无限种子，种子必须被补充才能补种农作物。
* 村民会将小麦合成[面包](面包.md)，并给予其他村民。
* 村民现在能通过给予食物来变得愿意繁殖：3个面包或12个马铃薯或12个胡萝卜。

* *[僵尸猪人](僵尸猪人.md)**
* 现在又会在死亡时掉落[金粒](金粒.md)了。

# = 非生物实体 =
* *[物品展示框](物品展示框.md)**
* 放在框内的物品现在可以被旋转45度（总共8个方向）。
* 物品展示框现在会根据物品的方向而向[红石比较器](红石比较器.md)传递信号。
* * 信号强度如下：0：空；1：有物品；2：物品被旋转1次；3：物品被旋转2次……8：物品被旋转7次。

# = 命令格式 =
* ***
* 加入了过滤方块的能力，前提是不包含方块实体。
* * 仅能在模式中的“正常”方块使用。
* * 语法：

# = 游戏内容 =
* *[魔咒](魔咒.md)**
* [抢夺](抢夺.md)魔咒现在每等级会给予额外1%的概率获得稀有掉落物。

* *[村庄机制](Tutorial:村庄机制.md)**
* [门](门.md)将被添加至最近的[村庄](村庄.md)。
* * 这不会破坏[铁锭](铁锭.md)农场，但会“稍微”改变它们。<ref></ref>

# = 常规 =
* *[调试屏幕](调试屏幕.md)**
[缩略图|调试屏幕中展示XYZ轴的十字准星](File:Crosshairsindebug14w04a.png.md)
* 当面向东西方向时，X坐标栏会被加粗，Y坐标栏则会在面向南北方向时被加粗。
* 普通的十字标将显示出3条彩色的短线，分别指向每个轴的方向：X/红色，Y/绿色，Z/蓝色。

* *[皮肤](皮肤.md)**
* 现在会在第一人称视角中显示右手的第二层皮肤。
* 皮肤和[披风](披风.md)信息现在由服务器发送。
* * 皮肤服务器将减少过期的现象。
* * 服务器是无法更改皮肤/披风的，只有URL被保存在服务器中。
* * 更换皮肤不再需要客户端重启来显示，最坏的情况仅需重新登录服务器来为所有人更新。
* * 相同的皮肤不再需要被下载两次。
* * 服务器流量几乎不会受影响。

* *渲染**
* 只有透明的方块会被渲染成透明（消除了透视纹理包的使用）。

# 修复
命令不能修改单人模式暂停菜单中的默认难度。
|1253|梯子、告示牌、栅栏、栅栏门、活板门会导致它们放置的地方变暗。
|1580|按住键交易时出现幽灵物品。
|5824|仙人掌可以在方块相邻位置生长。
|8662|展示框中的物品居中不正确。
|9582|全字选择在聊天中表现不正常。
|16457|制成雪人后，南瓜的纹理会被翻转。
|18284|使用新AI的生物可以看见隐身玩家。
|25370|鼠标指针在使用键返回上一个菜单时被居中。
|29999|Realms按钮在快照版客户端中依然可见。
|30995|使用命令不能替换具有不同方块实体或NBT数据的相同方块。
|31081|虫蚀石头可以生成2只蠹虫。
|31203|熔炉中的进度条在更改材料后仍然存在。
|32301|熔岩的嘶嘶声每当空气方块被熔岩方块破坏时都会被播放。
|36847|世界选项中的游戏模式设置中的“模式”后面没有冒号。
|37355|中alpha通道的显示不正确。
|;dev
|44368|使用命令方块更改了已锁定难度的世界的难度后，界面上显示的难度不是已被命令方块修改过的难度。
|44467|花在湖边过分生成。
|44551|蠹虫可以侵蚀安山岩、闪长岩和花岗岩。
|44592|熔岩引起的火焰的蔓延范围超出预期。
|44700|使用命令<code>/me @e</code>导致崩溃。
|44890|门被反复添加到村庄门列表中。
|44893|命令不能杀死无敌实体。
|45011|命令不能复制TileEntity的朝向。
|45084|第一人称视角下，外层皮肤不可见。
|;previous
|45056|<code>Hopper: java.lang.NullPointerException: Loading entity NBT</code>。
|45063|绊线不可见。
|45071|当末影人被击中时，世界会卡住。
|45087|熟鱼的ID是<code>minecraft:cooked_fished</code>。
|45172|装备了附魔裤子时，新皮肤模型中上身的外层皮肤会被表现为被附魔的状态。
|45235|可以按两次键疾跑。
|45278|使用命令两次，则在重载世界前，出生点都不会被更新为最后设置的坐标。
|45345|Tile Entity:<code>java.lang.ClassCastException</code>.
|45459|调试代码在服务器控制台上显示。
|;hotfix
|45557|服务器不能产生日志文件。
|45595|服务器被锁定在调试模式，并且在控制台上刷屏。
}}

# 重新上传
该版本的服务端于17:40（UTC）被重新上传，原因未知。</onlyinclude>

# 你知道吗
* 此版本曾经在[启动器](启动器.md)中移除，但在2018年9月重新加入。

# 参考

# 导航

[Category:重新上传过的版本](Category:重新上传过的版本.md)

[de:14w04a](de:14w04a.md)
[en:Java Edition 14w04a](en:Java Edition 14w04a.md)
[es:Java Edition 14w04a](es:Java Edition 14w04a.md)
[fr:Édition Java 14w04a](fr:Édition Java 14w04a.md)
[ja:Java Edition 14w04a](ja:Java Edition 14w04a.md)
[pt:Edição Java 14w04a](pt:Edição Java 14w04a.md)
[ru:14w04a (Java Edition)](ru:14w04a (Java Edition).md)
[uk:14w04a (Java Edition)](uk:14w04a (Java Edition).md)