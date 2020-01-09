package com.cmots.hicmost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class HicmostApplication {

    public static void main(String[] args) {
        SpringApplication.run(HicmostApplication.class, args);
    }

}
