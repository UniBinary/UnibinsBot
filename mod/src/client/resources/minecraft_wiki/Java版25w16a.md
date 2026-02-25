# Java版25w16a

*页面ID: 149969* | *来源: Minecraft Wiki*

</ref>}}
<onlyinclude>

* *25w16a**是[Java版1.21.6](Java版1.21.6.md)的第2个快照，发布于2025年4月15日<ref></ref>，更改了[拴绳](拴绳.md)的机制，修复了一些漏洞。

# 新内容
# = 常规 =
* *[兴趣点](兴趣点.md)**
* 加入了<code>test_instance</code>兴趣点。

# 更改
# = 方块 =
* *[下界传送门](下界传送门（方块）.md)**
* 回退了1.21.5中对的修复。

# = 物品 =
* *[烟花火箭](烟花火箭.md)**
* 玩家滑翔时，对方块烟花火箭只会为玩家助推，而不是在方块上点燃烟花。

* *[拴绳](拴绳.md)**
* 可牵引长度由10格增长到12格，以判定箱中心距离计算。
* 渲染厚度变为原来的两倍，与效果统一。
* 现在可以连接任意两个生物，而非只能将生物连接到玩家。
* * 玩家牵引生物时对另一生物潜行拴绳会试图将拴绳连接转移到被点击的生物，但如果新连接距离太远，会立刻断裂则不会成功。
* * 拴绳不能连接一个生物与其自身。
* 现在可以对被拴绳拴住的生物[剪刀](剪刀.md)，以剪断拴绳连接。
* * 装有剪刀的[发射器](发射器.md)也会试图剪断面前生物的拴绳连接。
* 被拴绳牵引时，生物会转向被牵引的方向。
* 玩家在牵引其他生物时使用[烟花火箭](烟花火箭.md)推进会破坏拴绳连接。
* 尝试拴上已经被拴住的生物时，除非该生物由其他玩家拴住，否则将会破坏原有连接，并由玩家拴住该生物。
* 玩家与拴绳结的交互变化如下：
* * 时，会先尝试将玩家牵引的生物拴到拴绳结上，如果均不成功，则由玩家牵引其可牵引的所有生物；如拴绳结此后没有拴住任何生物，其将消失。
* * 潜行时，只会试图将玩家牵引的生物拴到拴绳结上。
* * 剪刀或时，所有生物会由玩家牵引。
* 由[快乐恶魂](快乐恶魂.md)牵引的拴绳自由长度为10格，最大牵引长度为16格。
* [船](船.md)、[运输船](运输船.md)、[骆驼](骆驼.md)、[马](马.md)、[骡](骡.md)、[驴](驴.md)和[嗅探兽](嗅探兽.md)在连接到快乐恶魂上时，会用四根绳子连接二者的四角。
* * 如果快乐恶魂佩戴有[挽具](挽具.md)，在如此连接时会额外显示拴绳图层。

# = 游戏内容 =
* *[云](云.md)**
* 现在会一直延伸到地平线。
* 云的颜色不再能由纹理修改。

* *[物品栏](物品栏.md)**
* 按下后生存模式物品栏中不再显示玩家的判定箱。

# = 常规 =
* *[数据包](数据包.md)**
* 将数据包版本号更改为。

* *[物品堆叠组件](物品堆叠组件.md)**
* <code>painting/variant</code>组件不再接受内联变种。

* *[声音事件](Java版声音事件.md)**
* 移除了空事件<code>entity.puffer_fish.ambient</code>。

* *[资源包](资源包.md)**
* 将资源包版本号更改为。
* 方块模型旋转角度不再必须为22.5的倍数。

