
import java.util.Arrays;
import java.util.Scanner;

public class Multidemention_arrays {
    public static void main(String[] args) {
        // declaration of 2-D array
        
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int[][] arr6  = {
            {1,2,3},
            {4,5},
            {7,8,9,6}
        };
        for (int[] arr61 : arr6) {
            for (int j = 0; j < arr61.length; j++) {
                System.out.print(arr61[j] + " ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(arr1[1]));

        for (int[] arr2 : arr) {  // for(int i=0;i<arr.length;i++)
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = scanner.nextInt();
            }
        }
        
        for (int[] arr1 : arr) {   // for(int i=0;i<arr.length;i++)
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

        for (int[] arr1 : arr) {  // for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr1));
        }


        
    }
}
