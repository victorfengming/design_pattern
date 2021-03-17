## 类适配器模式

### 类适配器模式介绍 {#-0}

基本介绍：Adapter 类，通过继承 src 类，实现 dst 类接口，完成 src-&gt;dst 的适配。

### 类适配器模式应用实例 {#-1}

1.  应用实例说明

以生活中充电器的例子来讲解适配器，充电器本身相当于 Adapter，220V 交流电相当于 src (即被适配者)，我们的目 dst(即 目标)是 5V 直流电

1.  思路分析(类图)
2.  代码实现

classadapter.zip

| package com.atguigu.adapter.classadapter; |
| --- |
| package com.atguigu.adapter.classadapter; |
| package com.atguigu.adapter.classadapter; |

| //充电 |
| --- |
| package com.atguigu.adapter.classadapter; |
| package com.atguigu.adapter.classadapter; |

| public class VoltageAdapter extends Voltage220V implements IVoltage5V { |
| --- |

### 类适配器模式注意事项和细节 {#-2}

1.  Java 是单继承机制，所以类适配器需要继承 src 类这一点算是一个缺点, 因为这要求 dst 必须是接口，有一定局限性;
2.  src 类的方法在 Adapter 中都会暴露出来，也增加了使用的成本。
3.  由于其继承了 src 类，所以它可以根据需求重写 src 类的方法，使得 Adapter 的灵活性增强了。