package com.hackathon.hystrix.springhystrix.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/products")
public class ProductClientController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	 @Value("${client.url}")
	    private String url;
	
	@HystrixCommand(groupKey = "fallback",commandKey = "fallback",fallbackMethod = "hystrixFallBack")
    @GetMapping(value = "/hystrix")
    public List<?> hystrix() {
        return restTemplate.getForObject(url, List.class);
    }

    @GetMapping(value = "")
    public List<?> general() {
        return restTemplate.getForObject(url, List.class);
    }

    public List<?> hystrixFallBack(Throwable hystrixCommand) {
        List<String> str = new ArrayList<String>();
        str.add("Hystrix returned a fallback method");
		return str;
        
    }

}
