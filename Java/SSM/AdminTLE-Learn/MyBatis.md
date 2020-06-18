### 四.MyBatis使用步骤总结

1)配置mybatis-config.xml 全局的配置文件 (1、数据源，2、外部的mapper)
2)创建SqlSessionFactory
3)通过SqlSessionFactory创建SqlSession对象
4)通过SqlSession操作数据库 CRUD
5)调用session.commit()提交事务
6)调用session.close()关闭会话

### 五.完整的CRUD操作

##### 1.创建UserDao接口

public User queryUserById(String id);
public List<User> queryUserAll();
public void insertUser(User user);
public void updateUser(User user);
public void deleteUser(String id);

##### 2.创建UserDaoImpl

```java
public SqlSession sqlSession;
@Override
    public User queryUserById(String id) {
        return this.sqlSession.selectOne("UserDao.queryUserById", id);
    }
```



##### 3.编写UserDao对应的UserDaoMapper.xml

<!--使用别名-->
    <select id="queryUserById" resultType="com.zpc.mybatis.pojo.User">
      select
       tuser.id as id,
       tuser.user_name as userName,
       tuser.password as password,
       tuser.name as name,
       tuser.age as age,
       tuser.birthday as birthday,
       tuser.sex as sex,
       tuser.created as created,
       tuser.updated as updated
       from
       tb_user tuser
       where tuser.id = #{id};
   </select>

```xml
<select id="queryUserAll" resultType="com.zpc.mybatis.pojo.User">
    select * from tb_user;
</select>
```

在mybatis-config.xml中添加配置：

<mappers>
    <mapper resource="mappers/MyMapper.xml"/>
    <mapper resource="mappers/UserDaoMapper.xml"/>
</mappers>

##### 4.添加UserDao的测试用例

在pom文件中添加junit依赖
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
</dependency>

##### 5.编写UserDao的测试用例

public class UserDaoTest {

```java
public UserDao userDao;
public SqlSession sqlSession;

@Before
public void setUp() throws Exception {
    // mybatis-config.xml
    String resource = "mybatis-config.xml";
    // 读取配置文件
    InputStream is = Resources.getResourceAsStream(resource);
    // 构建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    // 获取sqlSession
    sqlSession = sqlSessionFactory.openSession();
    this.userDao = new UserDaoImpl(sqlSession);
}

@Test
public void queryUserById() throws Exception {
    System.out.println(this.userDao.queryUserById("1"));
}

@Test
public void queryUserAll() throws Exception {
    List<User> userList = this.userDao.queryUserAll();
    for (User user : userList) {
        System.out.println(user);
    }
}

@Test
public void insertUser() throws Exception {
    User user = new User();
    user.setAge(16);
    user.setBirthday(new Date("1990/09/02"));
    user.setName("大鹏");
    user.setPassword("123456");
    user.setSex(1);
    user.setUserName("evan");
    this.userDao.insertUser(user);
    this.sqlSession.commit();
}

@Test
public void updateUser() throws Exception {
    User user = new User();
    user.setBirthday(new Date());
    user.setName("静鹏");
    user.setPassword("654321");
    user.setSex(1);
    user.setUserName("evanjin");
    user.setId("1");
    this.userDao.updateUser(user);
    this.sqlSession.commit();
}

@Test
public void deleteUser() throws Exception {
    this.userDao.deleteUser("4");
    this.sqlSession.commit();
}
```
}

##### 6.解决数据库字段名和实体类属性名不一致的问题

修改方法：在sql语句中使用别名

### 六.动态代理Mapper实现类

##### 1.思考上述CRUD中的问题

##### 1、接口->实现类->mapper.xml

##### 2、实现类中，使用mybatis的方式非常类似

##### 3、xml中的sql statement 硬编码到java代码中。

思考：能否只写接口，不写实现类。只编写接口和Mapper.xml即可？
因为在dao（mapper）的实现类中对sqlsession的使用方式很类似。因此mybatis提供了接口的动态代理。

##### 2.使用动态代理改造CRUD

修改测试用例的setUp方法
this.userDao = new UserDaoImpl(sqlSession); 
this.userDao = sqlSession.getMapper(UserDao.class);

需要在UserMapper.xml中配置接口的全路径 <mapper namespace="com.zpc.mybatis.dao.UserDao">

##### 3.完整的例子

创建UserMapper接口（对应原UserDao）

```java
public interface UserMapper {

   /**
    * 登录（直接使用注解指定传入参数名称）
    * @param userName
    * @param password
    * @return
    */
   public User login(@Param("userName") String userName, @Param("password") String password);

   /**
    * 根据表名查询用户信息（直接使用注解指定传入参数名称）
    * @param tableName
    * @return
    */
   public List<User> queryUserByTableName(@Param("tableName") String tableName);

   /**
    * 根据Id查询用户信息
    * @param id
    * @return
    */
   public User queryUserById(Long id);

   /**
    * 查询所有用户信息
    * @return
    */
   public List<User> queryUserAll();

   /**
    * 新增用户信息
    * @param user
    */
   public void insertUser(User user);

   /**
    * 根据id更新用户信息
    * @param user
    */
   public void updateUser(User user);

   /**
    * 根据id删除用户信息
    * @param id
    */
   public void deleteUserById(Long id);
}
```



##### 4.创建UserMapper.xml

##### 5.使用Mapper接口不用写接口实现类即可完成数据库操作 使用非常简单 也是官方所推荐的使用方法