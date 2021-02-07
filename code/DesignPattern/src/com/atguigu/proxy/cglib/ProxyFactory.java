package com.atguigu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;



public class ProxyFactory implements MethodInterceptor {
    /**
     * 维护一个目标对象
     */
    private Object target;


    /**
     * 构造器,传入一个倍代理的对象
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个代理对象,是target对象的代理对象
     * @return
     */
    public Object getProxyInstance() {
        // `1. 创建工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        ///3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象及代理对象
        return enhancer.create();
        // 这个里面和我们的java的底层有一些关系
        // 我们这里是代理模式,需要再说就讲到java底层了
        // 这里就记住我们要返回一个目标对象的代理对象就可以了
    }

    /**
     * 重写Intercept方法,这里面会调用目标对象的方法
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 这个方法里面将会实现对我们被代理(目标方法)的调用
        System.out.println("Cglib代理模式~~开始");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理~~提交~~");
        return returnVal;
    }

    /*
    * 很绕吧,也是就是你调用这个 getProxyInstance() 方法的时候,然后在你调用方法的时候
    * 会触发intercept()这个方法,儿这个方法的里面就会去调用目标对象的某一个方法
    * 完事儿,其实和其那面的模式像,只是他不用实现这个接口了,而被代理的类也不需要实现接口
    * */
}
