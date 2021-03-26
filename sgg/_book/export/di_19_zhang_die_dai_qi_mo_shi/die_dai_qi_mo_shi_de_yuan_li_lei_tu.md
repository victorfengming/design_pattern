## 迭代器模式的原理类图

*   对原理类图的说明-即(迭代器模式的角色及职责)

1.  Iterator ： 迭代器接口，是系统提供，含义 hasNext, next, remove
2.  ConcreteIterator : 具体的迭代器类，管理迭代
3.  Aggregate :一个统一的聚合接口， 将客户端和具体聚合解耦
4.  ConcreteAggreage : 具体的聚合持有对象集合， 并提供一个方法，返回一个迭代器， 该迭代器可以正确遍历集合
5.  Client :客户端， 通过 Iterator 和 Aggregate 依赖子类