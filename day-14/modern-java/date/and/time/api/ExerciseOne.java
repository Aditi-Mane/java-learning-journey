package date.and.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExerciseOne {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: "+today);

        // Get current time
        LocalTime current = LocalTime.now();
        System.out.println("Current time is: "+current);

        // LocalDate representing 30 days from today
        LocalDate daysFromToday = today.plusDays(30);
        System.out.println("Thirty days from today: "+daysFromToday);

        // LocalDate representing 2 months before today
        LocalDate monthBeforeToday = today.minusMonths(2);
        System.out.println("2 months before today: "+monthBeforeToday);

        // LocalDateTime representing 25 September 2026 at 10:30 AM
        LocalDateTime customDate = LocalDateTime.of(2026, 9, 25, 10, 30);
        System.out.println("Custom Date: "+customDate);
    }
}
/* OUTPUT
Today's date is: 2026-09-25
Current time is: 15:43:47.228119300
Thirty days from today: 2026-10-25
2 months before today: 2026-07-25
Custom Date: 2026-09-25T10:30
*/
