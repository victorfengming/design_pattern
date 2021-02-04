package com.atguigu.builder.improve;


// 指挥者,去指定制定流程,返回产品
public class HouseDirector {
    // 聚合进来
    HouseBuilder houseBuilder = null;


    // 构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程
    // 交给了指挥者
    public House constructHouse() {
        // 先打地基
        houseBuilder.buildBasic();
        // 在墙
        houseBuilder.buildWalls();
        // 顶
        houseBuilder.roofed();
        // 返回
        return houseBuilder.buildHouse();
    }
}
