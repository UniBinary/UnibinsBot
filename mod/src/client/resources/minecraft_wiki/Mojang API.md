# Mojang API

*页面ID: 47233* | *来源: Minecraft Wiki*

* *Mojang API**是[Mojang](Mojang.md)提供的“应用程序编程接口”，允许用户使用自编程序检索玩家数据，它适用于第三方启动器开发人员、服务器运营商和插件开发人员。

所有查询目前限制为每10分钟600次。对于没有购买游戏的注册账户，也可以进行部分信息的查询。

# 服务器的请求与响应
服务器能接受很多请求，如果没有特殊说明，对于具有负载的请求服务器有下面的限制：
* 请求头中的<code>Content-Type</code>必须是<samp>application/json</samp>。如果不是，服务器将返回HTTP状态码415。
* 如果请求中要求负载，则负载必须是一个有效的JSON文本。如果不是，服务器将返回HTTP状态码400。

如果请求成功，服务器会做出如下的响应：
* 一个成功的HTTP状态码（2XX）。
* 返回一个空的负载（这时服务器返回状态码204）或是一个JSON文本。

如果请求失败，服务器会返回一个非2XX的HTTP状态码并返回形式如下方的负载：

<div class="treeview">
*  根标签
* * ：对于错误的简短介绍。
* * ：错误信息。
* * ：错误原因。
</div>

下面列出了一些常见的错误，在下文中不再重复说明。

# 获取玩家信息
获取玩家信息的API都不需要身份验证得到的访问令牌，部分API可以查询没有购买游戏的注册账户。

# = 获取玩家的UUID =
; 输入
玩家的名称（不区分大小写）。

; GET请求
* <code>-{}-<nowiki>https://api.mojang.com/users/profiles/minecraft/</nowiki><*玩家名称*></code>
* <code>-{}-<nowiki>https://api.minecraftservices.com/minecraft/profile/lookup/name/</nowiki><*玩家名称*></code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的[UUID](UUID.md)。
* * ：正确大写的玩家名称。
* * ：如果此账户没有迁移到Mojang账户，输出中包含此项。
* * ：如果是没有购买游戏的注册账户，输出中包含此项。
</div>

; 示例
<code><nowiki>https://api.mojang.com/users/profiles/minecraft/jeb_</nowiki></code><br>提供玩家<samp>jeb_</samp>的UUID。

<syntaxhighlight lang="json">
 {
   "name": "jeb_",
   "id": "853c80ef3c3749fdaa49938b674adae6"
 }</syntaxhighlight>

; 错误信息
* 如果没有命名为这个名字的玩家，返回HTTP状态码404。

# = 批量获取玩家UUID =
; 负载
一个存储小于10个的玩家名称字符串的JSON列表，玩家名称不区分大小写。

; POST请求
<code><nowiki>https://api.mojang.com/profiles/minecraft</nowiki></code>

; 响应
<div class="treeview">
*  给定玩家的所有UUID列表。对于不存在的玩家名称，将不返回任何结果。
* *  玩家名称。
* ** ：玩家的UUID。
* ** ：正确大小写的玩家名称。
* ** ：如果此账户没有迁移到Mojang账户，输出中包含此项。
* ** ：如果是没有购买游戏的注册账户，输出中包含此项。
</div>

; 示例
发送<code><nowiki>["jeb_","notch"]</nowiki></code>。
<syntaxhighlight lang="json">
 [
   {
     "id": "853c80ef3c3749fdaa49938b674adae6",
     "name": "jeb_"
   },
   {
     "id": "069a79f444e94726a5befca90e38aaf5",
     "name": "Notch"
   }
 ]</syntaxhighlight>

; 错误信息

# = 获取玩家名称 =
; 输入
玩家的UUID。

; GET请求
<code><nowiki>https://api.minecraftservices.com/minecraft/profile/lookup/</nowiki><*UUID*></code>

