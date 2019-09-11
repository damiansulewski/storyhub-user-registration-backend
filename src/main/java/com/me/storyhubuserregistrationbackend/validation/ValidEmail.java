package com.me.storyhubuserregistrationbackend.validation;


import com.me.storyhubuserregistrationbackend.validation.constraint.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidEmail {

    String message() default "{validation.message.invalid-email}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
