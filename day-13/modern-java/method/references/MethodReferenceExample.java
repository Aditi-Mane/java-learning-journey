package method.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {

        // 1. STATIC METHOD REFERENCE -> ClassName::staticMethod

        // Lambda:
        // Function<String, Integer> converter =
        //         str -> Integer.parseInt(str);

        // Method reference:
        Function<String, Integer> converter =
                Integer::parseInt;

        System.out.println("Parsed number: "
                + converter.apply("100"));


        // 2. INSTANCE METHOD REFERENCE -> object::instanceMethod
        //    Specific object

        String name = "Aditi";

        // Lambda:
        // Supplier<Integer> length =
        //         () -> name.length();

        // Method reference:
        Supplier<Integer> length =
                name::length;

        System.out.println("Length: "
                + length.get());


        // 3. INSTANCE METHOD REFERENCE -> ClassName::instanceMethod
        //    Arbitrary object of a particular type

        List<String> names =
                new ArrayList<>(List.of("Aditi", "Rahul", "Sneha"));

        // Lambda:
        // names.forEach(
        //         person -> System.out.println(person)
        // );

        // Method reference:
        names.forEach(System.out::println);

        // Another example:
        Function<String, String> upperCase =
                String::toUpperCase;

        System.out.println(
                upperCase.apply("java")
        );

        // 4. CONSTRUCTOR REFERENCE -> ClassName::new

        // Lambda:
        // Supplier<ArrayList<String>> listCreator =
        //         () -> new ArrayList<>();

        // Constructor reference:
        Supplier<ArrayList<String>> listCreator =
                ArrayList::new;

        ArrayList<String> newList =
                listCreator.get();

        newList.add("Java");
        newList.add("Lambda");

        System.out.println(newList);
    }
}
/* OUTPUT
Parsed number: 100

Length: 5

Aditi
Rahul
Sneha

JAVA

[Java, Lambda]
 */