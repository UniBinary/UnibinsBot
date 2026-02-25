# 命令/transfer

*页面ID: 112340* | *来源: Minecraft Wiki*

中已移除的具有相同功能的命令|命令/transferserver|中已移除的同名命令|命令/transfer（教育版）}}

将玩家转移到另一个服务器上。

此命令只会发出转移请求，能否转移成功取决于目标服务器是否接受转移登录，即服务端配置文件中[](服务端配置文件格式#accepts-transfers.md)属性是否设置为<code>true</code>。

# 语法
* **Java版**
   <code>transfer <hostname> [<port>] [<players>]</code>

* **基岩版**
   <code>transfer <pfidOrMSA: string> <server: string> <port: int></code>

# 参数
：
   要转移的玩家，可以为Microsoft账户名称（玩家名），或PlayFab ID（当玩家加入或断开与服务器的连接时显示）。


   要连接到的服务器的主机名。


   要连接到的服务器的端口编号。若省略则为。
   应在0和65535之间（含）。

：
   要转移的玩家，若省略则为执行者玩家。


# 结果

# 输出

# 示例
* 将自己转移到服务器的端口上：。
* 将Steve转移到服务器：。
* 将Steve转移到服务器：

# 历史

|。}}
|
|。}}
}}

# 导航

[de:Befehl/transfer](de:Befehl/transfer.md)
[en:Commands/transfer](en:Commands/transfer.md)
[ja:コマンド/transfer](ja:コマンド/transfer.md)
[lzh:令/transfer](lzh:令/transfer.md)
[pt:Comandos/transfer](pt:Comandos/transfer.md)
[ru:Команды консоли/transfer (Java Edition)](ru:Команды консоли/transfer (Java Edition).md)