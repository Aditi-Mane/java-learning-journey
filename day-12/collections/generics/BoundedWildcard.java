package generics;

import java.util.Arrays;
import java.util.List;

public class BoundedWildcard {
    static double sum(List<? extends Number> numbers){
        double sum = 0;
        for(Number item: numbers){
            sum = sum + item.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);
        List<Double> decimals = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println(sum(nums));
        System.out.println(sum(decimals));
    }
}
/* OUTPUT
60.0
61.5
*/

