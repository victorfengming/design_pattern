package com.atguigu.principle.Liskov.Improve;


/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.Liskov
 * @created 2021-02-01 19:41
 * @function ""
 */
public class Improve {
    public static void main(String[] args) {
        // toodo
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("---");
        B b = new B();
//        因为B类 不在继承 A类,因此,调用者,不会再认为func1 是求减法了
        // 调用完成的功能就会很明确
        System.out.println("11+3"+b.func1(11,3));
        System.out.println("11+3+9="+b.func2(11,3));
        System.out.println("---");
        // 使用组合任然可恶意使用到A类的相关方法
        System.out.println("1-8"+b.func3(1,8));

    }
}
//创建一个更加基础的类
class Base{
    // 把更加基础的方法和成员写到Base类里面

}
class A extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//B继承A

class B extends Base{
    // 形成一个组合
    private A a = new A();
    // 如果B需要使用A类,就使用组合关系


    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我们仍然想要使用A的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

}