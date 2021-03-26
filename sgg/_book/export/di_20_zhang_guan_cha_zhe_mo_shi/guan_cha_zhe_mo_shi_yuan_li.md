## 观察者模式原理

1.  观察者模式类似订牛奶业务
2.  奶站/气象局：Subject
3.  用户/第三方网站：Observer

*   Subject：登记注册、移除和通知

1.  registerObserver 注 册
2.  removeObserver 移 除
3.  notifyObservers() 通知所有的注册的用户，根据不同需求，可以是更新数据，让用户来取，也可能是实施推送， 看具体需求定

*   Observer：接收输入
*   观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为 Subject，依赖的对象为 Observer，Subject

通知 Observer 变化,比如这里的奶站是 Subject，是 1 的一方。用户时 Observer，是多的一方。