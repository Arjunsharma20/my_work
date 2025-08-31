
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_FIle {
    public static void main(String[] args) {
        // there are three ways of read the file
        // BufferReader + FileReader 
        // FileInputStream
        // RndomAccessFile
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\text.txt";
        // BufferReader = public class BufferedReader extends Reader. Reads text 
        // from a character-input stream, buffering characters so as to provide for 
        // the efficient reading of characters, arrays, and lines
        try(BufferedReader reader = new BufferedReader (new FileReader(filepath))){
        // try(BufferedReader reader = new BufferedReader(filepath)){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("That file exist");
        }
        catch(FileNotFoundException e){
            System.out.println("File location could not find");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
