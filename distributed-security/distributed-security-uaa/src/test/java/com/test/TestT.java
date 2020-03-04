package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestT {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
