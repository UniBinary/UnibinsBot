# 命令/vote

*页面ID: 108762* | *来源: Minecraft Wiki*

管理投票和[投票规则](投票规则.md)。

# 语法
   <code>vote dump_all [long|short]</code>
  : 在日志输出所有投票规则的信息，并在聊天栏输出“Whew! That was scary!（呼！太可怕了！）”。
   <code>vote io (flush|reload)</code>
  : 刷新或重新加载投票。
   <code>vote pending discard (*|<id>)</code>
  : 放弃投票，不启用投票规则。
   <code>vote pending finish (*|<id>)</code>
  : 结束投票，根据结果启用投票规则。
   <code>vote pending repeal</code>
  : 开始为废除投票规则投票。
   <code>vote pending start <rule></code>
  : 开始为启用投票规则投票，参数随机。
   <code>vote pending vote <id> <option> [<count>]</code>
  : 为指定投票的选项投票。
   <code>vote rule <rule> approve [?|<value>]</code>
   <code>vote rule&ensp;? approve</code>
  : 启用投票规则。
   <code>vote rule <rule> repeal [*|?|<value>]</code>
   <code>vote rule (*|?) repeal</code>
  : 废除投票规则。

# 参数
short}}
   指定日志中输出的信息。默认为。
  *  — 输出完整介绍，格式为：
<pre>-{}-
<投票规则ID>
	Example proposals:
		<JSON数据>
			 Approve: <投票规则启用表述>
			 Repeal: <投票规则废除表述>
</pre>
  *  — 仅输出简介，格式为：{{cd|-{}-<投票规则ID>:&nbsp;"<投票规则表述，每个参数使用逗号分隔>"}}

   所有投票规则或效果。

   随机投票规则或效果。

   指定投票规则名称。


   指定投票的[UUID](UUID.md)。


   指定投票的选项。


   指定票数。默认为1。


   指定对应投票规则的参数。


# 结果

# 输出

# 导航

[vote](Category:命令.md)

[en:Commands/vote](en:Commands/vote.md)
[ja:コマンド/vote](ja:コマンド/vote.md)
[pt:Comandos/vote](pt:Comandos/vote.md)