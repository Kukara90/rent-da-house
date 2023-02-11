package com.alexchern.rent_da_house_resource_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class RentDaHouseResourceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentDaHouseResourceServiceApplication.class, args);
    }
}
