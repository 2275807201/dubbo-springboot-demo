package com.liangh.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.liangh.dubbo.demo.api.MoneyService;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Service
public class MoneyServiceImpl implements MoneyService {

    @Override
    public void increaseMoney(int accountId, BigDecimal amount) {

        log.info("测试dubbo接口调用");
    }
}
