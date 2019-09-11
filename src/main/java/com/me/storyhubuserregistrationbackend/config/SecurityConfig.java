package com.me.storyhubuserregistrationbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
//@EnableWebSecurity
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
//    @Autowired
//    private UserDetailsService userDetailsService;

//    @Override
//    public void configure(WebSecurity web) {
//        web.ignoring().antMatchers("/v2/api-docs",
//                "/swagger-resources/**",
//                "/swagger-ui.html");
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/registration/*", "/authorization/*", "/dictionary/*").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authProvider());
//    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public DaoAuthenticationProvider authProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userDetailsService);
//        authProvider.setPasswordEncoder(passwordEncoder());
//        return authProvider;
//    }
}
