package com.me.storyhubuserregistrationbackend.registration;

import com.me.storyhubuserregistrationbackend.authorizationtoken.AuthorizationTokenService;
import com.me.storyhubuserregistrationbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationService {
    private final UserService userService;
    private final AuthorizationTokenService authorizationTokenService;

    public void createUser(RegistrationCreateUserRequest request) {
        String userUuid = userService.createUser(request);
        String tokenUuid = authorizationTokenService.createAuthorizationToken(request, userUuid);

        //TODO send activation email
    }

    public void activateUser(String userUuid, String tokenUuid) {
        authorizationTokenService.validToken(userUuid, tokenUuid);
        authorizationTokenService.useToken(tokenUuid);
        userService.activateUser(userUuid);
    }

    public void resendActivationEmail(String userUuid) {
        String tokenUuid = authorizationTokenService.getToken(userUuid);

        //TODO send activation email
    }
}
