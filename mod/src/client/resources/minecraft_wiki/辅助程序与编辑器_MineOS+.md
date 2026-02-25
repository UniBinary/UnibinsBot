# 辅助程序与编辑器/MineOS+

*页面ID: 16494* | *来源: Minecraft Wiki*

| license = GNU GPL 3.0
| programming language = Python、PHP
| version = 0.4.6
| size = 103MB
| date = 2012年6月30日
| source available = 是
| minecraft version = 1.4.6
| website = http://www.mineosplus.org/
| forum = http://www.mineosplus.org/forum
| notes = 一个服务Minecraft的完整操作系统。
}}
* *MineOS+**是一款专注于减少Minecraft运行环境人工配置的[Linux](wikipedia:Linux.md)发行版，在增加功能的同时，保留了Minecraft所有的定制性和功能。它主要设计用于虚拟环境（如Virtualbox/VMWare），不过也可作为本地操作系统安装在电脑上。它是[Tiny Core Linux](http://tinycorelinux.com)项目“microcore”的分支。

# 安装
# = 如何安装MineOS+ =
下载[官方服务器ISO](http://mineos.phant0m.net/MineOS+/Releases.html)，并按照[主页](http://mineos.phant0m.net/MineOS+/Getting_Started.html)的指示进行安装。

# 配置
# = 如何自定义MineOS+ =
社区制作了大量[教程](http://www.mineosplus.org/wiki/)，帮助用户完成导入世界、使用虚拟硬盘、减轻服务器负载等常见操作。此外，MineOS+与其他发行版一样可修改，关于添加MineOS+组件的准确信息，详见[tinycorelinux网站](http://www.tinycorelinux.com/)。

# MineOS+特点
# = 连通性和安全性 =
MineOS+使用SSH及基于SSH的SCP（类FTP文件服务器），确保能安全、可控地访问服务器文件，通过SCP浏览器（如WinSCP和Filezilla）可轻松编辑和更新文件。

它采用IP表进行防火墙保护，仅开放安全所需端口，如22（SSH）、80（向最终用户生成地图）、8080（网络管理员）和25565（Minecraft），这些端口可按需修改。

# 链接
* [MineOS+网站](http://www.mineosplus.org/)
* [MineOS+社区](http://www.mineosplus.org/forum/)
* [MineOS+ Wiki](http://www.mineosplus.org/wiki/)

[Category:服务器](Category:服务器.md)