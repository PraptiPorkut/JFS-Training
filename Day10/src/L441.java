import java.util.Scanner;

public class L441 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of Coins: ");
        int coins = sc.nextInt();
        int i=0;
        int leftcoins=coins;
       while(i <=coins){
           i++;
           if(leftcoins > i){
               leftcoins = coins-i;
           }
           else if (leftcoins ==0)
           {
               System.out.println("Valid Rows : "+i);
               break;
           }
       }
    }

}
