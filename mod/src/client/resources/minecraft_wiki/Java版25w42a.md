# Java版25w42a

*页面ID: 168760* | *来源: Minecraft Wiki*

<onlyinclude>

* *25w42a**是[Java版1.21.11](Java版1.21.11.md)的第2个快照，发布于2025年10月14日<ref></ref>，加入了[环境属性](环境属性.md)，并修复了一些漏洞。

# 新内容
# = 生物 =
* *[鹦鹉螺](鹦鹉螺.md)**
* 加入了新的音效：<code>entity.nautilus.riding</code>。

# = 常规 =
* *[服务端管理协议](服务端管理协议.md)**
* 可启用来自Web浏览器的身份验证。
* * 启用WebSocket连接时，通过在Sec-WebSocket-Protocol标头中传递令牌以进行身份验证。
* ** 示例：<code>-{}-Sec-WebSocket-Protocol: minecraft-v1, <认证令牌></code>
* * 以此方式进行的身份验证需要接受Origin标头检查，需要在服务端设置<code>management-server-allowed-origins</code>指定有效的Origin。此服务端属性默认为空，即Sec-Websocket-Protocol被默认禁用。

* *[环境属性](环境属性.md)**
* 依靠数据驱动来控制各种视觉和游戏玩法的系统。
* 每个环境属性控制特定的视觉效果或游戏玩法。
* 此系统相当实验性，未来可能会随时改动。
* 环境属性源目前有两个：维度和生物群系。
* * 游戏实际使用的环境属性是每个环境属性源的组合。
* * 例如，主世界维度提供<code>sky_color = #00ff00</code>（绿色），平原生物群系提供<code>sky_color = #ff0000</code>（红色），则玩家在平原时天空颜色为红色，在其他主世界生物群系时为绿色。
* * 环境属性源提供环境属性时，它们可以：
* ** 覆盖旧值。
* ** 通过修饰符修改旧值。
* 修饰符
* * 当环境属性源不覆盖旧值时，将应用修饰符。
* * 例如，主世界维度提供<code>water_fog_radius = 96.0</code>，平原生物群系使用0.85的乘法修饰修改<code>water_fog_radius</code>，则玩家在平原时<code>water_fog_radius</code>将解析为81.6，而在其他主世界生物群系时将解析为96.0。
* 插值
* * 修饰符描述了后应用的环境属性如何修改先应用的环境属性，而插值描述了不同环境属性源之间的组合。游戏会在应用新修饰符时应用插值。
* * 只有某些环境属性支持插值，这允许在两个值之间过渡，例如在生物群系之间移动时。
* * 生物群系：
* ** 例如：平原提供<code>sky_color = #ff0000</code>（红色），沙漠提供<code>sky_color = #ffff00</code>（黄色），而<code>sky_color</code>支持根据位置平滑过渡，因此当玩家从平原移动到沙漠时，天空颜色将逐渐从红色变为黄色。而一些属性，例如<code>water_evaporates</code>，只支持离散值，不能设置插值，仅取决于玩家所处的生物群系。
* ** 生物群系过渡取决于摄像机8格半径内的生物群系，占据该区域更多的生物群系会对最终插值产生更大的影响。
* 环境属性映射
* * 维度类型和生物群系支持新字段，以定义环境属性。
* * 此映射允许采用环境属性ID - 值的格式，例如：<syntaxhighlight lang="json">
  "attributes": {
    "minecraft:visual/fog_color": "#ffaa00",
    "minecraft:gameplay/water_evaporates": true
  }</syntaxhighlight>
* * 游戏会自动默认这种修饰符是覆盖修饰符。
* * 如果采用对象格式，则支持不同的修饰符：
* ** <code>modifier</code>：可选的修饰符ID，取决于属性类型。默认为<code>override</code>。
* ** <code>argument</code>：修饰符参数，取决于所选修饰符。
* * 例如，下列格式将会使用值为0.85的乘法修饰符操作<code>water_fog_radius</code>：<syntaxhighlight lang="json">
  "attributes": {
    "minecraft:visual/water_fog_radius": {
      "modifier": "multiply",
      "argument": 0.85
    }
  }
</syntaxhighlight>
* 常见数据类型
* * RGB颜色，格式允许：
* ** 一个RGB颜色字符串，格式为<code>#rrggbb</code>。
* ** 三个浮点数组成的数组，取值0至1之间，格式为<code>[r, g ,b]</code>。
* ** RGB整数。
* * ARGB颜色，格式允许：
* ** 一个ARGB颜色字符串，格式为<code>#aarrggbb</code>。
* ** 四个浮点数组成的数组，取值0至1之间，格式为<code>[a, r, g ,b]</code>。
* ** ARGB整数。
* * 粒子。示例：<syntaxhighlight lang="json">
  {
    "type": "minecraft:block_crumble",
    "block_state": {
      "Name": "minecraft:dirt"
    }
  }
