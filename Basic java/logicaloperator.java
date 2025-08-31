
import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        Scanner scanner = new Scanner(System.in);
        // Username must be contain 4-12 characters
        // username does not contain space or uppercase letter
        String username;
        System.err.print("Enter the username");
        username = scanner.nextLine();
        if(username.length() <= 4 || username.length()>= 14){
            System.err.println("Enter the username between 4 to 14");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.err.println("Your user name contain any space or underscore");
        }
        else{
            System.err.println("Your username is :"+username);
        }
        scanner.close();
    }
    
}
