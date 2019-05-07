package com.grandtech.spring.cloud.netflix.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping
    public String hello() {
        return "hello port " + port;
    }

}
