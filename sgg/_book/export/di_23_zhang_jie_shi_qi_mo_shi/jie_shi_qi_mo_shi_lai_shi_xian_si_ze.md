## 解释器模式来实现四则

1.  应用实例要求

通过解释器模式来实现四则运算， 如计算 a+b-c 的值

1.  思路分析和图解(类图)
2.  代码实现

interpreter.zip

| package com.atguigu.interpreter; |
| --- |

| public AddExpression(Expression left, Expression right) { super(left, right); |
| --- |
| package com.atguigu.interpreter; |

| public Calculator(String expStr) { // expStr = a+b |
| --- |

| break; |
| --- |
| package com.atguigu.interpreter; |

| Calculator calculator = new Calculator(expStr); |
| --- |

| } |
| --- |
| package com.atguigu.interpreter; |
| package com.atguigu.interpreter; |

| super(left, right); |
| --- |
| package com.atguigu.interpreter; |

| this.left = left; this.right = right; |
| --- |
| package com.atguigu.interpreter; |

| public VarExpression(String key) { this.key = key; |
| --- |