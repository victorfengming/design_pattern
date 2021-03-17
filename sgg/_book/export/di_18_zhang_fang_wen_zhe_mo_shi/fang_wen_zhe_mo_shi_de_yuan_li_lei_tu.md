## 访问者模式的原理类图

*   对原理类图的说明-

即(访问者模式的角色及职责)

1.  Visitor 是抽象访问者，为该对象结构中的 ConcreteElement 的每一个类声明一个 visit 操作
2.  ConcreteVisitor ：是一个具体的访问值 实现每个有 Visitor 声明的操作，是每个操作实现的部分.
3.  ObjectStructure 能枚举它的元素， 可以提供一个高层的接口，用来允许访问者访问元素
4.  Element 定义一个 accept 方法，接收一个访问者对象
5.  ConcreteElement 为具体元素，实现了 accept 方法