package com.me.storyhubuserregistrationbackend.authorizationtoken;

import com.me.storyhubuserregistrationbackend.registration.RegistrationCreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class AuthorizationTokenService {
    private final AuthorizationTokenRepository authorizationTokenRepository;

    @Transactional
    public String createAuthorizationToken(RegistrationCreateUserRequest request, String userUuid) {
        AuthorizationTokenEntity authorizationToken = new AuthorizationTokenEntity(userUuid, request.getEmail());
        authorizationTokenRepository.save(authorizationToken);

        return authorizationToken.getToken();
    }

    public void validToken(String userUuid, String token) {
        authorizationTokenRepository.findByUserUuidAndToken(userUuid, token)
                .orElseThrow(() ->
                        new RuntimeException(String.format("AuthorizationTokenEntity not found searching by userUuid=[%s] and token=[%s]",
                                userUuid, token)));
    }

    @Transactional
    public void useToken(String token) {
        AuthorizationTokenEntity authorizationToken = authorizationTokenRepository.findByToken(token)
                .orElseThrow(() ->
                        new RuntimeException(String.format("AuthorizationTokenEntity not found searching by token=[%s]",
                                token)));
        authorizationToken.setUsed(Boolean.TRUE);
    }

    public String getToken(String userUuid) {
        AuthorizationTokenEntity authorizationToken = authorizationTokenRepository.findByUserUuid(userUuid)
                .orElseThrow(() ->
                        new RuntimeException(String.format("AuthorizationTokenEntity not found searching by userUuid=[%s]",
                                userUuid)));
        return authorizationToken.getToken();
    }
}
