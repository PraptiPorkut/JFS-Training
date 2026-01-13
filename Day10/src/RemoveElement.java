import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        System.out.println("Enter the size of list:");
        int size = sc.nextInt();

        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original List : "+list);

        int valcount=0;
        for(int num:list){
            if(num!=2){
                temp.add(num);
            }else{
                valcount++;
            }
        }
        System.out.println("List after removing value : "+temp);
        System.out.println("Total Count of value : "+valcount);


    }
}
