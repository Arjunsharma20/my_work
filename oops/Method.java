import java.util.Scanner;

public class Method {
    // Method = a block of reusable code that is executed when called()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number");
        // double number = scanner.nextDouble();
        // double result = square(number);
        // System.out.println(result);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(agecheck(age)){
            System.out.println("You can sing un");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }
        scanner.close();

    }
    static double square(double number){
        return number * number;
    }
    static boolean agecheck(int age){
        return age>=18;
    }
}
