# Java版1.21.11-pre1

*页面ID: 171896* | *来源: Minecraft Wiki*

文件时，启动游戏会导致游戏崩溃。<ref></ref>}}
（）

; 未混淆版本
   （ · ）

|clientmap=dbda7a8747caf92e948ff44d0ed01cf0fb3e5854
|servermap=e434a6854aa28c14f9103695485be4ab417fbae2
|parent=1.21.11
|prevparent=1.21.10
|prev=25w46a
|next=1.21.11-pre2
|nextparent=26.1
}}<onlyinclude>

* *1.21.11-pre1**是[Java版1.21.11](Java版1.21.11.md)的首个预发布版，发布于2025年11月19日<ref></ref>，修复了一些漏洞。

此版本也额外发布了未经混淆的版本，称为**1.21.11 Pre-Release 1 Unobfuscated**（启动器内称**1.21.11-pre1_unobfuscated**），旨在过渡至后续小更新时移除混淆。<ref></ref>

# 新内容
# = 常规 =
* *[闪烁标语](闪烁标语.md)**
* 加入了以下闪烁标语：
* * Music by Hyper Potions!

* *[选项](选项.md)**
* 在视频设置中加入了“纹理过滤”选项。
* * 此选项也控制“各向异性过滤”选项是否可用。
* * 控制在从一定角度或远处观察纹理时所采用的采样方法。
* * 可用数值有“无”“RGSS”和“各向异性”。
* * 默认设置取决于设备的图形预设和硬件。
* * RGSS（Rotated Grid Super Sampling）是一种基于着色器的过滤方法，能够牺牲适度性能提升纹理清晰度。
* ** 所有硬件均可使用此设置。
* * 各向异性是一种基于硬件的过滤方法，能够提供最佳的纹理清晰度。

* *[数据组件](数据组件.md)**
* 加入了物品组件<code>attack_range</code>。
* * 允许物品具有自定义的交互范围。
* * 会覆盖玩家的实体交互距离属性。
* * 生物的普通近战攻击范围是根据目标碰撞箱与攻击者碰撞箱的距离计算的。该组件通过调整攻击判定箱的最小和最大填充来调整距离判定。
* * 使用带有<code>minecraft:kinetic_weapon</code>组件的物品的生物的攻击范围会与玩家相同。
<div class="treeview">
  *
  ** ：（，默认为0.0）攻击者到目标的最小有效距离。以攻击者眼睛位置、沿视角方向到被攻击者攻击判定箱的最小距离计算。
  ** ：（，默认为3.0）攻击者到目标的最大有效距离。以攻击者眼睛位置、沿视角方向到被攻击者攻击判定箱的最小距离计算。
  ** ：（，默认为0.3）决定攻击判定箱的大小。游戏将实体的碰撞箱向各个方向扩展此距离得到攻击判定箱。
  ** ：（，默认为1.0）对于非玩家生物，其使用的最小有效距离和最大有效距离的缩放乘数。
</div>

* *[纹理](纹理.md)**
* 拆分了马铠纹理，分为底层和着色覆盖层。
* * 新增了物品纹理<code>item/leather_horse_armor_overlay</code>。
* * 新增了实体纹理<code>entity/equipment/horse_body/leather_overlay.png</code>。
* 纹理元数据属性新增了，用于控制cutout纹理的alpha偏置。
* * 技术上而言这个值没有值域限制，可以是负数，但设置高于1.0或低于-1.0不适合，因为纹理会变得完全不透明或完全透明。
* * 默认为0.0，对于远距离时过于透明或过于薄弱的纹理可以提高，否则纹理将很“不透明”。
* * 建议精细调整这个值以找到最佳取值，例如0.1用于海带纹理，防止它们在远处时完全透明。
* * 仅用于cutout纹理的较低MipMap级别，不会改变第一MipMap级别的透明通道值，也不影响其他纹理。

* *[声音事件](Java版声音事件.md)**
* 为鹦鹉螺添加了新的声音事件：
* * <code>entity.baby_nautilus.ambient_land</code>
* * <code>entity.baby_nautilus.death_land</code>
* * <code>entity.baby_nautilus.hurt_land</code>
* * <code>entity.nautilus.ambient_land</code>
* * <code>entity.nautilus.dash_land</code>
* * <code>entity.nautilus.dash_ready_land</code>
* * <code>entity.nautilus.death_land</code>
* * <code>entity.nautilus.hurt_land</code>
* 为僵尸鹦鹉螺添加了新的声音事件：
* * <code>entity.zombie_nautilus.ambient_land</code>
* * <code>entity.zombie_nautilus.dash_land</code>
* * <code>entity.zombie_nautilus.dash_ready_land</code>
* * <code>entity.zombie_nautilus.death_land</code>
* * <code>entity.zombie_nautilus.hurt_land</code>

