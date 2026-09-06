package abstractclass.fundamentals;

public class Main {
    public static void main(String[] args) {
        /*Abstract class cannot be instantiated but can be used as a reference
        pointing to an object of its subclass*/
        Employee e = new Developer("Aditi Mane", 2309);
        e.calculateSalary();
        e.displayDetails();
    }
}
/* OUTPUT
Calculating Developer Salary...
Name: Aditi Mane
ID: 2309
*/
