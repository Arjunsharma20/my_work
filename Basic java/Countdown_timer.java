
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown_timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of second to countdown from ");
        int response = scanner.nextInt();
        System.out.println();
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Happy new year");
                    timer.cancel();
                }

            }
        };
        timer.schedule(timerTask, 0,1000);
        scanner.close();
    }
}
