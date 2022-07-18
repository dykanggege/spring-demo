- mvc web框架，处理http请求，路由+参数+响应
  - spring-boot-starter-validation 参数校验
- webFlux 反应式的web框架
- data orm框架，JPA关系型数据库、MongoDB、Redis等
- security 鉴权
- cloud 微服务支持

# Spring Boot
- starter依赖
- 自动配置
- Actuator监控运行时状态
- 额外的测试支持

# Spring Boot DevTools
- 监控项目变更自动重启
- 内置H2控制台 http://localhost:8080/h2-console

# lombok
编译级别的插件，通过注解，在项目编译时生成getter、setter等

- @Data：注解在类上，将类提供的所有属性都添加get、set方法，并添加、equals、canEquals、hashCode、toString方法
- @RequiredArgsConstructor：创建对象, 例: 在class上添加

# H2
兼容mysql，作为jar包嵌入程序中的内存数据库

可用于本地验证或cache