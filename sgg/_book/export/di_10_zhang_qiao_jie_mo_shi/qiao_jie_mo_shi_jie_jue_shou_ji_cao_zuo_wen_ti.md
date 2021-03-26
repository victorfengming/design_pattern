## 桥接模式解决手机操作问题

使用桥接模式改进传统方式，让程序具有搞好的扩展性，利用程序维护

*   *   1.  应用实例说明(和前面要求一样)
        2.  使用桥接模式对应的类图
        3.  代码

bridge.zip

| package com.atguigu.bridge; |
| --- |

| //接口 |
| --- |
| package com.atguigu.bridge; |

| phone2.call(); phone2.close(); |
| --- |
| package com.atguigu.bridge; |

| public class FoldedPhone extends Phone { |
| --- |
| package com.atguigu.bridge; |

| //组合品牌 |
| --- |
| package com.atguigu.bridge; |

| //构造器 |
| --- |
| package com.atguigu.bridge; |

| public void open() { |
| --- |
| package com.atguigu.bridge; |

| System.out.println(&quot; 小米手机开机 &quot;); |
| --- |