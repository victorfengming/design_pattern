package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 20:53
 */
public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要知道 Department 是 以 怎样的方式 存放的

    // 我们假定这个computerCollege 计算机学院 他的存放方式是以数组的形式存放的

    Department[] departments;
    int position = 0;   // 遍历的位置

    // 吧department内容传进来,
    // 我要知道你是怎么存放的,你不告诉我我无法迭代
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        // 判断是数组
        if (position >= departments.length || departments[position] == null) {
            // 没有下一个了
            return false;
        } else {
            // 还是有下一个
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        // 后移一位
        position += 1;
        return department;
    }

    // 删除的方法空实现
    @Override
    public void remove() {
        //
    }
}
