# 基于Netty的网络编程

### Netty

由JBOSS提供的Java开源框架 ,基于NIO的客户端服、服务器端编程框架 (Java Dubbo)

```markdown
NIO主要有三大核心部分：Channel(通道)，Buffer(缓冲区), Selector。传统IO基于字节流和字符流进行操作，而NIO基于Channel和Buffer(缓冲区)进行操作，数据总是从通道读取到缓冲区中，或者从缓冲区写入到通道中。Selector(选择区)用于监听多个通道的事件（比如：连接打开，数据到达）。因此，单个线程可以监听多个数据通道。
```

特点: 简单易用 基于事件驱动 吞吐量高

***BIO NIO AIO 简介和区别***

1. 阻塞与非阻塞



![image.8ONYM0](assets/image.8ONYM0.png)

(银行只有一个窗口 银行有很多的窗口)

2. 同步和异步

   ![image.YW1RM0](assets/image.YW1RM0.png)

   (TCP 和 UDP)

3. BIO
   ***同步阻塞*** IO , Block IO , IO 操作时会阻塞线程,并发处理能力低。
   我们熟知的 ***Socket 编程***就是 BIO ,一个 socket 连接一个处理线程(这个线程负责这个 Socket 连接的一系列数据传输操作)。

   阻塞的原因在于:操作系统允许的***线程数量是有限***的,***多个 socket*** 申请与服务端建立连接时,服务端不能提供***相应数量***的处理线程,没有分配到处理线程的连接就会***阻塞等待或被拒绝***。

![image.ZPD3M0](assets/image.ZPD3M0.png)

4. NIO

   ***同步非阻塞*** IO None-Block IO, 基于***Reactor模型***.

   通常情况下,一个Sockect只在特定的时候才能发生数据传输IO操作(大部分这个"数据通道"时空闲的 但是还是***占着线程***)
   改进: ***"一个请求一个线程"*** 在连接到服务器的Socket中,只有在需要进行***IO操作***的时候才能获取服务端的***线程***

   ![image.BVYWM0](assets/image.BVYWM0.png)

5. AIO (NIO 2.0)

   ***异步非阻塞*** IO Asynchronous IO  

   由***操作系统***先完成 ***客户端请求处理*** 再通知***服务器***去启动线程进行***处理***(从JDK1.7开始支持)



------

### Netty Reactor 模型 --- 单线程模型、多线程模型、主从多线程模型

1. 单线程模型

   用户***发起IO请求***到Reactor模型

   ***Reactor 线程***将用户的***IO请求***放入到***通道待处理***

   处理之后 Reactoe***重新获得线程的控制权*** 继续***对其他的线程***进行处理

   ```markdown
   这种模型一个时间点只有一个任务在执行,这个任务执行完了,再去执行下一个任务。
   1. 但单线程的 Reactor 模型每一个用户事件都在一个线程中执行:
   2. 性能有极限,不能处理成百上千的事件
   3. 当负荷达到一定程度时,性能将会下降
   4. 某一个事件处理器发生故障,不能继续处理其他事件
   ```

   ![image.G93OM0](assets/image.G93OM0.png)

2. Reactor 多线程模型

   Reactor 多线程模型是由***一组NIO线程***来处理IO操作(之前是单个线程) 可以处理更多的客客户端请求

   使用***多个线程***执行***多个任务*** 任务可以***同时执行***

   ![image.G32TM0](assets/image.G32TM0.png)

   如果并发量特别大的话 还是比较拉跨

3. Reactor ***主从***多线程模型

   Netty 推荐使用的模型 高并发

   一组***线程池***处理***接受请求***,s 一组***线程池***处理***IO***

   ![image.I0M4M0](assets/image.I0M4M0.png)

------

### Netty - 基于WebSocket的聊天Demo

Code - 见Code

```xml
Maven
<dependencies>
	<dependency>
		<groupId>io.netty</groupId>
		<artifactId>netty-all</artifactId>
		<version>4.1.15.Final</version>
	</dependency>
</dependencies>
```

