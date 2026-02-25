# Java版26.1-snapshot-2

*页面ID: 181096* | *来源: Minecraft Wiki*

<onlyinclude>

* *26.1-snapshot-2**是[Java版26.1](Java版26.1.md)的第2个快照，发布于2026年1月7日<ref></ref>，加入了命名牌的合成配方，为一些幼年生物加入了新的纹理、模型和音效，并修复了一些漏洞。

# 新内容
# = 物品 =
* *[命名牌](命名牌.md)**
* 加入了合成配方，即用1張[紙](紙.md)和1個任意[金屬顆粒](矿物#金属颗粒.md)合成1个命名牌：


# = 常规 =
* *[标签](Java版标签.md)**
* 加入了物品标签。
* * 包含[铜粒](铜粒.md)、[铁粒](铁粒.md)和[金粒](金粒.md)。

* *实体纹理**
* 新增了下列纹理：
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *

* *[声音事件](Java版声音事件.md)**
* 加入了幼年猫的音效：
* * <code>entity.baby_cat.ambient</code>
* * <code>entity.baby_cat.hiss</code>
* * <code>entity.baby_cat.hurt</code>
* * <code>entity.baby_cat.death</code>
* * <code>entity.baby_cat.eat</code>
* * <code>entity.baby_cat.beg_for_food</code>
* * <code>entity.baby_cat.purr</code>
* * <code>entity.baby_cat.purreow</code>
* * <code>entity.baby_cat.stray_ambient</code>
* 加入了幼年猪的音效：
* * <code>entity.baby_pig.ambient</code>
* * <code>entity.baby_pig.hurt</code>
* * <code>entity.baby_pig.death</code>
* * <code>entity.baby_pig.step</code>
* 加入了幼年狼的音效：
* * <code>entity.baby_wolf.ambient</code>
* * <code>entity.baby_wolf.growl</code>
* * <code>entity.baby_wolf.death</code>
* * <code>entity.baby_wolf.hurt</code>
* * <code>entity.baby_wolf.pant</code>
* * <code>entity.baby_wolf.whine</code>
* * <code>entity.baby_wolf.step</code>

# 更改
# = 生物 =
* *[牛](牛.md)、[绵羊](绵羊.md)、[猪](猪.md)、[猫](猫.md)、[豹猫](豹猫.md)、[哞菇](哞菇.md)、[狼](狼.md)和[鸡](鸡.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了以上幼年生物的[边界箱](边界箱.md)以匹配其新模型。
* 幼年狼身上的[狼铠](狼铠.md)和幼年猪身上的[鞍](鞍.md)现在不再渲染。

* *[兔子](兔子.md)**
* 更改了纹理和模型。
* * 调整了边界箱以匹配其新模型。
* 现在拥有了新动画。

* *[僵尸马](僵尸马.md)**
* 受伤后不再会进入惊慌状态。

# = 常规 =
* *默认JVM选项**
* 游戏现在默认分配4GB内存。
* 在兼容的设备上，使用的垃圾回收器由G1GC变更为ZGC。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>96.0</code>。

* *[实体数据格式](实体数据格式.md)**
* 将玩家独有标签<code>current_explosion_impact_pos</code>和<code>current_impulse_context_reset_grace_time</code>添加到了所有的生物上。
* 移除了玩家数据的<code>ignore_fall_damage_from_current_explosion</code>。

* *[狼音效变种定义格式](狼音效变种定义格式.md)**
* 将所有字段移动到<code>adult_sounds</code>内，并加入了<code>baby_sounds</code>表示幼年狼的音效。

* *[鸡变种定义格式](鸡变种定义格式.md)、[猪变种定义格式](猪变种定义格式.md)、[牛变种定义格式](牛变种定义格式.md)和[猫变种定义格式](猫变种定义格式.md)**
* 加入了<code>baby_asset_id</code>以指定幼年生物的纹理。

* *[狼变种定义格式](狼变种定义格式.md)**
* 加入了<code>baby_assets</code>以指定幼年狼的纹理。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>77.0</code>。
* 移除了Programmer Art资源包中的兔子纹理。

* *实体纹理**
<ul>
<li>重命名了下列纹理：

</li>
<li>移动了下列纹理：

</li>
</ul>

# 修复
</onlyinclude>

# 影片
由[slicedlime](slicedlime.md)製作的影片：

# 参考

# 导航

[de:26.1-snapshot-2](de:26.1-snapshot-2.md)
[en:Java Edition 26.1 Snapshot 2](en:Java Edition 26.1 Snapshot 2.md)
[es:Java Edition 26.1 Snapshot 2](es:Java Edition 26.1 Snapshot 2.md)
[fr:Édition Java 26.1 Snapshot 2](fr:Édition Java 26.1 Snapshot 2.md)
[it:Java Edition 26.1 Snapshot 2](it:Java Edition 26.1 Snapshot 2.md)
[ja:Java Edition 26.1 Snapshot 2](ja:Java Edition 26.1 Snapshot 2.md)
[lzh:爪哇版二六點一之快照二](lzh:爪哇版二六點一之快照二.md)
[nl:26.1 Snapshot 2](nl:26.1 Snapshot 2.md)
[pt:Edição Java 26.1 Snapshot 2](pt:Edição Java 26.1 Snapshot 2.md)
[ru:26.1 Snapshot 2 (Java Edition)](ru:26.1 Snapshot 2 (Java Edition).md)