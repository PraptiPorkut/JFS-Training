import java.time.LocalDateTime;

public class Transaction {
    private static int counter=1;
    private double amount;
    private String type;
    private double balance;
    private String note;
    private int tId = 1;
    private LocalDateTime  createdAt;

    public Transaction(double amount, String type,double balance) {
        this.amount = amount;
        this.type = type;
        this.balance=balance;
        tId++;
        createdAt= LocalDateTime.now();
    }

    String getRecord(){
        return createdAt+ "|"+type +" "+amount + " ";
    }
}
