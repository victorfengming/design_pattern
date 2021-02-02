package com.atguigu.principle.singleton.type03;

import com.atguigu.principle.singleton.type03.Singleton;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type03
 * @created 2021-02-02 19:17
 * @function ""
 */
public class TestForSingleton03 {
   public static void main(String[] args) {
        Singleton ins = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
        /*
        * com.atguigu.principle.singleton.type03.Singleton@1540e19d
        356573597
        com.atguigu.principle.singleton.type03.Singleton@1540e19d
        356573597
        true

        * */
    }
}
