
import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        // String EvenorOdd ;
        System.err.println("Enter the hour "); 
        hours = scanner.nextInt();
        String Evenorodd = (hours < 12 )? "A.M":"P.M";
        System.err.println(Evenorodd);

        scanner.close();
    }
}
