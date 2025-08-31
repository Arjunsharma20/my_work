
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
    public static void main(String[] args) {
        // Their are total 5 method of writing the text
        // File Writer
        // Buffered Writer
        // Print Writer
        // File Output Stream
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\text.txt";
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write("I love you");
            System.out.println("Sucessfully Write file");
        }
        catch(FileNotFoundException e){
            System.out.println("File location is not found");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
