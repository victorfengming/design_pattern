## 命令模式在 Spring 框架 JdbcTemplate 应用的源码分析 {#spring-jdbctemplate}

1.  Spring 框架的 JdbcTemplate 就使用到了命令模式
2.  代码分析
3.  模式角色分析说明

*   StatementCallback 接口 ,类似命令接口(Command)
*   class QueryStatementCallback implements StatementCallback&lt;T&gt;, SqlProvider , 匿名内部类， 实现了命令接口， 同时也充当命令接收者
*   命令调用者 是 JdbcTemplate , 其中 execute(StatementCallback&lt;T&gt; action) 方法中，调用 action.doInStatement 方法. 不同的 实现 StatementCallback 接口的对象，对应不同的 doInStatemnt 实现逻辑
*   另外实现 StatementCallback 命令接口的子类还有 QueryStatementCallback、