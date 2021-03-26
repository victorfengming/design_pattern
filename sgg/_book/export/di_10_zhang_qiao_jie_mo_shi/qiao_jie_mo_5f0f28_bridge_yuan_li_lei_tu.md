## 桥接模式(Bridge)-原理类图 {#bridge}

*   上图做了说明

1.  Client 类：桥接模式的调用者
2.  抽象类(Abstraction) :维护了 Implementor / 即它的实现类 ConcreteImplementorA.., 二者是聚合关系, Abstraction

充当桥接类

1.  RefinedAbstraction : 是 Abstraction 抽象类的子类
2.  Implementor : 行为实现类的接口
3.  ConcreteImplementorA /B ：行为的具体实现类
4.  从 UML 图：这里的抽象类和接口是聚合的关系，其实调用和被调用关系