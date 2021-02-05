
# 单例模式在JDK应用的源码分析

### 单例模式在jdk中的源码分析

1. 在我们JDK中,java.lang.Runtime就是经典的单例模式(恶汉式)

2. 代码分析+Debug源码+代码说明

```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}
```





![](./img/meizi08.jpg)
