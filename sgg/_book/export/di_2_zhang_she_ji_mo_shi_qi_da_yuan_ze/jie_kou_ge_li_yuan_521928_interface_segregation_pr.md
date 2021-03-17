## 接口隔离原则(Interface Segregation Principle) {#interface-segregation-principle}

### 基本介绍

1.  客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
2.  先看一张图:
3.  类 A 通过接口 Interface1 依赖类 B，类 C 通过接口 Interface1 依赖类 D，如果接口 Interface1 对于类 A 和类 C

来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法。

1.  按隔离原则应当这样处理：

将接口 **Interface1** 拆分为独立的几个接口**(**这里我们拆分成 **3** 个接口**)**，类 A 和类 C 分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则

### 应用实例 {#-0}

1.  类 A 通过接口 Interface1 依赖类 B，类 C 通过接口 Interface1 依赖类 D，请编写代码完成此应用实例。
2.  看老师代码-没有使用接口隔离原则代码

| package com.atguigu.principle.segregation; |
| --- |

| void operation3(); void operation4(); void operation5(); |
| --- |

| System.out.println(&quot;D 实现了 operation1&quot;); |
| --- |

| } |
| --- |

### 应传统方法的问题和使用接口隔离原则改进 {#-1}

1.  类 A 通过接口 Interface1 依赖类 B，类 C 通过接口 Interface1 依赖类 D，如果接口 Interface1 对于类 A 和类 C

来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法

1.  将接口 **Interface1** 拆分为独立的几个接口，类 A 和类 C 分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
2.  接口 Interface1 中出现的方法，根据实际情况拆分为三个接口
3.  代码实现

| package com.atguigu.principle.segregation.improve; |
| --- |

| } |
| --- |

| public void operation1() { |
| --- |

| } |
| --- |

| i.operation5(); |
| --- |