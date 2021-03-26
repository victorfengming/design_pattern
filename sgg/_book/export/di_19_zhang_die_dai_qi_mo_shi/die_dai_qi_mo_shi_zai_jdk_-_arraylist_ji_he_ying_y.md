## 迭代器模式在 JDK-ArrayList 集合应用的源码分析 {#jdk-arraylist}

1.  JDK 的 ArrayList 集合中就使用了迭代器模式
2.  代码分析+类图+说明
3.  对类图的角色分析和说明

*   内部类 Itr 充当具体实现迭代器 Iterator 的类， 作为 ArrayList 内部类
*   List 就是充当了聚合接口，含有一个 iterator() 方法，返回一个迭代器对象
*   ArrayList 是实现聚合接口 List 的子类，实现了 iterator()
*   Iterator 接口系统提供
*   迭代器模式解决了 不同集合(ArrayList ,LinkedList) 统一遍历问题