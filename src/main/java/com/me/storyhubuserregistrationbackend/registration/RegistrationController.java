package com.me.storyhubuserregistrationbackend.registration;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("registration")
public class RegistrationController {
    private final RegistrationService registrationService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("create-user")
    public void createUser(@Valid @RequestBody RegistrationCreateUserRequest request) {
        registrationService.createUser(request);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PutMapping("activate-user")
    public void acceptActivate(@Valid @RequestBody RegistrationActivateUserRequest request) {
        registrationService.activateUser(request);
    }
}
