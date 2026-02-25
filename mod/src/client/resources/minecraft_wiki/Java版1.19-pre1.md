# Java版1.19-pre1

*页面ID: 96132* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19-pre1**是[Java版1.19](Java版1.19.md)的首个预发布版，发布于2022年5月18日<ref></ref>，做了一些微调，并修复了一些漏洞。

# 更改
# = 方块 =
* *[幽匿感测体](幽匿感测体.md)**
* 现在可以感测到玩家“使用”具有开始和结束状态的物品（例如[弓](弓.md)、[弩](弩.md)、[山羊角](山羊角.md)、[盾牌](盾牌.md)和[食物](食物.md)）时，在开始和结束节点上的物品交互振动。
* 现在不再感测玩家潜行时的物品交互振动。
* 加入了以下可被感测到的游戏事件：
* * <code>note_block_play</code>，振动频率为6。
* * <code>instrument_play</code>，振动频率为15。

# = 生物 =
* *[猫](猫.md)**
* 将英国短毛猫的ID由<code>british</code>改为<code>british_shorthair</code>。

* *[末影人](末影人.md)、[骷髅](骷髅.md)和[凋灵骷髅](凋灵骷髅.md)**
* 现在在[下界](下界.md)生成时要求的亮度等级范围扩大为0-11。

* *[铁傀儡](铁傀儡.md)**
* 回退了上个快照使其只在固体方块上生成的更改。

* *[蝌蚪](蝌蚪.md)**
* 现在会被手持[黏液球](黏液球.md)的玩家吸引。

* *[监守者](监守者.md)**
* 现在只会在具有完整固体表面的方块上生成。

# = 世界生成 =
* *[自定义世界生成](自定义世界生成.md)**
* 在维度类型类型中加入了2个用于控制敌对生物生成的新字段：
* * <code>monster_spawn_block_light_limit</code>为一整型值，用于控制防止敌对生物生成所需的方块光。
* * <code>monster_spawn_light_level</code>为一整数提供器，用于在指定范围内找到一个在与当前整体亮度比较下可以允许敌对生物生成的亮度值。

* *[红树林沼泽](红树林沼泽.md)**
* 略微减少了[红树](红树.md)的数量，由每区块尝试放置30次减为25次。

