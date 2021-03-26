## 解释器模式的原理类图

*   对原理类图的说明-即(解释器模式的角色及职责)

1.  Context: 是环境角色,含有解释器之外的全局信息.
2.  AbstractExpression: 抽象表达式， 声明一个抽象的解释操作,这个方法为抽象语法树中所有的节点所共享
3.  TerminalExpression: 为终结符表达式, 实现与文法中的终结符相关的解释操作
4.  NonTermialExpression: 为非终结符表达式，为文法中的非终结符实现解释操作.
5.  说明： 输入 Context he TerminalExpression 信息通过 Client 输入即可