package com.liangh.dubbo.demo.consumer;

import com.liangh.dubbo.demo.api.Ihello;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DubboDemoConsumerApplication {

    @Reference
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
