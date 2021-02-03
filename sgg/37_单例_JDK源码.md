
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


### 单例模式注意事项和细节说明

1. 单例模式保证了系统内存中该类只存在一个对象,节省了系统资源,对于一些要频繁创建销毁的对象,使用单例模式可以提高系统性能

2. 当想实例化一个单例类的时候,必须要记住使用相应的获取对象的方法,而不是使用new

3. 单例模式使用的场景: 需要频繁的进行创建和销毁的对象,创建对象时耗时过多而耗费资源过多(即: 重量级对象),但又经常用到的对象,工具类对象,频繁访问数据库或文件的对象(比如数据源,session工厂等)
 
 


