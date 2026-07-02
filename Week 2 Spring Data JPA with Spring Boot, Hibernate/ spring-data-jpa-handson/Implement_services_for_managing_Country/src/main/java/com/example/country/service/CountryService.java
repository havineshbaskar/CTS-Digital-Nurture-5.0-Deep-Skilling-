package com.example.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.country.entity.Country;
import com.example.country.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    // Get all countries
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    // Get country by code
    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }

    // Add a new country
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    // Update an existing country
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    // Delete a country
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }
}