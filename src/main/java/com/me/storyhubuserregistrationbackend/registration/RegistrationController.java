package com.me.storyhubuserregistrationbackend.registration;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
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
    @GetMapping("activate-user")
    public void acceptActivate(@NotNull @RequestParam("userUuid") String userUuid, @NotNull @RequestParam("tokenUuid") String tokenUuid) {
        registrationService.activateUser(userUuid, tokenUuid);
    }

    @GetMapping("resend-activation-email")
    public void resendActivationEmail(@NotNull @RequestParam("userUuid") String userUuid) {
        registrationService.resendActivationEmail(userUuid);
    }
}
