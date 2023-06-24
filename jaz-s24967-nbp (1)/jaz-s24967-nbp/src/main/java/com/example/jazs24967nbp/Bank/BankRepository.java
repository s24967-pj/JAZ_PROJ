package com.example.jazs24967nbp.Bank;

import com.example.jazs24967nbp.Bank.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController

    public interface BankRepository extends JpaRepository<Bank, Integer> {
        @Override
        Optional<Bank> findById(Integer integer);

        @Override
        List<Bank> findAll();
    }

