package com.investedge.controller;

import com.investedge.model.Transaction;
import com.investedge.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction processedTransaction = transactionService.processTransaction(transaction);
        return ResponseEntity.ok(processedTransaction);
    }
}
