package com.atguigu.builder.improve;

/**
 * 抽象
 * 我们把这个建造过程放在这块儿了,
 * 但是产品本身的属性是封装在这个House里面的
 * 把制造流程和产品本身分开了
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通的房子地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶盖上了");
    }
}
