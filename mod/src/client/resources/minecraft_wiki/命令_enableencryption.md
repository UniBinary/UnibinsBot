# 命令/enableencryption

*页面ID: 44615* | *来源: Minecraft Wiki*

为WebSocket连接开启加密。

# 用法
此命令仅允许被玩家所连接的WebSocket端执行。

当玩家开启“需要加密的 Websocket”选项后，则连接的WebSocket服务器必须执行此命令。

# 语法
   <code>-{}-enableencryption <publicKey: string> <salt: string> [ciper_mode: EncryptionCommandCipher]</code>

# 参数

   指定WebSocket连接所使用的公钥。

   指定用于干扰解密的盐值。

   指定加密算法。必须为以下其中之一：
  * <code>cfb</code>
  * <code>cfb128</code>
  * <code>cfb8</code>

# 结果

# 导航

[de:Befehl/enableencryption](de:Befehl/enableencryption.md)
[en:Commands/enableencryption](en:Commands/enableencryption.md)
[ja:コマンド/enableencryption](ja:コマンド/enableencryption.md)