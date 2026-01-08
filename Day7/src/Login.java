import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            String defaultusername="prapti";//set Username
            String defaultpassword="P2005";//
            System.out.println("Enter the userid:");
            String username= sc.nextLine();
            System.out.println("Enter the marks.");
            String password= sc.nextLine();
            try{
                if(username.equalsIgnoreCase(defaultusername)&&password.equalsIgnoreCase(defaultpassword)){
                    System.out.println("Successful Login");
                    break;
                } else{
                    throw new InvalidLoginException("Invalid username or Password");

                }
            }catch(InvalidLoginException il){
                System.out.println(il);
            }
        }
    }
}
