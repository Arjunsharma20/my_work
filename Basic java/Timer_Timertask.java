
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Timertask {
    public static void main(String[] args) {
        // Timer = Class the task that at specific time or periodically 
        // useful for : sending notifications, schedule updates, repetitive actions
        
        // TimeTask = Represent the task that will be executed by the Timer.
        // You will extend the TimerTask class to define your task
        // Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;

            @Override
            public void run(){
                System.out.println("hello");
                count--;
                if(count<=0){
                    System.out.println("task complete");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,0,1000);
    }
}
