package com.me.storyhubuserregistrationbackend.authorizationtoken;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorizationTokenRepository extends CrudRepository<AuthorizationTokenEntity, Long> {
    Optional<AuthorizationTokenEntity> findByUserUuidAndToken(String userUuid, String token);

    Optional<AuthorizationTokenEntity> findByToken(String token);

    Optional<AuthorizationTokenEntity> findByUserUuid(String userUuid);
}
