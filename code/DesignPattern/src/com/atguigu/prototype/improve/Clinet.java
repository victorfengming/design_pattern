package com.atguigu.prototype.improve;

public class Clinet {
    public static void main(String[] args) {
        // 原型模式完成 对象的创建
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep) sheep.clone();   // 克隆
        Sheep sheep3 = (Sheep) sheep.clone();   // 克隆
        Sheep sheep4 = (Sheep) sheep.clone();   // 克隆

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

        /*
        * Sheep{name='tom', age=1, color='白色', address='蒙古样'}
        Sheep{name='tom', age=1, color='白色', address='蒙古样'}
        Sheep{name='tom', age=1, color='白色', address='蒙古样'}
        Sheep{name='tom', age=1, color='白色', address='蒙古样'}

        Process finished with exit code 0

        * */
    }
}
