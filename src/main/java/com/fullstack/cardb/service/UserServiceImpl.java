package com.fullstack.cardb.service;

import com.fullstack.cardb.domain.User;
import com.fullstack.cardb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repo;

    @Override
    public User getUser(Long id) throws Exception{
        Optional<User> user = repo.findById(id);
        return unwrapUser(user, id);
    }

    @Override
    public User saveUser(User user) {
//        user.setPass(encoder.encode(user.getPass()));
        return repo.save(user);
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<User> getUsers() {
        return (List<User>)repo.findAll();
    }

    static User unwrapUser(Optional<User> entity, Long id) throws Exception {
        if (entity.isPresent()) return entity.get();
        else throw new Exception("User not found");
    }
}
