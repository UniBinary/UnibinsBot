# Java版Classic服务器1.10

*页面ID: 45328* | *来源: Minecraft Wiki*

* *1.10**是[Classic](Java版Classic.md)服务器的一次更新，发布于2009年11月10日。

# 新内容
# = 常规 =
* *[服务端配置文件格式](服务端配置文件格式.md)**
* 加入了<code>admin-slot</code>。
* * 将这一项设置为<code>true</code>可以阻止不是管理员的玩家在服务器将满时登入。
* 加入了在关闭<code>verify-names</code>时的警告。
* * 警告的内容是：
<pre style="width: 70ex">
# ######################## WARNING #########################
verify-names is set to false! This means that anyone who
connects to this server can choose any username he or she
wants! This includes impersonating an OP!

AND SINCE THIS IS A PUBLIC SERVER, IT WILL HAPPEN TO YOU!

If you wish to fix this, edit server.properties, and change
verify-names to true.
# ##########################################################
</pre>
翻译：
<pre style="width: 70ex">
# ######################## 警   告 #########################
“verify-names”被设置为“false”！这意味着所有连接到服务器
的人都可以选择任何自己想要的用户名！这可能会导致有人冒充管理员！

既然这是一个公共服务器，这些事情就都会发生在你身上！

如果你想修复这个问题，请编辑server.properties，将
“verify-names”修改为“true”。
# ##########################################################
</pre>

# 修复
* *修复了2个漏洞**
* 尝试修复<code>grow-trees</code>。
* 修复了长用户名的玩家能够登入服务器的漏洞。

# 导航

[de:Classic Server 1.10](de:Classic Server 1.10.md)
[en:Java Edition Classic server 1.10](en:Java Edition Classic server 1.10.md)
[es:Java Edition Classic server 1.10](es:Java Edition Classic server 1.10.md)
[ja:Java Edition Classic server 1.10](ja:Java Edition Classic server 1.10.md)
[lzh:爪哇版古典版伺服器一點一〇](lzh:爪哇版古典版伺服器一點一〇.md)
[pt:Edição Java Classic server 1.10](pt:Edição Java Classic server 1.10.md)
[ru:Сервер Classic 1.10 (Java Edition)](ru:Сервер Classic 1.10 (Java Edition).md)