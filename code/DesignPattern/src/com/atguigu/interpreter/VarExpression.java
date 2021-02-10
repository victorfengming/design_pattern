package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * 变量的解释器
 * @author victor
 */
public class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // var就是{a=10,b=20}
    // interpreter 根据变量的名称,返回对应的值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
