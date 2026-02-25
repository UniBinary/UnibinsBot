# 命令/camera

*页面ID: 104440* | *来源: Minecraft Wiki*

修改玩家的相机视角。

# 语法
   <code>**/camera** <players: target> ...</code>
  * <code>... **attach_to_entity** <entity: target></code>
  * <code>... **clear**</code>
  * <code>... **detach_from_entity**</code>
  * <code>... **fade** ...</code>
  ** <code>... color <red: int> <green: int> <blue: int></code>
  ** <code>... time <fadeInSeconds: float> <holdSeconds: float> <fadeOutSeconds: float> ...</code>
  *** <code>... [color <red: int> <green: int> <blue: int>]</code>
  * <code>... **fov_clear** [fovEaseTime: float] [fovEaseType: Easing]</code>
  * <code>... **fov_set** <fov_value: float> [fovEaseTime: float] [fovEaseType: Easing]</code>
  * <code>... **play_spline** <name: string></code>
  * <code>... **remove_target**</code>
  * <code>... **set** <preset: string> ...</code>
  ** <code>... [default: default]</code>
  ** <code>... ease <easeTime: float> <easeType: Easing> ...</code>
  *** <code>... [default: default]</code>
  *** <code>... entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float></code>
  *** <code>... facing ...</code>
  **** <code>... <lookAtEntity: target></code>
  **** <code>... <lookAtPosition: x y z></code>
  *** <code>... pos <position: x y z> ...</code>
  **** <code>... [facing ...]</code>
  ***** <code>... <lookAtEntity: target></code>
  ***** <code>... <lookAtPosition: x y z></code>
  **** <code>... rot <xRot: value> <yRot: value></code>
  *** <code>... rot <xRot: value> <yRot: value> ...</code>
  **** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  **** <code>... view_offset <xViewOffset: float> <yViewOffset: float> ...</code>
  ***** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  *** <code>... view_offset <xViewOffset: float> <yViewOffset: float> ...</code>
  **** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  ** <code>... entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float></code>
  ** <code>... facing ...</code>
  *** <code>... <lookAtEntity: target></code>
  *** <code>... <lookAtPosition: x y z></code>
  ** <code>... pos <position: x y z> ...</code>
  *** <code>... [facing ...]</code>
  **** <code>... <lookAtEntity: target></code>
  **** <code>... <lookAtPosition: x y z></code>
  *** <code>... rot <xRot: value> <yRot: value></code>
  ** <code>... rot <xRot: value> <yRot: value> ...</code>
  *** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  *** <code>... view_offset <xViewOffset: float> <yViewOffset: float> ...</code>
  **** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  ** <code>... view_offset <xViewOffset: float> <yViewOffset: float> ...</code>
  *** <code>... [entity_offset <xEntityOffset: float> <yEntityOffset: float> <zEntityOffset: float>]</code>
  * <code>... **target_entity** <entity: target> ...</code>
  ** <code>... [target_center_offset <xTargetCenterOffset: float> <yTargetCenterOffset: float> <zTargetCenterOffset: float>]</code>

  :; 以多种方式展示语法
  ::
  ::

# 参数

   指定将被修改相机视角的玩家。


   指定相机将要固定于的实体。


、和
   指定相机视角的RGB颜色。
   且必须在0和255之间（含）。

