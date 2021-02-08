package com.atguigu.visitor;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 19:02
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给的评价是该歌手 很成功 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给他评价很成功!");
    }
}
