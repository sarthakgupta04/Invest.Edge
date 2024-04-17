package com.investedge.service;

import com.investedge.model.Transaction;
import com.investedge.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction processTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
