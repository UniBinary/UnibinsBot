# Java版1.21.5-pre1

*页面ID: 147313* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.21.5-pre1**是[Java版1.21.5](Java版1.21.5.md)的首个预发布版，发布于2025年3月11日<ref></ref>，修复了一些漏洞。

# 更改
# = 命令格式 =
* *[SNBT格式](SNBT格式.md)**
* 接受内联定义的命令参数，例如、、、和等[命令](命令.md)的战利品表、谓词、物品修饰器、物品堆叠组件、文本组件等现在可再次使用数字表示布尔值。

# = 常规 =
* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 向[Programmer Art](Programmer Art.md)中加入了25w08a更新前刷怪蛋的纹理。
* 调整了[枯叶堆](枯叶堆.md)的方块模型。

* *网络协议**
* 发向客户端的<code>player_chat</code>数据包现在包含一个随着信息发送到客户端递增的索引。
* * 每次登录或在配置阶段由登录数据包重置时索引从0开始。
* * 对于每条消息，服务端会将此值增加1。
* * 如果此值以未预定的方式更新，客户端会断开连接。
* * 由于该协议需要每个聊天数据包按生成顺序到达客户端，此功能目的是自定义服务器开发人员能更快地检查丢失或被重新排序的聊天信息。
* 发向服务端的<code>chat</code>和<code>chat_command_signed</code>数据包现在在<code>last seen</code>更新中包含一个校验和字节。
* * 这是<code>last seen</code>签名的简单哈希值，应由服务端重建，以允许快速检查不同步状态。
* * 可以传递0以禁用检查，和协议转换相兼容。

# 修复
游戏规则。
|280477|游戏规则为时，由命令或发射器生成的激活的TNT仍会爆炸。
|280479|游戏规则被禁用时，被红石元件点燃的TNT被完全移除。<!--
|280480|游戏规则被禁用时，尝试用打火石点燃TNT不会播放打火石的敲击音效。Reopened-->
|280493|在游戏规则被禁用前生成的激活的TNT如常爆炸。
|280501|雨中着火时，每游戏刻都会播放“”音效。
|280520|物品展示框中没有物品时，其中的<code>ItemDropChance</code>不会被序列化，导致不一致。
}}</onlyinclude>

# 参考

# 导航

[de:1.21.5-pre1](de:1.21.5-pre1.md)
[en:Java Edition 1.21.5 Pre-Release 1](en:Java Edition 1.21.5 Pre-Release 1.md)
[es:Java Edition 1.21.5 Pre-Release 1](es:Java Edition 1.21.5 Pre-Release 1.md)
[fr:Édition Java 1.21.5 Pre-Release 1](fr:Édition Java 1.21.5 Pre-Release 1.md)
[ja:Java_Edition_1.21.5_Pre-Release_1](ja:Java_Edition_1.21.5_Pre-Release_1.md)
[ko:Java Edition 1.21.5 프리릴리스 1](ko:Java Edition 1.21.5 프리릴리스 1.md)
[pt:Edição Java 1.21.5 Pre-Release 1](pt:Edição Java 1.21.5 Pre-Release 1.md)
[ru:1.21.5 Pre-Release 1 (Java Edition)](ru:1.21.5 Pre-Release 1 (Java Edition).md)
[uk:1.21.5 Pre-Release 1 (Java Edition)](uk:1.21.5 Pre-Release 1 (Java Edition).md)