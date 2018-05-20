<a href="#1">一、Web Service的概念</a>  
<a href="#2">二、Web Service架构和云</a>   
<a href="#3">三、本地服务的缺陷</a>  
<a href="#4">四、Web Service的优势</a>  
<a href="#5">五、Web Service的发展趋势</a>  
# Web Service的相关知识  
### <a name="1"> 一、Web Service的概念 </a>   
&emsp;&emsp;想要理解Web service，必须先理解什么是Service（服务）。  
&emsp;&emsp;通俗地说，"服务"就是计算机可以提供的某一种功能。  
&emsp;&emsp;根据来源的不同，"服务"又可以分成两种：一种是"本地服务"（使用同一台机器提供的服务，不需要网络），另一种是"网络服务"（使用另一台计算机提供的服务，必须通过网络才能完成）。  
&emsp;&emsp;"网络服务"（Web Service）的本质，就是通过网络调用其他网站的资源。  
### <a name="2"> 二、Web Service架构和云 </a>  
&emsp;&emsp;如果一个软件的主要部分采用了"网络服务"，即它把存储或计算环节"外包"给其他网站了，那么我们就说这个软件属于Web Service架构。  
&emsp;&emsp;Web Service架构的基本思想，就是尽量把非核心功能交给其他人去做，自己全力开发核心功能。  
&emsp;&emsp;最近很红的"云计算"（cloud computing）或者"云服务"（cloud services），实际上就是Web Service的同义词，不过更形象一些罢了。它们不说你把事情交给其他计算机去做，而说你把事情交给"云"去做。  
### <a name="3"> 三、本地服务的缺陷 </a>   
"网络服务"是未来软件开发和使用的趋势，本地服务将用得越来越少，主要因为以下三个原因：    
 - 本地资源不足。很多数据和资料，本地得不到，只有向其他网站要。  
 - 成本因素。本地提供服务，往往是不经济的，使用专业网站的服务更便宜。这里面涉及硬件和人员两部分，即使你买得起硬件，专门找一个人管理系统，也是很麻烦的事。   
 - 可移植性差。如果你想把本机的服务，移植到其他机器上，往往很困难，尤其是在跨平台的情况下。   
 ### <a name="4"> 四、Web Service的优势 </a>   
 除了本地服务的缺点以外，Web Service还有以下的优越性：
 - 平台无关。不管你使用什么平台，都可以使用Web service。  
 - 编程语言无关。只要遵守相关协议，就可以使用任意编程语言，向其他网站要求Web service。这大大增加了web service的适用性，降低了对程序员的要求。  
 - 对于Web service提供者来说，部署、升级和维护Web service都非常单纯，不需要考虑客户端兼容问题，而且一次性就能完成。    
 - 对于Web service使用者来说，可以轻易实现多种数据、多种服务的聚合（mashup），因此能够做出一些以前根本无法想像的事情。  
 ### <a name="5"> 五、Web Service的发展趋势 </a> 
 根据我的观察，目前Web service有这样几种发展趋势。  
 - 在使用方式上，RPC和soap的使用在减少，Restful架构占到了主导地位。
 - 在数据格式上，XML格式的使用在减少，json等轻量级格式的使用在增多。  
 - 在设计架构上，越来越多的第三方软件让用户在客户端（即浏览器），直接与云端对话，不再使用第三方的服务器进行中转或处理数据。  
  
   —— 以上内容均摘自《阮一峰的网络日志》  
  ---
### schema约束  
 schema规范中：  
	1. 所有的标签和属性都必须  要有schema文件来定义  
	2. 所有的schema文件都需要有一个id,但是在这里叫它namespace  
	3. namespace的值由什么来指定？  
	&emsp;&emsp;由targetNamespace属性来指定，它的值是一个url(很有可能不存在)  
	4. 如何引入一个schema约束？  
	&emsp;&emsp;属性？：xmlns属性  
 &emsp;&emsp;属性值：对应的schema文件的id  
		elementFormDefault:是一个枚举值，  
 &emsp;&emsp;默认是unqualified,只约束根标签；  
	&emsp;&emsp;qualified是关联所有标签；  
5.如果引入的schema文件不是W3C组织定义的，必须指定schema文件的位置  
6.schema文件的位置由什么属性来指定?  
 &emsp;&emsp;属性：schemaLocation  
 &emsp;&emsp;属性值：namespace path  
