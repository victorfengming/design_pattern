package com.atguigu.principle.singleton.type06;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type06
 * @created 2021-02-02 19:52
 * @function ""
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton ins = Singleton.getInstance();
        System.out.println(ins);
        // E:\env\jdk1.8.0_162\bin\java.exe -javaagent:E:\ide\JetBrains\IntelliJIDEA2019.2\lib\idea_rt.jar=58016:E:\ide\JetBrains\IntelliJIDEA2019.2\bin -Dfile.encoding=UTF-8 -classpath E:\env\jdk1.8.0_162\jre\lib\charsets.jar;E:\env\jdk1.8.0_162\jre\lib\deploy.jar;E:\env\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;E:\env\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;E:\env\jdk1.8.0_162\jre\lib\ext\dnsns.jar;E:\env\jdk1.8.0_162\jre\lib\ext\jaccess.jar;E:\env\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;E:\env\jdk1.8.0_162\jre\lib\ext\localedata.jar;E:\env\jdk1.8.0_162\jre\lib\ext\nashorn.jar;E:\env\jdk1.8.0_162\jre\lib\ext\sunec.jar;E:\env\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;E:\env\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;E:\env\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;E:\env\jdk1.8.0_162\jre\lib\ext\zipfs.jar;E:\env\jdk1.8.0_162\jre\lib\javaws.jar;E:\env\jdk1.8.0_162\jre\lib\jce.jar;E:\env\jdk1.8.0_162\jre\lib\jfr.jar;E:\env\jdk1.8.0_162\jre\lib\jfxswt.jar;E:\env\jdk1.8.0_162\jre\lib\jsse.jar;E:\env\jdk1.8.0_162\jre\lib\management-agent.jar;E:\env\jdk1.8.0_162\jre\lib\plugin.jar;E:\env\jdk1.8.0_162\jre\lib\resources.jar;E:\env\jdk1.8.0_162\jre\lib\rt.jar;E:\Projects\IdeaProjects\java_mode\out\production\DesignPattern com.atguigu.principle.singleton.type06.SingletonTest06
        //com.atguigu.principle.singleton.type06.Singleton@1540e19d
    }
}


class Singleton{
    private static volatile Singleton instance;
    private Singleton(){}
    // 提供一个静态的公有方法,加入双重检查代码
    // ,解决线程安全问题,同时解决懒加载问题
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}