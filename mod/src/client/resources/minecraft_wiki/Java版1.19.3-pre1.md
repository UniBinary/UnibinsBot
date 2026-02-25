# Java版1.19.3-pre1

*页面ID: 100127* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.3-pre1**是[Java版1.19.3](Java版1.19.3.md)的首个预发布版，发布于2022年11月22日<ref></ref>，加入了一些子谓词，放置在[音符盒](音符盒.md)上的[玩家头颅](玩家头颅.md)播放自定义音效的实验性功能和命令的新语法，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 加入了按条件替换生物群系的功能。
* * 使用此功能时的语法：
* ** <code>filter</code>：需要被替换的生物群系ID或生物群系标签。

# = 常规 =
* *[谓词](谓词.md)**
* 为以下具有不同变种的生物类型添加了以下子谓词：
* * <code>axolotl</code>
* ** <code>variant</code>，可用值有<code>lucy</code>、<code>wild</code>、<code>gold</code>、<code>cyan</code>和<code>blue</code>。
* * <code>boat</code>
* ** 对所有种类的[船](船.md)和[运输船](运输船.md)均生效。
* ** <code>variant</code>，可用值有<code>oak</code>、<code>spruce</code>、<code>birch</code>、<code>jungle</code>、<code>acacia</code>、<code>dark_oak</code>、<code>mangrove</code>和<code>bamboo</code>。
* * <code>fox</code>
* ** <code>variant</code>，可用值有<code>red</code>和<code>snow</code>。
* * <code>mooshroom</code>
* ** <code>variant</code>，可用值有<code>red</code>和<code>brown</code>。
* * <code>painting</code>
* ** <code>variant</code>，可用值见<code>painting_variant</code>注册表项。
* * <code>rabbit</code>
* ** <code>variant</code>，可用值有<code>brown</code>、<code>white</code>、<code>black</code>、<code>white_splotched</code>、<code>gold</code>、<code>salt</code>和<code>evil</code>。
* * <code>horse</code>
* ** <code>variant</code>，可用值有<code>white</code>、<code>creamy</code>、<code>chestnut</code>、<code>brown</code>、<code>black</code>、<code>gray</code>和<code>dark_brown</code>。
* ** 花纹是单独的值，不会被此值匹配上。
* * <code>llama</code>
* ** <code>variant</code>，可用值有<code>creamy</code>、<code>white</code>、<code>brown</code>和<code>gray</code>。
* * <code>villager</code>
* ** <code>variant</code>，可用值见<code>villager_type</code>注册表项。
* ** 也适用于[僵尸村民](僵尸村民.md)。
* ** 职业和等级是单独的值，不会被此值匹配上。
* * <code>parrot</code>
* ** <code>variant</code>，可用值有<code>red_blue</code>、<code>blue</code>、<code>green</code>、<code>yellow_blue</code>和<code>gray</code>。
* * <code>tropical_fish</code>
* ** <code>variant</code>，可用值有<code>kob</code>、<code>sunstreak</code>、<code>snooper</code>、<code>dasher</code>、<code>brinely</code>、<code>spotty</code>、<code>flopper</code>、<code>stripey</code>、<code>glitter</code>、<code>blockfish</code>、<code>betty</code>和<code>clayfish</code>。

* *[闪烁标语](闪烁标语.md)**
* 加入了以下闪烁标语：
* * "Made with lave!"<ref>引用自。</ref>

# 更改
# = 生物 =
* *[恼鬼](恼鬼.md)**
* 略微更改了纹理。

# 更改（实验性）
# = 方块 =
* *[玩家的头](玩家的头.md)**
* 加入了这一NBT标签，用于决定上方放置了玩家的头的[音符盒](音符盒.md)被敲击时要播放的音效，必须是一个有效声音事件的[命名空间ID](命名空间ID.md)。

# 修复
”而不是“”。
|177676|盔甲匠工作时显示的字幕是“”而不是“”。
|245697|某些生物不能离开两格深的水。
|;1.19.2的漏洞
|255133|深暗之域中会生成额外的铜矿石。
|;dev
|256481|向雕纹书架中放书时，<code>-{}-minecraft.used:minecraft.<*书的种类*></code>统计值不增加。
|256679|美西螈通常会在躲避危险时犹豫，并偶尔会向有危险的方向寻路。
|256883|与之前版本相比，游戏菜单中的元素位置会略低一些。
|257341|恼鬼不使用半透明纹理。
|257349|恼鬼不再能正常地坐在船和矿车中。
|257368|“”菜单中，输入的小于1024时，“”错误不显示。
|257373|输入框中的光标不闪烁。
|257374|英文“Port number”中的“number”一词没有大写。
|257386|启用Programmer Art后，创造模式物品栏纹理错误。
|257506|雕纹书架的顶部和底部纹理会由于放置方式的不同而旋转。
|257525|22w42a及以上版本中，悦灵的运动AI有问题，导致它们有时会在半空中旋转。
|;previous
|257617|点击“遥测”屏幕中的“”或“”按钮后无法使用鼠标滚轮滚动。
|257618|<code>telemetry.event.world_loaded.description</code>字符串中的“pair”一词使用了不正确的动词形式。
|257619|幼年猪灵和僵尸猪灵的-{}-头撞到方块时会受到伤害。
|257625|敲击放置了猪灵的头的音符盒，播放的是猪灵愤怒时的音效，而不是其空闲时的。
|257648|命令可能导致新生物群系颜色与旧的交错出现。
|257658|从雕纹书架中取书时，幽匿感测体不激活。
|257663|因为点击社交屏幕上的“隐藏消息”按钮时，其状态会变化两次，所以现在不再能切换其状态。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.3-pre1](de:1.19.3-pre1.md)
[en:Java Edition 1.19.3 Pre-release 1](en:Java Edition 1.19.3 Pre-release 1.md)
[es:Java Edition 1.19.3 Pre-release 1](es:Java Edition 1.19.3 Pre-release 1.md)
[fr:Édition Java 1.19.3 Pre-release 1](fr:Édition Java 1.19.3 Pre-release 1.md)
[ja:Java Edition 1.19.3 Pre-release 1](ja:Java Edition 1.19.3 Pre-release 1.md)
[pt:Edição Java 1.19.3 Pre-release 1](pt:Edição Java 1.19.3 Pre-release 1.md)
[ru:1.19.3 Pre-release 1 (Java Edition)](ru:1.19.3 Pre-release 1 (Java Edition).md)