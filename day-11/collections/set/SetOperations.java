package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetOperations {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        //union of two sets
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(set1);
        linkedSet.addAll(set2);
        System.out.println("Union: "+linkedSet);

        //intersection of two sets
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);

        //difference of two sets
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: "+difference);
    }
}
/* OUTPUT
Union: [1, 2, 3, 4, 5, 6]
Intersection: [3, 4]
Difference: [1, 2]
 */