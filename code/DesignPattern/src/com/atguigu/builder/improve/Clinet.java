package com.atguigu.builder.improve;


public class Clinet {
    public static void main(String[] args) {
        System.out.println();
        // 盖普通票房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子,返回产品(房子
        House house = houseDirector.constructHouse();
        System.out.println(house);
        /* out
        普通的房子地基5米
        普通房子砌墙10cm
        普通房子屋顶盖上了
        com.atguigu.builder.improve.House@1540e19d
        * */
    }
}
