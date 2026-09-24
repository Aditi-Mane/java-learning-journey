package stream.api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsPractise {
    public static void main(String[] args) {

        // Filter + Map + forEach
        List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30, 35, 40);

        numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .forEach(System.out::println);
        System.out.println();

        // Filter + sorted + distinct + limit
        List<Integer> numbers2 = List.of(40, 10, 30, 20, 10, 50, 30, 60, 20, 70);

        numbers2.stream()
                .distinct()
                .filter(n -> n>20)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(n -> System.out.print(n+" "));
        System.out.println("\n");

        // Strings + map + filter + collect
        List<String> names = List.of("Aditi", "Rahul", "Ayush", "Raj", "Sneha", "Aman");

        List<String> result = names.stream()
                .filter(str -> str.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);

        // count, min, max, average
        List<Integer> marks = List.of(78, 92, 65, 88, 95, 72, 84);

        long noOfStudents = marks.stream().count();
        System.out.println("\nTotal students: "+noOfStudents);

        long countOfStudentsMoreThan80 = marks.stream()
                .filter(n -> n>80)
                .count();
        System.out.println("Students with marks > 80: "+countOfStudentsMoreThan80);

        int max = marks.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max marks: "+max);

        int min = marks.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("Min marks: "+min);

        double average = marks.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Average: "+average);
    }
}
/* OUTPUT
20
40
60
80

70 60 50

[ADITI, AYUSH, AMAN]

Total students: 7
Students with marks > 80: 4
Max marks: 95
Min marks: 65
Average: 82.0
*/
