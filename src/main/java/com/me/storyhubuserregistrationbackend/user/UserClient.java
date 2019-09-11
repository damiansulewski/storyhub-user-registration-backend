package com.me.storyhubuserregistrationbackend.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user", url = "${user-authenticator.user-repository.server-url}")
public interface UserClient {
    @PostMapping(path = "${user-authenticator.user-repository.create-user-path}")
    void createUser(@RequestBody CreateUserRequest request);

    @GetMapping(path = "${user-authenticator.user-repository.is-email-already-exists-path}")
    boolean isEmailAlreadyExists(@RequestParam("email") String email);
}
