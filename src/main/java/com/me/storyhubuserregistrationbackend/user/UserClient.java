package com.me.storyhubuserregistrationbackend.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user", url = "${user-authenticator.user-repository.server-url}")
public interface UserClient {
    @PostMapping(path = "${user-authenticator.user-repository.create-user-path}")
    String createUser(@RequestBody CreateUserRequest request);

    @PutMapping(path = "${user-authenticator.user-repository.activate-user-path}")
    void activateUser(@RequestParam("uuid") String uuid);

    @GetMapping(path = "${user-authenticator.user-repository.is-email-already-exists-path}")
    boolean isEmailAlreadyExists(@RequestParam("email") String email);

    @PostMapping("${user-authenticator.user-repository.login-user}")
    boolean loginUser(@RequestBody LoginUserRequest request);
}