、和
   指定相机视角的淡入、保持和淡出持续时间，单位为秒。
   且必须在0.0和10.0之间（含）。

   指定相机视场角。
   由于游戏限制，实际的有效值范围在30和110之间（含）。

   指定相机视场角平滑过渡的持续时间（秒），默认为0。


   指定用于相机视场角的运镜函数/类型，默认为。
   必须是之一。

   指定样条ID。只在使用预设时有效。



   相机视角/预设。
   必须为以下其中之一：
  * <code>minecraft:control_scheme_camera</code> — 控制方案相机。
  * <code>minecraft:first_person</code> — 第一人称视角。
  * <code>minecraft:fixed_boom</code> — 固定镜头视角的轨道相机。
  * <code>minecraft:follow_orbit</code> — 轨道相机。
  * <code>minecraft:free</code> — 自由视角。
  * <code>minecraft:third_person</code> — 第三人称视角背面。
  * <code>minecraft:third_person_front</code> — 第三人称视角正面。

   指定相机视角平滑过渡的持续时间（秒）。只在使用预设时有效。


   指定用于相机视角的运镜函数/类型。只在使用预设时有效。
   必须是之一。

   指定将自由视角的位置和朝向改为默认值（相机位置（0,0,0），旋转角度<code>xRot</code>=0，<code>yRot</code>=0）。只在使用<code>minecraft:free</code>预设时有效。
   必须为<code>default</code>。

   指定相机视角朝向的实体。只在使用<code>minecraft:free</code>预设时有效。


   指定相机视角朝向的坐标。只在使用<code>minecraft:free</code>预设时有效。


   指定相机视角的位置。只在使用<code>minecraft:free</code>预设时有效。


   指定相机视角的垂直旋转角度。在使用<code>minecraft:follow_orbit</code>预设的情况下，还将修改玩家的朝向。
   且必须在-90和90之间（含）。

   指定相机视角的水平旋转角度。在使用<code>minecraft:follow_orbit</code>预设的情况下，还将修改玩家的朝向。


和
   指定相机视角的偏移量。只在使用<code>minecraft:follow_orbit</code>预设时有效。
   且必须在-64和64之间（含）。

、和
   指定相机视角相对于实体的偏移量。只在使用<code>minecraft:follow_orbit</code>预设时有效。
   且必须在-64和64之间（含）。

   指定要将相机视角聚焦的实体。只在使用<code>minecraft:free</code>预设时有效。


、和
   指定相机视角相对于聚焦/目标实体中心的偏移量。只在使用<code>minecraft:free</code>预设时有效。


# 结果

# 输出

# 示例

[thumb|实现的“越肩视角”](File:Over Shoulder Camera.jpg.md)

* 为自己设置持续5秒、运镜模式为<code>in_out_circ</code>、在当前位置上方5格绕X轴旋转90度的<code>minecraft:free</code>（自由视角）相机视角：
  : <code>/camera @s set minecraft:free ease 5 in_out_circ pos ~ ~5 ~ rot 90 0</code>
* 清除所有玩家的相机视角效果：
  : <code>/camera @a clear</code>
* 为随机玩家设置2秒淡入、持续1秒、淡出3秒和颜色纯白的相机视角效果：
  : <code>/camera @r fade time 2 1 3 color 255 255 255</code>
* 配合命令，为最近的玩家赋予“越肩视角”（需在[循环型命令方块](循环型命令方块.md)中执行）：
  : <code>/execute as @p at @s run camera @s set minecraft:free ease 0.25 in_out_quad pos ^-2 ^2 ^-4 facing ^ ^ ^5</code>

# 历史

|，属于开发者命令。}}
|现在可通过开启[实验性玩法](实验性玩法.md)来启用。}}
|相机预设。
|褪色值现在是在0和255之间的整数而不是0.0到1.0。
|相机的淡入、保持和淡出持续时间必须在0.0和10.0之间。}}
|语法。
|加入了相机预设。}}
|不再属于[实验性玩法](实验性玩法.md)。
|移除了相机预设。}}
|语法。
|加入了相机预设。}}
|语法。}}
|语法。}}
|语法和相机预设不再属于[实验性玩法](实验性玩法.md)。}}
|相机预设。}}
|
|相机预设不再属于[实验性玩法](实验性玩法.md)。}}
|相机预设。}}
|语法现在可以搭配语法使用。}}
|语法，用于控制相机视场角。}}
|语法加入了用于控制相机运镜的参数。}}
|语法不再属于[实验性玩法](实验性玩法.md)。}}
|语法，用于将相机固定或取消固定于实体上。}}
|语法，用于从行为包中播放样条。}}
}}

# 导航

[de:Befehl/camera](de:Befehl/camera.md)
[en:Commands/camera](en:Commands/camera.md)
[ja:コマンド/camera](ja:コマンド/camera.md)
[pt:Comandos/camera](pt:Comandos/camera.md)