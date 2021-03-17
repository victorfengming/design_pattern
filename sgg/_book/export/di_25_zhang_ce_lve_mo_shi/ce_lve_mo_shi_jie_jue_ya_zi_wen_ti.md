## 策略模式解决鸭子问题

1.  应用实例要求

编写程序完成前面的鸭子项目，要求使用策略模式

1.  思路分析(类图)

策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。原则就是： 分离变化部分，封装接口，基于接口编程各种功能。此模式让行为的变化独立于算法的使用者

1.  代码实现

improve.zip

| package com.atguigu.strategy.improve; |
| --- |

| @Override |
| --- |
| package com.atguigu.strategy.improve; |

| pekingDuck.fly(); |
| --- |
| package com.atguigu.strategy.improve; |

| } |
| --- |
| package com.atguigu.strategy.improve; |

| void fly(); // 子类具体实现 |
| --- |
| package com.atguigu.strategy.improve; |
| package com.atguigu.strategy.improve; |

| } |
| --- |
| package com.atguigu.strategy.improve; |
| package com.atguigu.strategy.improve; |

| public interface QuackBehavior { void quack();//子类实现 |
| --- |
| package com.atguigu.strategy.improve; |

| public void swim() { |
| --- |
| package com.atguigu.strategy.improve; |

|  |
| --- |