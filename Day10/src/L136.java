import java.util.HashMap;
import java.util.HashSet;

public class L136 {
    void call(int []n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : n) {
            hm.put(i,hm.getOrDefault(i, 0) + 1);
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) == 1) {
                System.out.println(key);;
            }
        }
    }
    static void main(String[] args) {
        int[] arr = {2, 2, 1};
        L136 l = new L136();
        l.call(arr);
        /*int flag= 0;
        for (int i = 0; i < arr.length; i++) {
         if (arr.length==1) {
            System.out.println(arr[i]);
         } else {
                for (int j = 1; j < arr.length; j++) {
                    if(flag!=1){
                        if (arr[i] != arr[j]) {
                            System.out.println(arr[i]);
                            flag = 1;
                            break;
                        }
                    }
                }
            }
        }*/

    }
}

