## 建造者模式在 JDK 的应用和源码分析 {#jdk}

1.  java.lang.StringBuilder 中的建造者模式
2.  代码说明+Debug 源码
3.  源码中建造者模式角色分析

*   Appendable 接口定义了多个 append 方法(抽象方法), 即 Appendable 为抽象建造者, 定义了抽象方法
*   AbstractStringBuilder 实现了 Appendable 接口方法，这里的 AbstractStringBuilder 已经是建造者，只是不能实例化
*   StringBuilder 即充当了指挥者角色，同时充当了具体的建造者，建造方法的实现是由 AbstractStringBuilder 完成 , 而 StringBuilder 继承了 AbstractStringBuilder