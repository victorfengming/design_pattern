package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 21:33
 */
public class OutputImpl {
    // 吧学院的集合拿到
    List<College> collegesList;
    //

    public OutputImpl(List<College> collegesList) {
        this.collegesList = collegesList;
    }

    // 遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        // 从这个 CollegeList 取出所有的学院
        // 直接用迭代器取
        // 官方Java中的List已经实现了Iterator接口
        Iterator<College> iterator = collegesList.iterator();
        // 循环
        while (iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("---------"+college.getName()+"---------");
            // 得到对应的迭代器
            printDepartment(college.createIterator());
        }
    }

    // 输出 学院 输出系
    public void printDepartment(Iterator iterator) {
        // 当 有下一个的时候
        while (iterator.hasNext()) {
             Department d = (Department) iterator.next();
             System.out.println(d.getName());
        }
    }

}


