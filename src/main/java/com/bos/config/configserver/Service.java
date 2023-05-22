package com.bos.config.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private static final Logger log= LoggerFactory.getLogger(Service.class);
    @Value("${service.name}")
    private String value;
    public void print(){
        log.info("property value = {}",value);
    }
}
