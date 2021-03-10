package com.coderish.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQuartzApplication.class, args);
    }

}
