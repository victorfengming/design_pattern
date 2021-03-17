## 动态代理

### 动态代理模式的基本介绍 {#-0}

1.  代理对象,不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
2.  代理对象的生成，是利用 JDK 的 API，动态的在内存中构建代理对象
3.  动态代理也叫做：JDK 代理、接口代理

### JDK 中生成代理对象的 API {#jdk-api}

1.  代理类所在包:java.lang.reflect.Proxy
2.  JDK 实现代理只需要使用 **newProxyInstance** 方法,但是该方法需要接收三个参数,完整的写法是:

static Object newProxyInstance(ClassLoader loader, Class&lt;?&gt;[] interfaces,InvocationHandler h )

### 动态代理应用实例 {#-1}

*   应用实例要求

将前面的静态代理改进成动态代理模式(即：JDK 代理模式)

*   思路图解(类图)
*   代码实现

dynamic.zip

| package com.atguigu.proxy.dynamic; |
| --- |

| ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance(); |
| --- |
| package com.atguigu.proxy.dynamic; |
| package com.atguigu.proxy.dynamic; |

| import java.lang.reflect.Proxy; |
| --- |

| */ |
| --- |
| package com.atguigu.proxy.dynamic; |

| // TODO Auto-generated method stub System.out.println(&quot; 老师授课中.... &quot;); |
| --- |