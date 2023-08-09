package com.fullstack.cardb;

import com.fullstack.cardb.web.CarController;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CardbApplicationTests {

    @Autowired
    private CarController carController;

    @Test
    void contextLoads() {
        assertTrue(carController != null);
    }

}
