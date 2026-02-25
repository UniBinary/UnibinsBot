# 命令/team

*页面ID: 39819* | *来源: Minecraft Wiki*

管理队伍。

# 语法
   <code>team list [<team>]</code>
  : 列出所有队伍，同时列出显示名称与包含的实体。可选的<code><team></code>参数可指定 只列出一个队伍。
   <code>team add <team> [<displayName>]</code>
  : 以给予的名称和显示名称创建队伍。<code><displayName></code>在未指定时默认为<code><team></code>的值。
   <code>team remove <team></code>
  : 移除指定队伍。
   <code>team empty <team></code>
  : 将队伍内的所有实体移出。
   <code>team join <team> [<members>]</code>
  : 使指定实体加入指定队伍，若未指定实体，则将命令的执行者加入该队伍。
   <code>team leave <members></code>
  : 使指定实体离开其所在队伍。
   <code>-{}-team modify <team> <*选项*> <*值*></code>
  : 修改指定的队伍的选项，详见下。

# 参数
（<code>list</code>、<code>remove</code>、<code>empty</code>、<code>join</code>和<code>modify</code>模式下）
   指定队伍的名称。


（<code>add</code>模式下）
   指定新队伍的名称。


   指定队伍被显示时的名称。


   指定需要加入或离开的实体。


<code>-{}-<*选项*></code>
  : 指定要更改的选项。
  : 必须为以下内容之一：
  :*<code>displayName</code>：设置队伍被显示时的名称。
  :*<code>color</code>：决定队伍与玩家在聊天栏、头顶、Tab菜单、侧边栏的颜色，以及实体带有[发光](发光.md)效果时的描边颜色。
  :*<code>friendlyFire</code>：启用/禁用同队伍玩家互伤。对队伍中的非玩家实体无效。
  :*<code>seeFriendlyInvisibles</code>：决定玩家观察同队伍的隐身玩家时，显示为半透明还是完全不可见。
  :*<code>nametagVisibility</code>：决定头上的名称标签是否可见。
  :*<code>deathMessageVisibility</code>：控制玩家死亡消息的可见性。
  :*<code>collisionRule</code>：控制队伍中实体的碰撞方式。
  :*<code>prefix</code>：修改玩家名称前缀。
  :*<code>suffix</code>：修改玩家名称后缀。

<code><*值*></code>
   指定<code>-{}-<*选项*></code>要更改为的值。
   下为每个选项可用的值：
  * 选项为<code>displayName</code>时：
  **  - 指定队伍被显示时的名称。
  * 选项为<code>color</code>时：
  **  -
  *** 默认为<code>reset</code>。若为<code>reset</code>，名称将以默认颜色与格式显示。
  * 选项为<code>friendlyFire</code>时：
  **  -
  *** <code>true</code> - （默认）启用同队伍玩家互伤。
  *** <code>false</code> - 禁用同队伍玩家互伤。
  * 选项为<code>seeFriendlyInvisibles</code>时：
  **  -
  *** <code>true</code> - （默认）玩家观察同队伍的隐身玩家时显示为半透明。
  *** <code>false</code> - 玩家无法看到同队伍的隐身玩家。
  * 选项为<code>nametagVisibility</code>时：
  ** <code>never</code> - 玩家头上的名称对所有玩家隐藏。
  ** <code>hideForOtherTeams</code> - 玩家头上的名称只对同队伍玩家显示。
  ** <code>hideForOwnTeam</code> - 玩家头上的名称只对非同队玩家显示。
  ** <code>always</code> - （默认）玩家头上的名称对所有玩家显示。
  * 选项为<code>deathMessageVisibility</code>时：
  ** <code>never</code> - 对所有玩家隐藏死亡消息。
  ** <code>hideForOtherTeams</code> - 对非同队玩家隐藏死亡消息。
  ** <code>hideForOwnTeam</code> - 对同队伍玩家隐藏死亡消息。
  ** <code>always</code> - （默认）死亡消息对所有玩家可见。
  * 选项为<code>collisionRule</code>时：
  ** <code>always</code> - （默认）正常碰撞。
  ** <code>never</code> - 该队伍中的实体不可碰撞。
  ** <code>pushOtherTeams</code> - 该队伍中的实体只能与同队伍中的实体碰撞，与字面意义相反。<ref name="bug"></ref>
  ** <code>pushOwnTeam</code> - 该队伍中的实体只能与非同队的实体碰撞，与字面意义相反。<ref name="bug"></ref>
  * 选项为<code>prefix</code>时：
  ** - 指定将显示的前缀。
  * 选项为<code>suffix</code>时：
  **  - 指定将显示的后缀。

# 结果

# 输出

# 示例

* 创建新的队伍，ID为<code>my_team</code>：<code>/team add my_team</code>
* 将所有玩家添加至<code>my_team</code>队伍中：<code>/team join my_team @a</code>
* 列出<code>my_team</code>队伍中的所有成员：<code>/team list my_team</code>
* 关闭<code>my_team</code>队伍的同队伍玩家互伤：<code>/team modify my_team friendlyFire false</code>
* 将随机玩家移出其所在的队伍：<code>/team leave @r</code>
* 清空<code>my_team</code>队伍中的所有成员：<code>/team empty my_team</code>
* 删除队伍<code>my_team</code>：<code>/team remove my_team</code>

# 历史

|。}}
|。
|加入了。}}
|现在为。
|加入了。
|队伍名称现在是文本组件，而不是原始字符串。}}
|
}}

# 参见
* — 管理记分板
* – 以字符串标记实体

# 参考

# 导航

[de:Befehl/team](de:Befehl/team.md)
[en:Commands/team](en:Commands/team.md)
[ja:コマンド/team](ja:コマンド/team.md)
[pt:Comandos/team](pt:Comandos/team.md)
[ru:Команды консоли/team](ru:Команды консоли/team.md)