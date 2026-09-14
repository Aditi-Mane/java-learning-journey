package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    static void usingHashSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println("HashSet: "+set);
    }

    static void usingLinkedHashSet(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println("LinkedHashSet: "+set);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 30};
        usingHashSet(arr); //does not guarantee insertion order
        usingLinkedHashSet(arr); //maintains insertion order
    }
}
/* OUTPUT
HashSet: [20, 40, 10, 30]
LinkedHashSet: [10, 20, 30, 40]
 */
