# 命令/experience

*页面ID: 39775* | *来源: Minecraft Wiki*

）</small>
|oplevel=2
|alias=
}}
）</small>
|oplevel=1
|cheat=1
}}

给予玩家[经验](经验.md)。

# 语法
* **Java版**
   <code>experience add <targets> <amount> [levels|points]</code>
  : 增加或减少玩家的经验值或经验等级。
  :* 若增加或减少经验值，则会计入玩家的[分数](经验#分数.md)。
  :* 若增加或减少经验等级，则不会计入玩家的分数。当前经验条中的经验值按比例缩放，保持经验条的进度不变。
   <code>experience set <targets> <amount> [levels|points]</code>
  : 设置玩家的经验值或经验等级，不会改变玩家的分数。
  :* 若设置经验值，则不会改变经验等级，若指定的经验值大于等于一玩家当前经验条的剩余容量，则无法设置该玩家的经验值。
  :* 若设置经验等级，则当前经验条中的经验值按比例缩放，保持经验条的进度不变。
   <code>experience query <targets> (levels|points)</code>
  : 查询玩家的经验等级或当前经验条中的经验值。

* **基岩版**
   <code>xp <amount: int> [player: target]</code>
  : 增加玩家的经验值。
   <code>xp <amount: int>L [player: target]</code>
  : 增加或减少玩家的经验等级。当前经验条中的经验值按比例缩放，保持经验条的进度不变。

# 参数
：（仅<code>add</code>模式下）
   指定要给予玩家的经验值或经验等级的数量。负数表示移除玩家的经验。


：（仅<code>set</code>模式下）
   指定要设置成的经验值数量或经验等级。


：
   指定要给予玩家的经验值或经验等级的数量。
   如果在后面加上<code>L</code>，则会给予或移除指定数量的经验等级，否则给予或移除经验值。负数表示移除玩家的经验。
   如果是经验值（没有<code>L</code>后缀），则应大于零0。

：（在<code>add</code>和<code>set</code>模式下）<br>
：
   指定命令作用的目标实体。若未指定，默认为命令执行者。


：（<code>query</code>模式）
   指定要查询的目标实体。


   points}}
   指定命令将影响/获取经验等级还是经验值。<code>levels</code>表示经验等级，<code>points</code>表示经验值。

# 结果

且小于0}}

# 输出

# 示例
* 显示Steve当前的经验等级：<code>experience query Steve levels</code>
* 为自己增加7点经验值：<code>experience add @s 7</code>或<code>xp 7</code>
* 将Alice的等级提升3级：<code>experience add Alice 3 levels</code>或<code>xp 3L Alice</code>
* 将所有玩家的等级归零：<code>experience set @a 0</code>或<code>experience set @a 0 levels</code>或<code>xp -2147483648L @a</code>

# 历史

|。}}
|命令现在能在单人游戏中使用。
|更改了语法，现在是等级参数在前，玩家参数在后，并且玩家参数是可选的。}}
|的上限现在为2,147,483,647（2<sup>31</sup>&minus;1）而不是5000。}}
|并且变成了简称。
|语法被重构为、和。
|现在支持负数值。}}
|
|。}}
}}

# 导航

[de:Befehl/experience](de:Befehl/experience.md)
[en:Commands/xp](en:Commands/xp.md)
[es:Comandos/xp](es:Comandos/xp.md)
[ja:コマンド/experience](ja:コマンド/experience.md)
[pt:Comandos/xp](pt:Comandos/xp.md)
[ru:Команды консоли/experience](ru:Команды консоли/experience.md)
[th:คำสั่ง/experience](th:คำสั่ง/experience.md)
[uk:Команди консолі/xp](uk:Команди консолі/xp.md)