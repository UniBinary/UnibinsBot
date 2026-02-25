# Java版26.1-snapshot-7

*页面ID: 185921* | *来源: Minecraft Wiki*

<onlyinclude>

* *26.1-snapshot-7**是[Java版26.1](Java版26.1.md)的第7个快照，发布于2026年2月11日<ref></ref>，加入了[音符盒](音符盒.md)的新音色“小号”，加入了部分生物的音效变种，更改了部分幼年生物的模型，并修复了一些漏洞。

# 新内容
# = 方块 =
* *[音符盒](音符盒.md)**
* 加入了新的音色“小号”（Trumpet），对应的乐器方块为[铜块](铜块.md)、[雕纹铜块](雕纹铜块.md)、[切制铜块](切制铜块.md)、[切制铜楼梯](切制铜楼梯.md)、[切制铜台阶](切制铜台阶.md)及其氧化和涂蜡变种。
* * 音色会随着[氧化](氧化.md)程度的不同而改变。

# = 生物 =
* *[猫](猫.md)、[猪](猪.md)、[牛](牛.md)和[鸡](鸡.md)**
* 加入了新的成年音效变种：
* * 猫
* ** royal
* * 猪
* ** mini
* ** big
* * 牛
* ** moody
* * 鸡
* ** picky
* 原先的音效变种被称为classic。
* 已有生物的音效变种会是所有变种中的随机一种。

# = 常规 =
* *[选项](选项.md)**
* 在“世界选项”屏幕中加入了“”按钮。

* *[数据包](数据包.md)**
* 加入了、、和子文件夹。
* [猫](猫.md)、[猪](猪.md)、[牛](牛.md)和[鸡](鸡.md)的音效变种现在可由数据包定义。

* *[注册表](注册表.md)**
* 加入了可写注册表。

