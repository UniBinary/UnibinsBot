# 命令/listd

*页面ID: 40241* | *来源: Minecraft Wiki*

返回当前在线玩家及其信息。

# 用法
将在线玩家列出，这个命令通常被WebSocket端使用。

仅在本机执行该命令时返回信息（即WebSocket端与客户端在同一设备上时），其他设备（WebSocket端与客户端不在同一设备上时）的效果与相同。

信息将被包裹在内，并以[JSON](JSON.md)返回，格式见下：
<div class="treeview">
*  JSON根对象
* * ：被执行的命令，始终为。
* * ：执行结果。
* ** ：一项玩家信息。
* ***
* *** ：游戏平均丢包率。
* *** ：游戏平均延迟。
* ***
* ***
* ***
* ***
* *** ：玩家实体的唯一ID。
* *** ：游戏传输时的最大比特率。
* *** ：玩家名称。
* *** ：游戏当前丢包率。
* *** ：已登录玩家的PlayFab ID。
* *** ：游戏当前延迟。
* ***
* ***
* *** ：玩家UUID。
* *** ：已登录玩家的Xbox UID。
</div>

# = 返回信息示例 =
<nowiki>
realonDrag
# ##* {"command":"listd","result":[{"activeSessionId":"247e7691-2b2c-46c8-a100-05723212fe11","avgpacketloss":0.0,"avgping":0,"clientId":"raknet:12559757114371867158","color":"ffededed","deviceSessionId":"69dd179a-1436-3f0d-8fd1-eebb5be17a1d","globalMultiplayerCorrelationId":"<raknet>ad22-6266-f70d-f197","id":-12884901887,"maxbps":100000000,"name":"realonDrag","packetloss":0.0,"pfid":"a5588d818d6f5091","ping":0,"randomId":4436948217943248741,"split-screen-player":false,"uuid":"15ea2c6e-523f-324d-9b3c-1ab7d6593f9c","xuid":"2535459021878058"}]}
 *###</nowiki>
}}

# 语法
   <code>listd [details: ListDetails]</code>

# 参数

   必须为以下其中之一：
  * <code>ids</code> — 同时列出。
  * <code>uuids</code> — 同时列出。
  * <code>stats</code> — 向信息中加入、、、和。

# 结果

# 历史

|。}}
|
|。}}
}}

# 导航

[en:Commands/listd](en:Commands/listd.md)
[ja:コマンド/listd](ja:コマンド/listd.md)
[pt:Comandos/listd](pt:Comandos/listd.md)