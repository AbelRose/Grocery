# SqlSessionFactory & SqlSession

MyBatis框架: 用户只需要关注SQL的语句,无须关注底层的JDBC操作,就可以以面向对象的方式来进行持久化层操作.在MyBatis中的常见对象有SqlSessionFactory和SqlSession

### 1. SqlSessionFactory

每一个MyBatis的应用程序都以一个SqlSessionFactory对象的实例为核心.同时SqlSessionFactory也是***线程安全***的,在应用运行期间不需要多次创建

建议使用***单例模式***.SqlSessionFactory是创建SqlSession的工厂

```
SqlSession openSession();  //这个方法最经常用,用来创建SqlSession对象.
```

### 2. SqlSession

SqlSession是MyBatis的关键对象,是执行持久化操作的独享,类似于JDBC中的Connection 每个线程都应该有它自己的SqlSession实例.SqlSession的实例不能被共享, 同时SqlSession也是线程不安全的使用完SqlSession之后关闭Session很重要,应该确保使用finally块来关闭它.

### 3. SqlSessionFactory和SqlSession实现过程

```
(1)、定义一个Configuration对象，其中包含数据源、事务、mapper文件资源以及影响数据库行为属性设置settings

(2)、通过配置对象，则可以创建一个SqlSessionFactoryBuilder对象

(3)、通过 SqlSessionFactoryBuilder 获得SqlSessionFactory 的实例。

(4)、SqlSessionFactory 的实例可以获得操作数据的SqlSession实例，通过这个实例对数据库进行操作
```

```
第一步首先SqlSessionFactoryBuilder去读取mybatis的配置文件，然后build一个DefaultSqlSessionFactory,即得到SqlSessionFactory
```

```
第二步，获取到SqlSessionFactory之后，就可以利用SqlSessionFactory方法的openSession来获取SqlSession对象了。
```

##### spring和mybatis整合思路

- 需要spring来管理***数据源***信息。
- 需要spring通过***单例方式***管理SqlSessionFactory。
- 使用SqlSessionFactory***创建SqlSession***。（spring和mybatis整合自动完成）
- 持久层的mapper都需要由spring进行管理，spring和mybatis整合生成mapper代理对象。