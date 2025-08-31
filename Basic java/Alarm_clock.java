import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Alarm_clock {
    public static void main(String[] args) {
        // JAVA ALARM CLOCK
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
        LocalTime alarmtime = null;

        public void sound_audio(LocalTime alarmtime,DateTimeFormatter formatter,String response){
        Scanner scanner = new Scanner(System.in);
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\arjun\\Java\\src\\Antidote_1.wav";
        File file = new File(filepath);
        while(alarmtime==null){
        try{
        System.out.println("Enter an alarm time (HH:MM:SS): ");
        String input_time = scanner.nextLine();


        alarmtime = LocalTime.parse(input_time,formatter);
        System.out.println("Alarm set for: "+alarmtime);
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid format. Please use HH:MM:SS");
        }
        try(AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            // String response="";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S =Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter Your choice");
                // response = scanner.next().toUpperCase();

                switch(response){
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R" -> clip.setFramePosition(0);
                    case "Q" ->clip.close();

                    default-> System.out.println("Plese give vaild choice");
                }
            }
            System.out.println("Succefully import audio");
        }
        catch(FileNotFoundException e){
            System.out.println();
        }
        catch(IOException e){
            System.out.println();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println();
        }
        catch(LineUnavailableException e){
            System.out.println();
        }
        scanner.close();
    }
    }
    }
}
class AlarmClock implements Runnable{
    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarTime){
        this.alarmTime = alarTime;
    }
    @Override
    public void run(){

    }
}