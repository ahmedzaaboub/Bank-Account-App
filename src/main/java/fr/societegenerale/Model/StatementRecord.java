package fr.societegenerale.Model;

public class StatementRecord {

    public OperationType type;
    public Account account;

    public StatementRecord(final OperationType type, final Account account) {
        this.type = type;
        this.account = account;
    }

    public enum OperationType {
        DEPOSIT, WITHDRAW
    }
}
