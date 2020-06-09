# AdminTLE

#### 背景

- 完全的响应式管理模板 浏览器兼容
- 基于Bootstrap 3 + J Query

#### 1.快速上手

1.1 直接使用

- 目录说明

  release\dist			发布目录
       		\pages        页面
  			 \plugins      插件库
  			 \img 		   图片
  			 \css	         css

  

- 创建模板步骤

  安置静态文件

  ​			 \abelrose\plugins

  ​			 \abelrose\img

  ​			 \\abelrose\css

  替换文件路经为相对的.可以设置 ../plugins/ , 替换成 <%=public_path%>/plugins/ 

  PS:<%=public_path%> 是你模板系统的 静态资源目录 ,请酌情修改

  

- 模板化拆分页面

  all-admin-index.html

  分为四个区域: 顶部导航、侧栏菜单、底部版权、内容区域

  ![image-20200609154720723](/home/matrix/.config/Typora/typora-user-images/image-20200609154720723.png)

  支持Layout创建母版

  <!DOCTYPE html>
  <html>
  <head>
  	<!-- 页面meta /-->
  	<!-- 页面css /-->
  </head>
  <body class="hold-transition skin-purple sidebar-mini">
  	<div class="wrapper">
  		<!-- 页面头部 /-->
  		<!-- 导航侧栏 /-->
  		<!-- 内容区域 /-->
  		<!-- 底部版权 /-->
  	</div>
  <!-- 页面js /-->
  </body>
  </html>

  all-admin-index.html 表示全部的html

  admin-index.html 表示内容区域的html



1.2 后台常用界面

- 登陆界面

  文件 

  ​		/release/dist/pages/all-admin-login.html
  ​		/release/dist/pages/admin-login.html

- 注册界面

  文件

  ​	    /release/dist/pages/all-admin-register.html
  ​		/release/dist/pages/admin-register.html

- 404错误界面

  文件

  ​       /release/dist/pages/all-admin-404.html
  ​	   /release/dist/pages/admin-404.html

- 500错误界面

  文件

  ​		/release/dist/pages/all-admin-500.html
  ​		/release/dist/pages/admin-500.html

- 空白页

  文件

  ​		/release/dist/pages/all-admin-blank.html
  ​		/release/dist/pages/admin-blank.html

- 数据表页

  界面元素

  表格、工具栏、翻页	

  文件

  ​		/release/dist/pages/all-admin-datalist.html
  ​		/release/dist/pages/admin-datalist.html

- 表单页

  文件

  ​		/release/dist/pages/all-admin-dataform.html
  ​		/release/dist/pages/admin-dataform.html

- 个人中心

  文件

  ​		/release/dist/pages/all-admin-profile.html
  ​		/release/dist/pages/admin-profile.html		

- 发票

  文件

  ​		/release/dist/pages/all-admin-invoice.html
  ​		/release/dist/pages/admin-invoice.html

- 发票打印

  文件

  ​		/release/dist/pages/all-admin-invoice-print.html



以下内容详见AdminTLE2.pdf

1.3 图表Charts

1.4 UI界面元素

1.5 表单Forms

1.6 表格Tables

1.7 样例数据管理

1.8 目录结构

- 目录

  ├── assets
  │ ├── css
  │ ├── data
  │ └── img
  ├── modules
  │ ├── css-modules
  │ ├── js-modules
  │ └── ui-modules
  ├── pages
  │ ├── admin
  │ ├── charts
  │ ├── documentation
  │ ├── elements
  │ ├── forms
  │ ├── tables
  │ └── travel-demo
  ├── plugins
  │ ├── adminLTE
  │ ├── bootstrap
  │ ├── bootstrap-markdown
  │ ├── bootstrap-slider
  │ ├── bootstrap-wysihtml5
  │ ├── chartjs
  │ ├── ckeditor
  │ ├── colorpicker
  │ ├── datatables
  │ ├── datepicker
  │ ├── daterangepicker
  │ ├── fastclick
  │ ├── flot
  │ ├── font-awesome
  │ ├── fullcalendar
  │ ├── iCheck
  | 资源
  | 模块 组件
  | 页面
  | jquery插件
  │ ├── input-mask
  │ ├── ionicons
  │ ├── ionslider
  │ ├── jQuery
  │ ├── jQueryUI
  │ ├── jvectormap
  │ ├── knob
  │ ├── morris
  │ ├── pace
  │ ├── raphael
  │ ├── select2
  │ ├── slimScroll
  │ ├── sparkline
  │ ├── timepicker
  │ └── treeTable
  ├── release
  │
  | 发布目录
  └── dist
  ├── README.md
  ├── fis-conf.js
  | fis3配置
  ├── fis-plus.js
  ├── gulpfile.js 		  | gulp配置
  └── package.json 	| npm配置

  

1.9 JQuery插件列表

1.10 Skins皮肤

