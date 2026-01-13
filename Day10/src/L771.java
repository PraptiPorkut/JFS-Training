import java.util.HashMap;

public class L771 {
    void findJewels(char[] jewel,char[] s){
        int count=0;
        for(int i=0;i< jewel.length;i++){
            for(int j=0;j<s.length;j++){
                if(jewel[i]==s[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void main() {
        L771 l = new L771();
        char[] jewel = {'a','i'};
        char[] s = {'a','G','i','T'};
        l.findJewels(jewel,s);
    }
}
