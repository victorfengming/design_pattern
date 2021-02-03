package com.atguigu.principle.singleton.type1;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type1
 * @created 2021-02-02 18:43
 * @function ""
 */
public class SingletonTest01 {

    // 1. 构造器私有化,外部不可以new
    private SingletonTest01() {

    }

    // 2. 本类内部创建对象实例
    private final static SingletonTest01 instance = new SingletonTest01();

    // 3. 提供一个工友的静态方法,返回实例对象
    public static SingletonTest01 getInstance() {
        return instance;
    }
}
