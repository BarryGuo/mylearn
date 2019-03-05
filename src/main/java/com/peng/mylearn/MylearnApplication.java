package com.peng.mylearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 纪念我的第一个项目
 */
@RestController
@SpringBootApplication
public class MylearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylearnApplication.class, args);
    }

    @GetMapping("/demo")
    public String demo() {
        return "hello world";
    }

    @Bean
    public CommandLineRunner CommandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            System.out.println("spring默认提供的Bean------");
            String[] names = applicationContext.getBeanDefinitionNames();
            Arrays.sort(names);
            Arrays.stream(names).forEach(System.out::println);
        };
    }
}