; 响应
同[获取玩家UUID](#获取玩家的UUID.md)。

; 示例
<code><nowiki>https://api.minecraftservices.com/minecraft/profile/lookup/853c80ef3c3749fdaa49938b674adae6</nowiki></code><br>返回如下结果：
<syntaxhighlight lang="json">
{
  "id" : "853c80ef3c3749fdaa49938b674adae6",
  "name" : "jeb_"
}
</syntaxhighlight>

; 错误信息

# = 获取玩家的皮肤和披风 =
; 输入
玩家的UUID以及[签名](wikipedia:Digital signature.md)的请求。可以在一分钟后最早重复对给定UUID的查询。

; GET请求
<code><nowiki>https://sessionserver.mojang.com/session/minecraft/profile/</nowiki><*UUID*></code> 或<br><code><nowiki>https://sessionserver.mojang.com/session/minecraft/profile/</nowiki><*UUID*>?unsigned=false</code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的[UUID](UUID.md)。
* * ：正确大写的玩家名称。
* * ：如果这个账户是一个旧的Minecraft账户，这项才存在。
* * ：玩家属性的列表。
* ** ：玩家属性的名称。到目前为止只有<code>textures</code>（玩家纹理）这一属性。
* ** ：只有在请求<code>unsigned=false</code>时，使用<samp>Yggdrasil</samp>私钥的签名才会作为Base64字符串传递。
* ** ：[Base64](wikipedia:Base64.md)字符串，其中包含玩家所有的纹理（皮肤和披风）。解码后的字符串内容如下：
* ***  纹理对象。
* **** ：[Unix时间戳](wikipedia:Unixtime.md)，以毫秒为单位，时间为调用纹理数据的时间。
* **** ：玩家的UUID，不带连字符。
* **** : 玩家名称。
* **** : 只有在请求<code>unsigned=false</code>时才存在。
* **** ：纹理。
* ***** ：[皮肤](皮肤.md)纹理。如果这名玩家没有自定义皮肤，这项不存在。
* ****** ：皮肤纹理的URL链接。
* ****** ：可选。皮肤的元数据。
* ******* ：固定值<code>slim</code>。当皮肤模型为<samp>Alex</samp>时这一项才存在，模型为<samp>Steve</samp>则无该元数据。
* ***** ：[披风](披风.md)纹理。如果这名玩家没有披风，这项不存在。
* ****** ：披风纹理的URL链接。默认没有披风，仅当Mojang在玩家的账户数据中输入了披风时，才会显示披风。
</div>

; 示例
<code><nowiki>https://sessionserver.mojang.com/session/minecraft/profile/853c80ef3c3749fdaa49938b674adae6</nowiki></code><br>返回如下结果：
<syntaxhighlight lang="json">
 {
   "id": "853c80ef3c3749fdaa49938b674adae6",
   "name": "jeb_",
   "properties":
   [
     {
       "name": "textures",
       "value": "ewogICJ0aW1lc3R..."
     }
   ]
 }
</syntaxhighlight>
其中使用Base64解码之后的内容为：
<syntaxhighlight lang="json">
{
  "timestamp" : 1653838459263,
  "profileId" : "853c80ef3c3749fdaa49938b674adae6",
  "profileName" : "jeb_",
  "textures" : {
    "SKIN" : {
      "url" : "http://textures.minecraft.net/texture/7fd9ba42a7c81eeea22f1524271ae85a8e045ce0af5a6ae16c6406ae917e68b5"
    },
    "CAPE" : {
      "url" : "http://textures.minecraft.net/texture/9e507afc56359978a3eb3e32367042b853cddd0995d17d0da995662913fb00f7"
    }
  }
}
</syntaxhighlight>

; 错误信息

# Mojang身份验证
对于Mojang账户，要用下面的API进行身份验证。身份验证都使用了<code><nowiki>https://authserver.mojang.com</nowiki></code>这个服务器。

# = 验证并获取访问令牌 =
验证的请求次数很严格，在几秒内仅能请求3次。

; 负载
<div class="treeview">
*  根标签
* * ：游戏信息。
* ** ：游戏名称。固定值<code>Minecraft</code>。
* ** ：版本。固定值1。
* * ：账户名称，是一个电子邮件地址。对于未迁移的账户，可以是玩家名称。
* * ：账户密码。
* * ：客户端令牌，可选参数。所有的请求都要用统一的客户端令牌。启动器应该在第一次运行时生成一个令牌，并且需要在以后的请求中使用它。如果请求中不提供客户端令牌，那么服务器会随机生成一个令牌返回给客户端，客户端应该保存这个令牌并用于之后的请求，但是这样做会让客户端之前获得的访问令牌失效。
* * ：响应是否包含<code>user</code>对象，可选参数，默认为<samp>false</samp>。
</div>

; POST请求
<code>/authenticate</code>

; 响应
<div class="treeview">
*  根标签
* * ：账户信息，只有当请求中<code>requestUser</code>为<samp>true</samp>时才存在。
* ** ：账户名称，是一个电子邮件地址。对于未迁移到Mojang账户的账户是玩家名称。
* ** ：账户属性。
* *** ：一项属性。
* **** ：属性名称，目前只有和。
* **** ：属性的值。当为<samp>preferredLanguage</samp>时为语言；当为<samp>registrationCountry</samp>时为注册时的国家信息。
* ** ：账户的远程ID，是一个16进制的字符串。
* * ：客户端令牌。
* * ：[访问令牌](wikipedia:JSON Web Token.md)。
* * ：可用的玩家配置信息。
* ** ：一项配置信息。
* *** ：玩家名称。
* *** ：玩家的UUID。
* * ：现在正在使用的玩家配置信息。
* ** ：玩家名称。
* ** ：玩家的UUID。
</div>

; 错误信息

# = 刷新访问令牌 =
; 负载
<div class="treeview">
*  根标签
* * ：访问令牌，在请求之后这个令牌将会失效。
* * ：客户端令牌，要与验证时的令牌一致。
* * ：现在正在使用的玩家配置信息。
* ** ：玩家的UUID。
* ** ：玩家名称。
* * ：响应是否包含，可选参数，默认为<samp>false</samp>。
</div>

; POST请求
<code>/refresh</code>

; 响应
<div class="treeview">
*  根标签
* * ：新的有效的访问令牌。
* * ：客户端令牌。
* * ：现在正在使用的玩家配置信息。
* ** ：玩家的UUID。
* ** ：玩家名称。
* * ：账户信息，只有当请求中为<samp>true</samp>时才存在。
* ** ：账户名称，是一个电子邮件地址。对于旧的Minecraft账户是玩家名称。
* ** ：账户的远程ID，是一个16进制的字符串。
* ** ：账户属性。
* *** ：属性名称，目前只有和。
* *** ：属性的值。当为<samp>preferredLanguage</samp>时为语言；当为<samp>registrationCountry</samp>时为注册时的国家信息。
</div>

; 错误信息

# = 检查访问令牌有效性 =
; 负载
<div class="treeview">
*  根标签
* * ：要查询的访问令牌。
* * ：客户端令牌，可选参数。如果提供了客户端令牌，那么它要和验证时的令牌一致。
</div>

; POST请求
<code>/validate</code>

; 响应
如果令牌还有效那么服务器会返回HTTP状态码204。

; 错误信息

# = 登出账户 =
; 负载
<div class="treeview">
*  根标签
* * ：账户名称。
* * ：账户密码。
</div>

; POST请求
<code>/signout</code>

; 响应
如果登出成功服务器将返回一个空的负载。

# = 使访问令牌无效 =
; 负载
<div class="treeview">
*  根标签
* * ：访问令牌，在请求之后这个令牌将会失效。
* * ：客户端令牌，要与验证时的令牌一致。
</div>

; POST请求
<code>/invaildate</code>

; 响应
如果使令牌成功无效化服务器将返回一个空的负载。

; 错误信息

# Microsoft身份验证
该过程包含多个步骤并且需要不同的令牌，但最终会获取到一个标准的**Minecraft**令牌。目前所有的账户均已启用这一新的验证系统。

在使用Microsoft验证之前，必须要先通过创建[Microsoft Azure应用程序](https://docs.microsoft.com/zh-cn/azure/active-directory/develop/quickstart-register-app)来获得[OAuth 2.0](https://docs.microsoft.com/zh-cn/azure/active-directory/develop/v2-oauth2-auth-code-flow)客户端ID（无需获取密钥）；之后根据[这篇支持文档](https://help.minecraft.net/hc/en-us/articles/16254801392141p)，还需填写[此表单](https://aka.ms/mce-reviewappid)以申请API访问权限，否则使用域名下的任意API时都只会返回。之后，就可以获取Microsoft令牌。

请注意：在获取令牌时，参数**必须**为，参数中**必须**包含，否则无法进行获取Xbox Live令牌等操作。

# = 使用Microsoft令牌获取Xbox Live令牌 =
; 负载
<div class="treeview">
*  根标签
* * ：验证属性。
* ** ：登录方法。固定值<code>RPS</code>。
* ** ：网站名称。固定值<code>user.auth.xboxlive.com</code>。
* ** ：登录使用的票据。值为<code>-{}-d=<*Microsoft访问令牌*></code>。
* * ：依赖的平台。固定值<code>http://auth.xboxlive.com</code>。
* * ：访问令牌的类型。固定值<code>JWT</code>。
</div>

; POST请求
<code><nowiki>https://user.auth.xboxlive.com/user/authenticate</nowiki></code>

要求SSL实现支持SSL重协商。

; 响应
<div class="treeview">
*  根标签
* * ：获取Xbox Live令牌的时间。
* * ：Xbox Live令牌过期时间。
* * ：Xbox Live访问令牌。
* * ：未知。
* ** ：未知。
* ***
* **** ：用户的哈希码。
</div>

# = 使用Xbox Live令牌获取XSTS令牌 =
; 负载
<div class="treeview">
*  根标签
* * ：验证属性。
* ** ：沙盒ID。固定值<code>RETAIL</code>。
* ** ：用户的Xbox Live令牌。
* *** ：用户的Xbox Live令牌，在上一步获取。
* * ：依赖的平台。固定值<code>rp://api.minecraftservices.com/</code>。
* * ：访问令牌的类型。固定值<code>JWT</code>。
</div>

; POST请求
<code><nowiki>https://xsts.auth.xboxlive.com/xsts/authorize</nowiki></code>

要求SSL实现支持SSL重协商。

; 响应
<div class="treeview">
*  根标签
* * ：获取XSTS令牌的时间。
* * ：XSTS令牌过期时间。
* * ：XSTS访问令牌。
* * ：未知。
* ** ：未知。
* ***
* **** ：用户的哈希码。
</div>

; 错误信息
如果没有成功获取XSTS令牌，服务器返回HTTP状态码401。

# = 通过XSTS令牌获取Minecraft访问令牌 =
; 负载
<div class="treeview">
*  根标签
* * ：身份令牌。值为<code>-{}-XBL3.0 x=<*用户哈希码*>;<*XSTS访问令牌*></code>。
</div>

; POST请求
<code><nowiki>https://api.minecraftservices.com/authentication/login_with_xbox</nowiki></code>

; 响应
<div class="treeview">
*  根标签
* * ：一个UUID，但不是账户的UUID。
* * ：未知，为空。
* * ：Minecraft访问令牌。
* * ：令牌类型。固定值<code>Bearer</code>。
* * ：有效时间，以秒为单位。
</div>

# = 验证账户是否拥有Minecraft =
; 请求头
<code>Authorization</code>要求为<code>-{}-Bearer <*有效的Minecraft访问令牌*></code>。

; GET请求
<code><nowiki>https://api.minecraftservices.com/entitlements/mcstore</nowiki></code>

; 响应
如果账户拥有Minecraft，服务器将会返回下面的负载：
<div class="treeview">
*  根标签
* * ：数据和签名列表。
* ** ：数据名称，<code>product_minecraft</code>或<code>game_minecraft</code>。
* ** ：数据的JWT签名。
* * ：JWT签名。
* * ：未知。
</div>

如果账户不拥有Minecraft或者是XGP用户，服务器将返回空负载。

# 玩家配置操作
操作玩家配置的API基本都在<code><nowiki>https://api.minecraftservices.com</nowiki></code>服务器下，并且都要求请求头包含<code>Authorization</code>，且值为<samp>Bearer <*有效的Minecraft访问令牌*></samp>。如果请求头不包含访问令牌信息或者访问令牌无效，服务器将返回HTTP状态码401。

# = 获取配置信息 =
; GET请求
<code>/minecraft/profile</code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的UUID。
* * ：玩家名称。
* * ：玩家拥有的所有皮肤信息。
* ** ：一个皮肤。
* *** ：皮肤的UUID。
* *** ：皮肤的使用状态。
* *** ：皮肤的URL。
* *** ：皮肤类型。如果是Steve模型的皮肤这一项是<code>CLASSIC</code>，如果是Alex模型的皮肤这一项是<code>SLIM</code>。
* * ：玩家拥有的所有披风信息。
* ** ：一个披风。
* *** ：披风的UUID。
* *** ：披风的使用状态。
* *** ：披风的URL。
* *** ：披风的别名。
</div>

# = 获取玩家属性 =
; GET请求
<code>/player/attributes</code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的能力。
* ** ：玩家接受聊天信息的能力。
* *** ：为真时玩家可以接受聊天信息，为假时不能。
* ** ：玩家加入多人服务器的能力。
* *** ：为真时玩家可以加入多人服务器，为假时不能。
* ** ：玩家加入Realms的能力。
* *** ：为真时玩家可以加入Realms，为假时不能。
* ** ：玩家发送遥测数据的能力。
* *** ：为真时玩家可以发送遥测数据。
* ** ：玩家发送可选遥测数据的能力。
* *** ：为真时玩家可以发送可选遥测数据。
* * ：玩家Realms聊天过滤选项。
* ** ：是否开启Realms聊天过滤。
* * ：玩家封禁状态。
* ** ：玩家封禁的范围。
* *** ：玩家的封禁范围对象。如果玩家未被封禁，则不存在这些对象。目前只有<code>MULTIPLAYER</code>项。
* **** ：封禁的UUID。
* **** ：封禁到期时间。如果玩家被永久封禁，这一项不存在。
* **** ：封禁原因。
* **** ：封禁消息。
</div>

# = 启用/禁用Realms聊天过滤 =
; 负载
<div class="treeview">
*  根标签
* * ：玩家Realms聊天过滤选项。
* ** ：是否开启Realms聊天过滤。
</div>

; POST请求
<code>/player/attributes</code>

; 响应
与获取玩家属性的响应相同。

# = 获取屏蔽玩家列表 =
; GET请求
<code>/privacy/blocklist</code>

; 响应
<div class="treeview">
*  根标签
* * ：被屏蔽的玩家列表。这些玩家的聊天信息和Realms邀请将不可见。
* ** ：被屏蔽玩家的UUID。
</div>

# = 获得签名密钥对 =
; POST请求
<code>/player/certificates</code>

; 响应
<div class="treeview">
*  根标签
* * ：签名使用的密钥对。
* ** ：私钥。以开头并以结束。
* ** ：公钥。以开头并以结束。
* * ：在刚加入签名时使用的公钥签名。目前最新版本已经不再使用此签名，而是V2版本的签名。
* * ：公钥签名。
* * ：密钥对到期时间。
* * ：密钥对刷新时间。
</div>

# = 获取玩家名称信息 =
; GET请求
<code>/minecraft/profile/namechange</code>

; 响应
<div class="treeview">
*  根标签
* * ：最近一次的名称修改时间。
* * ：玩家配置创建的时间。
* * ：是否允许修改名称。
</div>

# = 检查礼品卡是否有效 =
; GET请求
<code>/productvoucher/giftcode</code>

; 响应
如果礼品卡有效，服务器会返回HTTP状态码200或者204。如果礼品卡无效，服务器将会返回HTTP状态码404。

# = 检查名称可用性 =
; GET请求
<code>-{}-/minecraft/profile/name/<*要检查的名称*>/available</code>

; 响应
<div class="treeview">
*  根标签
* * ：名称的状态。如果是<code>DUPLICATE</code>代表名称已被占用，如果是<code>AVAILABLE</code>代表名称可用，如果是<code>NOT_ALLOWED</code>代表名称不符合要求。
</div>

# = 修改名称 =
; 输入
修改的名称。

; PUT请求
<code>-{}-/minecraft/profile/name/<*修改的名称*></code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的UUID。
* * ：修改之后的玩家名称。
* * ：玩家拥有的所有皮肤信息。
* ** ：一个皮肤。
* *** ：皮肤的UUID。
* *** ：皮肤的使用状态。
* *** ：皮肤的URL。
* *** ：皮肤类型。如果是Steve模型的皮肤这一项是<code>CLASSIC</code>，如果是Alex模型的皮肤这一项是<code>SLIM</code>。
* * ：玩家拥有的所有披风信息。
* ** ：一个披风。
* *** ：披风的UUID。
* *** ：披风的使用状态。
* *** ：披风的URL。
* *** ：披风的别名。
</div>

; 错误信息

# = 更换皮肤 =
; 负载
<div class="treeview">
*  根标签
* * ：皮肤模型。如果是Steve模型要使用<code>classic</code>，如果是Alex模型要使用<code>slim</code>。
* * ：皮肤的URL。
</div>

; POST请求
<code>/minecraft/profile/skins</code>

; 响应
如果更换成功，服务器将返回空负载。

# = 上传皮肤 =
; 负载
负载由两部分组成。

* ：皮肤模型。如果是Steve模型要使用<code>classic</code>，如果是Alex模型要使用<code>slim</code>。
* ：图片数据。在上传之后会将玩家的皮肤设置为新上传的这个皮肤。

; POST请求
<code>/minecraft/profile/skins</code>

; 举例
<syntaxhighlight lang="bash">
curl -X POST -H "Authorization: Bearer <access token>" -F variant=classic -F file="@steeevee.png;type=image/png" https://api.minecraftservices.com/minecraft/profile/skins
</syntaxhighlight>

; 响应
如果上传成功，服务器将返回空负载。

# = 重置皮肤 =
; 输入
玩家的UUID。

; DELETE请求
<code>/minecraft/profile/skins/active</code>

; 响应
如果操作成功，服务器将返回HTTP状态码200。

# = 隐藏披风 =
; DELETE请求
<code>/minecraft/profile/capes/active</code>

; 响应
如果操作成功，服务器将返回空负载。

# = 显示披风 =
; 负载
<div class="treeview">
*  根标签
* * ：要显示的披风的UUID。
</div>

; PUT请求
<code>/minecraft/profile/capes/active</code>

; 响应
<div class="treeview">
*  根标签
* * ：玩家的UUID。
* * ：玩家名称。
* * ：玩家拥有的所有皮肤信息。
* ** ：一个皮肤。
* *** ：皮肤的UUID。
* *** ：皮肤的使用状态。
* *** ：皮肤的URL。
* *** ：皮肤类型。如果是Steve模型的皮肤这一项是<code>CLASSIC</code>，如果是Alex模型的皮肤这一项是<code>SLIM</code>。
* * ：玩家拥有的所有披风信息。
* ** ：一个披风。
* *** ：披风的UUID。
* *** ：披风的使用状态。
* *** ：披风的URL。
* *** ：披风的别名。
</div>

; 错误信息

# 账户迁移操作
和玩家配置操作的要求一样，请求头要包含<code>Authorization</code>，且值为<samp>Bearer <*有效的Minecraft访问令牌*></samp>。如果请求头不包含访问令牌信息或者访问令牌无效，服务器将返回HTTP状态码401。

# = 验证安全的登录位置 =
; GET请求
<code><nowiki>https://api.mojang.com/user/security/location</nowiki></code>

; 响应
如果是一个安全的位置，服务器将返回HTTP状态码204。

; 错误信息

# = 获取安全验证问题 =
; GET请求
<code><nowiki>https://api.mojang.com/user/security/challenges</nowiki></code>

; 响应
<div class="treeview">
*  根标签，内部有3个安全验证问题对象。
* * ：答案信息。
* ** ：答案的ID。发送安全验证问题答案的时候需要附带此ID。
* * ：问题信息。
* ** ：问题的ID。
* ** ：问题的描述。问题ID和问题描述一一对应。
</div>

# = 发送安全验证问题答案 =
; 负载
<div class="treeview">
*  根标签，内部有3个安全验证问题答案对象。
* * ：答案的ID，与获取问题中的ID一致。
* * ：问题的答案。
</div>

; POST请求
<code><nowiki>https://api.mojang.com/user/security/challenges</nowiki></code>

; 响应
如果安全问题答案全部正确，服务器将返回HTTP状态码204。

; 错误信息

# = 获取账户迁移状态 =
; GET请求
<code><nowiki>https://api.minecraftservices.com/rollout/v1/msamigration</nowiki></code>

; 响应
<div class="treeview">
*  根标签
* * ：查询的功能。固定值<code>msamigration</code>。
* * ：是否可以进行账户迁移。
</div>

# = 获得账户迁移的一次性密码 =
; POST请求
<code><nowiki>https://api.minecraftservices.com/twofactorauth/migration/otp</nowiki></code>

; 响应
如果账户可以进行迁移，服务器会返回HTTP状态码201并返回下面的JSON对象：

<div class="treeview">
*  根标签
* * ：用于账户迁移的一次性ID，稍后用于验证发到账户电子邮箱的一次性密码。
</div>

# = 验证账户迁移的一次性密码 =
; 输入
在获取一次性密码时的一次性ID。

; 负载
<div class="treeview">
*  根标签
* * ：发送到账户电子邮箱的一次性密码。
</div>

; POST请求
<code><nowiki>https://api.minecraftservices.com/twofactorauth/migration/otp/</nowiki><*otpId*>/verify</code>

; 响应
如果验证成功，服务器将返回HTTP状态码204。

# = 提交账户迁移数据 =
; 负载
<div class="treeview">
*  根标签
* * ：账户迁移的目标电子邮箱。
</div>

; POST请求
<code><nowiki>https://api.minecraftservices.com/migration/token</nowiki></code>

; 响应
如果成功，服务器返回HTTP状态码200。

# 服务器操作
# = 获取屏蔽服务器信息 =
; GET请求
<code><nowiki>https://sessionserver.mojang.com/blockedservers</nowiki></code>

; 响应
服务器将返回一个文本，每一行都是被屏蔽的服务器的哈希码。

# = 客户端登录验证 =
; 负载
<div class="treeview">
*  根标签
* * ：有效的Minecraft访问令牌。
* * ：不带有连字符的玩家UUID。
* * ：服务器的ID。
</div>

其中服务器的ID由下方算法计算而成：

<syntaxhighlight lang="java">
public static String generateServerId(String baseServerId,   // 服务器的基础ID，通常为空字符串""
                                      PublicKey publicKey,   // 服务器的RSA公钥
                                      SecretKey secretKey    // 服务器与客户端之间使用的对称加密AES密钥
                                     ) throws Exception {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
    messageDigest.update(baseServerId.getBytes("ISO_8859_1"));
    messageDigest.update(secretKey.getEncoded());
    messageDigest.update(publicKey.getEncoded());
    byte[] digestData = messageDigest.digest();
    return new BigInteger(digestData).toString(16);
}
</syntaxhighlight>

; POST请求
<code><nowiki>https://sessionserver.mojang.com/session/minecraft/join</nowiki></code>

; 响应
如果验证成功，服务器返回HTTP状态码204。

# = 服务器登录验证 =
; 输入
不区分大小写的玩家名称、由上方算法得出的服务器ID和客户端IP（可选）。

; GET请求
<code>-{}-<nowiki>https://sessionserver.mojang.com/session/minecraft/hasJoined?</nowiki>username=<*玩家名称*>&serverId=<*服务器ID*>&ip=<*客户端IP*></code>

; 响应
如果验证成功，服务器将返回和上方获取玩家的皮肤和披风一样的负载。

# 历史

|
|
||获取销量统计数据的API被移除。在此之前，此API为<code><nowiki>https://api.mojang.com/orders/statistics</nowiki></code>。}}
|
}}

# 导航

[de:Mojang API](de:Mojang API.md)
[en:Mojang API](en:Mojang API.md)
[lzh:魔贊卯口](lzh:魔贊卯口.md)