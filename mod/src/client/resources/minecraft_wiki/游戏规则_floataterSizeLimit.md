# 游戏规则/floataterSizeLimit

*页面ID: 168803* | *来源: Minecraft Wiki*

|java-range=
|type=整型
|default-value=32
|nobe=1}}
* *floataterSizeLimit**是控制[悬浮马铃薯推进器](悬浮马铃薯推进器.md)可推动方块范围的[游戏规则](游戏规则.md)。

# 行为
当[悬浮马铃薯推进器](悬浮马铃薯推进器.md)接收到[红石信号](红石信号.md)，且方块未超出<math>N\times{N}\times{N}</math>的范围时，会清除结构内包括自身的所有方块，并推动与其相连的、位于范围内的方块一起向放置方向移动。其中<math>N</math>为floataterSizeLimit的值。

# 导航

[f](Category:游戏规则.md)