//Take Marks form user and print the Grade
import java.util.Scanner;
class StudentMarks{
    void print(float m){
        if(m>=90)
        {
            System.out.println("Grade A");
        }
        else if (m<90 && m>=70)
        {
            System.out.println("Grade B");
        }
        else if (m<70 && m>=50)
        {
            System.out.println("Grade C");
        }
        else if (m<50 && m>=35)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        float marks = sc.nextFloat();
        StudentMarks sm= new StudentMarks();
        sm.print(marks);
    }
}
