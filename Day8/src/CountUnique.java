public class CountUnique {
    public static void main(String[] args){
        int []arr={1,5,5,6,7,8,9};
        int count=1;
        int arr_length=arr.length;
        for(int i=1;i< arr_length;i++){
                if(arr[i]!=arr[i-1]){
                    count++;
            }
        }
        System.out.println(" Count of Unique elements are : "+count);
    }
}