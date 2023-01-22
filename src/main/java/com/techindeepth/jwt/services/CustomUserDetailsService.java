package com.techindeepth.jwt.services;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SimpleGrantedAuthority> roles;
        if(username.equals("admin"))
        {
            roles = Arrays.asList(new SimpleGrantedAuthority("VIEW_ADMIN"));
            return new User("admin", "password",
                    roles);
        }
        else if(username.equals("user"))
        {
            roles = Arrays.asList(new SimpleGrantedAuthority("VIEW_USER"));
            return new User("user", "password",
                    roles);
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
}