* *[着色器](着色器.md)与后处理管线**
* 所有核心着色器的Uniform现在都是Uniform块。
* 内置的Uniform现在都是Uniform块，而不是不透明松散的Uniform。
* 后处理管线的Uniform现在使用Uniform块。
* JSON中的Uniform现在按块定义。
* 对后处理管线定义作如下更改：
* * 拓展的映射值以支持新属性。
* ** <code>persistent</code>，默认为<code>false</code>。
* *** 如果为<code>true</code>，则渲染目标将在每帧之间持久化存在。
* *** 调整屏幕大小时渲染目标的内容会被清除。
* ** <code>clear_color</code>，默认为<code>[0, 0, 0, 0]</code>，格式为<code>[R, G, B, A]</code>。
* *** 渲染目标被创建或清除时，将使用此值填充颜色。
* * Uniform现在是每个块的列表，而不是全局列表，且其顺序**必须**与着色器的顺序匹配。
* * 弃用了<code>name</code>字段。
* * 移除了<code>values</code>字段，现在使用<code>value</code>字段指定Uniform。
* ** 仍然为必选项，格式视<code>type</code>而定：
* *** <code>int</code> - 单个整数
* *** <code>float</code> - 单个浮点数
* *** <code>vec2</code> - 两个浮点数的列表
* *** <code>vec3</code> - 三个浮点数的列表
* *** <code>ivec3</code> - 三个整数的列表
* *** <code>vec4</code> - 四个浮点数的列表
* *** <code>matrix4x4</code> - 四行四列浮点数的列表
* * Uniform类型不会被验证是否适用于指定的着色器，指定不合适的数据可能导致未定义的行为。
* 对后处理管线程序作如下更改：
* * 现在每个Uniform不再是分立的不透明的类型，而是打包进Uniform块内。
* ** 它们将根据JSON定义的通道进行设置，并且在顶点着色器和片段着色器之间共享。
* * 大小的列表（所有<code>vec2*Size</code>的Uniform）现在被单个Uniform块<code>SamplerInfo</code>取代。
* ** 包含按顺序的输入纹理大小和输出纹理大小。
* ** 定义文件的纹理顺序决定采样器的顺序。
* ** 对于大多数后链而言这只是以前的<code>OutSize</code>（vec2）和<code>InSize</code>（vec2）。
* * <code>post/bits.fsh</code>：
* ** 需要<code>BitsConfig</code>，包含<code>Resolution</code>（float）和<code>MosaicSize</code>（float）。
* * <code>post/blit.fsh</code>：
* ** 需要<code>BlitConfig</code>，包含<code>ColorModulate</code>（vec4）。
* * <code>post/blur.vsh</code>和<code>post/box_blur.fsh</code>：
* ** 需要<code>BlurConfig</code>，包含<code>BlurDir</code>（vec2）和<code>Radius</code>（float）。
* * <code>post/color_convolve.fsh</code>：
* ** 需要<code>ColorConfig</code>，包含<code>RedMatrix</code>（vec3）、<code>GreenMatrix</code>（vec3）和<code>BlueMatrix</code>（vec3）。
* * <code>post/invert.fsh</code>：
* ** 需要<code>InvertConfig</code>，包含<code>InverseAmount</code>（float）。
* * <code>post/rotscale.vsh</code>：
* ** 需要<code>RotScaleConfig</code>，包含<code>InScale</code>（vec2）、<code>InOffset</code>（vec2）和<code>InRotation</code>（float）。
* * <code>post/spiderclip.fsh</code>：
* ** 需要<code>SpiderConfig</code>，包含<code>Scissor</code>（vec4）和<code>Vignette</code>（vec4）。
* <code>Globals</code>Uniform块
* * 可以通过<code>#moj_import <minecraft:projection.glsl></code>引用。
* * 大多数着色器都能接收此Uniform块，尽管通常不使用它。
* * 包含<code>ScreenSize</code>、<code>GlintAlpha</code>、<code>GameTime</code>和<code>MenuBlurRadius</code>。
* ** <code>MenuBlurRadius</code>是打开菜单时背景的模糊半径。
* <code>Fog</code>Uniform块
* * 可以通过<code>#moj_import <minecraft:fog.glsl></code>引用。
* * 大多数着色器都能接收此Uniform块，尽管通常不使用它。
* * 包含<code>FogColor</code>、<code>FogShape</code>、<code>FogStart</code>、<code>FogEnd</code>、<code>FogSkyEnd</code>和<code>FogCloudsEnd</code>。
* ** <code>FogSkyEnd</code>是绘制天空时雾的截止位置。
* ** <code>FogCloudsEnd</code>是绘制云时雾的截止位置。
* ** <code>FogEnd</code>是普通的雾的截止位置。
* * <code>FOG_IS_SKY</code>在渲染天空时可以在核心着色器<code>position.vsh/fsh</code>里使用。
* <code>Projection</code>Uniform块
* * 可以通过<code>#moj_import <minecraft:projection.glsl></code>引用。
* * 大多数着色器都能接收此Uniform块，尽管通常不使用它。
* * 包含<code>ProjMat</code>。
* <code>DynamicTransforms</code>Uniform块
* * 不可用于通常不使用它的着色器。
* * 包含<code>ModelViewMat</code>、<code>ColorModulator</code>、<code>ModelOffset</code>、<code>TextureMat</code>和<code>LineWidth</code>。
* * 一些值是硬编码的，对于给定的着色器可能没有意义。
* <code>Lighting</code>Uniform块
* * 可以通过<code>#moj_import <minecraft:light.glsl></code>引用。
* * 大多数着色器都能接收此Uniform块，尽管通常不使用它。
* ** 如果着色器不使用该值，可能没有意义。
* * 包含<code>Light0_Direction</code>和<code>Light1_Direction</code>。
* <code>CloudInfo</code>Uniform块
* * 仅用于渲染云的着色器<code>rendertype_clouds.vsh/fsh</code>。
* * 包含<code>CloudColor</code>、<code>CloudOffset</code>和<code>CellSize</code>。
* ** <code>CellSize</code>是云的单元格的大小。
* <code>LightmapInfo</code>Uniform块
* * 仅用于光照渲染的着色器<code>lightmap.fsh</code>。
* * 包含<code>AmbientLightFactor</code>、<code>SkyFactor</code>、<code>BlockFactor</code>、<code>UseBrightLightmap</code>、<code>NightVisionFactor</code>、<code>DarknessScale</code>、<code>DarkenWorldFactor</code>、<code>BrightnessFactor</code>和<code>SkyLightColor</code>。

