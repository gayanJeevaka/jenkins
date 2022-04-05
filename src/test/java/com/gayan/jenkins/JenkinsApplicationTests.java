package com.gayan.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

    Logger log = LoggerFactory.getLogger(this.getClass());
    @Test
    void contextLoads() {

        log.info("Welcome to jenkins build");
        Assertions.assertEquals(true, true);
    }

    @Test
    void contextLoad2() {

        log.info("Welcome to jenkins new commit");
        Assertions.assertEquals(true, true);
    }

}
