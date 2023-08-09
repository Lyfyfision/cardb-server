package com.fullstack.cardb.repository;

import com.fullstack.cardb.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(exported = false)
public interface UserRepo extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);
    Optional<User> findByUsername (String username);



}
