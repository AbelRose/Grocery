# Java

### 第一模块

**1. JDK 和 JRE 有什么区别？**

**2. == 和 equals 的区别是什么？**

**3. 两个对象的 hashCode()相同，则 equals()也一定为 true，对吗？**

**4. final 在 java 中有什么作用？**

**5. java 中的 Math.round(-1.5) 等于多少？**

**6. String 属于基础的数据类型吗？**

**7. java 中操作字符串都有哪些类？它们之间有什么区别？**

**8. String str="i"与 String str=new String("i")一样吗？**

**9. 如何将字符串反转？**

**10. String 类的常用方法都有那些？**

**11. 抽象类必须要有抽象方法吗？**

**12. 普通类和抽象类有哪些区别？**

**13. 抽象类能使用 final 修饰吗？**

**14. 接口和抽象类有什么区别？**

**15. java 中 IO 流分为几种？**

**16. BIO、NIO、AIO 有什么区别？**

**17. Files的常用方法都有哪些？**

### 第二模块

**18. java 容器都有哪些？**

**19. Collection 和 Collections 有什么区别？**

**20. List、Set、Map 之间的区别是什么？**

**21. HashMap 和 Hashtable 有什么区别？**

**22. 如何决定使用 HashMap 还是 TreeMap？**

**23. 说一下 HashMap 的实现原理？**

**24. 说一下 HashSet 的实现原理？**

**25. ArrayList 和 LinkedList 的区别是什么？**

**26. 如何实现数组和 List 之间的转换？**

**27. ArrayList 和 Vector 的区别是什么？**

**28. Array 和 ArrayList 有何区别？**

**29. 在 Queue 中 poll()和 remove()有什么区别？**

**30. 哪些集合类是线程安全的？**

**31. 迭代器 Iterator 是什么？**

**32. Iterator 怎么使用？有什么特点？**

**33. Iterator 和 ListIterator 有什么区别？**

### 第三模块

**35. 并行和并发有什么区别？**

**36. 线程和进程的区别？**

**37. 守护线程是什么？**

**38. 创建线程有哪几种方式？**

**39. 说一下 runnable 和 callable 有什么区别？**

runnable 返回值是void 不支持异步

callable 返回值是一个泛型 支持异步

异步:老爸有俩孩子：小红和小明。老爸想喝酒了，他让小红去买酒，小红出去了。然后老爸突然想吸烟了，于是老爸让小明去买烟。在面对对象的思想中，一般会把买东西，然后买回来这件事作为一个方法，如果按照顺序结构或者使用多线程同步的话，小明想去买烟就必须等小红这个买东西的操作进行完。这样无疑增加了时间的开销。异步就是为了解决这样的问题。你可以分别给小红小明下达指令，让他们去买东西，然后你就可以自己做自己的事，等他们买回来的时候接收结果就可以了。

不用等待一个结果出来，可以继续其他操作（两个人不说话了，寄信，a把信拿到邮局就不用管了，回家可以想干嘛就干嘛，等b回信到了，取邮局接收一下结果--b的回信就可以了）

**40. 线程有哪些状态？**

**41. sleep() 和 wait() 有什么区别？**

**42. notify()和 notifyAll()有什么区别？**

**43. 线程的 run()和 start()有什么区别？**

**44. 创建线程池有哪几种方式？**

**45. 线程池都有哪些状态？**

**46. 线程池中 submit()和 execute()方法有什么区别？**

**47. 在 java 程序中怎么保证多线程的运行安全？**

**48. 多线程锁的升级原理是什么？**

**49. 什么是死锁？**

**50. 怎么防止死锁？**

------

#### @Springootpplication

springboot是通过注解

***@EnableAutoConfiguration***的方式，去查找，过滤，加载所需的***configuration***

***@ComponentScan***扫描我们自定义的bean,

***@SpringBootConfiguration***使得被@SpringBootApplication注解的类声明为***注解类***．

因此@SpringBootApplication的作用等价于同时组合使用@EnableAutoConfiguration，@ComponentScan，@SpringBootConfiguration

------

#### 微服务主要模块          

Eureka 服务中心

Config 配置管理工具包

Hystrix 熔断器

Zuul 动态路由

Bus 总线

Sleuth 日志收集包

Ribbon 云端负载均衡

Turbine 发送事件流数据

Feign

OAuth2 权限

------

**51. ThreadLocal 是什么？有哪些使用场景？**

**52.说一下 synchronized 底层实现原理？**

**53. synchronized 和 volatile 的区别是什么？**

**54. synchronized 和 Lock 有什么区别？**

**55. synchronized 和 ReentrantLock 区别是什么？**

**56. 说一下 atomic 的原理？**

------

### 第四模块第五模块

**57. 什么是反射？**

**58. 什么是 java 序列化？什么情况下需要序列化？**

**59. 动态代理是什么？有哪些应用？**

**60. 怎么实现动态代理？**

**61. 为什么要使用克隆？**

**62. 如何实现对象克隆？**

**63. 深拷贝和浅拷贝区别是什么？**

------

### 第六模块

------

### 第七模块

**74. throw 和 throws 的区别？**

**75. final、finally、finalize 有什么区别？**

**76. try-catch-finally 中哪个部分可以省略？**

**77. try-catch-finally 中，如果 catch 中 return 了，finally 还会执行吗？**

**78. 常见的异常类有哪些？**

------

### 第八模块

**79. http 响应码 301 和 302 代表的是什么？有什么区别？**

**80. forward 和 redirect 的区别？**

**81. 简述 tcp 和 udp的区别？**

**82. tcp 为什么要三次握手，两次不行吗？为什么？**

**83. 说一下 tcp 粘包是怎么产生的？**

**84. OSI 的七层模型都有哪些？**

**85. get 和 post 请求有哪些区别？**

**86. 如何实现跨域？**

------

### 第九模块和第十模块

##### 第九模块

**88. 说一下你熟悉的设计模式？**

https://mp.weixin.qq.com/s?__biz=MzIwMTY0NDU3Nw==&mid=2651938221&idx=1&sn=9cb29d1eb0fdbdb5f976306b08d5bdcc&chksm=8d0f32e3ba78bbf547c6039038682706a2eaf83002158c58060d5eb57bdd83eb966a1e223ef6&scene=21#wechat_redirect

- **单例模式 **  只有一个对象 只能new一个

**观察者模式 ** ![img](Guide.assets/640)

- **装饰者模式**

- **适配器模式**
- **工厂模式**
- **代理模式（proxy）**

**89. 简单工厂和抽象工厂有什么区别？**

##### 第十模块

**90. 为什么要使用 spring？**

ioc 奶奶带大的孩子 Aop  从周开始,中央行政机构中,吏、*户*、*礼*、兵、刑、工 各司其职

















































































