package com.atguigu.composite;


public class Department extends OrganizationComponent{

    //构造
    public Department(String name, String des) {
        super(name, des);
    }
    // 这个里面的add方法和 remove方法就可以不要了


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
