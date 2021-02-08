package com.atguigu.iterator;

import java.util.ArrayList;

/**
 * @author victor
 * @site https://victorfengming.gitee.io/
 * @project design_pattern
 * @package com.atguigu.iterator
 * @created 2021-02-08 22:00
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("----------迭代器模式----------");
        // 创建学员
        ArrayList<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();

        InfoCollege infoCollege = new InfoCollege();

        //
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();

        /**
         * ----------迭代器模式----------
         * ---------计算机学院---------
         * java分布式专业
         * php小程序专业
         * python大数据专业
         * ---------信息工程学院---------
         * 信息安全专业
         * 网络安全专业
         * 服务器安全专业
         *
         * Process finished with exit code 0
         */

    }
}
