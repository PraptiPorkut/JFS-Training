import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class countwovles {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String s = sc.nextLine();
        System.out.println("Original Sentence is : "+s);

        /*char[] c = s.toCharArray();
        int count=0;
        System.out.println(Arrays.toString(c));
        HashMap<String,Integer> hm = new HashMap<>();
        for(char ch : c){
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                count++;
            }
        }
        System.out.println("Total Wovels are : "+count);*/

        HashMap<Character,Integer> hm = new HashMap<>();
        s = s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
                count++;
            }
        }
        System.out.println(hm);



    }
}
