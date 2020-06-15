# JVM

### 1.为何要对JVM做优化

- 程序突然"卡住"
- CPU负载突然升高
- 多线程情况下,如何分配线程的数量

### 2.JVM的运行参数

- 三种参数类型 

  - 标准参数 -help -version
  - -X 参数 (非标准参数) -Xint -Xcomp
  - -XX 参数 (使用率较高) -XX:newSize -XX:+UserSerialGC

- 标准参数

    稳定的版本,以后基本不会变,可以用 -help 查看所有 标准参数

  - -showversion 参数表示:先打印版本信息,再执行后面的命令,在调试的时候很有用.
  - -D 设置系统属性参数
  - -server -client 参数 (64位机器默认是-server 初始空间大 并行垃圾回收)

- -X 参数

     java -X 查看所有非标准参数

  - -Xint -Xcomp -Xmixed

    -Xint : 在解释模式(Interpreted Model)下,该标记会强制JVM执行所有的字节码 ***解释模式***

    java -showversion -Xint TestJVM

    -Xcomp : 和-Xint 正好相反.第一次会把所有的字节码编译成本地代码

    (然而,很多应用在使用 -Xcomp也会有一些性能损失,当然这比使用-Xint损失的少,原因是-xcomp没有让JVM启用JIT编译器的全部功能。JIT编译器可以对是否需要编译做判断,如果所有代码都进行编译的话,对于一些只执行一次的代码就没有意义了) ***编译模式***

    java -showversion -Xcomp TestJVM

    -Xmixed 是混合模式 结合了解释模式和编译模式 有JVM自己决定 JVM默认的模式 也是推荐使用的模式

    java -showversion TestJVM 

- -XX 参数

    非标准参数 主要用于JVM调优和debug操作

  - 使用方式 一种是boolean  另一种是非boolean

    - boolean 

      ​	格式: -XX:[+-]
      ​	如: -XX:+DisableExplicitGC 表示禁用手动调用gc操作,也就是说调用System.gc()无效

    - 非boolean

      ​	格式: -XX:
      ​	如: -XX:NewRatio=1 表示新生代和老年代的比值

- -Xms 和 -Xmx 参数

    设置JVM的堆内存的初始大小和最大大小 适当选择JVM的内存大小 可以充分利用服务器资源 让程序跑的更快

  - -Xms512m:等价于-XX:InitialHeapSize,设置JVM初始堆内存为512M
  - -Xmx2048m:等价于-XX:MaxHeapSize,设置s-Xmx2048m:等价于-XX:MaxHeapSize,设置JVM最大堆内存为2048MJVM最大堆内存为2048M

- 查看JVM的运行参数

  - 运行 java命令时打印出运行参数 -XX:+PrintFlagsFinal  = := 代表默认值和被修改的值

  - 查看正在运行的java进程的参数 通过jinfo -flags <进程id>

    (通过jps jps -l可以查看java所有进程)

    查看某一参数的值,用法:jinfo ‐flag <参数名> <进程id>

### 3.JVM的内存模型

- JDK1.7

  - ![image.7RKGM0](/tmp/evince-13848/image.7RKGM0.png)

    virtual 是最大内存和初始内存的差值

- JDK1.8

  - ![image.44CIM0](/tmp/evince-13848/image.44CIM0.png)

    年轻代(Eden + 2 * Survivior) + 年老代(OldGen)

    注意:Metaspace的占用空间 不是在虚拟机内部 而是***本地内存***(Native Memory)的空间中

  - ![image.MH02L0](/tmp/evince-13848/image.MH02L0.png)

    

- 为何要废弃永久区?? 在现实使用中Perm经常因为不够用而发生内存泄露 爆出异常.

