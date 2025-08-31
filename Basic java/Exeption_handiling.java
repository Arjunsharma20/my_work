
import java.util.Scanner;

public class Exeption_handiling {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program 
        // (Dividing bt zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block 
        // try{}, catch{}, finally{}
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int a = scanner.nextInt();
        }
        // catch(InputMismatchException e){
        //     System.out.println("Please enter the write input type");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("You can't divide by zero");
        // }
        catch(Exception e){
            // Safety net
            System.out.println("Something went wrong");
        }
        finally{
            scanner.close();
            System.out.println("Thsi is always execute");
        }
        
    }
}
