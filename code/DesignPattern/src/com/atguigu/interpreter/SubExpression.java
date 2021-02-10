package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * ClassName:  <br/>
 * Description:
 * @project java_mode
 * @package com.atguigu.interpreter
 */
public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 求出left和right表达式相减后的结果
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
