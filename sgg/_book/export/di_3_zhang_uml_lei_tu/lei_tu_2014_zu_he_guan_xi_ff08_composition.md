## 类图—组合关系（Composition） {#composition}

### 基本介绍

组合关系：也是整体与部分的关系，但是整体与部分不可以分开。

再看一个案例：在程序中我们定义实体：Person 与 IDCard、Head, 那么 Head 和 Person 就是 组合，IDCard 和

Person 就是聚合。

但是如果在程序中 Person 实体中定义了对 IDCard 进行级联删除，即删除 Person 时连同 IDCard 一起删除，那么 IDCard 和 Person 就是组合了.

### 应用案例 {#-0}

| public class Person{ private IDCard card; |
| --- |

对应的类图:

案例 2

| public class Computer { |
| --- |

|  |
| --- |