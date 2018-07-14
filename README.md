# fast-jfinal-demo
fast-jfinal的演示项目

用assembly打包成jar，然后运行  java -jar xxx.jar 即可，跟spring boot jar运行方式一致。

### 1.pom.xml
引入
````
<dependency>
    <groupId>org.piaohao</groupId>
    <artifactId>fast-jfinal</artifactId>
    <version>1.0.0</version>
</dependency>
````

加入assembly打包插件
````
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>2.5.5</version>
    <configuration>
        <finalName>${project.name}-${project.version}</finalName>
        <appendAssemblyId>false</appendAssemblyId>
        <archive>
            <manifest>
                <mainClass>org.piaohao.fast.jfinal.demo.MainApp</mainClass>
            </manifest>
        </archive>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
    </configuration>
</plugin>
````

### 2.fast-jfinal.properties
````
server.port=8080  #启动端口
server.context.path=    #项目上下文路径
server.static.path=static    #静态资源根路径，放在resources目录下
tomcat.base.dir=/tmp/tomcat    #tomcat临时文件目录，可不设置
jfinal.config.class=org.piaohao.fast.jfinal.demo.DemoConfig    #JfinalConfig配置类
````

### 3.JFinalConfig
````
PathKit.setWebRootPath("templates");  //设置web视图根路径，放在resources目录下
````

````
engine.setSourceFactory(new ClassPathSourceFactory());  //设置jfinal模板引擎的工厂
````