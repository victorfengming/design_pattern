## 游戏角色恢复状态实例

1.  应用实例要求

游戏角色有攻击力和防御力，在大战 Boss 前保存自身的状态(攻击力和防御力)，当大战 Boss 后攻击力和防御力下降，从备忘录对象恢复到大战前的状态

1.  思路分析和图解(类图)
2.  代码实现

game.zip

| package com.atguigu.memento.game; |
| --- |

| //守护者对象, 保存游戏角色的状态 |
| --- |
| package com.atguigu.memento.game; |

| // TODO Auto-generated method stub |
| --- |

| } |
| --- |
| package com.atguigu.memento.game; |

| return vit; |
| --- |
| package com.atguigu.memento.game; |

| public Memento(int vit, int def) { super(); |
| --- |