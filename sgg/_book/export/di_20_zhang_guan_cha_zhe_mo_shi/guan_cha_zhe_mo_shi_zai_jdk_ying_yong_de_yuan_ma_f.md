## 观察者模式在 Jdk 应用的源码分析 {#jdk}

1.  Jdk 的 Observable 类就使用了观察者模式
2.  代码分析+模式角色分析
3.  模式角色分析

*   Observable 的作用和地位等价于 我们前面讲过 Subject
*   Observable 是类，不是接口，类中已经实现了核心的方法 ,即管理 Observer 的方法 add.. delete .. notify...
*   Observer 的作用和地位等价于我们前面讲过的 Observer, 有 update
*   Observable 和 Observer 的使用方法和前面讲过的一样，只是 Observable 是类，通过继承来实现观察者模式