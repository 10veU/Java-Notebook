# Hexo搭建个人博客的相关知识  
### <a href="#1">一、Hexo框架介绍</a>  
### <a href="#2">二、框架的本地安装与运行</a>  
### <a href="#3">三、框架的基本结构与打包后的文件介绍</a>  
### <a href="#4">四、Hexo博客主题的安装与推荐</a>  

--- 
### <a name="#1">一、Hexo框架介绍</a>  
Hexo的官方网址：https://hexo.io/  
Hexo是一个快速，简单，很强大的博客框架。  
Hexo框架具有以下特点：
- 快速搭建  
- 支持Markdown语法  
- 一键部署  
- 丰富的插件  
### <a name="#2">二、框架的本地安装与运行</a>  
1. 基于node.js  
  [首先安装好node.js](https://www.runoob.com/nodejs/nodejs-install-setup.html)
2. 执行以下命令安装：  
- npm install hexo-cli -g  
- hexo init blog  
- cd bog  
- npm install  
- hexo server  
##### 注意：本人在windows上安装后，通过启动  hexo server命令后，访问其默认的地址：http://localhost:4000./ 无响应，其原因是端口可能被占用。    
解决办法：
- 执行hexo s -p 5000 命令，但是每次启动前都需要执行此命令，比较麻烦。  
- 在站点配置文件中加入以下的配置文件：  
 ```  
    server:
       port: 5000
       compress: true
       header: true  
 ```   
 通过访问```Hexo server(hexo -s) ```的默认地址，就能访问默认样式的博客了。  
 ### <a name="#3">三、框架的基本结构与打包后的文件介绍</a>  
 ![]()  
 node_modules: node.js的相关组件  
 scaddolds: 定义的一些东西，固定的   
 soorce: Markdown博客文档  
 themes: 一些主题  
 config: 配置文件  
 db.json: 生成的一些东西  
 package.json:  当前npm的相关的包  
 package-lock.json: npm管理的一些东西    
 生成静态网站的命令：```hexo generate(hexo -g)```，  多了一个public的文件夹,生成的文件部署起来就是一个静态的博客网站。  
 ### <a name="#4">四、Hexo博客主题的安装与推荐</a>  
 [Hexo官网主题](https://hexo.io/themes/)  
