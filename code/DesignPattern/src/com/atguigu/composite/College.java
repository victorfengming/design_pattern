package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;


public class College extends OrganizationComponent {

    // 这个list中存放的是 department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 在将来,实际业务中,这个College的add和University的add方法不一定完全相同
        organizationComponents.add(organizationComponent);
    }
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print 方法,就是输出University 包含的学院
    @Override
    protected void print() {
        System.out.println("------"+getName()+"-----");
        // 遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
