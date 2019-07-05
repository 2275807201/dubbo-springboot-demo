package com.liangh.dubbo.demo.consumer;

import com.liangh.dubbo.demo.consumer.service.TransferMoney;
import com.liangh.dubbo.demo.consumer.service.impl.TransferMoneyImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboDemoConsumerApplicationTest {

    @Autowired
    private TransferMoney transferMoney;

    @Test
    public void contextLoads() {

        transferMoney.transferMoeny(1001,2001,new BigDecimal(1));

    }

}