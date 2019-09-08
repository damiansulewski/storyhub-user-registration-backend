package com.me.storyhubuserregistrationbackend.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
final class ActivateUserRequest {
    @NotNull(message = "{validation.message.required}")
    private final String uuid;
}
