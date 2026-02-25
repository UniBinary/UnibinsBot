# 材料/properties row

*页面ID: 19117* | *来源: Minecraft Wiki*

<includeonly></includeonly><noinclude>

该模板用于创建材料属性表，以展示各个[材料](材料.md)的特征。

# Usage
The parameter is set to the title to display in the first column.

The parameter  contains three color values separated by commas to display as a colored cell and text. It should be set based on the material's map color. If unset, it defaults to a white color and the text "None"

# = Properties =
The table contains the following properties. They are set to 1 for true, and 0 for false.
"wikitable"
! Name
! Subclass only?
! Description
! Default
|-
|
|
| The block allows the player to swim.
| 0
|-
|
|
| This block allows block dependent blocks to be placed on it, and is considered when spawning various structures.
| 1
|-
|
|
| This block reduces the level of light passing through it (often blocking it entirely).
| 1
|-
|
|
| This block prevents movement through it, and usually suffocates entities inside of it.
| 1
|-
|
|
| This block cannot be seen through.
|
|-
|
|
| This block requires a tool to give a drop.
| 0
|-
|
|
| This block can become lit from lava.
| 0
|-
|
|
| This block will be replaced from  another block on it.
| 0
|-
|
|
| Does not seem to be used anywhere in Minecraft, and is not displayed in the table.
| 0
|}
}}

Subclasses can also be set using  for to change the defaults based on coded subclasses. Values include:
* <code>liquid</code>
* * defaults  and  to 1
* * defaults  and  to 0
* * defaults  to "replace"
* <code>nonsolid</code>
* * defaults  to 1
* * defaults ,  and  to 0
* <code>portal</code>
* * defaults ,  and  to 0
* <code>liquid</code>
* * defaults  to 1
* * defaults ,  and  to 0
* <code>cobweb</code>
* * defaults  to 1

The parameter  can be set to determine the interaction when a piston pushes the block. Options are as follows:
* <code>pushed</code> - pushes the block, default
* <code>replace</code> - breaks the block being pushed
* <code>blocked</code> - stops the piston from extending

# Code
The parameters generally correspond to the actual structure of the code.
*  refers to actual subclasses of the <code>Material</code> class. Names mostly match, but "nonsolid" is <code>MaterialLogic</code>, while "cobweb" is the inline class used for the <code>web</code> material.
*  refers to the <code>isLiquid()</code> method.
*  refers to the <code>isSolid()</code> method.
*  refers to the <code>blocksLight()</code> method.
*  refers to the <code>blocksMovement()</code> method.
*  refers to the <code>setTranslucent()</code> and <code>isOpaque()</code> methods.
*  refers to the <code>setRequiresTool()</code> and <code>isToolNotRequired()</code> methods.
*  refers to the <code>setBurning()</code> and <code>getCanBurn()</code> methods.
*  refers to the <code>setReplaceable()</code> and <code>isReplaceable()</code> methods.
*  refers to the <code>setAdventureModeExempt()</code> method.
*  refers to the <code>setNoPushMobility()</code>, <code>setImmovableMobility()</code>, and <code>getMaterialMobility()</code> methods.

[Category:表格模板](Category:表格模板.md)
}}
<noinclude>
[en:Materials/properties row](en:Materials/properties row.md)
</noinclude>