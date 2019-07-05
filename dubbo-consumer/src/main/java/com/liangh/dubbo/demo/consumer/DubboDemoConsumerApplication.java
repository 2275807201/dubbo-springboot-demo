package com.liangh.dubbo.demo.consumer;

import com.liangh.dubbo.demo.api.Ihello;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DubboDemoConsumerApplication {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private Ihello helloService;

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            log.info("调用生产者");
            helloService.sayHello();
        };
    }



}
