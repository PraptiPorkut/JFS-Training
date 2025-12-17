
    public static void main(String[] args) {
        Wallet w = new Wallet("Prapti", 4000);
        w.checkBalance();
        w.addMoney(300);
        w.pay(300);
        w.pay(500);
        w.addMoney(300);
        w.pay(300);
        w.pay(500);

        w.fetchTransactions(2, 3);  // page 1, limit 5
    }

