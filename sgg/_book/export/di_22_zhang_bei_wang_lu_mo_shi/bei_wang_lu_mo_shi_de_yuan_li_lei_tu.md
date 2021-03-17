## 备忘录模式的原理类图

*   对原理类图的说明-即(备忘录模式的角色及职责)
    *   1.  originator : 对象(需要保存状态的对象)
        2.  Memento ： 备忘录对象,负责保存好记录，即 Originator 内部状态
        3.  Caretaker: 守护者对象,负责保存多个备忘录对象， 使用集合管理，提高效率
        4.  说明：如果希望保存多个 originator 对象的不同时间的状态，也可以，只需要要 HashMap &lt;String, 集合&gt;
*   代码实现

theory.zip

| package com.atguigu.memento.theory; |
| --- |

| import java.util.ArrayList; import java.util.List; |
| --- |
| package com.atguigu.memento.theory; |

| public static void main(String[] args) { |
| --- |

| System.out.println(&quot;当前的状态是 =&quot; + originator.getState()); |
| --- |
| package com.atguigu.memento.theory; |

|  |
| --- |
| package com.atguigu.memento.theory; |

|  |
| --- |