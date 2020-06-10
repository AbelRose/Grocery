# SpringMVC-ModelAndView

### ModelAndView 作用

##### 1.返回到指定页面

​	通过构造方法 return new ModelAndView("order-list")

​	通过setViewName() 跳转 mv.setViewName("order-list")

##### 2.返回参数到指定页面的request作用域中

​	addObject() 参数会返回到新页面的request作用域中

### ModelAndView 的三种用法

##### 1.创建ModelAndView对象，再通过它的方法去设置数据与转发的视图名

- ​	addObject(String attributeName,Object attributeValue);  

  ​	通过***Key/Value***的方式绑定数据 ,一般是JSP页	面中的***<c:forEach items=***

- ​    setViewName(String viewName); 

  ​	设置此ModelAndView的试图名称,由Dispatcherervlet通过viewResolver解析

##### 2.可以直接通过带有参数的构造方法 ModelAndView(String viewName, String attributeName, Object attributeValue) 来返回数据与转发的视图名	

##### 3.设置重定向

### ModelAndView 使用实例

##### 1.@RequestMapping 注解的使用

##### 2.modelandview 的使用

##### 3.jsp页面request作用域的取值

##### 4.视图解析器配置