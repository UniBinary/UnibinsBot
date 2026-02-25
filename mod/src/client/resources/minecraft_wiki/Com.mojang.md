# Com.mojang

*页面ID: 54360* | *来源: Minecraft Wiki*

和的数据文件夹|的数据文件夹|}}

是Minecraft的内部文件夹。里面包含了世界存档、JSON数据和其他游戏运行所需的文件。

# 定位

在Xbox One上，文件存储在本地。如果登录了Xbox Live，它们也会存储于线上。

在iOS上，于“文件（Files）”应用程序中查找即可访问此文件夹。

# 结构层次
<div class="treeview">
*
* * ：见[附加包](附加包#行为包.md)
* *
* **
* *
* *
* *
* *
* ** }}
* *
* ** ：[基岩版编辑器](基岩版编辑器.md)中储存的文件。
* ***
* **
* ***
* **
* **
* **
* **
* **
* **
* **
* **
* *
* **
* *** ：见[附加包](附加包#行为包.md)
* *** ：见[附加包](附加包#资源包.md)
* ***
* ****
* ***
* **** <ref group="注">未登录时为。</ref>
* *****
* ***
* **** {{file|file|<*语言代-{}-码*>.lang}}
* ****
* ***
* **** <ref group="注" name="ldb">区域ID是一个6位数字，包含玩家的区域后缀将是而非。</ref>
* **** <ref group="注" name="dat">在实际的世界文件夹中，该文件没有后缀。</ref>
* **** <ref group="注" name="dat"></ref>
* **** <ref group="注" name="dat"></ref>
* ****
* ***** <ref group="注" name="6digits"/>
* ***** <ref group="注" name="dat"></ref>
* ***
* ***
* ***
* ***
* *** <ref group="注">仅在[超平坦](超平坦.md)世界类型从[基岩版1.18.0](基岩版1.18.0.md)以下更新到其以上时出现，用于标记世界中存在的村庄。</ref>
* ***
* ***
* ***
* ***
* ***
* ***
* * ：见[附加包](附加包#资源包.md)
* * ：见[截图](截图#基岩版.md)
* **
* ***
* *** }}
* ***
* *
* **
* ***
* ****
* **** {{file|file|<*语言代-{}-码*>.lang}}
* ***
* ***
* ***
* * （可能多于1个）
* * （可能多于1个）
* *
* **
* *** ：见[附加包](附加包#行为包.md)
* *** ：见[附加包](附加包#资源包.md)
* ***
* **** {{file|file|<*语言代-{}-码*>.lang}}
* ****
* ***
* ****
* ***** <ref group="注" name="6digits">区域ID是一个6位数字。</ref>
* ***** <ref group="注" name="dat"></ref>
* **** <ref group="注" name="ldb"></ref>
* **** <ref group="注" name="dat"></ref>
* **** <ref group="注" name="dat"></ref>
* **** <ref group="注" name="dat"></ref>
* ***
* ***
* ***
* ***
* ***
* ***
* *
</div>

# = 附加包 =

每个世界和世界模板，以及文件夹本身，都带有一个和文件夹。

# 历史

|文件夹，层次结构如下：
<div class"treeview">
*
* *
* **
* *** ：储存[区块](区块.md)数据。
* *** ：储存世界的信息。
* *** ：储存[玩家](玩家.md)数据。
</div>
}}
|{{HistoryLine||0.2.0|加入了{{file|file|-{}-<*世界名称*>/entities.dat}}，用于储存[实体](实体.md)数据。
|的功能由取代。旧的仍然存在但不再更新。}}
<!--疑似漏洞，不收录
|.  does not have any additional subfolders or files.}}-->
|{{HistoryLine||0.5.0|在{{file|directory|-{}-<*世界名称*>}}文件夹中加入了作为的备份。}}
|文件夹，内含和两个文件。
|加入了{{file|directory|-{}-<*世界名称*>/players}}文件夹。}}
|文件夹。}}
|的层次结构如下（<span class="history-deleted">划线标记</span>指的是旧格式世界转为新格式过程中生成的临时文件）：|content=
<div class="treeview">
*
* *
* **
* **
* *
* **
* **
* ***
* ****
* ****
* **** ：内容为“MANIFEST-######”。
* **** ：一个空文件。
* ****
* *** "history-deleted">chunks.dat</span>}}
* *** "history-deleted">entities.dat</span>}}
* *** "history-deleted">importedchunks.dat</span>}}：标记哪些区块已被转为新格式。
* ***
</div>}}
|游戏不再新建或更新文件，但已存在的文件仍在发挥作用。}}
|文件夹中加入了和。}}
|文件夹。}}
|文件夹，包括名为的一个至多个文件，以及。
|现在新创建的世界文件夹名为{{file|directory|-{}-<*内部世界ID*>}}而非{{file|directory|-{}-<*世界名称*>}}。
|加入了{{file|file|-{}-<*内部世界ID*>/levelname.txt}}。
|现在在编辑世界菜单中更改设置时，会创建并覆盖，尽管后者在进入世界时会重新创建。}}
|文件夹从移动至。旧的文件夹仍然存在但不再更新。}}
|文件夹。}}
|，内容为“”。
|游戏不再新建和文件。}}
|，内容为“”。
|游戏不再新建文件。
|玩家退出世界时，游戏会生成。}}
|，内容为“”。
|游戏不再新建文件。}}
|默认为空。
|现在会在每个{{file|directory|-{}-<*内部世界ID*>}}文件夹中新建。}}
|，默认为空。}}
|文件夹中加入了和两个文件夹，均默认为空。
|加入了。
|文件被取代。
|在{{file|directory|-{}-<*内部世界ID*>}}文件夹中加入了和两个文件夹，均默认为空。
|在{{file|directory|-{}-<*内部世界ID*>}}文件夹中加入了和两个文件。
|游戏不再新建。
|
的层次结构如下：|content=
<div class="treeview">
*
* *
* *
* **
* **
* **
* *
* **
* ***
* ***
* ****
* ****
* ****
* ****
* ****
* ***
* ***
* ***
* ***
* ***
* *
* *
</div>}}
}}
|
|文件夹的存储位置被更改了。
|新位置现在位于{{filepath|-{}-/storage/emulated/*<Android用户ID*><ref group="注" name="auid">Android系统给使用者分配的用户ID，一般情况下设备拥有者的用户ID为0。</ref>/Android/data/com.mojang.minecraftpe/files/games/com.mojang}}，而旧位置位于{{filepath|-{}-/storage/emulated/*<Android用户ID*><ref group="注" name="auid"/>/games/com.mojang}}}}
|、和文件夹。<ref name="mcpe"></ref>
|游戏不再新建和。}}
|文件夹。}}
|文件夹。<ref name="mcpe"/>
|现在游戏会新建和。<ref name="mcpe"/>}}
<!-- 加入版本至多为1.21.2 -->
|。}}
<!-- 1.21.2仍然存在，1.21.50不存在 -->
|，取而代之的是文件夹。
|游戏会在每次启动时将复制到。}}
<!-- 1.21.2仍然存在，1.21.50不存在 -->
|和。}}
|文件夹的存储位置被更改了。
|[Minecraft Preview](Minecraft Preview.md)上的新位置现在位于：
* 独立内容：<br>
* 共享内容：<
|而旧位置位于。}}
|<br>
* 共享内容：<br>
|而旧位置位于。}}
}}

# 注释

# 参考

# 导航

[en:Com.mojang](en:Com.mojang.md)
[es:Com.mojang](es:Com.mojang.md)
[fr:Com.mojang](fr:Com.mojang.md)
[ja:Com.mojang](ja:Com.mojang.md)
[lzh:Com.mojang](lzh:Com.mojang.md)
[pt:Com.mojang](pt:Com.mojang.md)