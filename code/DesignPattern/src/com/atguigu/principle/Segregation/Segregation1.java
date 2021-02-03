package com.atguigu.principle.Segregation;

/**
 * ClassName: segregation1 <br/>
 * Description: segregation1 <br/>
 * Date: 2021-02-01 15:17 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月01日15:17分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.principle.Segregation
 */

/*
*
*
* */
public class Segregation1 {
    public static void main(String[] args) {
        // todo gen
    }
}

interface Interface1_Old{

    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}


class B implements Interface1_Old{

    @Override
    public void operation1() {
        System.out.println("b 实现了 1");
    }

    @Override
    public void operation2() {
        System.out.println(" b 实现了 2");
    }

    @Override
    public void operation3() {
        System.out.println(" b 实现了3 ");
    }

    @Override
    public void operation4() {
        System.out.println(" b 实现了 4");
    }

    @Override
    public void operation5() {
        System.out.println(" b" +
                "s实现了 5");
    }
}

class D implements Interface1_Old{

    @Override
    public void operation1() {
        System.out.println("d实现了1");
    }

    @Override
    public void operation2() {
        System.out.println("d实现了2");
    }

    @Override
    public void operation3() {
        System.out.println("d实现了3");
    }

    @Override
    public void operation4() {
        System.out.println("d实现了4");
    }

    @Override
    public void operation5() {
        System.out.println("d实现了5");
    }
}

class C {
    // c这个类通过接口 依赖使用d类
    // 但是只是用到了 1,4,5 方法
    public void depend1(Interface1_Old interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1_Old interface1) {
        interface1.operation4();
    }
    public void depend5(Interface1_Old interface1) {
        interface1.operation5();
    }
}

class A{
        // c这个类通过接口 依赖使用d类
    // 但是只是用到了 1,2,3 方法
    public void depend1(Interface1_Old interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1_Old interface1) {
        interface1.operation2();
    }
    public void depend3(Interface1_Old interface1) {
        interface1.operation3();
    }
}
