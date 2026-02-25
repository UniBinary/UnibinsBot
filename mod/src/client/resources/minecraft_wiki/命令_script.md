# 命令/script

*页面ID: 100757* | *来源: Minecraft Wiki*

调试GameTest框架选项。

# 语法
  <code>script debugger close</code>
  :关闭调试器。
  <code>script debugger connect [host: string] [port: int]</code>
  :将调试器的指定端口连接至指定主机。
  <code>script debugger listen <port: int></code>
  :监听调试器的指定端口。
  <code>script diagnostics startcapture</code>
  <code>script diagnostics stopcapture</code>
  :开始或停止捕获诊断。
  <code>script profiler start</code>
  <code>script profiler stop</code>
  :启用或禁用跟踪脚本性能的分析器。

# 参数

  指定主机的名称。


  指定调试器的[端口](wzh:通讯埠.md)，可用端口范围为1024-65535。


# 结果

||fail}}

# 示例
* 将调试器的8000端口连接至本地回环：<code>/script debugger connect 127.0.0.1 8000</code>
* 监听调试器的8000端口：<code>/script debugger listen 8000</code>

# 历史

|。}}
|
|
|现在需要加载脚本才可使用。}}
|现在无需加载脚本即可使用。}}
|不再属于[实验性玩法](实验性玩法.md)。}}
|
|
}}

# 导航

[de:Befehl/script](de:Befehl/script.md)
[en:Commands/script](en:Commands/script.md)