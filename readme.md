### springboot + apache dubbo 示例

参考资料：

[dubbo-spring-boot-project](https://github.com/apache/dubbo-spring-boot-project)

这个目前是apache在维护，dubbo用这个版本，不要使用alibaba的那个版本了



注意点：如果使用了<dependencyManagement>管理springboot的版本，就不要使用<parent>了。不然会有java类冲突。

```xml
<!--	<parent>-->
<!--		<groupId>org.springframework.boot</groupId>-->
<!--		<artifactId>spring-boot-starter-parent</artifactId>-->
<!--		<version>2.1.6.RELEASE</version>-->
<!--		<relativePath/> &lt;!&ndash; lookup parent from repository &ndash;&gt;-->
<!--	</parent>-->

<properties>
    <spring-boot.version>2.1.1.RELEASE</spring-boot.version>
    <dubbo.version>2.7.1</dubbo.version>
</properties>
    
<dependencyManagement>
    <dependencies>
        <!-- Spring Boot -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>${spring-boot.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
  </dependencies>
</dependencyManagement>
```