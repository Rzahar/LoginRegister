package com.login.LoginRegister2.service;

import com.login.LoginRegister2.model.CustomUserDetails;
import com.login.LoginRegister2.model.User;
import com.login.LoginRegister2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null){
            throw  new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
