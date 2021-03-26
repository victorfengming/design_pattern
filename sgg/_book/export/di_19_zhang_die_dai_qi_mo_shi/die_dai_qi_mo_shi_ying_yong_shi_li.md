## 迭代器模式应用实例

1.  应用实例要求

编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院， 一个学院有多个系。

1.  设计思路分析
2.  代码实现

iterator.zip

| package com.atguigu.iterator; |
| --- |

| public class Client { |
| --- |
| package com.atguigu.iterator; |

| public String getName(); |
| --- |
| package com.atguigu.iterator; |

| @Override |
| --- |
| package com.atguigu.iterator; |

| import java.util.Iterator; |
| --- |

| } |
| --- |
| package com.atguigu.iterator; |

| this.name = name; this.desc = desc; |
| --- |
| package com.atguigu.iterator; |

| List&lt;Department&gt; departmentList; // 信息工程学院是以 List 方式存放系 |
| --- |

| } |
| --- |
| package com.atguigu.iterator; |

| @Override |
| --- |
| package com.atguigu.iterator; |

| public class OutPutImpl { |
| --- |

| public void printDepartment(Iterator iterator) { while(iterator.hasNext()) { |
| --- |