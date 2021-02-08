package com.atguigu.visitor;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 19:01
 * 说明
 * 1. 这里我们使用到了双分派,
 *      即首先在客户端程序中,将具体的状态作为参数传递到了Woman中
 * 2. 然后Woman 类 调用了作为参数的"具体方法"中的方法 getWomanResult,
 *      同时将自己(this)作为参数传入,完成第二次分派
 *
 *      这种分派的方式能够做到一个解耦,处理能够方便一点儿
 */

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
