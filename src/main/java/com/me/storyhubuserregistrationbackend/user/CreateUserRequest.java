package com.me.storyhubuserregistrationbackend.user;

import com.me.storyhubuserregistrationbackend.model.Gender;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class CreateUserRequest {
    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private String password;
}
