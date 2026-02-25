# Java版23w32a

*页面ID: 105244* | *来源: Minecraft Wiki*

<onlyinclude>

* *23w32a**是[Java版1.20.2](Java版1.20.2.md)的第2个快照，发布于2023年8月9日<ref></ref>，更改了振动机制，将数据包和资源包版本更改为17，更改了部分数据的存储方式，优化了网络协议，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[战利品表](战利品表.md)**
* 加入了<code>sequence</code>战利品表函数。
* * 包含一个字段：
* ** <code>functions</code>：按顺序运行的子函数数组。
* * 也可被声明为无类型内联数组。
* ** 这同样符合战利品表函数的JSON文件可以声明为复合函数数组的现有行为。
* <code>all_of</code>这一战利品表谓词现在可以隐性声明为无类型内联数组。
* * 这同样与战利品表谓词JSON文件可声明为子谓词数组的行为相匹配。

# 更改
# = 方块 =
* *[幽匿感测体](幽匿感测体.md)和[校频幽匿感测体](校频幽匿感测体.md)**
* 振动不再会因为[模拟距离](模拟距离.md)限制而丢失。
* 现在能检测以下动作：
* * <code>block_change</code>游戏事件，频率为11：
* ** [兔子](兔子.md)啃食[胡萝卜](胡萝卜.md)植株。
* ** [雕纹书架](雕纹书架.md)与[漏斗](漏斗.md)、[投掷器](投掷器.md)交互。
* ** [狐狸](狐狸.md)采摘[甜浆果丛](甜浆果丛.md)中的甜浆果。
* ** [海龟蛋](海龟蛋.md)开裂。
* * <code>block_destroy</code>游戏事件，频率为12：
* ** [火](火.md)被[喷溅型水瓶](喷溅型水瓶.md)或[滞留型水瓶](滞留型水瓶.md)浇灭。
* ** 海龟蛋孵化。
* * <code>entity_place</code>游戏事件，频率为14：
* ** [唤魔者](唤魔者.md)召唤出[恼鬼](恼鬼.md)或[尖牙](尖牙.md)。
* * <code>item_interact_finish</code>游戏事件，频率为3：
* ** [骨粉](骨粉.md)。
* * 新的<code>unequip</code>游戏事件，频率为4：
* ** 卸下装备。
* 将[骆驼](骆驼.md)吃[仙人掌](仙人掌.md)发出的振动由<code>entity_interact</code>游戏事件更改为<code>eat</code>，振动频率由6改为8。

# = 常规 =
* *[聊天](聊天.md)**
* 客户端接收到无效聊天消息时不再会断开。
* * 取而代之的是，一条作为占位符的消息将会显示在聊天栏中。

* *[区块存储格式](区块存储格式.md)**
* 游戏不再使用数值来存储世界中的[状态效果](状态效果.md)。
* * 例如，数值<code>4</code>变为<code>minecraft:mining_fatigue</code>。
* * 更改了以下状态效果实例的字段：
* ** <code>Id</code>（整数） → <code>id</code>（字符串，[命名空间ID](命名空间ID.md)）
* ** <code>Ambient</code> → <code>ambient</code>
* ** <code>Amplifier</code> → <code>amplifier</code>
* ** <code>Duration</code> → <code>duration</code>
* ** <code>ShowParticles</code> → <code>show_particles</code>
* ** <code>ShowIcon</code> → <code>show_icon</code>
* ** <code>HiddenEffect</code> → <code>hidden_effect</code>
* *** 该字段是一个状态效果实例，因此父对象的更改也会在这里。
* ** <code>FactorCalculationData</code> → <code>factor_calculation_data</code>
* 对于方块实体类型<code>beacon</code>的NBT格式：
* * <code>Primary</code>（整数） → <code>primary_effect</code>（字符串，命名空间ID）
* * <code>Secondary</code>（整数） → <code>secondary_effect</code>（字符串，命名空间ID）

* *[数据包](数据包.md)**
* 将数据包版本号更改为<code>17</code>。

* *[调试屏幕](调试屏幕.md)**
* 现在使用打开调试屏幕会在右下角显示ping值图表，在[多人游戏](多人游戏.md)中也会在左下角显示网络流量图表。