* *[猫音效变种定义格式](猫音效变种定义格式.md)**
* 猫的音效变种可通过{{filepath|-{}-data/<*命名空间*>/cat_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年猫使用的音效。
  *** ：猫空闲音效的命名空间ID，或直接定义一个[声音事件](Java版声音事件.md)。
  *** ：猫驯服前空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫威慑幻翼音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫进食音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫求食音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫呼噜声音效的命名空间ID，或直接定义一个声音事件。
  *** ：猫驯服后空闲音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年猫使用的音效。
  *** 格式同。
</div>

* *[鸡音效变种定义格式](鸡音效变种定义格式.md)**
* 鸡的音效变种可通过{{filepath|-{}-data/<*命名空间*>/chicken_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年鸡使用的音效。
  *** ：鸡空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：鸡行走音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年鸡使用的音效。
  *** 格式同。
</div>

* *[猪音效变种定义格式](猪音效变种定义格式.md)**
* 猪的音效变种可通过{{filepath|-{}-data/<*命名空间*>/pig_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：成年猪使用的音效。
  *** ：猪空闲音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪受伤音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪死亡音效的命名空间ID，或直接定义一个声音事件。
  *** ：猪行走音效的命名空间ID，或直接定义一个声音事件。
  ** ：幼年猪使用的音效。
  *** 格式同。
</div>

* *[牛音效变种定义格式](牛音效变种定义格式.md)**
* 牛的音效变种可通过{{filepath|-{}-data/<*命名空间*>/cow_sound_variant/<*id*>.json}}来添加。
* 格式：
<div class="treeview">
  *  父标签
  ** ：牛空闲音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛受伤音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛死亡音效的命名空间ID，或直接定义一个声音事件。
  ** ：牛行走音效的命名空间ID，或直接定义一个声音事件。
</div>

* *[声音事件](Java版声音事件.md)**
* 加入了猫的新音效：
* * <code>entity.cat_royal.ambient</code>
* * <code>entity.cat_royal.hiss</code>
* * <code>entity.cat_royal.hurt</code>
* * <code>entity.cat_royal.death</code>
* * <code>entity.cat_royal.eat</code>
* * <code>entity.cat_royal.beg_for_food</code>
* * <code>entity.cat_royal.purr</code>
* * <code>entity.cat_royal.purreow</code>
* * <code>entity.cat_royal.stray_ambient</code>
* 加入了猪的新音效：
* * <code>entity.pig_mini.ambient</code>
* * <code>entity.pig_mini.hurt</code>
* * <code>entity.pig_mini.death</code>
* * <code>entity.pig_big.ambient</code>
* * <code>entity.pig_big.hurt</code>
* * <code>entity.pig_big.death</code>
* 加入了鸡的新音效：
* * <code>entity.chicken_picky.ambient</code>
* * <code>entity.chicken_picky.death</code>
* * <code>entity.chicken_picky.hurt</code>
* * <code>entity.chicken_picky.step</code>
* 加入了牛的新音效：
* * <code>entity.cow_moody.ambient</code>
* * <code>entity.cow_moody.death</code>
* * <code>entity.cow_moody.hurt</code>
* * <code>entity.cow_moody.step</code>
* 加入了音符盒小号音色的新音效：
* * <code>block.note_block.trumpet</code>
* * <code>block.note_block.trumpet_exposed</code>
* * <code>block.note_block.trumpet_oxidized</code>
* * <code>block.note_block.trumpet_weathered</code>

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

# 更改
# = 方块 =
* *[金蒲公英](金蒲公英.md)**
* 现在可以对幼年[疣猪兽](疣猪兽.md)使用。
* 现在被使用过金蒲公英的幼年动物不会自然消失。

* *[炼药锅](炼药锅.md)**
* 现在装有的[水](水.md)是透明的。

# = 生物 =
* *[殭屍](殭屍.md)、[屍殼](屍殼.md)、[沉屍](沉屍.md)、[豬布林](豬布林.md)、[殭屍化豬布林](殭屍化豬布林.md)、[村民](村民.md)和[殭屍村民](殭屍村民.md)**
* 更改了幼年个体的纹理和模型。
* * 调整了[边界箱](边界箱.md)以匹配其新模型。

* *[骷髅马](骷髅马.md)和[僵尸马](僵尸马.md)**
* 幼年个体不再会成长为成年个体。

* *[海龟](海龟.md)**
* 更改了幼年海龟的四肢纹理。

* *[狼](狼.md)**
* 修正了已驯服的幼年苍狼的面部纹理，以区别于未驯服个体。

* *[猫](猫.md)**
* 修正了幼年英国短毛猫的后脑勺纹理。

* *[猪](猪.md)**
* 调整了幼年猪的头部位置，现在是居中的。
* 修正了幼年温带猪的身体纹理，使其色调一致。

* *[驴](驴.md)和[骡](骡.md)**
* 更改了幼年个体的纹理映射。

# = 常规 =
* *[聊天](聊天.md)**
* 现在可以随时打开聊天屏幕，即使聊天被聊天设置所限制。
* * 发送、接收信息以及发送命令仍会被聊天设置所限制。
* * 若在限制聊天的情况下打开聊天屏幕，聊天框顶部和输入框上方会显示关于限制的提示信息。
* ** 点击聊天框顶部的提示信息会打开一个屏幕，以提醒玩家更改聊天设置以及目前能在聊天屏幕做什么。
* 现在即使玩家或服务端的聊天被限制，客户端在聊天框做出的记录（如截图）也会显示。
* 现在更改聊天设置后，聊天框中的所有受限制的信息都会被隐藏。
* 在本地服务器上聊天信息的处理方式现在在聊天设置上与专用服务器上更为一致。

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>99.1</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>81.0</code>。

* *[标签](Java版标签.md)**
* 从实体类型标签中移除了[骆驼尸壳](骆驼尸壳.md)和[疣猪兽](疣猪兽.md)。

* *[方块模型](方块模型.md)**
* 所有方块模型现在均可支持镂空或半透明（部分透明的像素）纹理。
* * 四边形被划分至镂空渲染通道还是半透明渲染通道，取决于其指定精灵图的纹理内容。
* ** 含有半透明（部分透明）像素的精灵图将被分配至“半透明”通道。
* ** 含有完全透明像素的精灵图将被分配至“镂空”通道。
* ** 其余所有精灵图均分配至“实心”通道。
* 更新了<code>textures</code>纹理映射的格式：
* * 非字符串类型的条目现在将被拒绝，不再会被解析为字符串。
* * 除了此前已有的内联精灵图ID形式外，条目现在还可以通过包含以下字段的来定义：
* ** <code>sprite</code> - 精灵图ID
* ** <code>force_translucent</code> - 可选布尔值，若设为<code>true</code>，则使用此纹理的所有几何体将被强制划入“半透明”通道。
* *** 该选项对例如使用<code>mean</code>均值mipmap策略但不含半透明像素的方块很有用。
* *** 默认值：<code>false</code>

* *[着色器](着色器.md)与后处理管线**
* <code>block.vsh</code>与<code>terrain.vsh</code>顶点着色器现在不再接收<code>Normal</code>法线顶点属性。

* *其他更改**
* 更改了区块几何数据在GPU内存中的存储方式及其渲染逻辑的内部实现。

# 修复
标签设置为低于-24000的骆驼尸壳使用了已移除的幼年变种的边界箱尺寸和动画速度。
|306201|幼年海龟的腿部现在会深度冲突。
|306207|加载了需要升级的世界之后，选择世界菜单的世界升级提示会在每一个世界上显示。
|306222|一些26.1 Snapshot 6加入的字符串有语法错误。
}}</onlyinclude>

# 影片
由[slicedlime](slicedlime.md)製作的影片：

# 参考

# 导航

[de:26.1-snapshot-7](de:26.1-snapshot-7.md)
[en:Java Edition 26.1 Snapshot 7](en:Java Edition 26.1 Snapshot 7.md)
[es:Java Edition 26.1 Snapshot 7](es:Java Edition 26.1 Snapshot 7.md)
[fr:Édition Java 26.1 Snapshot 7](fr:Édition Java 26.1 Snapshot 7.md)
[ja:Java Edition 26.1 Snapshot 7](ja:Java Edition 26.1 Snapshot 7.md)
[ko:Java Edition 26.1 스냅숏 7](ko:Java Edition 26.1 스냅숏 7.md)
[lzh:爪哇版二六點一之快照七](lzh:爪哇版二六點一之快照七.md)
[nl:26.1 Snapshot 7](nl:26.1 Snapshot 7.md)
[pt:Edição Java 26.1 Snapshot 7](pt:Edição Java 26.1 Snapshot 7.md)
[ru:26.1 Snapshot 7 (Java Edition)](ru:26.1 Snapshot 7 (Java Edition).md)
[th:รุ่น Java 26.1 Snapshot 7](th:รุ่น Java 26.1 Snapshot 7.md)