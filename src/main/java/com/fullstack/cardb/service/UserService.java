package com.fullstack.cardb.service;

import com.fullstack.cardb.domain.User;

import java.util.List;

public interface UserService {
    User getUser(Long id) throws Exception;
    User saveUser(User user);
    void deleteUser(Long id) throws Exception;
    List<User> getUsers() throws Exception;
}
