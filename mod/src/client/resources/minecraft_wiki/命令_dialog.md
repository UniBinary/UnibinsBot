# 命令/dialog

*页面ID: 151508* | *来源: Minecraft Wiki*

向[玩家](玩家.md)展示或清除[对话框](对话框.md)。

# 语法
   <code>dialog clear <targets></code>
  : 清除对话框。
   <code>dialog show <targets> <dialog></code>
  : 展示对话框。

# 参数



   指定要展示的对话框。


# 结果

# 输出

# 示例
* 向最近的玩家展示位于数据包中的对话框：
* * <code>/dialog show @p custom:example/test</code>
* 向所有玩家展示一个标题为“你好”，正文为“很高兴认识你！”的对话框：
* * <code>-{}-/dialog show @a {type:"minecraft:notice", title:"你好", body:[{type:"minecraft:plain_message", contents:"很高兴认识你！"}]}</code>
* 为所有玩家清除任何可见对话框：
* * <code>/dialog clear @a</code>

# 历史

|命令。}}
}}

# 导航

[de:Befehl/dialog](de:Befehl/dialog.md)
[en:Commands/dialog](en:Commands/dialog.md)
[es:Comandos/dialog](es:Comandos/dialog.md)
[ja:コマンド/dialog](ja:コマンド/dialog.md)
[pt:Comandos/dialog](pt:Comandos/dialog.md)