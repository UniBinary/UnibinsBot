# Java版1.20.3-pre1

*页面ID: 108371* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.20.3-pre1**是[Java版1.20.3](Java版1.20.3.md)的首个预发布版，发布于2023年11月20日<ref></ref>，更改了服务器资源包的处理机制，并修复了一些漏洞。

# 更改
# = 方块 =
* *[草](草.md)**
* 被重命名为“”（Short Grass）。
* * ID由<code>grass</code>更改为<code>short_grass</code>。

# = 生物 =
* *[旋风人](旋风人.md)**
* 现在能在[船](船.md)上转动身体。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 更改了下载的资源包和世界资源包的处理方法。
* * 更改适用于世界资源包<code>resources.zip</code>、Realms资源包和专用服务器控制的资源包。
* UI下载屏幕已替换为一个消息弹窗。
* 应用世界资源包将会与区块一起加载。
* 现在下载的资源包存储在<code>downloads</code>目录中（文件结构与旧的<code>server-resource-packs</code>不同）。
* * 该目录下的文件不再自动清理（以前只保留10个资源包）。
* * 此外，在该目录中还有一个名为<code>log.json</code>的日志文件，用于存储有关已下载文件的信息，以便于进行调试。
* 现在下载的资源包都有唯一ID（GUID/UUID），可用于区分它们。
* * 专用服务器资源包可以通过<code>server.properties</code>中的<code>resource-pack-id</code>选项进行配置此值。如果缺少该值，将基于URL生成该值。
* * 如果未设置资源包的哈希值，将在每次应用之前重新下载该资源包。以前，如果哈希值缺失，将应用最新下载的资源包版本。
* 为第三方服务器软件添加了一些额外选项：
* * 客户端现在可以接受多个服务器资源包。
* * 添加新数据包以取消应用服务器资源包。
* * 进入配置阶段时不再清理资源包。

# 新内容（实验性）
# = 常规 =
* *[标签](Java版标签.md)**
* 加入了下列实体类型标签：
* * ：。

# 修复
字段在游戏非暂停时更新，而不是暂停时。
|164316|哈希值更改不会自动更新资源包。
|251126|资源包不会在检测到哈希值与之前不同时重新下载。
|;1.20.2的漏洞
|265927|编辑框长度限制会导致出现未配对代理字符。
|265929|在编辑框中使用删除非BMP字符时会多删除一些字符。
|;dev
|266456|旋风人在矿车和船里是被动的。
|266468|旋风人无法在水下攻击。
|266472|闪电苦力怕的电弧和凋灵护甲渲染错误。
|266507|TNT爆炸时生成的方块掉落物数量上限为16。
|266563|无来源实体的末地水晶和TNT矿车爆炸时不造成任何伤害。
|266571|旋风人无法在具有飘浮状态效果时攻击。
|266656|当在单人模式下暂停游戏时，粒子效果、实体和方块实体的变换插值错乱。
|;prev
|266723|禁用实验性数据包时，“”进度仍要求杀死旋风人。
|266724|命令不生效。
|266729|记分板的错误信息中有未格式化的内容。
}}</onlyinclude>

# 参考

# 导航

[de:1.20.3-pre1](de:1.20.3-pre1.md)
[en:Java Edition 1.20.3 Pre-Release 1](en:Java Edition 1.20.3 Pre-Release 1.md)
[es:Java Edition 1.20.3 Pre-Release 1](es:Java Edition 1.20.3 Pre-Release 1.md)
[fr:Édition Java 1.20.3 Pre-Release 1](fr:Édition Java 1.20.3 Pre-Release 1.md)
[ja:Java Edition 1.20.3 Pre-Release 1](ja:Java Edition 1.20.3 Pre-Release 1.md)
[lzh:爪哇版一點二〇點三之預一](lzh:爪哇版一點二〇點三之預一.md)
[pt:Edição Java 1.20.3 Pre-Release 1](pt:Edição Java 1.20.3 Pre-Release 1.md)
[ru:1.20.3 Pre-Release 1 (Java Edition)](ru:1.20.3 Pre-Release 1 (Java Edition).md)
[uk:1.20.3 Pre-Release 1 (Java Edition)](uk:1.20.3 Pre-Release 1 (Java Edition).md)