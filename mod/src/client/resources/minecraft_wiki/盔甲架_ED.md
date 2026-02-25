# 盔甲架/ED

*页面ID: 17308* | *来源: Minecraft Wiki*

<div class="treeview">
*  实体数据
* *
* * ：用于禁用某个部位的放置、替换和移除。此值使用按位或进行数据的保存，不同二进制位的含义在下方列出。比如，把值设为<samp>16191（0x3F3F）</samp>或<samp>4144896（0x3F3F00）</samp>会禁用所有盔甲的放置、移除和替换。
* * ：表示盔甲架是否隐形。隐形不会影响盔甲架身上物品的显示。
* * ：（默认为<code>false</code>）盔甲架是否被当作“标记”。如果为<samp>true</samp>，盔甲架的碰撞箱会消失，且无法与之进行任何交互。
* * ：表示盔甲架是否不会显示下面的基座。
* * ：盔甲架的不同部位的旋转角度，每个身体部分都有三个组成的列表按顺序保存XYZ轴的旋转角度。
* ** ：（默认为<code>[0f, 0f, 0f]</code>）躯干的角度。
* ** ：（默认为<code>[0f, 0f, 0f]</code>）头部的角度。
* ** ：（默认为<code>[-10f, 0f, -10f]</code>）左臂的角度。
* ** ：（默认为<code>[-1f, 0f, -1f]</code>）左腿的角度。
* ** ：（默认为<code>[-15f, 0f, 10f]</code>）右臂的角度。
* ** ：（默认为<code>[1f, 0f, 1f]</code>）右腿的角度。
* * ：表示盔甲架是否会显示其手臂。如果其手臂不存在，玩家不能对其手持的物品互动。
* * ：表示盔甲架是否是小型盔甲架。
</div>

<noinclude>
[Category:实体数据值页面](Category:实体数据值页面.md)

[en:Armor Stand#Entity data](en:Armor Stand#Entity data.md)
[fr:Porte-armure/ED](fr:Porte-armure/ED.md)
[ja:防具立て/ED](ja:防具立て/ED.md)
[nl:Harnashouder/ED](nl:Harnashouder/ED.md)
[ru:Стойка для брони/ДС](ru:Стойка для брони/ДС.md)
</noinclude>