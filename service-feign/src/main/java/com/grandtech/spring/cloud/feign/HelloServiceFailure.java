package com.grandtech.spring.cloud.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFailure implements HelloService {
    @Override
    public String hello() {
        return "hello service is not available !";
    }
}
