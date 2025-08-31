
import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args){
        boolean isStudent ;
        boolean isSenior;
        int ticket;
        Scanner scanner = new Scanner(System.in);
        System.err.println("You are student (true/false)");
        isStudent = scanner.nextBoolean();
        System.err.println("You are also a senior (true/false)");
        isSenior = scanner.nextBoolean();
        System.err.println("Enter the amount of ticket");
        ticket = scanner.nextInt();
        if(isStudent){
            if(isSenior){
                System.err.println("You got student discount of 10%");
                System.err.println("You also got senior discount of 20%");
                ticket = ticket - (ticket * 30)/100;
            }
            else{
                System.err.println("You got student discount of 10%");
                ticket = ticket - (ticket * 10)/100;

            }
        }
        else{
            if(isSenior){
                System.err.println("You got senior discount of 20%");
                ticket = ticket - (ticket * 20)/100;

            }
            else{
                System.err.println("You did not receive any discount");
                ticket = ticket;
            }
        }
        System.err.println("Your ticket price is :"+ticket);
        scanner.close();

    }
}
