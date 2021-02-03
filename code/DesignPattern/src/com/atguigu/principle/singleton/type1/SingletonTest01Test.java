package com.atguigu.principle.singleton.type1;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type1
 * @created 2021-02-02 18:50
 * @function ""
 */
public class SingletonTest01Test {
    public static void main(String[] args) {
        SingletonTest01 ins = SingletonTest01.getInstance();
        SingletonTest01 ins2 = SingletonTest01.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
/*
*
*   com.atguigu.principle.singleton.type1.SingletonTest01@1540e19d
    356573597
    com.atguigu.principle.singleton.type1.SingletonTest01@1540e19d
    356573597
    true
*
* */

    }
}
