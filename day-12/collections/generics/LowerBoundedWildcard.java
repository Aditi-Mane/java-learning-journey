package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(integers);
        addNumbers(numbers);
        addNumbers(objects);

        System.out.println(integers);
        System.out.println(numbers);
        System.out.println(objects);
    }
}
/* OUTPUT
[10, 20, 30]
[10, 20, 30]
[10, 20, 30]
 */
