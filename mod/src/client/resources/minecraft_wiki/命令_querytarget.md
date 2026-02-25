# 命令/querytarget

*页面ID: 44642* | *来源: Minecraft Wiki*

<br>0
|nocmdblock=1
|cheat=1
}}
返回指定实体的详细信息。

# 用法
信息将以[JSON](JSON.md)返回，格式见下：
<div class="treeview">
*  JSON根数组
* * ：一项实体信息。
* ** ：实体所处[维度](维度.md)。0为主世界，1为下界，2为末地。
* ** ：实体的唯一ID。
* ** ：实体所处位置的[坐标](坐标.md)。
* *** ：X轴坐标。
* *** ：Y轴坐标。
* *** ：Z轴坐标。
* ** ：玩家的[UUID](UUID.md)或非玩家实体的唯一ID。
* ** ：实体的Y轴旋转角度。
</div>

# = 返回信息示例 =
<syntaxhighlight lang="json">
目标数据：[
   {
      "dimension" : 0,
      "id" : -21474836477,
      "position" : {
         "x" : 95.57814788818359,
         "y" : 43.69106674194336,
         "z" : -46.34045791625977
      },
      "uniqueId" : "45f4943f-cb75-37cb-87a8-873d8abfff8f",
      "yRot" : 41.42701721191406
   },
   {
      "dimension" : 0,
      "id" : -21474836478,
      "position" : {
         "x" : 95.57814788818359,
         "y" : 21.94908905029297,
         "z" : -46.34045791625977
      },
      "uniqueId" : "-21474836478",
      "yRot" : 0.0
   }
]
</syntaxhighlight>

# 语法
   <code>querytarget <victim: target></code>

# 参数



# 结果

# 导航

[en:Commands/querytarget](en:Commands/querytarget.md)
[lzh:令/querytarget](lzh:令/querytarget.md)
[pt:Comandos/querytarget](pt:Comandos/querytarget.md)