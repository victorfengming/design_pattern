## 组合模式解决学校院系展示的 应用实例

应用实例要求

1.  编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院， 一个学院有多个系。
2.  思路分析和图解(类图)
3.  代码实现

composite.zip

| package com.atguigu.composite; |
| --- |

| public class Client { |
| --- |

| //university.print(); infoEngineercollege.print(); |
| --- |
| package com.atguigu.composite; |

| // 将来实际业务中，Colleage 的 add 和 University add 不一定完全一样 |
| --- |

| // TODO Auto-generated method stub |
| --- |
| package com.atguigu.composite; |

| public String getName() { |
| --- |
| package com.atguigu.composite; |

| protected void add(OrganizationComponent organizationComponent) { |
| --- |

| return des; |
| --- |
| package com.atguigu.composite; |

| // TODO Auto-generated constructor stub |
| --- |

| return super.getDes(); |
| --- |