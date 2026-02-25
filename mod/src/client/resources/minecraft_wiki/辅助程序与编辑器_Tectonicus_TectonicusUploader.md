# 辅助程序与编辑器/Tectonicus/TectonicusUploader

*页面ID: 16261* | *来源: Minecraft Wiki*

| programming language = Python
| version = 0.3
| license =
| source available = 是
| date = 2011年7月
}}

TectonicusUploader是一个python脚本，用于上传Changed.txt中的文件，这些文件是地图查看工具[Tectonicus](Tectonicus.md)创建的。

使用*python uploader.py*运行它。

# 更新日志
# = V 0.5 =
新增上传失败后的错误处理功能。现在会不断尝试上传，直至成功为止。

# = V 0.4 =
修复Windows版本的漏洞。此前打开无binary标签（open(..., 'rb')）的图像时，会在第一个空字节处结束，而非文件结束符，此问题已解决。

# = V 0.3 =
修复脚本创建多个文件夹时出现的漏洞。例如针对全新的查看工具，脚本现已优化为仅创建一次文件夹。

# = V 0.2 =
做了一些小改动，以更好地适配Linux系统。

# = V 0.1 =
初始版本。

[Category:自定义软件](Category:自定义软件.md)

[en:Tutorials/Programs and editors/Tectonicus/TectonicusUploader](en:Tutorials/Programs and editors/Tectonicus/TectonicusUploader.md)