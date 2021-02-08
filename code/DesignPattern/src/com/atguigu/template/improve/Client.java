package com.atguigu.template.improve;


public class Client {
    public static void main(String[] args) {
        System.out.println("---------");
        // 制作红豆豆浆
        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyMilk = new PeanutSoyaMilk();
        peanutSoyMilk.make();

        System.out.println("----制作纯豆浆----");
        SoyaMilk pureSoyMilk = new PureSoyaMilk();
        pureSoyMilk.make();

        /**
         * ---------
         * ----制作红豆豆浆----
         * 第一步: 选择好的新鲜黄豆
         * 第二步 加入上号的红豆
         * 第三部,黄豆和配料开始浸泡,需要3小时
         * 第四部,黄豆和配料放到豆浆机去打碎!
         * ----制作花生豆浆----
         * 第一步: 选择好的新鲜黄豆
         * 第二步 加入上号的花生!
         * 第三部,黄豆和配料开始浸泡,需要3小时
         * 第四部,黄豆和配料放到豆浆机去打碎!
         * ----制作纯豆浆----
         * 第一步: 选择好的新鲜黄豆
         * 第三部,黄豆和配料开始浸泡,需要3小时
         * 第四部,黄豆和配料放到豆浆机去打碎!
         *
         * Process finished with exit code 0
         */
    }
}
