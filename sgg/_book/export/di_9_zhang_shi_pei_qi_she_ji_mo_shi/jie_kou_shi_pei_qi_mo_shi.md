## 接口适配器模式

### 接口适配器模式介绍 {#-0}

1.  一些书籍称为：适配器模式(Default Adapter Pattern)或缺省适配器模式。
2.  核心思路：当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
3.  适用于一个接口不想使用其所有的方法的情况。

### 接口适配器模式应用实例 {#-1}

1.  Android 中的属性动画 ValueAnimator 类可以通过 addListener(AnimatorListener listener)方法添加监听器， 那么常规写法如右：
2.  有时候我们不想实现 Animator.AnimatorListener 接口的全部方法，我们只想监听 onAnimationStart，我们会如下写
3.  AnimatorListenerAdapter 类，就是一个接口适配器，代码如右图:它空实现了

Animator.AnimatorListener 类(src)的所有方法.

1.  AnimatorListener 是一个接口.
2.  程序里的匿名内部类就是 Listener 具体实现类
3.  案例说明

| package com.atguigu.adapter.interfaceadapter; |
| --- |
| package com.atguigu.adapter.interfaceadapter; |

| //在 AbsAdapter 我们将 Interface4 的方法进行默认实现 |
| --- |
| package com.atguigu.adapter.interfaceadapter; |

| AbsAdapter absAdapter = new AbsAdapter() { |
| --- |