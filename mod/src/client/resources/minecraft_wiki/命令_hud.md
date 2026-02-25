# 命令/hud

*页面ID: 110457* | *来源: Minecraft Wiki*

修改[HUD](HUD.md)的可见性。

# 语法
  <code>hud <target: target> <visible: HudVisibility> [hud_element: HudElement]</code>

# 参数

  指定将被修改HUD可见性的目标。


  指定将对HUD可见性做出的修改。
  必须为<code>hide</code>（隐藏）或<code>reset</code>（重置）。

  指定将被修改的HUD元素。
  必须为以下之一：
  * <code>air_bubbles</code> － [氧气值](氧气值.md)
  * <code>all</code> － 所有的HUD
  * <code>armor</code> － [护甲值](护甲值.md)
  * <code>crosshair</code> － 屏幕上的十字准星
  * <code>health</code> － [生命值](生命值.md)
  * <code>horse_health</code> － 骑乘坐骑时坐骑的生命值
  * <code>hotbar</code> － [快捷栏](快捷栏.md)
  * <code>hunger</code> － [饥饿值](饥饿值.md)
  * <code>item_text</code> － 物品文本
  * <code>paperdoll</code> － [纸娃娃](HUD#纸娃娃.md)
  * <code>progress_bar</code> － [经验条](经验条.md)
  * <code>status_effects</code> － [状态效果](状态效果.md)图标
  * <code>tooltips</code> － [提示框](提示框.md)
  * <code>touch_controls</code> － [触控按键](HUD#触屏按键.md)
  如果未指定，默认为<code>all</code>。

# 结果

# 输出

# 示例
* 隐藏所有玩家的所有HUD：<code>/hud @a hide all</code>
* 使附近的[生存模式](生存模式.md)玩家的生命值重新显示：<code>/hud @p[m=s] reset health</code>

# 历史

|。}}
|。}}
|不再属于[实验性玩法](实验性玩法.md)。}}
}}

# 导航

[de:Befehl/hud](de:Befehl/hud.md)
[en:Commands/hud](en:Commands/hud.md)
[ja:コマンド/hud](ja:コマンド/hud.md)
[pt:Comandos/hud](pt:Comandos/hud.md)