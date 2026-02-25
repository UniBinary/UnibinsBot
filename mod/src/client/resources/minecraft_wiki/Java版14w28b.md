# Java版14w28b

*页面ID: 32805* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w28b**是[Java版1.8](Java版1.8.md)的第35个快照，发布于2014年7月10日<ref></ref>，修复了快照[14w28a](14w28a.md)中的一些漏洞和崩溃。

# 更改
# = 方块 =
* *[刷怪笼](刷怪笼.md)**
* 能手中的[刷怪蛋](刷怪蛋.md)来改变生成的生物。

# = 常规 =
* *[主菜单](主菜单.md)**
* 加入了“Minecraft Realms”按钮。

# 修复
和命令不能指定箱子、熔炉、发射器、铁轨以及投掷器的朝向。
|48471|染色玻璃和其他有色物体在被活塞推动时变得完全透明。
|56599|在命令的菜单中，它显示的是，但是命令也可以使用，所以这里应该显示为。
|;dev
|46626|旁观者可以被藤蔓和梯子影响。
|47647|作为头盔戴上的方块在潜行时会保持在站立时的位置。
|48563|多人游戏中，功能显示的是单人世界中最后一次的计分值。
|52261|使用过的“半门”会修改它下面方块的伤害值。
|53277|被充能的栅栏门不显示正确的纹理（在它实际关上时显示为打开）。
|55604|更改难度时有漏洞（关于生物）。
|56461|使用“超级秘密设置”时，染色玻璃阴影的渲染有问题。
|56835|使用放置压力板时，它们会消失。
|57470|加载具有被移除的数据值的方块的世界会使得游戏崩溃：<code>java.lang.IllegalArgumentException: Cannot set property</code>。
|57831|生物会生成在方块里/刷怪笼无视光照等级。
|57973|深色橡树树叶以及金合欢树叶缺失纹理。
|58102|重新登录后，打开酿造台，里面看起来没有物品。
|58255|火焰模型中缺失了一个纹理。
|58437|活塞推动数据值为6,7,14和15的方块会使得游戏崩溃。
|58444|物品展示框使用的是橡木的纹理。
|59258|破坏草和高草可以得到显示为缺失纹理的种子。
|59327|破坏两格高草的底部方块或者在替换它上面的方块时，两格高草的物品会掉落出来。
|59401|尝试打开只有上半部分的木门会使得游戏崩溃。
|59852|特定台阶的名字不正确。
|59872|深色橡树树叶没有名字。
|60009|红色蘑菇方块的变种被颠倒且名字不正确。
|60151|红石中继器被倒置。
|60193|要塞中的门生成地很奇怪。
|60296|割草时发生崩溃：<code>values[sunflower, syringa, double_grass, double_fern, double_rose, paeonia]}</code>。
|60556|生成包含要塞的区块会使得游戏崩溃。
|60814|巨型蘑菇被放置时的纹理有误，但它在物品栏中或掉落在地上时纹理是正确的。
|61122|<code>fire_nsewu</code>的面有错位。
|;previous
|61029|雪层的碰撞箱不正确。
|61031|更改mipmap级别时，GUI和方块会变白。
|61043|梯子占满了整个方块，以至于不能攀爬。
|61058|生物离开激活区域后，绊线仍然保持被激活状态。
|61059|在耕地上种植作物导致“未知属性”错误。
|61066|梯子会意外的从一个不是梯子的方块上获得<code>Facing</code>属性，会导致游戏崩溃。
|61080|更换为旁观模式时，敌对生物消失。
|61082|在火把或木台阶上放置木台阶会使得游戏崩溃。
|61083|在服务器中进入下界时客户端崩溃。
|61091|进入游戏一段时间后，游戏窗口会闪烁。
|61093|手持空桶右键导致游戏崩溃。
|61107|对绊线使用时游戏崩溃。
|61112|在命令中使用<code>clickEvent</code>标签而获得的物品，在世界重载前都不会被显示出来。
|61125|在视觉上，绊线不与绊线钩连接在一起，此时按会使游戏崩溃。
|61128|连接服务器时连接丢失。
|61140|对着木台阶侧面放置木台阶会使游戏崩溃。
|61148|生成期间发生“可可豆年龄无效”问题。
|61155|水的纹理问题。
|61156|<code>Hopper: java.lang.IllegalArgumentException: Comparison method violates its general contract!</code>。
|61163|命令不能更新红石。
|61167|附魔台上的所有符号都是方块。
|61216|方块的伤害值不为0时，命令会给出一个未知错误。
|61247|掉落物会部分陷入地里。
|61315|没有名字的<code>soundEvent</code>导致：<code>[Client thread/WARN]: Unable to play unknown soundEvent: minecraft:</code>。
|61344|拖动滑块时出现Mipmap错误。
|61354|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bci{nameextended, clazzclass java.lang.Boolean, values[true, false]} as it does not exist!</code>。
|61355|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bci{namenorth, clazzclass java.lang.Boolean, values[true, false]} as it does not exist!</code>。
|61357|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bci{nameopen, clazzclass java.lang.Boolean, values[true, false]} as it does not exist!</code>。
|61358|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bci{nameoccupied, clazzclass java.lang.Boolean, values[true, false]} as it does not exist!</code>。
|61359|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bcj{namehalf, clazzclass auu, values[top, bottom]} as it does not exist!</code>。
|61360|<code>Hopper: java.lang.IllegalArgumentException: Cannot get property bcj{namevariant, clazzclass ati, values[dirt, coarse_dirt, podzol]} as it does not exist!</code>。
|61371|<code>Hopper: java.lang.IllegalArgumentException: Cannot set property bck{namefacing, clazzclass ei, values[down, up, north, south, west, east]} to null on block</code>。
|61372|使用活塞移动台阶会使游戏崩溃。
}}</onlyinclude>

# 你知道吗
* 此版本曾经在[启动器](启动器.md)中移除，但在2018年9月重新加入。

# 参考

# 导航

[de:14w28b](de:14w28b.md)
[en:Java Edition 14w28b](en:Java Edition 14w28b.md)
[es:Java Edition 14w28b](es:Java Edition 14w28b.md)
[fr:Édition Java 14w28b](fr:Édition Java 14w28b.md)
[ja:Java Edition 14w28b](ja:Java Edition 14w28b.md)
[pt:Edição Java 14w28b](pt:Edição Java 14w28b.md)
[ru:14w28b (Java Edition)](ru:14w28b (Java Edition).md)