## 对象适配器模式

### 对象适配器模式介绍 {#-0}

1.  基本思路和类的适配器模式相同，只是将 Adapter 类作修改，不是继承 src 类，而是持有 src 类的实例，以解决兼容性的问题。 即：持有 src 类，实现 dst 类接口，完成 src-&gt;dst 的适配
2.  根据“合成复用原则”，在系统中尽量使用关联关系（聚合）来替代继承关系。
3.  对象适配器模式是适配器模式常用的一种

### 对象适配器模式应用实例 {#-1}

1.  应用实例说明

以生活中充电器的例子来讲解适配器，充电器本身相当于 Adapter，220V 交流电相当于 src (即被适配者)，我们的目 dst(即目标)是 5V 直流电，使用对象适配器模式完成。

1.  思路分析(类图)：只需修改适配器即可, 如下:
2.  代码实现

objectadapter.zip

| package com.atguigu.adapter.objectadapter; |
| --- |

| public class Client { |
| --- |
| package com.atguigu.adapter.objectadapter; |
| package com.atguigu.adapter.objectadapter; |

| System.out.println(&quot;电压为 5V, 可以充电~~&quot;); |
| --- |
| package com.atguigu.adapter.objectadapter; |
| package com.atguigu.adapter.objectadapter; |

| //通过构造器，传入一个 Voltage220V 实例 |
| --- |

### 对象适配器模式注意事项和细节 {#-2}

1.  对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。

根据合成复用原则，使用组合替代继承， 所以它解决了类适配器必须继承 src 的局限性问题，也不再要求 dst

必须是接口。

1.  使用成本更低，更灵活。