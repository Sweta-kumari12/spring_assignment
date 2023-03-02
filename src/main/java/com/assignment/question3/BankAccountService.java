package com.assignment.question3;

public interface BankAccountService {
    double withdraw(long accountId, double balance);
    double deposit(long accountId, double balance);
    double getBalance(long accountId);
    boolean fundTransfer(long fromAccount, long toAccount, double amount);
}