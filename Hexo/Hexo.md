# Hexo搭建个人博客的相关知识  
### <a href="#1">一、Hexo框架介绍</a>  
### <a href="#2">二、框架的本地安装与运行</a>  
### <a href="#3">三、框架的基本结构与打包后的文件介绍</a>  
### <a href="#4">四、Hexo博客主题的安装与推荐</a>  
### <a href="#5">五、如何自定义你的博客结构</a>  
### <a href="#6">六、如何开始写博客文章以及文章的分类与标签</a>  
### <a href="#7">七、如何让代码在Hexo下显示更加美观</a>  
### <a href="#8">八、本地写作时最佳的图床解决方案</a>  
### <a href="#9">九、插件的安装和必备插件的介绍</a>  
### <a href="#10">十、如何让你的博客接入评论系统</a>  
### <a href="#11">十一、如何给你的博客增加搜索功能</a>  
### <a href="#12">十二、多个博客统计系统的接入方案分析</a>  
### <a href="#13">十三、部署博客到Github上的技巧</a>
### <a href="#14">十四、Hexo其他资源的介绍与分享</a>  

--- 
### <a name="1">一、Hexo框架介绍</a>  
Hexo的官方网址：https://hexo.io/  
Hexo是一个快速，简单，很强大的博客框架。  
Hexo框架具有以下特点：
- 快速搭建  
- 支持Markdown语法  
- 一键部署  
- 丰富的插件  
### <a name="2">二、框架的本地安装与运行</a>  
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
 ### <a name="3">三、框架的基本结构与打包后的文件介绍</a>  
 ![](https://github.com/AbsolutelyEmpty/Java-Notebook/blob/master/Hexo/img/Hexo%E6%A1%86%E6%9E%B6%E7%9A%84%E5%9F%BA%E6%9C%AC%E7%BB%93%E6%9E%84%E4%B8%8E%E6%89%93%E5%8C%85%E5%90%8E%E7%9A%84%E6%96%87%E4%BB%B6%E4%BB%8B%E7%BB%8D.png)  
 node_modules: node.js的相关组件  
 scaddolds: 定义的一些东西，固定的   
 soorce: Markdown博客文档  
 themes: 一些主题  
 config: 配置文件  
 db.json: 生成的一些东西  
 package.json:  当前npm的相关的包  
 package-lock.json: npm管理的一些东西    
 生成静态网站的命令：```hexo generate(hexo -g)```，  多了一个public的文件夹,生成的文件部署起来就是一个静态的博客网站。  
 ### <a name="4">四、Hexo博客主题的安装与推荐</a>  
 [Hexo官网主题](https://hexo.io/themes/)  
 &emsp;&emsp;在官网有很多主题，点击主题的示例图片就会查看该主题的实际效果；点击主题的名称，就会到该主题的详情，会有主题应用的文档，如何安装主题，如何配置，按照主题的文档一步一步操作就会成功应用主题。其中，有的博客有头像，赞赏码等图片，一般都放在Source文件中，然后在config的配置文件中按照对应的文件路径进行配置即可。  
#### 注：若想改变对应界面的CSS样式，可以借助浏览器的开发者工具，找到相应的CSS文件，按照自己的想法进行修改。  
### <a name="5">五、如何自定义你的博客机构</a>  
使用网页开发的基本技术进行文件的修改。（一般在用用主题的layout文件中）  
### <a name="6">六、如何开始写博客文章以及文章的分类与标签</a>  
- 首先自己下载一个Markdown编辑器，Markdown的语法自己可以在网上看看；  
- 自己按照官方指导文档Front-matter中一样，在写博客文章的时候，自己按照文档所示，按要求写，就会达到预期的效果。  
[](https://hexo.io/docs/front-matter.html)
### <a name="7">七、如何让代码在Hexo下显示更加美观</a>  
在官方的文档中也讲解了代码块如何显示  
[Tags Plugins](https://hexo.io/docs/tag-plugins.html)  
### <a neme="8">八、本地写作时最佳的图床解决方案</a>  
[七牛云](https://www.qiniu.com/?hmsr=biaoti&hmpl=pinzhuan&hmcu=biaoti&hmkw=&hmci=)  
使用七牛云进行配置后可以直接将图片上传到七牛云,简单，快捷的解决Markdown写博客引入图片的繁琐操作步骤。  
### <a neme="9">九、插件的安装和必备插件的介绍</a>  
[字数统计的插件(个人博客版)](http://ibruce.info/2015/04/04/busuanzi/#more)  
[官方插件](https://hexo.io/plugins/)  
尽可能将主要的精力用在写博客上，插件根据自己的需要选择性的安装。  
### <a neme="10">十、如和让你的博客介入评论系统</a>  
[Disqus]()  
[来必力](https://livere.com/)  
[畅言](http://changyan.kuaizhan.com/)
### <a neme="11">十一、如何给你的博客增加搜索功能</a>  
[swiftype](https://swiftype.com/)  
### <a neme="12">十二、多个博客统计系统的接入方案分析</a>  
统计的重要性  
cnzz统计  
百度统计  
### <a neme="13">十三、部署博客到Github上的技巧</a>  
[Github Pages](https://pages.github.com/)  
### <a neme="14">十四、Hexo其他资源的介绍与分享</a>  
[Hexo的中文官方文档](https://hexo.io/zh-cn/docs/)  
[手把手教你用Hexo+Github 搭建属于自己的博客](https://blog.csdn.net/gdutxiaoxu/article/details/53576018)  
[有哪些好看的Hexo主题](https://www.zhihu.com/question/24422335/answer/46357100)  

---
---

![]()










 
