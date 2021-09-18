package cn.vincent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "cn.vincent.*")
public class Boot01Application {
    public static void main(String[] args) {
        SpringApplication.run(Boot01Application.class, args);
    }
}