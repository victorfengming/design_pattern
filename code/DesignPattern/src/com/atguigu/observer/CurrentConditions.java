package com.atguigu.observer;

/**
 * 显示当前天气情况(可以理解成是气象站自己的网站)
 * @author victor
 */
public class CurrentConditions {
    // 温度
    private float temperature;
    // 气压
    private float pressure;
    // 湿度
    private float humidity;

    // 更新天气情况 ,别人来调用,是由于WeatherData来调用,我使用退送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("---Today mTemperature"+temperature+"---");
        System.out.println("---Today mPressure"+pressure+"---");
        System.out.println("---Today mhumidity"+humidity+"---");
    }

}
