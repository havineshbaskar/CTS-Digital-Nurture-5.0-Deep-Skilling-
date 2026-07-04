package com.example.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.Country;
import com.example.springrest.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/country")
    public Country getCountry() {

        return service.getCountry();

    }

}