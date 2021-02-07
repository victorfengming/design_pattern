package com.atguigu.jdk;


public class FlyWeight {
    public static void main(String[] args) {
        // TODO
        // 如果Integer.valueOf(x) x 在-127---128之间,就是使用享元模式返回
        // ,也就是说,要是有就返回,没有再创建

        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);
        System.out.println(x.equals(y));    // true
        System.out.println(x == y); // false
        System.out.println(x == z); // true
        System.out.println(w == x); // false
        System.out.println(w == y); // false

        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1==x2:"+(x1==x2));

        /*
        true
        false
        true
        false
        false
        x1==x2:false

        Process finished with exit code 0
        * */
    }
}
