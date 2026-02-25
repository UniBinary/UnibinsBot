# 命令/music

*页面ID: 70531* | *来源: Minecraft Wiki*

允许玩家控制[音乐](音乐.md)。

# 语法
   <code>music play <trackName: string> [volume: float] [fadeSeconds: float] [repeatMode: MusicRepeatMode]</code>
  : 播放音乐。
   <code>music queue <trackName: string> [volume: float] [fadeSeconds: float] [repeatMode: MusicRepeatMode]</code>
  : 将音乐添加到队列中。
   <code>music stop [fadeSeconds: float]</code>
  : 停止播放音乐。
   <code>music volume <volume: float></code>
  : 调整音乐音量。

# 参数

   指定播放音乐名。
   必须是单个单词（不含空格）或带引号的字符串。
   必须为音乐名或为Json路径指向的 <samp><a_resource_pack>/sounds/sound_definitions.json</samp> 文件中的 <code>"record.<music_name>"</code> 或 <code>"music.game.<music_name>"</code> （例如使用 <code>record.cat</code> 来播放音乐唱片cat）

   调整音乐音量
   必须为浮点数，最小值为0，最大值为1.00。

   调整音乐淡入/淡出时间
   必须为浮点数，最小值为0，最大值为10。

   指定是否循环播放音乐，默认为<code>play_once</code>。
   所取值必须为 <code>loop</code> 与 <code>play_once</code> 中的一个。

# 结果

# 输出

# 示例
* 循环播放音乐唱片Pigstep：<code>/music play record.pigstep 0.5 0 loop</code>
* 将音乐唱片Stal添加到播放列表且仅播放一次：<code>/music queue record.stal 0.5 0 play_once</code>

# 历史

|。}}
}}

# 导航

[de:Befehl/music](de:Befehl/music.md)
[en:Commands/music](en:Commands/music.md)
[ja:コマンド/music](ja:コマンド/music.md)
[lzh:令/music](lzh:令/music.md)
[pt:Comandos/music](pt:Comandos/music.md)
[ru:Команды консоли/music](ru:Команды консоли/music.md)