- 使用jstat查看堆内存的使用情况 jstat [-命令选项] [vmind] [间隔时间 毫秒][查询次数[

  - 查看class加载统计 jstat -class [pid]

  - 查看编译统计 jstat -compiler [pid]

  - 垃圾回收统计 jstat -gc [pid] (interval times)

    S0C :第一个Survivor区的大小(KB)
    S1C :第二个Survivor区的大小(KB)
    S0U :第一个Survivor区的使用大小(KB)
    S1U :第二个Survivor区的使用大小(KB)
    EC :Eden区的大小(KB)
    EU :Eden区的使用大小(KB)
    OC :Old区大小(KB)
    OU :Old使用大小(KB)
    MC :方法区大小(KB)
    MU :方法区使用大小(KB)
    CCSC :压缩类空间大小(KB)
    CCSU :压缩类空间使用大小(KB)
    YGC :年轻代垃圾回收次数
    YGCT :年轻代垃圾回收消耗时间

    FGC :老年代垃圾回收次数
    FGCT :老年代垃圾回收消耗时间
    GCT :垃圾回收消耗总时间

### 4.jmap的使用以及内存溢出分析

   jmap可以获取堆内存更加详细的内容 如:对内存使用情况的汇总及内存溢出的定位与分析

- 查看内存使用情况

  - jmap -heap [pid]   (-heap 是堆的意思)

- 查看内存中对象数量及大小

  - jmap -histo [pid] | more (查看所有对喜 活跃的和不活跃的)

  - jmap -histo:live [pid] | more (查看活跃的对象) 

    [ 数组,如[I表示int[]
    [L+类名 其他对象

- 将内存内容dump到文件中

  - jmap -dump:format=b,file=/home/dump.dat [pid]  (format=b 表示是二进制的文件)

- 使用jhat对dump文件进行分析 

  - jhat -port [port] [file] 打开浏览器进行访问

- 通过MAT工具对dump文件进行分析

### 5. 实战:内存溢出的定位与分析

- 出现的场景 : 不断的将数据写入一个集合里面 出现死循环 读取超大的文件 都可能导致造成内存溢出.

  如果是正常的需求的话就考虑加大内存的设置 如果是非正常需求的花就考虑对代码进行修改,修复这个bug

  那么第一步 就需要对问题进行定位jmap 和 MAT

- 模拟内存溢出的场景 在JVM Option的选项上添加 

  - #参数如下:
    ‐Xms8m ‐Xmx8m ‐XX:+HeapDumpOnOutOfMemoryError
  - 生成 java_pidxxxxxx.hprof 文件

- 将文件导入到MAT工具中进行分析

-  例如:

   91.03%的内存由Object[]数组占有,所以比较可疑。

  分析:这个可疑是正确的,因为已经有超过90%的内存都被它占有,这是非常有可能出现内存溢出

### 6. jstack 的使用

   jstack [pid]

   查看***JVM中的线程*** 的执行情况 如:服务器CPU的***负载*** 突然***增高*** ***死锁 死循环***等(但有时 程序是正常运行的 可能看不出来)

   jstack的作用是将正在运行的***jvm的线程*** 情况进行快照,并且打印出来

- 线程的状态

  - ![image.5TNGM0](/tmp/evince-13848/image.5TNGM0.png)

  - Java中线程的状态一共被分成6种:
    (1)初始态( NEW)
    创建一个 Thread对象,但还***未调用start()***启动线程时,线程处于初始态。
    (2)运行态( RUNNABLE),在Java中,运行态包括 ***就绪态 和 运行态***。
        ***就绪态***
    该状态下的线程已经获得执行所需的所有资源,只要 ***CPU分配执行权***就能运行。

    所有就绪态的线程存放在就绪队列中。
        ***运行态***
    获得 CPU执行权***,正在执行***的线程。
    由于一个 CPU同一时刻***只能执行一条线程***,因此每个CPU每个时刻只有一条运行态的线程。
    (3)阻塞态( BLOCKED)
    当一条正在执行的线程***请求某一资源失败***时,就会进入阻塞态。
    而在 Java中,阻塞态专***指请求锁失败时***进入的状态。
    由一个阻塞队列存放所有阻塞态的线程。
    处于阻塞态的线程会不断请求资源,一旦请求***成功,就会进入就绪队列,***等待执行。
    (4)等待态( WAITING)
    当前线程中调用 wait、join、park函数时,当前线程就会进入等待态。
    也有一个等待队列存放所有等待态的线程。
    线程处于等待态表示它***需要等待其他线程的指示***才能继续运行。
    进入等待态的线程会***释放 CPU执行权,并释放资源***(如:锁)
    (5)超时等待态( TIMED_WAITING)
    当运行中的线程调用 sleep(time)、wait、join、parkNanos、parkUntil时,就会进入该状态;
    它和等待态一样,并不是因为请求不到资源,而是***主动进入***,并且进入后需要其他线程***唤醒***;
    进入该状态后***释放 CPU执行权 和 占有的资源***。

    #### ***与等待态的区别:到了超时时间后自动进入阻塞队列,开始竞争锁。***

    (6)终止态( TERMINATED)
    线程执行结束后的状态。

- 实战:死锁问题(卡了 死机??)

  - 编写代码,启动2个线程,Thread1拿到了obj1锁,准备去拿obj2锁时,obj2已经被Thread2锁定,所以发送了死锁
  - jstack [pid]
  - ***"Thread‐1":***
    at TestDeadLock$Thread2.run(TestDeadLock.java:47)
    ‐ waiting to lock <0x00000000f655***dc40***> (a java.lang.Object)
    ‐ locked <0x00000000f655***dc50***> (a java.lang.Object)
    at java.lang.Thread.run(Thread.java:748)
    ***"Thread‐0":***
    at TestDeadLock$Thread1.run(TestDeadLock.java:27)
    ‐ waiting to lock <0x00000000f655***dc50***> (a java.lang.Object)
    ‐ locked <0x00000000f655***dc40***> (a java.lang.Object)
    at java.lang.Thread.run(Thread.java:748)
  - 由此可见 发生了***死锁***

  

### 7.VisualVM 工具的使用

VisualVM,能够监控线程,内存情况,查看方法的CPU时间和内存中的对 象,已被GC的对象,反向查看分配的堆栈(如100个String对象分别由哪几个对象分配出来的)。

VisualVM使用简单,几乎0配置,功能还是比较丰富的,几乎囊括了其它JDK自带命令的所有功能。

内存信息 线程信息 Dump堆 Dump线程 (可用jmap生成) 打开Dump 生成应用快照 性能分析

- 启动 是在jdk/bin/visualvm.exe
- 查看本地线程
- 查看CPU 内存 类 线程运行信息 (监视)
- 查看线程详情 同时可以点击dump (其实就ishijstak命令)
- 抽样器 对CPU 内存进行抽样 以供分析

监控远程的JVM(需要借助JMx java 管理扩展) 例如在远程的tomcat服务器的catalina.sh 下加上如下信息

#在tomcat的bin目录下,修改catalina.sh,添加如下的参数
JAVA_OPTS="‐Dcom.sun.management.jmxremote ‐
Dcom.sun.management.jmxremote.port=9999 ‐
Dcom.sun.management.jmxremote.authenticate=false ‐
Dcom.sun.management.jmxremote.ssl=false"



#这几个参数的意思是:
#‐Dcom.sun.management.jmxremote :允许使用JMX远程管理
#‐Dcom.sun.management.jmxremote.port=9999 :JMX远程连接端口

#‐Dcom.sun.management.jmxremote.authenticate=false :不进行身份认证,任何用户都可以连接
#‐Dcom.sun.management.jmxremote.ssl=false :不使用ssl

### 8. 垃圾回收

 对无效的资源申请的内存的清理工作称为垃圾回收

- 在c/c++中 没有垃圾回收机制 是通过new创建 通过delete删除(如果没有delete 申请的对象会一直占用资源 最后可能导致内存溢出)

  在Java中 有垃圾回收机制(GC)  C#或者Python中也有

- 垃圾回收常见算法

     引用计数法 标记清除法 标记压缩法 复制算法 分代算法

  - 引用计数法

    - 原理 :  1) 被引用- > +1  2) 引用失败 -> -1 3) 引用 =0 -> 回收

    - 优缺点 :  优点: 1)实时性高 2)无需挂起 3)区域性  

      ​				缺点: 1)每次都需要更新计数器 2) 浪费CPU资源 ***3) 无法解决循环引用问题*** (虽然 a 和 b 都为null,但是a 和 b都存在引用 所以不能回收)

  - 标记清除法

       标记: 从根节点开始标记引用的对象 清除: 从未被标记的对象可以被删除

    - 原理

      ![image.RSS4L0](/tmp/evince-28765/image.RSS4L0.png)

      ![image.LZXEM0](/tmp/evince-28765/image.LZXEM0.png)

      ![image.RPU1L0](/tmp/evince-28765/image.RPU1L0.png)

    - 优缺点 :  优点: 解决了循环引用问题 非root节点会被删除

      ​			    缺点:  1)效率底 ***2)碎片化严重***

  - 标记压缩法

      标记清除后 + 将存活的对象压缩到内存一端 然后清理边界以外的垃圾 从而解决碎片花

    - 原理: 

      ![image.IRCDM0](/tmp/evince-28765/image.IRCDM0.png)

      

    - 优缺点: 解决了碎片化问题 但是多出了对内存***位置移动***的步骤 对效率也有影响

  - 复制算法

    ![image.9AVYL0](/tmp/evince-28765/image.9AVYL0.png)

    - 在JVM中 Eden区中的Survivor区 Survivor FROM & Survivor TO(年龄达到一定阈值的对象 会被移动到年老代中)
    - 一分为二(每次只用其中的一块)->复制(正在使用的对象)->清空(该块内存)->交换(角色FROM / TO)->完成回收

    - 适合场景: 垃圾对象较多(不适合老年代内存) 缺点是 内存的利用率比较低 只能使用一半

  - 分代算法

      大统一JVM理论  根据垃圾回收对象的特点进行选择 才是明智的选择

    - ***年轻代*** 适合***复制算法*** 
    - ***年老代*** 适合***标记清除*** 或者***标记压缩******算法***

  

