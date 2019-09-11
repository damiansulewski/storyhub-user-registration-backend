package com.me.storyhubuserregistrationbackend.authorization;

import com.me.storyhubuserregistrationbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("authorization")
public class AuthorizationController {
    private final UserService userService;

    @PostMapping("login-user")
    public void loginUser(@Valid LoginUserRequest request) {
        userService.loginUser(request);
    }
}
