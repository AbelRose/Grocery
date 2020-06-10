### Transactional

@Transactional 实质是使用了 JDBC 的事务来进行事务控制的
@Transactional 基于 Spring 的动态代理的机制

```
@Transactional 实现原理：

1) 事务开始时，通过AOP机制，生成一个代理connection对象，
	并将其放入 DataSource 实例的某个与 DataSourceTransactionManager 相关的某处容器中。
    在接下来的整个事务中，客户代码都应该使用该 connection 连接数据库，
    执行所有数据库命令。
    [不使用该 connection 连接数据库执行的数据库命令，在本事务回滚的时候得不到回滚]
   （物理连接 connection 逻辑上新建一个会话session；
    DataSource 与 TransactionManager 配置相同的数据源）

2) 事务结束时，回滚在第1步骤中得到的代理 connection 对象上执行的数据库命令，



   然后关闭该代理 connection 对象。



  （事务结束后，回滚操作不会对已执行完毕的SQL操作命令起作用）
```