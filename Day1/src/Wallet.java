import java.time.LocalDateTime;

class Wallet {
    private String ownerName;
    private double balance;
    private Transaction[] transactions = new Transaction[100];
    private int transactionCount = 0;
    // Correct Constructor
    public Wallet(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    // Fetch Transactions with Pagination
    public void fetchTransactions(int page, int limit) {
        int skip = (page - 1) * limit;
        System.out.println("\n--- Bank Transaction of " + ownerName + " ---");

        if (transactionCount == 0) {
            System.out.println("No transactions found!");
            return;
        }

        if (skip >= transactionCount) {
            System.out.println("Page out of range! No data on this page.");
            return;
        }

        int endIndex = Math.min(skip + limit, transactionCount);

        System.out.println("Showing transactions from index " + skip + " to " + (endIndex - 1));
        for (int i = skip; i < endIndex; i++) {
            System.out.println((i + 1) + ". " + transactions[i]);
        }
        System.out.println("Total Transactions: " + transactionCount);
    }

    // Add Money
    public void addMoney(double amount) {
        balance += amount;
        System.out.println(amount + " added. New balance = " + balance);

        addTransaction("CREDIT", amount);
    }

    // Pay Money
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Payment failed.");
            balance -= amount;
            return True;
        }
        System.out.println(amount + " paid. Remaining balance = " + balance);

        addTransaction("DEBIT", amount);
    }
    // Check Balance
    public void checkBalance() {
        System.out.println("Current balance = " + balance);
    }
    // Add Transaction
    private void addTransaction(String type, double amount) {
        if (transactionCount >= transactions.length) {
            increaseSize();
        }
        Transaction t=new Transaction(amount,type,balance);
        transactions[transactionCount] = t;
        transactionCount++;
    }
}
