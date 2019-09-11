package com.me.storyhubuserregistrationbackend.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public final class RegistrationActivateUserRequest {
    @NotNull(message = "{validation.message.required}")
    private final String uuid;
}
