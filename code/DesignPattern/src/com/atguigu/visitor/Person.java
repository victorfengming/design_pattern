package com.atguigu.visitor;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 19:01
 */
public abstract class Person {
    // 提供一个方法,让访问者可以访问
    public abstract void accept(Action action);

}
