package com.assignment.question3;

public interface BankAccountRepository {
    double getBalance(long accountId);
    double updateBalance(long accountId, double newBalance);
}