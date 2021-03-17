## 职责链模式在 SpringMVC 框架应用的源码分析 {#springmvc}

1.  SpringMVC-HandlerExecutionChain 类就使用到职责链模式
2.  SpringMVC 请求流程简图
3.  代码分析+Debug 源码+说明
4.  源码和说明

| package com.atguigu.spring.test; |
| --- |

| public static void main(String[] args) { |
| --- |

| * HandlerInterceptor interceptor = getInterceptors()[i]; try { |
| --- |

1.  对源码总结

*   springmvc 请求的流程图中，执行了 拦截器相关方法 interceptor.preHandler 等等
*   在处理 SpringMvc 请求时，使用到职责链模式还使用到适配器模式
*   HandlerExecutionChain 主要负责的是请求拦截器的执行和请求处理,但是他本身不处理请求，只是将请求分配给链上注册处理器执行，这是职责链实现方式,减少职责链本身与处理逻辑之间的耦合,规范了处理流程
*   HandlerExecutionChain 维护了 HandlerInterceptor 的集合， 可以向其中注册相应的拦截器.