- 垃圾收集器以及内存分配

     ***串行垃圾收集器*  *并行垃圾收集器  CMS(并发)垃圾收集器  G1垃圾收集器***

  - 串行垃圾收集器: 指使用单线程进行垃圾回收 产生STW(Stop The World)现象 简直无法接受!!

    -XX: +Use***Serial***GC 指定年轻代和老年代都使用串行垃圾收集器

    -XX: +PrintGCDetails 打印垃圾回收的详细信息

    ***DefNew*** 表示的是串行垃圾回收器

  - 并行垃圾收集器: 将***单线程***转为***多线程***进行回收 (但还是会暂停应用程序 只是在垃圾回收的时候块了一些 暂停的时间更短了一些)

    - ***ParNew***垃圾收集器 工作在年轻代上的 -XX: UseParNewGC 老年代依然使用的是串行的

    - ***ParalleclGC***垃圾收集器  在ParNew的基础上增加了两个和***系统吞吐量***相关的参数 使得其使用起更加灵活和高级

      -XX:+UseParallelGC
      年轻代使用 ParallelGC垃圾回收器,老年代使用串行回收器。

      -XX:+UseParallelOldGC
      年轻代使用 ParallelGC垃圾回收器,老年代使用ParallelOldGC垃圾回收器

      -XX:MaxGCPauseMillis 设置最大停顿时间 (ms) 不可设置太小 飞则影响性能

      -XX:GCTimeRatio 设置垃圾回收时间占运行时间的百分比 分式为1/(1+n)

      -XX:UseAdaptiveSizePalicy 自适应GC模式  自动调整年轻代 年老代 达到吞吐量 堆大小 停顿时间的平衡

  - CMS(并发)垃圾收集器

    - CMS(Concurrent Mark Sweep) 是一款并发的、使用标记-清除算法的垃圾回收器,该回收器是针对***老年代***垃圾回收的,通过参数

      -XX:+UseConcMarkSweepGC进行设置。

      ![image.FI7BM0](/tmp/evince-29809/image.FI7BM0.png)

    - 初始化标记 (CMS-initial-mark) ,标记root,会导致stw;
      并发标记 (CMS-concurrent-mark),与用户线程同时运行;
      预清理( CMS-concurrent-preclean),与用户线程同时运行;
      重新标记 (CMS-remark) ,会导致stw;
      并发清除 (CMS-concurrent-sweep),与用户线程同时运行;
      调整堆大小,设置 CMS在清理之后进行内存压缩,目的是清理内存中的碎片;
      并发重置状态等待下次 CMS的触发(CMS-concurrent-reset),与用户线程同时运行;

    - -XX: +UserConcMarkSweepGC -XX:+PrintGCDetails

  - #### G1垃圾收集器  ！！

    始于JDK1.7 陷于JDK1.9 (代替了CMS)

    设计原则: 简化JVM性能调优 想进行JVM调优吗? 少年 仅需三步

    第一步: 开启G1垃圾回收器

    第二步: 设置堆的最代内存

    第三步: 设置最大的停顿时间

    提供三种模式: ***YoungGC  MixedGC FullGC*** 

    

    - 原理: 取消了年轻代 老年代的物理划分 取而代之的是区域(Region 居于逻辑的划分) 不用担心每个代内存是否够用

       ![image.ZUJ0L0](/tmp/evince-29809/image.ZUJ0L0.png)





