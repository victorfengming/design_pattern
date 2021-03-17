## 状态模式在实际项目-借贷平台 源码剖析

1.  借贷平台的订单，有审核-发布-抢单 等等 步骤，随着操作的不同，会改变订单的状态, 项目中的这个模块实现就会使用到状态模式
2.  通常通过 if/else 判断订单的状态，从而实现不同的逻辑，伪代码如下
3.  使用状态模式完成 借贷平台项目的审核模块 [设计+代码]

money.zip

| package com.atguigu.state.money; |
| --- |

| @Override |
| --- |

| public void payOrderEvent(Context context) { throw EXCEPTION; |
| --- |
| package com.atguigu.state.money; |

| class GenerateState extends AbstractState { |
| --- |

| public void feedBackEvent(Context context) { context.setState(new FeedBackState()); |
| --- |

| public void acceptOrderEvent(Context context) { |
| --- |

| return StateEnum.REVIEWED.getValue(); |
| --- |
| package com.atguigu.state.money; |

| // // TODO: handle exception |
| --- |
| package com.atguigu.state.money; |

| @Override |
| --- |

| public void orderFailureEvent(Context context) { state.orderFailureEvent(this); getCurrentState(); |
| --- |

| package com.atguigu.state.money; |
| --- |

| */ |
| --- |

|  |
| --- |
| package com.atguigu.state.money; |

| FEED_BACKED(6, &quot;FEED_BACKED&quot;); |
| --- |