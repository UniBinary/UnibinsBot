# Java版1.18-pre1

*页面ID: 90752* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.18-pre1**是[Java版1.18](Java版1.18.md)的首个预发布版，发布于2021年11月11日<ref></ref>，重新加入了[放大化](放大化.md)和[巨型生物群系](巨型生物群系.md)世界类型，做了一些调整，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[世界类型](世界类型.md)**
* 重新加入了[放大化](放大化.md)和[巨型生物群系](巨型生物群系.md)，并进行了修改以使它们适应新地形。
* * 放大化世界的地形有如下改动：
* ** 现在地势最高可达Y=320处，而非先前的Y=256处。
* ** 海平面以上地形的偏移量加倍。<!--Doubled offset above sea level.-->
* ** 大大提高了地形的3D噪声值，相应地降低了Y轴地形缩放因子的值。
* ** 山峰的锯齿程度加倍。
* * 巨型生物群系世界的地形有如下改动：
* ** 将[温度](温度.md)、植被、海陆和侵蚀地貌的多噪声生成（Multinoise）弱化了4倍，但山脉的噪声生成无变化。
* ** 除[河流](河流.md)和山峰生物群系外，生物群系的规模整体扩大到了4倍。

# 更改
# = 方块 =
* *[潮涌核心](潮涌核心.md)**
* 现在使用[镐](镐.md)能加快挖掘。

# = 世界生成 =
* *旧世界升级**
* 现在新旧区块的衔接地形更平滑。
* * 地表高度、生物群系和洞穴现在会衔接得更加平滑。
* 现在[深板岩](深板岩.md)和[基岩](基岩.md)层会在旧区块Y=0高度的下方正确生成。<ref></ref>
* 雕刻器洞穴现在可以在新生成的部分生成。

* *[熔岩湖](熔岩湖.md)**
* 现在在地下只能生成于Y=0以上。

* *[自选世界类型](自选世界类型.md)**
* 从世界创建界面移除了“洞穴”和“浮岛”世界类型。

# = 常规 =
* *数据生成器（Data generator）**
* 现在使用<code>--report</code>参数会生成完整的世界生成参考文件，而不是仅仅包含生物群系的内容。

* *[创建新的世界](创建新的世界.md)界面**
* 从“世界类型”选项中移除了“洞穴”和“浮岛”世界类型。

# 修复
”和“”进度JSON文件所放置的位置与其在UI中显示的不符。
|238038|新加入进度的命名空间ID与其本地化键名不一致。
|238972|沙漠很少或不生成砂岩。
|239714|在沙漠超平坦世界中执行命令会导致游戏卡死。
|239851|升级旧世界会导致树叶被替换为地表生成器所生成的方块。
|239852|与要塞相交的熔岩湖可以把末地传送门框架卡掉。
|;previous
|240481|深板岩不在旧世界下方生成的新洞穴中生成。
|240482|主世界旧区块底部没有基岩。
|240495|深板岩不在恶地或疏林恶地的Y0以下处生成。
|240503|恶地或疏林恶地不生成基岩。
|240516|旧区块下方不生成雕刻器洞穴。
|240531|方块模拟距离总为8个区块，而不遵循滑块中所显示的值。
|240534|点击JFR链接会复制服务端侧的完整文件路径。
|240631|末地地形生成非常缓慢。
|240998|由下界传送门加载出的弱加载区块不再执行非实体运算。<!-- 标题已改写，原标题：Portals no longer load chunks as non entity processing. -->
}}</onlyinclude>

# 参考

# 导航

[de:1.18-pre1](de:1.18-pre1.md)
[en:Java Edition 1.18 Pre-release 1](en:Java Edition 1.18 Pre-release 1.md)
[es:Java Edition 1.18 Pre-release 1](es:Java Edition 1.18 Pre-release 1.md)
[fr:Édition Java 1.18 Pre-release 1](fr:Édition Java 1.18 Pre-release 1.md)
[it:Java Edition 1.18 Pre-release 1](it:Java Edition 1.18 Pre-release 1.md)
[ja:Java Edition 1.18 Pre-release 1](ja:Java Edition 1.18 Pre-release 1.md)
[pt:Edição Java 1.18 Pre-release 1](pt:Edição Java 1.18 Pre-release 1.md)
[ru:1.18 Pre-release 1 (Java Edition)](ru:1.18 Pre-release 1 (Java Edition).md)
[th:รุ่น Java 1.18 Pre-release 1](th:รุ่น Java 1.18 Pre-release 1.md)