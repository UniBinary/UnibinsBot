# 物品堆叠组件/fireworks

*页面ID: 122343* | *来源: Minecraft Wiki*

<noinclude></noinclude>
<div class="treeview">
* *  物品堆叠组件
* ** ：（无符号8位整数，默认为0）烟花火箭的飞行的时间，单位为“火药”（即表现为和在工作台上合成烟花火箭时所用的火药数相等）。
* ** ：（最多256个元素）烟花火箭对应的烟火之星的数据，控制烟花火箭飞行结束时产生的爆裂烟花渲染。
* *** ：一个烟火之星的数据。
* **** ：（默认为空数组）表示爆裂时的粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。如果颜色没有对应的染料颜色，游戏将在[提示框](提示框.md)中显示为“自定义”，但爆裂时会产生正确的颜色。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。不存在或数组为空时被视为黑色。
* **** ：（默认为空数组）表示爆裂后的淡化粒子颜色，只使用后24位，每个颜色通道占用8位，按RGB依次存储。当存在多个值时，每个爆裂粒子在渲染时会随机选择一种颜色用于渲染。
* **** ：（默认为<code>false</code>）表示烟火是否有拖曳痕迹（使用[钻石](钻石.md)合成时）。
* **** ：（默认为<code>false</code>）表示烟火是否出现闪烁效果（使用[荧石粉](荧石粉.md)合成时）。
* **** ：爆裂时的形态。可以为<code>small_ball</code>（小型球状）、<code>large_ball</code>（大型球状）、<code>star</code>（星形）、<code>creeper</code>（苦力怕状）、<code>burst</code>（喷发状）。
</div><noinclude>
[en:Data component format/fireworks](en:Data component format/fireworks.md)
[fr:Format de composant de données/fireworks](fr:Format de composant de données/fireworks.md)
[ja:アイテムフォーマット/fireworks](ja:アイテムフォーマット/fireworks.md)
[pt:Formato de componente de dado/fireworks](pt:Formato de componente de dado/fireworks.md)
[uk:Формат компонента даних/fireworks](uk:Формат компонента даних/fireworks.md)
</noinclude>