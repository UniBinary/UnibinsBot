# Realms持久化数据存储格式

*页面ID: 125641* | *来源: Minecraft Wiki*

* *Realms持久化数据存储文件**是游戏保存Realms信息使用的存储文件。

# 存储格式

Realms持久化数据存储文件位于{{filepath|-{}-<*客户端根目录*>/realms_persistence.json}}，以JSON文件格式保存，并具有下列结构：

<div class="treeview">
*  JSON文件根对象
* * ：当前是否有未读新闻。
* * ：Realms新闻链接。
</div>

# 存储行为

当游戏进入Realms主页面时，Realms新闻数据就会尝试更新。如果有接收到更新，那么就会设置未读新闻并更新新闻链接。

当未读新闻状态或新闻链接发生改变时，游戏会立刻保存此文件。

# 历史

|
}}

# 导航