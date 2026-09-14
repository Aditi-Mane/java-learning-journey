package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorUse {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Aditi", "Rahul", "Sneha", "Vishal"));
        ListIterator<String> it = names.listIterator();

        //traverse list forward
        System.out.println("Forward traverse with operations performed: ");
        while(it.hasNext()){
            String name = it.next();

            //replace Rahul with Rohan
            if (name.equals("Rahul")) {
                it.set("Rohan");
            }

            //add Neha after Sneha
            if(name.equals("Sneha")){
                it.add("Neha");
            }
        }
        System.out.println(names);

        System.out.println();

        //traverse list backward
        System.out.println("Backward traverse: ");
        while(it.hasPrevious()){
            String name = it.previous();

            System.out.print(name+" ");
        }
    }
}
/* OUTPUT
Forward traverse with operations performed:
[Aditi, Rohan, Sneha, Neha, Vishal]

Backward traverse:
Vishal Neha Sneha Rohan Aditi
 */
