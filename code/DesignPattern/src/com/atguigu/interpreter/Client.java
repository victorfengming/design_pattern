package com.atguigu.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * @project java_mode
 * @package com.atguigu.interpreter
 */
public class Client {
    public static void main(String[] args) throws IOException  {
        String expStr = getExpStr();    // a+b
        HashMap<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果"+expStr+"="+calculator.run(var));
    }

    /**
     * 获得表达式
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式;:");
        return(new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                // 这里看不到了
            }
        }
        // todo 这里有若干行代码省略了
        // todo 这里有若干行代码省略了
        // todo 这里有若干行代码省略了
        return map;
    }
}
