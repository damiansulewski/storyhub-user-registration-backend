package com.me.storyhubuserregistrationbackend.validation.constraint;

import com.me.storyhubuserregistrationbackend.user.UserService;
import com.me.storyhubuserregistrationbackend.validation.ValidUniqueEmail;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class UniqueEmailValidator implements ConstraintValidator<ValidUniqueEmail, String> {
    private final UserService userService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return userService.isEmailAlreadyExists(value);
    }
}
