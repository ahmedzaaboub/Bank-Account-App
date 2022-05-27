package fr.societegenerale.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

import static fr.societegenerale.Model.StatementRecord.OperationType.DEPOSIT;
import static fr.societegenerale.Model.StatementRecord.OperationType.WITHDRAW;

public class Account {

    private LocalDate date;
    private BigDecimal amount;
    private BigDecimal balance;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        this.date = LocalDate.now();
        this.amount = amount;
        this.balance = balance.add(amount);
        Statement.getInstance().recordStatement(this, DEPOSIT);
    }

    public void withdraw(BigDecimal amount) {
        this.date = LocalDate.now();
        this.amount = amount;
        balance = balance.subtract(amount);
        Statement.getInstance().recordStatement(this, WITHDRAW);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
