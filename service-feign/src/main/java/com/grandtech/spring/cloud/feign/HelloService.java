package com.grandtech.spring.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVICE-PROVIDER", value = "SERVICE-PROVIDER", fallback = HelloServiceFailure.class)
public interface HelloService {
    //与服务提供方配的路径一致
    @GetMapping("/hello")
    String hello();
}
