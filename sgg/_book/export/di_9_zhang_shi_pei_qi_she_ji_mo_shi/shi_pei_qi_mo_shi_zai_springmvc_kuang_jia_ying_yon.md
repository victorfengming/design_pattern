## 适配器模式在 SpringMVC 框架应用的源码剖析 {#springmvc}

1.  SpringMvc 中的 **HandlerAdapter,** 就使用了适配器模式
2.  SpringMVC 处理请求的流程回顾
3.  使用 HandlerAdapter 的原因分析:

可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，如果需要直接调用 Controller 方法，需要调用的时候就得不断是使用 if else 来进行判断是哪一种子类然后执行。那么如果后面要扩展 Controller， 就得修改原来的代码，这样违背了 OCP 原则。

1.  代码分析+Debug 源码
2.  动手写 SpringMVC 通过适配器设计模式获取到对应的 Controller 的源码

springmvc.zip 源码：