package generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        List<String> names = Arrays.asList("Aditi", "Rahul", "Sneha");

        List<Double> prices = Arrays.asList(10.5, 20.5, 30.5);

        printList(numbers);
        printList(names);
        printList(prices);
    }
}
/* OUTPUT
10
20
30

Aditi
Rahul
Sneha

10.5
20.5
30.5
*/

