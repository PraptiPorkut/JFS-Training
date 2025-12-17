package Training_Program;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

class Wallet{
    private String name;
    private double balance;
    private String[] transaction = new String[100];
    private int transactionCount = 0;
    private int transactionSize = 100;

    Wallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void checkbalance() {
        System.out.println("Current Balance : " +balance);
    }
    public boolean addMoney(double amount) {
        balance += amount;
        addTransaction("Credit ", amount);
        return true;
    }
    public void checkTransaction(Scanner sc) {
        System.out.print("Enter the Transaction ");
        int j = sc.nextInt();
        for (int i=0; i<=j;i++){
            if(transaction[i] !=null) System.out.println(transaction[i]);
        }
    }
    public void fetchTransaction (int page, int limit) { // Pagination
        int skip = (page-1)*limit;
        System.out.println("Statement for " + name + "...");
        if(transactionCount == 0) {
            System.out.println("No Transaction Found");
        }
        int dataIndex = skip+limit;
        for(int i=skip; i<dataIndex; i++) {
            if(i>transaction.length && i> transactionCount) {
                System.out.println("NO transaction available");
                break;
            }
            System.out.println(transaction[i]);

        }
    }
    public void addTransaction(String type, double amount) {
        if (transactionCount >= transaction.length) {
            increaseSize();
        }
        String record = LocalDateTime.now() + " | " + type + " | " + amount + " | Balance " + balance;
        transaction[transactionCount] = record;
        transactionCount++;
    }
    public boolean pay(double amount) {
        if(balance >= amount){
            balance -= amount;
            addTransaction("Debit",amount);
            return true;
        }
        return false;
    }

    public void increaseSize() {
        int newTransactionSize = transactionSize + transactionSize/2;
        String[] temp = new String[newTransactionSize];
        for (int i=0;i<transactionSize;i++) {
            temp[i] = transaction[i];
        }
        transaction = Arrays.copyOf(transaction, newTransactionSize);
        transaction = temp;
    }
    void searchByType(String type) {
        type = type.toLowerCase();
        for(int i=0;i<transactionCount;i++) {
            if(transaction[i].toLowerCase().contains(type)) {
                System.out.println(transaction[i]);
            }
        }

    }


    public void sumOfArray(int [] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }

}
