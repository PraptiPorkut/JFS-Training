import java.util.Scanner;

public class CheckPrimeNumber{
    int count=0;
    int i=2;
    int checkPrime(int n){
        if(n>2) {
            while(i <= n / 2) {
                if (n % i == 0) {
                    count++;
                    i++;
                } else {
                    i++;
                }
            }
        }
        else{
                System.out.println("is Prime number");
            }
        return count;
        }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = sc.nextInt();
        CheckPrimeNumber cp =new CheckPrimeNumber();
        cp.checkPrime(num);
        if(count>1){
            System.out.println(num+"is not Prime Number.");
        }else{
            System.out.println(num+" is Prime Number.");
        }
    }
}
