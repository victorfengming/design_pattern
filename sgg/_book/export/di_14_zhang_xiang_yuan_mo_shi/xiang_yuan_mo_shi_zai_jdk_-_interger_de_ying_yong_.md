## 享元模式在 JDK-Interger 的应用源码分析 {#jdk-interger}

1.  Integer 中的享元模式
2.  代码分析+Debug 源码+说明

*   代码说明：

| package com.atguigu.jdk; |
| --- |

| public static void main(String[] args) { |
| --- |

| System.out.println(&quot;x1==x2&quot; + (x1 == x2)); // false |
| --- |