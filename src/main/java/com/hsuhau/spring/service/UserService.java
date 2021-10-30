package com.hsuhau.spring.service;

import com.hsuhau.spring.bean.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}