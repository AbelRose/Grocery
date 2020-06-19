### @Component 注解的解析

类似于一个Bean 注入到Spring中, 相当于配置文件中的

```xml
<bean id = "" class = "">
```

 1、@Service         用于标注业务层组件 
 2、@Controller    用于标注控制层组件
 3、@Repository   用于标注数据访问组件，即DAO组件. 
 4、@Component 泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注.

- 泛指各种组件 (当这个类不属于@Controller @Service 的时候 可以用这个注解注入)