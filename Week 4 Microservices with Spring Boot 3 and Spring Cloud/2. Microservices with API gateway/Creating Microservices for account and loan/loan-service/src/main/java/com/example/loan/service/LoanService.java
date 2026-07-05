package com.example.loan.service;

import org.springframework.stereotype.Service;

import com.example.loan.model.Loan;

@Service
public class LoanService {

    public Loan getLoan() {

        return new Loan(
                5001,
                "Havinesh",
                500000
        );

    }

}