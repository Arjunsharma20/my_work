
// import com.sun.jdi.AbsentInformationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio_player {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\arjun\\Java\\src\\Antidote_1.wav";
        File file = new File(filepath); //Create a file object to pass our file filepath as an argument

        try(AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){
            Scanner scanner = new Scanner(System.in);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S =Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter Your choice");
                response = scanner.next().toUpperCase();

                switch(response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
            
            // System.out.println("Audio successfully inserted");

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        catch( UnsupportedAudioFileException e){
            System.out.println("Unsupported audio ");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        finally{
            System.out.println("Bye");
          
        }
        // Scanner.close();
    }
}
