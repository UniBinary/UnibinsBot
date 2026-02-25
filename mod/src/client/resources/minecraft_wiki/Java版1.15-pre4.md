# Java版1.15-pre4

*页面ID: 49895* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.15-pre4**是[Java版1.15](Java版1.15.md)的第4个预发布版，发布于2019年12月3日<ref></ref>，优化了游戏性能，并修复了许多与坐标精度有关的漏洞。

# 更改
# = 常规 =
* *性能**
* 性能优化。

* *精度**
* 将应用于部分[粒子](粒子.md)生成的浮点精度从32位（单精度）提升至64位（双精度）。这使得高数值坐标（特别是绝对值在2以上的坐标）下的精度错误得以修复，让粒子显示在了正确的位置，而不再令其产生偏移，只生成在坐标值为偶数的位置上。得到修复的有以下粒子：
* * 钓鱼粒子<ref></ref>
* * 鱿鱼墨汁粒子<ref></ref>
* * 末地折跃门粒子<ref></ref>
* * 潮涌核心粒子<ref></ref>
* * 实体跌落粒子<ref name="thebigone"></ref>
* * 横扫攻击粒子<ref name="thebigone"/>
* * 攻击时产生的心形粒子<ref name="thebigone"/>
* * 命令产生的粒子<ref name="thebigone"/>
* * 菌丝体粒子<ref name="thebigone"/>
* * 水下粒子<ref name="thebigone"/>
* * 下界传送门粒子<ref name="thebigone"/>
* * 酿造台粒子<ref name="thebigone"/>
* * 刷怪蛋粒子<ref name="thebigone"/>
* * 屏障粒子<ref name="thebigone"/>
* * 盔甲架损坏粒子<ref name="thebigone"/>
* * 受重力影响的方块在悬浮时产生的粒子<ref name="thebigone"/>
* 提高了被激活的TNT实体在高数值坐标下生成的精度，<ref></ref>但被其他爆炸激活的TNT仍存在漏洞。<ref></ref>
* 提高了附魔台上的书本检测玩家的精度，<ref></ref>但书本仍存在不会及时打开的问题。<ref></ref>

# 修复
命令和实体旋转（<code>Rotation</code>）不起作用。
|155520|比较器更新异常。
|157426|本应排序的命令输出没有排序。
|161888|玩家离世界原点较远时，附魔台无法正确定位玩家。
|161991|浮点精度错误：钓鱼的粒子效果在高坐标下失去精度。
|161993|浮点精度错误：潮涌核心的粒子在远距离下被错误地吸引至潮涌核心。
|161994|浮点精度错误：鱿鱼墨汁粒子在高坐标下失去精度。
|161999|浮点精度错误：末地传送门散发的粒子被吸引至一个在高坐标下失去精度的点。
|166047|已驯服的狼会攻击已驯服的鹦鹉。
|;dev
|161394|骷髅和凋灵骷髅头颅内侧纹理不可见。
|164704|在玻璃下方观察的蜂蜜块和黏液块渲染错误。
|164712|云被渲染在区块边界内部。
|165704|天空颜色不再随生物群系和高度改变。
|165977|方块因爆炸而落在了错误的位置。
|166300|熊猫有时候会攻击试图喂养它的玩家。
|166667|物品展示框在未探索区域中不渲染。
|;previous
|166716|三叉戟和盾牌在物品栏中渲染过暗。
|166800|使用<code>DisabledSlots</code>从盔甲架移除物品导致视觉错误。
|167000|物品栏中的玩家模型会在快捷栏有物品时反光。
}}</onlyinclude>

# 参考

# 导航

[de:1.15-pre4](de:1.15-pre4.md)
[en:Java Edition 1.15 Pre-release 4](en:Java Edition 1.15 Pre-release 4.md)
[es:Java Edition 1.15 Pre-release 4](es:Java Edition 1.15 Pre-release 4.md)
[fr:Édition Java 1.15 Pre-release 4](fr:Édition Java 1.15 Pre-release 4.md)
[ja:Java Edition 1.15 Pre-release 4](ja:Java Edition 1.15 Pre-release 4.md)
[pt:Edição Java 1.15 Pre-release 4](pt:Edição Java 1.15 Pre-release 4.md)
[ru:1.15 Pre-release 4 (Java Edition)](ru:1.15 Pre-release 4 (Java Edition).md)