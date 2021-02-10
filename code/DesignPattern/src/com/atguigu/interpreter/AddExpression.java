package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * ClassName:  <br/>
 * Description:  加法解释器
 * @project java_mode
 * @package com.atguigu.interpreter
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }
    // 处理相加
    // var仍然是{a=10,b=20}...
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var): 返回左边表达式对应的值
        // super.right.interpreter(var):返回右边表达式对应的值
        return super.left.interpreter(var)+super.right.interpreter(var);
        // 你不要纠结他是怎么程序中怎么算出来的
        // 体会设计模式,这个程序本身复杂,但是光看设计模式不复杂
    }
}
