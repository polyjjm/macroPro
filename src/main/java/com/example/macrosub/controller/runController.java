package com.example.macrosub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
public class runController implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /*스프링 시작시 실행*/
    @Override
    public void run(String... args) throws Exception {
        logger.info("스프링 서비스 시작");
    }
    
    
    @RequestMapping(value = "/logging")
    public void Test() throws  Exception{
        logger.trace("Trace Level 테스트");
        logger.debug("Debug Level 테스트");
        logger.info("Info Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");
    }
}
