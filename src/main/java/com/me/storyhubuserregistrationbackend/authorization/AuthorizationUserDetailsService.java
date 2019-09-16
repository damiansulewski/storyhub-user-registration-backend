package com.me.storyhubuserregistrationbackend.authorization;

import com.me.storyhubuserregistrationbackend.user.UserCredential;
import com.me.storyhubuserregistrationbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationUserDetailsService implements UserDetailsService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserCredential user = userService.getUserCredential(username);

        return User.withUsername(username)
                .password(user.getPassword())
                .roles("USER")
                .build();
    }
}
