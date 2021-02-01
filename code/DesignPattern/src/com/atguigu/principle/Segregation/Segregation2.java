package com.atguigu.principle.Segregation;

/**
 * ClassName: segregation1 <br/>
 * Description: segregation1 <br/>
 * Date: 2021-02-01 15:17 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月01日15:17分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.principle.Segregation
 */

/*
*
*
* */
public class Segregation2 {
    public static void main(String[] args) {
        // todo gen
    }
}

interface Interface1{
    void operation1();
}
interface Interface2{

    void operation2();
    void operation3();
}
interface Interface3{

    void operation4();
    void operation5();
}


class B2 implements Interface1,Interface2{

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

}

class D2 implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("d实现了1");
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

class C2 {
    // c这个类通过接口 依赖使用d类
    // 但是只是用到了 1,4,5 方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface3 interface3) {
        interface3.operation4();
    }
    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}

class A2{
        // c这个类通过接口 依赖使用d类
    // 但是只是用到了 1,2,3 方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }
    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}
