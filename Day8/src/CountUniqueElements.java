//Count unidy=ue elements present in the array
public class CountUniqueElements {
    public static void main(){
        int i=0;
        int j=1;
        int count=1;
        int []arr={1,2,3,3,5,6,7,8,9};
        int n=arr.length;
        while(j<n){
            int currNo=arr[i];
            int nextNo=arr[j];
            if(currNo==nextNo){
                j++;
            }else{
                arr[++i]=arr[j];
                count++;
            }
        }
        System.out.println(count);
    }
}
