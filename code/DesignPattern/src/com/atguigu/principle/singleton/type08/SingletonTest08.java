package com.atguigu.principle.singleton.type08;

/**
 * ClassName: SingletonTest08 <br/>
 * Description: SingletonTest08 <br/>
 * Date: 2021-02-03 9:11 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日9:11分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.principle.singleton.type08
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }

}

// 使用枚举 ,可以实现单例, 推荐使用
enum Singleton{
    INSTANCE;
    public void sayOK() {
        System.out.println("ok~");
    }
}
