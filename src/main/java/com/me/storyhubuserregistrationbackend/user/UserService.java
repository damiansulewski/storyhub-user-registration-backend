package com.me.storyhubuserregistrationbackend.user;

import com.me.storyhubuserregistrationbackend.registration.RegistrationCreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;
    private final BCryptPasswordEncoder passwordEncoder;

    public String createUser(RegistrationCreateUserRequest request) {
        return userClient.createUser(
                new CreateUserRequest(request.getName(),
                        request.getSurname(),
                        request.getEmail(),
                        request.getGender(),
                        passwordEncoder.encode(request.getPassword())));
    }

    public void activateUser(String uuid) {
        userClient.activateUser(uuid);
    }

    public boolean isEmailAlreadyExists(String email) {
        return userClient.isEmailAlreadyExists(email);
    }

    public UserCredential getUserCredential(String email) {
        return userClient.getUserCredential(email);
    }
}
