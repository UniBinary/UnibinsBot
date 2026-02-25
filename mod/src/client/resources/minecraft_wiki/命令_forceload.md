# 命令/forceload

*页面ID: 39782* | *来源: Minecraft Wiki*

强制加载区块的命令|强制加载区块的命令|命令/tickingarea|Java版自然存在的拥有类似机制的区块|出生点区块}}

强制或取消强制[区块](区块.md)保持加载，或查询强制加载的区块。

# 用法
被强制加载的区块会获得加载等级为31的加载标签，这与玩家加载范围内获得加载标签的区块相同。这意味着被强制加载的区块中会处理所有的游戏内容，且加载等级会扩散到相邻的区块。不过由于每向相邻区块扩散一次都会使加载等级增加1，相邻区块并不会处理所有的游戏内容。参见[区块](区块.md)。

指定的坐标是目标区块内的任意[方块坐标](坐标#方块坐标.md)。为了强制加载区块<code>0,0</code>到区块<code>1,2</code>间的所有区块（共2×3=6个区块），[玩家](玩家.md)应该使用例如的命令。使用命令则将会加载区块<code>0,0</code>到区块<code>0,1</code>（1个区块在x/z坐标方向包含16×16方块）。

# 语法
   <code>forceload add <from> [<to>]</code>
  : 强制<code><from></code>（如果指定了<code><to></code>，则是从<code><from></code>到<code><to></code>）处的区块加载。
   <code>forceload remove <from> [<to>]</code>
  : 取消<code><from></code>（如果指定了<code><to></code>，则是从<code><from></code>到<code><to></code>）处的区块的强制加载。
   <code>forceload remove all</code>
  : 取消当前维度所有被强制加载的区块。
   <code>forceload query [<pos>]</code>
  : 查询区块坐标<code><pos></code>处的区块是否被强制加载；若不指定<code><pos></code>，列出当前维度中所有被强制加载的区块。

# 参数
 和
   X、Z轴的方块坐标值，将在命令内部被转换为区块坐标。


   以区块坐标指定要查询的区块。


# 结果

# 输出

# 示例
* 将当前维度的区块<code>0,0</code>标记为强制加载：<code>/forceload add 0 0</code>
* 将当前维度的区块<code>0,-1</code>到<code>0,0</code>标记为强制加载：<code>/forceload add 0 -1 1 0</code>
* 查看当前维度的区块<code>0,0</code>是否被标记为强制加载：<code>/forceload query 0 0</code>
* 将当前维度的区块<code>0,0</code>解除强制加载：<code>/forceload remove 0 0</code>
* 将当前维度的区块<code>0,-1</code>到<code>0,0</code>解除强制加载：<code>/forceload remove 0 -1 1 0</code>
* 解除标记当前维度所有的强制加载区块：<code>/forceload remove all</code>

# 历史

|。}}
|重命名为。}}
|现在对[权限等级](权限等级.md)大于等于2的玩家可用。}}
|不能保证区块在同一游戏刻内完全加载。<ref></ref>}}
}}

# 参考

# 导航

[de:Befehl/forceload](de:Befehl/forceload.md)
[en:Commands/forceload](en:Commands/forceload.md)
[es:Comandos/forceload](es:Comandos/forceload.md)
[ja:コマンド/forceload](ja:コマンド/forceload.md)
[pt:Comandos/forceload](pt:Comandos/forceload.md)
[ru:Команды консоли/forceload](ru:Команды консоли/forceload.md)