- 设置皮肤样式

  ...
  <body class="skin-blue fixed" data-spy="scroll" data-target="#sc
  rollspy">

  <div class="wrapper">
  ...

  - 皮肤样式列表
    样式名称  			  说明
    skin-blue 			  蓝
    skin-blue-light      蓝-高亮
    skin-yellow     	   黄
    skin-yellow-light   黄-高亮
    skin-green 		    绿
    skin-green-light     绿-高亮
    skin-purple 		   紫
    skin-purple-light   紫-高亮
    skin-red 				 红
    skin-red-light	     红-高亮
    skin-black			  黑
    skin-black-light     黑-高亮

  

1.11 Layout 布局

- 布局主要有四个主要的部分

  Wrapper				  .wrapper.							 A div that wraps the whole site.
  Main Header 		 .main-header. 					Contains the logo and navbar.
  Sidebar 				   .sidebar-wrapper. 		     Contains the user panel and sidebar menu.
  Content 				  .content-wrapper. 	   	  Contains the page header and content.

- 布局选项

  Fixed: use the class ***.fixed*** to get a fixed header and sidebar.
  Collapsed Sidebar: use the class ***.sidebar***-collapse to have a collapsed
  sidebar upon loading.
  Boxed Layout: use the class ***.layout-boxed*** to get a boxed layout that
  stretches only to 1250px.
  Top Navigation use the class ***.layout-top-nav*** to remove the sidebar and
  have your links at the top navbar.
  Note: you ***cannot*** use both layout-boxed and fixed at the same time. Anything
  else can be mixed together.

  

1.12 JS选项

- 编辑app.js 修改$AdminTLE.options 对象以适合您的用例
- 定义AdminLTEOptions 并在加载app.js之前对其进行初始化



#### 2. 图表插件 Chart.js

1.功能特点

- 制作混合类型图表 轴类型图表 等

2.快速上手

- 引用文件

  <script src="../../plugins/Chart.js"></script>	

  html

  <canvas id="myChart" width="400" height="400"></canvas>

  var areaChartData = {
  labels: ["January", "February", "March", "April", "May",
  "June", "July"],
  datasets: [
  {
  label: "Electronics",
  fillColor: "rgba(210, 214, 222, 1)",
  652.1.图表charts
  strokeColor: "rgba(210, 214, 222, 1)",
  pointColor: "rgba(210, 214, 222, 1)",
  pointStrokeColor: "#c1c7d1",
  pointHighlightFill: "#fff",
  pointHighlightStroke: "rgba(220,220,220,1)",
  data: [65, 59, 80, 81, 56, 55, 40]
  },
  {
  label: "Digital Goods",
  fillColor: "rgba(60,141,188,0.9)",
  strokeColor: "rgba(60,141,188,0.8)",
  pointColor: "#3b8bba",
  pointStrokeColor: "rgba(60,141,188,1)",
  pointHighlightFill: "#fff",
  pointHighlightStroke: "rgba(60,141,188,1)",
  data: [28, 48, 40, 19, 86, 27, 90]
  }
  ]
  };
  var barChartCanvas = $("#myChart").get(0).getContext("2d");
  var barChart = new Chart(barChartCanvas);
  var barChartData = areaChartData;
  barChartData.datasets[1].fillColor = "#00a65a";
  barChartData.datasets[1].strokeColor = "#00a65a";
  barChartData.datasets[1].pointColor = "#00a65a";
  var barChartOptions = {
  //Boolean - Whether the scale should start at zero, or a
  n order of magnitude down from the lowest value
  scaleBeginAtZero: true,
  //Boolean - Whether grid lines are shown across the chart
  scaleShowGridLines: true,
  //String - Colour of the grid lines
  scaleGridLineColor: "rgba(0,0,0,.05)",
  //Number - Width of the grid lines
  scaleGridLineWidth: 1,
  //Boolean - Whether to show horizontal lines (except X a
  xis)
  scaleShowHorizontalLines: true,
  //Boolean - Whether to show vertical lines (except Y axis)
  scaleShowVerticalLines: true,
  responsive: true,
  };
  barChart.Bar(barChartData, barChartOptions);

- 说明

  scaleBeginAtZero: true, //尺度是否应该从零开始,或从最低值降到一个
  数量级
  scaleShowGridLines: true, // 是否显示网格
  scaleGridLineColor: "rgba(0,0,0,.05)", //网格线条颜色
  scaleGridLineWidth: 1, //网格线条宽度
  scaleShowHorizontalLines: true, //是否显示水平线(X轴除外)
  scaleShowVerticalLines: true,
  //是否显示垂直线(Y轴除外)
  responsive: true, //是否开启图表响应



以下详情见AdminTLE.pdf

3.编辑器

4.日期控件

5.字体

6.按钮

7.时间线

8.InputMasks

9.颜色选取

10.ICheck

11.数据表格



