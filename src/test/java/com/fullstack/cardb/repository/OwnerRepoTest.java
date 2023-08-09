package com.fullstack.cardb.repository;

import com.fullstack.cardb.domain.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = OwnerRepo.class)
class OwnerRepoTest {
    @Autowired
    private OwnerRepo repo;

//    @Test
//    void findById() {
//        assertTrue(repo.findById(owner1.));
//    }

    @Test
    void findByFirstName() {
        Owner owner = new Owner("Sam", "LOL");
        assertTrue(repo.findByFirstName("Sam").isPresent());
    }
}