package com.me.storyhubuserregistrationbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories
@EnableFeignClients
@SpringBootApplication
public class StoryhubUserRegistrationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoryhubUserRegistrationBackendApplication.class, args);
    }

}
