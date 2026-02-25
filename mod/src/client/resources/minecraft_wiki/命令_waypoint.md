# 命令/waypoint

*页面ID: 149568* | *来源: Minecraft Wiki*

列出或更改[路径点](路径点.md)。

# 语法
   <code>waypoint list</code>
  : 列出路径点。
   <code>waypoint modify <waypoint> color <color></code>
   <code>waypoint modify <waypoint> color hex <color></code>
  : 更改路径点颜色。
   <code>waypoint modify <waypoint> style set <nowiki><style></nowiki></code>
  : 设置[路径点样式](路径点样式.md)。
   <code>waypoint modify <waypoint> style reset</code>
  : 重置路径点样式为默认值。

# 参数

   指定要更改的路径点。


（在中）
   指定路径点颜色。


（在中）
   指定路径点颜色代码。


   指定路径点样式名。
   若指定的路径点样式不存在，将显示为[无效纹理](无效纹理.md)。


# 结果

无法选出单个实体（指定的玩家必须在线上）|fail}}
不是路径点}}

# 输出

# 示例
* 列出所有路径点所追踪的生物：
* 将最近一只猪的路径点传输距离属性基值设置为32.0，并将其路径点颜色设置为金色。
   <syntaxhighlight lang="mcfunction">
tag @n[type=pig] add waypoint_test
attribute @n[tag=waypoint_test] minecraft:waypoint_transmit_range base set 32.0
waypoint modify @n[tag=waypoint_test] color gold
</syntaxhighlight>

# 历史

|。}}
|不再属于[实验性内容](实验性内容.md)。
|移除了<code>modify ... fade</code>子命令。
|加入了<code>modify ... style</code>子命令。}}
}}

# 画廊
<gallery>
Locator Bar Waypoint Fade.gif|[25w16a](25w16a.md)中可使用命令改变路径点图标的不透明度
</gallery>

# 导航

[de:Befehl/waypoint](de:Befehl/waypoint.md)
[en:Commands/waypoint](en:Commands/waypoint.md)
[ja:コマンド/waypoint](ja:コマンド/waypoint.md)
[lzh:令/waypoint](lzh:令/waypoint.md)
[pt:Comandos/waypoint](pt:Comandos/waypoint.md)