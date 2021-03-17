## 中介者模式应用实例-智能家庭管理

1.  应用实例要求

完成前面的智能家庭的项目，使用中介者模式

1.  思路分析和图解(类图)
2.  代码实现

smarthouse.zip

| package com.atguigu.mediator.smarthouse; |
| --- |

| super(mediator, name); |
| --- |
| package com.atguigu.mediator.smarthouse; |

| //创建 Alarm 并且加入到 ConcreteMediator 对象的 HashMap Alarm alarm = new Alarm(mediator, &quot;alarm&quot;); |
| --- |
| package com.atguigu.mediator.smarthouse; |

| // TODO Auto-generated constructor stub mediator.Register(name, this); |
| --- |
| package com.atguigu.mediator.smarthouse; |

| private Mediator mediator; public String name; |
| --- |
| package com.atguigu.mediator.smarthouse; |

| public ConcreteMediator() { |
| --- |

| //1\. 根据得到消息，完成对应任务 |
| --- |

| } |
| --- |
| package com.atguigu.mediator.smarthouse; |

| public void UpCurtains() { |
| --- |
| package com.atguigu.mediator.smarthouse; |
| package com.atguigu.mediator.smarthouse; |

| } |
| --- |