package com.example.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 代表是个SpringBoot应用，组合了下面三个注解
// @SpringBootConfiguration 将该类声明为配置类
// @EnableAutoConfiguration 启用自动配置
// @ComponentScan 启用组件扫描，发现类似@Controller注解的等其他类并注册为Spring上下文中组件
    // Controller Service Repository 都是 Component 的别名，用于注册到Spring bean，实现控制翻转
@SpringBootApplication
public class TacoApplication {

    public static void main(String[] args) {
        // run执行应用引导过程，传入配置类和命令行参数
        SpringApplication.run(TacoApplication.class, args);
    }

}
