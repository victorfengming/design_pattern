package com.atguigu.proxy.dynamic;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println();
        // 创建目标对象
        ITeacherDao target = new TeacherDao();
        // 给目标对象,创建代理对象
        // 用我们的代理工厂类
        Object proxyInstance = new ProxyFactory(target).getProxyInstance();
        // 可以转换成ITeacherDao
        ITeacherDao IProxyInstance = (ITeacherDao) proxyInstance;
        System.out.println("IProxyInstance="+IProxyInstance);
        System.out.println("IProxyInstance类型="+IProxyInstance.getClass());

        //IProxyInstance类型=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        // 通过代理对象调用目标对象的方法
        IProxyInstance.teach();
        IProxyInstance.sayHello("jack");
        /**
         * JDK代理开始~~
         * JDK代理提交~~
         * IProxyInstance=com.atguigu.proxy.dynamic.TeacherDao@12a3a380
         * IProxyInstance类型=class com.sun.proxy.$Proxy0
         * JDK代理开始~~
         * 老师正在授课中...
         * JDK代理提交~~
         * JDK代理开始~~
         * hellojack
         * JDK代理提交~~
         *
         * Process finished with exit code 0
         * */

    }
}
