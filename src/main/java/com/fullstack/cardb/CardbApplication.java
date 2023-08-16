package com.fullstack.cardb;

import com.fullstack.cardb.domain.Car;
import com.fullstack.cardb.domain.Owner;
import com.fullstack.cardb.domain.User;
import com.fullstack.cardb.repository.CarRepo;
import com.fullstack.cardb.repository.OwnerRepo;
import com.fullstack.cardb.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardbApplication implements CommandLineRunner {
    @Autowired
    private CarRepo repo;
    @Autowired
    private OwnerRepo ownerRepo;
    @Autowired
    private UserServiceImpl usService;

    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CardbApplication.class, args);
        log.info("App started");
    }

    @Override
    public void run(String... args) throws Exception {
        Owner sam = new Owner("Sam", "Lolols");
        Owner july = new Owner("July", "Simson");
        ownerRepo.saveAll(Arrays.asList(sam, july));

        Car car1 = new Car("Sportage", "Kia", "Yellow", 2010, 1500000, "just a car", july);
        Car car2 = new Car("Mustang", "Ford", "Red", 2000, 3000000, "rich car",
                        sam);
        repo.saveAll(Arrays.asList(car1, car2));

        usService.saveUser(new User
                ("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
        usService.saveUser(new User
                ("admin", "admin", "ADMIN"));

    }

}
