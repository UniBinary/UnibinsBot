# Java版25w35a

*页面ID: 164454* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w35a**是[Java版1.21.9](Java版1.21.9.md)的第6个快照，发布于2025年8月26日<ref></ref>，加入了新的游戏规则和[Minecraft服务器管理协议](Minecraft服务器管理协议.md)，并修复了一些漏洞。

# 新内容
# = 常规 =
* *[文本组件](文本组件.md)**
* 扩充了精灵图组件的行为，现在支持渲染更多精灵图类型。
* * 加入了<code>object</code>字段，用于指定精灵图类型。
* ** 该字段行为与NBT组件类似：若不指定，游戏会自动判断精灵图类型；若指定，则可加快解析速度。
* * <code>atlas</code>类型：
* ** 格式保持不变。
* * <code>player</code>类型（新增）：
* ** 用于渲染玩家的头的正面图像，格式如下：
* *** <code>player</code>：玩家游戏档案数据，与<code>minecraft:profile</code>组件格式一致。
* *** <code>hat</code>：是否渲染“”部分，默认为<code>true</code>。

* *[游戏规则](游戏规则.md)**
* 加入了<code>[pvp](游戏规则/pvp.md)</code>游戏规则，取代了中的<code>pvp</code>选项，以同步。
* * 为<code>false</code>时，[玩家](玩家.md)之间无法相互造成伤害。
* * 默认为<code>true</code>。
* 加入了<code>[allowEnteringNetherUsingPortals](游戏规则/allowEnteringNetherUsingPortals.md)</code>游戏规则，取代了中的<code>allow-nether</code>选项。
* * 为<code>false</code>时，[实体](实体.md)无法通过[下界传送门](下界传送门.md)进入[下界](下界.md)。
* * 默认为<code>true</code>。
* 加入了<code>[enableCommandBlocks](游戏规则/enableCommandBlocks.md)</code>游戏规则，取代了中的<code>enable-command-block</code>选项，以同步。
* * 为<code>false</code>时，无法使用[命令方块](命令方块.md)。
* * 默认为<code>true</code>。
* 加入了<code>[spawnMonsters](游戏规则/spawnMonsters.md)</code>游戏规则，取代了中的<code>spawn-monsters</code>选项。
* * 为<code>false</code>时，[敌对生物](敌对生物.md)无法自然生成。
* * 默认为<code>true</code>。

* *[语言](语言.md)**
* 加入了[哈利奇那语](wzh:加利西亚 (东欧).md)（Halychian）。

* *[选项](选项.md)**
* 在鼠标设置中加入了“”选项，默认为<code>true</code>。

