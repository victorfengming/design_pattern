package com.atguigu.builder.improve;


public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼的地基98米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的屋顶透明的");
    }
}