![image.X5Q2L0](/tmp/evince-29809/image.X5Q2L0.png)

过程: 年轻代的垃圾回收中 仍需要暂停所有的应用线程 将存活的对象移动到Survivor 或者 老年代中 通过将对象从一个区域***转移***到另一个区域中的方法 完成了清理的工作(完成了堆的压缩 不会出现内存碎片的问题)

***Humongous***区域

(1)当一个对象占用的空间超过分区的50% 会被认为是一个Humongous区域

(2)被默认分配到老年代(若是一个 短期的巨型对象 就会造成负面影响)

(3)若一个H区不能装下 那么会寻找连续的H区 有时候不得已启动FullGC

模式:

- YoungGC 对Eden进行GC(在Eden空间消耗时会被触发)

  - Eden -> Survivor (如果不够 -> 年老代)
  - Surivivor(Old) -> Survivor(New)  (有的部分数据晋升到老年代)
  - 最终Eden空间的数据为空 GC停止 应用程序继续执行

  ![image.Z72CM0](/tmp/evince-29809/image.Z72CM0.png)

  ![image.ORTBM0](/tmp/evince-29809/image.ORTBM0.png)

  

  

  Remembered Set(已记忆集合)

  找出年轻代中对象的根对象(可能在年轻代或者在老年代)

  引入RSet的概念 作用是跟踪某个堆内的对象引用

  ![image.NNB1L0](/tmp/evince-29809/image.NNB1L0.png)

  每个 Region初始化时,会***初始化一个RSet***,该集合用来记录并跟踪***其它***Region指向***该***Region中对象的引用,每个Region默认按照***512Kb***划分成多个***Card***,所以RSet需要记录的东西应该是 xx Region的 xx Card。

  

