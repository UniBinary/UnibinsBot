# 命令/inputpermission

*页面ID: 102966* | *来源: Minecraft Wiki*

对玩家的权限状态进行指定操作。

# 语法
  <code>inputpermission query <targets: target> <permission: permission> [state: state]</code>
  :查询目标的指定权限的状态。
  <code>inputpermission set <targets: target> <permission: permission> <state: state></code>
  :修改目标的指定权限的状态。

# 参数

  指定权限的拥有者。


  指定操作所作用的权限。
  必须为以下其中之一：
  *  — 转动相机视角
  *  — 停止骑乘
  *  — 跳跃和向上飞行
  *  — 移动
  *  — 骑乘
  *  — 向后移动
  *  — 向前移动
  *  — 向左移动
  *  — 向右移动
  *  — 移动、潜行、跳跃和飞行
  *  — 潜行和向下飞行

  指定权限的状态。
  必须为<code>enabled</code>（启用）或<code>disabled</code>（禁用）。
  对于<code>... query ...</code>，如果未指定，则会查询所有的状态；如果已指定，则仅在当前权限状态为指定状态时命令执行成功。

# 结果

# 输出

# 示例
* 禁用所有玩家的转动相机视角权限：<code>/inputpermission set @a camera disabled</code>
* 禁用所有玩家的移动权限：<code>/inputpermission set @a movement disabled</code>

# 历史

|。}}
|命令的<code>permission: permission</code>参数接受更多值。}}
}}

# 导航

[de:Befehl/inputpermission](de:Befehl/inputpermission.md)
[en:Commands/inputpermission](en:Commands/inputpermission.md)
[ja:コマンド/inputpermission](ja:コマンド/inputpermission.md)
[lzh:令/inputpermission](lzh:令/inputpermission.md)
[pt:Comandos/inputpermission](pt:Comandos/inputpermission.md)