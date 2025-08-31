import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        // Enhanced Switches = a replacement to many else if statement
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter the day");
        String day = scanner.nextLine();
        switch(day){
            case "Monday" -> System.err.println("It is a weekday");
            case "Tuesday" -> System.err.println("It is a weekday");
            case "Wednesday" -> System.err.println("It is a weekday");
            case "Thursday" -> System.err.println("It is a weekday");
            case "Friday" -> System.err.println("It is a weekday");
            // case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                        // System.err.println("It is a weekday");
            case "Saturday" -> System.err.println("It is a weekend");
            case "Sunday" -> System.err.println("It is a weekend");
            default -> System.out.print(day + " is not a day");
        }
        scanner.close();

    }
}
