package builtin.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println("Hello, "+name);

        printName.accept("Aditi");
    }
}
/* OUTPUT
Hello, Aditi
*/
