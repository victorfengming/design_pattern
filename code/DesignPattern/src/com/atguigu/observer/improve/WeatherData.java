package com.atguigu.observer.improve;


import java.util.ArrayList;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有观察者集合,使用ArrayList管理
 * 3. 当数据有更新时,就主动的调用ArrayList
 * 通知所有的(接入方)就看到最新的信息
 *
 * @project java_mode
 * @package com.atguigu.observer
 */
public class WeatherData implements Subject {
    private float temperature;      // 温度
    private float pressure;         // 气压
    private float humidity;         // 湿度
    // 观察者集合
    private ArrayList<Observer2> observers;

    private CurrentConditions currentConditions;


    public WeatherData() {
        observers = new ArrayList<Observer2>();
    }

    public void dataChange() {
        notifyObservers();
    }

    // 当数据由于更新的时候,就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange,将最新的信息推送给接入方 currentConditions
        dataChange();
    }


    // 注册一个观察者
    @Override
    public void registerObserver(Observer2 o) {
        observers.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer2 o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    //遍历所有的观察者,并通知

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
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

    public ArrayList<Observer2> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer2> observers) {
        this.observers = observers;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }
}
