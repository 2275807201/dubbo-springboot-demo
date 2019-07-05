package com.liangh.dubbo.demo.api;

import java.math.BigDecimal;

public interface MoneyService {

    void increaseMoney(int accountId, BigDecimal amount);
}
