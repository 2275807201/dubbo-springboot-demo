package com.liangh.dubbo.demo.consumer.service;

import java.math.BigDecimal;

public interface TransferMoney {

    void transferMoeny(int sourceId, int targetId, BigDecimal amount);
}
