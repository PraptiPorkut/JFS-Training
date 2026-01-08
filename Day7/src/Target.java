public class Target {
    public static void main(String[] args){
        int []arr={1,3,6,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==3){
                    System.out.println(arr[i]+"+"+arr[j]+"="+arr[i]+arr[j]);
                    System.out.println(arr[i]+" is at index "+ i);
                    System.out.println(arr[j]+" is at index " +j);
                }
            }
        }
    }
}
