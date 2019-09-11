package com.me.storyhubuserregistrationbackend.user;

import com.me.storyhubuserregistrationbackend.authorization.LoginUserRequest;
import com.me.storyhubuserregistrationbackend.registration.RegistrationActivateUserRequest;
import com.me.storyhubuserregistrationbackend.registration.RegistrationCreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;
    private final BCryptPasswordEncoder passwordEncoder;

    public void createUser(RegistrationCreateUserRequest request) {
        userClient.createUser(
                new CreateUserRequest(request.getName(),
                        request.getSurname(),
                        request.getEmail(),
                        request.getGender(),
                        passwordEncoder.encode(request.getPassword())));
    }

    public void activateUser(RegistrationActivateUserRequest request) {
    }

    public void loginUser(LoginUserRequest request) {
    }

    public boolean isEmailAlreadyExists(String email) {
        return userClient.isEmailAlreadyExists(email);
    }
}
