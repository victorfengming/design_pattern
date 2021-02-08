package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 20:59
 * 等你学了数据结构你就会对这个next()十分的敏感
 */
public class InfoCollegeIterator implements Iterator {
    // 信息工程学院是以List方式存放的系的
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // 判断这个list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        // 对集合遍历
        if (index >= departmentList.size() - 1) {
            // 说明没有下一个了
            return false;
        } else {
            // 往后移动
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        // 直接返回 这个
        return departmentList.get(index);
    }


    // 空实现remove方法
    @Override
    public void remove() {

    }
}
