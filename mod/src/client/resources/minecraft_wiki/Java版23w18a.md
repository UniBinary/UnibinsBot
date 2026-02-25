# Java版23w18a

*页面ID: 104134* | *来源: Minecraft Wiki*

<onlyinclude>

* *23w18a**是[Java版1.20](Java版1.20.md)的第6个，也是最后一个快照，发布于2023年5月3日<ref></ref>，加入了一个新[进度](进度.md)，并修复了一些漏洞。

# 新内容
# = 游戏内容 =
* *[进度](进度.md)**
* 加入了1个新进度：
<!--
版本页面的内容属于“历史内容”，进度描述请勿使用模板。
要修改进度名称，请到和中进行。
在Crowdin approved前，请不要汉化尚未approved的进度名称和描述。每个中文变体都是如此。
繁简/地区转换请用。
-->
* * [](进度#advancements-anchor-adventure.read_power_from_chiseled_bookshelf.md)
* **

# = 常规 =
* *遥测数据**
* 加入了全局属性，会包括在所有事件中。
* * 此值基于系统属性的值设置。
* ** 这可以帮助开发者判断游戏启动时出现的错误是由官方启动器还是第三方软件引起。
* 为必选的事件加入了属性。
* * 当加载Realm地图内容（小游戏）时，会接收到该地图的名称。
* ** 这可以帮助开发者了解玩家是如何与Realms冒险或小游戏内容交互的。
* 加入了可选事件。
* * 在玩家达成进度时触发，包含进度的ID和完成进度的时间。
* ** 这可以帮助开发者了解玩家的进程及上限，从而为游戏设计提供信息。
* 加入了可选事件。
* * 在游戏客户端加载时触发，包含客户端加载的时间。
* ** 这可以帮助开发者优化游戏并减少加载游戏客户端的时间。

# 更改
# = 方块 =
* *[锻造台](锻造台.md)**
* 为了方便使用，现在使用锻造台时无需将[锻造模板](锻造模板.md)第一个放入。

# = 生物 =
* *[史莱姆](史莱姆.md)和[岩浆怪](岩浆怪.md)**
* 现在会受到[跳跃提升](跳跃提升.md)效果的影响。

# = 游戏内容 =
* *[创造模式物品栏](创造模式物品栏.md)**
* 将[唱片机](唱片机.md)加入红石方块类别中。

# = 常规 =
* *[进度](进度.md)**
* 将进度触发器中的所有字段移至原有层级上的新的字段下。
* * 新的字段与字段相似，为一个含有战利品条件/谓词的列表。
* * 此列表中的所有条件都必须满足才能触发进度。
* 条件现在会在上下文中进行评估。该上下文可以：
* * 玩家（作为实体）
* * 被放置的方块的位置
* * 被放置或被交互的方块的方块状态
* * 手持或被使用的物品（作为“工具”）
* 如果需要进行迁移，应进行以下更改：
* * 原有的字段改为条件。
* * 原有的字段改为条件。
* * 原有的字段改为条件。
* * 更改示例（取自进度）：
* ** 更改前：<syntaxhighlight lang="json">
{
    "conditions": {
        "item": {
            "items": [
                "minecraft:glow_ink_sac"
            ]
        },
        "location": {
            "block": {
                "tag": "minecraft:all_signs"
            }
        }
    },
    "trigger": "minecraft:item_used_on_block"
}
</syntaxhighlight>
* ** 更改后：<syntaxhighlight lang="json">
{
    "conditions": {
        "location": [
            {
                "condition": "minecraft:match_tool",
                "predicate": {
                    "items": [
                        "minecraft:glow_ink_sac"
                    ]
                }
            },
            {
                "condition": "minecraft:location_check",
                "predicate": {
                    "block": {
                        "tag": "minecraft:all_signs"
                    }
                }
            }
        ]
    },
    "trigger": "minecraft:item_used_on_block"
}
</syntaxhighlight>

* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[战利品表谓词](战利品表谓词.md)**
* 将条件重命名为。
* 加入了条件，只会在所有子条件的时候。其语法与相同。

* *音效**
* 现在在[方块](方块.md)上行走时总是会发出脚步声。
* * 之前，如果在靠近[液体](液体.md)或空气的方块边缘行走则不会播放脚步声。
* 现在在海床上行走会播放所走过的方块对应的脚步声，但音高和音量会更低。

# 修复
</onlyinclude>

# 参考

# 导航

[de:23w18a](de:23w18a.md)
[en:Java Edition 23w18a](en:Java Edition 23w18a.md)
[es:Java Edition 23w18a](es:Java Edition 23w18a.md)
[fr:Édition Java 23w18a](fr:Édition Java 23w18a.md)
[ja:Java Edition 23w18a](ja:Java Edition 23w18a.md)
[lzh:二三週一八甲](lzh:二三週一八甲.md)
[pt:Edição Java 23w18a](pt:Edição Java 23w18a.md)
[ru:23w18a (Java Edition)](ru:23w18a (Java Edition).md)
[uk:23w18a (Java Edition)](uk:23w18a (Java Edition).md)