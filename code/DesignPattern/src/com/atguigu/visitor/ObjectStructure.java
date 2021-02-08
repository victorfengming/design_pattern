package com.atguigu.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 19:16
 */

/**
 * 数据结构,管理很多人,有man,有woman
 */
public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    // 增加到list
    public void attach(Person p) {
        persons.add(p);
    }

    // 移除
    public void detach(Person p) {
        persons.remove(p);
    }

    // 显示测评的情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
