package com.liangh.dubbo.demo.provider.service;

import com.liangh.dubbo.demo.api.MoneyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.math.BigDecimal;

@Slf4j
@Service(version = "1.0.0")
public class MoneyServiceImpl implements MoneyService {

    @Override
    public void increaseMoney(int accountId, BigDecimal amount) {

        log.info("测试dubbo接口调用");
    }
}