* *[服务器](服务器.md)**
* 加入了[Minecraft服务器管理协议](Minecraft服务器管理协议.md)。
* 为专用服务器添加了基于WebSocket的JSON-RPC服务器管理API。
* API默认处于禁用状态，可在<code>server.properties</code>文件中按以下配置启用：
* * <code>management-server-enabled=true</code>
* * <code>management-server-host=localhost</code>
* * <code>management-server-port=25585</code>
* 启用后，可通过<code>ws://<management-server-host>:<management-server-port></code>该API。
* 支持对服务器状态（包括玩家、白名单、管理员、设置、游戏规则等）进行查询和更新。
* 当状态发生变更时（如玩家加入、游戏规则更新等）会发送通知。
* 调用<code>{"id":1,"method":"rpc.discover"}</code>将返回包含当前运行服务器所支持方法和通知的API模式（schema）。
* [服务端数据生成器](数据生成器.md)会在报告输出文件夹中生成API模式文件（<code>json-rpc-api-schema.json</code>），其内容与<code>rpc.discover</code>方法的返回内容一致。
* 该API遵循[JSON-RPC 2.0规范](https://www.jsonrpc.org/specification)。
* 采用命名空间方法，保留的命名空间为<code>minecraft</code>和<code>notification</code>。
* 可通过自定义命名空间其他方法和事件。
* 核心方法组包含：
* * players（玩家）；
* * allowlist（白名单）；
* * operators（管理员）；
* * server（服务器相关操作，如保存、停止等）；
* * server settings（服务器设置）；
* * game rules（游戏规则）。

* ***
* 加入了新选项：<code>management-server-enabled</code>。
* * 用于控制是否启用Minecraft服务器管理协议。
* * 默认为<code>false</code>。
* 加入了新选项：<code>management-server-port</code>。
* * 用于设置Minecraft服务器管理协议监听的端口号。
* * 默认为<code>25585</code>。
* 加入了新选项：<code>management-server-host</code>。
* * 用于设置Minecraft服务器管理协议监听的主机。
* * 默认为<code>localhost</code>。
* 加入了新选项：<code>status-heartbeat-interval</code>。
* * 控制管理服务器向已连接的客户端发送心跳通知的间隔。
* * 默认为<code>0</code>，表示该功能已禁用。

# 更改
# = 方块 =
* *[铜箱子](铜箱子.md)**
* 更改了大型铜箱子的底部纹理。

* *[铜傀儡像](铜傀儡像.md)**
* 铜傀儡转变为铜傀儡像时，现在只会保存其自定义名称。
* 铜傀儡像的自定义名称现在取决于[数据组件](数据组件.md)<code>custom_name</code>而非<code>entity_data</code>。

* *[悬挂式告示牌](悬挂式告示牌.md)**
* 不再能由[铜链](铜链.md)合成。

* *[铁链](铁链.md)**
* ID由改为。

# = 生物 =
* *[铜傀儡](铜傀儡.md)**
* 将碰撞箱高度改为了0.98格，以同步，使其能够在一格高的空间内进行寻路。
* 生成铜傀儡时产生的[铜箱子](铜箱子.md)现在可以正确连接到附近的铜箱子。
* 渲染于避雷针顶部的[方块物品](方块物品.md)现在位于鞍槽而非头盔槽。
* * 现在其头盔槽的物品模型渲染与人-{}-形生物一致。

# = 命令格式 =
* ***
* 命令返回的结果消息现在额外允许复制玩家头像的文本组件键值对。

# = 常规 =
* ***
* 移除了选项。
* * 它们已被对应的[游戏规则](游戏规则.md)所取代，以允许在服务器运行时进行更改。

* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *用户界面**
* 将新服务器添加到服务器列表时，不再预填充名称；如果留空，则使用默认名称。
* 更多文本输入现在支持通过鼠标拖动选择文本鼠标光标。
* 现在一些UI组件（如文本框、数值滑块、按钮、滚动条）会改变鼠标光标的形状。
* 文本的可点击部分（如链接）会将鼠标光标的形状改为手型光标。

# 修复
”字幕。
|300119|铜傀儡向箱子寻路时有时不会避开危险的方块。
|300124|避雷针所有的氧化状态都列于创造模式物品栏的红石标签页中。
|300129|铜傀儡不能将物品放置于其上方的箱子内。
|300173|铜箱子纹理的某些面上的对角高光方向与大型变种的不匹配。
|300229|铜傀儡像上放置的某些方块会与其天线产生深度冲突。
|300267|刷怪笼和试炼刷怪笼内的微型生物偶尔会被异常地照亮。
|300301|具有32&times;32纹理的展示架会异常地产生高分辨率粒子。
|300304|测量铜傀儡像方块的姿势时，若将其复活，比较器会保持激活。
|300462|被拴绳牵引的铜傀儡仍然尝试寻路到箱子。
|300501|铜箱子的变种不在“红石方块”创造模式物品栏标签页中，但普通箱子在其中。
|300568|铜傀儡若有行走的空间则不会打开箱子。
|300688|铁链的方块/物品ID仍为<code>chain</code>。
|300703|大型铜箱子的底部未使用合并的纹理。
|300744|创造模式物品栏中，铜粒和铁粒的排列不正常。
|300762|铜傀儡需要箱子上方至少有3格能放置任意方块的空间。
|300797|发光效果导致物品栏内部的实体未正常渲染。
|300827|在某些屏幕中，即使提供了建议，按下也不会显示帮助。
|300977|时钟在配方书/村民/合成器UI中工作。
|301023|监守者向玩家施加黑暗状态效果时，聊天界面、物品栏和物品变黑了。
|301025|末地闪光紫色光芒饱和度受亮度值影响。
|301026|玩家受到黑暗状态效果影响时，末地闪光紫色光芒变得极度饱和。
|301048|“坐下”姿势的铜傀儡像的避雷针变得更短。
|301101|铜傀儡头上穿戴的部分类似方块的位置不同。
|301224|箱子上不再渲染方块裂痕的前几个阶段。
|301225|在未创建其他世界前退出创建新的世界屏幕会导致游戏崩溃。
|301226|旗帜上不再渲染方块裂痕。
|301228|生物头颅上不再渲染方块裂痕。
|301230|字符串<code>commands.profile_fetch.id.failure</code>中的“resolve”一词被错拼为“resolved”。
|301231|附魔台上的书动画不是独立的。
|301236|手持的三叉戟上的附魔光效不再可见。
|301242|盾牌上的附魔光效不再可见。
|;prev
|301273|点击用于加入服务器的悬浮按钮现在会选中目标服务器，除非存在已选中的服务器。
|301290|游戏在尝试渲染发光的附魔物品时崩溃。
|301295|TTF字体提供程序的过采样会增大字符宽度。
|301328|发光的物品实体在被拾取时短暂变白。
|301339|刷怪笼内的微型生物在渲染时始终被完全照亮。
}}</onlyinclude>

# 参考

# 导航

[de:25w35a](de:25w35a.md)
[en:Java Edition 25w35a](en:Java Edition 25w35a.md)
[es:Java Edition 25w35a](es:Java Edition 25w35a.md)
[fr:Édition Java 25w35a](fr:Édition Java 25w35a.md)
[ja:Java Edition 25w35a](ja:Java Edition 25w35a.md)
[pt:Edição Java 25w35a](pt:Edição Java 25w35a.md)
[ru:25w35a (Java Edition)](ru:25w35a (Java Edition).md)
[uk:25w35a (Java Edition)](uk:25w35a (Java Edition).md)