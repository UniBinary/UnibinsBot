# Version manifest.json

*页面ID: 45858* | *来源: Minecraft Wiki*

<span></span>

<samp>**version_manifest.json**</samp>及其变种<samp>**version_manifest_v2.json**</samp>是一个来自piston-meta.mojang.com的包含[Java版版本记录](Java版版本记录.md)列表的文件。它为[启动器](启动器.md)列出了可用的Minecraft版本。

如果一个版本不在这个列表中，则被认为是[在启动器中不可用](启动器中丢失的版本.md)，如[Java版1.14.3 - Combat Test](Java版1.14.3 - Combat Test.md)。

这个列表将在每次[Mojang](Mojang.md)发布新版[Java版](Java版.md)时更新。

# JSON格式
这是<samp>version_manifest.json</samp>的JSON格式。

<div class="treeview">
*  根标签。
* * ：最新的稳定发布版和快照版。
* ** ：最新稳定发布版的版本ID。
* ** ：最新快照版的版本ID。
* * ：可用版本列表。
* ** ：其中一个版本条目。
* *** ：该版本的ID。
* *** ：版本类型，可以是：（[正式版](Java版版本记录#正式版.md)）、（[快照](快照.md)）、（[Beta版](Java版Beta.md)）或（[Alpha及更早的版本](Old Alpha.md)）。
* *** ：下载版本对应的[*<version id>*.json](client.json.md)文件链接。
* *** ：使用[ISO 8601](wzh:ISO_8601.md)格式化的数据，用于表示版本的更新时间。
* *** ：使用[ISO 8601](wzh:ISO_8601.md)格式化的数据，用于表示版本的发布时间。
* *** （仅v2）：该版本的SHA1散列值，也是JSON文件的ID。
* *** （仅v2）：如果为0，启动器会警告用户此版本因老旧而不足以支持最新的玩家安全特性。其他情况为1。
</div>

# 历史
|托管<samp>version_manifest.json</samp>和<samp>version_manifest_v2.json</samp>文件的主机由<code>launchermeta.mojang.com</code>改为<code>piston-meta.mojang.com</code>。}}
}}

# 外部链接
* [<samp>version_manifest.json</samp>](https://piston-meta.mojang.com/mc/game/version_manifest.json)
* [<samp>version_manifest_v2.json</samp>](https://piston-meta.mojang.com/mc/game/version_manifest_v2.json)

# 导航

[Category:开发](Category:开发.md)

[en:Version_manifest.json](en:Version_manifest.json.md)
[fr:Version_manifest.json](fr:Version_manifest.json.md)
[lzh:Version_manifest.json](lzh:Version_manifest.json.md)
[pt:Version_manifest.json](pt:Version_manifest.json.md)
[ru:Version_manifest.json](ru:Version_manifest.json.md)