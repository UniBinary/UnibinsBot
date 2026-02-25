# 游戏规则/spawnChunkRadius

*页面ID: 139331* | *来源: Minecraft Wiki*

|type=整型
|default-value=2
|java-range=
|nobe=1}}
* *spawnChunkRadius**是控制[出生点区块](出生点区块.md)的大小的[游戏规则](游戏规则.md)。

# 行为
当spawnChunkRadius为0时，出生点区块会被完全禁用。

出生点强加载区块的水平范围为边长为<math>2\times{spawnChunkRadius}-1</math>的正方形，如10代表强加载区块大小为19&times;19。

使用修改出生点区块大小时，会先移除之前出生点区块的加载标签，再为出生点区块添加基础等级<math>32-spawnChunkRadius</math>级的加载标签。

# 历史

|
|
}}

# 导航