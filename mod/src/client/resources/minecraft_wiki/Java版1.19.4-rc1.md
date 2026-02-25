# Java版1.19.4-rc1

*页面ID: 102827* | *来源: Minecraft Wiki*

<onlyinclude>

* *1.19.4-rc1**是[Java版1.19.4](Java版1.19.4.md)的首个发布候选版本，发布于2023年3月9日<ref></ref>，修复了一些漏洞。

# 更改
# = 非生物实体 =
* *[展示实体](展示实体.md)**
* 对插值过程做了以下更改：
* * 插值过程现在会在客户端游戏刻起始时开始。
* * 替代了字段，且含义与之前的不同：
* ** 代表当接收到用以启动插值的更新后，从下个客户端游戏刻起始时计算的游戏刻数量。
* *** 例如：值为0，当接收到用以启动插值的更新后，插值过程会在下个客户端游戏刻起始时开始。
* ** 不存储在实体数据中。
* *** 使用命令时，若插值被更新但未出现在修改过的NBT标签中时，插值会在上一次更新的时刻上继续执行，但此时使用新值。

# 修复
</onlyinclude>

# 参考

# 导航

[de:1.19.4-rc1](de:1.19.4-rc1.md)
[en:Java Edition 1.19.4 Release Candidate 1](en:Java Edition 1.19.4 Release Candidate 1.md)
[es:Java Edition 1.19.4 Release Candidate 1](es:Java Edition 1.19.4 Release Candidate 1.md)
[fr:Édition Java 1.19.4 Release Candidate 1](fr:Édition Java 1.19.4 Release Candidate 1.md)
[ja:Java Edition 1.19.4 Release Candidate 1](ja:Java Edition 1.19.4 Release Candidate 1.md)
[pt:Edição Java 1.19.4 Release Candidate 1](pt:Edição Java 1.19.4 Release Candidate 1.md)
[ru:1.19.4 Release Candidate 1 (Java Edition)](ru:1.19.4 Release Candidate 1 (Java Edition).md)