# 编码格式/Color

*页面ID: 180982* | *来源: Minecraft Wiki*

此条目记录了颜色的编码格式。

下列结构需要与最新版本同步更新：

# 当前版本
# = RGB颜色 =

<div class="treeview">
*  <code>ExtraCodecs::RGB_COLOR_CODEC</code><section begin="codec_rgb_color"/>
* * ，则以十进制数字表示RGB颜色，每个通道占用8位。除最高8位外，从高到低依次为红色通道、绿色通道、蓝色通道。}}
* * 即：**<span style="color:red">Red</span><<16 + <span style="color:green">Green</span><<8 + <span style="color:blue">Blue</span>**，最高8位对RGB颜色没有任何作用。
* * }}，则以3个浮点数表示RGB颜色，依次代表红色通道、绿色通道、蓝色通道。游戏在保存为整数时始终认为最高8位为255。}}
* * ：颜色的R通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的G通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的B通道分量。取值为<code>[0, 1]</code>的闭区间。
<section end="codec_rgb_color"/>
</div>

# = ARGB颜色 =

<div class="treeview">
*  <code>ExtraCodecs::ARGB_COLOR_CODEC</code><section begin="codec_argb_color"/>
* * ，则以十进制数字表示ARGB颜色，每个通道占用8位。从高到低依次为透明通道、红色通道、绿色通道、蓝色通道。}}
* * 即：**Alpha<<24 + <span style="color:red">Red</span><<16 + <span style="color:green">Green</span><<8 + <span style="color:blue">Blue</span>**。
* * }}，则以4个浮点数表示ARGB颜色，依次代表红色通道、绿色通道、蓝色通道、透明通道。}}
* * ：颜色的R通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的G通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的B通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的A通道分量。取值为<code>[0, 1]</code>的闭区间。
<section end="codec_argb_color"/>
</div>

# = RGB颜色（接受字符串格式） =

<div class="treeview">
*  <code>ExtraCodecs::STRING_RGB_COLOR</code><section begin="codec_string_rgb_color"/>
* * ，则以十六进制RGB字符串<code>#rrggbb</code>表示RGB颜色，每个通道占用2个字符，依次为红色通道、绿色通道、蓝色通道。}}
* * 最大值为<code>#FFFFFF</code>，且除<code>#</code>前缀外字符串必须有6个字符，不区分大小写。游戏在反序列化为整数时始终认为最高8位为255，序列化时始终认为最高8位为0。
* * ，则以十进制数字表示RGB颜色，每个通道占用8位。除最高8位外，从高到低依次为红色通道、绿色通道、蓝色通道。}}
* * 即：**<span style="color:red">Red</span><<16 + <span style="color:green">Green</span><<8 + <span style="color:blue">Blue</span>**，最高8位对RGB颜色没有任何作用。
* * }}，则以3个浮点数表示RGB颜色，依次代表红色通道、绿色通道、蓝色通道。游戏在保存为整数时始终认为最高8位为255。}}
* * ：颜色的R通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的G通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的B通道分量。取值为<code>[0, 1]</code>的闭区间。
<section end="codec_string_rgb_color"/>
</div>

# = ARGB颜色（接受字符串格式） =

<div class="treeview">
*  <code>ExtraCodecs::STRING_ARGB_COLOR</code><section begin="codec_string_argb_color"/>
* * ，则以十六进制ARGB字符串<code>#aarrggbb</code>表示ARGB颜色，每个通道占用2个字符，依次为透明通道、红色通道、绿色通道、蓝色通道。}}
* * 最大值为<code>#FFFFFFFF</code>，且除<code>#</code>前缀外字符串必须有8个字符，不区分大小写。
* * ，则以十进制数字表示ARGB颜色，每个通道占用8位。从高到低依次为透明通道、红色通道、绿色通道、蓝色通道。}}
* * 即：**Alpha<<24 + <span style="color:red">Red</span><<16 + <span style="color:green">Green</span><<8 + <span style="color:blue">Blue</span>**。
* * }}，则以4个浮点数表示ARGB颜色，依次代表红色通道、绿色通道、蓝色通道、透明通道。}}
* * ：颜色的R通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的G通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的B通道分量。取值为<code>[0, 1]</code>的闭区间。
* * ：颜色的A通道分量。取值为<code>[0, 1]</code>的闭区间。
<section end="codec_string_argb_color"/>
</div>

[Category:顶级数据值页面](Category:顶级数据值页面.md)
[Category:通过Nbt inherit加载的页面](Category:通过Nbt inherit加载的页面.md)