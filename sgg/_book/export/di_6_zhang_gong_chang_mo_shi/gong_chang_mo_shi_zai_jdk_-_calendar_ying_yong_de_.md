## 工厂模式在 JDK-Calendar 应用的源码分析 {#jdk-calendar}

1.  JDK 中的 Calendar 类中，就使用了简单工厂模式
2.  源码分析+Debug 源码+说明

*   源码部分

| package com.atguigu.jdk; |
| --- |
| //Calendar.java |

| public static Calendar getInstance() |
| --- |
| private static Calendar createCalendar(TimeZone zone, |

| switch (caltype) { case &quot;buddhist&quot;: |
| --- |

| cal = new GregorianCalendar(zone, aLocale); |
| --- |