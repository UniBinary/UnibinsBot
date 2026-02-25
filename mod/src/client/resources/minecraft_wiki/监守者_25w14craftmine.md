# 监守者/25w14craftmine

*页面ID: 185480* | *来源: Minecraft Wiki*

| behavior = 敌对生物
| damage = **近战攻击：**<br>简单：<br>普通：<br>困难：<br>
* *直接伤害（音波）（无视[保护魔咒](盔甲机制#保护魔咒机制.md)和盾牌）：**<br>简单：<br>普通：<br>困难：
| knockbackresistance = 100%
| size = **正常：**<br>高度：2.9格<br>宽度：0.9格<br>
* *现身或钻地时：**<br>高度：1.0格<br>宽度：0.9格<br>
* *睡觉时：**<br>
| atk speed = 0.9
| mobtype =
| spawn = 见
}}
* *监守者（Warden）**是一种行为具有表演性质的Boss生物。

# 生成
监守者会生成于[矿境效果](矿境效果.md)“监守者Boss战”生效的[矿境](矿境.md)中。进入矿境前，玩家出生点的<code>[x+40, y ,z]</code>处会放置监守者Boss战舞台，舞台中央生成监守者。

# 掉落物

}}

监守者被玩家击杀后有10%的概率掉落一个[生物奖杯](生物奖杯.md)，内部模型为监守者。

* *矿境原料**

监守者被玩家击杀时，若满足对应的条件则会掉落矿境原料：

* 有5%的概率掉落带有“僵尸”“骷髅”“蜘蛛”“苦力怕”“史莱姆”“末影人”或“女巫”[矿境效果](矿境效果.md)的[矿境原料](矿境原料.md)。
* 当玩家以生命值击杀监守者时，会掉落一个带有“一点生命值”矿境效果的矿境原料。

# 行为
# = 监守者矿境 =

监守者生成后，会躺在舞台中央，直到有玩家在[动作栏](动作栏.md)发出提示后吹响[山羊角](山羊角.md)。过早地吹响山羊角不会使监守者有任何反应。

监守者默认不攻击玩家，不给予玩家[黑暗](黑暗.md)状态效果，不会感测振动。但如果监守者受到伤害，或者60秒后未能进入下一表演阶段，它的行为会变得与常规版本无异，此时只能通过击杀监守者以完成特殊矿境事件。

监守者被唤醒后，会播放生成动画，随后保持静止，直到有玩家在后台播放音乐。接着，监守者会缓慢走至舞台右侧伫立。当后台的[铜灯](铜灯.md)被激活时，监守者会开始舞台上表演蠕虫舞。舞至舞台另一侧后，会再次进入静止状态。

如果有玩家装备了[生物头颅](生物头颅.md)，监守者会开始移动，做出准备攻击的动作，但不会离开舞台中央，此后监守者将保持静止。烟花绽放时，监守者会播放钻地动画，并定格在最后一帧。玩家可通过远离舞台或重载世界使其自然消失。

同一矿境内生成的所有监守者皆遵循此行为模式。每个监守者都有独立的事件进程，但仅当其在舞台或舞台周围生成时，事件才可以推进。

# = 其他矿境 =

监守者在其他矿境的行为与常规版本的监守者无异。

# 音效

|source=敌对生物
|description=空闲时随机播放
|id=entity.warden.ambient
|translationkey=subtitles.entity.warden.ambient
}}

|source=敌对生物
|description=感到可疑时随机播放
|id=entity.warden.agitated
|translationkey=subtitles.entity.warden.agitated
}}

|source=敌对生物
|description=锁定目标后随机播放
|id=entity.warden.angry
|translationkey=subtitles.entity.warden.angry
}}

|source=敌对生物
|description=感到可疑时随机播放
|id=entity.warden.agitated
|translationkey=subtitles.entity.warden.agitated
}}

|source=敌对生物
|description=生成失败或侦测到生物存在且已经进入狂暴状态
|id=entity.warden.listening_angry
|translationkey=subtitles.entity.warden.listening_angry
}}

|source=敌对生物
|description=攻击生物
|id=entity.warden.attack_impact
|translationkey=subtitles.entity.warden.attack_impact
}}

|source=敌对生物
|description=死亡
|id=entity.warden.death
|translationkey=subtitles.entity.warden.death
}}

|source=敌对生物
|description=受伤
|id=entity.warden.hurt
|translationkey=subtitles.entity.warden.hurt
}}

|source=敌对生物
|description=从地下钻出
|id=entity.warden.emerge
|translationkey=subtitles.entity.warden.emerge
}}

|source=敌对生物
|description=钻回地底
|id=entity.warden.dig
|translationkey=subtitles.entity.warden.dig
}}

|source=敌对生物
|description=核心闪动时播放
|id=entity.warden.heartbeat
|translationkey=subtitles.entity.warden.heartbeat
}}

|source=敌对生物
|description=侦测到生物存在且未进入狂暴状态
|id=entity.warden.listening
|translationkey=subtitles.entity.warden.listening
}}

|source=敌对生物
|description=生成失败或侦测到生物存在且已经进入狂暴状态
|id=entity.warden.listening_angry
|translationkey=subtitles.entity.warden.listening_angry
}}

|source=敌对生物
|description=收到幽匿尖啸体的信号1次
|id=entity.warden.nearby_close
|translationkey=subtitles.entity.warden.nearby_close
}}

|source=敌对生物
|description=收到幽匿尖啸体的信号2次
|id=entity.warden.nearby_closer
|translationkey=subtitles.entity.warden.nearby_closer
}}

|source=敌对生物
|description=收到幽匿尖啸体的信号3次
|id=entity.warden.nearby_closest
|translationkey=subtitles.entity.warden.nearby_closest
}}

|source=敌对生物
|description=侦测到振动
|id=entity.warden.tendril_clicks
|translationkey=subtitles.entity.warden.tendril_clicks
}}

|source=敌对生物
|description=锁定目标
|id=entity.warden.roar
|translationkey=subtitles.entity.warden.roar
}}

|source=敌对生物
|description=嗅气味
|id=entity.warden.sniff
|translationkey=subtitles.entity.warden.sniff
}}

|source=敌对生物
|description=进行远程攻击
|id=entity.warden.sonic_boom
|translationkey=subtitles.entity.warden.sonic_boom
}}

|source=敌对生物
|description=准备远程攻击
|id=entity.warden.sonic_charge
|translationkey=subtitles.entity.warden.sonic_charge
}}

|source=敌对生物
|description=行走
|id=entity.warden.step
|translationkey=subtitles.block.generic.footsteps
|foot=1
}}

# 数据值

# 进度

# 画廊
# = 渲染图 =
<gallery>
Warden_sleeping.gif|正在睡觉的监守者
Warden_worm_dance.gif|正在跳蠕虫舞的监守者
</gallery>

# = 截图 =
<gallery>
Warden's worm dance.png|监守者表演蠕虫舞
Warden's attacking performance.png|被激怒的监守者
</gallery>

# 导航

[Category:愚人节玩笑特性](Category:愚人节玩笑特性.md)

[en:Warden (April Fools' joke)](en:Warden (April Fools' joke).md)