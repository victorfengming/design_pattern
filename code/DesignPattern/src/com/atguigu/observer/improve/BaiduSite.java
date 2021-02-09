package com.atguigu.observer.improve;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 10:36 <br/>
 * @author yufengming
 * @project java_mode
 * @package com.atguigu.observer.improve
 */
public class BaiduSite implements Observer2{
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
        System.out.println("----baidu.com----");
        System.out.println("---百度: mTemperature"+temperature+"---");
        System.out.println("---百度: mPressure"+pressure+"---");
        System.out.println("---百度: mhumidity"+humidity+"---");
    }

}