# = 游戏内容 =
* *[进度](进度.md)**
* 进度“[](进度#advancements-anchor-adventure.kill_mob_near_sculk_catalyst.md)”的上游进度由“[](进度#advancements-anchor-adventure.root.md)”改为“[](进度#advancements-anchor-adventure.kill_a_mob.md)”。

# = 命令格式 =
* ***
* 的<code><template></code>参数现在可被自动补全。

# = 常规 =
* *聊天**
* 现在，使用与聊天有关的命令（如和）时，聊天预览也会显示。

* *[选项](选项.md)**
* 将聊天选项“”改为“”。
* * 选项描述也进行了更改。
* 更改了“”视频设置的描述，使之更准确。

* *<samp>[options.txt](options.txt.md)</samp>**
* 将<code>onlyShowSignedChat</code>改为<code>onlyShowSecureChat</code>。

* *协议**
* 第三方服务端现在可通过向特定客户端发送一种新的网络数据包，启用或禁用客户端上的聊天预览功能。

* *[Realms](Realms.md)**
* 更改了在快照版本尝试进入Realms菜单时显示的错误信息，使之更符合实际。

* *<samp>[server.properties](server.properties.md)</samp>**
* 移除了上一个版本加入的临时的<code>test-rainbow-chat</code>服务器选项。

* *声音**
* 现在，从物品栏装备盔甲时会播放声音。
* 现在，将非盔甲类物品（如[南瓜](南瓜.md)和[生物头颅](生物头颅.md)）放入头盔槽会播放通用的穿戴装备的声音。
* <code>entity.frog.tounge</code>声音事件重命名为正确的<code>entity.frog.tongue</code>。

* *[标签](Java版标签.md)**
* 将猫种类标签中的替换为。
* 向游戏事件标签中加入了。
* 向游戏事件标签中加入了。

# 修复
”选项的描述不准确。
|;dev
|249118|M1计算机无法启动游戏。
|249141|青蛙脚步声没有对应字幕。
|249164|<code>entity.frog.tounge</code>声音事件名称中的单词有误写。
|249209|青蛙被其喜欢的食物吸引且受到伤害时不会试图逃离。
|249260|蝌蚪不会被黏液球吸引。
|249328|青蛙被黏液球吸引时会四处跳动。
|249456|与其他幼年生物不同，蝌蚪死亡时会掉落经验。
|249619|玩家踩在幽匿感测体上时，幽匿感测体通过比较器发出的振动频率值是其最后感测到的振动的频率值。
|249711|物品被悦灵从地面上拾起时，拾起物品动画要远高于悦灵本身的判定箱高度。
|249757|“”进度不是“”进度的子进度。
|249834|玩家在主副手间切换物品时会产生振动。
|249980|“”进度的英文描述中，“Cake”一词没有正确大写。
|250006|英国短毛猫的ID与其纹理名称不一致。
|250019|村民转化为僵尸村民时，幽匿催发体会被激活。
|250022|使用命令修改副手槽，即便不产生声音，幽匿感测体仍能感测到。
|250317|用铁桶装蝌蚪声音的字幕使用的是用铁桶装东西的通用字幕。
|250351|命令参数的候选区中有重复内容。
|250919|若区块中有字符量很大的“上一个输出”的命令方块，服务器尝试加载此区块时会崩溃。
|250932|山羊角的英文字幕中有不正确的大小写。
|250940|山羊角吹奏出的声音不被记为振动。
|251132|服务器会记录“Game test server”消息。
|251312|命令的实体选择器不再显示候选内容。
|251355|红树胎生苗盆栽的模型不正确。
|251396|<code>java.lang.IllegalArgumentException: Name and ID cannot both be blank</code>。
|251405|结构方块消息按聊天内容格式返回。
|251479|语言文件中有重复的内容。
|251550|游戏不能在32位系统上启动。
|;previous
|251640|在聊天中使用特殊字符会导致<code>io.netty.handler.codec.EncoderException</code>异常。
|251641|与监守者愤怒有关的游戏崩溃问题。
|251647|“”键位设置为时，按此键会导致聊天栏被立即关闭。
|251649|点击“未知或不完整的命令”消息时，聊天栏中的<code>/</code>会被移除。
|251650|铁傀儡可以在生物不可生成的方块（如树叶、玻璃、海晶灯等）上生成。
|251652|玩家看过监守者一眼后，其从地下钻出、锁定目标、准备远程攻击或钻回地底的动画（可能还有其他相似动画）才会开始播放。
|251656|与命令不同，服务器消息样式在应用到从命令方块、服务器控制台或RCON上执行命令而发出的消息时会失败。
|251690|监守者可以在任何固体不完整方块上生成。
|251762|命令可以以双斜杠开头执行。
|251773|数据生成器的<code>--dev</code>参数不再能正常将NBT转换为SNBT。
}}</onlyinclude>

# 参考

# 导航

[de:1.19-pre1](de:1.19-pre1.md)
[en:Java Edition 1.19 Pre-release 1](en:Java Edition 1.19 Pre-release 1.md)
[es:Java Edition 1.19 Pre-release 1](es:Java Edition 1.19 Pre-release 1.md)
[fr:Édition Java 1.19 Pre-release 1](fr:Édition Java 1.19 Pre-release 1.md)
[ja:Java Edition 1.19 Pre-release 1](ja:Java Edition 1.19 Pre-release 1.md)
[pt:Edição Java 1.19 Pre-release 1](pt:Edição Java 1.19 Pre-release 1.md)
[ru:1.19 Pre-release 1 (Java Edition)](ru:1.19 Pre-release 1 (Java Edition).md)