package com.atguigu.observer;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有CurrentConditions对象
 * 3. 当数据有更新时,就主动的调用CurrentCondition对象的Update()方法
 *    这个方法里面含有一个display的操作,这样他们接入方就看到了最新的信息
 * @project java_mode
 * @package com.atguigu.observer
 */
public class WeatherData {
    private float temperature;      // 温度
    private float pressure;         // 气压
    private float humidity;         // 湿度
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange() {
        // 调用我们聚合的currentConditions中的update()方法
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    // 当数据由于更新的时候,就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange,将最新的信息推送给接入方 currentCondition
        dataChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }
}
