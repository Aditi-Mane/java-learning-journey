package date.and.time.api;

import java.time.LocalDate;
import java.time.Period;

public class ExerciseTwo {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2022, 6, 15);
        LocalDate currentDate = LocalDate.of(2026, 9, 25);

        // Check whether joiningDate is before currentDate
        System.out.println("Is joining date before current date?: "+joiningDate.isBefore(currentDate));

        // Check whether currentDate is after joiningDate
        System.out.println("Is current date after joining date?: "+currentDate.isAfter(joiningDate));

        // Calculate the exact Period between the two dates
        Period period = Period.between(joiningDate, currentDate);
        System.out.println("Years: "+period.getYears());
        System.out.println("Months: "+period.getMonths());
        System.out.println("Days: "+period.getDays());
    }
}
/* OUTPUT
Is joining date before current date?: true
Is current date after joining date?: true
Years: 4
Months: 3
Days: 10
*/
