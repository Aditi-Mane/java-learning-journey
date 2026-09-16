package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortBySalary {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Aditi Mane", 800000));
        employees.add(new Employee(102, "Ayush Mane", 600000));
        employees.add(new Employee(103, "Chirag Chavan", 200000));
        employees.add(new Employee(104, "Akanksha Agre", 500000));
        employees.add(new Employee(105, "Shruti Adsul", 400000));

        System.out.println("Before sorting:");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("\nAfter sorting:");
        System.out.println(employees);

        Collections.reverse(employees);
        System.out.println("\nReversed:");
        System.out.println(employees);
    }
}
/* OUTPUT
Before sorting:
[Aditi Mane -> 800000.0, Ayush Mane -> 600000.0, Chirag Chavan -> 200000.0, Akanksha Agre -> 500000.0, Shruti Adsul -> 400000.0]

After sorting:
[Chirag Chavan -> 200000.0, Shruti Adsul -> 400000.0, Akanksha Agre -> 500000.0, Ayush Mane -> 600000.0, Aditi Mane -> 800000.0]

Reversed:
[Aditi Mane -> 800000.0, Ayush Mane -> 600000.0, Akanksha Agre -> 500000.0, Shruti Adsul -> 400000.0, Chirag Chavan -> 200000.0]
 */
