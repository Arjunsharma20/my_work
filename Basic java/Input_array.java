
import java.util.Scanner;

public class Input_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for(int i =0;i<names.length;i++){
            System.out.print("Enter the name: ");
            names[i] = scanner.nextLine();
        }
        for(String name :names){
            System.out.println(name);
        }
        scanner.close();
    }
}




