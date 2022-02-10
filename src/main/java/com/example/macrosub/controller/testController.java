package com.example.macrosub.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController  {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/logging")
    public void Test() throws  Exception{
        logger.trace("Trace Level 테스트");
        logger.debug("Debug Level 테스트");
        logger.info("Info Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");
    }
}
