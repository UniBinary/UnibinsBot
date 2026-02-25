# 物品堆叠组件/equippable

*页面ID: 125830* | *来源: Minecraft Wiki*

<noinclude></noinclude>
<div class="treeview">
* *  物品堆叠组件
* ** ：（默认为全部生物）可以穿戴此物品的生物。
* ** ：（命名空间ID）物品被穿戴时的[装备模型](装备模型.md)。如果此值不存在，游戏将不渲染此物品穿戴在生物上的模型。
* ** ：（命名空间ID）当此项存在且物品被玩家穿戴时，玩家第一人称视角将渲染指定的纹理遮罩。此遮罩可以使用多个设置此标签的物品互相叠加，每个物品指定的遮罩都会被渲染，且渲染顺序按照主手、副手、头盔、胸甲、护腿、靴子、身体、鞍的顺序依次叠加渲染。当遮罩纹理渲染时，遮罩纹理被视为**独立纹理**，即无法作为动态纹理或GUI纹理渲染，但可以指定纹理过滤方式。
* ** ：（默认为<code>true</code>）生物在受到会影响损害盔甲的伤害时此物品是否会受损而减少耐久。
* ** ：（默认为<code>false</code>）使用此物品时，是否可以让被交互的生物在允许的空槽位上穿戴此物品。
* ** ：（默认为<code>item.armor.equip_generic</code>）物品被穿戴时的声音。
* ***
* ** ：（默认为<code>true</code>）是否可以使用[发射器](发射器.md)使生物穿戴此物品。如果物品本身有特殊的发射器行为则此项无效。
* ** ：物品可被穿戴的[装备槽位](装备槽位.md)。可以为<code>mainhand</code>（主手）、<code>offhand</code>（副手）、<code>head</code>（头盔）、<code>chest</code>（胸甲）、<code>legs</code>（护腿）、<code>feet</code>（靴子）、<code>saddle</code>（鞍）和<code>body</code>（身体）。
* ** ：（默认为<code>true</code>）物品是否可以直接穿戴。
</div><noinclude>
</noinclude>