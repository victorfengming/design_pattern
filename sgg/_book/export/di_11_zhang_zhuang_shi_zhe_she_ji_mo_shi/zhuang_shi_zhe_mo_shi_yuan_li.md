## 装饰者模式原理

*   *   1.  装饰者模式就像打包一个快递

主体：比如：陶瓷、衣服 (Component) // 被装饰者

包装：比如：报纸填充、塑料泡沫、纸板、木板(Decorator)

*   *   1.  Component 主体：比如类似前面的 Drink
        2.  ConcreteComponent 和 Decorator

ConcreteComponent：具体的主体， 比如前面的各个单品咖啡

*   *   1.  Decorator: 装饰者，比如各调料.

在如图的 Component 与 ConcreteComponent 之间，如果 ConcreteComponent 类很多,还可以设计一个缓冲层，将共有的部分提取出来，抽象层一个类。