package com.coderish.poc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${common.services.hostname}")
    private String hostname;

    @Value("${common.services.email.url}")
    private String emailUrl;

    private Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/get")
    public String getUrlString() {
        LOGGER.info("Inside getUrlString##");
        return hostname + emailUrl;
    }
}
