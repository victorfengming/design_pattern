package com.atguigu.visitor;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 19:35
 */
public class Wait extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是待定about这个歌手");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的歌手评价是待定");
    }
}
