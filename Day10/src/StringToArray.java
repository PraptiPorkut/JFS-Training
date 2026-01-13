import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringToArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String s = sc.nextLine();
        System.out.println("Original Sentence is : "+s);

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<String,Integer> hm = new HashMap<>();
        String duplicateKeys="";

        for(String word : words){
            //String currWord = hm.get(word);
            //System.out.println();
            if(hm.get(word) == null){
                hm.put(word,1);
            }else{
                int count = hm.get(word);
                if(count==1){
                    duplicateKeys += " "+word;
                    hm.put(word,hm.get(word)+1);
                }
            }
        }
        System.out.println(hm);
        System.out.println("Duplicate Keys are : "+duplicateKeys);
    }
}
