package com.example.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.Country;

@RestController
public class HelloController {

    @GetMapping("/country")
    public Country getCountry() {

        Country country = new Country();

        country.setId(1);
        country.setName("India");
        country.setCapital("New Delhi");

        return country;
    }
}