# Java版1.19.3-pre3

*页面ID: 100312* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.3-pre3**是[Java版1.19.3](Java版1.19.3.md)的第3个，也是最后一个预发布版，发布于2022年11月29日<ref></ref>，修复了一些漏洞。

# 更改
# = 常规 =
* *UI**
* 将合成界面和[教学提示](教学提示.md)上的[知识之书](知识之书.md)纹理更新为[纹理更新](纹理更新.md)后的纹理。

# 更改（实验性）
# = 方块 =
* *[竹块](竹块.md)**
* 将顶部纹理水平翻转。

* *[去皮竹块](去皮竹块.md)**
* 将顶部纹理水平翻转（有细微区别）。

# 修复
”而不是“”。
|194501|使用<code>fancy_tree_placer</code>中不带<code>axis</code>字段的方块会抛出<code>IllegalArgumentException</code>异常（无法设置属性）。
|201769|复制深度嵌套的NBT标签会抛出<code>StackOverflowError</code>异常。
|208051|若打开箱子、陷阱箱或木桶时死亡，复活后，这些容器不播放打开动画。
|221421|将列表类型的NBT标签标签插入其自身时，其自身可以被修改。
|228976|实体碰撞计算在渲染线程上运行。
|233051|玩家登录时服务端崩溃。
|234702|冒险模式中可以与光源方块交互。
|250428|复述功能不复述死亡屏幕上的内容。
|;1.19的漏洞
|254036|在多人游戏中，实体数据有时不能正确更新。
|;1.19.2的漏洞
|256706|配方书中的地毯纹理被截断。
|257530|聊天被设置为隐藏且玩家正处于睡觉或切换游戏模式时，“”警告信息会出现在聊天栏中，而不是以文字形式出现在动作栏上方。
|;dev
|257121|在服务器中，若玩家死亡后重新加入服务器，其皮肤和外层皮肤不会在客户端上渲染出来。
|257340|恼鬼判定箱不居中。
|257350|竹块顶部和底部纹理被错误旋转。
|257392|恼鬼的新模型中，恼鬼的头不会旋转到其视线朝向的方向。
|257411|恼鬼副手上的物品没有正确渲染。
|257495|若在打开潜影盒界面时死亡，“”的音效会反复播放。
|257637|去皮竹块的顶部纹理不与竹块的相符。
|257638|顶面放置了苦力怕头颅的音符盒，其播放的音效的音高不正确。
|257817|使用+键获取带自定义皮肤的玩家的头时，获取的头的<code>note_block_sound</code>NBT标签会丢失。
|257861|村民和猪灵不再寻找物品。
|;previous
|257839|尝试在游戏规则菜单中渲染提示框会抛出<code>NullPointerException</code>异常。
|257843|破坏后重新放置的玩家的头，其原有的<code>note_block_sound</code>NBT标签会丢失。
}}</onlyinclude>

# 参考

# 导航

[de:1.19.3-pre3](de:1.19.3-pre3.md)
[en:Java Edition 1.19.3 Pre-release 3](en:Java Edition 1.19.3 Pre-release 3.md)
[es:Java Edition 1.19.3 Pre-release 3](es:Java Edition 1.19.3 Pre-release 3.md)
[fr:Édition Java 1.19.3 Pre-release 3](fr:Édition Java 1.19.3 Pre-release 3.md)
[ja:Java Edition 1.19.3 Pre-release 3](ja:Java Edition 1.19.3 Pre-release 3.md)
[pt:Edição Java 1.19.3 Pre-release 3](pt:Edição Java 1.19.3 Pre-release 3.md)
[ru:1.19.3 Pre-release 3 (Java Edition)](ru:1.19.3 Pre-release 3 (Java Edition).md)