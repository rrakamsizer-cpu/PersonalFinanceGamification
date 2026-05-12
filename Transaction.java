package personalfinancegamification;

import java.time.LocalDateTime;
public class Transaction {
    private String transactionId;
    private double amount;
    private String category;
    private LocalDateTime date;
    private String type; // DEBIT veya CREDIT

    public Transaction(String transactionId, double amount, String category, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.category = category;
        this.type = type;
        this.date = LocalDateTime.now();
    }
}
