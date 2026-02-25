# Java版14w05b

*页面ID: 33807* | *来源: Minecraft Wiki*

<onlyinclude>

* *14w05b**是[Java版1.8](Java版1.8.md)的第9个快照，发布于2014年1月31日<ref></ref>，发布以修复[14w05a](14w05a.md)里的漏洞和崩溃。

# 更改
# = 生物 =
* *[哞菇](哞菇.md)**
* 获得[隐身](隐身.md)状态效果时，身上的蘑菇不再显示。

* *[绵羊](绵羊.md)**
* 获得隐身状态效果时，身上的羊毛不再显示。

* *[雪傀儡](雪傀儡.md)**
* 获得隐身状态效果时，头部不再显示。

* *狼**
* 获得隐身状态效果时，项圈不再显示。

# = 常规 =
* *[着色器](着色器.md)**
* 现在改变视角并改变观察生物的视角时，现在会从视图中移除。<ref name="comment-219617"></ref>
* 现在会切换不同的着色器，而不是关闭。<ref name="comment-219617"/>

# 修复
命令中，当魔咒ID大于255时会导致游戏崩溃。
|31574|命令中，如果不包含<code>with</code>参数，而只包含<code>translate</code>参数，会导致崩溃。
|33246|使用命令给予或生成的多色烟花导致游戏崩溃。
|33467|使用生成烟花时，使用非数字作为颜色值时会导致游戏崩溃。
|37398|点击主菜单中的“超级秘密设置”时会异常（但不导致崩溃）。
|38915|当玩家在炼药锅内部或者顶部时，可以在炼药锅顶部放置方块。
|40484|执行<code>/summon MinecartRideable ~ ~ ~ <nowiki>{</nowiki>Riding:<nowiki>{</nowiki>id:Villager<nowiki>}}</nowiki></code>后游戏崩溃。
|;dev
|44569|经验等级为负时，经验条不显示。
|44757|在冒险模式中，手指向方块时，其碰撞箱会被显示。
|45102|命令不工作。
|45503|命令在被选定的粒子效果不存在时仍然返回成功消息。
|45762|画的放置位置不正确。
|45826|升级至14w04b后，物品展示框掉落，并且物品展示框在方块错误的一边被渲染。
|46004|高草丛被花替代。
|46084|在新版本中打开旧存档，导致画被破坏。
|;previous
|46402|在旁观模式中飞行时，服务器按照生存模式的情况处理，同时将玩家踢出服务器。
|46416|<code>Hopper: java.lang.NullPointerException: Unexpected error</code>.
|46420|<code>Hopper: java.lang.ArrayIndexOutOfBoundsException: 44339</code>.
|46442|<code>Hopper: java.lang.ArrayIndexOutOfBoundsException: -1</code>.
|46444|旁观模式下重新连接服务器，导致玩家不能穿过实体。
|46447|不能通过合成方式修复工具。
|46465|在旁观具有着色器的生物时切换语言，会导致着色器停止工作。
|46467|<code>Hopper: java.lang.RuntimeException: Already decorating</code>.
|46472|旁观模式下，速度调整功能只有第一次有效。
|46485|使用“Flip”着色器时会黑屏。
|46489|将屏障作为落沙类（<code>FallingSand</code>）实体生成时导致游戏崩溃。
|46510|玩家在旁观模式中可以推动史莱姆。
|46558|当被旁观的生物死亡时，不会恢复为正常的旁观状态。
|46563|在旁观生物时，使用F5切换到第三人称视角，透视效果仍然存在。
|46568|在旁观模式中无法移动。
|46576|在屏障方块内部时游戏崩溃。
}}</onlyinclude>

# 参考

# 导航

[de:14w05b](de:14w05b.md)
[en:Java Edition 14w05b](en:Java Edition 14w05b.md)
[es:Java Edition 14w05b](es:Java Edition 14w05b.md)
[fr:Édition Java 14w05b](fr:Édition Java 14w05b.md)
[ja:Java Edition 14w05b](ja:Java Edition 14w05b.md)
[pt:Edição Java 14w05b](pt:Edição Java 14w05b.md)
[ru:14w05b (Java Edition)](ru:14w05b (Java Edition).md)
[uk:14w05b (Java Edition)](uk:14w05b (Java Edition).md)