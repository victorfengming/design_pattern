## 职责链模式解决 OA 系统采购审批 {#oa}

1.  应用实例要求

编写程序完成学校 OA 系统的采购审批项目：需求采购员采购教学器材

如果金额 小于等于 5000, 由教学主任审批如果金额 小于等于 10000, 由院长审批

如果金额 小于等于 30000, 由副校长审批如果金额 超过 30000 以上，有校长审批

1.  思路分析和图解(类图)
2.  代码实现

responsibilitychain.zip

| package com.atguigu.responsibilitychain; |
| --- |

| Approver approver; //下一个处理者 String name; // 名 字 |
| --- |
| package com.atguigu.responsibilitychain; |

| //创建相关的审批人 |
| --- |
| package com.atguigu.responsibilitychain; |

| public CollegeApprover(String name) { |
| --- |
| package com.atguigu.responsibilitychain; |

| @Override |
| --- |
| package com.atguigu.responsibilitychain; |

| } |
| --- |
| package com.atguigu.responsibilitychain; |

| @Override |
| --- |
| package com.atguigu.responsibilitychain; |

| approver.processRequest(purchaseRequest); |
| --- |