# 修复
命令时，游戏卡死。
|280297|草丛和泥土的音量不一致。
|293754|Minecraft偶尔导致OpenGL错误。
|295395|实体与下界传送门的交互不同。
|295677|关闭“”屏幕后，标题屏幕自黑色淡入。
|295895|1.21.5中，矿车穿越下界传送门的行为损坏。
|295944|重新加载会导致无职业的僵尸村民获得随机的职业服装。
|296099|下界传送门碰撞箱是否工作取决于基本方向。
|296121|<code>ClientboundLevelChunkPacketData</code>缓冲区过大。
|296348|<code>NoAI:1b</code>的生物在1.21.5及以上版本中不能被骑乘。
|296638|使用“”画质时，具有特殊显示上下文的时钟、指南针和磁石指针不会渲染附魔光效。
|;prev
|296353|药水、药箭和染色皮革盔甲在物品栏中以缺失或错误的颜色渲染。
|296355|光标前方的字符向左侧偏移一个像素。
|296356|GUI中渲染的判定箱损坏了。
|296357|飞近方块上表面时，快乐恶魂产生脚步音效。
|296358|在快乐恶魂顶部的旁观模式玩家会使其停止移动。
|296363|实验性内容屏幕中的滚动条不会移动按钮的判定位置。
|296365|完全未浸湿的失水恶魂的方块状态改变时，会播放方块放置音效。
|296366|骑乘快乐恶魂飞行时，会因飞行而被踢出。
|296367|所有物品在物品栏中显示的附魔光效均为同一种。
|296373|被方块覆盖时，失水恶魂触手的侧面未被剔除。
|296376|小恶魂产生的音效在极远处都能听见。
|296381|世界生成的失水恶魂总是面向北方。
|296382|地图是模糊的。
|296401|创造模式物品栏中，挽具未正确排序。
|296419|与1.21.5相比，多人游戏列表中旁观者的名称渲染异常。
|296426|快捷栏图标上方的文本背景缺乏透明度。
|296427|被拴上栅栏的快乐恶魂无规律地移动或旋转。
|296434|悬停于收纳袋时看不见其中的物品。
|296437|物品栏中的物品会在状态效果图标和配方书图标后渲染。
|296444|资源包图标是模糊的。
|296465|高亮告示牌文本会覆盖告示牌背景。
|296467|物品提示框导致其背后的物品不渲染。
|296470|铁砧界面中的物品在文字后渲染。
|296471|平视显示器现在会在玩家上床时隐藏，导致平视显示器延迟渲染。
|296517|打开切换Realm世界界面时，菜单全景图变灰。
|296518|Java Realms信息框的居中文本在被选中时完全消失。
|296524|服务器和单人游戏世界图标是模糊的。
}}</onlyinclude>

# 参考

# 导航

[de:25w16a](de:25w16a.md)
[en:Java Edition 25w16a](en:Java Edition 25w16a.md)
[es:Java Edition 25w16a](es:Java Edition 25w16a.md)
[fr:Édition Java 25w16a](fr:Édition Java 25w16a.md)
[ja:Java Edition 25w16a](ja:Java Edition 25w16a.md)
[lzh:二五週一六甲](lzh:二五週一六甲.md)
[pt:Edição Java 25w16a](pt:Edição Java 25w16a.md)
[ru:25w16a (Java Edition)](ru:25w16a (Java Edition).md)
[uk:25w16a (Java Edition)](uk:25w16a (Java Edition).md)