</syntaxhighlight>
* 普通修饰符
* * 每个环境属性都有一个特定的值类型，它描述了如何定义值，以及可应用哪些修饰符及是否可插值。有些属性功能专用，有些则在不同属性中重用。
* * 布尔修饰符
* ** 参数格式：布尔值
* ** 可用修饰符：
* *** <code>override</code>
* *** <code>and</code>
* *** <code>nand</code>
* *** <code>or</code>
* *** <code>nor</code>
* *** <code>xor</code>
* *** <code>xnor</code>
* * 浮点修饰符
* ** 参数格式：浮点数
* ** 可用修饰符：
* *** <code>override</code>
* *** <code>add</code>
* *** <code>subtract</code>
* *** <code>multiply</code>
* *** <code>minimum</code>
* *** <code>maximum</code>
* * 颜色修饰符
* ** 参数格式：RGB颜色，不包括<code>alpha_blend</code>
* ** 可用修饰符：
* *** <code>override</code>
* *** <code>add</code> - 按组件的加法混合
* *** <code>subtract</code> - 按组件的减法混合
* *** <code>alpha_blend</code> - 在图像编辑软件中可能出现的alpha混合。
* **** 参数格式：ARGB颜色。
* **** alpha为1时，表现为不混合的覆盖。
* 新环境属性
* * <code>minecraft:visual/fog_color</code>：雾的颜色，仅在摄像机没有浸入某些物质时有效。注意：雾的颜色也会受到一天中的时间、天气和药水效果影响。
* ** 值类型：RGB颜色。
* ** 默认值：<code>#000000</code>。
* ** 修饰符：颜色修饰符。
* ** 可插值：是。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:visual/extra_fog</code>：是否使用浓雾，例如下界的雾，仅在摄像机没有浸入某些物质时有效。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在摄像机的位置解析。
* * <code>minecraft:visual/water_fog_color</code>：水下迷雾的颜色。注意：雾的颜色也会受到一天中的时间、天气和药水效果影响。
* ** 值类型：RGB颜色。
* ** 默认值：<code>#050533</code>。
* ** 修饰符：颜色修饰符。
* ** 可插值：是。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:visual/water_fog_radius</code>：水下迷雾的最大距离，以方块为单位。注意：最终值会随着玩家在水下的时间更改。
* ** 值类型：非负浮点数。
* ** 默认值：96.0。
* ** 修饰符：浮点修饰符。
* ** 可插值：是。
* ** 在摄像机的位置解析。
* ** 替代了生物群系标签<code>#has_closer_water_fog</code>。
* * <code>minecraft:visual/sky_color</code>：天空颜色，仅在主世界可见。注意：最终值会受到一天中的时间和天气影响。
* ** 值类型：RGB颜色。
* ** 默认值：<code>#000000</code>。
* ** 修饰符：颜色修饰符。
* ** 可插值：是。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:visual/cloud_opacity</code>：云层不透明度，设置为0时将完全禁用云，且快乐恶魂不再在云层高度恢复生命。
* ** 值类型：浮点数，0至1之间。
* ** 默认值：0.0。
* ** 修饰符：浮点修饰符。
* ** 可插值：是。
* ** 在摄像机的位置或在快乐恶魂恢复生命的位置渲染。
* * <code>minecraft:visual/cloud_height</code>：云层高度。
* ** 值类型：浮点数。
* ** 默认值：192.33。
* ** 修饰符：浮点修饰符。
* ** 可插值：是。
* ** 在摄像机的位置或在快乐恶魂恢复生命的位置渲染。
* ** 替代了维度类型属性。
* * <code>minecraft:visual/default_dripstone_particle</code>：滴水石锥在上方没有液体时滴落的粒子。
* ** 值类型：粒子。
* ** 默认值：<code>{type："minecraft：dripping_dripstone_water"}</code>。
* ** 修饰符：<code>override</code>。
* ** 可插值：否。
* ** 在滴水石锥的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:visual/ambient_particles</code>：在摄像机周围生成的随机粒子。
* ** 值类型：一个对象的列表。此对象的格式为：
* *** <code>particle</code>：粒子。
* *** <code>probability</code>：粒子生成的概率。
* ** 默认值：<code>[]</code>。
* ** 修饰符：<code>override</code>。
* ** 可插值：否。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:audio/background_music</code>：控制背景音乐的播放方式和背景音乐。
* ** 值类型：一个对象，包含3个可选的名称-对象映射。
* *** 可用名称如下：
* **** <code>default</code>：默认音乐，格式如下：
* ***** <code>music</code>：要播放的声音事件。
* ***** <code>min_delay</code>：两次播放音乐之间的最小间隔。
* ***** <code>max_delay</code>：两次播放音乐之间的最大间隔。
* ***** <code>replace_current_music</code>：是否立刻替换当前播放的音乐。
* ***** 如果未定义，则不会播放音乐。
* **** <code>underwater</code>：如果存在且玩家在水下，则覆盖默认音乐。格式与<code>default</code>相同。
* **** <code>creative</code>：如果存在且玩家处于创造模式，则覆盖默认音乐。格式与<code>default</code>相同。
* ** 默认值：<code>{}</code>。
* ** 修饰符：<code>override</code>。
* ** 可插值：否。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:audio/music_volume</code>：背景音乐的音量，任何音乐的音量都将逐渐到达此值。
* ** 值类型：浮点数，0至1之间。
* ** 默认值：1.0，
* ** 修饰符：浮点修饰符。
* ** 可插值：否。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性。
* * <code>minecraft:audio/ambient_sounds</code>：控制摄像机周围的环境音乐。
* ** 值类型：一个对象，包含3个名称 - 对象映射。
* *** <code>loop</code>：可选的声音事件，要循环播放的声音。
* *** <code>mood</code>：根据周围的黑暗随机播放声音。
* **** <code>sound</code>：要播放的声音事件。
* **** <code>tick_delay</code>：氛围音效的间隔，假设光照等级为0。
* **** <code>block_search_extent</code>：采样光照的半径。
* **** <code>offset</code>：应用于播放声音的距离偏移。
* *** <code>additions</code>：一个列表，表示附加音效。列表内的每个对象的格式如下：
* **** <code>sound</code>：要播放的声音事件。
* **** <code>tick_chance</code>：播放声音的概率，取值为0至1。
* ** 默认值：<code>{}</code>。
* ** 修饰符：<code>override</code>。
* ** 可插值：否。
* ** 在摄像机的位置解析。
* ** 替代了生物群系属性、和。
* * <code>minecraft:gameplay/can_start_raid</code>：如果为<code>false</code>，则带有不祥之兆的玩家无法触发袭击。
* ** 值类型：布尔值。
* ** 默认值：<code>true</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在袭击将要开始的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/water_evaporates</code>：如果为<code>true</code>，则水桶不能放置水，融化的冰不能放置水，湿海绵在放置时变干，滴水石锥不会将泥巴转化。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在对应的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/bed_rule</code>：控制床是否能用来睡觉，以及床是否能用来设置出生点。
* ** 值类型：一个对象。
* *** <code>can_sleep</code>：取值见下。
* **** <code>always</code>：床总是可以睡觉，假定床没有被阻挡且附近没有怪物。
* **** <code>when_dark</code>：床只在全局天空光照小于4时才可以睡觉。
* **** <code>never</code>：床永远不可以睡觉。
* *** <code>can_set_spawn</code>：取值及意义与<code>can_sleep</code>相似。
* *** <code>explodes</code>：床是否会爆炸，默认为<code>false</code>。
* *** <code>error_message</code>：文本组件，显示玩家无法睡眠或设置重生点的消息。
* ** 默认值：<code>{type: "can_sleep_when_dark", error_message: {translate: "block.minecraft.bed.no_sleep"}}</code>。
* ** 修饰符：<code>override</code>。
* ** 可插值：否。
* ** 在床头位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/respawn_anchor_works</code>：控制是否能使用重生锚，如果不能使用则会爆炸。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在重生锚的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/nether_portal_spawns_piglin</code>：控制下界传送门方块是否可生成僵尸猪灵。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在下界传送门方块的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/fast_lava</code>：控制熔岩是否流动得更快、更远，对实体具有更大的推动力。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在整个维度内进行解析，单个生物群系位置无效。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/increased_fire_burnout</code>：控制火是否燃烧得更快。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在火的位置解析。
* ** 替代了生物群系标签<code>#increased_fire_burnout</code>。
* * <code>minecraft:gameplay/piglins_zombify</code>：控制猪灵和疣猪兽是否僵尸化。
* ** 值类型：布尔值。
* ** 默认值：<code>true</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在对应实体的位置解析。
* ** 替代了维度类型属性。
* * <code>minecraft:gameplay/snow_golem_melts</code>：控制雪傀儡是否受伤。
* ** 值类型：布尔值。
* ** 默认值：<code>false</code>。
* ** 修饰符：布尔修饰符。
* ** 可插值：否。
* ** 在雪傀儡的位置解析。
* ** 替代了生物群系标签<code>#snow_golem_melts</code>。

