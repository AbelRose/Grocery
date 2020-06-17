# Performance Optimization

### MySQL 性能优化

#### 1. WHY

- 防止由于数据加载的错误导致页面的错误
- 作为数据库的稳定性
- 提高用户体验

#### 2. WHAT

- ![image-20200617092145352](/home/matrix/.config/Typora/typora-user-images/image-20200617092145352.png)
- SQL及索引优化
- 数据库表结构优化
- 系统配置优化
- 硬件配置优化

#### 3. HOW

- SQL及索引优化

  - select @@version; 查看数据库版本

  - 准备数据 sakila 

  - 表结构关系(PowerManager)

    ![image-20200617092833964](/home/matrix/.config/Typora/typora-user-images/image-20200617092833964.png)

  - MySQL慢查日志开方式启和存储格式

    ```
    show variables like 'slow_query_log' //查看是否开启慢查询日志
    
    set global slow_query_log_file='D:/Desktop/sakila-db/sakila-db/mysql-slow.log'; //慢查询日志的位置
    
    set global log_queries_not_using_indexes=on; //开启慢查询日志
    
    set global long_query_time=1; //大于1秒钟的数据记录到慢日志中，如果设置为默认0，则会有大量的信息存储在磁盘中，磁盘很容易满掉
    ```

  - 查看所有日志的变量信息 show variables like '%log%'

    - log_queries_not_using_indexes |  ON
    - slow_query_log                             | OFF 
    - slow_query_log_file                      | /var/lib/mysql/mysql-host-slow.log

  - 验证慢日志是否开启

    - 随便对一个表进行查询 
    - 监听日志文件 看看是否写入 tail -f  /xxx/xxx/mysql-host-slow.log

  - s

  - s

  - s

  - s

  

- 数据库表结构优化

- 系统配置优化

- 硬件配置优化