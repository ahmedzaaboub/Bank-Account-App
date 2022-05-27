package fr.societegenerale.Model;

import org.junit.Test;

import java.math.BigDecimal;

public class StatementTest {

    @Test
    public void printStatements() {
        Account account = new Account(BigDecimal.valueOf(200));
        account.deposit(BigDecimal.valueOf(50));

        Statement.getInstance().printStatements();
    }
}