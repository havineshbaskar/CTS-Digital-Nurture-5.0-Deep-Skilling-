package com.example.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.country.entity.Country;
import com.example.country.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService service;

    // Get all countries
    @GetMapping
    public List<Country> getCountries() {
        return service.getAllCountries();
    }

    // Get country by code
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

    // Add a new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }

    // Update a country
    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return service.updateCountry(country);
    }

    // Delete a country
    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code) {
        service.deleteCountry(code);
        return "Country Deleted Successfully";
    }
}