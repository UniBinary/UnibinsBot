# Java版22w07a

*页面ID: 93034* | *来源: Minecraft Wiki*

<onlyinclude>

* *22w07a**是[Java版1.18.2](Java版1.18.2.md)的第4个，也是最后一个快照，发布于2022年2月16日<ref></ref>，修复了一些漏洞。

# 新内容
# = 世界生成 =
* *[自定义世界生成](自定义世界生成.md)**
* 在已配置结构文件中加入了<code>biomes</code>字段，值是一个标签。

# = 常规 =
* *[标签](Java版标签.md)**
* 在原版数据包中加入了以下生物群系标签：
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* * ：。
* 加入了用于指定结构可以在哪些生物群系中生成的生物群系标签，存储于<samp>tags/worldgen/biome/has_structure</samp>下。
* * 可以在其中的<code>values</code>字段中指定结构可以在哪些生物群系（可为生物群系ID或生物群系标签）中生成。

# 更改
# = 常规 =
* *[调试屏幕](调试屏幕.md)**
* 将"Terrain"行合并进"Multinoise"行，并更名为"NoiseRouter"，新格式为：{{cd|-{}-NoiseRouter T: *数据* H: *数据* C: *数据* E: *数据* D: *数据* W: *数据* PV: *数据* AS: *数据* N: *数据*}}。
* * 与之前"Multinoise"行中的同名值一致。
* * 与之前"Terrain"行中的同名值一致。
* * 是深度，是不加粗糙度的原始密度值，是最终密度值。和其他数据不同，这三项在受到X、Z轴坐标影响的同时也受到Y轴（高度）的影响。当坐标位于地面以上，这三个值通常为负数；而坐标在地下时，这三个值通常为正数。

* *[标签](Java版标签.md)**
* 从标签中移除了，并加入了。

# 修复
</onlyinclude>

# 参考

# 导航

[de:22w07a](de:22w07a.md)
[en:Java Edition 22w07a](en:Java Edition 22w07a.md)
[es:Java Edition 22w07a](es:Java Edition 22w07a.md)
[fr:Édition Java 22w07a](fr:Édition Java 22w07a.md)
[ja:Java Edition 22w07a](ja:Java Edition 22w07a.md)
[lzh:二二週〇七甲](lzh:二二週〇七甲.md)
[pt:Edição Java 22w07a](pt:Edição Java 22w07a.md)
[ru:22w07a (Java Edition)](ru:22w07a (Java Edition).md)