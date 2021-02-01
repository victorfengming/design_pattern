package com.atguigu.principle.Liskov;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.Liskov
 * @created 2021-02-01 19:41
 * @function ""
 */
public class Liskov {
    public static void main(String[] args) {
        // toodo
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("---");
        B b = new B();
        System.out.println("11-3"+b.func1(11,3));
        System.out.println("1-8"+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
        System.out.println("---");

    }
}


class A{
    public int func1(int num1, int num2) {
        // 返回2个数字的差
        return num1 - num2;
    }
}

//B继承A
// 增加一个新的功能: 完成2个数的相加,然后和9去和

class B extends A{
    // 这里无意间吧这个func1 重新写 了
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

}