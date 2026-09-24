package builtin.functional.interfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a,b) -> a*b;

        System.out.println(multiply.apply(12,2));
    }
}
/* OUTPUT
24
*/
