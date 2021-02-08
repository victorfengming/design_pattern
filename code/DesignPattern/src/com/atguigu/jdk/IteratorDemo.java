package com.atguigu.jdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.jdk
 * @created 2021-02-08 22:10
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        // 获取到迭代器
        Iterator Itr = a.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }

        /**
         * jack
         *
         * Process finished with exit code 0
         */
    }
}
