# 命令/particle/1.20.5-pre1前粒子参数

*页面ID: 125103* | *来源: Minecraft Wiki*

这些参数位于<code><name></code>与<code><pos></code>之间，可能存在多个。

* <code>block</code>、<code>block_marker</code>和<code>falling_dust</code>需要1个方块命名空间ID（以及可选的方块状态）作为参数。例如：<code>/particle block minecraft:grass_block[snowy=true]</code>会创建一个覆盖雪的草方块的粒子。

* <code>dust</code>共需要4个参数。前三个是颜色通道参数，分别代表红色、绿色和蓝色，应在0和1之间（不在<math>[0,1]</math>内的取小数部分）；第四个参数表示该粒子的大小。例如：<code>/particle dust 1.0 0.5 0.5 1.0</code>会创建一个大小为1.0的粉色粒子。

* <code>dust_color_transition</code>共需要7个参数。前三个是初始颜色通道参数，分别代表红色、绿色和蓝色；第四个参数表示该粒子的大小；后三个是最终颜色通道参数，格式与前3个相同。粒子的颜色通道参数会由初始参数渐变为最终参数（不在<math>[0,1]</math>内的取小数部分）（例如：<code>/particle dust_color_transition 1.0 0.5 0.5 1.0 1.0 0.0 0.0</code>会创建一个大小为1.0的粉色粒子，然后该粒子在消散过程中会逐渐转变为红色。

* <code>entity_effect</code>共需4个浮点数参数（取值范围<code>0.0</code>到<code>1.0</code>）：。前三个参数表示粒子的RGB颜色，第四个参数表示粒子的透明度（Alpha Channel）。

* <code>item</code>需要1个物品命名空间ID（以及可选的NBT）作为参数。例如：<code>/particle item minecraft:apple</code>会创建一个苹果物品的粒子。

* <code>sculk_charge </code>需要1个单精度浮点数作为参数，以指定粒子的显示角度，角度应表示为弧度制。

* <code>shriek</code>需要1个秒数作为参数。例如：<code>/particle shriek 15</code>会在15秒后创建一个<code>shriek</code>粒子。

* <code>vibration</code>共需要4个参数：前三个是声音来源坐标（维度坐标），最后一个是持续时间（32位整数）。虽然坐标为双精度浮点数，但粒子总会向其所在的方块中心位置移动。例如：将会创建一个从当前的执行坐标移动到，耗时200刻的<code>vibration</code>粒子。<noinclude>
[Category:数据页面](Category:数据页面.md)
[Category:过时内容](Category:过时内容.md)
</noinclude>