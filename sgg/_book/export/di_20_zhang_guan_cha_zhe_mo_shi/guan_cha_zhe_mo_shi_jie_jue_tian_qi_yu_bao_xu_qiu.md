## 观察者模式解决天气预报需求

### 类图说明 {#-0}

### 代码实现 {#-1}

improve.zip

| package com.atguigu.observer.improve; |
| --- |

| this.pressure = pressure; this.humidity = humidity; display(); |
| --- |
| package com.atguigu.observer.improve; |

| BaiduSite baiduSite = new BaiduSite(); |
| --- |
| package com.atguigu.observer.improve; |

| private float pressure; private float humidity; |
| --- |
| package com.atguigu.observer.improve; |

|  |
| --- |
| package com.atguigu.observer.improve; |
| package com.atguigu.observer.improve; |

| private float humidity; |
| --- |

| } |
| --- |

| //遍历所有的观察者，并通知 @Override |
| --- |

### 观察者模式的好处 {#-2}

1.  观察者模式设计后，会以集合的方式来管理用户(Observer)，包括注册，移除和通知。
2.  这样，我们增加观察者(这里可以理解成一个新的公告板)，就不需要去修改核心类 WeatherData 不会修改代码， 遵守了 ocp 原则。