import java.util.Scanner;

public class For_loops {
    public static void main(String[] args) throws InterruptedException {
        //  Fro loop = execute some code a Certain amount of times
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds to countdown from ?");
        int start  = scanner.nextInt();
        for(int i = start;i>0;i--){
            // if(i==3){
            //     break;   //we can stop the loop using break keyword
            // }
            // else if(i==6){
            //     continue;   //we skip the 6 numbr from our series
            // }
            // else{
            System.out.println(i);
            Thread.sleep(1000);
            // }
        }
        System.out.println("Happy New Year");
        scanner.close();
    }
}
