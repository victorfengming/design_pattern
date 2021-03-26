## 状态模式解决 APP 抽奖问 {#app}

1.  应用实例要求

完成 APP 抽奖活动项目，使用状态模式.

1.  思路分析和图解(类图)

-定义出一个接口叫状态接口，每个状态都实现它。

-接口有扣除积分方法、抽奖方法、发放奖品方法

1.  代码实现

state.zip

| package com.atguigu.state; |
| --- |

| //可以抽奖, 抽完奖后，根据实际情况，改成新的状态 |
| --- |

| package com.atguigu.state; |
| --- |

|  |
| --- |
| package com.atguigu.state; |

| } |
| --- |
| package com.atguigu.state; |

| @Override |
| --- |

| } |
| --- |
| package com.atguigu.state; |

| // 当前状态不能抽奖 |
| --- |
| package com.atguigu.state; |

| // 奖品数量 |
| --- |

| if(state.raffle()){ |
| --- |

| public State getNoRafflleState() { return noRafflleState; |
| --- |

| } |
| --- |
| package com.atguigu.state; |

| } |
| --- |