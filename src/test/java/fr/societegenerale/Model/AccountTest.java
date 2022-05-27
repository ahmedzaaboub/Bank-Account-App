package fr.societegenerale.Model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountTest {

    @Test
    public void deposit() {
        Account account = new Account(BigDecimal.valueOf(200));
        account.deposit(BigDecimal.valueOf(50));
        Assert.assertEquals(BigDecimal.valueOf(250), account.getBalance());
    }

    @Test
    public void withdraw() {
        Account account = new Account(BigDecimal.valueOf(200));
        account.withdraw(BigDecimal.valueOf(50));
        Assert.assertEquals(BigDecimal.valueOf(150), account.getBalance());
    }
}