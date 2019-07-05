package com.liangh.dubbo.demo.provider.service;

import com.liangh.dubbo.demo.api.Ihello;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service(version = "1.0.0")
public class IhelloImpl implements Ihello {

    @Override
    public void sayHello() {
        log.info("生产者骄傲地说，hello,world");
    }
}
