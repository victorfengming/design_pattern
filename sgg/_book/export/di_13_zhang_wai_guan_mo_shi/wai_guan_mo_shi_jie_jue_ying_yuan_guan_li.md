## 外观模式解决影院管理

### 传统方式解决影院管理说明 {#-0}

1.  外观模式可以理解为转换一群接口，客户只要调用一个接口，而不用调用多个接口才能达到目的。比如：在 pc 上安装软件的时候经常有一键安装选项（省去选择安装目录、安装的组件等等），还有就是手机的重启功能（把关机和启动合为一个操作）。
2.  外观模式就是解决多个复杂接口带来的使用困难，起到简化用户操作的作用
3.  示意图说明

### 外观模式应用实例 {#-1}

1.  应用实例要求
2.  使用外观模式来完成家庭影院项目
3.  思路分析和图解(类图)
4.  代码实现

facade.zip

| package com.atguigu.facade; |
| --- |

| } |
| --- |
| package com.atguigu.facade; |

| //.... |
| --- |
| package com.atguigu.facade; |

| this.screen = Screen.getInstance(); this.dVDPlayer = DVDPlayer.getInstanc(); |
| --- |

| theaterLight.bright(); screen.up(); projector.off(); stereo.off(); dVDPlayer.off(); |
| --- |
| package com.atguigu.facade; |

| public void off() { System.out.println(&quot; popcorn ff &quot;); |
| --- |
| package com.atguigu.facade; |

| } |
| --- |
| package com.atguigu.facade; |

| public void down() { System.out.println(&quot; Screen down &quot;); |
| --- |
| package com.atguigu.facade; |

| System.out.println(&quot; Screen up.. &quot;); |
| --- |
| package com.atguigu.facade; |

| } |
| --- |