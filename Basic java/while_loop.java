
import java.util.Scanner;

public class while_loop {
    // While loop = repeat some code forever while some
    //              condition remains true
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name =""; 
        while(name.isEmpty()){
            System.err.println("Enter your name");
            name = scanner.nextLine();
        }
        do{
            System.err.println("Enter your name");
            name = scanner.nextLine();
        }while(name.isEmpty());
        System.out.println("Hello " +name);

        scanner.close();
    }
}
