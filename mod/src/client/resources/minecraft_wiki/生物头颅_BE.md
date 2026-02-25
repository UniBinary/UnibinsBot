# 生物头颅/BE

*页面ID: 26952* | *来源: Minecraft Wiki*

<div class="treeview">
*  方块实体数据
* *
* * ：（[文本组件](文本组件.md)）表示该头颅的自定义名称，也表示其被破坏后所掉落的物品的自定义名称。
* * ：玩家的头放置在音符盒上时，敲击音符盒会发出的音效的[命名空间ID](命名空间ID.md)。
* * ：玩家的头对应的玩家游戏档案，用于渲染玩家的头。字符串形式只用于加载不用于存储，在游戏读取后会直接转换为对应的玩家档案。
* **
</div>

游戏档案属性通常包括<code>textures</code>用于保存玩家的皮肤数据。在此属性的数据被Base64解码后具有如下结构：

<div class="treeview">
*  JSON数据根元素
* * ：游戏档案的UUID，不带连字符。
* * ：游戏档案名称。
* * ：（代表此纹理属性是否已被签名。如果存在，则此项也存在并为<samp>true</samp>。
* * ：纹理数据。
* ** ：[披风](披风.md)纹理。如果此游戏档案不包含披风，此项不存在。
* *** ：披风纹理的URL链接。
* ** ：[皮肤](皮肤.md)纹理。如果此游戏档案不包含自定义皮肤，此项不存在。
* *** ：皮肤的元数据。
* **** ：固定值<code>slim</code>。当皮肤模型手臂为3像素时存在，否则不存在。
* *** ：皮肤纹理的URL链接。
* * ：[Unix时间戳](wikipedia:Unixtime.md)，以毫秒为单位，时间为请求玩家游戏档案数据的时间。
</div><noinclude>
[Category:方块实体页面](Category:方块实体页面.md)
[en:Head/BE](en:Head/BE.md)
[fr:Tête/BE](fr:Tête/BE.md)
[ja:Mobの頭/BE](ja:Mobの頭/BE.md)
[pt:Cabeça/BE](pt:Cabeça/BE.md)
</noinclude>