# 命令/scoreboard

*页面ID: 39808* | *来源: Minecraft Wiki*

管理记分板中的和分数持有者。

# 语法
# = Java版 =
; 记分项命令
   <code>scoreboard objectives **list**</code>
  : 列出所有存在的[记分项](记分板#记分项.md)及其显示名称与准则。

   <code>scoreboard objectives **add** <objective> <criteria> [<displayName>]</code>
  : 创建一个具有指定的名称、准则和显示名称（可选）的记分项。

   <code>scoreboard objectives **remove** <objective></code>
  : 删除指定记分项及其所有有关内容。记分项、分数持有者的分数数据都会被删除。且如果记分项在显示位置上，该显示位置将会被清空。

   <code>scoreboard objectives **setdisplay** <slot> [<objective>]</code>
  : 在[指定位置](记分板#显示位置.md)显示指定记分项的分数信息。若未指定记分项，则对应显示位置将被清空（恢复到默认状态）。

   <code>scoreboard objectives **modify** <objective> **displayautoupdate** (true|false)</code>
  : 设置指定记分项中分数持有者名称是否会在分数更新时自动更新为相关的游戏名称（默认禁用，若分数持有者代表虚拟实体则无效）。

   <code>scoreboard objectives **modify** <objective> **displayname** <displayName></code>
  : 更改指定记分项的显示名称。
   <code>scoreboard objectives **modify** <objective> **numberformat**</code>
  : 更改指定记分项在显示位置中的默认数字格式。
   <code>scoreboard objectives **modify** <objective> **numberformat blank**</code>
  : 设置指定记分项的默认数字格式为空，即不显示分数。
   <code>scoreboard objectives **modify** <objective> **numberformat fixed** <component></code>
  : 设置指定记分项的默认数字格式为<code>fixed</code>类型，即直接将分数替换为指定的文本组件。
   <code>scoreboard objectives **modify** <objective> **numberformat styled** <style></code>
  : 设置指定记分项的默认数字格式为<code>styled</code>类型，即分数将以指定的文本组件修饰（指定分数的样式）。
   <code>scoreboard objectives **modify** <objective> **rendertype** (hearts<nowiki>|</nowiki>integer)</code>
  : 更改玩家列表中的分数显示格式，可指定为爱心（hearts）或数字（integer）格式。

; 分数持有者命令
   <code>scoreboard players **list** [<target>]</code>
  : 列出记分板系统中以某种方式被追踪的全部[分数持有者](记分板#记分项.md)。可选参数<code><target></code>用于列出指定分数持有者的分数。

   <code>scoreboard players **get** <target> <objective></code>
  : 返回指定分数持有者在指定记分项中的分数。

   <code>scoreboard players **set** <targets> <objective> &lt;score></code>
  : 设置指定分数持有者在指定记分项中的分数。

   <code>scoreboard players **add** <targets> <objective> &lt;score></code>
  : 增加指定分数持有者在指定记分项中的分数值。若记分项不存在分数，则在增加前视为0分。不允许为负数。

   <code>scoreboard players **remove** <targets> <objective> &lt;score></code>
  : 减少指定分数持有者在指定记分项中的分数值。若记分项不存在分数，则在减少前视为0分。不允许为负数。

   <code>scoreboard players **reset** <targets> [<objective>]</code>
  : 删除指定分数持有者在指定记分项（若未指定<code><objective></code>则为其所有被追踪记分项）中的所有数据。若指定了<code><objective></code>参数，那么仅限该记分项被清空。否则，将清空所有关联的记分项。
  : 注：这并不代表分数被设置为0，它会将指定分数持有者在某个（或全部）记分项中的数据完全从记分板系统中移除。
  : 这也禁用了目标玩家使用命令的能力（若指定了<code><objective></code>，则只针对<code><objective></code>对应的记分项）。

   <code>scoreboard players **enable** <targets> <objective></code>
  : 允许指定分数持有者能够使用命令触发指定记分项。该命令接受非玩家实体，但仅玩家能够真正使用命令。在该命令被执行前，玩家无法通过命令触发指定记分项。玩家每次成功执行命令后都将会再次禁用对应记分项。
  : 注：若指定分数持有者在指定记分项中的分数不存在，该命令将会设置其分数为0。

   <code>scoreboard players **operation** <targets> <targetObjective> <operation> &lt;source> <sourceObjective></code>
  : 对目标分数持有者的目标记分项中的分数（<code><targets></code>与<code><targetObjective></code>）与来源分数持有者的来源记分项中的分数（<code>&lt;source&gt;</code>与<code><sourceObjective></code>）进行算术运算等操作，操作的结果将写入目标分数持有者对应记分项中的分数。若来源分数持有者及其对应的记分项中不存在分数，则视作0分处理。

   <code>scoreboard players **display name** <targets> <objective></code>
  : 重置指定分数持有者在指定记分项中的显示名称为默认状态。

   <code>scoreboard players **display name** <targets> <objective> <text></code>
  : 更改指定分数持有者在指定记分项中的显示名称。

   <code>scoreboard players **display numberformat** <targets> <objective></code>
  : 重置指定分数持有者在指定记分项中的数字格式为默认状态。

   <code>scoreboard players **display numberformat** <targets> <objective> **blank**</code>
  : 设置指定分数持有者在指定记分项中的数字格式为空，即不显示其分数。

   <code>scoreboard players **display numberformat** <targets> <objective> **fixed** <contents></code>
  : 设置指定分数持有者在指定记分项中的数字格式为<code>fixed</code>类型，即使用文本组件替换其分数。若目标所关联的记分项不存在分数，则先赋以0分后再使用文本组件替换。

   <code>scoreboard players **display numberformat** <targets> <objective> **styled** <style></code>
  : 设置指定分数持有者在指定记分项中分数格式为<code>styled</code>类型，即以由文本组件所定义的样式修饰该分数。

# = 基岩版 =
; 记分项命令
   <code>scoreboard objectives **list**</code>
  : 列出所有存在的[记分项](记分板#记分项.md)、显示名称与准则。

   <code>scoreboard objectives **add** <objective: string> dummy [displayName: string]</code>
  : 创建一个具有指定名称、准则和显示名称（可选）的记分项。<code><objective: string></code>可以被引号包裹。<code><displayName: string></code>必须是非数字的纯文本。如果未指定，默认为<code><objective></code>。所有的参数均区分大小写。

   <code>scoreboard objectives **remove** <objective: string></code>
  : 从记分板系统中删除指定记分项及其所有有关内容。记分项、分数的数据都会被删除，且如果记分项在显示位置上，该显示位置将会被清空。

   <code>scoreboard objectives **setdisplay** <list|sidebar> [objective: string] [ascending|descending]</code>
   <code>scoreboard objectives **setdisplay** belowname [objective: string]</code>
  : 在指定位置显示指定记分项的分数信息。合法的位置已在里列出并描述。注意，若未指定记分项，则对应显示位置将被清空（恢复到默认状态）。若显示位置指定为<code>list</code>或<code>sidebar</code>，可使用额外的可选参数<code>ascending|descending</code>以指定排列顺序。

; 分数持有者命令
   <code>scoreboard players **list** [playername: target]</code>
  : 显示所有被记分板系统追踪的实体。可选参数<code>[playername: target]</code>（实体名称）可用以显示指定实体的所有分数。

  <code>scoreboard players **set** <player: target> <objective: string> <count: int></code>
  : 设置指定分数持有者在指定记分项中的分数。

   <code>scoreboard players **add** <player: target> <objective: string> <count: int></code>
  : 增加指定分数持有者在给定记分项中的分数值。若指定分数持有者在记分项中不存在分数，则在增加前视为0分。若为负数，则将减去相应的分数。

   <code>scoreboard players **remove** <player: target> <objective: string> <count: int></code>
  : 减少指定分数持有者在给定记分项中的分数值。若记分项不存在分数，则在减少前视为0分。若为负数，则将增加相应分数。

   <code>scoreboard players **random** <player: target> <objective: string> <min: int> <max: int></code>
  : 设置指定分数持有者在指定记分项中的分数为一个在<code><min: int></code>（最小值）和<code><max: int></code>（最大值）之间的随机数（包含最小值和最大值）。

   <code>scoreboard players **reset** <player: target> [objective: string]</code>
  : 删除指定分数持有者在指定记分项（或其所有被追踪的记分项）中的分数。若指定了<code><objective></code>参数，那么仅限该记分项被清空。否则将清空所有关联的记分项。注：这并非将分数设为0，分数持有者的所有数据将从整个记分板（或指定记分项）中移除。

   <code>scoreboard players **test** <player: target> <objective: string> <min: wildcard int> [max: wildcard int]</code>
  : 检测目标分数是否在<code><min: wildcard int></code>（最小值）和<code><max: wildcard int></code>（最大值，默认为2,147,483,647）之间。

   <code>scoreboard players **operation** <player: target> <targetObjective: string> <operation: operator> <selector: target> <objective: string></code>
  : 对目标分数持有者的目标记分项中的分数（<code><player: target></code>与<code><targetObjective: string></code>）与来源分数持有者的来源记分项中的分数（<code><selector: target></code>与<code><objective: string></code>）进行算术运算等操作，操作的结果将写入目标分数持有者对应记分项中的分数。若来源分数持有者及其对应的记分项中不存在分数，则视作0分处理。

# 参数
; 记分项命令

   表示记分项的名称。


   表示为新建记分项时要设定的准则。
    <code>dummy</code>是当前唯一支持的准则。

   表示记分项的显示名称，当未指定时，默认为<code><objective></code>。
   必须为一个[文本组件](文本组件.md)。必须为一个完整的单词，不能为数字（允许的字符：、、和）或一个被双引号包围的字符串。

   合法的显示位置可参见：。


   <code>ascending|descending</code>
   表示排列顺序是升序还是降序。若未指定，默认为升序。


   表示显示名称是否会自动更新。



   表示显示名称。



   表示一个用于替换记分项显示文字的文本组件。



   表示一个用于修饰记分项显示文字的样式（即颜色和格式等，与显示文字等内容无关）。


   <code>hearts|integer</code>
   表示分数的显示格式是心形（hearts）还是整数（integer）。

; 分数持有者命令

   表示分数持有者。指定名称对应的玩家无需上线，且不必是一个真实存在的玩家名。

   仅允许指定1个分数持有者。且<code>*</code>将失效。（）。允许指定多个分数持有者。

   表示1个或多个分数持有者。指定名称对应的玩家无需上线，且不必是一个真实存在的玩家名。


   表示记分项名称。


   表示设置的分数（可能是增加量或减少量）。


   <br>:
   表示最小值和最大值，用于产生在指定范围内的随机数。


   <br>:
   表示最小值和最大值，用于检测分数是否在指定范围内。
   必须为一个32位整型数字。且<code>min: wildcard int</code>可以用星号（<code>*</code>）代替，表示-2147483648。<code>max: wildcard</code>也可用星号（<code>*</code>）表示2147483647。

   表示目标记分项。


   表示来源分数持有者——其分数将作为输入源。


   表示来源记分项。


   表示要应用的操作。

  * <code>=</code>赋值：将来源分数赋给目标分数。
  * <code>+=</code>求和赋值：将来源分数和目标分数的和赋给目标分数。
  * <code>-=</code>求差赋值：将来源分数和目标分数的差赋给目标分数。
  * <code>*=</code>求积赋值：将来源分数和目标分数的积赋给目标分数。
  * <code>/=</code>求商（整除）赋值：将来源分数和目标分数相除的结果或后赋给目标分数。
  * <code>%=</code>（取模）赋值：将来源分数和目标分数相除，取整数除法所得的余数（取除数/被除数的符号）赋给目标分数。
  * 交换：交换来源分数和目标分数。
  * 取较小值：仅当来源分数较小时，将来源分数赋给目标分数。
  * 取较大值：仅当来源分数较大时，将来源分数赋给目标分数。
   在除了的所有操作中，来源分数都保持不变，仅目标分数可能会被改变。若目标或来源未关联任何记分项，则将会在操作前先赋值为0并建立关联。若有1个以上的分数持有者作为来源，则将依次对每个来源的分数进行一次操作。若有1个以上的分数持有者作为目标，则将依次对每个目标进行一次操作。此操作默认按照命令执行者与目标分数持有者间的距离由近到远执行。
   对于<code>/=</code>和<code>%=</code>，如果来源分数为0（即除数为0），命令将执行失败，而命令执行成功，但目标分数不会发生变化。


   表示一个用于替换分数持有者名称的文本组件（<code>nbt</code>和<code>selector</code>等[内容类型](文本组件#文本组件内容.md)将无效）。



   表示一个用于替换分数的文本组件。



   表示分数的样式（即颜色和格式等，与分数值等内容无关）。


# 结果
; 记分项命令

; 分数持有者命令

</code>或<code>%</code>时，来源分数为0（即除数为0）||success}}

# 输出
; 记分项命令

; 分数持有者命令

# 示例

# = Java版 =
; 示例1：创建和删除记分项
创建名为的记分项，记分项的准则为health：
<syntaxhighlight lang="mcfunction">
scoreboard objectives add foo health
</syntaxhighlight>

修改记分项的显示名称为：
<syntaxhighlight lang="mcfunction">
scoreboard objectives modify foo displayname {"text":"❤","color":"red"}
</syntaxhighlight>

也可以在创建记分板的同时指定显示名称。以下命令创建了一个名为的记分项，记分项的准则为dummy，显示名称为Scoreboard：
<syntaxhighlight lang="mcfunction">
scoreboard objectives add bar dummy "Scoreboard"
</syntaxhighlight>
* 这里的显示名称Scoreboard必须符合JSON语法，在JSON中要表示一个字符串必须使用双引号包裹，所以应该写为而非。

在不需要时可以随时移除某个记分项。以下命令将移除一个名为的记分项：
<syntaxhighlight lang="mcfunction">
scoreboard objectives remove bar
</syntaxhighlight>

; 示例2：设置实体或虚拟实体的分数
设置Alex在记分项中的分数为100，设置Steve在记分项中的分数为200：
<syntaxhighlight lang="mcfunction">
scoreboard players set Alex bar 100
scoreboard players set Steve bar 200
</syntaxhighlight>
* 玩家Alex和Steve不存在的情况下也能设置成功。这是因为在使用玩家名作为之后的那一个参数时，记分板系统会直接在记分项中添加相应的分数记录，不会检测相应玩家是否真实存在于游戏中。故这里的Alex和Steve也即“虚拟玩家”。

设置执行者在记分项中的分数为100：
<syntaxhighlight lang="mcfunction">
scoreboard players set @s bar 100
</syntaxhighlight>
* 若你在聊天栏执行该命令，执行者就是你自己。
* 若之后的那一个参数符合选择器的语法，则游戏将根据选择器来搜索和筛选实体，若未找到符合选择器的实体，则命令执行失败，不会设置分数。

; 示例3：获取分数持有者的分数
可将所有在记分板中存有分数的实体统称为分数持有者。在使用命令时，必须先找到1个分数持有者，然后才能获取到1个分数。

获取名为Alex的玩家在记分项中的分数：
<syntaxhighlight lang="mcfunction">
scoreboard players get Alex bar
</syntaxhighlight>
* 获取分数的前提是目标的分数必须在指定的记分项中存在。所以你一般无法获取某个实体在一个刚刚创建好的记分项中的分数。

; 示例4：重置分数
重置执行者在记分项中的分数：
<syntaxhighlight lang="mcfunction">
scoreboard players reset @s bar 100
</syntaxhighlight>
* 该操作会删除执行者在记分项中的分数。故执行后无法获取执行者的分数。

你也可以使用通配符来遍历当前记分板中的所有分数持有者。以下命令将删除记分板中所有分数持有者在中的分数：
<syntaxhighlight lang="mcfunction">
scoreboard players reset * bar 100
</syntaxhighlight>

; 示例5：记分项和分数的显示
[缩略图|400px|一个显示在屏幕右侧的记分项](File:Scoreboard.png.md)
将上一步创建的记分项显示在屏幕右侧：
<syntaxhighlight lang="mcfunction">
scoreboard objectives setdisplay sidebar bar
</syntaxhighlight>
* 若你没有设置记分项的显示名称，则记分项将显示为其标识名。否则将显示为所设定的显示名称。
* 所显示的分数将被自动排序。较大者靠上，较小者靠下。

清空屏幕右侧所显示的记分项：
<syntaxhighlight lang="mcfunction">
scoreboard objectives setdisplay sidebar
</syntaxhighlight>
* 该命令只会将显示位置的显示内容清空，不会删除任何记分项。

将之前创建的记分项显示在玩家列表：
<syntaxhighlight lang="mcfunction">
scoreboard objectives setdisplay list foo
</syntaxhighlight>

修改记分项的渲染类型为“心形”：
[缩略图|200px|list显示位置的显示效果，渲染类型为hearts](File:Scoreboard Display List Hearts.gif.md)
<syntaxhighlight lang="mcfunction">
scoreboard objectives modify foo rendertype hearts
</syntaxhighlight>

修改记分项的渲染类型为“整型”：
[缩略图|200px|list显示位置的显示效果，渲染类型integer](File:Scoreboard Display List Integer.png.md)
<syntaxhighlight lang="mcfunction">
scoreboard objectives modify foo rendertype integer
</syntaxhighlight>

比较特殊的是，对于虚拟玩家，若带有前缀，则不会显示在任何位置。以下命令将拟玩家在中的分数设置为233，然后设置显示位置为侧边栏，发现其中并没有虚拟实体{{cd|-{}-#test的分数}}：
<syntaxhighlight lang="mcfunction">
scoreboard players set #test bar 233
scoreboard objectives setdisplay sidebar bar
</syntaxhighlight>

; 示例6：列出记分板中的记分项、实体、实体分数信息
列出当前存档中的所有记分项：
<syntaxhighlight lang="mcfunction">
scoreboard objectives list
</syntaxhighlight>

列出当前存档中所有被记分板追踪的实体：
<syntaxhighlight lang="mcfunction">
scoreboard players list
</syntaxhighlight>

列出当前执行者的所有分数信息（关联了哪些记分项，每个记分板中有多少分）：
<syntaxhighlight lang="mcfunction">
scoreboard players list @s
</syntaxhighlight>

; 示例7：对分数的修改
只能修改非只读类型的分数，不能修改只读类型的分数。故之前所创建的记分项不可用命令修改。

先新建两个记分项和：
<syntaxhighlight lang="mcfunction">
scoreboard objectives add A dummy
scoreboard objectives add B dummy
</syntaxhighlight>

对Steve在中的分数增加0：
<syntaxhighlight lang="mcfunction">
scoreboard players add Steve A 0
</syntaxhighlight>
* 若在执行前，Steve并没有在记分项中的分数，则该操作会先将其分数初始化为0再加0。故该操作可用来确保某个实体在记分项中的分数存在。
* 以上这种在对分数操作前会自动进行初始化的行为被称为**隐式初始化**。

将Steve在记分项中的分数赋值到其记分项：
<syntaxhighlight lang="mcfunction">
scoreboard players operation Steve A = Steve B
</syntaxhighlight>
* 执行之前，即使Steve在记分项中的分数并不存在，记分板系统也会进行隐式初始化，先将Steve在记分项中的分数设置为0，然后再赋值给Steve在记分项中的分数。

将Steve在记分项中的分数减去其在记分项中的分数后再赋值到其记分项中：
<syntaxhighlight lang="mcfunction">
scoreboard players operation Steve A -= Steve B
</syntaxhighlight>
* 若在执行前，Steve在中的分数为10，在中的分数为20，则相当于A-B}}，即，中的分数最终为-10。
* 若Steve在中的分数不存在，在执行时也会被隐式初始化为0。

要注意，对于求商和求余赋值，除数不能为0。若Steve在中的分数为0，以下命令会因为除数为0而执行失败：
<syntaxhighlight lang="mcfunction">
scoreboard players operation Steve A /= Steve B
</syntaxhighlight>
* 虽然提示除数不能为0，但是Steve在中的分数仍然会受到隐式初始化影响。

; 示例8：求多个实体中的最小值

先分别设置3个分数：
<syntaxhighlight lang="mcfunction">
scoreboard players set Steve A 2147483647
scoreboard players set Alex A -2147483648
scoreboard players set Minecraft_Wiki A 233
</syntaxhighlight>
* 这里将Steve在中的分数设置为整型最大值是为了方便后续存储最小值。

以下命令将遍历记分板上的所有分数持有者，并将他们在记分项中的最小分数赋值给Steve在记分项中的分数。由于执行前Steve在记分项中的分数已经为整型最大值，除非所有分数持有者的分数均为整型最大值，否则其分数一定会在执行后变更为最小分数。
<syntaxhighlight lang="mcfunction">
scoreboard players operation Steve A < * A
</syntaxhighlight>
* 执行后，在记分项中，Steve的分数等于-2147483648，即Alex的分数。

; 示例9：制作侧边栏公告

创建一个记分项并显示在侧边栏：
<syntaxhighlight lang="mcfunction">
scoreboard objectives add info dummy
scoreboard objectives modify info displayname {"text":"公告", "color":"yellow", "bold":true}
scoreboard objectives setdisplay sidebar info
</syntaxhighlight>

修改数字格式为，以消除数字显示。然后添加4个虚拟玩家，分别用来充当公告的4行。最后通过来设置这些虚拟玩家的显示名：

|}

# 历史

# 导航

[de:Befehl/scoreboard](de:Befehl/scoreboard.md)
[en:Commands/scoreboard](en:Commands/scoreboard.md)
[es:Comandos/scoreboard](es:Comandos/scoreboard.md)
[ja:コマンド/scoreboard](ja:コマンド/scoreboard.md)
[pt:Comandos/scoreboard](pt:Comandos/scoreboard.md)
[ru:Команды консоли/scoreboard](ru:Команды консоли/scoreboard.md)
[uk:Команди консолі/scoreboard](uk:Команди консолі/scoreboard.md)