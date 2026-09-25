package date.and.time.api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeWorkAnniversary {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2021, 8, 15);
        LocalDate today = LocalDate.of(2026, 9, 25);

        // Checks whether the employee has already completed their work anniversary in 2026
        LocalDate anniversary = LocalDate.of(today.getYear(), joiningDate.getMonth(), joiningDate.getDayOfMonth());
        if (anniversary.isBefore(today) || anniversary.isEqual(today)) {
            System.out.println("Employee has already completed work anniversary\n");
        } else {
            System.out.println("Employee has not yet completed work anniversary\n");
        }

        // Calculates how long they've been with the company
        Period period = Period.between(joiningDate, today);
        System.out.println("Joined before today: "+joiningDate.isBefore(today));
        System.out.println("Years completed: "+period.getYears());
        System.out.println("Months completed: "+period.getMonths());
        System.out.println("Days completed: "+period.getDays()+"\n");

        // Calculate the date of their next work anniversary
        LocalDate nextAnniversary;

        if (anniversary.isAfter(today)) {
            nextAnniversary = anniversary;
        } else {
            nextAnniversary = anniversary.plusYears(1);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Next Anniversary: "+nextAnniversary.format(formatter));
    }
}
/* OUTPUT
Employee has already completed work anniversary

Joined before today: true
Years completed: 5
Months completed: 1
Days completed: 10

Next Anniversary: 15/08/2027
*/