* *[实体数据格式](实体数据格式.md)**
* 对于实体类型<code>mooshroom</code>的NBT格式：
* * 移除了。
* * 加入了<code>stew_effects</code>，和物品格式<code>suspicious_stew</code>中的<code>effects</code>字段格式相同。
* 对于实体类型<code>area_effect_cloud</code>的NBT格式：
* * 将<code>Effects</code>重命名为<code>effects</code>。
* 对于实体类型<code>arrow</code>的NBT格式：
* * 将<code>CustomPotionEffects</code>重命名为<code>custom_potion_effects</code>。
* 对于生物的NBT格式：
* * 将<code>ActiveEffects</code>重命名为<code>active_effects</code>。

* *[游戏事件](游戏事件.md)**
* 加入了<code>unequip</code>。

* *[物品格式](物品格式.md)**
* 对于物品类型的NBT格式：
* * 将<code>CustomPotionEffects</code>重命名为<code>custom_potion_effects</code>。
* 对于物品类型<code>suspicious_stew</code>的NBT格式：
* * 将<code>Effects</code>重命名为<code>effects</code>，并更改了该字段的以下字段：
* ** <code>EffectId</code>（整数） → <code>id</code>（字符串，命名空间ID）
* ** <code>EffectDuration</code> → <code>duration</code>

* *网络协议**
* 优化了网络以改善低带宽连接的体验。
* * 游戏数据包现在被打包为更大的TCP来降低TCP报头的开销，显著降低了网络使用。

* *[资源包](资源包.md)**
* 将资源包版本号更改为<code>17</code>。
* * 文本编辑框现在是一张位于的九宫格切分的精灵图。
* * 列表和编辑框的滚动条现在是一张位于<code>widget/scroller</code>的九宫格切分的精灵图。

* *[标签](Java版标签.md)**
* 向游戏事件标签中加入了。

# 修复
NBT标签仍使用数字ID。
|135339|作为局域网世界主机的玩家，如果之前未打开过任何世界，其皮肤对局域网世界中的其他玩家不可见。
|177110|生物脚步声的字幕不统一。
|209798|使用骨粉不会激活幽匿感测体。
|210485|唤魔者召唤恼鬼不会激活幽匿感测体。
|219440|幽匿感测体无法检测到喷溅型水瓶扑灭火。
|251525|兔子啃食胡萝卜植株不会激活幽匿感测体。
|253137|加入局域网世界时，游戏输出控制台出现属性纹理缺失签名的报错。
|261261|幽匿感测体无法检测到雕纹书架跟漏斗和投掷器的交互。
|262591|骆驼吃仙人掌时发出生物互动的振动，而非物品消耗的振动。
|;1.20.1的漏洞
|264260|修改方块数据后熔炉GUI不正确显示。
|;prev
|264548|Minecraft 23w31a的日志文件中出现奇怪的错误。
|264557|正常与饥饿状态的<code>food_full</code>和<code>food_half</code>精灵图文件名称反了。
|264565|精灵图目录的<code>bundle</code>文件夹中只有<code>mcmeta</code>文件。
|264576|Boss栏看起来是拉伸变化而非分截变化。
|264610|将<code>button.png.mcmeta</code>中的<code>border</code>值改为大于等于<code>width</code>值的一半时，尝试打开菜单会导致游戏崩溃。
|264664|使用高对比度资源包时，菜单中的滑块缺失。
|264687|局域网世界中，作为主机的玩家的皮肤和披风不向其他玩家显示。
|264689|使用高对比度资源包时，满的Boss栏上有多余像素。
}}</onlyinclude>

# 参考

# 导航

[de:23w32a](de:23w32a.md)
[en:Java Edition 23w32a](en:Java Edition 23w32a.md)
[es:Java Edition 23w32a](es:Java Edition 23w32a.md)
[fr:Édition Java 23w32a](fr:Édition Java 23w32a.md)
[ja:Java Edition 23w32a](ja:Java Edition 23w32a.md)
[pt:Edição Java 23w32a](pt:Edição Java 23w32a.md)
[ru:23w32a (Java Edition)](ru:23w32a (Java Edition).md)
[tr:Java Sürümü 23w32a](tr:Java Sürümü 23w32a.md)
[uk:23w32a (Java Edition)](uk:23w32a (Java Edition).md)