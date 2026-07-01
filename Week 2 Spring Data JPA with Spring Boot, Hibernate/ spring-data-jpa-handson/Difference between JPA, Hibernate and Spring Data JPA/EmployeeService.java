package com.example.spring_data_jpa_handson2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_data_jpa_handson2.Employee;
import com.example.spring_data_jpa_handson2.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee() {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Ravi");
        emp.setSalary(50000);
        emp.setId(102);
        emp.setName("Havi");
        emp.setSalary(60000);
        emp.setId(103);
        emp.setName("Giri");
        emp.setSalary(70000);

        repository.save(emp);

        System.out.println("Employee Saved Successfully");
    }
}