import java.util.ArrayList;
import java.util.Scanner;

public class FindNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating matrix
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        //Geting Input From User
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("Enter the Column");
        int column = sc.nextInt();

        //Getting Elements from user row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> l1 = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                l1.add(sc.nextInt());
            }
            matrix.add(l1);
        }

        System.out.println("Matrix: " + matrix);
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix.get(i).get(j) == target) {
                    System.out.println("Target " + target + " found at position (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Target " + target + " not found in matrix.");
        }
        sc.close();
    }
}