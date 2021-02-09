package com.atguigu.observer;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 9:43 <br/>
 * @project java_mode
 * @package com.atguigu.observer
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----观察者模式----");
        //        创建一个接入方
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建 weatherData对象 ,并将接入方currentConditions 传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        // 更新天气信息
        weatherData.setData(30,150,40);
        // 天气情况变化
        System.out.println("----天气情况变----");
        weatherData.setData(40, 160, 20);
        /**
         *----观察者模式----
         * ---Today mTemperature30.0---
         * ---Today mPressure150.0---
         * ---Today mhumidity40.0---
         * ----天气情况变----
         * ---Today mTemperature40.0---
         * ---Today mPressure160.0---
         * ---Today mhumidity20.0---
         *
         * Process finished with exit code 0
         */
    }
}