# 更改
# = 方块 =
* *[树叶](树叶.md)**
* 现在“”选项为关时，树叶的透明部分是与树叶相近的颜色而不是黑色。

# = 物品 =
* *[皮革马铠](皮革马铠.md)**
* 更改了纹理以与保持一致。

* *[矛](矛.md)**
* 将矛的物品切换动画的速度倍率由1.9更改为1.95。
* 生物使用矛进行攻击后若持续冲锋，那么可以继续对目标造成伤害。

# = 生物 =
* *[鹦鹉螺](鹦鹉螺.md)和[僵尸鹦鹉螺](僵尸鹦鹉螺.md)**
* 更改了音效。
* 其头部现在穿过外壳时在视觉上的遮挡减少。

* *[猪灵](猪灵.md)**
* 现在会把金矛视为首选武器了。

* *[骷髅](骷髅.md)及其变种和[溺尸](溺尸.md)**
* 现在无法拾取矛。

* *[僵尸猪灵](僵尸猪灵.md)**
* 现在会用矛进行冲锋。

# = 游戏内容 =
* *[进度](进度.md)**
* 进度“[](进度#advancements-anchor-adventure.spear_many_mobs.md)”由挑战进度改为目标进度。

* *[创造模式物品栏](创造模式物品栏.md)**
* 矛的位置现在在剑之后。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *[选项](选项.md)**
* 现在“各向异性过滤”选项由“纹理过滤”选项控制是否可用。

* *[数据组件](数据组件.md)**
* 将字段<code>min_reach</code>、<code>max_reach</code>和<code>hitbox_margin</code>从物品组件<code>piercing_weapon</code>和<code>kinetic_weapon</code>移到新组件<code>attack_range</code>中，使得所有近战武器都能使用上述字段。

* *[标签](Java版标签.md)**
* 向物品标签<code>#piglin_preferred_weapons</code>中加入了[金矛](金矛.md)。

# 修复
无法识别游戏规则的完整资源路径。
|303919|在梯子上使用突进会浪费耐久和饥饿。
|303942|进度不会给予玩家经验值。
|303950|速度不再能正确增加矛的伤害。
|304029|降雨天气发生时，亡灵生物不再会于无降水的生物群系中在阳光下燃烧。
|304042|一次冲锋攻击连续击中一个末影龙五次可以获得进度。
|304058|较低的环境属性值会使降雨时的迷雾效果急剧增加。
|304095|手持矛会阻止玩家与交互实体通过攻击交互。
|304116|区块淡入选项开启时，实体和方块实体不会正确淡入。
|304127|三次贝塞尔曲线参数的浮动范围不符合更新日志。
|;prev
|304163|启用高级提示框时按住并左键单击实体的名称不再会在聊天栏插入实体的UUID。
|304170|关闭音乐时将“音乐弹窗”选项设置为“”会显示音乐弹窗。
|304190|鱼桶现在有一个不合理的数据组件。
|304191|狐狸可以吃鱼桶，铁桶会直接消失，且狐狸不会被给予状态效果。
|304196|涂蜡的切制铜台阶合成涂蜡的雕纹铜块的配方会输出2个物品而不是1个。
|304212|被骑乘的僵尸鹦鹉螺仍然可以被拴住，不像僵尸马和骆驼尸壳。
}}</onlyinclude>

# 注释

# 参考

# 导航

[de:1.21.11-pre1](de:1.21.11-pre1.md)
[en:Java Edition 1.21.11 Pre-Release 1](en:Java Edition 1.21.11 Pre-Release 1.md)
[es:Java Edition 1.21.11 Pre-Release 1](es:Java Edition 1.21.11 Pre-Release 1.md)
[fr:Édition Java 1.21.11 Pre-Release 1](fr:Édition Java 1.21.11 Pre-Release 1.md)
[ja:Java Edition 1.21.11 Pre-Release 1](ja:Java Edition 1.21.11 Pre-Release 1.md)
[lzh:爪哇版一點二一點一一之預一](lzh:爪哇版一點二一點一一之預一.md)
[pt:Edição Java 1.21.11 Pre-Release 1](pt:Edição Java 1.21.11 Pre-Release 1.md)
[ru:1.21.11 Pre-Release 1 (Java Edition)](ru:1.21.11 Pre-Release 1 (Java Edition).md)