- MixedGC

  为了避免内存被耗尽 MixedGC 除了回收***整个***YoungRegion 还会回收***一部分***的Old Region(可以选择对哪些Old Region进行收集)

  - 何时触发? 由参数 -XX:InitiatingHeapOccupancyPercent = n决定(默认45% 即当老年代占整个堆大小百分比达到该值的时候触发)

  - 分为两步: 全局并发标记(Global Concurrent marking) 拷贝存活对象(Evacuation)

  - 全局并发标记:

    - 初始标记(initial mark -> STW)
    - 根区域i扫描(root region scan)
    - 并发标记(Concurrent Marking)
    - 重新标记(Remark -> STW)
    - 清除垃圾(Cleanup -> STW)

  - 拷贝存活对象

    

- G1收集器相关参数

  - -XX:UseG1GC 使用G1垃圾收集器
  - -XX:MaxGCPauseMillis 设置***期望达到***的GC停顿时间 默认是200ms
  - -XX:G1HeapRegionSize=n 设置G1区域的大小
  - -XX:ParallelGCThreads=n 设置STW工作线程数的值(逻辑处理器的数量)
  - -XX:ConcGCThreads=n 设置并行标记的线程数(将n设置为ParallelGCThreads的1/4左右)
  - -XX:initatingHeapOccupancyPercent=n 设置触发标记周期的Java 堆占用率 默认是占用整个堆的45%

