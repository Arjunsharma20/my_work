
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        // LocalDate date = LocalDate.now();
        // System.out.println(date);
        // LocalTime time = LocalTime.now();
        // System.out.println(time);
        // LocalDateTime datetime = LocalDateTime.now();
        // System.out.println(datetime);
        // Instant instant = Instant.now();
        // System.out.println(instant);

        // Coustom format
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newdatetime = dateTime.format(formatter);
        System.out.println(newdatetime);
        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println(date);
    }
}
