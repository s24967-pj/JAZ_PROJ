package com.example.jazs24967nbp.Bank;

import com.example.jazs24967nbp.Bank.Bank;
import com.example.jazs24967nbp.Bank.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BankService {

    private final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public List<Bank> getKursList() {

        return bankRepository.findAll();
    }

    public Bank getWalutaById(int id) {
        return bankRepository.findById(id).get();
    }

    public Bank addMovie(Bank movie) {
        return bankRepository.save(movie);
    }


}
