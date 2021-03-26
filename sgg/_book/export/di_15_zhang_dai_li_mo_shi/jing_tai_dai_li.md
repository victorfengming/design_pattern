## 静态代理

### 静态代码模式的基本介绍 {#-0}

静态代理在使用时,需要定义接口或者父类,被代理对象(即目标对象)与代理对象一起实现相同的接口或者是继承相同父类

### 应用实例 {#-1}

*   具体要求

1.  定义一个接口:ITeacherDao
2.  目标对象 TeacherDAO 实现接口 ITeacherDAO
3.  使用静态代理方式,就需要在代理对象 TeacherDAOProxy 中也实现 ITeacherDAO
4.  调用的时候通过调用代理对象的方法来调用目标对象.
5.  特别提醒：代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来调用目标对象的方法

*   思路分析图解(类图)
*   代码实现

staticproxy.zip

| package com.atguigu.proxy.staticproxy; |
| --- |

| public static void main(String[] args) { |
| --- |
| package com.atguigu.proxy.staticproxy; |
| package com.atguigu.proxy.staticproxy; |

| @Override |
| --- |
| package com.atguigu.proxy.staticproxy; |

| } |
| --- |

### 静态代理优缺点 {#-2}

1.  优点：在不修改目标对象的功能前提下, 能通过代理对象对目标功能扩展
2.  缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类
3.  一旦接口增加方法,目标对象与代理对象都要维护