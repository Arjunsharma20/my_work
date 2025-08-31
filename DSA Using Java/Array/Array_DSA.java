import java.util.Arrays;
import java.util.Scanner;

public class Array_DSA {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person name 
        Scanner scanner = new Scanner(System.in);
        String name = "Arjun Sharma ";

        // Q: store 5 roll number
        // Syntax of array:
        // // datatype[] var_name = new datatype[size]
        // int[] roll_number = new int[5];

        // // or directly

        // int[] roll_number_2 = {1,2,3,4,5};

        int[] roll_number;  //declaration of array , roll_number is getting defined in the stack 
        roll_number = new int[5];  //initialisation : actually here object is being created in the memory (heap)
        for(int i =0;i<roll_number.length;i++){
            System.out.print("Enter the roll numbers: ");
            roll_number[i] = scanner.nextInt();
        }
        System.out.print("Your Roll Number is: ");
        // for(int i = 0;i<roll_number.length;i++){
        //     System.out.print(roll_number[i] +" ");
        // }
        for(int num:roll_number){  // for each loop in array, print the element
            System.out.print(num+" ");  //here num reperesents the element of the array
        }
        System.out.println();


        // toString() method
        System.out.println(Arrays.toString(roll_number));

        scanner.close();

        




    } 
}
