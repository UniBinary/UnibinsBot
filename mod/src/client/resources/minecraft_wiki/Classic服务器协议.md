# Classic服务器协议

*页面ID: 23791* | *来源: Minecraft Wiki*

这是有关[Minecraft Classic创造](http://minecraft.net/servers.jsp)服务器使用的服务器协议的文档。

# Minecraft.net交流
# = 心跳 =
为了能从[服务器](服务器.md)列表连接到[Minecraft Classic](Java版Classic.md)中的服务器，服务器必须每隔45秒向[minecraft.net](minecraft.net.md)广播一个所谓的“心跳”。

“心跳”会对https://minecraft.net/heartbeat.jsp发送HTTP请求。

该请求可以是GET或POST请求中的一种。下面表格是所需要的参数：

示例:

* *GET /heartbeat.jsp?port=25565&max=32&name=My%20Server&public=True&version=7&salt=wo6kVAHjxoJcInKx&users=0**

正常情况下，在回应里会收到一个发送给服务器的URL，否则会收到一个HTML错误信息。由于没有指定HTTP版本，所以使用了没有标头的HTTP/0.9，因而没有任何HTML标头需要解析。

# = 用户认证 =
检验用户加入服务器时提供的“密钥”可以验证用户是否使用该用户名登录了minecraft.net。

 -{}-if( player.key == md5( server.salt + player.name ) ) {
  // 玩家通过minecraft.net登录
 } else {
  // 玩家伪造用户名
 }

注意：这意味着你应当确保你的“盐”是私密的，且仅与heartbeat.jsp共享。

# 数据包协议
每个包都以表示其ID的字节开始。

# = 协议数据类型 =

# = 客户端&rarr;服务端数据包 =

# = 服务端&rarr;客户端数据包 =

# 玩家位置
# = 固定点 =
玩家的位置通过X、Y和Z定点坐标来表示。小数部分是5位，所以将位置更新包中接收到的短整数除以32将得到玩家的浮点坐标。该位置对应于客户端视角的中心。

# = 朝向 =
偏航角为0表明玩家面向Z-（负Z轴）方向。从上向下看，该数值向顺时针方向增大。如果将负Z轴方向称为北方，那么偏航角为64为东方，128为南方，192为西方。

俯仰角0表示水平，且该数值向下增大。64为正下方，192为正上。65至191之间的数字不应当出现，因为玩家不可能在64 → 0和255 → 192范围之外继续向上或是向下看。然而，Minecraft Classic客户端并不会忽略无效的数值，因此玩家的-{}-头可能“上下颠倒”。

# 颜色代码

从客户端发送的消息可以包含颜色代码，这使得文字可以染色以用于多种用途。

消息中的小节符<code>§</code>和其后的一位十六进制数字告知客户端显示该消息的颜色。

以颜色代码开头的信息只会在玩家ID字节数小于127时生效。如果是玩家ID字节数是127或更高，游戏会自动的在信息前面加<code>&e</code>，让信息变成黄色。然而，在第一个字符后面的颜色代码仍然可用。

# 导航

[Category:开发](Category:开发.md)

[de:Classic-Server Protokoll](de:Classic-Server Protokoll.md)
[en:Classic server protocol](en:Classic server protocol.md)
[fr:Protocole de serveur Classique](fr:Protocole de serveur Classique.md)
[nl:Classic server protocol](nl:Classic server protocol.md)
[pt:Protocolo de servidor Classic](pt:Protocolo de servidor Classic.md)
[ru:Протокол сервера Classic](ru:Протокол сервера Classic.md)