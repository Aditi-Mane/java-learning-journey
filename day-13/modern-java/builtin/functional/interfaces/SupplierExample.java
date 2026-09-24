package builtin.functional.interfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> getMessage = () -> {
            return "Hello from Java!";
        };

        System.out.println(getMessage.get());
    }
}
/* OUTPUT
Hello from Java!
*/
