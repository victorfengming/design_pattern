## 桥接模式在 JDBC 的源码剖析 {#jdbc}

桥接模式在 JDBC 的源码剖析

1.  Jdbc 的 **Driver** 接口，如果从桥接模式来看，Driver 就是一个接口，下面可以有 MySQL 的 Driver，Oracle 的

Driver，这些就可以当做实现接口类

1.  代码分析+Debug 源码

*   对 jdbc 源码分析的类图