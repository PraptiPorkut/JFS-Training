import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MoveZeroesToEnd {
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
        System.out.println("List Before Shifting Zeroes: "+list);

        int zcount=0;
        for(int num:list){
            if(num!=0){
                temp.add(num);
            }else{
                zcount++;
            }
        }
        System.out.println("List Without zeroes : "+temp);
        System.out.println("Total Count of Zeroes : "+zcount);

        int addItems = list.size()-temp.size();
        //int i = temp.size()-1;
        for(int i=temp.size()-1;i<=addItems;i++ ){
           temp.add(0);
       }
        System.out.println("List After Shifting Zerores :"+temp);

    }
}
