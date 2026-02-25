# 物品堆叠组件/consumable

*页面ID: 125564* | *来源: Minecraft Wiki*

<noinclude></noinclude>
<div class="treeview">
* *  物品堆叠组件
* ** ：（默认为<code>eat</code>）物品使用时的动画。可以为<code>none</code>（无动作）、<code>eat</code>（吃）、<code>drink</code>（饮用）、<code>block</code>（格挡）、<code>bow</code>（拉弓）、<code>brush</code>（清刷）、<code>crossbow</code>（弩上弦）、<code>spear</code>（三叉戟投掷）、<code>spyglass</code>（看望远镜）、<code>toot_horn</code>（吹山羊角）和<code>bundle</code>（使用收纳袋）。
* ** ：（，默认为1.6）物品使用的时间，单位为秒。当此值为0时，物品立刻使用，不会像拉弓等操作需要等待时间。
* ** ：（默认为<code>true</code>）物品在使用时是否产生物品破碎粒子。
* ** ：当物品被使用后，物品产生的效果。
* *** ：一项物品效果。
* **** ：物品效果类型。
* **** 为<code>apply_effects</code>，则对使用此物品的生物添加状态效果：}}
* **** ：物品使用后添加的状态效果。
* ***** ：一项状态效果。
* ******
* **** ：（，默认为1）食用后施加此状态效果的概率。
* **** 为<code>clear_all_effects</code>，则对使用此物品的生物移除所有状态效果。}}
* **** 为<code>play_sound</code>，则播放指定的声音：}}
* **** ：要播放的声音。
* *****
* **** 为<code>remove_effects</code>，则对使用此物品的生物移除指定状态效果：}}
* **** ：物品使用后要移除的状态效果。
* **** 为<code>teleport_randomly</code>，则对使用此物品的生物进行随机传送：}}
* **** ：（，默认为16）随机传送的半径，以传送前的位置作为原点。
* ** ：（默认为<code>entity.generic.eat</code>）使用物品时产生的声音。
* ***
</div><noinclude>
</noinclude>