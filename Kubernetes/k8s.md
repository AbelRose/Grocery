# K8S

### 概念

自动化容器化应用程序的部署、扩展和管理，结合docker容器工作 整合多个运行着docker容器的主机集群

目标: 让部署容器化的应用简单并且高效

特点: 能够自主的管理容器来保证云平台的容器能够按照用户的期望运行

相关特性: 

- 自动包装
- 横向缩放
- 自动部署和回滚
- 存储编排
- 自我修复
- 服务发现和负载均衡
- 密钥和配置管理
- 批处理

------

### K8S 快速入门

- 环境准备
  - 关闭centos 防火墙
  - 安装etcd 和 kubernetes 软件
  - 启动软件(如果docker启动失败，请参考(vi /etc/sysconfig/selinux 把selinux后面的改为disabled，重启机器，再重启docker就可以了))
- 配置
  - Tomcat 配置 
    - mytomcat.rc.yaml	
    - mytomcat.svc.yaml
- 问题解决
  - docker pull 失败
    - yum install rhsm -y
    - docker pull registry.access.redhat.com/rhel7/pod-infrastructure:lates
  - 外网不能访问(只能在具所在的结点上curl可访问 但是在其他任何主机上无法访问容器所占的端口)
    - vim /etc/sysctl.conf
    - net.ipv4.ip_forward=1
  - 解决 kubectl get pods时No resources found问题 
    - vim /etc/kubernetes/apiserver 
    - 找到”KUBE_ADMISSION_CONTROL="- admission_control=NamespaceLifecycle,NamespaceExists,LimitRanger,SecurityContextDeny,ServiceAccount,ResourceQuota"，去掉ServiceAccount，保存退出。
    - systemctl restart kube-apiserver 重启此服务
- 浏览测试

------

### K8S 基本架构和常用术语

![704717-20170304103633345-155330022](k8s.assets/704717-20170304103633345-155330022.png)

Kubernetes主要由以下几个核心组件组成：

- etcd保存了整个***集群的状态***； 
- apiserver提供了***资源操作的唯一入口***，并提供认证、授权、访问控制、API注册和发现等机制； 
- controller manager负责维护***集群的状态***，比如故障检测、自动扩展、滚动更新等； 
- scheduler负责***资源的调度***，按照预定的调度策略将Pod调度到相应的机器上； 
- kubelet负责维护***容器的生命周期***，同时也负责Volume（CVI）和网络（CNI）的管理； 
- Container runtime负责***镜像管理***以及***Pod和容器的真正运行***（CRI）； 
- kube-proxy负责为Service提供cluster内部的***服务发现和负载均衡***；

Kubernetes设计理念和功能其实就是一个类似Linux的分层架构 

- 核心层：Kubernetes最核心的功能，对外提供API构建高层的应用，对内提供插件式应用执行环境 
- 应用层：部署（无状态应用、有状态应用、批处理任务、集群应用等）和路由（服务发现、DNS解析等） 
- 管理层：系统度量（如基础设施、容器和网络的度量），自动化（如自动扩展、动态Provision等）以及策略 管理（RBAC、Quota、PSP、NetworkPolicy等） 
- 接口层：kubectl命令行工具、客户端SDK以及集群联邦 
- 生态系统：在接口层之上的庞大容器集群管理调度的生态系统，可以划分为两个范畴 Kubernetes外部：日志、监控、配置管理、CI、CD、Workflow、FaaS、OTS应用、ChatOps等 Kubernetes内部：CRI、CNI、CVI、镜像仓库、Cloud Provider、集群自身的配置和管理等







































































































































