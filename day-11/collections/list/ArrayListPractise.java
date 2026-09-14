package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(10);
        list.add(20);
        list.add(30);

        //add at a specific index
        list.add(1, 15);

        //update an element
        list.set(0, 11);

        //remove an element
        list.remove(2);
//      list.remove(Integer.valueOf(30)); // to remove the actual value

        //search for an element
        boolean isPresent = list.contains(30);
        System.out.println(isPresent);

        //print the list
        System.out.println(list);

        //reverse the list
        Collections.reverse(list);
        System.out.println(list);
    }
}
/* OUTPUT
true
[11, 15, 30]
[30, 15, 11]
 */
