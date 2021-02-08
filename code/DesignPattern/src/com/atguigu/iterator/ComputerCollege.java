package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 21:11
 */
public class ComputerCollege implements College {

    Department[] departments;
    // 保存当前数组的对象的个数
    int numOfDepartment = 0;

    // 通过构造器


    public ComputerCollege() {
        departments = new Department[5];
        // 初始化数据
        addDepartment("java分布式专业","面向对象");
        addDepartment("php小程序专业","最好的语言");
        addDepartment("python大数据专业","数学要好");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        // 创建数组
        Department department = new Department(name, desc);
        // 真正的数据是在这里加进去的
        departments[numOfDepartment] = department;
        // 计数器更新,数量+1
        numOfDepartment += 1;

    }

    @Override
    public Iterator createIterator() {
        // 要将自己的department传进去
        return new ComputerCollegeIterator(departments);
    }
}
