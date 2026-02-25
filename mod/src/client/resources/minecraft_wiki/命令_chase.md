# 命令/chase

*页面ID: 166474* | *来源: Minecraft Wiki*

]]
}}

同步不同游戏实例的玩家的移动。

# 用法
此命令需要在至少两个独立的游戏实例上执行，单个游戏实例内没有任何作用。<ref></ref>

将创建一个chase服务端，将创建一个chase客户端。游戏会尝试连接chase服务端与chase客户端。

连接完毕后，游戏会将chase服务端玩家列表的首个玩家的移动同步到chase客户端玩家列表的首个玩家上。当chase服务端的玩家的位置或朝向改变时，游戏实际上会将chase客户端的玩家传送到chase服务端玩家的位置（包含朝向），类似于命令的效果。

# 语法
   <code>chase follow [<host>] [<port>]</code>
  : 创建chase客户端，将作为被同步移动的一方。

   <code>chase lead [<bind_address>] [<port>]</code>
  : 创建chase服务端，将作为发出同步移动的一方。

   <code>chase stop</code>
  : 停止chase客户端或停止chase服务端。

# 参数

   指定chase客户端的地址，默认为<code>localhost</code>。


（在<code>/chase follow</code>中）
   指定chase客户端的端口，默认为<code>10000</code>。


（在<code>/chase lead</code>中）
   指定chase服务端的端口，默认为<code>10000</code>。


   指定chase服务端的地址，默认为<code>0.0.0.0</code>。


# 结果

# 输出

# 历史

|命令，仅在启用[调试工具](调试工具#CHASE_COMMAND.md)时可用。}}
}}

# 参考

# 导航

[de:Befehl/chase](de:Befehl/chase.md)
[en:Commands/chase](en:Commands/chase.md)