# 更改
# = 生物 =
* *[僵尸马](僵尸马.md)**
* 现在没有被骑乘时可以被[拴绳](拴绳.md)拴住。
* 不再会在和平难度下消失。

* *[骷髅马](骷髅马.md)**
* 回退了上个版本的更改。

* *[鹦鹉螺](鹦鹉螺.md)和[僵尸鹦鹉螺](僵尸鹦鹉螺.md)**
* 现在在陆地上时能够控制了。

# = 游戏内容 =
* *[魔咒](魔咒.md)**
* 现在[突进](突进.md)魔咒不再与[经验修补](经验修补.md)冲突。

* *[进度](进度.md)**
* “[](进度#advancements-anchor-nether.distract_piglin.md)”现在也可以通过丢出[金鹦鹉螺铠](金鹦鹉螺铠.md)获取。

* *[迷雾](迷雾.md)**
* 现在水下的生物群系迷雾的颜色和距离会根据玩家的位置相应混合，以与通常情况下的生物群系迷雾和天空颜色保持一致。

# = 命令格式 =
* ***
* 调换了<code><id></code>参数的顺序，现在是<code>/stopwatch create foo:bar</code>而不是<code>/stopwatch foo:bar create</code>。
* 现在<code>query</code>子命令接受参数<code>scale</code>。
* * 返回值将按此值缩放并取整。
* * 此参数可选，默认为1。
* * 示例：<code>stopwatch query foo:bar 20</code>将回傳以刻为单位的经过时间。

* *其他更改**
* 命令建议现在会建议所有的命名空间，而不只是建议<code>minecraft</code>命名空间。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。

* *[维度类型](维度类型.md)**
* 加入了<code>attributes</code>字段，以指定环境属性。
* 下列字段的作用已移动到环境属性：
* * <code>ultrawarm</code> -> <code>minecraft:gameplay/water_evaporates</code>、<code>minecraft:gameplay/fast_lava</code>、<code>visual/default_dripstone_particle</code>
* * <code>bed_works</code> -> <code>minecraft:gameplay/bed_rule</code>
* * <code>respawn_anchor_works</code> -> <code>minecraft:gameplay/respawn_anchor_works</code>
* * <code>cloud_height</code> -> <code>minecraft:visual/cloud_height</code>
* * <code>piglin_safe</code> -> <code>minecraft:gameplay/piglins_zombify</code>
* * <code>has_raids</code> -> <code>minecraft:gameplay/can_start_raid</code>
* * <code>natural</code>（未移除） -> <code>minecraft:gameplay/nether_portal_spawns_piglin</code>

* *[生物群系定义格式](生物群系定义格式.md)**
* 加入了<code>attributes</code>字段，以指定环境属性。
* 注意：一些环境属性必须依靠维度解析，不能在生物群系中指定。
* <code>effects</code>中下列字段的作用已移动到环境属性：
* * <code>fog_color</code> -> <code>minecraft:visual/fog_color</code>
* * <code>water_fog_color</code> -> <code>minecraft:visual/water_fog_color</code>
* * <code>sky_color</code> -> <code>minecraft:visual/sky_color</code>
* * <code>particle</code> -> <code>minecraft:visual/ambient_particles</code>
* * <code>ambient_sound</code>、<code>mood_sound</code>、<code>additions_sound</code> -> <code>minecraft:audio/ambient_sounds</code>
* * <code>music</code> -> <code>minecraft:audio/background_music</code>
* * <code>music_volume </code> -> <code>minecraft:audio/music_volume</code>

* *[数据组件](数据组件.md)**
* <code>kinetic_weapon</code>：
* * 加入了新字段：<code>contact_cooldown_ticks</code>，表示击中后的冷却时间，在能够再次击中实体之前无法与实体互动，默认为10。

* *[标签](Java版标签.md)**
* 移除了生物群系标签：
* * <code>#snow_golem_melts</code>，被<code>gameplay/snow_golem_melts</code>环境属性代替。
* * <code>#increased_fire_burnout</code>，被<code>gameplay/increased_fire_burnout</code>环境属性代替。
* * <code>#plays_underwater_music </code>，被<code>audio/background_music</code>环境属性中的<code>only_underwater</code>代替。
* * <code>#has_closer_water_fog</code>，被<code>visual/water_fog_radius</code>环境属性代替。
* 向<code>#piglin_loved</code>物品标签中加入了金质鹦鹉螺铠。

# 修复
</onlyinclude>

# 参考

# 导航

[de:25w42a](de:25w42a.md)
[en:Java Edition 25w42a](en:Java Edition 25w42a.md)
[es:Java Edition 25w42a](es:Java Edition 25w42a.md)
[fr:Édition Java 25w42a](fr:Édition Java 25w42a.md)
[ja:Java Edition 25w42a](ja:Java Edition 25w42a.md)
[lzh:二五週四二甲](lzh:二五週四二甲.md)
[pt:Edição Java 25w42a](pt:Edição Java 25w42a.md)
[ru:25w42a (Java Edition)](ru:25w42a (Java Edition).md)