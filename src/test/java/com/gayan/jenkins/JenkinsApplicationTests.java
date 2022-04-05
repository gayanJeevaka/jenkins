package com.gayan.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

    @Test
    void contextLoads() {
        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info("Welcome to jenkins build");
        Assertions.assertEquals(true, true);
    }

    @Test
    void contextLoad2() {
        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info("Welcome to jenkins new commit");
        Assertions.assertEquals(true, true);
    }

}
