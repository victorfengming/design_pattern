## 开闭原则

### 基本介绍 {#-0}

1.  开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
2.  一个软件实体如类，模块和函数应该对扩展开放**(**对提供方**)**，对修改关闭**(**对使用方**)**。用抽象构建框架，用实现扩展细节。
3.  当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
4.  编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。

### 看下面一段代码 {#-1}

*   看一个画图形的功能。类图设计，如下:
*   代码演示

| package com.atguigu.principle.ocp; |
| --- |

| graphicEditor.drawShape(new Rectangle()); graphicEditor.drawShape(new Circle()); graphicEditor.drawShape(new Triangle()); |
| --- |

| System.out.println(&quot; 绘制圆形 &quot;); |
| --- |

| //新增画三角形 |
| --- |

### 方式 1 的优缺点 {#1}

1.  优点是比较好理解，简单易操作。
2.  缺点是违反了设计模式的 ocp 原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
3.  比如我们这时要新增加一个图形种类 三角形，我们需要做如下修改，修改的地方较多
4.  代码演示

方式 1 的改进的思路分析

### 改进的思路分析 {#-2}

思路：把创建 **Shape** 类做成抽象类，并提供一个抽象的 **draw** 方法，让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形类继承 Shape，并实现 draw 方法即可，使用方的代码就不需要修 -&gt; 满足了开闭原则

改进后的代码：

| package com.atguigu.principle.ocp.improve; |
| --- |

| public static void main(String[] args) { |
| --- |

| public abstract void draw();//抽象方法 |
| --- |

| //新增画三角形 |
| --- |