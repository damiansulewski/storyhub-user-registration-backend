package com.me.storyhubuserregistrationbackend.registration;

import com.me.storyhubuserregistrationbackend.model.Gender;
import com.me.storyhubuserregistrationbackend.validation.ValidEmail;
import com.me.storyhubuserregistrationbackend.validation.ValidPassword;
import com.me.storyhubuserregistrationbackend.validation.ValidUniqueEmail;
import lombok.Getter;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public final class RegistrationCreateUserRequest {
    @NotNull(message = "{validation.message.required}")
    @Size(min = 2, max = 50, message = "{validation.message.invalid-size}")
    private String name;

    @NotNull(message = "{validation.message.required}")
    @Size(min = 2, max = 50, message = "{validation.message.invalid-size}")
    private String surname;

    @NotNull(message = "{validation.message.required}")
    @ValidUniqueEmail
    @Size(min = 4, max = 250, message = "{validation.message.invalid-size}")
    @ValidEmail
    private String email;

    @NotNull(message = "{validation.message.required}")
    private Gender gender;

    @NotNull(message = "{validation.message.required}")
    @ValidPassword
    private String password;

    @NotNull(message = "{validation.message.required}")
    private String confirmPassword;

    @AssertTrue(message = "{validation.message.password-not-matched}")
    private boolean isPasswordMatchedValid() {
        return this.password.equals(this.confirmPassword);
    }
}
