package com.atguigu.observer.improve;


/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 10:09 <br/>
 * <br/>
 *
 * @author victor
 * @project java_mode
 * @package com.atguigu.observer.improve
 */
public class CurrentConditions implements Observer2 {
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
        System.out.println("---Now mTemperature"+temperature+"---");
        System.out.println("---Now mPressure"+pressure+"---");
        System.out.println("---Now mhumidity"+humidity+"---");
    }

}