##### websocket 以及前端代码编写

websocket是应用层上的应用层协议 依赖于HTTP协议进行一次握手. websocket在进行握手之后就可以脱离HTTP进行TCP传输了

##### MUI

一个轻量级的前端框架 可以是Android 或者 IOS平台

使用MUI发起Ajax请求 :

```javascript
mui.ajax('http://192.168.1.xxx:9000/login‘), // 注意不能是127.0.0.1
	data:{
		username:username.value,
		password:password.value	
},
	dataType:'json', // 服务器返回json数据
	type:'post',
	timeout: 10000,
	headers:{
	'Content-Type' : 'application/json'  
},
success:function(data){
	// 可以用console.log()
	conslole.log(data);
},
error:function(xhr,type,errorThrown){
		console.log(type);
		}
	}
});
```

后段基于Springboot编写一个web应用

##### H5+

提供了对HTML5的增强 二维码 摄像头 地图位置 消息推送等功能

##### HBuilder

前端开发工具

##### 后端

基于Springoot编写的一个web应用 主要用于接受Ajax 响应数据到前端

```java
接收: @ResquestBody(User user)

响应: Map map = new HashMap<String,Object>
     if("用户名和密码都正确"){
         map.put("message",true);
         map.put("message","登陆成功");
     }else{
         ...
     }
     return map;
```

##### 字符串转JSON 以及 JSON 转字符串

*String2JSON*

```javascript
var jsonObj =  JSON.parse(jsonStr);
```

*JSON2String*

```javascript
var jsonStr = JSON.stringify(data);
console.log(JSON.stringify(data));
```

##### 页面跳转

```javascript
mui.openWindow({
	url:'xxx.html',
	id:'xxx.html'
});
```

***App客户端缓存操作***

大多数时候App客户端会把服务端的数据缓存到app客户端中(通过key-value 键值对来存放)

```javascript
var user = {
	username: usernmae.value,
	password: password.value
}
```

```javascript
这是一个JSON需要转换成String
plus.storage.setItem("user",JSON.stringify(user)); 
```

```javascript
从本地缓存中取出数据
var userStr = plus.storage.getItem("user");
```

------

### 项目构建

##### 功能需求:

登陆/注册 个人信息 搜索添加好友 好友聊天

##### 技术架构

***前端***

工具: HBuilder 

框架: MUI  H5+ 

***后端***

工具: IDEA

框架: Spring Boot Spring MVC MyBatis FastDFS Netty

数据库: MySQL



##### 前端-导入到HBiilder

xxx-chat.zip 解压并导入到 HBuilder

##### 后端-导入数据库/MyBatis逆向工程/SpringBoot项目

数据库: hchat.sql 

MyBatis逆向工程: generatorSqlmapCustom 到IDEA 

SpringBoot:修改pom.xml 和 application.properties 配置文件

##### 后端-SpringBoot整合Netty

spring-netty/xxx.java

------

### 业务开发

##### 用户注册/登陆/个人信息

*用户登陆*

使用IdWorker.java 雪花算法ID生成器 在Application.java中

创建Result实体类

创建返回客户端的User实体类(不要passowrd)

创建UserController (@RequestBody主要用来接收***前端***传递给后端的***json字符串***中的数据的(请求体中的数据的))

创建UserService 和 UserServiceImpl

*注册功能*

*FASTDFS - 文件服务器介绍与搭建*

分布式 高性能 高可用 负载均衡

Tracker server 集群管理 负载均衡和调度并收集Stroge集群状态

Stroge servcer 文件存储

*后端照片上传功能开发*

修改昵称

生成二维码

根据用户名和用户ID生成

并保存到FastDFS中

------

##### 聊天业务

用户ID关联Netty通道后端开发

![image.ZUYNM0](基于Netty的网络编程.assets/image.ZUYNM0.png)

































































































































