package com.liangh.dubbo.demo.consumer;

import com.liangh.dubbo.demo.consumer.service.TransferMoney;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@Slf4j
@SpringBootApplication
public class DubboDemoConsumerApplication {

    @Autowired
    private TransferMoney transferMoney;

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            log.info("转账开始");
            transferMoney.transferMoeny(1001,2001,new BigDecimal(1));
            log.info("转账结束");
        };
    }



}
