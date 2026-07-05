package com.example.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.Loan;
import com.example.loan.service.LoanService;

@RestController
public class LoanController {

    @Autowired
    private LoanService service;

    @GetMapping("/loan")
    public Loan getLoan() {

        return service.getLoan();

    }

}