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

    @GetMapping("${user-authenticator.user-repository.user-credential}")
    UserCredential getUserCredential(@PathVariable("email") String email);
}
