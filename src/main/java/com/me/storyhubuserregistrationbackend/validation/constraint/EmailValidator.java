package com.me.storyhubuserregistrationbackend.validation.constraint;


import com.me.storyhubuserregistrationbackend.validation.ValidEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    private static final String regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.matches(regexp);
    }
}
