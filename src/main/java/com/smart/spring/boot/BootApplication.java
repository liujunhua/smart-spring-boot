package com.smart.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liujunhua
 * @date 2020/12/25 16:22
 * @description: BootApplication
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用,SpringBoo运行这个类的main方法来启动SpringBoot应用；
 */
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}