7.如果引入N个约束，需要引入n-1个别名  
[schema约束的示例](https://github.com/AbsolutelyEmpty/Java-Notebook/tree/master/WebService/schema-example)
### http请求协议
#### 请求（request）
  - 请求头  
  - 请求行（请求方法 请求路径 协议版本）
  - 请求体 （post才有）
#### 响应（response）
  - 响应头
  - 响应行
  - 响应体
#### 请求的过程  
### Webservice的几个问题？  
* Webservice是什么?  
  - 基于Web的服务，服务端整理出一些资源，让客户端应用访问（访问数据）  
  - 一个跨语言，跨平台的规范（抽象的概念）  
  - 多个跨语言，跨平台的应用间通信的整合方案（实际）  
* 为什么要用Web Service?  
  - 跨平台调用  
  - 跨语言调用  
  - 远程调用  
* 什么时候使用Web Service?  
  - 同一家公司的新旧应用之间  
  - 不同公司的应用之间（天猫网与物流公司之间的数据交互）  
  - 一些提供数据的内容聚合应用  
 ### Web Service中的几个重要术语  
 * WSDL:web service definition language(Web服务定义语言)  
   1. 对应一种类型的文件 （.wsdl）  
   2. 定义了webservice的服务端与客户端应用交互传递请求和响应数据的格式和方式  
   3. 一个web service对应一个唯一的wsdl文档  
 * SOAP:simple object access protocal(简单对象访问协议)  
   1. 是一种简单的、基于HTTP和XML的协议，用于在WEB上交换结构化的数据  
   2. soap消息：请求消息和响应消息  
   3. http+xml片断  
 * SEI WebService End Point Interface(web service的终端接口）  
   1. 就是WebService服务端用来处理请求的接口  
 * CXF：Celtix + XFire  
   一个apache的用于开发webservice服务器端和客户端的框架  
  
  ---  
   
### 开发webservice  
  * 开发手段：  
    - 使用JDK开发（JDK1.6及以上版本）  
    - 使用CXF框架开发  
  * 组成  
    - 服务器端  
    - 客户端   
 #### 使用JDK开发WebService  
 (1) 开发服务器端  
   - Web Service编码：  
     @WebService(SEI和SEI的实现类)  
     @WebMethod(SEI中的所有方法)  
   - 发布Web Service:  
     Endpoint (终端 发布webservice)  
      
 (2) 开发客户端  
   - 使用eclipse提供的web service浏览器去访问  
     1. 查看对用的wsdl文档（发布的地址?wsdl）—— 一般浏览器  
     2. 请求wenService并查看请求和响应消息（webservice浏览器)  
   - 创建客户端应用编码方式访问  
   [示例代码](https://github.com/AbsolutelyEmpty/Java-Notebook/tree/master/WebService/jdk-webservice-example)
     1. 借助jdk的wsimport.exe工具生成客户端代码:  
        生成方式：执行wsimport -keep url (url为wsdl文件的路径)  
     2. 借助生成的代码编写请求代码  
 ### 监听请求：使用Eclipse的TCP/IP工具(端口转发)  
 [示例代码](https://github.com/AbsolutelyEmpty/Java-Notebook/tree/master/WebService/jdk-webservice-example-client(TCP-IP%20Monitor)) 
 1. 将服务器端的WSDL文档保存到客户端本地  
 2. 修改文档：将端口从8088改为8080  
 3. 根据本地的wsdl文档生成客户端代码，并编写客户端的调用代码  
 4. 配置eclipse的TCP/IP，启动监听  
 ![](https://github.com/AbsolutelyEmpty/Java-Notebook/blob/master/WebService/img/TCP-IP%20Montior%E9%85%8D%E7%BD%AE.png)  
 5. 执行客户端代码执行WebService请求  
 ![](https://github.com/AbsolutelyEmpty/Java-Notebook/blob/master/WebService/img/TP-IP%20Monitor%E7%9B%91%E5%90%AC%E4%BF%A1%E6%81%AF.png)  
 ### 编写天气预报和手机归属地的WebService  
 * Google免费的"webservice服务"，找到提供天气预报的webservice的网络地址：  
    - http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl  
    使用eclipse的WebService Explore进行访问  
    ![使用eclipse的WebService Explore](https://github.com/AbsolutelyEmpty/Java-Notebook/blob/master/WebService/img/webserviceExplor%E8%B0%83%E7%94%A8webservice%E6%9C%8D%E5%8A%A1.png)  
 * 客户端编码方式访问  
 [示例代码](https://github.com/AbsolutelyEmpty/Java-Notebook/tree/master/WebService/weather-webservice-client)  
    - 借助命令工具生成客户端代码  
    - 借助生成的代码编写请求代码  
 ## 注意：  
 Java调用.net的webservice都存在问题  
 通过命令生成客户端代码时会抛出异常，无法生成客户端的代码。解决方法如下：  
   1. 将对应的wsdl文档保存在本地  
   2. 修改wsdl文档的部分内容：  
   将<s:element ref="s:schema" /><s:any />改为<s:any minOccurs="2" maxOccurs="2"/>  
   3. 通过命令生成客户端代码  
   4. 借助生成的代码编写请求代码  
   ---
    
 
 

 
 
      
 

 
