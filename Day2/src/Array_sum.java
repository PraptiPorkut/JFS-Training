class Array {
    private int[] arr = new int[10];
    private int total = 0;
    void sum(int[] arr)
    {
        System.out.println("Array Elements are :");
        for (int i = 0; i < arr.length; i++)
        {
            total += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum:"+ total);
        return;
    }
}