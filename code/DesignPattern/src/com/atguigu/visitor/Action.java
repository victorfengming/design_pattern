package com.atguigu.visitor;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 18:58
 */
public abstract class Action {
    // 得到男性的一个测评结果
    public abstract void getManResult(Man man);
    // Action依赖man ,man也要用action

    // 得到女的评测
    public abstract void getWomanResult(Woman woman);
}
