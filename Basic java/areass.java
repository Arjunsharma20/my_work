
import java.util.Scanner;

public class areass {
    
    public static void main(String[] args) {
        // calculate the area of a rectangle
        double width =0;
        double height = 0;
        double area = 0;
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter the width of rectangle");
        width = scanner.nextDouble();
        System.err.println("Enter the wheight of rectangle");
        height = scanner.nextDouble();
        area = width*height;
        System.err.println("The area of rectangle is :"+area );


        scanner.close();
    }
}
