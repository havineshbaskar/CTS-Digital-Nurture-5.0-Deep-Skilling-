package com.example.spring_data_jpa_handson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring_data_jpa_handson2.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaHandson2Application implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandson2Application.class, args);
    }

    @Override
    public void run(String... args) {
        service.saveEmployee();
    }
}