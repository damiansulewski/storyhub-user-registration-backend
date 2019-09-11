package com.me.storyhubuserregistrationbackend.registration;

import com.me.storyhubuserregistrationbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationService {
    private final UserService userService;

    public void createUser(RegistrationCreateUserRequest request) {
        userService.createUser(request);
    }

    public void activateUser(RegistrationActivateUserRequest request) {
        userService.activateUser(request);
    }
}
