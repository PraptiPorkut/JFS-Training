import java.util.Arrays;

public class L268 {
    void find(int[] a){
       for(int i=0;i<a.length;i++){
           if(i!=a[i]){
               System.out.println(i);
           }
           System.out.println(a.length);
       }
    }

    static void main() {
        int []arr={0,1};
        Arrays.sort(arr);
        L268 l = new L268();
        l.find(arr);
    }
}
