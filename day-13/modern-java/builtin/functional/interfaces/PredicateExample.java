package builtin.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThan50 = num -> num > 50;

        System.out.println(isGreaterThan50.test(40));
        System.out.println(isGreaterThan50.test(75));
    }
}
/* OUTPUT
false
true
*/
