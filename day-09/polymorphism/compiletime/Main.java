package compiletime;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(23, 45);
        c.add(12, 45, 89);
        Calculator.add(45, 32.7);
        c.add("Aditi ", "Mane");

        // null can match both String and Integer reference types.
        // Without casting, the call is ambiguous because neither String nor Integer
        // is more specific than the other.
        // Casting null to Integer tells the compiler to select add(String, Integer).
        c.add("Aditi ", (Integer) null);
    }
}
/* OUTPUT
Sum of 2 int numbers: 68
Sum of 3 int numbers: 146
Sum of 2 double numbers: 77.7
Concatenation: Aditi Mane
String + Integer
 */
