package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByName {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aditi Mane", 800000));
        employees.add(new Employee("Shruti Adsul", 600000));
        employees.add(new Employee("Ayush Mane", 800000));
        employees.add(new Employee("Akanksha Agre", 600000));

        System.out.println("Before Sorting:");
        System.out.println(employees);

        //sorting by name alphabetically
        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        };

        Collections.sort(employees, byName);
        System.out.println("\nAfter sorting by Name:");
        System.out.println(employees);

        //sorting by salary
        Comparator<Employee> bySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        };

        Collections.sort(employees, bySalary);
        System.out.println("\nAfter sorting by Salary:");
        System.out.println(employees);

        //Sorting by salary then name
        Comparator<Employee> bySalaryThenName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salaryComparison = Double.compare(e1.salary, e2.salary);

                if(salaryComparison == 0){
                    return e1.name.compareTo(e2.name);
                }
                return salaryComparison;
            }
        };

        Collections.sort(employees, bySalaryThenName);
        System.out.println("\nAfter sorting by Salary then name:");
        System.out.println(employees);
    }
}
/* OUTPUT
Before Sorting:
[Aditi Mane - 800000.0, Shruti Adsul - 600000.0, Ayush Mane - 800000.0, Akanksha Agre - 600000.0]

After sorting by Name:
[Aditi Mane - 800000.0, Akanksha Agre - 600000.0, Ayush Mane - 800000.0, Shruti Adsul - 600000.0]

After sorting by Salary:
[Akanksha Agre - 600000.0, Shruti Adsul - 600000.0, Aditi Mane - 800000.0, Ayush Mane - 800000.0]

After sorting by Salary then name:
[Akanksha Agre - 600000.0, Shruti Adsul - 600000.0, Aditi Mane - 800000.0, Ayush Mane - 800000.0]
 */
