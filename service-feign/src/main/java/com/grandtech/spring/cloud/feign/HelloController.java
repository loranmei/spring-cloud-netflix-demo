package com.grandtech.spring.cloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping
    public String hello() {
        return helloService.hello();
    }
}
