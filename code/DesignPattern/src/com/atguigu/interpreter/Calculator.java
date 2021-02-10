package com.atguigu.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-10 9:45 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月10日9:45分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.interpreter
 */
public class Calculator {
    // 定义表达式
    private Expression expression;

    // 构造函数传参,并解析

    public Calculator(String expStr) {  // expStr = a+b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        // 遍历我么的字符数组,即遍历 [a,+,b]
        // 针对不同的情况做响应处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    //比如发现是一个加号
                    // 从stack取出left(左表达式)
                    left = stack.pop();
                    // 取出右边的表达式
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    // 根据得到的left和right 构建AddExpression对象加入stack
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    //比如发现是一个减号
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 如果是一个 Var 变量,就创建一个VarExpression对象
                    // ,并push压入到Stack中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 当遍历完整个 charArray数组后,就在栈中就得到了最后的Expression,
        // 这个是组合好的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        // 最后将表达式 a+b 和var 绑定 {a=10,b=20}
        // 然后传递给Expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