- 对G1垃圾收集器优化建议

  - 年轻代大小: 1)不要显示设置年轻代的大小 2)固定年轻的大小会覆盖暂停时间目标
  - 暂停时间目标不要太过苛刻

### 9.可视化GC日志分析工具

- GC日志输出参数

```
‐XX:+PrintGC 输出GC日志
‐XX:+PrintGCDetails 输出GC的详细日志
‐XX:+PrintGCTimeStamps 输出GC的时间戳(以基准时间的形式)
‐XX:+PrintGCDateStamps 输出GC的时间戳(以日期的形式,如 2013‐05‐
04T21:53:59.234+0800)
‐XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
‐Xloggc:../logs/gc.log 日志文件的输出路径
```

- GC Easy 可视化工具
  - http://gceasy.io/

### 10.Tomcat8优化

- Tomcat自身配置 Tomcat所运行的JVM虚拟机的调优

- 修改配置文件

  - cd apache‐tomcat‐8.5.34/conf
    #修改配置文件,配置tomcat的管理用户
    vim tomcat‐users.xml
    #写入如下内容:
    <role rolename="manager"/>
    <role rolename="manager‐gui"/>
    <role rolename="admin"/>
    <role rolename="admin‐gui"/>
    <user username="tomcat" password="tomcat" roles="admin‐gui,admin,manager‐gui,manager"/>
    #保存退出
  - vim webapps/manager/META‐INF/context.xml
    #将<Valve的内容注释掉
    <Context antiResourceLocking="false" privileged="true" >
    <!‐‐ <Valve className="org.apache.catalina.valves.RemoteAddrValve"
    allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" /> ‐‐>
    <Manager sessionAttributeValueClassNameFilter="java\.lang\.
    (?:Boolean|Integer|Long|Number|String)|org\.apache\.catalina\.filters\.Cs
    rfPreventionFilter\$LruCache(?:\$1)?|java\.util\.(?:Linked)?HashMap"/>
    </Context>
    #保存退出即可
    #启动tomcat
    cd /tmp/apache‐tomcat‐8.5.34/bin/
    ./startup.sh && tail ‐f ../logs/catalina.out
  - 打开网址进行测试 进入Server Status看状态

- 禁用AJP连接 (ajp-nio-8009)

  - AJP(Apache JServer Protocol)
  - AJPv13协议是***面向包***的。WEB服务器和Servlet容器通过***TCP***连接来交互;为了节省SOCKET创建的昂贵代价,WEB服务器会尝试维护一个永久TCP连接到servlet容器,并且在多个请求和响应周期过程会***重用***连接。
  - conf server.xml 将AJP服务禁用即可 <Connector port="8009" protocol="AJP/1.3" redirectPort="8443" />

- 执行器(线程池)

  - 在Tomcat中每个用户请求都是一个线程 可以用线程池提高性能

  - server.xml 文件

    <!‐‐将注释打开‐‐>
    <Executor name="tomcatThreadPool" namePrefix="catalina‐exec‐"
    maxThreads="500" minSpareThreads="50"
    prestartminSpareThreads="true" maxQueueSize="100"/>
    <!‐‐
    参数说明:
    maxThreads:最大并发数,默认设置 200,一般建议在 500 ~ 1000,根据硬件设施和业
    务来判断
    minSpareThreads:Tomcat 初始化时创建的线程数,默认设置 25
    prestartminSpareThreads: 在 Tomcat 初始化的时候就初始化 minSpareThreads 的
    参数值,如果不等于 true,minSpareThreads 的值就没啥效果了
    maxQueueSize,最大的等待队列数,超过则拒绝请求

    -->

    <!‐‐在Connector中设置executor属性指向上面的执行器‐‐>
    <Connector executor="tomcatThreadPool" port="8080" protocol="HTTP/1.1" connectionTimeOut="20000" redirectPort="8441"/>

  - 三种模式

    - bio 性能很低 没有经过优化处理和支持

    - nio 基于缓冲区 non-blocking I/O 有更好的并发运行性能 (推荐使用 nio2 tomcat8)

      <Connector executor="tomcatThreadPool" port="8080" protocol="org.apache.coyote.http11.Http11Nio2Protocol" connectionTimeOut="20000" redirectPort="8443"/>

    - apr 从操作系统角度提高性能 安装复杂 大幅度提高性能

