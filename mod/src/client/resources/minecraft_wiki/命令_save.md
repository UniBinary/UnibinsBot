# 命令/save

*页面ID: 39806* | *来源: Minecraft Wiki*

这些命令用于管理服务器的存档。

# save-all

将存档保存至硬盘。

# = 语法 =
  <code>save-all</code>
  : 立即保存所有玩家数据，并将所有区块数据标记为待保存，这些区块数据会随时间陆续保存进硬盘。
  <code>save-all flush</code>
  : 立即保存所有玩家和区块数据，可能造成服务器冻结一段时间。

# = 结果 =

# =输出=

# save-off

禁用服务器的对存档文件的写入（玩家、统计、进度数据除外），以便于从外部复制存档文件作为备份。所有的区块更改将会暂时进入队列等待保存。

# = 语法 =
  <code>save-off</code>

# = 结果 =

# =输出=

# save-on

启用服务器对存档文件的写入。

# = 语法 =
  <code>save-on</code>

# = 结果 =

# =输出=

# save

用于在服务器运行期间为从外部复制备份作准备。

# = 语法 =
   <code>save hold</code>
  : 禁用服务器的对存档文件的写入（玩家、统计、进度数据除外），以便于从外部复制存档文件作为备份。

   <code>save query</code>
  : 显示每个存档文件的路径和其应被截断的字节量，以冒号分隔。

   <code>save resume</code>
  : 恢复启用服务器对存档文件的写入。

# = 结果 =

# 历史

|、、命令。}}
|
|命令。}}
}}

# 导航

[de:Befehl/save-all](de:Befehl/save-all.md)
[en:Commands/save](en:Commands/save.md)
[fr:Commandes#save](fr:Commandes#save.md)
[ja:コマンド/save](ja:コマンド/save.md)
[pt:Comandos/save](pt:Comandos/save.md)
[ru:Команды консоли/save](ru:Команды консоли/save.md)