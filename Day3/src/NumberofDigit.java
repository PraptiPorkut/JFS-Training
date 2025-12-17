//Count all the digits of number
import java.util.Scanner;

public class NumberofDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count =0;
        if(num==0){
            count=1;
        }else{
            while (num>0){
                num /=10;
                count ++;
            }
        }
        System.out.println("Number of digits are:"+count);
    }
}