### 11. JVM字节码

- javap 查看class文件字节码的内容 javap -v Test1.class > Test1.txt

  - 内容大致分为 4个部分:
    第一部分:显示了生成这个class的java源文件、版本信息、生成时间等.
    第二部分:显示了该类中所涉及到常量池,共35个常量。
    第三部分:显示该类的构造器,编译器自动插入的。
    第四部分:显示了main方法的信息。(这个是需要我们重点关注的)

  - 解读

    public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    //方法描述,V表示该方法的放回值为
    void
    flags: ACC_PUBLIC, ACC_STATIC
    // 方法修饰符,public、static的
    Code:
    // stack=2,操作栈的大小为2、locals=4,本地变量表大小,args_size=1, 参数的个数
    stack=2, locals=4, args_size=1
    0: iconst_2 //将数字2值***压入操作栈***,位于栈的最上面
    1: istore_1 //从***操作栈***中弹出一个元素(数字2),放入到***本地变量表***中,位于下标为1的位置(***下标为0的是this***)
    //将数字5值压入操作栈,位于栈的最上面
    3: istore_2 //从操作栈中弹出一个元素(5),放入到本地变量表中,位于第2: iconst_5下标为2个位置
    4: iload_2 //将本地变量表中下标为2的位置元素压入操作栈(5)
    5: iload_1 //将本地变量表中下标为1的位置元素压入操作栈(2)
    6: isub
    //操作栈中的2个数字***相减***
    7: istore_3 // 将相减的结果压入到本地本地变量表中,位于下标为3的位置
    // 通过#2号找到对应的常量,即可找到对应的引用
    8: getstatic
    #2
    // Field
    java/lang/System.out:Ljava/io/PrintStream;
    11: iload_3 //将本地变量表中下标为3的位置元素压入操作栈(3)
    // 通过#3号找到对应的常量,即可找到对应的引用,进行方法调用
    12: invokevirtual #3
    // Method
    java/io/PrintStream.println:(I)V
    15: return //返回
    //行号的列表
    LineNumberTable:
    line 6: 0
    line 7: 2
    line 8: 4
    line 9: 8
    line 10: 15
    LocalVariableTable: // 本地变量表
    Start Length Slot Name Signature
    0 16 0 args [Ljava/lang/String;
    2 14 1 a I
    4 12 2 b I
    8 8 3 c I
    }
    SourceFile: "Test1.java"

  - 图解

    ![image.CLUYL0](/tmp/evince-6912/image.CLUYL0.png)

    ![image.HU90L0](/tmp/evince-6912/image.HU90L0.png)

  ![image.F07HM0](/tmp/evince-6912/image.F07HM0.png)

  

- i++ 与 ++i

  - i++ 先返回再加1  ++i 先加1再返回
  - i++
    - 只是在本地变量中对数字做了相加 (不改变操作栈中的值)
    - 将前面拿到的数字1再次从操作栈中拿到 压入到本地变量中 又变成了0
  - ++i
    - 在本地变量中的数字做了相加 并且将数据压入到操作栈
    - 将操作栈中的数据 再次压入到本地变量中

- 字符串拼接

  - "+" 拼接

  - StringBuilder 拼接 不考线程安全的时候

  - StringBuffer 拼接 保证线程安全 效率比较低

    StringBuilder和+的效力是一样的

### 12. 代码优化

- 尽可能是局部变量
- 尽量减少对变量的重复计算
- 尽量是同懒加载的策略 即在需要的时候才创建
- 异常不应该用来控制程序流程
- 不要将数组声明为public static final
- 不要创建一些 不是用的对象 不要导入一些不是用的类
- 程序运行中避免使用反射
- 使用数据连接池和线程池
- 容器初始化的时候尽可能指定长度
- ArrayList随机遍历快,LinkedList添加删除快
- 使用Entry遍历Map for(Map.Entry<String,String> entry : map.entrySet())
- 不要手动条调用System.gc()
- String 尽量减少正则表达式
- 日志的输出注意级别
- 对资源的close()建议分开  独立的try catch