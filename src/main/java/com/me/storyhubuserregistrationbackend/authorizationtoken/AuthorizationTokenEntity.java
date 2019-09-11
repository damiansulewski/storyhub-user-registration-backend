package com.me.storyhubuserregistrationbackend.authorizationtoken;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "authorization_token")
public class AuthorizationTokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorization_token_generator")
    @SequenceGenerator(name = "authorization_token_generator", sequenceName = "authorization_token_id_seq", allocationSize = 1)
    private Long id;

    private String userUuid;
    private String userEmail;
    private String token;
    private boolean used;

    AuthorizationTokenEntity(String userUuid, String userEmail) {
        this.userUuid = userUuid;
        this.userEmail = userEmail;
        this.token = UUID.randomUUID().toString();
    }
}
