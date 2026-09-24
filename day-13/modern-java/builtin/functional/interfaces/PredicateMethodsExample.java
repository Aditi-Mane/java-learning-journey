package builtin.functional.interfaces;

import java.util.function.Predicate;

public class PredicateMethodsExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num%2==0;
        Predicate<Integer> isGreaterThan10 = num -> num>10;

        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10); //true only if both true
        Predicate<Integer> isEvenOrGreaterThan10 = isEven.or(isGreaterThan10); //true even if one true
        Predicate<Integer> NegateIsEvenAndGreaterThan10 = isEvenAndGreaterThan10.negate(); //flips an existing result

        System.out.println(isEvenAndGreaterThan10.test(22));
        System.out.println(NegateIsEvenAndGreaterThan10.test(22));
        System.out.println(isEvenOrGreaterThan10.test(23));
    }
}
/* OUTPUT
true
false
true
*/
