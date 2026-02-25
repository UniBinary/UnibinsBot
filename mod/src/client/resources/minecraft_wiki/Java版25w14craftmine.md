# Java版25w14craftmine

*页面ID: 148493* | *来源: Minecraft Wiki*

<onlyinclude>
自己专属的了！Craft+Mine——懂了吧？这里的“Mine”指的是“世界”……<br>**为什么管它叫“Mine”？**<br>随你怎么叫，我们办公室里还有人叫它“hufffphlexers”，但有些人觉得这名字太难念了。总之你说了算。<br>**这只是一个恶作剧吗？**<br>恶作剧？那是什么？某种我没听说过的新生物？<br>**你真的可以制作一整个世界吗？**<br>是矿境！我们管它叫Mine！（或者hufffphlexers，如果你喜欢的话）。|Julius Olofsson<ref name="craftmine"></ref>}}
* *25w14craftmine**是一个[愚人节玩笑](愚人节玩笑.md)快照，也是所谓“**Craftmine Update**”的唯一一个快照，发布于2025年4月1日<ref name="craftmine"/>。此版本基于发布候选版本[Java版1.21.5-rc1](Java版1.21.5-rc1.md)开发。

# 新内容
# = 方块 =
* *[32px](File:Crafting Table.png.md) [维度控制器](维度控制器.md)（Dimension Control）**
* 可填入不同的Sky Box来切换天空方块的显示。
* 出现于boiler结构。

* *[32px](File:Mine Crafter.gif.md) [矿境合成台](矿境合成台.md)（Mine Crafter）**
* 用于生成前往新的矿境的矿境传送方块。
* 可使用[经验](经验.md)对其升级，每次点击donate消耗20点经验，第<math>n</math>级升级所需经验为<math>\begin{cases}
n \times 60 + 40, 1 \leq n \leq 5 \\
n \times 160 - 560, 6 \leq n \leq 15 \\
n \times 400 - 2400, n \geq 16 \\
\end{cases}</math>。
* 等级保存在[level.dat](level.dat.md)中，这意味着一个世界中所有的矿境合成台的等级都相同。
* 每次升级会多出一个矿境原料槽位，最多可以有50个槽位，在48级时达到。
* 硬度与[基岩](基岩.md)相同。
* 可被[爆炸](爆炸.md)摧毁，爆炸后有概率掉落自身。

* *[32px](File:Mine Revisitor.gif.md) [矿境回访器](矿境回访器.md)（Mine Revisitor）**
* 用于生成前往现有矿境的矿境传送方块。
* 发出等级为15的[光照](光照.md)。
* 硬度和爆炸抗性与基岩相同，但破坏后掉落自身。
* 不可被[活塞](活塞.md)移动。

* *[32px](File:Mine Travelling Block.gif.md) [矿境传送方块](矿境传送方块.md)（Mine Travelling Block）**
* [末地折跃门方块](末地折跃门方块.md)的变种。
* 通过矿境合成台、矿境回访器生成，或在击败末影龙后，在[返回传送门](返回传送门.md)上生成。
* 也会在矿境出口结构中自然生成。
* 与其，会将玩家传送到矿境或主世界。
* * 传送到一个新的矿境或从新的矿境返回时，传送前会倒计时9秒，且每次读秒会伴随着末地传送门被开启的声音；在倒计时结束前，再次可以取消传送；传送至新的矿境时，倒计时字体会持续变大，在剩余不足4秒时，字体会抖动。即使玩家在这期间打开暂停菜单，字体也会继续抖动。
* * 传送到已进入过的矿境时，会将玩家的游戏模式更改为[冒险模式](冒险模式.md)；返回时会更改为[生存模式](生存模式.md)。
* 发出等级为15的光照。
* 硬度和爆炸抗性与基岩相同。
* 不可被活塞移动。
* 破坏后不会掉落。
* 无法通过创造模式物品栏获得。

* *[32px](File:Shimmering Door (item).png.md) [微光之门](微光之门.md)（Shimmering Door）**
* 需要用微光钥匙打开的[门](门.md)，打开后会在门后生成钥匙对应的结构。
* * 若微光钥匙对应结构与世界中已有方块有重叠或使用不含有效组件的微光钥匙，交互界面会摆出一个死亡的颜文字并显示“Something Wrong（出错了）”。
* 对其[试炼钥匙](试炼钥匙.md)或[不祥试炼钥匙](不祥试炼钥匙.md)时，给予玩家一个“差点意思”奖牌（"Close But No" Medal），不消耗钥匙。
* 空手或使用除上述物品外的物品与其时，客户端[动作栏](动作栏.md)中会显示“Doors yearn for the keys!（门渴望钥匙！）”。
* 发出等级为15的光照。
* 硬度和爆炸抗性与基岩相同。
* 不可被活塞移动。
* 破坏后不会掉落。

