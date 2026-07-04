package com.example.springrest.service;

import org.springframework.stereotype.Service;

import com.example.springrest.model.Country;

@Service
public class CountryService {

    public Country getCountry() {

        Country country = new Country();

        country.setCode("IN");
        country.setName("India");

        return country;
    }
}