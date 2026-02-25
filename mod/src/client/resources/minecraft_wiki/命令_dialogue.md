# 命令/dialogue

*页面ID: 84352* | *来源: Minecraft Wiki*

为玩家打开或改变[NPC](NPC.md)的对话框。

# 语法
  <code>dialogue open <npc: target> <player: target> [sceneName: string]</code>
  :打开NPC的对话，或以该NPC为活动对象进行场景对话。
  <code>dialogue change <npc: target> <sceneName: string> [players: target]</code>
  :通过场景文件改变NPC的对话。

# 参数

  指定要打开或改变的NPC目标。
  且必须为单个NPC。

  指定从导入的行为包中对话文件显示的场景。

* 必须是一个场景名称（无空格）或有双引号字符串（可含有空格）。
* 在<code>open</code>中为可选参数，如果未指定，将使用该NPC最后的场景进行对话。
* 在<code>change</code>中必须指定场景，否则改变无效。

  指定打开NPC对话框的目标玩家，
  对于NPC内置的命令界面，有一个特有的选择器变量为[@initiator](目标选择器#@initiator.md)，它可以选择当前与该NPC进行交互（例如打开NPC对话框、使用NPC按钮和关闭NPC对话框）的玩家。如果该选择器用于NPC内置命令以外的命令，则不会选择到任何目标，也不会报错。
* 在<code>open</code>中为必选参数，用于指定打开对话的目标玩家；
* 在<code>change</code>中为可选参数，用于决定是否仅改变该NPC对该玩家的对话，若为空，则改变该NPC对全局的对话。

# 结果

# 输出

# 示例
* 为Steve打开距离自己最近的NPC对话框：
   <code>/dialogue open @e[type=npc,c=1] Steve</code>
* 以最近的NPC为活动对象给Steve从场景文件中打开名为chat_1的对话：
   <code>/dialogue open @e[type=npc,c=1] Steve chat_1</code>
* 将最近的NPC的对话改变为场景文件中名为chat_2的对话:
   <code>/dialogue change @e[type=npc,c=1] chat_2</code>
* 将最近的NPC对Steve的对话改变为场景文件中名为chat_3的对话:
   <code>/dialogue change @e[type=npc,c=1] chat_3 Steve</code>

# 历史

|。}}
}}

# 导航

[de:Befehl/dialogue](de:Befehl/dialogue.md)
[en:Commands/dialogue](en:Commands/dialogue.md)
[ja:コマンド/dialogue](ja:コマンド/dialogue.md)
[lzh:令/dialogue](lzh:令/dialogue.md)
[pt:Comandos/dialogue](pt:Comandos/dialogue.md)