# Java版15w47a

*页面ID: 18993* | *来源: Minecraft Wiki*

<onlyinclude>

* *15w47a**是[Java版1.9](Java版1.9.md)的第41个快照，发布于2015年11月18日<ref></ref>，修复了一些漏洞。

# 更改
# = 方块 =
* *[信标](信标.md)**
* 现在将可以掉落放入其中的物品且在重新加载世界后会保留物品。
* 现在将可以与漏斗交互。
* 破坏后不再掉落界面上的物品。

* *[阳光传感器](阳光传感器.md)**
* 夜晚时在被完全遮挡后不再提供信号。

* *丛林[树苗](树苗.md)**
* 生成树时树叶不再替换除树叶和空气外的方块了。

* *[红石块](红石块.md)**
* 现在会正确地更新毗邻方块的激活状态了。
* 不再穿过方块提供信号。

* *[红石比较器](红石比较器.md)**
* 侧边输入会接受红石块的信号了。

* *[陷阱箱](陷阱箱.md)**
* 在计算机时间设为12月24到26日时会变为圣诞节纹理。

# = 命令格式 =
* *NBT标签**
* [信标的方块实体](信标/BE.md)
* * <code>PaymentItem</code>：处于信标槽位的物品。

# = 常规 =
* *[皮肤](皮肤.md)**
* 覆盖层皮肤（帽子、衣服、袖子和裤子）将正确地渲染半透明像素，而不会只是完全不透明或完全透明的像素了。

* *[声音](声音.md)**
* 新的声音事件：<code>entity.armorstand.place</code>、<code>entity.armorstand.fall</code>、<code>entity.armorstand.hit</code>和<code>entity.armorstand.break</code>。
* * 它们被用于[盔甲架](盔甲架.md)，分别是放置、随重力落地、击打、破坏。

# 修复
minecraft:unpowered_comparator, properties[facing, mode, powered]}</code>。
|92595|红石块不能正确更新临近方块的充能状态。
|92866|调试屏幕中，紫珀台阶变种显示的是字母全部大写的<code>DEFAULT</code>，而不是一般的<code>default</code>。
}}</onlyinclude>

# 参考

# 导航

[de:15w47a](de:15w47a.md)
[en:Java Edition 15w47a](en:Java Edition 15w47a.md)
[es:Java Edition 15w47a](es:Java Edition 15w47a.md)
[fr:Édition Java 15w47a](fr:Édition Java 15w47a.md)
[it:Java Edition 15w47a](it:Java Edition 15w47a.md)
[ja:Java Edition 15w47a](ja:Java Edition 15w47a.md)
[pt:Edição Java 15w47a](pt:Edição Java 15w47a.md)
[ru:15w47a (Java Edition)](ru:15w47a (Java Edition).md)