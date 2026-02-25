# Java版22w19a

*页面ID: 96036* | *来源: Minecraft Wiki*

<onlyinclude>

* *22w19a**是[Java版1.19](Java版1.19.md)的第10个，也是最后一个快照，发布于2022年5月12日<ref></ref>，加入了聊天预览功能，以及2个相关的选项。将和命令合并为新的命令，并分别向和命令中加入了定位[兴趣点](兴趣点存储格式.md)（Point of Interest）和按结构文件放置结构的功能，并修复了一些漏洞。

# 新内容
# = 命令格式 =
* ***
* 加入了<code>poi</code>子命令，用于定位[兴趣点](兴趣点存储格式.md)，语法如下：
* *
* ** <code>poi</code>：兴趣点的命名空间ID或兴趣点类型标签。

* ***
* 加入了<code>template</code>子命令，用于在指定位置上按结构文件放置结构，此命令的语法如下：
* *
* ** 此命令的功能类似于在[结构方块](结构方块.md)界面中使用“加载”按钮。
* ** <code>template</code>：要加载并放置的结构文件的命名空间ID。
* ** <code>pos</code>：用作生成原点的位置（如不指定，则默认使用<code>~ ~ ~</code>）。
* ** <code>rotation</code>：被放置结构的旋转角度（如不指定，则默认使用<code>none</code>）。
* ** <code>mirror</code>：被放置结构的镜像方式（如不指定，则默认使用<code>none</code>）。
* ** <code>integrity</code>：被放置结构的完整度，可在0到1间取值（如不指定，则默认使用<code>1</code>）。
* ** <code>seed</code>：用于结构完整度的种子，结构完整度小于1时有效（如不指定，则使用随机种子）。

# = 常规 =
* *[聊天](聊天.md)**
* 服务器现在可通过服务器选项启用聊天预览功能。
* * 启用后，客户端的聊天框上会出现一个由服务器控制的预览界面，显示消息发送时的样子。
* * 服务器可以利用其预览应用了样式后的消息，例如表情或聊天颜色。
* * 即便尚未确认发送，聊天预览也会将已键入的内容发送到服务器上。
* ** 服务器随后会实时返回应用了聊天样式的预览。
* ** 这使得服务器可以在使用动态消息样式的同时，签署聊天内容。
* * 玩家进入启用了聊天预览功能的服务器时会显示一个警告界面，这个界面可在聊天设置中完全禁用。
* * 动态聊天样式也可以由服务器控制，尽管只有在启用聊天预览时才会被签署。
* ** 客户端可通过聊天设置中的“”选项，设置为仅显示被签过名的原始聊天消息。

* *[选项](选项.md)**
* 加入了“”聊天设置，用于启用聊天预览功能。默认为开。
* 加入了“”聊天设置，用于将客户端设置为仅显示被签过名的原始聊天消息。默认为关。

* *<samp>[options.txt](options.txt.md)</samp>**
* 加入了<code>chatPreview</code>和<code>onlyShowSignedChat</code>。

* *协议**
* 现在服务器会在玩家连接到服务器后，向玩家发送一个额外的包含图标和MOTD的网络数据包。
* * 主要是为了让<code>enable-status</code>服务器选项设为<code>false</code>的服务器在玩家成功进入服务器后，图标和MOTD可以显示在服务器列表上。

* *<samp>[server.properties](server.properties.md)</samp>**
* 加入了<code>previews-chat</code>服务器选项，用于启用聊天预览功能。默认值为<code>true</code>。
* 加入了临时的<code>test-rainbow-chat</code>服务器选项，仅会存在于此快照中。

* *[标签](Java版标签.md)**
* 加入了以下[兴趣点类型标签](Java版标签/兴趣点类型 .md)（新类型）：
* * ：。
* ** 此标签用于定义<code>none</code>职业的[村民](村民.md)会寻找的工作站点。
* * ：。
* ** 此标签用于定义[蜜蜂](蜜蜂.md)会寻找的兴趣点。
* * ：。
* ** 此标签用于定义属于[村庄](村庄.md)的兴趣点。

# 更改
# = 生物 =
* *[铁傀儡](铁傀儡.md)和[监守者](监守者.md)**
* 现在铁傀儡和监守者只会生成在固体方块上。

# = 命令格式 =
* *和**
* 合并至新的命令中：
* * 改为。
* * 改为。

# = 常规 =
* *[兴趣点](兴趣点存储格式.md)类型**
* 移除了<code>unemployed</code>和<code>nitwit</code>。

# 修复
”提示。
|;previous
|251316|加载包含拼图方块的区块时游戏崩溃。
|251321|监守者从地下钻出时可被爆炸击退。
|251350|使用命令会获得1个未注册的山羊角。
|251464|友好生物被监守者音波击中而受伤时不尝试逃离。
}}</onlyinclude>

# 参考

# 导航

[de:22w19a](de:22w19a.md)
[en:Java Edition 22w19a](en:Java Edition 22w19a.md)
[es:Java Edition 22w19a](es:Java Edition 22w19a.md)
[fr:Édition Java 22w19a](fr:Édition Java 22w19a.md)
[ja:Java Edition 22w19a](ja:Java Edition 22w19a.md)
[pt:Edição Java 22w19a](pt:Edição Java 22w19a.md)
[ru:22w19a (Java Edition)](ru:22w19a (Java Edition).md)