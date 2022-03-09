package com.login.LoginRegister2.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "password";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);
    }
}
// $2a$10$kgPOeMXLG9u15xPk12yHE.AcVP7asZAOzEdaq/V35AtXUUVzb39mq