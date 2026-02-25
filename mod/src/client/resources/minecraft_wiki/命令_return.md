# 命令/return

*页面ID: 103910* | *来源: Minecraft Wiki*

此命令可以被写入一个[函数](Java版函数.md)中，以控制函数执行。它可作为其所在函数的结束点，并设定该函数[成败标志和返回值](Java版函数#返回.md)，函数的成败标志和返回值将会返回值调用此函数的命令，将会作为命令的[输出](命令/function#输出.md)值，或被测试。它还可以使得有多个[执行分支](命令/execute#执行分支.md)的命令在其第一个分支结束。

# 用法
该命令可在函数中使用，使得此函数的执行特定位置停止，与此同时，设定了该函数的**返回值**和**成败标志**。
* 如果该函数是由命令调用的，那么该函数的返回值和成败标志将传入该命令作为其[输出](命令/function#输出.md)值，以用于使用来存储。
* 如果该函数是由调用的，将检查该函数的**返回值**是否不是<code>0</code>。

同其他命令一样，若该命令接在unless) ... run}}后或其他可能[执行中断](命令/execute#执行分支.md)的命令之后，则可能因的中断而不被执行，故可利用此机制，限制该命令仅在特定条件下执行。这样，函数就可以在不同的条件下（也即在不同的位置）结束，从而实现更复杂的行为。例如，以下是一个模拟条件分支语句的函数：
<syntaxhighlight lang="mcfunction">
# 若执行者带有"test1"标签(@s[tag=test1])则执行函数"test1"
execute if entity @s[tag=test1] run return run function test1
# 否则若执行者为玩家(@s[type=player])则执行函数"test2"
execute if entity @s[type=player] run return run function test2
# 若以上皆不满足，执行函数"test3"
return run function test3
</syntaxhighlight>

如果此命令接在带有多个[分支](命令/execute#执行分支.md)的命令之后，命令也会在首次执行该命令后结束执行，因此只会执行第1个分支。借此可以确保命令仅执行1次，例如：<code>execute as @e[type=zombie] at @s if block ~ ~-1 ~ grass_block run **return run** tp @s Steve</code>只会把1只在草方块上的僵尸（若有，即使世界中不止1只）传送到Steve。注意：该命令在函数中也会造成该函数执行到此行后停止。

如果有多个分支的命令接在此命令之后，命令同样会在执行首个分支之后结束执行。

<code>return run execute ... run <*command*></code>和<code>execute ... run return run <*command*></code>的唯一区别在于：前者的命令一定会执行，若命令执行中断则返回“失败”和<code>0</code>值；而后者的命令在命令执行中断时就不会执行了。

如果通过标签调用了多个函数的命令接在此命令之后，整个命令也会在任意一个函数首次执行命令后结束执行。参见条目。

命令在函数中被执行时，会设置此函数的成败标志和返回值，并返回到调用此函数的或命令中。但是，命令本身也有[输出值](#输出.md)，若其接在命令之后，则在其使得命令和函数结束执行的同时，该命令的<code>success</code>或<code>result</code>输出值将被储存在指定位置。直接在命令方块里执行此命令，其成功次数会被命令方块记录。

# 语法
   <code>return <value></code>
  : 结束其所在函数的执行，并设置函数返回值为整型数值<code><value></code>，成败标志为“成功”。
   <code>return fail</code>
  : 结束其所在函数的执行，并设置函数返回值为<code>0</code>，成败标志为“失败”。
   <code>return run <*command*></code>
  : 执行<code><*command*></code>命令后，结束其所在函数的执行，并将其所在函数的**成败标志**和**返回值**设为<code><command></code>命令的**<code>success</code>值**和**<code>result</code>值**。若<code><*command*></code>为一个多分支的，则仅第一个分支命令会被执行。

# 参数

   一个整数值，将作为其所在[函数](Java版函数.md)的[返回值](Java版函数#返回.md)。


   要执行的命令。

# 结果

命令执行失败（若该命令为一个命令，则为第一个分支执行失败）}}
命令为，且[执行中断](命令/execute#执行分支.md)}}
命令为，且命令执行结果为Void}}
命令为，且在命令中的第一个执行分支中，命令执行结果为Void}}

# 输出

参数的值}}

的<code>result</code>输出值。（若为一个命令，则取第一个执行分支中命令的<code>result</code>输出值）}}

上方的表格是命令本身的输出值。而若在函数中使用，则还会设定了该函数的**返回值**和**成败标志**。所设置的函数成败标志等于表格中的<code>success</code>输出值，而函数返回值等于表格中的<code>result</code>值。

# 示例
; 示例1：return fail的返回情况
若以下函数被非玩家实体执行，则会在执行完第一条命令后返回（返回值为0，成败标志为<code>false</code>（执行失败）），后续的命令将不会被执行。

; 示例2：return run ...的返回情况
若以下函数被非玩家实体执行，则会在执行完第一条命令后返回（若成功执行，则返回值为执行实体的标签值，成败标志为<code>true</code>（执行成功）），不会执行后续的命令。

; 示例3：Void函数的特征
以下函数是一个无返回行为的Void函数，无法获取其返回值和成败标识：

在聊天栏执行以下命令后，执行者在test记分项中的分数无任何改变。
<syntaxhighlight lang="mcfunction">
/execute store success score @s test run function example:test3
/execute store result score @s test run function example:test3
</syntaxhighlight>

; 示例4：递归返回

在聊天栏执行以下命令后，foo虚拟实体在bar记分项中的分数将等于最大递归深度32768。而在递归结束后，无法通过获取返回值和成败标识。
<syntaxhighlight lang="mcfunction">
/execute store result score foo baz function example:test4
</syntaxhighlight>

# 历史

|。}}
|子命令。}}
|子命令。}}
|子命令。}}
|命令由执行，现在整个命令会在任意一个函数首次执行命令后结束执行。
|使用执行命令时，命令执行一次后就会返回。例如：会总在首个分支返回。
|加入了子命令。
|命令现在总是会返回。如果被其执行的命令没有有效的<code>result</code>值，包含命令的函数会失败。
|命令现在会传送<code>success</code>值（之前<code>success</code>值总为<code>1</code>）。
|命令现在允许存储输出值，像这样的命令现在可以存储值。}}
|</ref>}}
}}

# 参考

# 导航

[de:Befehl/return](de:Befehl/return.md)
[en:Commands/return](en:Commands/return.md)
[ja:コマンド/return](ja:コマンド/return.md)
[lzh:令/return](lzh:令/return.md)
[pt:Comandos/return](pt:Comandos/return.md)