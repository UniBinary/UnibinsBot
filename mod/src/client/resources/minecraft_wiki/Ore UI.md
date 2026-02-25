# Ore UI

*页面ID: 144577* | *来源: Minecraft Wiki*

| programming language= 和
| version= React Facet: [v0.6.2](https://github.com/Mojang/ore-ui/releases/tag/v0.6.2)
| date= 初次提交于2021年10月11日<ref></ref>
| license=
| size= 1.18 MB
| source available= 是
| website= https://github.com/Mojang/ore-ui
}}

* *Ore UI**是一套专为使用构建而设计的开源包集合。它基于和开发，为和通用提供可复用的构建模块。<ref name="ore-ui-github"></ref>目前，Ore UI已被应用于[基岩版](基岩版.md)和[Minecraft Legends](Minecraft Legends.md)等游戏中。

[缩略图|的新UI设计系统大改<ref></ref>](File:Ore UI Design System.png.md)

开发团队正采用Coherent Labs<ref name="react-advanced-2021-ore-ui"/><ref name="dotjs-hummingbird-tech-preview"></ref><ref name="powered-by-coherent-labs"></ref>研发的Gameface引擎（前身为Hummingbird）<ref name="gameface-former-hummingbird"></ref>构建全新UI设计系统，这使得运行、和等现代Web技术成为可能。

与JSON UI不同，Ore UI是硬编码的，不能被[资源包](资源包.md)修改。<ref name="bedrock-wiki-json-ui-intro"></ref>

# 历史
# = 基岩版UI的全面改造 =
2018年11月9日，Mojang工作室的首席体验设计师[Tobias Ahlin](Tobias Ahlin.md)宣布将对基于Hummingbird引擎的UI进行大改，它运行HTML和CSS的子集，并且基于React框架构建设计系统。<ref name="dotjs-hummingbird-tech-preview"/> 标题屏幕重新设计的技术预览展示了对用户更为友好的触摸、控制器和键盘输入方式。该公告在2018年dotJS开发者大会上发布。

[缩略图|在dotJS2018开发者大会上展示的重新设计技术预览](File:DotJS 2018 Bedrock's UI redesign tech preview.png.md)
技术预览版的新标题屏幕有两个页面。顶部界面显示了玩家最近游玩的世界，背景会随着世界缩略图的变化而变化；底部界面设有五个交互式功能按钮：

* “Play”可能用于启动已存储的世界；
* “Store”可能用于打开市场页面（类似于现在的[市场](市场.md)）；
* “Skins”可能用于玩家自定义个人皮肤（类似于现在的[角色创建器](角色创建器.md)）；
* “Achievements”和“Settings”可以让玩家查看自己的成就和打开设置。

界面右上角有一个包含玩家头像的档案按钮，推测为[个人资料](档案.md)界面入口。

[Minecraft](Minecraft.md) JavaScript API技术文档曾通过特定链接开放访问，这个链接可以在演讲结束时看到，文档提供了技术预览界面，用户可以在其中自由地与重新设计的UI交互。<ref name="dotjs-hummingbird-tech-preview"/>原始链接现已重定向至无关站点，技术文档目前处于完全不可获取状态，已被视为。

2018年年中，Minecraft官方网站（[Minecraft.net](Minecraft.net.md)和[Minecraft Feedback](Minecraft Feedback.md)）开始接收一些基于新UI设计系统的用户界面更新。

2020年7月31日，[基岩版1.16.100.50](基岩版1.16.100.50.md)首次展示了新的[成就](成就.md)屏幕，并逐步向5%的玩家推出。<ref name="achievement-new-ui-rollout"></ref>在接下来的9周内，可以使用新成就界面的玩家数量从5%缓慢增加到75%。<ref name="achievement-new-ui-rollut-75"></ref>

# = React Facet =
2021年10月18日，React Facet源代码在下的[Ore UI GitHub存储库](https://github.com/Mojang/ore-ui)上发布。<ref name="github-ore-ui-react-facet"></ref>

2021年10月25日，<ref name="react-advanced-ragonha-talk-date"></ref>在React Advanced 2021开发者大会上，Mojang Studios的技术主管Paulo Ragonha宣布推出React Facet，这是一种基于的React内置电子游戏用户界面状态管理。<ref name="react-advanced-2021-ore-ui"></ref>在演讲中Ragonha展示了React Facet如何通过引入一个连接C++游戏引擎（游戏状态所在的位置）和JavaScript UI的系统来桥接游戏数据。这种连接依赖于一个称为**分面**的概念，它是表示游戏状态切片的轻量级可观察对象。这些分面允许UI订阅来自游戏引擎的特定数据，例如玩家运行状况、库存或环境变化，并在游戏中的状态发生变化时接收实时更新。

在[基岩版1.20.30.22](基岩版1.20.30.22.md)中，游戏界面经过重新设计，采用了类似于成就菜单的新设计元素。

在[基岩版1.21.20](基岩版1.21.20.md)和[基岩版1.21.30.23](基岩版1.21.30.23.md)中，成就按钮已更改为个人资料按钮，并且出现新的个人资料屏幕，它显示了玩家的[统计信息](统计信息.md)、[成就](成就.md)和[截图](截图.md)。

# 画廊
# = 截图 =

# = 开发截图 =
# == 容器和快捷栏UI ==
<gallery>
File:Ore_UI_development_barrel_container.jpg|[木桶](木桶.md)界面的预览图<ref name="ore-ui-containers-sneak-peek"></ref>
File:Ore_UI_development_shulker_box_container.jpg|[潜影盒](潜影盒.md)界面的预览图<ref name="ore-ui-containers-sneak-peek"/>
File:Ore_UI_development_ender_chest_container.jpg|[末影箱](末影箱.md)界面的预览图<ref name="ore-ui-containers-sneak-peek"/>
File:Ore_UI_development_chest_container.jpg|[箱子](箱子.md)界面的预览图<ref name="ore-ui-containers-sneak-peek"/>
File:Ore_UI_development_hotbar.jpg|[物品栏](物品栏.md)UI的预览图<ref name="ore-ui-hotbar-sneak-peek"></ref>
</gallery>

# == 成就和世界屏幕UI ==
<gallery>
File:OreUI development achievements.jpg|开发中的Ore UI[成就](成就.md)界面
File:Achieve.png|成就界面的预览图
File:OreUI development create world 1.png|[创建新世界](创建新世界.md)菜单的预览图，展示了世界缩略图、“创建”按钮和“通用”标签页的一部分
File:OreUI development create world 2.png|创建新世界菜单的另一个预览图，展示了世界的难度选择控件
File:OreUI development create world 3.png|创建新世界菜单的预览图，展示了世界资源包列表中的拖拽控件和资源包索引序号
</gallery>

# = dotJS 2018 =
<gallery>
File:DotJS 2018 Bedrock's UI redesign early prototype.jpg|标题屏幕UI重新设计的早期原型
File:DotJS 2018 Bedrock's UI redesign tech preview.png|标题屏幕UI重新设计的技术预览
File:dotJS 2018 Bedrock's UI redesign tech preview, improved 2020.jpg|更新于2020年的技术预览改进版，全景图已更新至[水域更新](水域更新.md)<ref></ref>
File:DotJS_2018_Bedrock's_UI_redesign_achievement.jpg|重新设计的[成就](成就.md)UI<ref></ref>
</gallery>

# 参考

# 外部链接
* [Github](https://github.com/Mojang/ore-ui)上的Ore UI

# 导航

[Category:UI](Category:UI.md)

[en:Ore UI](en:Ore UI.md)
[pt:Ore UI](pt:Ore UI.md)