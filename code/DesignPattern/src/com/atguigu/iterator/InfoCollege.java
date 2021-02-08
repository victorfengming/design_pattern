package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 21:28
 */
public class InfoCollege implements College {
    // 不同的地方是哪里呢?
    //这个地方是list了
    List<Department> departmentList;

    //构造器
    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业","IT中的一门");
        addDepartment("网络安全专业","网中的一门");
        addDepartment("服务器安全专业","机器要安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        // 添加到list中去
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        // 这个地方直接返回我们这个list就行了
        return new InfoCollegeIterator(departmentList);
    }
}
