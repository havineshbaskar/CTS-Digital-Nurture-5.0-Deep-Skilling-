package com.example.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springrest.model.Country;

@Service
public class CountryService {

    private List<Country> countryList = new ArrayList<>();

    public CountryService() {

        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("UK", "United Kingdom"));
        countryList.add(new Country("JP", "Japan"));
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}