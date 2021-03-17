## 访问者模式应用实例

应用实例要求

1.  将人分为男人和女人，对歌手进行测评，当看完某个歌手表演后，得到他们对该歌手不同的评价(评价 有不同的种类，比如 成功、失败 等)，请使用访问者模式来说实现
2.  思路分析和图解(类图)
3.  代码实现

visitor.zip

| package com.atguigu.visitor; |
| --- |

| //得到女的 测评 |
| --- |
| package com.atguigu.visitor; |

| System.out.println(&quot;=======给的是待定的测评========&quot;); |
| --- |
| package com.atguigu.visitor; |

| package com.atguigu.visitor; |
| --- |
| package com.atguigu.visitor; |

| } |
| --- |
| package com.atguigu.visitor; |
| package com.atguigu.visitor; |

| @Override |
| --- |
| package com.atguigu.visitor; |

| // TODO Auto-generated method stub |
| --- |
| package com.atguigu.visitor; |

1.  应用案例的小结-双分派

-上面提到了双分派，所谓双分派是指不管类怎么变化，我们都能找到期望的方法运行。双分派意味着得到执行的操作取决于请求的种类和两个接收者的类型

- 以上述实例为例，假设我们要添加一个 **Wait** 的状态类，考察 **Man** 类和 **Woman** 类的反应，由于使用了双分派，只需增加一个 Action 子类即可在客户端调用即可，不需要改动任何其他类的代码。