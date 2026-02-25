# TNT矿车

*页面ID: 9592* | *来源: Minecraft Wiki*

* *TNT矿车（Minecart with TNT）**是一种装载着[TNT](TNT.md)的[矿车](矿车.md)，能够造成[爆炸](爆炸.md)。

# 获取
# = 合成 =

# 用途
以下情况会激活TNT矿车，TNT矿车会在后发生爆炸：
* 经过已激活的[激活铁轨](激活铁轨.md)。
* 被玩家[打火石](打火石.md)<ref></ref>或具有[火焰附加](火焰附加.md)魔咒的物品，包括[附魔书](附魔书.md)。

以下情况会激活TNT矿车，且爆炸时间设置为0到之间：
* 在运行时被摧毁，除非伤害来源是创造模式的玩家。
* 被[小火球](小火球.md)摧毁。
* 被[火](火.md)、[熔岩](熔岩.md)或爆炸摧毁。

以下情况会导致TNT矿车无延迟地立即爆炸：
* 下落超过3格后摔落，且没有着陆在任意种类的[铁轨](铁轨（消歧义）.md)上。
* 以过快的速度过弯、撞上轨道旁的固体阻挡碰撞箱（在之前的移动方向上）。
* 被[着火](着火.md)的箭击中。
* 被推进方块或实体内部并具有速度。

若TNT矿车被摧毁但没有触发爆炸，会掉落1个TNT矿车。

# = Java版 =

TNT矿车造成的爆炸的爆炸威力基础为4，并增加0到1.5倍*威力增加量*之间的一个随机值，但*威力增加量*不会超过5，随机范围上限最高不超过7.5。
* 如果TNT矿车是被激活铁轨或伤害触发的，那么*威力增加量*是TNT矿车的米每秒垂直速度。
* 如果TNT矿车是被着火的箭引爆的，*威力增加量*是箭的米每秒速度。
* 如果TNT矿车是摔落而爆炸的，那么*威力增加量*是摔落距离的十分之一。

TNT矿车最高能造成爆炸威力为11.5的爆炸，该爆炸威力下100%接触率时在简单、普通、困难难度分别能造成爆炸伤害，是游戏中最致命的伤害来源之一。

因为经过激活的[激活铁轨](激活铁轨.md)而被引爆的TNT矿车爆炸范围内的全部种类[铁轨](铁轨（消歧义）.md)及下方承载这些铁轨的方块都不会被爆炸破坏，但爆炸仍会穿透并破坏铁轨和承载方块以外的方块。

TNT矿车不能与[动力矿车](动力矿车.md)连接，并会排斥其他种类的矿车。

# = 基岩版 =

TNT矿车造成的爆炸的爆炸威力固定为3，低于[TNT](TNT.md)。

# 音效
：

|source=方块
|description=TNT被激活
|id=entity.tnt.primed
|translationkey=subtitles.entity.tnt.primed}}

|source=方块
|id=entity.tnt.explode
|translationkey=subtitles.entity.generic.explode
|description=爆炸
}}
</ref>
|description=矿车行进
|id=entity.minecart.riding
|translationkey=-
|foot=1}}

：

# 数据值
# = ID =
：
; 物品

; 实体

：
; 物品

; 实体

# = 物品数据 =
：

：

# = 实体数据 =
：

TNT矿车有与之相联系的包含许多该[实体](实体.md)属性的存档数据。

：

# 历史

|
|</ref>}}
|
|
|
|
|
|
|
|</ref>}}
|
|
|</ref>}}
|
|
|字段，此前此项为<samp>false</samp>时TNT矿车不会展示自定义方块。}}
|
|
|
|
|
|
|
|
|
|
|
|
|
}}

# 你知道吗
* 堆在同一位置的大量TNT矿车在被触碰或运动时会立刻因实体间碰撞而产生高额动能，能造成毁灭性的大范围破坏。
* * 通过来自三个TNT矿车互相重叠所造成的爆炸足以把穿着全套钻石盔甲的玩家伤害到只剩[生命值](生命值.md)。<ref></ref>
* * 通过来自100个TNT矿车互相重叠所造成的爆炸足以在主世界的地表留下一个直径近百米的爆炸坑。

# 画廊
<gallery>
File:First TNT Minecart Image.jpg|由 Dinnerbone 发布的首张关于TNT矿车的截图<ref></ref><ref></ref>（TNT矿车在图片左手下方的角落里）
File:First TNT Minecart Image ZOOM.jpg|缩放后的图片
File:Minecart-with-tnt.png|TNT矿车和用于引爆的激活铁轨
File:13w02a.png|13w02a版本宣传图，上面有TNT矿车和[漏斗](漏斗.md)
File:Dinnerbone safe boom1.jpg|Dinnerbone展示了如何控制TNT矿车爆炸<ref></ref>
File:Dinnerbone safe boom 2.png|即将爆炸的TNT矿车
File:Dinnerbone safe boom 3.jpg|TNT矿车爆炸（注意爆炸没有摧毁铁轨及其下方的方块）
</gallery>

# 参考

# 导航

[Category:载具](Category:载具.md)
[Category:储物](Category:储物.md)

[cs:Vozík s TNT](cs:Vozík s TNT.md)
[de:TNT-Lore](de:TNT-Lore.md)
[en:Minecart with TNT](en:Minecart with TNT.md)
[es:Vagoneta con dinamita](es:Vagoneta con dinamita.md)
[fr:Wagonnet à TNT](fr:Wagonnet à TNT.md)
[it:Carrello da miniera](it:Carrello da miniera.md)
[ja:TNT付きトロッコ](ja:TNT付きトロッコ.md)
[ko:TNT가 실린 광산 수레](ko:TNT가 실린 광산 수레.md)
[nl:Mijnkar met TNT](nl:Mijnkar met TNT.md)
[pl:Wagonik z TNT](pl:Wagonik z TNT.md)
[pt:Carrinho de mina com dinamite](pt:Carrinho de mina com dinamite.md)
[ru:Вагонетка с ТНТ](ru:Вагонетка с ТНТ.md)
[uk:Вагонетка з динамітом](uk:Вагонетка з динамітом.md)