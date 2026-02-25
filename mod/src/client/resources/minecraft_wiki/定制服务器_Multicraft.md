# 定制服务器/Multicraft

*页面ID: 16081* | *来源: Minecraft Wiki*

| programming language = Python, PHP
| version = b1.4.0
| date = 2011-10-20
| size = 20MB
| license = 多种
| source available = 前端
| nether support = 是
| minecraft version = 所有
| website = http://www.multicraft.org
| forum = http://www.minecraftforum.net/viewtopic.php?f=10&t=112935
}}
[左|32px](File:Multicraft.png.md)
* *Multicraft** 是一个允许用户在一个基于 web 的用户界面上管理多个服务器的 Minecraft 服务器控制面板。这些服务器可以运行在多个物理或虚拟机器上。

Multicraft 的 [Facebook](http://www.facebook.com/multicraft)、 [Twitter](http://twitter.com/multicraftcp)和 [YouTube](http://www.youtube.com/multicraftcp)。

# 功能
* 从一个地方管理多个服务器
* 独立的 Minecraft 更新
* 适合大规模部署
* Ajax 动态日志/聊天/玩家界面
* 支持 Mod
* 可用 API
* 计费集成可用（如 *WHMCS* 和 *BoxBilling*）
* 支持 Vanilla 和 Bukkit

# 版本
# = 免费版 =
这是基础版的Muticraft，玩家可以在一个机器上管理一个Minecraft[服务器](服务器.md)，包含指出此服务器由Multicraft运行的文本广告。

# = 拥有版 =
这个版本允许在1台机器上拥有2个 Minecraft 服务器实例。

# = 动态版 =
这个许可证允许管理任何数量的 Minecraft 服务器，每个月都会有折扣价，取决于服务器数量。服务器运行的机器数量不对价格造成影响。

# 安全漏洞
<!--
Before you add/remove to this section, consider the following
 - Has this security issue been fixed in later versions? Maybe you'd like to look over all the issues and check.
 - If updating and a user is still affected than it is STILL a security issue.
 - Validate that it IS still a security issue BEFORE adding the issue
 - Validate that it ISN'T still a security issue BEFORE removing the issue
-->

Multicraft 拥有多个已知的安全漏洞，<ref>http://www.multicraft.org/site/page?view=security</ref>，当安全建议不遵循正确的规则时可能会导致问题。这些漏洞[已经列出在他们的网站上](http://www.multicraft.org/site/page?view=security)。

下列是已知的安全漏洞，并且需要用户手动修复：
* 被 "protected"（保护）的目录未被保护：被一位恶意用户使用未被披露的漏洞（不仅仅是在 Multicraft，例如还有 Apache）读写这个目录里的内容。
* API 访问被滥用：如果一位恶意用户获得了 API 的详细信息，API 可能被滥用，因此如果没有必要，它应该是关闭的。
* 拥有无限制超级用户权限：一位恶意用户通过你的控制面板获得无限制超级用户权限。
* 拥有 Multicrafts 保护进程的公共权限：这是一个很大的安全问题，允许强行攻击。
* 面板数据库与保护进程不分离：如果一起工作，一旦保护进程被恶意用户入侵，那么整个 Multicraft 网络将会岌岌可危。
* 不在多用户模式中运行保护进程：没有多用户模式，用户和服务端并不是分离的，那么插件可能“黑”进服务器里进行恶意破坏。
* Multicraft 不会自动加密备份数据：备份数据未被加密，服务器上的插件可通过一个公共数据读取端口读取它们。
* Java 安全管理器未被自动配置：Java 安全管理器未被正确配置，这需要令人沮丧的巨大安装。

# 其他服务
其他服务也通过 Multicraft 提供，<ref>http://www.multicraft.org/site/page?view=services</ref>这些通常需要支付费用的。

# = BoxBilling Module =
购买 The BoxBilling Module 需要 €4.99 （~$6.75 美金）。可“实现自动管理你的服务器和 Multicraft 上的用户安装的功能”。[这里](http://www.multicraft.org/site/page?view=boxbilling)是完整文档。

# = WHMCS Module =
购买 The WHMCS Module 需要 €4.99 (~美金 $6.75)。可“实现自动管理你的服务器和 Multicraft 上的用户安装的功能”。这个安装比 BoxBilling 的安装时间还要多一点点。<ref>http://www.multicraft.org/site/page?view=whmcs</ref>[这里](http://www.multicraft.org/site/page?view=whmcs)是完整文档。

# = 自定义 =
Multicraft 向自定义服务器提供他们的控制面板。

“Multicraft 可以被在任何数量的途径的应用程序中被自定义，想要你的 Multicraft 用户变成你的社区用户？想要在你的网站上拥有完整的 Multicraft 功能？所有的事情都可以完成，留下你的留言和详细信息来联系我们。”<ref>http://www.multicraft.org/site/page?view=services</ref>

# = Linux 安装 =
Multicraft 提供了控制面板的安装程序。

包括：
* 控制面板 × 1
* 保护线程 × 1
* 只能在一台机器上运行。

这将花费 €49.90 （$67.48 美元）。没有任何的文档提供（或需要），除了 Multicraft 文档。
# 使用 Multicraft 的托管提供商
这里是托管提供商在他们的服务器上运行 Multicraft 的名单。如果在该名单上找不到你公司的名字，请添加。

* [3GSN Hosting](https://3gsnhosting.com/)
* [Akliz Minecraft Servers](http://akliz.net/minecraft)
* [Apex Minecraft Hosting](http://www.apexminecrafthosting.com)
* [ASCIIDiGital](http://asciidigital.com/minecraft.php)
* [Astral Game Servers](http://astralgameservers.com/)
* [Avante Hosting](http://avantehosting.net/)
* [Beastnode](http://beastnode.com/)
* [Blacksun Hosting](http://blacksun.ca/)
* [Blockhost](http://blockhost.de/)
* [Closting Innovations](http://clostinginnovations.com/)
* [CloudBoo Minecraft Hosting](http://cloudboo.org/)
* [CloudFrost Hosting](http://cloudfrosthosting.com/)
* [CookieHosting](http://cookiehosting.net/)
* [CraftBuy](http://craftbuy.ru/)
* [Craftdot](http://www.craftdot.net/)
* [CraftServe](http://craftserve.pl/)
* [Creativity Host](http://mc.cr-sa.net/)
* [CubedHost](https://cubedhost.com/)
* [Daddycheese Hosting](http://daddycheese.com/)
* [DediZones Hosting](http://dedishops.com/)
* [DeluxeMcHost](http://deluxemchost.com/)
* [DotVPS](http://dotvps.net/)
* [DutchHosts](http://dutchhosts.nl/)
* [Ease Host](http://ease-host.com/)
* [EdgeVPS](http://edgevps.net/)
* [EmberCore](http://embercore.com/)
* [Exodus Hosting](http://exodushosting.net/)
* [GameRealm Hosting](http://gamerealm.net/)
* [GamingServers](http://gamingservers.us/)
* [GGServers](https://ggservers.net/)
* [Hoopla Hosting](http://hooplahosting.com/)
* [Host Altitude](http://hostaltitude.com/)
* [Hosthorde](http://hosthorde.com/)
* [Hypanova](http://hypanova.com/)
* [MC Pro Hosting](http://mcprohosting.com/)
* [McServ](http://mcserv.ru/)
* [MinecraftEdge](http://minecraftedge.com/)
* [MinecraftLayer](http://minecraftlayer.com/)
* [MineHoster](http://minehoster.co.uk/)
* [Minecraft Node Hosting](http://minecraft-node.com/)
* [Minecraft PR Servers](http://minecraft.com.pt/)
* [Minecraft4u](http://minecraft4u.com/)
* [Minecraft Node](http://minecraftnode.net/)
* [Minecraft Heros](http://minecraft-heros.com/)
* [Minecraft Server](http://minecraftserver.net/)
* [MinecraftTS](http://minecraftts.com/)
* [Morin Hosting](http://morinhosting.com/)
* [Mossycobble Minecraft Hosting](http://mossycobble.com/)
* [MyMCServ](http://mymcserv.com/)
* [Nettor IT Solutions](http://nettor.se/)
* [NoLimit-Host.eu](http://webinterface.nolimit-host.eu/)
* [NRT Servers](http://nrtservers.com/)
* [OciusHost](http://ociushost.com/)
* [Orange Lemon](http://orangelemon.nl/)
* [Orca Host](http://orca-host.com/)
* [Peak Hosting](http://peak-hosting.com/)
* [Red Ranger Hosting](http://redrangerhosting.com/)
* [Redstone Hosting](http://redstonehosting.net/)
* [Reptile Hosting](http://reptilehosting.com/)
* [RWD](http://beuteugeu.com/)
* [Rox Heberg](http://rox-heberg.com/)
* [Shadyshosting](http://shadyshosting.com/)
* [Shockbyte](http://shockbyte.com/)
* [Squirrel Servers](http://squirrelservers.com/)
* [StandOut Host](http://standouthost.com/)
* [SwiftMCHosting](http://swiftmchosting.com/)
* [Tactical Gameservers](http://tactical-gameservers.com/)
* [TheWebGamer](http://thewebgamer.net/)
* [ThunderCloud games](http://thundercloudgames.com)
* [UltiMiner](http://ultiminer.com/)
* [VenomServers](http://venomservers.net/)
* [Void Hosting](http://voidhosting.co.uk/)
* [Voodoo Servers](http://voodooservers.com/)
* [Xhost](http://xhost.ch/)
* [XtremeServerHost](http://minecraft.xtremeserverhost.com/)
* [ZadeHosting](http://zadehosting.net/)
* [ZestyCraft Hosting](http://hosting.zestycraft.com/)

# 参考
<references/>

[Category:自定义软件](Category:自定义软件.md)