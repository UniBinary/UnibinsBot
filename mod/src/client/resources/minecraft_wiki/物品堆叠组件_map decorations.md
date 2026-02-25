# 物品堆叠组件/map decorations

*页面ID: 122349* | *来源: Minecraft Wiki*

<noinclude></noinclude>
<div class="treeview">
* *  物品堆叠组件
* ** ：一个图标的信息。
* *** ：图标的旋转角度，按顺时针角度计。游戏并不能真正显示所有角度，每经过22.5°，在地图上才会有区别。与图标纹理中的外观相比，旋转角度为0所显示的图标上下颠倒。
* *** ：要显示的[地图图标类型](地图#地图图标.md)的命名空间ID。
* *** ：图标在世界上所在的X坐标。如果超出地图所展示的范围且图标类型不是玩家，则图标无法添加到地图中。如果图标类型是玩家，位置超出显示范围但地图可以无限追踪玩家，那么图标类型会被修改为<code>player_off_limits</code>，且位置会显示在对应边；如果距离显示范围较近，则图标类型会被修改为<code>player_off_map</code>，且位置会显示在对应边；如果距离显示范围很远，则移除此图标。
* *** ：图标在世界上所在的Z坐标。如果超出地图所展示的范围且图标类型不是玩家，则图标无法添加到地图中。如果图标类型是玩家，位置超出显示范围但地图可以无限追踪玩家，那么图标类型会被修改为<code>player_off_limits</code>，且位置会显示在对应边；如果距离显示范围较近，则图标类型会被修改为<code>player_off_map</code>，且位置会显示在对应边；如果距离显示范围很远，则移除此图标。
</div><noinclude>
[en:Data component format/map decorations](en:Data component format/map decorations.md)
[fr:Format de composant de données/map decorations](fr:Format de composant de données/map decorations.md)
[ja:アイテムフォーマット/map decorations](ja:アイテムフォーマット/map decorations.md)
[pt:Formato de componente de dado/map decorations](pt:Formato de componente de dado/map decorations.md)
[uk:Формат компонента даних/map decorations](uk:Формат компонента даних/map decorations.md)
</noinclude>