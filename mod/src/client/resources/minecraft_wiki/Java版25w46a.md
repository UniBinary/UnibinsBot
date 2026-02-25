# Java版25w46a

*页面ID: 171139* | *来源: Minecraft Wiki*

（）

; 未混淆版本
   （ · ）

|clientmap=34d6977a2646e07ecf37493cc2e21fe587d5e3be
|servermap=795fa6a41d2584490cac8311f4419529cee7a134
|parent=1.21.11
|prevparent=1.21.10
|prev=25w45a
|next=1.21.11-pre1
|nextparent=26.1
}}<onlyinclude>

* *25w46a**是[Java版1.21.11](Java版1.21.11.md)的第6个，也是最后一个快照，发布于2025年11月11日<ref></ref>，修复了一些漏洞。

此版本也额外发布了未经混淆的版本，称为**25w46a Unobfuscated**（启动器内称**25w46a_unobfuscated**），旨在过渡至后续小更新时移除混淆。<ref></ref>

# 新内容
# = 生物 =
* *[鹦鹉螺](鹦鹉螺.md)和[僵尸鹦鹉螺](僵尸鹦鹉螺.md)**
* 加入了冲撞攻击的音效。

# = 游戏内容 =
* *[物品栏](物品栏.md)**
* 为鹦鹉螺和僵尸鹦鹉螺加入了物品栏界面。

# = 常规 =
* *[闪烁标语](闪烁标语.md)**
* 加入了以下闪烁标语：
* * One does not simply walk to the Far Lands

* *[战利品表](战利品表.md)**
* 重新加入了战利品抽取项<code>dynamic</code>的接受值<code>contents</code>，以部分回退25w44a的更改。

* *[选项](选项.md)**
* 给“”加入了新选项，可以只在暂停菜单显示音乐弹窗。

* *[声音事件](Java版声音事件.md)**
* 加入了<code>entity.zombie_horse.eat</code>。

# 更改
# = 物品 =
* *[矛](矛.md)**
* 现在不再会产生“物品互动结束”类型的[振动](振动.md)。

* *[马铠](马铠.md)**
* 更改了下界合金马铠的實體纹理，以同步。
* 现在[物品實體](物品實體.md)形式的下界合金马铠不再能被[火](火.md)或[熔岩](熔岩.md)烧毁。

# = 生物 =
* *[焦骸](焦骸.md)**
* 现在免疫[虚弱](虚弱.md)效果。
* 更改了腿部模型UV映射。

* *[马](马.md)、[驴](驴.md)、[骡](骡.md)、[骆驼](骆驼.md)、[僵尸马](僵尸马.md)和[骆驼尸壳](骆驼尸壳.md)**
* 被生物控制时不再能进入惊慌状态。

# = 游戏内容 =

* *[创造模式物品栏](创造模式物品栏.md)**
* 现在创造模式物品栏中的刷怪蛋根据下面的分类顺序进行排列：
* * 主世界
* ** 农场动物
* ** 坐骑
* ** 宠物
* ** 野生动物
* ** 水生生物
* ** 杂项
* ** 傀儡
* ** 村民
* ** 亡灵生物
* ** 蜘蛛
* ** 怪物
* ** 灾厄村民
* * 下界
* * 末地

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *[数据组件](数据组件.md)**
* 为以下物品添加了食物属性：
* * <code>minecraft:cod_bucket</code>
* * <code>minecraft:salmon_bucket</code>
* * <code>minecraft:pufferfish_bucket</code>
* * <code>minecraft:tropical_fish_bucket</code>
* <code>minecraft:use_effects</code>
* * 加入了新字段：使用该物品时是否触发<code>minecraft:item_interact_start</code>和<code>minecraft:item_interact_finish</code>游戏事件。默认为<code>true</code>。

* *[战利品表](战利品表.md)**
* <code>minecraft:dynamic</code>：回退25w44a的更改以重新加入了动态抽取项来源<code>contents</code>。

* *[纹理](纹理.md)**
* 静止的[水](水.md)和[熔岩](熔岩.md)的纹理现在硬编码为<code>minecraft:block/water_still</code>和<code>minecraft:block/lava_still</code>。
* [信标](信标.md)不再支持半透明的纹理。
* 现在多个纹理图集引用同一张精灵图时，游戏将输出警告信息。
* 添加了<code>container/slot/nautilus_armor_inventory</code>。
* * 用于鹦鹉螺铠槽位的精灵图。
* 添加了<code>gui/container/nautilus</code>。
* * 用于鹦鹉螺和僵尸鹦鹉螺的物品栏界面。

* *[模型](模型.md)**
* 方块模型和物品模型的元素现在可以绕多个坐标轴旋转。
* * 旋转按<code>xyz</code>的顺序进行。
* * 添加了新字段<code>x</code>、<code>y</code>和<code>z</code>：绕相应坐标轴旋转的角度，默认为0。
* * 旧字段<code>axis</code>和<code>angle</code>仍然有效。
* ** 旧字段和新字段共存时，以旧字段为准。
* * 移除了要求角度值在区间<code>[-45,45]</code>内的限制。
* * 剔除面的方向不受模型旋转影响。
* 方块模型映射的直接指定方块状态模式现在支持绕着z轴的旋转，在x轴和y轴的旋转之后生效。
* * 添加了新字段<code>z</code>：绕z轴的旋转角度。默认为<code>0</code>，取值只能为<code>0</code>、<code>90</code>、<code>180</code>或<code>270</code>。

* *[选项](选项.md)**
* 将“”重命名为“”。

# 修复
”时，实体、粒子、云、水、半透明方块和具有特殊渲染方式的方块会在方块的轮廓箱前面渲染。
|303653|喂食骆驼尸壳时会出现繁殖时的爱心。
|303695|游戏时重新加载纹理会导致动态纹理渲染不正确。
|303751|焦骸的模型有UV问题。
|303790|方块破坏粒子和轮廓箱会在玻璃或信标的后面渲染。
|303882|副手持上膛的弩时使用矛冲锋在第三人称下看起来不正确。
|;prev
|303940|下界合金马铠会在熔岩或火中烧毁。
|303943|溺尸不再会因水减速。
|303944|玩家处于错误疾跑状态时，击退攻击会播放两次音效。
|303945|鹦鹉模仿焦骸的字幕和焦骸本身的字幕不匹配。
|303947|点击带有数据组件的物品会导致游戏崩溃。
|303948|下界合金马铠的纹理和基岩版的不同。
|303956|进行戳刺攻击之后，冲锋攻击的伤害减少。
|303961|疾跑时暴击会播放击退攻击音效和暴击音效，虽然只进行了暴击。
|303974|调试中的游戏日计数器不再显示。
|304061|新创建的世界中的世界边界警告时间比预期的少。
}}</onlyinclude>

# 注释

# 参考

# 导航

[de:25w46a](de:25w46a.md)
[en:Java Edition 25w46a](en:Java Edition 25w46a.md)
[es:Java Edition 25w46a](es:Java Edition 25w46a.md)
[fr:Édition Java 25w46a](fr:Édition Java 25w46a.md)
[ja:Java Edition 25w46a](ja:Java Edition 25w46a.md)
[lzh:二五週四六甲](lzh:二五週四六甲.md)
[nl:25w46a](nl:25w46a.md)
[pt:Edição Java 25w46a](pt:Edição Java 25w46a.md)
[ru:25w46a (Java Edition)](ru:25w46a (Java Edition).md)