## 天气预报设计方案 1-普通方案 {#1}

### WeatherData 类 {#weatherdata}

*   传统的设计方案
*   代码实现

observer.zip

| package com.atguigu.observer; |
| --- |
| package com.atguigu.observer; |

| * |
| --- |

| package com.atguigu.observer; |
| --- |

| public float getPressure() { return pressure; |
| --- |

*   问题分析

1.  其他第三方接入气象站获取数据的问题
2.  无法在运行时动态的添加第三方 (新浪网站)
3.  违反 ocp 原则=&gt;观察者模式

//在 WeatherData 中，当增加一个第三方，都需要创建一个对应的第三方的公告板对象，并加入到 dataChange, 不利于维护，也不是动态加入

public void dataChange() {

currentConditions.update(getTemperature(), getPressure(), getHumidity());

}