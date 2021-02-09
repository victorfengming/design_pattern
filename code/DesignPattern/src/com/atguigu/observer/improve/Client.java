package com.atguigu.observer.improve;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 10:33 <br/>
 * @author yufengming
 * @project java_mode
 * @package com.atguigu.observer.improve
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        // 注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        //测试
        System.out.println("通知各个观察者,看看信息");
        weatherData.setData(10f,101f,20.3f);
        /**
         * 通知各个观察者,看看信息
         * ---Now mTemperature10.0---
         * ---Now mPressure101.0---
         * ---Now mhumidity20.3---
         * ----baidu.com----
         * ---百度: mTemperature10.0---
         * ---百度: mPressure101.0---
         * ---百度: mhumidity20.3---
         *
         * Process finished with exit code 0
         */
    }
}
