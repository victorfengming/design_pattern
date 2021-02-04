package com.atguigu.prototype.improve2;

public class Clinet {
    public static void main(String[] args) {
        // 原型模式完成 对象的创建
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend =  new Sheep("jack", 3, "黑色");
        Sheep sheep2 = (Sheep)sheep.clone();    // 克隆
        System.out.println("sheep="+sheep);
        System.out.println("sheep.friend="+sheep.friend.hashCode());
        System.out.println("sheep2="+sheep2);
        System.out.println("sheep2.friend="+sheep2.friend.hashCode());

        /*
        *
        * sheep=Sheep{name='tom', age=1, color='白色', address='蒙古样', friend=Sheep{name='jack', age=3, color='黑色', address='蒙古样', friend=null}}
        sheep.friend=356573597
        sheep2=Sheep{name='tom', age=1, color='白色', address='蒙古样', friend=Sheep{name='jack', age=3, color='黑色', address='蒙古样', friend=null}}
        sheep2.friend=356573597

        Process finished with exit code 0
        * */

        // 这不就是相当于没克隆成么,浅拷贝的
    }
}
