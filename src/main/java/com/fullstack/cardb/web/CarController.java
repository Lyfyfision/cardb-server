package com.fullstack.cardb.web;

import com.fullstack.cardb.domain.Car;
import com.fullstack.cardb.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CarController {

    @Autowired
    private CarRepo carRepo;

    @RequestMapping(value ="/cars", method = GET)
    public Iterable<Car> getCars() {
        return carRepo.findAll();
    }
}
