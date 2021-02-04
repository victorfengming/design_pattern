package com.atguigu.builder;


public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    //我们这个盖房子是有顺序的,
    // 所以再封装一层,
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
