import java.util.Scanner;

public class ExceptionApp{
    public static void arrOutofBound(){
        try{
            int []arr = {1,2,3,5};
            System.out.println(arr[7]);
            }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Array Out of Bound.");
               System.out.println(e);
            }
        }
        public static void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(a+ "/" + b+ "=" +c);
        }
    public static void main(String[] args){
           try {
                int a = 10, b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error Occure.");
                System.out.println(e);
            }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Array Out of Bound.");
               System.out.println(e);
           }
           finally {
               System.out.println("Finally block executed.");
           }
        arrOutofBound();
        divide();
        }
    }


