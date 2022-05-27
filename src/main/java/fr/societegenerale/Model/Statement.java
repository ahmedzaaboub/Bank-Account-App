package fr.societegenerale.Model;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    List<StatementRecord> records = new ArrayList<>();

    private static class SingletonHolder {
        public static Statement instance;

        public static Statement getInstance() {
            if (null == instance) {
                instance = new Statement();
            }
            return instance;
        }
    }

    public static Statement getInstance() {
        return SingletonHolder.getInstance();
    }

    public void recordStatement(final Account account, final StatementRecord.OperationType type) {
        records.add(new StatementRecord(type, account));
    }

    public void printStatements() {
        records.forEach(record -> {
            System.out.printf("operation:%s | date:%s | amount:%s | amount:%s",
                    record.type,
                    record.account.getDate(),
                    record.account.getBalance(),
                    record.account.getAmount()
            );
        });
    }
}
