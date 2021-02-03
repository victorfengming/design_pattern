package com.atguigu.principle.singleton.type02;

import com.atguigu.principle.singleton.type02.Singleton;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type02
 * @created 2021-02-02 18:59
 * @function ""
 */
public class Test {
     public static void main(String[] args) {
        Singleton ins = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
    }
}
