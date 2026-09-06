package abstractclass.employee.management.system;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Aditi Mane", 101, 1000000.0);
        Employee e2 = new PartTimeEmployee("Ayush Mane", 102, 12, 3004.5);
        Employee e3 = new Intern("Ayub Shaikh", 103, 5000.0);

        e1.displayDetails();
        e1.displayEmployeeType();
        System.out.println("Salary: "+e1.calculateSalary());

        System.out.println();

        e2.displayDetails();
        e2.displayEmployeeType();
        System.out.println("Salary: "+e2.calculateSalary());

        System.out.println();

        e3.displayDetails();
        e3.displayEmployeeType();
        System.out.println("Salary: "+e3.calculateSalary());
    }
}
/* OUTPUT
Name: Aditi Mane
Id: 101
Type: Full Time
Salary: 1000000.0

Name: Ayush Mane
Id: 102
Type: Part Time
Salary: 36054.0

Name: Ayub Shaikh
Id: 103
Type: Intern
Salary: 5000.0
*/
