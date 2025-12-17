import java.util.Scanner;

class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Training_Program.Wallet w = new Training_Program.Wallet("sahil", 1000);
        w.addMoney(1000.3);
        w.pay(550);
        for (int i = 0; i <= 16; i++) {
            w.addMoney(10 + i * 2);
            w.pay(7 + i * 2);
        }

        w.checkbalance();
//        w.checkTransaction(sc);
        w.fetchTransaction(9, 30);

        int[] arr = {2,3,4,5,6,7,8,9}; // sum of array
        w.sumOfArray(arr);

        w.searchByType("DEBIT");
    }
}