package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "client",url = "http://localhost:2200",configuration = FeignConfig.class)
public interface FeignRestClient {
}
