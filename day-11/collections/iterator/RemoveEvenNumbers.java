package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer num = iterator.next();

            if(num % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("Odd numbers: "+numbers);
    }
}
