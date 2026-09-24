package builtin.functional.interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> getStringLength = name -> name.length();

        System.out.println(getStringLength.apply("Aditi"));
    }
}
/* OUTPUT
5
*/
