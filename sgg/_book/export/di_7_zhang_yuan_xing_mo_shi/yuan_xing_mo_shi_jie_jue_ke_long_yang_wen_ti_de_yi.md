## 原型模式解决克隆羊问题的应用实例

使用原型模式改进传统方式，让程序具有更高的效率和扩展性。

*   代码实现

| package com.atguigu.prototype.improve; |
| --- |

| public class Sheep **implements Cloneable** { private String name; |
| --- |

| this.age = age; |
| --- |

| // TODO Auto-generated method stub return sheep; |
| --- |
| package com.atguigu.prototype.improve; |

| System.out.println(&quot;sheep3 =&quot; + sheep3 + &quot;sheep3.friend=&quot; + sheep3.friend.hashCode()); System.out.println(&quot;sheep4 =&quot; + sheep4 + &quot;sheep4.friend=&quot; + sheep4.friend.hashCode()); System.out.println(&quot;sheep5 =&quot; + sheep5 + &quot;sheep5.friend=&quot; + sheep5.friend.hashCode()); |
| --- |