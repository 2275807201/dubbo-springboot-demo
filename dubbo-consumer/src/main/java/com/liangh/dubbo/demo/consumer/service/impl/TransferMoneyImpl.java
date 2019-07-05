package com.liangh.dubbo.demo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liangh.dubbo.demo.api.MoneyService;
import com.liangh.dubbo.demo.consumer.service.TransferMoney;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
public class TransferMoneyImpl implements TransferMoney {

    @Reference
    private MoneyService moneyService;

    @Override
    public void transferMoeny(int sourceId, int targetId, BigDecimal amount){
        log.info("dubbo 调用尝试");
        //todo ...
        moneyService.increaseMoney(targetId,amount);
        log.info("dubbo 调用结束");
    }

}
