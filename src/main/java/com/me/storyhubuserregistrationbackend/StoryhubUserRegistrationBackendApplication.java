package com.me.storyhubuserregistrationbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StoryhubUserRegistrationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoryhubUserRegistrationBackendApplication.class, args);
    }

}
