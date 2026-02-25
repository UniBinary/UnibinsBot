# Java版1.13-pre5

*页面ID: 35225* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.13-pre5**是[Java版1.13](Java版1.13.md)的第5个预发布版，发布于2018年6月28日<ref></ref>，修复了一些漏洞。

# 更改
# = 常规 =
* *库**
* 升级了路径光学代码，现在位于单独的库中，datafixerupper。<!-- Upgrade path optics code is now in a separate library, datafixerupper. --><ref>https://libraries.minecraft.net/com/mojang/datafixerupper/1.0.3/datafixerupper-1.0.3.pom; https://arxiv.org/ftp/arxiv/papers/1703/1703.10857.pdf for info on optics</ref>

* *[扁平化](扁平化.md)**
* 更改了一些实体的英文名称：

* 更改了一些方块的英文名称：

* 更改了一些物品的英文名称：

* 重命名了很多ID使其与游戏命名更加贴合：

* 以下纹理的保存路径已经被更改：

* 更改了一些声音事件的名称：

# 修复
只能在主世界正常工作。
|124970|目标选择器参数值以“!”开头，尽管它们是有效的前缀但显示错误。
|124990|实体选择器中反选变量值的Tab补全不会在聊天栏中以灰色显示。
|125038|新版本不会占据旧世界的边缘。
|125729|融化条件允许的情况下，移动霜冰会使其融化速度减缓。
|125807|方块ID被错误的插入进区块的方块调色板。
|125900|自18w05a以来，地底光线太亮。
|126081|不能捕获鼠标指针。
|126136|实体选择器中变量值的Tab补全会建议反选（即以感叹号开头），即使输入的值的前缀中并没有感叹号。
|126144|鳕鱼碰触下方的固体方块会导致窒息。
|126373|下界与主世界的矿脉密度在18w版本显著降低。
|126508|崩溃：<code>Exception in thread "main" java.lang.UnsatisfiedLinkError: Failed to dynamically load library</code>。
|126569|海底废墟生成时漂浮在水上。
|126599|无法保存区块：<code>java.lang.NullPointerException: null</code>。
|126723|一些生物在错误的地方进入游泳状态。
|126906|桶无法对着充水的方块倒空。
|126915|带有空桶的发射器不能除去方块中的水，而是直接移除整个方块。
|126964|鱼群、守卫者和海豚无法在含水方块中游泳。
|127017|如果珊瑚植物下面的方块被移除，它们不会随之被破坏。
|127803|使用鞘翅飞行并向上看时，玩家会摔倒在地。
|129527|穿着附魔的盔甲时，溺尸的遮罩层显示成深蓝色。
|130182|无法在1.12打开过的世界。
|130270|铁傀儡会在方块内生成。
|130480|输入范围的尝试值和限制情况在错误信息中颠倒。
|130547|记分项minecraft.used只在从2份或更多的物品组中使用物品时才增长值。
|130887|制图师导致的崩溃：无法加载实体NBT。
|131088|从18w16a更新到1.13-pre1后，在已经生成的海底神殿中间出现损坏的区块。
|131094|弹射物在生成后（移动）1格左右内都会忽视碰撞。
|131239|即使下面没有阻挡染色玻璃、铁栏杆和酿造台也会出现在地图上。
|131409|骑着没有马鞍的马时出现缰绳的纹理。
|131599|使用信标后，打开可见配方书的玩家物品栏导致崩溃。
|131739|由于数据修复程序，数据生成器有时会一直运行（并且在完成后总是等待退出）。
|131857|龙的死亡效果不会结束。
|132002|1.12的世界升级到1.13-pre3后，末影龙重生。
|;previous
|132064|传送或跳出水面时不会取消游泳状态。
|132073|创建新世界失败：“<code>Writing into PalettedContainer from multiple threads</code>”，由JRE 1.8.0_25的漏洞导致。
|132139|1.13-pre4崩溃: <code>Failed to locate library: lwjgl_opengl32.dll</code>。
|132144|在从树苗生长的树的底部的原木上使用骨粉将继续消耗骨粉。
}}</onlyinclude>

# 参考

# 导航

[de:1.13-pre5](de:1.13-pre5.md)
[en:Java Edition 1.13-pre5](en:Java Edition 1.13-pre5.md)
[es:Java Edition 1.13-pre5](es:Java Edition 1.13-pre5.md)
[fr:Édition Java 1.13-pre5](fr:Édition Java 1.13-pre5.md)
[ja:Java Edition 1.13-pre5](ja:Java Edition 1.13-pre5.md)
[nl:1.13-pre5](nl:1.13-pre5.md)
[pt:Edição Java 1.13-pre5](pt:Edição Java 1.13-pre5.md)
[ru:1.13-pre5 (Java Edition)](ru:1.13-pre5 (Java Edition).md)