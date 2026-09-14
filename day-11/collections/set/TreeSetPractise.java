package set;

import java.util.TreeSet;

public class TreeSetPractise {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 30, 20, 10, 40, 30};

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : numbers) {
            set.add(num);
        }

        System.out.println(set);
        System.out.println("Smallest: "+set.first());
        System.out.println("Largest: "+set.last());
    }
}
/* OUTPUT
[10, 20, 30, 40, 50]
Smallest: 10
Largest: 50
 */