* *[32px](File:Sky (untinted)(April Fools' joke).png.md) [天空](天空（方块）.md)（Sky）**
* 一种用于大厅维度的方块。
* 始终被渲染成与其方块所在维度的天空效果相同的视觉效果。
* 发出等级为15的光照。
* 硬度和爆炸抗性与基岩相同。
* 不可被活塞移动。
* 破坏后不会掉落。

* *[32px](File:Trophy.png.md) [奖杯](奖杯（25w14craftmine）.md)（Trophy）**
* 共有3种：金奖杯（Golden Cup）、超级马铃薯怪（Mega Spud）和“差点意思”奖牌（"Close But No" Medal）。
* 无法通过[创造模式物品栏](创造模式物品栏.md)获得。
* 没有[碰撞箱](碰撞箱.md)。
* 物品稀有度为“稀有”。

* *[32px](File:Mob Trophy.png.md) [生物奖杯](生物奖杯.md)（Mob Trophy）**
[thumb|有附魔光效（左）与无附魔光效（右）的僵尸生物奖杯](File:Special Mob Trophy.png.md)
* [生物](生物.md)（包括[玩家](玩家.md)）被玩家击杀时有10%的概率掉落对应的生物奖杯。
* * 有1%概率，生物奖杯中的生物模型会带有附魔光效，同时物品信息中会显示一行“哦，闪闪发光！”（Oooh, shiny!）
* 离开矿境时，玩家物品栏中的生物奖杯会一并带回，除非其被装在容器内（如[收纳袋](收纳袋.md)）。
* 无法通过创造模式物品栏获得。
* 没有碰撞箱。
* 对其按下键可使其发出对应生物的音效。
* 物品稀有度为“史诗”，最大堆叠16个。
* 游戏内显示为“奖杯”（Trophy）。

# = 物品 =
* *[32px](File:Eye of Exit.png.md) [出口之眼](出口之眼.md)（Eye of Exit）**
* 生成指向最近的矿境出口结构的末影之眼实体。使用此物品的玩家未解锁Pathfinder时，还会对其造成伤害。
* 玩家在曾进入过的矿境使用此物品会将其传送到大厅中，同时清空玩家在矿境中的物品栏。<!-- 实测发现大厅中的物品栏是独立的 -->
* 合成配方：

* 由于移除了末影之眼，需用出口之眼合成[末地水晶](末地水晶.md)和[末影箱](末影箱.md)。

* *[32px](File:Mine Ingredient.png.md) [矿境原料](矿境原料.md)（Mine Ingredient）**
* 在合成矿境时使用，用于表示[矿境效果](矿境效果.md)。
* 离开矿境时，玩家物品栏中的矿境原料会自动绑定到矿境合成台中，除非其被装在容器内（如[收纳袋](收纳袋.md)）。
* * 对矿境合成台此物品也可绑定。
* ** 但当矿境合成台中已包含该物品，将无法绑定。
* 存在数十种不同的原料，每一种都有特定的获得方式。
* 使用[物品堆叠组件](物品堆叠组件.md)存储具体的类型，可以使用以下命令获得“永恒之夜”矿境原料：{{cmd|1=give @s minecraft:mine_ingredient[minecraft:world_modifiers={effects:["minecraft:eternal_night"],include_description: 1b}]|long=1}}

* *[32px](File:Shimmering Key.png.md) [微光钥匙](微光钥匙.md)（Shimmering Key）**
* 用于打开微光之门的钥匙。
* * 可用{{cmd|1=give @s shimmering_key[minecraft:instant_room={structure:"X"}]}}来打开微光之门。
* ** 其中X参数可为barrels、boiler、carpet、corridor_simple、fountain、grassy_h、hanging、house、labyrinth、pool、ship、simple、stairs、storage1、storage2、sugar_h、test、tree、trophy、tunnel、useless、wheat_h或workshop。
* 通过矿境时有概率获取。
* * 通过特殊矿境时必定生成一个微光钥匙。
* * 通过普通矿境时有10%概率生成一个微光钥匙。

* *[32px](File:Shazboots.png.md) [Shazboots!](Shazboots!.md)**
* ID为<code>shazboots</code>。
* 解锁Shazboots!后，会在每次挑战矿境时获得一个此物品。
* 装备时，玩家会获得[Shazboots!](Shazboots!（状态效果）.md)效果，按住键的同时行走（或疾跑）会获得速度提升，经验条变成速度大小的指示器，此时松开跳跃键会获得短暂的[跳跃提升](跳跃提升.md)效果并跳起，跳跃提升等级为玩家的每刻水平移动速度&times;7.5+1（向下取整）。

* *[32px](File:Sky Box.png.md) [天空盒](天空盒.md)（Sky Box）**
* 用于维度控制器界面。
* * 可以使用{{cmd|1=give @s minecraft:sky_box[minecraft:sky={type:"cube",name:{text:"generic"},repeats:X,size:Y,texture:"Z"}]|long=1}}获得类型为cube的切换背景。
* ** 参数X为重复次数，即方体每一面贴图个数为X*X。
* ** 参数Y为显示视距，为0时不显示。
* ** 参数Z为资源包任意路径，如真正的天空（Actual Sky）为<code>minecraft:block/sky</code>，坏点子（Bad Idea）为<code>minecraft:atlas/blocks</code>。
* 稀有度为“史诗”，最大堆叠1个。
* 在boiler结构中，存在7个变种的天空盒。

* *[32px](File:Grave.png.md) [墓碑](墓碑.md)（Grave）**
* 用于“Oops”进度图标的技术性物品。
* ID为<code>grave_advancement</code>。
* 无法通过[创造模式物品栏](创造模式物品栏.md)获得。
* 稀有度为“少见”。

* *[32px](File:Fire Wand.gif.md) [火焰魔杖](火焰魔杖.md)（Fire Wand）**
* 解锁Leaf后，会在每次进入矿境时获得一个此物品。
* 使用带有光效的[烈焰棒](烈焰棒.md)纹理。
* 无法通过创造模式物品栏获得。
* 稀有度为“史诗”。
* 向前方发射[火球](火球.md)，或在解锁Spellbook和Dragon Fire时发射[末影龙火球](末影龙火球.md)。
* 使用后冷却0.5秒，不消耗[耐久度](耐久度.md)。

* *[32px](File:Mine.png.md) [矿境](矿境（物品）.md)（Mine）**
* 代表已进入过的矿境。
* 通过矿境传送方块从矿境回到大厅时，矿境合成台会掉落一个对应的矿境物品。
* 对矿境回访器会在其上方生成矿境传送方块。
* 无法通过[创造模式物品栏](创造模式物品栏.md)获得。
* 稀有度为“少见”。

* *[32px](File:Teleportation Wand.gif.md) [位移魔杖](位移魔杖.md)（Displacement Wand）**
* 解锁Engima后，会在每次进入矿境时获得一个此物品。
* 使用带有光效的[木棍](木棍.md)纹理，类似于[调试棒](调试棒.md)。
* 无法通过创造模式物品栏获得。
* 稀有度为“史诗”。
* 向前方发射[末影珍珠](末影珍珠.md)。
* * 此末影珍珠不会生成[末影螨](末影螨.md)，也不会在落地时对玩家造成伤害。
* 使用后冷却2.5秒，不消耗耐久度。
* ID为<code>teleportation_wand</code>。

* *[32px](File:Wind Wand.gif.md) [旋风魔杖](旋风魔杖.md)（Wind Wand）**
* 解锁橡树之心（Heart of the Oak）后，会在每次进入矿境时获得一个此物品。
* 使用带有光效的[旋风棒](旋风棒.md)纹理。
* 无法通过创造模式物品栏获得。
* 稀有度为“史诗”。
* 向前方发射[风弹](风弹.md)。
* 使用后冷却0.5秒，不消耗耐久度。

* *[32px](File:Music Disc And Action!.png.md) [音乐唱片](音乐唱片.md)（Music Disc）**
* 加入了[Tone Deaf Rebellion - And Action!](Tone Deaf Rebellion - And Action!.md)音乐唱片。
* * ID为<code>music_disc_and_action</code>。
* * 可以在大厅结构的carpet房间中的木桶中，以及监守者Boss战区域的箱子中找到。
* * 能通过[红石比较器](红石比较器.md)输出15格红石信号。
* * 播放以下音乐：。

# = 生物 =
* *[32px](File:Angry Ghast.gif.md) [愤怒恶魂](愤怒恶魂.md)（Angry Ghast）**
* [恶魂](恶魂.md)的巨型变种。
* 生命值。
* 发现目标时，愤怒恶魂会接连发射3个3倍爆炸威力的火球，然后蓄力。
* 死亡后掉落。

* *[宠物](宠物（25w14craftmine）.md)（Pet）**
* 解锁并激活宠物标签页中的选项后，在进入新的矿境时会生成一只对应的宠物。
* 大多数行为与对应的常规生物相同，但有以下不同：
* * 玩家的[近战攻击](近战攻击.md)无法对宠物造成伤害。
* * [苦力怕](苦力怕.md)不会远离宠物猫。
* * 宠物狐狸不能叼起物品。
* * 宠物狼可以被升级为大型狼、携带[下界合金剑](下界合金剑.md)或穿着[狼铠](狼铠.md)。

* *[村民](村民.md)**
* 加入了[32px](File:Traitor Villager.png.md) [叛徒](叛徒.md)（Traitor）职业。
* * 工作站点方块为[磁石](磁石.md)。
* * 收购[煤炭](煤炭.md)、[铁锭](铁锭.md)、[红石粉](红石粉.md)和[钻石](钻石.md)，卖出与[灾厄村民](灾厄村民.md)对应的矿境效果物品。
* * 向具有[村庄英雄](村庄英雄.md)效果的玩家赠送的物品与[武器匠](武器匠.md)相同。
* * 偶尔会发出[掠夺者](掠夺者.md)的声音。
  :
* *[僵尸村民](僵尸村民.md)**
* 加入了[32px](File:Traitor Zombie Villager.png.md) 叛徒（Traitor）职业。

# = 世界生成 =
* *[大厅](大厅（生物群系）.md)（Hub）生物群系**
* 一种空白的生物群系。

* *[大厅](大厅.md)（Hub）结构**
* 中心是一个由天空方块组成的小房间，房间中央有一个十字[石头](石头.md)平台，上面有一个矿境合成台，两侧有微光之门。
* 有一条无限长的走廊，入口上方挂着一个[云杉木悬挂式告示牌](悬挂式告示牌.md)，上面写着“回忆长廊”（Memory Lane），两侧放置着矿境回访器。
* 主房间和任何用微光之门创建的新房间都封闭在天空方块中。
* 走廊的天花板上方有开放空间，左右两侧以及面向中心的一侧都有高达建筑高度限制的天空方块墙。

可使用微光钥匙打开微光之门生成以下结构：
* ：地板包含5个空[木桶](木桶.md)的房间。
* ：外表为[铜块](铜块.md)的房间，包含一个维度控制器和装有所有变种的天空盒的[箱子](箱子.md)。
* ：一个中间凹陷的羊毛房间，包含3个木桶和1个[唱片机](唱片机.md)，其中一个在唱片机右侧的木桶中包含所有原版唱片与此版本新唱片Tone Deaf Rebellion - And Action!。
* ：一个小型走廊，包含四个由[玻璃](玻璃.md)制作的窗户。
* ：由[砂岩](砂岩.md)及相关建筑方块与[水](水.md)构成的类似喷泉的结构。
* ：一片草地，且有许多[草丛](草丛.md)。
* ：四个空的木桶被[锁链](锁链.md)吊在由[橡木木板](橡木木板.md)组成的支架上。
* ：一个包含[讲台](讲台.md)的房子。其中讲台带有一个写有文字的[书与笔](书与笔.md)。
* ：终点有一个箱子的迷宫，箱子中包含18个钻石等级的闪电束生物奖杯。
* ：较深的水池。水池底可进入，终点有一个写着“nothing”的[绯红木告示牌](绯红木告示牌.md)，以及途中可找到一个写有“•”的告示牌。
* ：不含酿造台、箱子无物品、无展示框与鞘翅的[末地船](末地船.md)。
* ：地板为红石块与绿宝石块的小型房间。
* ：沿着红砖楼梯和梯子走到终点，有一个下界合金等级的羊驼唾沫生物奖杯。
* ：包含一些空箱子的小型房间。
* ：另一个包含空箱子的房间，但在砂岩天花板上方有一个[钻石块](钻石块.md)和三个带有文字的告示牌。
* ：一块甘蔗田。
* ：有一个用[白桦木](白桦木.md)摆成的箭头，两侧分别有一个[绿宝石块](绿宝石块.md)和一个[红石块](红石块.md)。
* ：中间有一棵普通[橡树](橡树.md)。
* ：包含玻璃、[荧石](荧石.md)，以圆石为过道的房间。
* ：只有一个出口的笔直隧道，天花板有绊线钩与绊线连接。
* ：有不包含信标的3层金块底座。
* ：一块小麦田。
* ：一个以圆石为地板和墙壁的空房间，含有4个[火把](火把.md)，天花板为圆石与玻璃组成的窗格。

* *[初始平台](初始平台.md)（Start Platform）**
* 会在玩家初次进入矿境时生成。
* 有一个[合成器](合成器.md)和一个[拉杆](拉杆.md)以进行前期的合成。
* 由[深板岩砖台阶](深板岩砖台阶.md)、[深板岩砖楼梯](深板岩砖楼梯.md)、[深板岩砖](深板岩砖.md)、[去皮苍白橡木](去皮苍白橡木.md)、[去皮苍白橡木原木](去皮苍白橡木原木.md)和[树脂砖台阶](树脂砖台阶.md)组成。

* *[矿境出口](矿境出口.md)（Mine Exit）**
* 在每一个矿境中生成，在特殊事件矿境中则通常需要完成事件后才生成。
* 中间有一个矿境传送方块，点击后玩家将在10秒后离开矿境并传送回中心，这通常是安全离开矿境的唯一方法。
* 方块组成和初始平台的相同。

* *[矿境](矿境.md)（Mines）**
* 是受[矿境效果](矿境效果.md)影响的维度，通常可以通过使用矿境合成台进入，由矿境出口离开。

# = 游戏内容 =
* *[矿境效果](矿境效果.md)（Mine Effects）**
* 控制矿境生成的机制，主要影响矿境内地形、出口位置、生物群系、生物生成、游戏机制等方面。

* *[可解锁项目](可解锁项目.md)（Player Unlocks）**
* 单击生存模式物品栏右上方的“Player Unlocks”按钮或按下打开可解锁项目界面，其界面样式类似于进度界面。
* 可解锁项目需要花费一定的等级解锁，解锁后，能改变玩家的特定属性。
* 只有在解锁了前一个项目后，才能解锁后续的项目。
* 部分项目需要其他先决条件才能解锁，未满足相应先决条件的项目会显示为[毒马铃薯](毒马铃薯.md)且其名称为乱码。相应的先决条件会在其详细描述处提示。

* *[属性](属性.md)**
* 加入了经验获取倍率（Experience Gain Modifier）属性，默认为1，取值范围。
* 加入了拾取区域大小（Pickup Area Size）属性，默认为1，取值范围。
* 加入了最大连跳次数（Max Jumps）属性，默认为1，取值范围。

* *[状态效果](状态效果.md)**
* 加入了状态效果“[Shazboots!](Shazboots!（状态效果）.md)”，ID为<code>shazboots</code>。
* * 使玩家的[安全摔落高度](属性/安全摔落高度.md)属性增加100。
* * 在坐骑上按下跳跃时，坐骑跳跃条会发生变化。

* *[控制](控制.md)**
* 加入了“Unlocks（项目树）”按键绑定选项。

* *[进度](进度.md)**

* 移除了除[Minecraft](进度#Minecraft.md)以外的所有标签页，新增了**纵身坠入（Down The Hatch）**、**功绩（Feats）**和**解锁（Unlocks）**三个标签页。
* * 在“功绩”标签页中保留了“[](进度/25w14craftmine#advancements-anchor-nether.return_to_sender.md)”和“[](进度/25w14craftmine#advancements-anchor-end.dragon_breath.md)”。
* * “Minecraft”标签页中移除了“”、“”、“”、“”、“”和“”进度，并将“”替换为“[千里眼（Spy Eye）](进度/25w14craftmine#advancements-anchor-story.follow_exit_eye.md)”。

# = 常规 =
* *[物品堆叠组件](物品堆叠组件.md)**
* 加入了<code>dimension_id</code>组件。
* * 用于标记获得此矿境的维度。
* * 格式如下：
<div class="treeview">
  :* ：（命名空间ID）此矿境的维度。
</div>
* 加入了<code>exchange_value</code>组件。
* * 用于计算物品被清除时生成的经验值。
* * 除奖杯、生物奖杯、微光之门、天空、矿境原料、微光钥匙外的所有物品都具有此组件。
* * 物品的<code>container</code>和<code>bundle_contents</code>组件内包含的物品也会计算。
* * 格式如下：
<div class="treeview">
  :* ：（）此物品计算的经验值。
</div>
* 加入了<code>instant_room</code>组件。
* * 拥有有效此组件的微光钥匙才能打开微光之门。
* ** 同时决定微光钥匙打开微光之门后生成何种结构。
* * 格式如下：
<div class="treeview">
  :*  物品堆叠组件
  :** ：（命名空间ID）使用的结构模板，游戏会自动将此值解析为<code><*命名空间*>:hub/room/<*路径*>.nbt</code>。
</div>
* 加入了<code>mine_active</code>组件。
* * 用以标记矿境合成台中的矿境是否处于激活状态。如果已激活，则玩家与矿境合成台交互时不会打开其GUI。如果未激活，即使通过了矿境，矿境合成台也不会生成完成矿境的奖励、移除矿境传送方块及标记矿境已完成。
* * 格式如下：
<div class="treeview">
  :* ：<code>{}</code>。
</div>
* 加入了<code>mine_completed</code>组件。
* * 用以标记此矿境的维度是否已完成。
* * 格式如下：
<div class="treeview">
  :* ：此矿境的维度是否已完成。若是玩家死亡等因素结束后获得的矿境，此值为<code>false</code>。
</div>
* 加入了<code>mob_trophy/type</code>组件。
* * 用于控制生物奖杯的物品模型与方块模型中渲染的实体。
* * 格式如下：
<div class="treeview">
  :* ：（命名空间ID）要渲染的实体。此格式只用于定义，游戏在保存时只使用复合标签形式。
  :** ：（命名空间ID）要渲染的实体。
  :** ：（默认为<code>false</code>）是否在实体上渲染光效。
</div>
* 加入了<code>sky</code>组件。
* * 将拥有此组件的Sky Box放入维度控制器后，会强制改变此维度的天空效果。
* * 格式如下：
<div class="treeview">
  :*  物品堆叠组件
  :** ：取值只能为<code>overworld</code>（主世界）、<code>end</code>（末地）、<code>cube</code>（立方贴图）、<code>panorama</code>（固定全景图）和<code>code</code>（代码天空）。
  :**
  :** ：（命名空间ID）天空效果使用的纹理。
  :** ：（）此纹理重复排列的次数。此值为1时每个面只使用一张纹理，为2时使用4张，以此类推。
  :** ：天空盒距离视口的深度。作为参考，原版世界中太阳与月亮位于100。设置为负数时，全部图元因为法线反向从而被剔除，此时天空效果不可见；设置值过小时，视口切入天空盒使得效果只能渲染一部分。
  :** ：（文本组件）物品提示框的提示文本。
</div>
* 加入了<code>special_mine</code>组件。
* * 用于标记此矿境是特殊类型。
* * 格式如下：
<div class="treeview">
  :* ：（命名空间ID）特殊矿境类型。
</div>
* 加入了<code>trophy/type</code>组件。
* * 用于控制奖杯的物品模型。
* * 格式如下：
<div class="treeview">
  :* ：奖杯的类型。取值只能为。
</div>
* 加入了<code>world_effect_uhint</code>组件。
* * 用于标记可解锁且未解锁的矿境效果，使其在物品提示框中显示解锁提示。如果标记了<code>world_effect_unlock</code>组件，则此组件无效。
* * 格式如下：
<div class="treeview">
  :* ：<code>{}</code>。
</div>
* 加入了<code>world_effect_unlock</code>组件。
* * 用于标记在矿境中获取的未解锁的矿境效果，使其在物品提示框中显示“???”及“Bring this item to the Mine exit to unlock as a Mine ingredient（将此物品带到矿境出口，可解锁为矿境原料）”。
* * 拥有此组件的矿境原料才能解锁矿境效果。
* * 格式如下：
<div class="treeview">
  :* ：<code>{}</code>。
</div>
* 加入了<code>world_modifiers</code>组件。
* * 用标记此矿境的维度和矿境原料的矿境效果。
* * 此组件控制了矿境所有的提示框效果。
* * 格式如下：
<div class="treeview">
  :*  物品堆叠组件
  :** ：此维度/矿境原料的矿境效果。
  :*** ：（命名空间ID）一项矿境效果。
  :** ：是否不在提示框中显示矿境效果。
</div>

* *[物品模型映射](物品模型映射.md)**
* 加入了<code>level_ingredient</code>物品模型映射类型。
* * 获取物品堆叠的<code>world_modifiers</code>组件的列表的第一个矿境效果，调用与此矿境效果对应的物品模型映射进行渲染。
* 加入了<code>grade</code>颜色来源。
* * 根据物品堆叠的<code>block_state</code>组件的<code>grade</code>方块状态的值进行着色。
* 加入了<code>mob_trophy</code>硬编码渲染器。
* * 根据物品堆叠的<code>mob_trophy/type</code>组件渲染一个实体。

* *位置信息谓词**
* 加入了新可选字段<code>effects</code>。
* * 存在时，匹配当前维度的矿境效果。
* * 格式如下：
<div class="treeview">
  :* ：检查矿境效果。指定当前维度没有的矿境效果时测试失败。
  :** ：（命名空间ID）一项矿境效果。
</div>

# 更改
# = 方块 =
* *[末地传送门方块](末地传送门方块.md)和[末地传送门框架](末地传送门框架.md)**
* 已被移除。

* *[发射器](发射器.md)、[投掷器](投掷器.md)、[拉杆](拉杆.md)、[侦测器](侦测器.md)和[活塞](活塞.md)**
* 配方中的[圆石](圆石.md)现在可以用[黑石](黑石.md)、[深板岩圆石](深板岩圆石.md)、[安山岩](安山岩.md)、[花岗岩](花岗岩.md)、[闪长岩](闪长岩.md)、[末地石](末地石.md)或[凝灰岩](凝灰岩.md)替代。

* *[熔炉](熔炉.md)和[酿造台](酿造台.md)**
* 现在可以用安山岩、花岗岩、闪长岩、末地石或凝灰岩合成。

* *[床](床.md)**
* 现在无法睡觉或设置重生点。
* * 会在动作栏出现“No sleep for you, not today!（今天没你的觉睡！）”的消息。

# = 物品 =
* *[末影之眼](末影之眼.md)**
* 被移除。

* *[末地水晶](末地水晶.md)**
* 不再能复活[末影龙](末影龙.md)。

* *[毒马铃薯](毒马铃薯.md)**
* 现在即使玩家的饥饿值已满时也能被食用。

* *[石质工具](石质工具.md)**
* 现在可以用[安山岩](安山岩.md)、[花岗岩](花岗岩.md)、[闪长岩](闪长岩.md)、[末地石](末地石.md)或[凝灰岩](凝灰岩.md)合成和修复。

* *[竹子](竹子.md)**
* 现在可被食用。

* *[盾牌](盾牌.md)**
* 更改了动画。
* 现在盾牌不再能[防御](防御.md)，而是挥动盾牌，若已解锁[“火焰护盾”](可解锁项目#战斗（Combat）.md)还会给予使用者5秒抗火状态效果。
* * 这也导致了[不吃这套，谢谢](进度/25w14craftmine#Minecraft.md)进度无法通过正常方式完成。

# = 生物 =
* *[美西螈](美西螈.md)**
* 现在会更频繁地生成。
* 现在也能在[苔藓块](苔藓块.md)和[泥土](泥土.md)上生成。

* *[猫](猫.md)**
* ID更改为<code>pet_cat</code>。

* *[豹猫](豹猫.md)**
* 其生成不再受[海平面](海平面.md)高度、含水方块、碰撞箱限制，也不再只能生成于树叶和草方块上。

* *[猪](猪.md)**
* 现在可以喂食[金胡萝卜](金胡萝卜.md)。

* *[潜影贝](潜影贝.md)**
* 自然生成的潜影贝会随机染色（类似于[潜影盒](潜影盒.md)）。

# = 非生物实体 =
* *[火球](火球.md)**
* 玩家发射的火球现在一定能破坏方块。

# = 世界生成 =
* *[试炼密室](试炼密室.md)**
* 现在会在下界荒地生物群系及其变种和[末地](末地（生物群系）.md)生物群系及其变种生成。

* *[绯红森林](绯红森林.md)、[下界荒地](下界荒地.md)、[诡异森林](诡异森林.md)、[灵魂沙峡谷](灵魂沙峡谷.md)、[玄武岩三角洲](玄武岩三角洲.md)、[末地](末地（生物群系）.md)、[末地荒地](末地荒地.md)、[末地高地](末地高地.md)、[末地内陆](末地内陆.md)和[末地小型岛屿](末地小型岛屿.md)**
* 被视为[主世界](主世界.md)生物群系。
* * 此更改是技术上的，主世界默认使用大厅生成器，并不使用主世界生物群系源生成生物群系。

* *[单一生物群系](自选世界类型.md)、[放大化](放大化.md)和[调试模式](调试模式.md)**
* 已被移除。

* *[要塞](要塞.md)**
* 现在会随机生成，不再环形分布，不再限制数量。
* 用[钻石块](钻石块.md)替代了传送门房间的[末地传送门框架](末地传送门框架.md)。

* *[维度](维度.md)**
* 每一个矿境都会生成一个独立的维度，存储在世界文件夹中的<code>dimensions/minecraft/levelN</code>文件夹，N代表矿境编号。
* 移除了[下界](下界.md)和[末地](末地.md)维度，但仍保留其对应的[生物群系](生物群系.md)。
* * 下界传送门仍然可以在主世界激活，但是只会播放传送动画而无法传送。
* * 矿境中无法激活下界传送门。

* *[石头](石头.md)和[深板岩](深板岩.md)**
* 现在可以以[团簇](团簇.md)生成。

* *[维度类型](维度类型.md)**
* 对环境效果字段<code>effects</code>作如下更改：
* * 不再接受命名空间ID且不再可以不指定，必须指定环境效果详细数据。
* * 格式如下：
<div class="treeview">
  :*
  :** ：云层高度。
  :** ：无任何作用。
  :** ：天空效果。
  :*** 见<code>sky</code>物品堆叠组件。
  :** ：如果为<code>false</code>，则方块亮度偏暗，使发光方块的亮度更明显。
  :** ：是否有固定的环境光照。
  :** ：迷雾效果。取值只能为<code>unscaled</code>（无迷雾）、<code>overworld</code>（有迷雾）和<code>end</code>（无迷雾且下半天空颜色较深）。
  :** ：是否总是渲染迷雾效果。此迷雾效果比<code>fog_scaler</code>程度较轻，可视距离更长。
  :** ：是否有日落日出效果。
</div>

# = 游戏内容 =
* *[末影龙战斗](末影龙战斗.md)**
* 末影龙死亡时不再生成[末地折跃门](末地折跃门.md)。
* 末影龙死亡时，所生成的[返回传送门](返回传送门.md)原点上方3格处会生成矿境传送方块。
* 末影龙重生时不再重置返回传送门。

# = 常规 =
* *[进度](进度.md)**
* 移除了下界、末地、冒险、农牧业标签页和其中的所有进度。
* 移除了“”“”“”“”“”“”和“”进度。

* *[创建新的世界](创建新的世界.md)**
* 游戏模式仅有[生存模式](生存模式.md)和[极限模式](极限模式.md)可选。
* * 生存模式按钮对应的描述修改为“制作和探索矿境，解锁更多矿境原料，再接着制作矿境——并小心特殊矿境！（Craft and explore mines, unlock more ingredients, craft some more - and watch out for the special encounters!）”。
* 移除了“世界”标签页。
* 移除了“实验性内容”按钮。

* *[游戏模式切换器](游戏模式切换器.md)**
* 旁观模式图标由末影之眼更改为出口之眼。

* *[死亡界面](死亡界面.md)**
* 在极限模式中死亡时，重生按钮文本更改为“认输（Accept Defeat）”。
* 在旁观模式下死亡，或在矿境中死亡时，重生按钮文本更改为翻译键<code>deathScreen.respawn.spectate</code>。
* * 若在矿境中死亡，重生按钮文本会在瞬间再次被更改为“认输”。

* *[物品栏](物品栏.md)**
* 加入新的槽位名称<code>player.crafting.4</code>至<code>player.crafting.8</code>以对应物品栏中合成栏的额外部分。

* *[物品堆叠组件](物品堆叠组件.md)**
* 向<code>lodestone_tracker</code>组件加入新字段。
* * 为<code>true</code>时，磁石指针会自动将指向目标更改为最近的矿境出口。
* * 为<code>false</code>时，磁石指针强制随机旋转。

* *[实验性内容](实验性内容.md)**
* “矿车改进”和“红石实验性内容”默认启用。
* 装载了任何实验性内容的存档不再标记“实验性”，也不再在进入世界时弹出警告。

* *[徽标](徽标.md)**
[right|128px](File:Craftmine Logo.png.md)
* 游戏启动时的Mojang Logo仅使用暗色版本。
* 主界面徽标更改为CRAFTMINE。
* * 用作彩蛋“Minceraft”的徽标仍为MINCERAFT。

* *[全景图](全景图.md)**
* 加入了新的全景图，但不会在主菜单显示。
* 当往[维度控制器](维度控制器.md)放入“渺小（Smol）”[天空盒](天空盒.md)时使用。

* *[主菜单](主菜单.md)**
* 背景更改为代码天空（Code Sky）以匹配The Craftmine Update。

* *加载讯息**
* 当载入矿境时，可能会显示以下讯息:
* * Entering mine...
* * Doing something very important...
* * Placing all of the little blocks in the world..
* * Hiding stuff...
* * Making a mess...
* * Trying my best...
* * Forgot something, probably not important...
* * Turning off and back on again...
* * Don't worry about it...
* * Introducing jank...
* * Absolutely placing the entire world one block at a time...（絕對是每次放一個方塊，放滿世界的...）
* ** 这是对[22w13oneBlockAtATime](22w13oneBlockAtATime.md)快照的引用。
* * All your blocks are exactly where you left them
* * Poisoning potatoes...（正在为马铃薯下毒...）
* ** 这是对[24w14potato](24w14potato.md)快照的引用。
* * Voting for mobs...（正在进行生物投票...）
* ** 这是指现已停止的[社群投票](社区投票.md)，也可能是指[23w13a_or_b](23w13a_or_b.md)。
* * Infinitely creating dimensions...（正在无限生成维度...）
* ** 这是对[20w14∞](20w14∞.md)快照的引用。
* * Traveling back to the 90's...（回到90年代...）
* ** 这是对[3D Shareware v1.34](Java版3D Shareware v1.34.md)快照的引用。
* * Increasing texture details...（增加纹理细节...）
* ** 这是指2018年的[愚人节玩笑](愚人节玩笑#2018.md)。
* * Making a portable console...（正在制作便携主机...）
* ** 这是指2017年的[愚人节玩笑](愚人节玩笑#2017.md)。
* * Following the trends...（正在紧跟潮流...）
* ** 这是对[1.RV-Pre1](Java版1.RV-Pre1.md)预发布版的引用。
* * Adding sugar, spice and everything that is nice...（正在加入糖、香料以及一切美好的东西...）
* ** 这是指2015年的[愚人节玩笑](15w14a.md)。
* * Turning players into villagers...（将玩家变成村民...）
* ** 这是指2014年的[愚人节玩笑](愚人节玩笑#2014.md)。
* * Making collabs...（正在联动...）
* ** 这是指2013年的[愚人节玩笑](Java版2.0.md)。
* * Acquiring MineCoins[tm]...
* * Now in 4D!（现已推出4D！）
* ** 这是指2010年的[愚人节玩笑](愚人节玩笑#2010.md)。
* * It’s now NOT safe to turn off your computer（现在不可以安全地关闭计算机了）
* ** 这是指Windows中的「现在可以安全地关闭计算机了」，该画面会在Windows关闭时显示在不支持[ACPI](wikipediazh:高级配置与电源接口.md)的电脑上。
* * Reticulating splines...
* ** 这是对电子游戏《模拟市民》的引用，这句话会出现在游戏的载入介面中。
* * Filling up to the line on a cup...
* * Smoking these blocks...
* * Adding seven mountains and seven seas...
* * Reheating old jokes...
* * Letting the cat out...
* * Letting the cat in...
* * Making everyone confused...
* * Not incrementing the version...
* * Looking under the couch cushions for extra features...
* * Checking if everything Works As Intended...（檢查一切是否如預期工作...）
* ** 這是指[**Mojang錯誤追蹤器**](漏洞追踪器.md)解決方案狀態「如預期工作」。
* * Simulating epic histories of underground kingdoms...（正在模拟地下王国的史诗级历史…）
* ** 这很可能是指电子游戏《矮人要塞》，这是一款高度模拟的殖民地模拟游戏，拥有完善的历史系统。 《矮人要塞》曾对早期版本的Minecraft产生影响。
* * Spreading the rumors...
* * Sprinkling just a pinch of extra blocks on the top...
* * Turning the lights on...
* * Just wasting time until I remember what to do next...
* * Displaying this message...
* * Forgetting about something important...
* * Ruining the game...
* * Walking 500 miles...
* ** 這是對歌曲《I'm Gonna Be (500 Miles)》的引用。
* * Walking 500 more...
* ** 歌曲《I'm Gonna Be (500 Miles)》中的另一句歌詞。
* * Finding a Programmer to get some Art made...（正在寻找程序员进行艺术创作…）
* ** 參考[Programmer Art](:en:Programmer_Art.md)。
* * Breaking some farms...
* * Spilling out lava from buckets...
* * Changing my mind and removing some blocks again...

* *[闪烁标语](闪烁标语.md)**
* 删除了绝大多数原有的闪烁标语，仅保留下列标语：
* * Slow acting portals!（低效传送门！）
* ** 在生存模式下进入下界传送门会显示4秒的传送动画，首次从末地返回会显示胜利屏幕。
* ** 在此版本中，这可能是指传送到一个新的矿境或从新的矿境返回时，传送前需要倒计时9秒。
* * The sum of its parts!（部分的总和！）
* 加入了以下闪烁标语：
* * Mine, you fools!
* * As a large language model...（作为一个大语言模型……）
* ** 某些AI大语言模型经常会在某些回答的开头输出这一句话。
* * Has working fletching tables!
* * Craftable Mines!
* * Secret Tuesday update!（秘密星期二更新！）
* ** 这可能是指2025年4月1日是星期二。
* * Now with magic!
* * You RAM is the limit!
* * Now with sphere-like objects!
* * Working as intended!
* * Talent trees!
* * Clearly not made with AI!
* ** 这个版本的代码是由Mojang的员工编写的。
* * Unlockable!
* * Participation awards!
* * Copyright Mojang AB. Do not distribute!
* ** 与标题屏幕右下方的“”相同。
* * Download more RAM!
* * Enter The Mine!
* ** 创建、进入并通关矿境是此版本的主要玩法之一。
* * Craft mines in Minecraft!
* ** 此版本是Minecraft的一个愚人节玩笑快照。
* * Check out this mine of mine!
* * Infinity 2.0: Now more finite!（无限2.0：现在更有限！）
* ** 这可能是指[20w14∞](20w14∞.md)，另一个愚人节玩笑快照。
* * Minecraftlike!
* * Deleting Overworld!
* ** 此版本的主要玩法发生了改变。
* * Now with even less realism!
* * How do I dig for mine?
* * Contains collectibles!
* * Famously unfinished!
* * Reduced quality!
* * Craft the Earth! In Minecraft!
* * Minecraft À La Carte!
* * Comparable with leading brands!
* * Screens full of excitement!
* ** 全屏游玩能带来更强大的沉浸式体验。
* * <loud portal sounds>
* ** 玩家在游戏中进入矿境时会倒数9秒，并发出打开末地传送门的声音。
* * Programmer Art without extra packs!
* ** 此版本中更新的纹理没有使用额外的纹理包，它包含在游戏纹理中。
* * Now with many more Mines!
* ** 玩家可以使用不同的矿境原料创建风格各异的矿境。
* * Unlock ALL the things!
* ** 玩家可以解锁不同的矿境原料。
* * We joked every other year, but this time we are FOR REAL!
* ** [愚人节玩笑](愚人节玩笑.md)是从2010年开始，在每年的4月1日发布的一系列玩笑内容。
* * Over 3 new items!
* * Is that... is that a sphere!?
* * 99% less starch!
* * And they call it a Mine? A MINE!
* * Mine your own business
* * Do you Mine?
* * Craft a Mine and then Mine and Craft!
* * Just one more Mine</onlyinclude>

# 视频

# 画廊
# = 官网博文图片 =
<gallery>
Craftmine Article 1.jpg
Craftmine Article 2.jpg
Craftmine Article 3.jpg
Craftmine Article 4.jpg
Craftmine Article 5.jpg
Craftmine Article Mines 1.jpg
Craftmine Article Mines 2.jpg
Craftmine Article Mines 3.jpg
Craftmine Article Mines 4.jpg
Craftmine Article Mines 5.jpg
</gallery>

# 参考

# 导航

[de:25w14craftmine](de:25w14craftmine.md)
[en:Java Edition 25w14craftmine](en:Java Edition 25w14craftmine.md)
[es:Java Edition 25w14craftmine](es:Java Edition 25w14craftmine.md)
[fr:Édition Java 25w14craftmine](fr:Édition Java 25w14craftmine.md)
[ja:Java Edition 25w14craftmine](ja:Java Edition 25w14craftmine.md)
[pt:Edição Java 25w14craftmine](pt:Edição Java 25w14craftmine.md)
[ru:25w14craftmine (Java Edition)](ru:25w14craftmine (Java Edition).md)