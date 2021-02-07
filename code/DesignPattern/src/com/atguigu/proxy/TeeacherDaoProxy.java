package com.atguigu.proxy;

/**
 * 代理对象,静态代理
 */
public class TeeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;     // 目标对象,通过接口来依赖(聚合)/关联

    // 构造器
    public TeeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始代里");
        target.teach();
        System.out.println("提交...");
        // 我怀疑这个是python中的装饰器
    }
}
