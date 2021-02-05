package com.atguigu.composite;


public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();

    }
    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();

    }
    // 构造器

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    // 方法打印,做成抽象的
    protected abstract void print();
    // 这个方法的子类都需要实现


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
