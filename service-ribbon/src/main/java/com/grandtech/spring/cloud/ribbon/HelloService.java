package com.grandtech.spring.cloud.ribbon;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFailure")
    public String hello() throws Exception {
        return restTemplate.getForObject(new URI("http://service-provider/hello"), String.class);
    }

    public String helloFailure(){
        return "hello service is not available !";
    }

}
