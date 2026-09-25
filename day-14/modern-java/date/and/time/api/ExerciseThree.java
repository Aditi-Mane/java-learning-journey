package date.and.time.api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExerciseThree {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2026, 9, 25, 10, 30);
        LocalDateTime end = LocalDateTime.of(2026, 9, 25, 14, 45);

        // Calculate the Duration between start and end
        Duration duration = Duration.between(start, end);

        // Print the duration in hours and minutes
        System.out.println("Duration hours: "+duration.toHours());
        System.out.println("Duration minutes: "+duration.toMinutesPart());

        // Format start as: 25/09/2026 10:30
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(start.format(formatter));

        // Take string and parse it back into localDate using a formatter
        String dateString = "25/09/2026";
        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed date: "+date);
    }
}
/* OUTPUT
Duration hours: 4
Duration minutes: 15
25/09/2026 10:30
Parsed date: 2026-09-25
*/
