package com.atguigu.principle.singleton.type03;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type03
 * @created 2021-02-02 19:13
 * @function ""
 */
public class SingletonTest03 {
    public static void main(String[] args) {

    }
}


class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法,当使用到该方法时,才去创建instance
    // 即懒汉式

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
