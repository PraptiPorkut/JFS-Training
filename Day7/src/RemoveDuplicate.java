public class RemoveDuplicate {
    public static void main(){
        int []arr={1,1,3,4,9};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                   for(int k=j;k<n-1;k++){
                       arr[k] = arr[k + 1];
                   }
                   n--;
                   j--;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
