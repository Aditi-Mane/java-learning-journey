package builtin.functional.interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printDetails = (name, age) ->
                System.out.println(name+" is "+age+" years old.");

        printDetails.accept("Aditi", 22);
    }
}
/* OUTPUT
Aditi is 22 years old.
*/
