package builtin.functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a>b;

        System.out.println(isGreater.test(12,34));
        System.out.println(isGreater.test(42,34));
    }
}
/* OUTPUT
false
true
*/
