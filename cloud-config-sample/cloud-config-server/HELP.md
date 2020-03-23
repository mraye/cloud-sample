# cloud-config-server



通过访问 `http://localhost:8888/myapp/dev/master`, 即 `http://localhost:port/{application}/$[profile}/{lable}`


其中:  

+ application: 应用名称，这里是 myapp
+ profile: spring.profile.active 映射的值
+ label: git 分支，默认是 master, 可以是其他分支



