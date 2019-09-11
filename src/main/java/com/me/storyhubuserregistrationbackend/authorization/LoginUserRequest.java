package com.me.storyhubuserregistrationbackend.authorization;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public final class LoginUserRequest {
    @NotNull
    private String email;

    @NotNull
    private String password;
}
