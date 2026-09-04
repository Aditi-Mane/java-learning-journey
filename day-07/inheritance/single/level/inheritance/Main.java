package single.level.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Aditi Mane", 70000.0);
        Manager m = new Manager(102,"Ayush Mane", 40000.0,"IT", 23);

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}
/* OUTPUT:

ID: 101
Name: Aditi Mane
Salary: 70000.0

ID: 102
Name: Ayush Mane
Salary: 40000.0
Department: IT
Team size: 23
*/
