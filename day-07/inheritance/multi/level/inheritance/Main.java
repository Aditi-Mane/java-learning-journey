package multi.level.inheritance;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Aditi Mane", 22);
        Employee e = new Employee("Arav", 23,100, 70000.0);
        Manager m = new Manager("Ayush", 24,101, 40000.0, "Finance",12);

        p.displayDetails();
        System.out.println();

        e.displayDetails();
        System.out.println();

        m.displayDetails();
        System.out.println();
    }
}
/* OUTPUT

Name: Aditi Mane
Age: 22

Name: Arav
Age: 23
Employee Id: 100
Salary: 70000.0

Name: Ayush
Age: 24
Employee Id: 101
Salary: 40000.0
Department: Finance
Team Size: 12
 */
