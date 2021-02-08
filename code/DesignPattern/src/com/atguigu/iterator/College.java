package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 21:04
 */
// 他核心的方法是返回一个 interator
public interface College {

    // 获取名字
    public String getName();

    // 增加系的方法
    public void addDepartment(String name, String desc);

    // 返回一个迭代器.遍历
    public Iterator createIterator();
}
